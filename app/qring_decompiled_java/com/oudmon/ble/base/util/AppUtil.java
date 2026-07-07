package com.oudmon.ble.base.util;

/* loaded from: /tmp/dex/classes2.dex */
public class AppUtil {
    public static boolean isBackground(android.content.Context context) {
        try {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((android.app.ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.equals(context.getPackageName())) {
                    return runningAppProcessInfo.importance != 100;
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean isApplicationBroughtToBackground(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks = ((android.app.ActivityManager) context.getSystemService("activity")).getRunningTasks(1);
        return (runningTasks.isEmpty() || runningTasks.get(0).topActivity.getPackageName().equals(context.getPackageName())) ? false : true;
    }

    public static java.lang.String getSystemInfo() {
        return android.os.Build.MODEL + "_" + android.os.Build.VERSION.SDK_INT + "_" + android.os.Build.VERSION.RELEASE;
    }

    public static java.lang.String getVersionName(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return "1.0.0.0";
        }
    }

    public static java.lang.String getPackageName(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return "com.qc";
        }
    }
}
