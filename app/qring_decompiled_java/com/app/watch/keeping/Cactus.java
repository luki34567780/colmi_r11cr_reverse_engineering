package com.app.watch.keeping;

/* compiled from: Cactus.kt */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 I2\u00020\u0001:\u0001IB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\rJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J,\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\rJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\nJ\u000e\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\nJ\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020(J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020(J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\nJ\u000e\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u000200J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0015J\u000e\u00101\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\nJ\u000e\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u000204J\u0010\u00105\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u000107J\u000e\u00108\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\nJ\u000e\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020%J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0015J\u000e\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u0015J\u000e\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020(J\u000e\u0010D\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\nJ\u000e\u0010E\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\nJ\u000e\u0010F\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010G\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010H\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/app/watch/keeping/Cactus;", "", "()V", "mCactusConfig", "Lcom/app/watch/keeping/entity/CactusConfig;", "mDefaultConfig", "Lcom/app/watch/keeping/entity/DefaultConfig;", "mNotificationConfig", "Lcom/app/watch/keeping/entity/NotificationConfig;", "mUsePreviousConfig", "", "addBackgroundCallback", "block", "Lkotlin/Function1;", "", "cactusBackgroundCallback", "Lcom/app/watch/keeping/callback/CactusBackgroundCallback;", "addCallback", "stop", "Lkotlin/Function0;", "work", "", "cactusCallback", "Lcom/app/watch/keeping/callback/CactusCallback;", "hideNotification", "hide", "hideNotificationAfterO", "isDebug", "isRunning", "context", "Landroid/content/Context;", "register", "restart", "setBackgroundMusicEnabled", "enabled", "setBigRemoteViews", "bigRemoteViews", "Landroid/widget/RemoteViews;", "setChannelId", "channelId", "", "setChannelName", "channelName", "setContent", "content", "setCrashRestartUIEnabled", "setLargeIcon", "largeIcon", "Landroid/graphics/Bitmap;", "setMusicEnabled", "setNotification", "notification", "Landroid/app/Notification;", "setNotificationChannel", "notificationChannel", "Landroid/app/NotificationChannel;", "setOnePixEnabled", "setPendingIntent", com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "setRemoteViews", "remoteViews", "setServiceId", com.app.watch.keeping.entity.Constant.CACTUS_SERVICE_ID, "setSmallIcon", "smallIcon", "setTitle", "title", "setWorkOnMainThread", "setWorkerEnabled", "unregister", "updateNotification", "usePreviousConfig", "Companion", "keeping_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Cactus {
    public static final java.lang.String CACTUS_TIMES = "times";
    private com.app.watch.keeping.entity.CactusConfig mCactusConfig;
    private final com.app.watch.keeping.entity.DefaultConfig mDefaultConfig;
    private com.app.watch.keeping.entity.NotificationConfig mNotificationConfig;
    private boolean mUsePreviousConfig;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.app.watch.keeping.Cactus.Companion INSTANCE = new com.app.watch.keeping.Cactus.Companion(null);
    public static final java.lang.String CACTUS_WORK = com.app.watch.keeping.ext.CactusExtKt.getFieldById("work");
    public static final java.lang.String CACTUS_STOP = com.app.watch.keeping.ext.CactusExtKt.getFieldById("stop");
    public static final java.lang.String CACTUS_BACKGROUND = com.app.watch.keeping.ext.CactusExtKt.getFieldById("background");
    public static final java.lang.String CACTUS_FOREGROUND = com.app.watch.keeping.ext.CactusExtKt.getFieldById("foreground");
    private static final kotlin.Lazy<com.app.watch.keeping.Cactus> instance$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.app.watch.keeping.Cactus>() { // from class: com.app.watch.keeping.Cactus$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final com.app.watch.keeping.Cactus invoke() {
            return new com.app.watch.keeping.Cactus(null);
        }
    });

    public /* synthetic */ Cactus(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final com.app.watch.keeping.Cactus getInstance() {
        return INSTANCE.getInstance();
    }

    private Cactus() {
        this.mCactusConfig = new com.app.watch.keeping.entity.CactusConfig(null, null, 3, null);
        this.mNotificationConfig = new com.app.watch.keeping.entity.NotificationConfig(0, null, null, null, null, 0, 0, null, false, false, null, null, null, null, null, 32767, null);
        this.mDefaultConfig = new com.app.watch.keeping.entity.DefaultConfig(false, false, false, false, false, false, false, null, 255, null);
    }

    /* compiled from: Cactus.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R!\u0010\t\u001a\u00020\n8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/app/watch/keeping/Cactus$Companion;", "", "()V", "CACTUS_BACKGROUND", "", "CACTUS_FOREGROUND", "CACTUS_STOP", "CACTUS_TIMES", "CACTUS_WORK", "instance", "Lcom/app/watch/keeping/Cactus;", "getInstance$annotations", "getInstance", "()Lcom/app/watch/keeping/Cactus;", "instance$delegate", "Lkotlin/Lazy;", "keeping_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        private Companion() {
        }

        public final com.app.watch.keeping.Cactus getInstance() {
            return (com.app.watch.keeping.Cactus) com.app.watch.keeping.Cactus.instance$delegate.getValue();
        }
    }

    public final com.app.watch.keeping.Cactus setNotification(android.app.Notification notification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "notification");
        this.mNotificationConfig.setNotification(notification);
        return this;
    }

    public final com.app.watch.keeping.Cactus setNotificationChannel(android.app.NotificationChannel notificationChannel) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mNotificationConfig.setNotificationChannel(notificationChannel);
        }
        return this;
    }

    public final com.app.watch.keeping.Cactus hideNotification(boolean hide) {
        this.mNotificationConfig.setHideNotification(hide);
        return this;
    }

    public final com.app.watch.keeping.Cactus hideNotificationAfterO(boolean hide) {
        this.mNotificationConfig.setHideNotificationAfterO(hide);
        return this;
    }

    public final com.app.watch.keeping.Cactus setPendingIntent(android.app.PendingIntent pendingIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        this.mNotificationConfig.setPendingIntent(pendingIntent);
        return this;
    }

    public final com.app.watch.keeping.Cactus setServiceId(int serviceId) {
        this.mNotificationConfig.setServiceId(serviceId);
        return this;
    }

    public final com.app.watch.keeping.Cactus setChannelId(java.lang.String channelId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channelId, "channelId");
        this.mNotificationConfig.setChannelId(channelId);
        return this;
    }

    public final com.app.watch.keeping.Cactus setChannelName(java.lang.String channelName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channelName, "channelName");
        this.mNotificationConfig.setChannelName(channelName);
        return this;
    }

    public final com.app.watch.keeping.Cactus setTitle(java.lang.String title) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        this.mNotificationConfig.setTitle(title);
        return this;
    }

    public final com.app.watch.keeping.Cactus setContent(java.lang.String content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        this.mNotificationConfig.setContent(content);
        return this;
    }

    public final com.app.watch.keeping.Cactus setRemoteViews(android.widget.RemoteViews remoteViews) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteViews, "remoteViews");
        this.mNotificationConfig.setHideNotification(false);
        this.mNotificationConfig.setRemoteViews(remoteViews);
        return this;
    }

    public final com.app.watch.keeping.Cactus setBigRemoteViews(android.widget.RemoteViews bigRemoteViews) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigRemoteViews, "bigRemoteViews");
        this.mNotificationConfig.setHideNotification(false);
        this.mNotificationConfig.setBigRemoteViews(bigRemoteViews);
        return this;
    }

    public final com.app.watch.keeping.Cactus setSmallIcon(int smallIcon) {
        this.mNotificationConfig.setSmallIcon(smallIcon);
        return this;
    }

    public final com.app.watch.keeping.Cactus setLargeIcon(int largeIcon) {
        this.mNotificationConfig.setLargeIcon(largeIcon);
        return this;
    }

    public final com.app.watch.keeping.Cactus setLargeIcon(android.graphics.Bitmap largeIcon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(largeIcon, "largeIcon");
        this.mNotificationConfig.setLargeIconBitmap(largeIcon);
        return this;
    }

    public final com.app.watch.keeping.Cactus setMusicEnabled(boolean enabled) {
        this.mDefaultConfig.setMusicEnabled(enabled);
        return this;
    }

    public final com.app.watch.keeping.Cactus setBackgroundMusicEnabled(boolean enabled) {
        this.mDefaultConfig.setBackgroundMusicEnabled(enabled);
        return this;
    }

    public final com.app.watch.keeping.Cactus setOnePixEnabled(boolean enabled) {
        this.mDefaultConfig.setOnePixEnabled(enabled);
        return this;
    }

    public final com.app.watch.keeping.Cactus setWorkerEnabled(boolean enabled) {
        this.mDefaultConfig.setWorkerEnabled(enabled);
        return this;
    }

    public final com.app.watch.keeping.Cactus setCrashRestartUIEnabled(boolean enabled) {
        this.mDefaultConfig.setCrashRestartEnabled(enabled);
        return this;
    }

    public final com.app.watch.keeping.Cactus setWorkOnMainThread(boolean enabled) {
        this.mDefaultConfig.setWorkOnMainThread(enabled);
        return this;
    }

    public final com.app.watch.keeping.Cactus usePreviousConfig(boolean usePreviousConfig) {
        this.mUsePreviousConfig = usePreviousConfig;
        return this;
    }

    public final com.app.watch.keeping.Cactus isDebug(boolean isDebug) {
        this.mDefaultConfig.setDebug(isDebug);
        return this;
    }

    public final com.app.watch.keeping.Cactus addCallback(com.app.watch.keeping.callback.CactusCallback cactusCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cactusCallback, "cactusCallback");
        com.app.watch.keeping.entity.Constant.INSTANCE.getCALLBACKS$keeping_release().add(cactusCallback);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.app.watch.keeping.Cactus addCallback$default(com.app.watch.keeping.Cactus cactus, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        return cactus.addCallback(function0, function1);
    }

    public final com.app.watch.keeping.Cactus addCallback(final kotlin.jvm.functions.Function0<kotlin.Unit> stop, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> work) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(work, "work");
        com.app.watch.keeping.entity.Constant.INSTANCE.getCALLBACKS$keeping_release().add(new com.app.watch.keeping.callback.CactusCallback() { // from class: com.app.watch.keeping.Cactus$addCallback$2$1
            @Override // com.app.watch.keeping.callback.CactusCallback
            public void doWork(int times) {
                work.invoke(java.lang.Integer.valueOf(times));
            }

            @Override // com.app.watch.keeping.callback.CactusCallback
            public void onStop() {
                kotlin.jvm.functions.Function0<kotlin.Unit> function0 = stop;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        return this;
    }

    public final com.app.watch.keeping.Cactus addBackgroundCallback(com.app.watch.keeping.callback.CactusBackgroundCallback cactusBackgroundCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cactusBackgroundCallback, "cactusBackgroundCallback");
        com.app.watch.keeping.entity.Constant.INSTANCE.getBACKGROUND_CALLBACKS$keeping_release().add(cactusBackgroundCallback);
        return this;
    }

    public final com.app.watch.keeping.Cactus addBackgroundCallback(final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        com.app.watch.keeping.entity.Constant.INSTANCE.getBACKGROUND_CALLBACKS$keeping_release().add(new com.app.watch.keeping.callback.CactusBackgroundCallback() { // from class: com.app.watch.keeping.Cactus$addBackgroundCallback$2$1
            @Override // com.app.watch.keeping.callback.CactusBackgroundCallback
            public void onBackground(boolean background) {
                block.invoke(java.lang.Boolean.valueOf(background));
            }
        });
        return this;
    }

    public final void register(android.content.Context context) {
        com.app.watch.keeping.entity.CactusConfig previousConfig;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.app.watch.keeping.entity.CactusConfig cactusConfig = new com.app.watch.keeping.entity.CactusConfig(this.mNotificationConfig, this.mDefaultConfig);
        if (this.mUsePreviousConfig && (previousConfig = com.app.watch.keeping.ext.ConfigExtKt.getPreviousConfig(context)) != null) {
            cactusConfig = previousConfig;
        }
        this.mCactusConfig = cactusConfig;
        com.app.watch.keeping.ext.CactusExtKt.register(context, cactusConfig);
    }

    public final void unregister(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.app.watch.keeping.ext.CactusExtKt.unregister(context);
    }

    public final void restart(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.app.watch.keeping.ext.CactusExtKt.restart(context);
    }

    public final void updateNotification(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.mCactusConfig.setNotificationConfig(this.mNotificationConfig);
        com.app.watch.keeping.ext.CactusExtKt.updateNotification(context, this.mCactusConfig);
    }

    public final boolean isRunning(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return com.app.watch.keeping.ext.CactusExtKt.isCactusRunning(context);
    }
}
