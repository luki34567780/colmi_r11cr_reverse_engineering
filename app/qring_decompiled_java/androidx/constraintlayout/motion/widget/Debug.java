package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class Debug {
    public static void logStack(java.lang.String tag, java.lang.String msg, int n) {
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        int min = java.lang.Math.min(n, stackTrace.length - 1);
        java.lang.String str = " ";
        for (int i = 1; i <= min; i++) {
            java.lang.StackTraceElement stackTraceElement = stackTrace[i];
            str = str + " ";
            android.util.Log.v(tag, msg + str + (".(" + stackTrace[i].getFileName() + ":" + stackTrace[i].getLineNumber() + ") " + stackTrace[i].getMethodName()) + str);
        }
    }

    public static void printStack(java.lang.String msg, int n) {
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        int min = java.lang.Math.min(n, stackTrace.length - 1);
        java.lang.String str = " ";
        for (int i = 1; i <= min; i++) {
            java.lang.StackTraceElement stackTraceElement = stackTrace[i];
            java.lang.String str2 = ".(" + stackTrace[i].getFileName() + ":" + stackTrace[i].getLineNumber() + ") ";
            str = str + " ";
            java.lang.System.out.println(msg + str + str2 + str);
        }
    }

    public static java.lang.String getName(android.view.View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (java.lang.Exception unused) {
            return "UNKNOWN";
        }
    }

    public static void dumpPoc(java.lang.Object obj) {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[1];
        java.lang.String str = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
        java.lang.Class<?> cls = obj.getClass();
        java.lang.System.out.println(str + "------------- " + cls.getName() + " --------------------");
        for (java.lang.reflect.Field field : cls.getFields()) {
            try {
                java.lang.Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof java.lang.Integer) || !obj2.toString().equals("-1")) && ((!(obj2 instanceof java.lang.Integer) || !obj2.toString().equals("0")) && ((!(obj2 instanceof java.lang.Float) || !obj2.toString().equals("1.0")) && (!(obj2 instanceof java.lang.Float) || !obj2.toString().equals("0.5")))))) {
                    java.lang.System.out.println(str + "    " + field.getName() + " " + obj2);
                }
            } catch (java.lang.IllegalAccessException unused) {
            }
        }
        java.lang.System.out.println(str + "------------- " + cls.getSimpleName() + " --------------------");
    }

    public static java.lang.String getName(android.content.Context context, int id) {
        if (id == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(id);
        } catch (java.lang.Exception unused) {
            return "?" + id;
        }
    }

    public static java.lang.String getName(android.content.Context context, int[] id) {
        java.lang.String str;
        try {
            java.lang.String str2 = id.length + "[";
            int i = 0;
            while (i < id.length) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str2);
                sb.append(i == 0 ? "" : " ");
                java.lang.String sb2 = sb.toString();
                try {
                    str = context.getResources().getResourceEntryName(id[i]);
                } catch (android.content.res.Resources.NotFoundException unused) {
                    str = "? " + id[i] + " ";
                }
                str2 = sb2 + str;
                i++;
            }
            return str2 + "]";
        } catch (java.lang.Exception e) {
            android.util.Log.v("DEBUG", e.toString());
            return "UNKNOWN";
        }
    }

    public static java.lang.String getState(androidx.constraintlayout.motion.widget.MotionLayout layout, int stateId) {
        return getState(layout, stateId, -1);
    }

    public static java.lang.String getState(androidx.constraintlayout.motion.widget.MotionLayout layout, int stateId, int len) {
        int length;
        if (stateId == -1) {
            return "UNDEFINED";
        }
        java.lang.String resourceEntryName = layout.getContext().getResources().getResourceEntryName(stateId);
        if (len == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > len) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= len || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        return resourceEntryName.replaceAll(java.nio.CharBuffer.allocate((resourceEntryName.length() - len) / length).toString().replace((char) 0, '.') + "_", "_");
    }

    public static java.lang.String getActionType(android.view.MotionEvent event) {
        int action = event.getAction();
        for (java.lang.reflect.Field field : android.view.MotionEvent.class.getFields()) {
            try {
                if (java.lang.reflect.Modifier.isStatic(field.getModifiers()) && field.getType().equals(java.lang.Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (java.lang.IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static java.lang.String getLocation() {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static java.lang.String getLoc() {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static java.lang.String getLocation2() {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static java.lang.String getCallFrom(int n) {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[n + 2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static void dumpLayoutParams(android.view.ViewGroup layout, java.lang.String str) {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[1];
        java.lang.String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + "  ";
        int childCount = layout.getChildCount();
        java.lang.System.out.println(str + " children " + childCount);
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = layout.getChildAt(i);
            java.lang.System.out.println(str2 + "     " + getName(childAt));
            android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            for (java.lang.reflect.Field field : layoutParams.getClass().getFields()) {
                try {
                    java.lang.Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals("-1")) {
                        java.lang.System.out.println(str2 + "       " + field.getName() + " " + obj);
                    }
                } catch (java.lang.IllegalAccessException unused) {
                }
            }
        }
    }

    public static void dumpLayoutParams(android.view.ViewGroup.LayoutParams param, java.lang.String str) {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[1];
        java.lang.String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + "  ";
        java.lang.System.out.println(" >>>>>>>>>>>>>>>>>>. dump " + str2 + "  " + param.getClass().getName());
        for (java.lang.reflect.Field field : param.getClass().getFields()) {
            try {
                java.lang.Object obj = field.get(param);
                java.lang.String name = field.getName();
                if (name.contains("To") && !obj.toString().equals("-1")) {
                    java.lang.System.out.println(str2 + "       " + name + " " + obj);
                }
            } catch (java.lang.IllegalAccessException unused) {
            }
        }
        java.lang.System.out.println(" <<<<<<<<<<<<<<<<< dump " + str2);
    }
}
