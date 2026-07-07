package com.luck.picture.lib.service;

/* loaded from: /tmp/dex/classes2.dex */
public class ForegroundService extends android.app.Service {
    private static final java.lang.String CHANNEL_NAME = "com.luck.picture.lib";
    private static final int NOTIFICATION_ID = 1;
    private static final java.lang.String CHANNEL_ID = "com.luck.picture.lib." + com.luck.picture.lib.service.ForegroundService.class.getName();
    private static boolean isForegroundServiceIng = false;

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        startForeground(1, createForegroundNotification());
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        isForegroundServiceIng = true;
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onDestroy() {
        isForegroundServiceIng = false;
        stopForeground(true);
        super.onDestroy();
    }

    private android.app.Notification createForegroundNotification() {
        int i = com.luck.picture.lib.utils.SdkVersionUtils.isMaxN() ? 4 : 0;
        if (com.luck.picture.lib.utils.SdkVersionUtils.isO()) {
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(CHANNEL_ID, "com.luck.picture.lib", i);
            notificationChannel.setLightColor(-16776961);
            notificationChannel.canBypassDnd();
            notificationChannel.setBypassDnd(true);
            notificationChannel.setLockscreenVisibility(0);
            ((android.app.NotificationManager) getSystemService("notification")).createNotificationChannel(notificationChannel);
        }
        return new androidx.core.app.NotificationCompat.Builder(this, CHANNEL_ID).setSmallIcon(com.luck.picture.lib.R.drawable.ps_ic_trans_1px).setContentTitle(getAppName()).setContentText(getString(com.luck.picture.lib.config.SelectorProviders.getInstance().getSelectorConfig().chooseMode == com.luck.picture.lib.config.SelectMimeType.ofAudio() ? com.luck.picture.lib.R.string.ps_use_sound : com.luck.picture.lib.R.string.ps_use_camera)).setOngoing(true).build();
    }

    private java.lang.String getAppName() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 0).applicationInfo.loadLabel(getPackageManager()).toString();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void startForegroundService(android.content.Context context, boolean z) {
        try {
            if (!isForegroundServiceIng && z) {
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.luck.picture.lib.service.ForegroundService.class);
                if (com.luck.picture.lib.utils.SdkVersionUtils.isO()) {
                    context.startForegroundService(intent);
                } else {
                    context.startService(intent);
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void stopService(android.content.Context context) {
        try {
            if (isForegroundServiceIng) {
                context.stopService(new android.content.Intent(context, (java.lang.Class<?>) com.luck.picture.lib.service.ForegroundService.class));
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
