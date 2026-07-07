package com.iwown.awlog;

/* loaded from: /tmp/dex/classes2.dex */
public class LoggerUtil implements com.iwown.awlog.Printer {
    private static final int MIN_STACK_OFFSET = 5;
    java.lang.String LINE_SEPARATOR = java.lang.System.getProperty("line.separator");
    private final java.lang.ThreadLocal<java.lang.String> localTags = new java.lang.ThreadLocal<>();
    private com.iwown.awlog.impl.LogConfigImpl mLogConfig = com.iwown.awlog.impl.LogConfigImpl.getInstance();

    LoggerUtil() {
    }

    private synchronized void logString(int i, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        logString(i, str2, str, false, objArr);
    }

    private void logString(int i, java.lang.String str, java.lang.String str2, boolean z, java.lang.Object... objArr) {
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = generateTag();
        }
        if (!z && objArr != null && objArr.length > 0) {
            try {
                str = java.lang.String.format(str, objArr);
            } catch (java.util.IllegalFormatConversionException | java.util.MissingFormatArgumentException | java.util.UnknownFormatConversionException e) {
                printLog(5, str2, android.util.Log.getStackTraceString(e));
            }
        }
        if (!this.mLogConfig.isLogSwitch() || i < this.mLogConfig.getLogLevel()) {
            return;
        }
        if (str.length() > 2800) {
            if (this.mLogConfig.isShowBorder()) {
                printLog(i, str2, com.iwown.awlog.util.Utils.printDividingLine(1));
                printLog(i, str2, com.iwown.awlog.util.Utils.printDividingLine(3) + getTopStackInfo());
                printLog(i, str2, com.iwown.awlog.util.Utils.printDividingLine(4));
            }
            java.util.Iterator<java.lang.String> it = com.iwown.awlog.util.ObjectUtil.largeStringToList(str).iterator();
            while (it.hasNext()) {
                logString(i, it.next(), str2, true, objArr);
            }
            if (this.mLogConfig.isShowBorder()) {
                printLog(i, str2, com.iwown.awlog.util.Utils.printDividingLine(2));
                return;
            }
            return;
        }
        if (!this.mLogConfig.isShowBorder()) {
            printLog(i, str2, str);
            return;
        }
        int i2 = 0;
        if (z) {
            java.lang.String[] split = str.split(this.LINE_SEPARATOR);
            int length = split.length;
            while (i2 < length) {
                printLog(i, str2, com.iwown.awlog.util.Utils.printDividingLine(3) + split[i2]);
                i2++;
            }
            return;
        }
        printLog(i, str2, com.iwown.awlog.util.Utils.printDividingLine(1));
        printLog(i, str2, com.iwown.awlog.util.Utils.printDividingLine(3) + getTopStackInfo());
        printLog(i, str2, com.iwown.awlog.util.Utils.printDividingLine(4));
        java.lang.String[] split2 = str.split(this.LINE_SEPARATOR);
        int length2 = split2.length;
        while (i2 < length2) {
            printLog(i, str2, com.iwown.awlog.util.Utils.printDividingLine(3) + split2[i2]);
            i2++;
        }
        printLog(i, str2, com.iwown.awlog.util.Utils.printDividingLine(2));
    }

    private void logObject(int i, java.lang.String str, java.lang.Object obj) {
        logString(i, str, com.iwown.awlog.util.ObjectUtil.objectToString(obj), new java.lang.Object[0]);
    }

    private java.lang.String generateTag() {
        java.lang.String str = this.localTags.get();
        if (!android.text.TextUtils.isEmpty(str)) {
            this.localTags.remove();
            return str;
        }
        return this.mLogConfig.getPrefix();
    }

    private java.lang.StackTraceElement getCurrentStackTrace() {
        int methodOffset;
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        int stackOffset = getStackOffset(stackTrace, com.iwown.awlog.AwLog.class);
        if (stackOffset == -1 && (stackOffset = getStackOffset(stackTrace, com.iwown.awlog.LoggerUtil.class)) == -1) {
            return null;
        }
        if (this.mLogConfig.getMethodOffset() > 0 && (methodOffset = this.mLogConfig.getMethodOffset() + stackOffset) < stackTrace.length) {
            stackOffset = methodOffset;
        }
        return stackTrace[stackOffset];
    }

    private java.lang.String getTopStackInfo() {
        java.lang.StackTraceElement currentStackTrace = getCurrentStackTrace();
        java.lang.String stackTraceElement = currentStackTrace.toString();
        java.lang.String substring = stackTraceElement.substring(stackTraceElement.lastIndexOf(40), stackTraceElement.length());
        java.lang.String className = currentStackTrace.getClassName();
        return java.lang.String.format("%s.%s%s", className.substring(className.lastIndexOf(".") + 1), currentStackTrace.getMethodName(), substring);
    }

    private int getStackOffset(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.Class cls) {
        for (int i = 5; i < stackTraceElementArr.length; i++) {
            java.lang.String className = stackTraceElementArr[i].getClassName();
            if (!(cls.equals(com.iwown.awlog.LoggerUtil.class) && i < stackTraceElementArr.length - 1 && stackTraceElementArr[i + 1].getClassName().equals(com.iwown.awlog.LoggerUtil.class.getName())) && className.equals(cls.getName())) {
                return i + 1;
            }
        }
        return -1;
    }

    @Override // com.iwown.awlog.Printer
    public void d(java.lang.String str, java.lang.Object obj) {
        logObject(1, str, obj);
    }

    @Override // com.iwown.awlog.Printer
    public void e(java.lang.String str, java.lang.Object obj) {
        logObject(5, str, obj);
    }

    @Override // com.iwown.awlog.Printer
    public void w(java.lang.String str, java.lang.Object obj) {
        logObject(4, str, obj);
    }

    @Override // com.iwown.awlog.Printer
    public void i(java.lang.String str, java.lang.Object obj) {
        logObject(3, str, obj);
    }

    @Override // com.iwown.awlog.Printer
    public void v(java.lang.String str, java.lang.Object obj) {
        logObject(2, str, obj);
    }

    @Override // com.iwown.awlog.Printer
    public void wtf(java.lang.String str, java.lang.String str2) {
        writeToFile(str2, str);
    }

    private void printLog(int i, java.lang.String str, java.lang.String str2) {
        if (!this.mLogConfig.isShowBorder()) {
            str2 = getTopStackInfo() + ": " + str2;
        }
        switch (i) {
            case 1:
                android.util.Log.d(str, str2);
                break;
            case 2:
                android.util.Log.v(str, str2);
                break;
            case 3:
                android.util.Log.i(str, str2);
                break;
            case 4:
                android.util.Log.w(str, str2);
                break;
            case 5:
                android.util.Log.e(str, str2);
                break;
            case 6:
                android.util.Log.wtf(str, str2);
                break;
        }
    }

    private void writeToFile(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.RuntimeException("Log File Path must not be empty");
        }
        java.io.File file = new java.io.File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (this.mLogConfig.getEngine() != null) {
            this.mLogConfig.getEngine().writeToFile(file, str2);
            return;
        }
        throw new java.lang.IllegalArgumentException("LogFileEngine must not Null");
    }
}
