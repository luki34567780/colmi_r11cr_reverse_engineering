package com.qcwireless.qcwatch.ui.base.util;

/* loaded from: /tmp/dex/classes2.dex */
public class NotificationUtils extends android.content.ContextWrapper {
    public static final int QCNotification = 95279568;
    private static final java.lang.String TAG = "QWatch_Pro";
    public static final java.lang.String cameraId = "com.qcwatch_pro.channel_3";
    public static final java.lang.String id = "com.qcwatch_pro.channel_2";
    public static final java.lang.String name = "com.qcwatch_pro.channel_name_2";
    private android.app.NotificationManager mManager;
    public android.app.Notification notification;

    public NotificationUtils(android.content.Context context) {
        super(context);
        initManager();
    }

    private void initManager() {
        if (this.mManager == null) {
            this.mManager = (android.app.NotificationManager) getSystemService("notification");
        }
    }

    public android.app.Notification initBandNotification() {
        try {
            java.lang.String str = "--";
            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                str = com.qcwireless.qcwatch.base.pref.PreUtil.getInt(com.qcwireless.qcwatch.base.pref.PreUtil.Action_Today_Steps, 0) + "";
            }
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                createNotificationChannel();
                androidx.core.app.NotificationCompat.Builder builder = new androidx.core.app.NotificationCompat.Builder(this, id);
                builder.setSmallIcon(com.qcwireless.qcwatch.R.mipmap.notification).setContentTitle(getResources().getString(2131820573)).setContentText(getResources().getString(com.qcwireless.qcwatch.R.string.qc_text_76, str + "")).setContentIntent(android.app.PendingIntent.getActivity(this, 0, new android.content.Intent(this, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.activity.MainActivity.class), 201326592)).setOngoing(true).setSound((android.net.Uri) null).setLights(0, 0, 0).setVibrate((long[]) null).setWhen(java.lang.System.currentTimeMillis()).setPriority(0);
                this.notification = builder.build();
            } else {
                android.app.PendingIntent activity = android.app.PendingIntent.getActivity(this, 0, new android.content.Intent(this, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.activity.MainActivity.class), 201326592);
                androidx.core.app.NotificationCompat.Builder builder2 = new androidx.core.app.NotificationCompat.Builder(this);
                builder2.setSmallIcon(com.qcwireless.qcwatch.R.mipmap.notification).setContentTitle(getResources().getString(2131820573)).setContentText(getResources().getString(com.qcwireless.qcwatch.R.string.qc_text_76, str + "")).setContentIntent(activity).setWhen(java.lang.System.currentTimeMillis()).setOngoing(true).setSound((android.net.Uri) null).setLights(0, 0, 0).setVibrate((long[]) null);
                this.notification = builder2.build();
            }
            this.notification.flags = 2;
            this.notification.flags |= 32;
            this.notification.flags |= 64;
            this.mManager.notify(QCNotification, this.notification);
            return this.notification;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public android.app.Notification initCameraNotification() {
        try {
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) getSystemService("notification");
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                notificationManager.createNotificationChannel(new android.app.NotificationChannel("001", "channel_name", 4));
            }
            androidx.core.app.NotificationCompat.Builder builder = new androidx.core.app.NotificationCompat.Builder(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication(), "001");
            builder.setContentIntent(android.app.PendingIntent.getActivity(this, 0, new android.content.Intent(this, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.camera.CameraActivity.class), 201326592));
            builder.setSmallIcon(com.qcwireless.qcwatch.R.mipmap.notification).setContentTitle(getResources().getString(2131820573));
            builder.setContentText(getResources().getString(com.qcwireless.qcwatch.R.string.qc_text_513));
            android.app.Notification build = builder.build();
            this.notification = build;
            notificationManager.notify(9999, build);
            return this.notification;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void cancelNotification() {
        try {
            this.mManager.cancel(9999);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void createNotificationChannel() {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(id, name, 3);
        notificationChannel.enableLights(false);
        notificationChannel.enableVibration(false);
        notificationChannel.setSound(null, null);
        this.mManager.createNotificationChannel(notificationChannel);
    }
}
