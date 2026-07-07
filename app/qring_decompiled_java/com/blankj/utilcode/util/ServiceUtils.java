package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class ServiceUtils {
    private ServiceUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static java.util.Set<java.lang.String> getAllRunningServices() {
        java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices = ((android.app.ActivityManager) com.blankj.utilcode.util.Utils.getApp().getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
        java.util.HashSet hashSet = new java.util.HashSet();
        if (runningServices == null || runningServices.size() == 0) {
            return null;
        }
        java.util.Iterator<android.app.ActivityManager.RunningServiceInfo> it = runningServices.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().service.getClassName());
        }
        return hashSet;
    }

    public static void startService(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'className' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        try {
            startService(java.lang.Class.forName(str));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void startService(java.lang.Class<?> cls) {
        java.util.Objects.requireNonNull(cls, "Argument 'cls' of type Class<?> (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        startService(new android.content.Intent(com.blankj.utilcode.util.Utils.getApp(), cls));
    }

    public static void startService(android.content.Intent intent) {
        try {
            intent.setFlags(32);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                com.blankj.utilcode.util.Utils.getApp().startForegroundService(intent);
            } else {
                com.blankj.utilcode.util.Utils.getApp().startService(intent);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean stopService(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'className' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        try {
            return stopService(java.lang.Class.forName(str));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean stopService(java.lang.Class<?> cls) {
        java.util.Objects.requireNonNull(cls, "Argument 'cls' of type Class<?> (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return stopService(new android.content.Intent(com.blankj.utilcode.util.Utils.getApp(), cls));
    }

    public static boolean stopService(android.content.Intent intent) {
        java.util.Objects.requireNonNull(intent, "Argument 'intent' of type Intent (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        try {
            return com.blankj.utilcode.util.Utils.getApp().stopService(intent);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void bindService(java.lang.String str, android.content.ServiceConnection serviceConnection, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'className' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(serviceConnection, "Argument 'conn' of type ServiceConnection (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        try {
            bindService(java.lang.Class.forName(str), serviceConnection, i);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void bindService(java.lang.Class<?> cls, android.content.ServiceConnection serviceConnection, int i) {
        java.util.Objects.requireNonNull(cls, "Argument 'cls' of type Class<?> (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(serviceConnection, "Argument 'conn' of type ServiceConnection (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        bindService(new android.content.Intent(com.blankj.utilcode.util.Utils.getApp(), cls), serviceConnection, i);
    }

    public static void bindService(android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i) {
        java.util.Objects.requireNonNull(intent, "Argument 'intent' of type Intent (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(serviceConnection, "Argument 'conn' of type ServiceConnection (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        try {
            com.blankj.utilcode.util.Utils.getApp().bindService(intent, serviceConnection, i);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void unbindService(android.content.ServiceConnection serviceConnection) {
        java.util.Objects.requireNonNull(serviceConnection, "Argument 'conn' of type ServiceConnection (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        com.blankj.utilcode.util.Utils.getApp().unbindService(serviceConnection);
    }

    public static boolean isServiceRunning(java.lang.Class<?> cls) {
        java.util.Objects.requireNonNull(cls, "Argument 'cls' of type Class<?> (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return isServiceRunning(cls.getName());
    }

    public static boolean isServiceRunning(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'className' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        try {
            java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices = ((android.app.ActivityManager) com.blankj.utilcode.util.Utils.getApp().getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
            if (runningServices != null && runningServices.size() != 0) {
                java.util.Iterator<android.app.ActivityManager.RunningServiceInfo> it = runningServices.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().service.getClassName())) {
                        return true;
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return false;
    }
}
