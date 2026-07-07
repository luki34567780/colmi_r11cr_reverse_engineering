package com.qcwireless.qcwatch.ui.base.service;

/* loaded from: /tmp/dex/classes2.dex */
public class YService extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.Notification initBandNotification = new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
            if (initBandNotification != null) {
                startForeground(com.qcwireless.qcwatch.ui.base.util.NotificationUtils.QCNotification, initBandNotification);
            } else {
                startForeground(com.qcwireless.qcwatch.ui.base.util.NotificationUtils.QCNotification, new android.app.Notification());
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int flags, int startId) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.Notification initBandNotification = new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
            if (initBandNotification != null) {
                startForeground(com.qcwireless.qcwatch.ui.base.util.NotificationUtils.QCNotification, initBandNotification);
            } else {
                startForeground(com.qcwireless.qcwatch.ui.base.util.NotificationUtils.QCNotification, new android.app.Notification());
            }
        }
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.base.service.XService.class);
        try {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                startForegroundService(intent2);
            } else {
                startService(intent2);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        stopForeground(true);
        stopSelf();
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        return super.onUnbind(intent);
    }
}
