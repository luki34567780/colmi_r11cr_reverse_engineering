package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class WakeLocks {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("WakeLocks");
    private static final java.util.WeakHashMap<android.os.PowerManager.WakeLock, java.lang.String> sWakeLocks = new java.util.WeakHashMap<>();

    public static android.os.PowerManager.WakeLock newWakeLock(android.content.Context context, java.lang.String tag) {
        java.lang.String str = "WorkManager: " + tag;
        android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str);
        java.util.WeakHashMap<android.os.PowerManager.WakeLock, java.lang.String> weakHashMap = sWakeLocks;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, str);
        }
        return newWakeLock;
    }

    public static void checkWakeLocks() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.WeakHashMap<android.os.PowerManager.WakeLock, java.lang.String> weakHashMap = sWakeLocks;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (android.os.PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                androidx.work.Logger.get().warning(TAG, java.lang.String.format("WakeLock held for %s", hashMap.get(wakeLock)), new java.lang.Throwable[0]);
            }
        }
    }

    private WakeLocks() {
    }
}
