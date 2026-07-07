package com.qcwireless.qcwatch;

/* compiled from: QCApplication.kt */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 J2\u00020\u0001:\u0001JB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0014J\b\u00102\u001a\u00020/H\u0002J\b\u00103\u001a\u00020/H\u0002J\u0010\u00104\u001a\u00020/2\b\u00105\u001a\u0004\u0018\u000106J\b\u00107\u001a\u00020/H\u0002J\b\u00108\u001a\u00020/H\u0002J\b\u00109\u001a\u00020/H\u0002J\b\u0010:\u001a\u00020/H\u0002J\b\u0010;\u001a\u00020/H\u0002J\b\u0010<\u001a\u00020/H\u0002J\b\u0010=\u001a\u00020/H\u0002J\b\u0010>\u001a\u00020/H\u0002J\b\u0010?\u001a\u00020/H\u0002J\u000e\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u000201J\b\u0010B\u001a\u00020/H\u0016J\u0006\u0010#\u001a\u00020/J\b\u0010C\u001a\u00020\u0004H\u0002J\u0010\u0010D\u001a\u00020/2\u0006\u0010A\u001a\u000201H\u0002J\u000e\u0010E\u001a\u00020/2\u0006\u0010A\u001a\u000201J\u0016\u0010F\u001a\u00020/2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020I0HH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006K"}, d2 = {"Lcom/qcwireless/qcwatch/QCApplication;", "Landroidx/multidex/MultiDexApplication;", "()V", "chinaServer", "", "getChinaServer", "()Z", "setChinaServer", "(Z)V", "downloadWatchFace", "getDownloadWatchFace", "setDownloadWatchFace", "findPhoneRspIOdmOpResponse", "Lcom/oudmon/ble/base/communication/ICommandResponse;", "Lcom/oudmon/ble/base/communication/rsp/FindPhoneRsp;", "handler", "Landroid/os/Handler;", "mLocationClient", "Lcom/amap/api/location/AMapLocationClient;", "getMLocationClient", "()Lcom/amap/api/location/AMapLocationClient;", "setMLocationClient", "(Lcom/amap/api/location/AMapLocationClient;)V", "mLocationListener", "Lcom/amap/api/location/AMapLocationListener;", "mediaRunnable", "Ljava/lang/Runnable;", "mediaUtil", "Lcom/qcwireless/qcwatch/ui/base/util/MediaUtil;", "option", "Lcom/amap/api/location/AMapLocationClientOption;", "getOption", "()Lcom/amap/api/location/AMapLocationClientOption;", "setOption", "(Lcom/amap/api/location/AMapLocationClientOption;)V", "pingHwServer", "getPingHwServer", "setPingHwServer", "qcLifeCycle", "Lcom/qcwireless/qcwatch/base/lifecycle/QcLifeCycle;", "updating", "", "getUpdating", "()I", "setUpdating", "(I)V", "attachBaseContext", "", "base", "Landroid/content/Context;", "doCacheWeatherToDevice", "getLocationFromAndroid", "getLocationOnce", "application", "Landroid/app/Application;", "init", "initFindPhone", "initKeepAlive", "initLog", "initOkDownLoad", "initRTKSPP", "initReceiver", "initService", "initSkin", "isNotificationServiceRunning", "context", "onCreate", "shouldInit", "toggleNotificationService", "trySetupNotifyService", "weatherToDevice", "data", "", "Lcom/qcwireless/qcwatch/ui/base/bean/response/weather/WeatherResp;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class QCApplication extends androidx.multidex.MultiDexApplication {
    private static android.app.Application application;
    private boolean downloadWatchFace;
    private com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.FindPhoneRsp> findPhoneRspIOdmOpResponse;
    private final android.os.Handler handler;
    private com.amap.api.location.AMapLocationClient mLocationClient;
    private com.amap.api.location.AMapLocationListener mLocationListener;
    private java.lang.Runnable mediaRunnable;
    private com.qcwireless.qcwatch.ui.base.util.MediaUtil mediaUtil;
    private int updating;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.QCApplication.Companion INSTANCE = new com.qcwireless.qcwatch.QCApplication.Companion(null);
    private static final kotlin.properties.ReadWriteProperty<java.lang.Object, android.content.Context> CONTEXT$delegate = kotlin.properties.Delegates.INSTANCE.notNull();
    private static final kotlin.Lazy<com.qcwireless.qcwatch.QCApplication> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.QCApplication>() { // from class: com.qcwireless.qcwatch.QCApplication$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.QCApplication m117invoke() {
            return new com.qcwireless.qcwatch.QCApplication();
        }
    });
    private final com.qcwireless.qcwatch.base.lifecycle.QcLifeCycle qcLifeCycle = new com.qcwireless.qcwatch.base.lifecycle.QcLifeCycle();
    private com.amap.api.location.AMapLocationClientOption option = new com.amap.api.location.AMapLocationClientOption();
    private boolean pingHwServer = true;
    private boolean chinaServer = true;

    public final void getLocationOnce(android.app.Application application2) {
    }

    public QCApplication() {
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.QCApplication$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
        this.findPhoneRspIOdmOpResponse = new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.QCApplication$$ExternalSyntheticLambda1
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.QCApplication.m113findPhoneRspIOdmOpResponse$lambda0(com.qcwireless.qcwatch.QCApplication.this, (com.oudmon.ble.base.communication.rsp.FindPhoneRsp) baseRspCmd);
            }
        };
        this.mediaRunnable = new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.QCApplication$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.QCApplication.m115mediaRunnable$lambda1(com.qcwireless.qcwatch.QCApplication.this);
            }
        };
        this.mLocationListener = new com.amap.api.location.AMapLocationListener() { // from class: com.qcwireless.qcwatch.QCApplication$$ExternalSyntheticLambda0
            public final void onLocationChanged(com.amap.api.location.AMapLocation aMapLocation) {
                com.qcwireless.qcwatch.QCApplication.m114mLocationListener$lambda2(com.qcwireless.qcwatch.QCApplication.this, aMapLocation);
            }
        };
    }

    public final com.amap.api.location.AMapLocationClient getMLocationClient() {
        return this.mLocationClient;
    }

    public final void setMLocationClient(com.amap.api.location.AMapLocationClient aMapLocationClient) {
        this.mLocationClient = aMapLocationClient;
    }

    public final com.amap.api.location.AMapLocationClientOption getOption() {
        return this.option;
    }

    public final void setOption(com.amap.api.location.AMapLocationClientOption aMapLocationClientOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aMapLocationClientOption, "<set-?>");
        this.option = aMapLocationClientOption;
    }

    public final int getUpdating() {
        return this.updating;
    }

    public final void setUpdating(int i) {
        this.updating = i;
    }

    public final boolean getDownloadWatchFace() {
        return this.downloadWatchFace;
    }

    public final void setDownloadWatchFace(boolean z) {
        this.downloadWatchFace = z;
    }

    public final boolean getPingHwServer() {
        return this.pingHwServer;
    }

    public final void setPingHwServer(boolean z) {
        this.pingHwServer = z;
    }

    public final boolean getChinaServer() {
        return this.chinaServer;
    }

    public final void setChinaServer(boolean z) {
        this.chinaServer = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate() {
        super.onCreate();
        application = (android.app.Application) this;
        if (shouldInit()) {
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "多进程拦截");
            initSkin();
            init();
            initReceiver();
            initLog();
            initService();
            initKeepAlive();
            initOkDownLoad();
            initFindPhone();
            initRTKSPP();
            pingHwServer();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRTKSPP() {
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().initRTKSPP((android.app.Application) this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initFindPhone() {
        this.mediaUtil = new com.qcwireless.qcwatch.ui.base.util.MediaUtil((android.app.Application) this);
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().addNotifyListener(34, this.findPhoneRspIOdmOpResponse);
    }

    public final void pingHwServer() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.QCApplication, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.QCApplication$pingHwServer$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.QCApplication) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.QCApplication qCApplication) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qCApplication, "$this$ktxRunOnBgSingle");
                boolean isOnline = com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isOnline();
                if (isOnline) {
                    qCApplication.setPingHwServer(com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isHwOnline());
                    qCApplication.setChinaServer(com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isChinaOnline());
                }
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "百度结果:" + isOnline + "海外服务器结果:" + qCApplication.getPingHwServer() + "国内服务器:" + qCApplication.getChinaServer());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: findPhoneRspIOdmOpResponse$lambda-0, reason: not valid java name */
    public static final void m113findPhoneRspIOdmOpResponse$lambda0(com.qcwireless.qcwatch.QCApplication qCApplication, com.oudmon.ble.base.communication.rsp.FindPhoneRsp findPhoneRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qCApplication, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, findPhoneRsp);
        if (findPhoneRsp != null) {
            try {
                if (findPhoneRsp.getSwitchStatue() == 1) {
                    try {
                        qCApplication.handler.removeCallbacks(qCApplication.mediaRunnable);
                        qCApplication.handler.postDelayed(qCApplication.mediaRunnable, 10000L);
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                    com.qcwireless.qcwatch.ui.base.util.MediaUtil mediaUtil = qCApplication.mediaUtil;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(mediaUtil);
                    mediaUtil.vibrateAndPlayTone();
                    return;
                }
                if (findPhoneRsp.getSwitchStatue() == 2) {
                    com.qcwireless.qcwatch.ui.base.util.MediaUtil mediaUtil2 = qCApplication.mediaUtil;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(mediaUtil2);
                    mediaUtil2.stopRing();
                    qCApplication.handler.removeCallbacks(qCApplication.mediaRunnable);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mediaRunnable$lambda-1, reason: not valid java name */
    public static final void m115mediaRunnable$lambda1(com.qcwireless.qcwatch.QCApplication qCApplication) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qCApplication, "this$0");
        com.qcwireless.qcwatch.ui.base.util.MediaUtil mediaUtil = qCApplication.mediaUtil;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mediaUtil);
        mediaUtil.stopRing();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initOkDownLoad() {
        com.liulishuo.okdownload.OkDownload.setSingletonInstance(new com.liulishuo.okdownload.OkDownload.Builder((android.content.Context) this).processFileStrategy(new com.liulishuo.okdownload.core.file.CustomProcessFileStrategy()).build());
        com.liulishuo.okdownload.OkDownloadProvider.context = INSTANCE.getCONTEXT();
        com.liulishuo.okdownload.core.dispatcher.DownloadDispatcher.setMaxParallelRunningCount(10);
    }

    private final boolean shouldInit() {
        java.lang.Object systemService = getSystemService("activity");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
        java.lang.String packageName = getPackageName();
        int myPid = android.os.Process.myPid();
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid && kotlin.jvm.internal.Intrinsics.areEqual(packageName, runningAppProcessInfo.processName)) {
                com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "my.pid -> " + myPid + ",mainProcessName -> " + packageName);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initReceiver() {
        android.app.Application application2 = (android.app.Application) this;
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance(application2);
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setApplication(application2);
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().init();
        android.content.IntentFilter deviceIntentFilter = com.oudmon.ble.base.bluetooth.BleAction.getDeviceIntentFilter();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceIntentFilter, "getDeviceIntentFilter()");
        registerReceiver(new com.qcwireless.qcwatch.ui.base.receiver.BluetoothReceiver(), deviceIntentFilter);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        registerReceiver(new com.qcwireless.qcwatch.ui.base.receiver.SystemLocaleChangeReceiver(), intentFilter);
        android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(new com.qcwireless.qcwatch.ui.base.receiver.NetWorkStateReceiver(), intentFilter2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void init() {
        com.qcwireless.qcwatch.QJavaApplication.getInstance().setApplication((android.app.Application) this);
        android.content.Context context = (android.content.Context) this;
        com.qcwireless.qcwatch.base.pref.PreUtil.init(context);
        com.amap.api.location.AMapLocationClient.updatePrivacyShow(context, true, true);
        com.amap.api.location.AMapLocationClient.updatePrivacyAgree(context, true);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance(context);
        registerActivityLifecycleCallbacks(this.qcLifeCycle);
        org.koin.core.context.GlobalContextKt.startKoin(new kotlin.jvm.functions.Function1<org.koin.core.KoinApplication, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.QCApplication$init$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((org.koin.core.KoinApplication) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(org.koin.core.KoinApplication koinApplication) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(koinApplication, "$this$startKoin");
                com.qcwireless.qcwatch.QCApplication.Companion companion = com.qcwireless.qcwatch.QCApplication.INSTANCE;
                android.content.Context applicationContext = com.qcwireless.qcwatch.QCApplication.this.getApplicationContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                companion.setCONTEXT(applicationContext);
                org.koin.android.ext.koin.KoinExtKt.androidContext(koinApplication, (android.content.Context) com.qcwireless.qcwatch.QCApplication.this);
                koinApplication.modules(com.qcwireless.qcwatch.base.di.KoinModuleKt.getAppModule());
            }
        });
        android.content.IntentFilter intentFilter = com.oudmon.ble.base.bluetooth.BleAction.getIntentFilter();
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(INSTANCE.getCONTEXT()).registerReceiver(new com.qcwireless.qcwatch.ui.base.receiver.MyBluetoothReceiver(), intentFilter);
        trySetupNotifyService(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initLog() {
        com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.deleteOverdueFile(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication().getExternalFilesDir("") + "/log");
        android.content.Context context = (android.content.Context) this;
        com.iwown.awlog.impl.LogConfigImpl.getInstance().configLogSwitch(true).configGlobalLabelPrefix("qcwx").configMethodOffset(0).configJsonFormat(new com.qcwireless.qcwatch.base.log.LogJsonParseImpl()).configFileEngine(new com.iwown.awlog.file.LogFileEngineFactory(context)).configShowBorders(true);
        com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "MyApplication");
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getIsDebug()) {
            com.iwown.awlog.impl.LogConfigImpl.getInstance().configLogLevel(1);
            com.oudmon.ble.base.util.LogToFile.getInstance().debug = true;
        } else {
            com.iwown.awlog.impl.LogConfigImpl.getInstance().configLogLevel(5);
            com.oudmon.ble.base.util.LogToFile.getInstance().debug = false;
        }
        com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().setmContext(context);
        com.oudmon.ble.base.util.LogToFile.getInstance().initPath((android.app.Application) this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initSkin() {
        android.app.Application application2 = (android.app.Application) this;
        skin.support.SkinCompatManager.withoutActivity(application2).addInflater(new skin.support.app.SkinAppCompatViewInflater()).addInflater(new skin.support.design.app.SkinMaterialViewInflater()).addInflater(new skin.support.constraint.app.SkinConstraintViewInflater()).addInflater(new skin.support.app.SkinCardViewInflater()).loadSkin();
        skin.support.content.res.SkinCompatResources.getInstance().setApplication(application2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initService() {
        android.content.Context context = (android.content.Context) this;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService.class);
        try {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                startForegroundService(intent);
            } else {
                startService(intent);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            android.content.Intent intent2 = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.base.service.XService.class);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                startForegroundService(intent2);
            } else {
                startService(intent2);
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        android.content.Intent intent3 = new android.content.Intent(context, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.base.service.YService.class);
        try {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                startForegroundService(intent3);
            } else {
                startService(intent3);
            }
        } catch (java.lang.Exception e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initKeepAlive() {
        com.app.watch.keeping.ext.CactusExtKt.cactus((android.content.Context) this, new kotlin.jvm.functions.Function1<com.app.watch.keeping.Cactus, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.QCApplication$initKeepAlive$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.app.watch.keeping.Cactus) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.app.watch.keeping.Cactus cactus) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cactus, "$this$cactus");
                android.app.Notification initBandNotification = new com.qcwireless.qcwatch.ui.base.util.NotificationUtils((android.content.Context) com.qcwireless.qcwatch.QCApplication.this).initBandNotification();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(initBandNotification, "NotificationUtils(this@Q…n).initBandNotification()");
                cactus.setNotification(initBandNotification);
                cactus.isDebug(false);
                cactus.setBackgroundMusicEnabled(false);
                cactus.setCrashRestartUIEnabled(false);
                cactus.hideNotification(true);
                cactus.hideNotificationAfterO(true);
                cactus.setWorkerEnabled(true);
            }
        });
    }

    public final void trySetupNotifyService(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        toggleNotificationService(context);
    }

    private final void toggleNotificationService(android.content.Context context) {
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            packageManager.setComponentEnabledSetting(new android.content.ComponentName(context, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.push.service.MyNotificationService.class), 2, 1);
            packageManager.setComponentEnabledSetting(new android.content.ComponentName(context, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.push.service.MyNotificationService.class), 1, 1);
        } catch (java.lang.RuntimeException e) {
            e.printStackTrace();
        }
    }

    public final boolean isNotificationServiceRunning(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            java.lang.Object systemService = context.getSystemService("activity");
            if (systemService == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            java.util.Iterator<android.app.ActivityManager.RunningServiceInfo> it = ((android.app.ActivityManager) systemService).getRunningServices(com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER).iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(com.qcwireless.qcwatch.ui.device.push.service.MyNotificationService.class.getName(), it.next().service.getClassName())) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void attachBaseContext(android.content.Context base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(base);
        androidx.multidex.MultiDex.install((android.content.Context) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mLocationListener$lambda-2, reason: not valid java name */
    public static final void m114mLocationListener$lambda2(com.qcwireless.qcwatch.QCApplication qCApplication, com.amap.api.location.AMapLocation aMapLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qCApplication, "this$0");
        if (aMapLocation != null) {
            if (aMapLocation.getErrorCode() != 0) {
                qCApplication.getLocationFromAndroid();
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGpsLocationTime(0L);
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                qCApplication.doCacheWeatherToDevice();
                com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "--------location Error, ErrCode:" + aMapLocation.getErrorCode() + aMapLocation.getErrorInfo());
                return;
            }
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, aMapLocation.toStr());
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "-----------" + aMapLocation.getLatitude() + "---" + aMapLocation.getLongitude() + "---" + aMapLocation.getCity());
            try {
                java.lang.String oneKeySupport = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getOneKeySupport();
                if (oneKeySupport.length() > 0) {
                    com.squareup.moshi.JsonAdapter adapter = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport>() { // from class: com.qcwireless.qcwatch.QCApplication$mLocationListener$lambda-2$$inlined$fromJson$1
                    }.getType());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
                    com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport oneKeySupport2 = (com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport) adapter.fromJson(oneKeySupport);
                    if (oneKeySupport2 != null && oneKeySupport2.getSupportLocation()) {
                        java.lang.String address = aMapLocation.getAddress();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(address, "name");
                        byte[] bytes = address.getBytes(kotlin.text.Charsets.UTF_8);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                        if (bytes.length > 100) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(address, "name");
                            address = com.qcwireless.qcwatch.base.utils.MetricUtilsKt.getWholeText(address, 98);
                        }
                        java.lang.String str = address;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "name");
                        if (str.length() > 0) {
                            com.oudmon.ble.base.communication.LargeDataHandler.getInstance().writeLocation(aMapLocation.getLongitude(), aMapLocation.getLatitude(), str);
                        }
                    }
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            java.lang.String city = aMapLocation.getCity();
            try {
                java.lang.String str2 = city;
                if (str2 == null || str2.length() == 0) {
                    city = com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.getAddress(INSTANCE.getCONTEXT(), aMapLocation.getLatitude(), aMapLocation.getLongitude())[1];
                }
            } catch (java.lang.Exception unused) {
            }
            float longitude = (float) aMapLocation.getLongitude();
            float latitude = (float) aMapLocation.getLatitude();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(city, "city");
            java.lang.String address2 = aMapLocation.getAddress();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(address2, "aMapLocation.address");
            com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.INSTANCE.getGetInstance().saveDeviceLocation(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), new com.qcwireless.qcwatch.ui.base.bean.weather.MyLocationBean(longitude, latitude, "en", city, address2));
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getWeatherLastTime() >= new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp()) {
                qCApplication.doCacheWeatherToDevice();
                return;
            }
            float longitude2 = (float) aMapLocation.getLongitude();
            float latitude2 = (float) aMapLocation.getLatitude();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(city, "city");
            kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.QCApplication$mLocationListener$1$1(qCApplication, new com.qcwireless.qcwatch.ui.base.bean.request.weather.WeatherRequest(longitude2, latitude2, "en", city), null), 3, (java.lang.Object) null);
        }
    }

    private final void doCacheWeatherToDevice() {
        java.lang.String weatherInfo = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getWeatherInfo();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, weatherInfo);
        if (weatherInfo.length() > 0) {
            com.qcwireless.qcwatch.base.utils.MoshiUtils moshiUtils = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE;
            java.lang.reflect.ParameterizedType newParameterizedType = com.squareup.moshi.Types.newParameterizedType(java.util.List.class, new java.lang.reflect.Type[]{com.qcwireless.qcwatch.ui.base.bean.response.weather.WeatherResp.class});
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newParameterizedType, "newParameterizedType(Mut…lass.java, T::class.java)");
            java.util.ArrayList arrayList = (java.util.List) moshiUtils.fromJson(weatherInfo, newParameterizedType);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            weatherToDevice(arrayList);
            return;
        }
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.QCApplication$doCacheWeatherToDevice$1(this, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void weatherToDevice(java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.weather.WeatherResp> data) {
        int i = this.updating;
        if (i == 2 || i == 1 || i == 3 || i == 4) {
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "正在固件升级,不发天气");
            return;
        }
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getWeatherToDeviceLastTime() < new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp()) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "同步天气");
                int i2 = 0;
                for (com.qcwireless.qcwatch.ui.base.bean.response.weather.WeatherResp weatherResp : data) {
                    int i3 = i2 + 1;
                    if (weatherResp.getDigitType() == 0) {
                        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setWeatherLastTime(0);
                        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setWeatherToDeviceLastTime(0);
                        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setWeatherInfo("");
                        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                    } else {
                        com.oudmon.ble.base.communication.req.WeatherForecastReq.WeatherForecastBuilder takeUmbrella = new com.oudmon.ble.base.communication.req.WeatherForecastReq.WeatherForecastBuilder().setIndex(i2).setTimeStamp(weatherResp.getTimeStamp()).setWeatherType(weatherResp.getDigitType()).setMinDegree(weatherResp.getLowTemp()).setMaxDegree(weatherResp.getHighTemp()).setHumidity(weatherResp.getHumidity()).setTakeUmbrella(weatherResp.isBringUmbrella());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(takeUmbrella, "WeatherForecastBuilder()…la(value.isBringUmbrella)");
                        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.WeatherForecastReq.getWriteInstance(takeUmbrella), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.QCApplication$$ExternalSyntheticLambda2
                            @Override // com.oudmon.ble.base.communication.ICommandResponse
                            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                                com.qcwireless.qcwatch.QCApplication.m116weatherToDevice$lambda3((com.oudmon.ble.base.communication.rsp.WeatherForecastRsp) baseRspCmd);
                            }
                        });
                    }
                    i2 = i3;
                }
                return;
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "天气同步时间限制");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: weatherToDevice$lambda-3, reason: not valid java name */
    public static final void m116weatherToDevice$lambda3(com.oudmon.ble.base.communication.rsp.WeatherForecastRsp weatherForecastRsp) {
        if (weatherForecastRsp.getStatus() == 0) {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setWeatherLastTime(((int) new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp()) + 900);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setWeatherToDeviceLastTime(((int) new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp()) + 300);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        }
    }

    private final void getLocationFromAndroid() {
        java.lang.Object systemService = com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication().getSystemService("location");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        android.location.LocationManager locationManager = (android.location.LocationManager) systemService;
        android.location.Criteria criteria = new android.location.Criteria();
        criteria.setAccuracy(2);
        criteria.setAltitudeRequired(false);
        criteria.setBearingRequired(false);
        criteria.setCostAllowed(true);
        criteria.setPowerRequirement(1);
        java.lang.String bestProvider = locationManager.getBestProvider(criteria, true);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "Location Provider is " + bestProvider);
        if (bestProvider != null) {
            try {
                android.location.Location lastKnownLocation = locationManager.getLastKnownLocation(bestProvider);
                if (lastKnownLocation != null) {
                    com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.INSTANCE.getGetInstance().saveDeviceLocation(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), new com.qcwireless.qcwatch.ui.base.bean.weather.MyLocationBean((float) lastKnownLocation.getLongitude(), (float) lastKnownLocation.getLatitude(), "en", "", ""));
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* compiled from: QCApplication.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u0004\u0018\u00010\rR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/QCApplication$Companion;", "", "()V", "<set-?>", "Landroid/content/Context;", "CONTEXT", "getCONTEXT", "()Landroid/content/Context;", "setCONTEXT", "(Landroid/content/Context;)V", "CONTEXT$delegate", "Lkotlin/properties/ReadWriteProperty;", "application", "Landroid/app/Application;", "getInstance", "Lcom/qcwireless/qcwatch/QCApplication;", "getGetInstance", "()Lcom/qcwireless/qcwatch/QCApplication;", "getInstance$delegate", "Lkotlin/Lazy;", "getApplication", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] $$delegatedProperties = {(kotlin.reflect.KProperty) kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.qcwireless.qcwatch.QCApplication.Companion.class, "CONTEXT", "getCONTEXT()Landroid/content/Context;", 0))};

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final android.content.Context getCONTEXT() {
            return (android.content.Context) com.qcwireless.qcwatch.QCApplication.CONTEXT$delegate.getValue(this, $$delegatedProperties[0]);
        }

        public final void setCONTEXT(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<set-?>");
            com.qcwireless.qcwatch.QCApplication.CONTEXT$delegate.setValue(this, $$delegatedProperties[0], context);
        }

        public final android.app.Application getApplication() {
            if (com.qcwireless.qcwatch.QCApplication.application != null) {
                return com.qcwireless.qcwatch.QCApplication.application;
            }
            throw new java.lang.RuntimeException("Not support calling this, before create app or after terminate app.");
        }

        public final com.qcwireless.qcwatch.QCApplication getGetInstance() {
            return (com.qcwireless.qcwatch.QCApplication) com.qcwireless.qcwatch.QCApplication.getInstance$delegate.getValue();
        }
    }
}
