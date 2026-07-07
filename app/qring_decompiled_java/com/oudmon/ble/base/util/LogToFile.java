package com.oudmon.ble.base.util;

/* loaded from: /tmp/dex/classes2.dex */
public class LogToFile {
    private static com.oudmon.ble.base.util.LogToFile mInstance;
    public boolean debug = false;
    private java.lang.String logPath;
    private java.lang.String notifyPath;
    private java.lang.String statusPath;
    private java.lang.String writePath;

    public static com.oudmon.ble.base.util.LogToFile getInstance() {
        if (mInstance == null) {
            synchronized (com.oudmon.ble.base.util.LogToFile.class) {
                if (mInstance == null) {
                    mInstance = new com.oudmon.ble.base.util.LogToFile();
                }
            }
        }
        return mInstance;
    }

    public void initPath(android.app.Application application) {
        this.logPath = application.getExternalFilesDir("") + "/log/" + new com.oudmon.ble.base.util.DateUtil().getY_M_D() + "debug_log.txt";
        this.statusPath = application.getExternalFilesDir("") + "/log/" + new com.oudmon.ble.base.util.DateUtil().getY_M_D() + "ble_status.txt";
        this.notifyPath = application.getExternalFilesDir("") + "/log/" + new com.oudmon.ble.base.util.DateUtil().getY_M_D() + "ble_notify.txt";
        this.writePath = application.getExternalFilesDir("") + "/log/" + new com.oudmon.ble.base.util.DateUtil().getY_M_D() + "ble_write.txt";
    }

    public void wtf(java.lang.String str) {
        if (this.logPath != null && this.debug) {
            com.iwown.awlog.AwLog.wtf(new com.oudmon.ble.base.util.DateUtil().getY_M_D_H_M_S() + ":" + str + "\n", this.logPath);
        }
    }

    public void wtfStatus(java.lang.String str) {
        if (this.statusPath != null && this.debug) {
            com.iwown.awlog.AwLog.wtf(new com.oudmon.ble.base.util.DateUtil().getY_M_D_H_M_S() + ":" + str + "\n", this.statusPath);
        }
    }

    public void wtfWrite(java.lang.String str) {
        if (this.writePath != null && this.debug) {
            com.iwown.awlog.AwLog.wtf(new com.oudmon.ble.base.util.DateUtil().getY_M_D_H_M_S() + ":" + str + "\n", this.writePath);
        }
    }

    public void wtfNotify(java.lang.String str) {
        if (this.notifyPath != null && this.debug) {
            com.iwown.awlog.AwLog.wtf(new com.oudmon.ble.base.util.DateUtil().getY_M_D_H_M_S() + ":" + str + "\n", this.notifyPath);
        }
    }
}
