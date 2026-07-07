package com.iwown.awlog;

/* loaded from: /tmp/dex/classes2.dex */
public class AwLog {
    private static com.iwown.awlog.LoggerUtil printer = new com.iwown.awlog.LoggerUtil();

    public static void v(java.lang.String str, java.lang.Object obj) {
        printer.v(str, obj);
    }

    public static void d(java.lang.String str, java.lang.Object obj) {
        printer.d(str, obj);
    }

    public static void i(java.lang.String str, java.lang.Object obj) {
        printer.i(str, obj);
    }

    public static void w(java.lang.String str, java.lang.Object obj) {
        printer.w(str, obj);
    }

    public static void e(java.lang.String str, java.lang.Object obj) {
        printer.e(str, obj);
    }

    public static void wtf(java.lang.String str, java.lang.String str2) {
        printer.wtf(str, str2);
    }

    public static void wtfJson(java.lang.String str, java.lang.String str2) {
        printer.wtf(str + ",\n", str2);
    }
}
