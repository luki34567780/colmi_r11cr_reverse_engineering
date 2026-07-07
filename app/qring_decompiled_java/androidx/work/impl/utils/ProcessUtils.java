package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class ProcessUtils {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("ProcessUtils");

    private ProcessUtils() {
    }

    public static boolean isDefaultProcess(android.content.Context context, androidx.work.Configuration configuration) {
        java.lang.String processName = getProcessName(context);
        if (!android.text.TextUtils.isEmpty(configuration.getDefaultProcessName())) {
            return android.text.TextUtils.equals(processName, configuration.getDefaultProcessName());
        }
        return android.text.TextUtils.equals(processName, context.getApplicationInfo().processName);
    }

    public static java.lang.String getProcessName(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        java.lang.Object invoke;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return android.app.Application.getProcessName();
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread", false, androidx.work.impl.utils.ProcessUtils.class.getClassLoader());
            if (android.os.Build.VERSION.SDK_INT >= 18) {
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("currentProcessName", new java.lang.Class[0]);
                declaredMethod.setAccessible(true);
                invoke = declaredMethod.invoke(null, new java.lang.Object[0]);
            } else {
                java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod("currentActivityThread", new java.lang.Class[0]);
                declaredMethod2.setAccessible(true);
                java.lang.reflect.Method declaredMethod3 = cls.getDeclaredMethod("getProcessName", new java.lang.Class[0]);
                declaredMethod3.setAccessible(true);
                invoke = declaredMethod3.invoke(declaredMethod2.invoke(null, new java.lang.Object[0]), new java.lang.Object[0]);
            }
            if (invoke instanceof java.lang.String) {
                return (java.lang.String) invoke;
            }
        } catch (java.lang.Throwable th) {
            androidx.work.Logger.get().debug(TAG, "Unable to check ActivityThread for processName", th);
        }
        int myPid = android.os.Process.myPid();
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }
}
