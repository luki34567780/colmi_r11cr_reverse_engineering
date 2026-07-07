package com.app.watch.keeping.ext;

/* compiled from: ManagerExt.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f\u001a\u0012\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"isForeground", "", "Landroid/content/Context;", "(Landroid/content/Context;)Z", "isMain", "isScreenOn", "mainPid", "", "getMainPid", "(Landroid/content/Context;)I", "isRunningTaskExist", "processName", "", "isServiceRunning", "className", "keeping_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ManagerExtKt {
    public static final boolean isScreenOn(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            java.lang.Object systemService = context.getApplicationContext().getSystemService("power");
            if (systemService == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.os.PowerManager");
            }
            return ((android.os.PowerManager) systemService).isScreenOn();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static final int getMainPid(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        java.lang.Object systemService = context.getSystemService("activity");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        int myPid = android.os.Process.myPid();
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(runningAppProcesses, "runningAppProcesses");
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(runningAppProcessInfo.processName, context.getPackageName())) {
                    myPid = runningAppProcessInfo.pid;
                }
            }
        }
        return myPid;
    }

    public static final boolean isMain(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        java.lang.Object systemService = context.getSystemService("activity");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(runningAppProcesses, "activityManager.runningAppProcesses");
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == android.os.Process.myPid() && kotlin.jvm.internal.Intrinsics.areEqual(runningAppProcessInfo.processName, context.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isForeground(android.content.Context context) {
        android.content.ComponentName componentName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        java.lang.Object systemService = context.getSystemService("activity");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks = ((android.app.ActivityManager) systemService).getRunningTasks(1);
        if (runningTasks == null) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(runningTasks, "getRunningTasks(1)");
        if (!(true ^ runningTasks.isEmpty()) || (componentName = runningTasks.get(0).topActivity) == null) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(componentName.getPackageName(), context.getPackageName());
    }

    public static final boolean isServiceRunning(android.content.Context context, java.lang.String className) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(className, "className");
        java.lang.Object systemService = context.getSystemService("activity");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices = ((android.app.ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE);
        if (runningServices == null) {
            return false;
        }
        java.util.Iterator<android.app.ActivityManager.RunningServiceInfo> it = runningServices.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(className, it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isRunningTaskExist(android.content.Context context, java.lang.String processName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processName, "processName");
        java.lang.Object systemService = context.getSystemService("activity");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        java.util.Iterator<T> it = runningAppProcesses.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((android.app.ActivityManager.RunningAppProcessInfo) it.next()).processName, context.getPackageName() + ':' + processName)) {
                return true;
            }
        }
        return false;
    }
}
