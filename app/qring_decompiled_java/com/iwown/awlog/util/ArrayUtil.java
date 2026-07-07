package com.iwown.awlog.util;

/* loaded from: /tmp/dex/classes2.dex */
public class ArrayUtil {
    public static int getArrayDimension(java.lang.Object obj) {
        int i = 0;
        for (int i2 = 0; i2 < obj.toString().length() && obj.toString().charAt(i2) == '['; i2++) {
            i++;
        }
        return i;
    }

    public static boolean isArray(java.lang.Object obj) {
        return obj.getClass().isArray();
    }

    private static char getType(java.lang.Object obj) {
        if (!isArray(obj)) {
            return (char) 0;
        }
        java.lang.String obj2 = obj.toString();
        return obj2.substring(obj2.lastIndexOf("[") + 1, obj2.lastIndexOf("[") + 2).charAt(0);
    }

    private static void traverseArray(java.lang.StringBuilder sb, java.lang.Object obj) {
        if (isArray(obj)) {
            int i = 0;
            if (getArrayDimension(obj) == 1) {
                char type = getType(obj);
                if (type == 'F') {
                    sb.append(java.util.Arrays.toString((float[]) obj));
                    return;
                }
                if (type == 'L') {
                    java.lang.Object[] objArr = (java.lang.Object[]) obj;
                    sb.append("[");
                    while (i < objArr.length) {
                        sb.append(com.iwown.awlog.util.ObjectUtil.objectToString(objArr[i]));
                        if (i != objArr.length - 1) {
                            sb.append(",");
                        }
                        i++;
                    }
                    sb.append("]");
                    return;
                }
                if (type == 'S') {
                    sb.append(java.util.Arrays.toString((short[]) obj));
                    return;
                }
                if (type == 'Z') {
                    sb.append(java.util.Arrays.toString((boolean[]) obj));
                    return;
                }
                if (type == 'I') {
                    sb.append(java.util.Arrays.toString((int[]) obj));
                    return;
                }
                if (type != 'J') {
                    switch (type) {
                        case 'B':
                            sb.append(java.util.Arrays.toString((byte[]) obj));
                            break;
                        case 'C':
                            sb.append(java.util.Arrays.toString((char[]) obj));
                            break;
                        case 'D':
                            sb.append(java.util.Arrays.toString((double[]) obj));
                            break;
                        default:
                            sb.append(java.util.Arrays.toString((java.lang.Object[]) obj));
                            break;
                    }
                }
                sb.append(java.util.Arrays.toString((long[]) obj));
                return;
            }
            sb.append("[");
            while (true) {
                java.lang.Object[] objArr2 = (java.lang.Object[]) obj;
                if (i < objArr2.length) {
                    traverseArray(sb, objArr2[i]);
                    if (i != objArr2.length - 1) {
                        sb.append(",");
                    }
                    i++;
                } else {
                    sb.append("]");
                    return;
                }
            }
        } else {
            sb.append("not a array!!");
        }
    }

    public static java.lang.String parseArray(java.lang.Object obj) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        traverseArray(sb, obj);
        return sb.toString();
    }
}
