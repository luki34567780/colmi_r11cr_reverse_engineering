package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class ProcessUtils {
    private ProcessUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static java.lang.String getForegroundProcessName() {
        java.util.List<android.app.usage.UsageStats> list;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) com.blankj.utilcode.util.Utils.getApp().getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null && runningAppProcesses.size() > 0) {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        if (android.os.Build.VERSION.SDK_INT > 21) {
            android.content.pm.PackageManager packageManager = com.blankj.utilcode.util.Utils.getApp().getPackageManager();
            android.content.Intent intent = new android.content.Intent("android.settings.USAGE_ACCESS_SETTINGS");
            java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            android.util.Log.i("ProcessUtils", queryIntentActivities.toString());
            if (queryIntentActivities.size() <= 0) {
                android.util.Log.i("ProcessUtils", "getForegroundProcessName: noun of access to usage information.");
                return "";
            }
            try {
                android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(com.blankj.utilcode.util.Utils.getApp().getPackageName(), 0);
                android.app.AppOpsManager appOpsManager = (android.app.AppOpsManager) com.blankj.utilcode.util.Utils.getApp().getSystemService("appops");
                if (appOpsManager.checkOpNoThrow("android:get_usage_stats", applicationInfo.uid, applicationInfo.packageName) != 0) {
                    intent.addFlags(com.autonavi.amap.mapcore.AMapEngineUtils.MAX_P20_WIDTH);
                    com.blankj.utilcode.util.Utils.getApp().startActivity(intent);
                }
                if (appOpsManager.checkOpNoThrow("android:get_usage_stats", applicationInfo.uid, applicationInfo.packageName) != 0) {
                    android.util.Log.i("ProcessUtils", "getForegroundProcessName: refuse to device usage stats.");
                    return "";
                }
                android.app.usage.UsageStatsManager usageStatsManager = (android.app.usage.UsageStatsManager) com.blankj.utilcode.util.Utils.getApp().getSystemService("usagestats");
                if (usageStatsManager != null) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    list = usageStatsManager.queryUsageStats(4, currentTimeMillis - 604800000, currentTimeMillis);
                } else {
                    list = null;
                }
                if (list != null && !list.isEmpty()) {
                    android.app.usage.UsageStats usageStats = null;
                    for (android.app.usage.UsageStats usageStats2 : list) {
                        if (usageStats == null || usageStats2.getLastTimeUsed() > usageStats.getLastTimeUsed()) {
                            usageStats = usageStats2;
                        }
                    }
                    if (usageStats == null) {
                        return null;
                    }
                    return usageStats.getPackageName();
                }
                return "";
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public static java.util.Set<java.lang.String> getAllBackgroundProcesses() {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) com.blankj.utilcode.util.Utils.getApp().getSystemService("activity")).getRunningAppProcesses();
        java.util.HashSet hashSet = new java.util.HashSet();
        if (runningAppProcesses != null) {
            java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                java.util.Collections.addAll(hashSet, it.next().pkgList);
            }
        }
        return hashSet;
    }

    public static java.util.Set<java.lang.String> killAllBackgroundProcesses() {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.blankj.utilcode.util.Utils.getApp().getSystemService("activity");
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        java.util.HashSet hashSet = new java.util.HashSet();
        if (runningAppProcesses == null) {
            return hashSet;
        }
        java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            for (java.lang.String str : it.next().pkgList) {
                activityManager.killBackgroundProcesses(str);
                hashSet.add(str);
            }
        }
        java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it2 = activityManager.getRunningAppProcesses().iterator();
        while (it2.hasNext()) {
            for (java.lang.String str2 : it2.next().pkgList) {
                hashSet.remove(str2);
            }
        }
        return hashSet;
    }

    public static boolean killBackgroundProcesses(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'packageName' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.blankj.utilcode.util.Utils.getApp().getSystemService("activity");
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null && runningAppProcesses.size() != 0) {
            java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                if (java.util.Arrays.asList(it.next().pkgList).contains(str)) {
                    activityManager.killBackgroundProcesses(str);
                }
            }
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses2 = activityManager.getRunningAppProcesses();
            if (runningAppProcesses2 != null && runningAppProcesses2.size() != 0) {
                java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it2 = runningAppProcesses2.iterator();
                while (it2.hasNext()) {
                    if (java.util.Arrays.asList(it2.next().pkgList).contains(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isMainProcess() {
        return com.blankj.utilcode.util.Utils.getApp().getPackageName().equals(getCurrentProcessName());
    }

    public static java.lang.String getCurrentProcessName() {
        java.lang.String currentProcessNameByFile = getCurrentProcessNameByFile();
        if (!android.text.TextUtils.isEmpty(currentProcessNameByFile)) {
            return currentProcessNameByFile;
        }
        java.lang.String currentProcessNameByAms = getCurrentProcessNameByAms();
        return !android.text.TextUtils.isEmpty(currentProcessNameByAms) ? currentProcessNameByAms : getCurrentProcessNameByReflect();
    }

    private static java.lang.String getCurrentProcessNameByFile() {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(new java.io.File("/proc/" + android.os.Process.myPid() + "/cmdline")));
            java.lang.String trim = bufferedReader.readLine().trim();
            bufferedReader.close();
            return trim;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static java.lang.String getCurrentProcessNameByAms() {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) com.blankj.utilcode.util.Utils.getApp().getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
                int myPid = android.os.Process.myPid();
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid && runningAppProcessInfo.processName != null) {
                        return runningAppProcessInfo.processName;
                    }
                }
                return "";
            }
            return "";
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    private static java.lang.String getCurrentProcessNameByReflect() {
        try {
            android.app.Application app = com.blankj.utilcode.util.Utils.getApp();
            java.lang.reflect.Field field = app.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            java.lang.Object obj = field.get(app);
            java.lang.reflect.Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            java.lang.Object obj2 = declaredField.get(obj);
            return (java.lang.String) obj2.getClass().getDeclaredMethod("getProcessName", new java.lang.Class[0]).invoke(obj2, new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
