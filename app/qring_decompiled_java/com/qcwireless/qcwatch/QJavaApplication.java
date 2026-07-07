package com.qcwireless.qcwatch;

/* loaded from: /tmp/dex/classes2.dex */
public class QJavaApplication {
    private static com.qcwireless.qcwatch.QJavaApplication instance;
    private android.app.Application application;
    private java.util.Map<java.lang.String, java.lang.String> plates = new java.util.HashMap();
    private java.util.List<java.lang.String> filterPrefix = new java.util.ArrayList();
    private int gpsType = 0;

    public static com.qcwireless.qcwatch.QJavaApplication getInstance() {
        com.qcwireless.qcwatch.QJavaApplication qJavaApplication;
        com.qcwireless.qcwatch.QJavaApplication qJavaApplication2 = instance;
        if (qJavaApplication2 != null) {
            return qJavaApplication2;
        }
        synchronized (com.qcwireless.qcwatch.QJavaApplication.class) {
            if (instance == null) {
                instance = new com.qcwireless.qcwatch.QJavaApplication();
            }
            qJavaApplication = instance;
        }
        return qJavaApplication;
    }

    public int getGpsType() {
        return this.gpsType;
    }

    public void setGpsType(int gpsType) {
        this.gpsType = gpsType;
    }

    public static java.lang.String getAppLogPath() {
        return getInstance().getApplication().getExternalFilesDir("") + "/log/" + new com.oudmon.ble.base.util.DateUtil().getY_M_D() + "app_log.txt";
    }

    public java.lang.String getYMD() {
        return new com.oudmon.ble.base.util.DateUtil().getY_M_D_H_M_S();
    }

    public android.app.Application getApplication() {
        return this.application;
    }

    public void setApplication(android.app.Application application) {
        this.application = application;
    }

    public static void trySetupNotifyService(android.content.Context context) {
        toggleNotificationService(context);
    }

    private static void toggleNotificationService(android.content.Context context) {
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            packageManager.setComponentEnabledSetting(new android.content.ComponentName(context, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.push.service.MyNotificationService.class), 2, 1);
            packageManager.setComponentEnabledSetting(new android.content.ComponentName(context, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.push.service.MyNotificationService.class), 1, 1);
        } catch (java.lang.RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static boolean isNotificationServiceRunning(android.content.Context context) {
        try {
            java.util.Iterator<android.app.ActivityManager.RunningServiceInfo> it = ((android.app.ActivityManager) context.getSystemService("activity")).getRunningServices(com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER).iterator();
            while (it.hasNext()) {
                if (com.qcwireless.qcwatch.ui.device.push.service.MyNotificationService.class.getName().equals(it.next().service.getClassName())) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void putKeys(java.lang.String key) {
        this.plates.put(key, key);
    }

    public int localPlates() {
        return this.plates.size();
    }

    public boolean hasKey(java.lang.String key) {
        return this.plates.get(key) != null;
    }

    public void removeKeys(java.lang.String key) {
        this.plates.remove(key);
    }

    public void clear() {
        this.plates.clear();
    }

    public void putScanKeys(java.lang.String key) {
        this.filterPrefix.add(key);
    }

    public java.util.List<java.lang.String> getKeys() {
        if (this.filterPrefix.size() == 0) {
            this.filterPrefix.add("O_");
            this.filterPrefix.add("o_");
            this.filterPrefix.add("MSmart");
        }
        return this.filterPrefix;
    }
}
