package com.realsil.sdk.core.base;

/* loaded from: classes3.dex */
public abstract class BaseService extends android.app.Service {
    public android.hardware.display.DisplayManager a;
    public android.content.Context mContext;
    public int notificationId = 1230;
    public final android.hardware.display.DisplayManager.DisplayListener b = new android.hardware.display.DisplayManager.DisplayListener() { // from class: com.realsil.sdk.core.base.BaseService.1
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    };

    public android.app.Notification buildNotification(android.content.Context context) {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 16) {
            return new android.app.Notification();
        }
        android.app.Notification.Builder builder = i >= 26 ? new android.app.Notification.Builder(getApplicationContext(), getChannelId()) : new android.app.Notification.Builder(getApplicationContext());
        builder.setContentText("GuardService").setWhen(java.lang.System.currentTimeMillis());
        return builder.build();
    }

    public java.lang.String getChannelId() {
        return "rtk_channel_id";
    }

    public java.lang.String getChannelName() {
        return "rtk_channel_name";
    }

    public android.app.Notification getNotification(java.lang.String str, java.lang.String str2) {
        androidx.core.app.NotificationCompat.Builder when = new androidx.core.app.NotificationCompat.Builder(this, getChannelId()).setContentText(str2).setContentTitle(str).setOngoing(true).setPriority(1).setWhen(java.lang.System.currentTimeMillis());
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            when.setChannelId(getChannelId());
        }
        return when.build();
    }

    public int getNotificationId() {
        return this.notificationId;
    }

    public boolean isScreenOn() {
        android.view.Display[] displays;
        android.hardware.display.DisplayManager displayManager = this.a;
        if (displayManager == null || (displays = displayManager.getDisplays()) == null) {
            return false;
        }
        for (android.view.Display display : displays) {
            if (android.os.Build.VERSION.SDK_INT >= 20 && display.getState() == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean isServiceRunningInForeground(android.content.Context context) {
        for (android.app.ActivityManager.RunningServiceInfo runningServiceInfo : ((android.app.ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
            if (getClass().getName().equals(runningServiceInfo.service.getClassName()) && runningServiceInfo.foreground) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.realsil.sdk.core.logger.ZLogger.v("in onBind()");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mContext = this;
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) getSystemService("display");
        this.a = displayManager;
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.b, null);
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(getChannelId(), getChannelName(), 0);
            notificationChannel.setLightColor(-16776961);
            notificationChannel.setLockscreenVisibility(0);
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        android.hardware.display.DisplayManager displayManager = this.a;
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.b);
        }
        stopForeground(true);
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        com.realsil.sdk.core.logger.ZLogger.v("in onRebind()");
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        return 1;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.realsil.sdk.core.logger.ZLogger.d("Last client unbound from service");
        return true;
    }

    public void setNotificationId(int i) {
        this.notificationId = i;
    }

    public void showNotification(java.lang.String str, java.lang.String str2, android.content.ComponentName componentName) {
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(componentName);
        showNotification(str, str2, android.app.PendingIntent.getActivity(this, 0, intent, 0), -1, -1);
    }

    public void showNotification(java.lang.String str, java.lang.String str2, android.app.PendingIntent pendingIntent, int i, int i2) {
        android.app.Notification notification;
        android.app.Notification.Builder builder;
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 16) {
            if (i3 >= 26) {
                builder = new android.app.Notification.Builder(getApplicationContext(), getChannelId());
            } else {
                builder = new android.app.Notification.Builder(getApplicationContext());
            }
            if (pendingIntent != null) {
                builder.setContentIntent(pendingIntent);
            }
            if (i != -1) {
                builder.setLargeIcon(android.graphics.BitmapFactory.decodeResource(getResources(), i));
            }
            if (i2 != -1) {
                builder.setSmallIcon(i2);
            }
            builder.setContentTitle(str).setContentText(str2).setWhen(java.lang.System.currentTimeMillis());
            notification = builder.build();
        } else {
            notification = new android.app.Notification();
        }
        if (notification != null) {
            notification.flags = 34;
            startForeground(getNotificationId(), notification);
        }
    }
}
