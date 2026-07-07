package com.luck.picture.lib.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class ValueOf {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T to(java.lang.Object obj, T t) {
        return obj == 0 ? t : obj;
    }

    public static java.lang.String toString(java.lang.Object obj) {
        try {
            return obj.toString();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static double toDouble(java.lang.Object obj) {
        return toDouble(obj, 0);
    }

    public static double toDouble(java.lang.Object obj, int i) {
        if (obj == null) {
            return i;
        }
        try {
            return java.lang.Double.parseDouble(obj.toString().trim());
        } catch (java.lang.Exception unused) {
            return i;
        }
    }

    public static long toLong(java.lang.Object obj, long j) {
        long parseLong;
        if (obj == null) {
            return j;
        }
        try {
            java.lang.String trim = obj.toString().trim();
            if (trim.contains(".")) {
                parseLong = java.lang.Long.parseLong(trim.substring(0, trim.lastIndexOf(".")));
            } else {
                parseLong = java.lang.Long.parseLong(trim);
            }
            return parseLong;
        } catch (java.lang.Exception unused) {
            return j;
        }
    }

    public static long toLong(java.lang.Object obj) {
        return toLong(obj, 0L);
    }

    public static float toFloat(java.lang.Object obj, long j) {
        if (obj == null) {
            return j;
        }
        try {
            return java.lang.Float.parseFloat(obj.toString().trim());
        } catch (java.lang.Exception unused) {
            return j;
        }
    }

    public static float toFloat(java.lang.Object obj) {
        return toFloat(obj, 0L);
    }

    public static int toInt(java.lang.Object obj, int i) {
        int parseInt;
        if (obj == null) {
            return i;
        }
        try {
            java.lang.String trim = obj.toString().trim();
            if (trim.contains(".")) {
                parseInt = java.lang.Integer.parseInt(trim.substring(0, trim.lastIndexOf(".")));
            } else {
                parseInt = java.lang.Integer.parseInt(trim);
            }
            return parseInt;
        } catch (java.lang.Exception unused) {
            return i;
        }
    }

    public static int toInt(java.lang.Object obj) {
        return toInt(obj, 0);
    }

    public static boolean toBoolean(java.lang.Object obj) {
        return toBoolean(obj, false);
    }

    public static boolean toBoolean(java.lang.Object obj, boolean z) {
        if (obj == null) {
            return false;
        }
        try {
            return !"false".equals(obj.toString().trim().trim());
        } catch (java.lang.Exception unused) {
            return z;
        }
    }
}
