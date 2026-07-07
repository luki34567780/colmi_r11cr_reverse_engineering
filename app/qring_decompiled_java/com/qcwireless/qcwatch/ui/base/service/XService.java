package com.qcwireless.qcwatch.ui.base.service;

/* loaded from: /tmp/dex/classes2.dex */
public class XService extends android.app.Service {
    public static android.content.Intent serviceIntent;

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.qcwireless.qcwatch.ui.base.service.XService$1] */
    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int flags, int startId) {
        serviceIntent = intent;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.Notification initBandNotification = new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
            if (initBandNotification != null) {
                startForeground(com.qcwireless.qcwatch.ui.base.util.NotificationUtils.QCNotification, initBandNotification);
            } else {
                startForeground(com.qcwireless.qcwatch.ui.base.util.NotificationUtils.QCNotification, new android.app.Notification());
            }
        }
        new java.lang.Thread() { // from class: com.qcwireless.qcwatch.ui.base.service.XService.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                super.run();
                while (true) {
                    try {
                        java.lang.Thread.sleep(60000L);
                        com.qcwireless.qcwatch.QJavaApplication.trySetupNotifyService(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication());
                        if (android.os.Build.VERSION.SDK_INT >= 26) {
                            android.app.Notification initBandNotification2 = new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
                            if (initBandNotification2 != null) {
                                com.qcwireless.qcwatch.ui.base.service.XService.this.startForeground(com.qcwireless.qcwatch.ui.base.util.NotificationUtils.QCNotification, initBandNotification2);
                            } else {
                                com.qcwireless.qcwatch.ui.base.service.XService.this.startForeground(com.qcwireless.qcwatch.ui.base.util.NotificationUtils.QCNotification, new android.app.Notification());
                            }
                        }
                        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                            com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUp();
                        }
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        com.qcwireless.qcwatch.ui.base.receiver.MyAlarmReceiver.completeWakefulIntent(intent);
        return 2;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        serviceIntent = null;
        setAlarmTimer();
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
    public boolean onUnbind(android.content.Intent intent) {
        return super.onUnbind(intent);
    }

    protected void setAlarmTimer() {
        com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "99999999999999999999");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
        calendar.add(13, 1);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.base.receiver.XReceiver.class);
        intent.setAction("com.qcwx.test");
        sendBroadcast(intent);
        ((android.app.AlarmManager) getSystemService("alarm")).set(0, calendar.getTimeInMillis(), android.app.PendingIntent.getBroadcast(this, 0, intent, 201326592));
    }
}
