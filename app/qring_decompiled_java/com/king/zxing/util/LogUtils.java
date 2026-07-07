package com.king.zxing.util;

/* loaded from: /tmp/dex/classes2.dex */
public class LogUtils {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int PRINTLN = 1;
    public static final java.lang.String TAG = "ZXingLite";
    public static final java.lang.String TAG_FORMAT = "%s.%s(%s:%d)";
    public static final int VERBOSE = 2;
    public static final java.lang.String VERTICAL = "|";
    public static final int WARN = 5;
    private static boolean isShowLog = true;
    private static int priority = 1;

    private LogUtils() {
        throw new java.lang.AssertionError();
    }

    public static void setShowLog(boolean z) {
        isShowLog = z;
    }

    public static boolean isShowLog() {
        return isShowLog;
    }

    public static int getPriority() {
        return priority;
    }

    public static void setPriority(int i) {
        priority = i;
    }

    private static java.lang.String generateTag(java.lang.StackTraceElement stackTraceElement) {
        java.lang.String className = stackTraceElement.getClassName();
        return TAG + VERTICAL + java.lang.String.format(TAG_FORMAT, className.substring(className.lastIndexOf(".") + 1), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), java.lang.Integer.valueOf(stackTraceElement.getLineNumber()));
    }

    public static java.lang.StackTraceElement getStackTraceElement(int i) {
        return java.lang.Thread.currentThread().getStackTrace()[i];
    }

    private static java.lang.String getCallerStackLogTag() {
        return generateTag(getStackTraceElement(5));
    }

    private static java.lang.String getStackTraceString(java.lang.Throwable th) {
        return android.util.Log.getStackTraceString(th);
    }

    public static void v(java.lang.String str) {
        if (!isShowLog || priority > 2) {
            return;
        }
        android.util.Log.v(getCallerStackLogTag(), java.lang.String.valueOf(str));
    }

    public static void v(java.lang.Throwable th) {
        if (!isShowLog || priority > 2) {
            return;
        }
        android.util.Log.v(getCallerStackLogTag(), getStackTraceString(th));
    }

    public static void v(java.lang.String str, java.lang.Throwable th) {
        if (!isShowLog || priority > 2) {
            return;
        }
        android.util.Log.v(getCallerStackLogTag(), java.lang.String.valueOf(str), th);
    }

    public static void d(java.lang.String str) {
        if (!isShowLog || priority > 3) {
            return;
        }
        android.util.Log.d(getCallerStackLogTag(), java.lang.String.valueOf(str));
    }

    public static void d(java.lang.Throwable th) {
        if (!isShowLog || priority > 3) {
            return;
        }
        android.util.Log.d(getCallerStackLogTag(), getStackTraceString(th));
    }

    public static void d(java.lang.String str, java.lang.Throwable th) {
        if (!isShowLog || priority > 3) {
            return;
        }
        android.util.Log.d(getCallerStackLogTag(), java.lang.String.valueOf(str), th);
    }

    public static void i(java.lang.String str) {
        if (!isShowLog || priority > 4) {
            return;
        }
        android.util.Log.i(getCallerStackLogTag(), java.lang.String.valueOf(str));
    }

    public static void i(java.lang.Throwable th) {
        if (!isShowLog || priority > 4) {
            return;
        }
        android.util.Log.i(getCallerStackLogTag(), getStackTraceString(th));
    }

    public static void i(java.lang.String str, java.lang.Throwable th) {
        if (!isShowLog || priority > 4) {
            return;
        }
        android.util.Log.i(getCallerStackLogTag(), java.lang.String.valueOf(str), th);
    }

    public static void w(java.lang.String str) {
        if (!isShowLog || priority > 5) {
            return;
        }
        android.util.Log.w(getCallerStackLogTag(), java.lang.String.valueOf(str));
    }

    public static void w(java.lang.Throwable th) {
        if (!isShowLog || priority > 5) {
            return;
        }
        android.util.Log.w(getCallerStackLogTag(), getStackTraceString(th));
    }

    public static void w(java.lang.String str, java.lang.Throwable th) {
        if (!isShowLog || priority > 5) {
            return;
        }
        android.util.Log.w(getCallerStackLogTag(), java.lang.String.valueOf(str), th);
    }

    public static void e(java.lang.String str) {
        if (!isShowLog || priority > 6) {
            return;
        }
        android.util.Log.e(getCallerStackLogTag(), java.lang.String.valueOf(str));
    }

    public static void e(java.lang.Throwable th) {
        if (!isShowLog || priority > 6) {
            return;
        }
        android.util.Log.e(getCallerStackLogTag(), getStackTraceString(th));
    }

    public static void e(java.lang.String str, java.lang.Throwable th) {
        if (!isShowLog || priority > 6) {
            return;
        }
        android.util.Log.e(getCallerStackLogTag(), java.lang.String.valueOf(str), th);
    }

    public static void wtf(java.lang.String str) {
        if (!isShowLog || priority > 7) {
            return;
        }
        android.util.Log.wtf(getCallerStackLogTag(), java.lang.String.valueOf(str));
    }

    public static void wtf(java.lang.Throwable th) {
        if (!isShowLog || priority > 7) {
            return;
        }
        android.util.Log.wtf(getCallerStackLogTag(), getStackTraceString(th));
    }

    public static void wtf(java.lang.String str, java.lang.Throwable th) {
        if (!isShowLog || priority > 7) {
            return;
        }
        android.util.Log.wtf(getCallerStackLogTag(), java.lang.String.valueOf(str), th);
    }

    public static void print(java.lang.String str) {
        if (!isShowLog || priority > 1) {
            return;
        }
        java.lang.System.out.print(str);
    }

    public static void print(java.lang.Object obj) {
        if (!isShowLog || priority > 1) {
            return;
        }
        java.lang.System.out.print(obj);
    }

    public static void printf(java.lang.String str) {
        if (!isShowLog || priority > 1) {
            return;
        }
        java.lang.System.out.printf(str, new java.lang.Object[0]);
    }

    public static void println(java.lang.String str) {
        if (!isShowLog || priority > 1) {
            return;
        }
        java.lang.System.out.println(str);
    }

    public static void println(java.lang.Object obj) {
        if (!isShowLog || priority > 1) {
            return;
        }
        java.lang.System.out.println(obj);
    }
}
