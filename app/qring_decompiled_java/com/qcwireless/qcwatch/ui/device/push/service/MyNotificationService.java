package com.qcwireless.qcwatch.ui.device.push.service;

/* compiled from: MyNotificationService.kt */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\fH\u0016J\u0016\u0010 \u001a\u00020\u00142\f\u0010!\u001a\b\u0018\u00010\"R\u00020\u0007H\u0016J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0017H\u0016J(\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0017H\u0016J\b\u0010,\u001a\u00020\u0014H\u0016J\u0010\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020/H\u0016J\"\u00100\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0017H\u0016J\b\u00103\u001a\u00020\u0014H\u0002J\b\u00104\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u00065"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/service/MyNotificationService;", "Landroid/service/notification/NotificationListenerService;", "Landroid/media/RemoteController$OnClientUpdateListener;", "()V", "lastBean", "Lcom/qcwireless/qcwatch/ui/device/push/bean/MusicBean;", "mRemoteController", "Landroid/media/RemoteController;", "musicBean", "myHandler", "Landroid/os/Handler;", "playing", "", "runnable", "Ljava/lang/Runnable;", "getRunnable", "()Ljava/lang/Runnable;", "setRunnable", "(Ljava/lang/Runnable;)V", "cmdToDevice", "", "bean", "getSystemVolume", "", "context", "Landroid/content/Context;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onClientChange", "clearing", "onClientMetadataUpdate", "metadataEditor", "Landroid/media/RemoteController$MetadataEditor;", "onClientPlaybackStateUpdate", "state", "stateChangeTimeMs", "", "currentPosMs", "speed", "", "onClientTransportControlUpdate", "transportControlFlags", "onCreate", "onNotificationPosted", "sbn", "Landroid/service/notification/StatusBarNotification;", "onStartCommand", "flags", "startId", "registerRemoteController", "wakeUpReConnect", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MyNotificationService extends android.service.notification.NotificationListenerService implements android.media.RemoteController.OnClientUpdateListener {
    private android.media.RemoteController mRemoteController;
    private com.qcwireless.qcwatch.ui.device.push.bean.MusicBean musicBean;
    private boolean playing;
    private final android.os.Handler myHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private com.qcwireless.qcwatch.ui.device.push.bean.MusicBean lastBean = new com.qcwireless.qcwatch.ui.device.push.bean.MusicBean();
    private java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.device.push.service.MyNotificationService$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            com.qcwireless.qcwatch.ui.device.push.service.MyNotificationService.m855runnable$lambda0(com.qcwireless.qcwatch.ui.device.push.service.MyNotificationService.this);
        }
    };

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientChange(boolean clearing) {
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientTransportControlUpdate(int transportControlFlags) {
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int flags, int startId) {
        return 1;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        registerRemoteController();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(final android.service.notification.StatusBarNotification sbn) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sbn, "sbn");
        super.onNotificationPosted(sbn);
        org.greenrobot.eventbus.EventBus.getDefault().post(sbn);
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.push.service.MyNotificationService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.push.service.MyNotificationService$onNotificationPosted$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.push.service.MyNotificationService) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.push.service.MyNotificationService myNotificationService) {
                android.os.Handler handler;
                android.os.Handler handler2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myNotificationService, "$this$ktxRunOnBgSingle");
                long wakeTime = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getWakeTime();
                if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected() && new com.oudmon.ble.base.util.DateUtil().getUnixTimestamp() > wakeTime) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "---------通知唤醒线程--------");
                    com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUp();
                    com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setWakeTime(new com.oudmon.ble.base.util.DateUtil().getUnixTimestamp() + 60);
                    com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                }
                if (sbn.getId() != 95279568 || com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress() == null || com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                    return;
                }
                handler = myNotificationService.myHandler;
                handler.removeCallbacks(myNotificationService.getRunnable());
                handler2 = myNotificationService.myHandler;
                handler2.postDelayed(myNotificationService.getRunnable(), 1000L);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: runnable$lambda-0, reason: not valid java name */
    public static final void m855runnable$lambda0(com.qcwireless.qcwatch.ui.device.push.service.MyNotificationService myNotificationService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myNotificationService, "this$0");
        myNotificationService.wakeUpReConnect();
    }

    public final java.lang.Runnable getRunnable() {
        return this.runnable;
    }

    public final void setRunnable(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "<set-?>");
        this.runnable = runnable;
    }

    private final void wakeUpReConnect() {
        com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "mac: " + com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear() + ", name: " + com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceNameNoClear());
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            return;
        }
        com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUp();
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int state) {
        if (state == 2) {
            this.playing = false;
            com.qcwireless.qcwatch.ui.device.push.bean.MusicBean musicBean = this.musicBean;
            if (musicBean != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(musicBean);
                musicBean.playing = false;
                com.qcwireless.qcwatch.ui.device.push.bean.MusicBean musicBean2 = this.musicBean;
                kotlin.jvm.internal.Intrinsics.checkNotNull(musicBean2);
                cmdToDevice(musicBean2);
                return;
            }
            return;
        }
        if (state == 3) {
            this.playing = true;
            com.qcwireless.qcwatch.ui.device.push.bean.MusicBean musicBean3 = this.musicBean;
            if (musicBean3 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(musicBean3);
                musicBean3.playing = true;
                com.qcwireless.qcwatch.ui.device.push.bean.MusicBean musicBean4 = this.musicBean;
                kotlin.jvm.internal.Intrinsics.checkNotNull(musicBean4);
                cmdToDevice(musicBean4);
                return;
            }
            return;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "----" + state);
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int state, long stateChangeTimeMs, long currentPosMs, float speed) {
        if (state == 2) {
            this.playing = false;
            com.qcwireless.qcwatch.ui.device.push.bean.MusicBean musicBean = this.musicBean;
            if (musicBean != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(musicBean);
                musicBean.playing = false;
                com.qcwireless.qcwatch.ui.device.push.bean.MusicBean musicBean2 = this.musicBean;
                kotlin.jvm.internal.Intrinsics.checkNotNull(musicBean2);
                cmdToDevice(musicBean2);
                return;
            }
            return;
        }
        if (state == 3) {
            this.playing = true;
            com.qcwireless.qcwatch.ui.device.push.bean.MusicBean musicBean3 = this.musicBean;
            if (musicBean3 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(musicBean3);
                musicBean3.playing = true;
                com.qcwireless.qcwatch.ui.device.push.bean.MusicBean musicBean4 = this.musicBean;
                kotlin.jvm.internal.Intrinsics.checkNotNull(musicBean4);
                cmdToDevice(musicBean4);
                return;
            }
            return;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "----" + state);
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientMetadataUpdate(android.media.RemoteController.MetadataEditor metadataEditor) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(metadataEditor);
        java.lang.String string = metadataEditor.getString(2, "null");
        java.lang.String string2 = metadataEditor.getString(1, "null");
        java.lang.String string3 = metadataEditor.getString(7, "null");
        long j = metadataEditor.getLong(9, -1L);
        com.qcwireless.qcwatch.ui.device.push.bean.MusicBean musicBean = new com.qcwireless.qcwatch.ui.device.push.bean.MusicBean();
        this.musicBean = musicBean;
        kotlin.jvm.internal.Intrinsics.checkNotNull(musicBean);
        musicBean.artistName = string;
        com.qcwireless.qcwatch.ui.device.push.bean.MusicBean musicBean2 = this.musicBean;
        kotlin.jvm.internal.Intrinsics.checkNotNull(musicBean2);
        musicBean2.album = string2;
        com.qcwireless.qcwatch.ui.device.push.bean.MusicBean musicBean3 = this.musicBean;
        kotlin.jvm.internal.Intrinsics.checkNotNull(musicBean3);
        musicBean3.track = string3;
        com.qcwireless.qcwatch.ui.device.push.bean.MusicBean musicBean4 = this.musicBean;
        kotlin.jvm.internal.Intrinsics.checkNotNull(musicBean4);
        musicBean4.duration = java.lang.Long.valueOf(j);
        com.qcwireless.qcwatch.ui.device.push.bean.MusicBean musicBean5 = this.musicBean;
        kotlin.jvm.internal.Intrinsics.checkNotNull(musicBean5);
        musicBean5.playing = java.lang.Boolean.valueOf(this.playing);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, this.musicBean);
        com.qcwireless.qcwatch.ui.device.push.bean.MusicBean musicBean6 = this.musicBean;
        kotlin.jvm.internal.Intrinsics.checkNotNull(musicBean6);
        cmdToDevice(musicBean6);
    }

    private final void registerRemoteController() {
        java.lang.Object systemService;
        this.mRemoteController = new android.media.RemoteController(this, this);
        boolean z = false;
        try {
            systemService = getSystemService(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO);
        } catch (java.lang.NullPointerException | java.lang.SecurityException unused) {
        }
        if (systemService == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
        }
        z = ((android.media.AudioManager) systemService).registerRemoteController(this.mRemoteController);
        if (z) {
            try {
                android.media.RemoteController remoteController = this.mRemoteController;
                kotlin.jvm.internal.Intrinsics.checkNotNull(remoteController);
                remoteController.setArtworkConfiguration(100, 100);
                android.media.RemoteController remoteController2 = this.mRemoteController;
                kotlin.jvm.internal.Intrinsics.checkNotNull(remoteController2);
                remoteController2.setSynchronizationMode(1);
            } catch (java.lang.IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return super.onBind(intent);
    }

    private final void cmdToDevice(com.qcwireless.qcwatch.ui.device.push.bean.MusicBean bean) {
        if (com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() == 1 || com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() == 2 || com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() == 3 || com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() == 4) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "正在固件升级返回");
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(bean, this.lastBean)) {
            return;
        }
        this.lastBean = bean;
        if (bean.track == null) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "-------");
            return;
        }
        com.oudmon.ble.base.communication.file.FileHandle fileHandle = com.oudmon.ble.base.communication.file.FileHandle.getInstance();
        java.lang.Boolean bool = bean.playing;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "bean.playing");
        fileHandle.executeMusicSend(bool.booleanValue(), 0, getSystemVolume(this), bean.track);
    }

    private final int getSystemVolume(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO);
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        return (audioManager.getStreamVolume(3) * 100) / audioManager.getStreamMaxVolume(3);
    }
}
