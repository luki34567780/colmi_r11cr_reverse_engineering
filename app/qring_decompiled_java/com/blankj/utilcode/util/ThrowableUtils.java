package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public class ThrowableUtils {
    private static final java.lang.String LINE_SEP = java.lang.System.getProperty("line.separator");

    private ThrowableUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static java.lang.String getFullStackTrace(java.lang.Throwable th) {
        java.util.List<java.lang.String> list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = th.getCause();
        }
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i = size - 1;
        java.util.List<java.lang.String> stackFrameList = getStackFrameList((java.lang.Throwable) arrayList.get(i));
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (size != 0) {
                list = getStackFrameList((java.lang.Throwable) arrayList.get(size - 1));
                removeCommonFrames(stackFrameList, list);
            } else {
                list = stackFrameList;
            }
            if (size == i) {
                arrayList2.add(((java.lang.Throwable) arrayList.get(size)).toString());
            } else {
                arrayList2.add(" Caused by: " + ((java.lang.Throwable) arrayList.get(size)).toString());
            }
            arrayList2.addAll(stackFrameList);
            stackFrameList = list;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            sb.append((java.lang.String) it.next());
            sb.append(LINE_SEP);
        }
        return sb.toString();
    }

    private static java.util.List<java.lang.String> getStackFrameList(java.lang.Throwable th) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th.printStackTrace(new java.io.PrintWriter((java.io.Writer) stringWriter, true));
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(stringWriter.toString(), LINE_SEP);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = false;
        while (stringTokenizer.hasMoreTokens()) {
            java.lang.String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf("at");
            if (indexOf != -1 && nextToken.substring(0, indexOf).trim().isEmpty()) {
                arrayList.add(nextToken);
                z = true;
            } else if (z) {
                break;
            }
        }
        return arrayList;
    }

    private static void removeCommonFrames(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        int size = list.size() - 1;
        for (int size2 = list2.size() - 1; size >= 0 && size2 >= 0; size2--) {
            if (list.get(size).equals(list2.get(size2))) {
                list.remove(size);
            }
            size--;
        }
    }
}
