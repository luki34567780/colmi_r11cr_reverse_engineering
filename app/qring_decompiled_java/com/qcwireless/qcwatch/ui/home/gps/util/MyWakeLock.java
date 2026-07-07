package com.qcwireless.qcwatch.ui.home.gps.util;

/* loaded from: /tmp/dex/classes2.dex */
public class MyWakeLock {
    private android.content.Context context;
    private android.os.PowerManager.WakeLock wakeLock;

    public MyWakeLock(android.content.Context context) {
        this.context = context;
    }

    public void acquireWakeLock() {
        try {
            if (this.wakeLock == null) {
                android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) this.context.getSystemService("power")).newWakeLock(536870913, getClass().getCanonicalName());
                this.wakeLock = newWakeLock;
                if (newWakeLock != null) {
                    newWakeLock.acquire();
                }
            }
        } catch (java.lang.Exception e) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, e.getMessage());
        }
    }

    public void releaseWakeLock() {
        android.os.PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        this.wakeLock.release();
        this.wakeLock = null;
    }
}
