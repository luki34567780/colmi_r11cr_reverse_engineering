package com.qcwireless.qcwatch.ui.home.gps.service;

/* compiled from: TrackingService.kt */
@kotlin.Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f*\u0001\u0018\u0018\u0000 C2\u00020\u0001:\u0003CDEB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0015H\u0002J\u0010\u00100\u001a\u00020.2\u0006\u00101\u001a\u000202H\u0003J\b\u00103\u001a\u00020\u001fH\u0002J\b\u00104\u001a\u00020.H\u0002J\b\u00105\u001a\u00020.H\u0002J\b\u00106\u001a\u00020.H\u0017J\"\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u0002082\u0006\u0010<\u001a\u000208H\u0016J\b\u0010=\u001a\u00020.H\u0002J\b\u0010>\u001a\u00020.H\u0002J\b\u0010?\u001a\u00020.H\u0002J\b\u0010@\u001a\u00020.H\u0002J\u0010\u0010A\u001a\u00020.2\u0006\u0010B\u001a\u00020\fH\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00060\u001dR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\r\"\u0004\b&\u0010\u000fR\u000e\u0010'\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/service/TrackingService;", "Landroidx/lifecycle/LifecycleService;", "()V", "am", "Landroid/app/AlarmManager;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getFusedLocationProviderClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setFusedLocationProviderClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "isFirstRun", "", "()Z", "setFirstRun", "(Z)V", "isTimeEnabled", "lapTime", "", "lastLocationTime", "lastPosition", "Landroid/location/Location;", "lastSeconTimeStamp", "locationCallback", "com/qcwireless/qcwatch/ui/home/gps/service/TrackingService$locationCallback$1", "Lcom/qcwireless/qcwatch/ui/home/gps/service/TrackingService$locationCallback$1;", "locationClient", "Lcom/amap/api/location/AMapLocationClient;", "locationListener", "Lcom/qcwireless/qcwatch/ui/home/gps/service/TrackingService$MyAMapLocationListener;", "locationOption", "Lcom/amap/api/location/AMapLocationClientOption;", "myWakeLock", "Lcom/qcwireless/qcwatch/ui/home/gps/util/MyWakeLock;", "pi", "Landroid/app/PendingIntent;", "serviceKilled", "getServiceKilled", "setServiceKilled", "timeRun", "timeRunInSeconds", "Landroidx/lifecycle/MutableLiveData;", "timeStarted", "addEmptyPolylines", "", "addPathPoints", "", "location", "createNotificationChannel", "notificationManager", "Landroid/app/NotificationManager;", "getDefaultOption", "initLocation", "killService", "onCreate", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "pauseService", "postInitialValue", "startForegroundService", "startTimer", "updateLocationTracking", "isTracking", "Companion", "Constant", "MyAMapLocationListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class TrackingService extends androidx.lifecycle.LifecycleService {
    private android.app.AlarmManager am;
    public com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    private boolean isTimeEnabled;
    private long lapTime;
    private long lastLocationTime;
    private android.location.Location lastPosition;
    private long lastSeconTimeStamp;
    private com.amap.api.location.AMapLocationClient locationClient;
    private com.amap.api.location.AMapLocationClientOption locationOption;
    private com.qcwireless.qcwatch.ui.home.gps.util.MyWakeLock myWakeLock;
    private android.app.PendingIntent pi;
    private boolean serviceKilled;
    private long timeRun;
    private long timeStarted;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Companion(null);
    private static final androidx.lifecycle.MutableLiveData<java.lang.Long> timeRunInMillis = new androidx.lifecycle.MutableLiveData<>();
    private static final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isTracking = new androidx.lifecycle.MutableLiveData<>();
    private static final androidx.lifecycle.MutableLiveData<java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon>> pathPoints = new androidx.lifecycle.MutableLiveData<>();
    private boolean isFirstRun = true;
    private final com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.MyAMapLocationListener locationListener = new com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.MyAMapLocationListener();
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> timeRunInSeconds = new androidx.lifecycle.MutableLiveData<>();
    private final com.qcwireless.qcwatch.ui.home.gps.service.TrackingService$locationCallback$1 locationCallback = new com.google.android.gms.location.LocationCallback() { // from class: com.qcwireless.qcwatch.ui.home.gps.service.TrackingService$locationCallback$1
        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(com.google.android.gms.location.LocationResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
            super.onLocationResult(result);
            java.lang.Object value = com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.INSTANCE.isTracking().getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value);
            if (((java.lang.Boolean) value).booleanValue()) {
                java.util.List<android.location.Location> locations = result.getLocations();
                com.qcwireless.qcwatch.ui.home.gps.service.TrackingService trackingService = com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.this;
                for (android.location.Location location : locations) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(location, "location");
                    trackingService.addPathPoints(location);
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "NEW LOCATION " + location.getLatitude() + ',' + location.getLongitude());
                }
            }
        }
    };

    /* renamed from: isFirstRun, reason: from getter */
    public final boolean getIsFirstRun() {
        return this.isFirstRun;
    }

    public final void setFirstRun(boolean z) {
        this.isFirstRun = z;
    }

    public final boolean getServiceKilled() {
        return this.serviceKilled;
    }

    public final void setServiceKilled(boolean z) {
        this.serviceKilled = z;
    }

    public final com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient() {
        com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = this.fusedLocationProviderClient;
        if (fusedLocationProviderClient != null) {
            return fusedLocationProviderClient;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("fusedLocationProviderClient");
        return null;
    }

    public final void setFusedLocationProviderClient(com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fusedLocationProviderClient, "<set-?>");
        this.fusedLocationProviderClient = fusedLocationProviderClient;
    }

    /* compiled from: TrackingService.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006R!\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0006R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/service/TrackingService$Companion;", "", "()V", "isTracking", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "pathPoints", "", "Lcom/qcwireless/qcwatch/ui/home/gps/bean/QcLatLon;", "Lcom/qcwireless/qcwatch/ui/home/gps/service/polyline;", "getPathPoints", "timeRunInMillis", "", "getTimeRunInMillis", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.lifecycle.MutableLiveData<java.lang.Long> getTimeRunInMillis() {
            return com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.timeRunInMillis;
        }

        public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isTracking() {
            return com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.isTracking;
        }

        public final androidx.lifecycle.MutableLiveData<java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon>> getPathPoints() {
            return com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.pathPoints;
        }
    }

    private final void postInitialValue() {
        isTracking.postValue(false);
        pathPoints.postValue(new java.util.ArrayList());
        timeRunInMillis.postValue(0L);
        this.timeRunInSeconds.postValue(0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        postInitialValue();
        android.content.Context context = (android.content.Context) this;
        setFusedLocationProviderClient(new com.google.android.gms.location.FusedLocationProviderClient(context));
        isTracking.observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.gps.service.TrackingService$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.m1021onCreate$lambda0(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.this, (java.lang.Boolean) obj);
            }
        });
        if (this.myWakeLock == null) {
            com.qcwireless.qcwatch.ui.home.gps.util.MyWakeLock myWakeLock = new com.qcwireless.qcwatch.ui.home.gps.util.MyWakeLock(context);
            this.myWakeLock = myWakeLock;
            kotlin.jvm.internal.Intrinsics.checkNotNull(myWakeLock);
            myWakeLock.acquireWakeLock();
        }
        new android.content.IntentFilter().addAction("com.kunket.locSDK.timer1");
        this.pi = android.app.PendingIntent.getBroadcast(context, 0, new android.content.Intent(), 335544320);
        java.lang.Object systemService = getSystemService("alarm");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        this.am = (android.app.AlarmManager) systemService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final void m1021onCreate$lambda0(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService trackingService, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingService, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "it");
        trackingService.updateLocationTracking(bool.booleanValue());
    }

    private final void initLocation() {
        try {
            this.locationClient = new com.amap.api.location.AMapLocationClient(getApplicationContext());
            com.amap.api.location.AMapLocationClientOption defaultOption = getDefaultOption();
            this.locationOption = defaultOption;
            com.amap.api.location.AMapLocationClient aMapLocationClient = this.locationClient;
            if (aMapLocationClient != null) {
                if (defaultOption == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("locationOption");
                    defaultOption = null;
                }
                aMapLocationClient.setLocationOption(defaultOption);
            }
            com.amap.api.location.AMapLocationClient aMapLocationClient2 = this.locationClient;
            if (aMapLocationClient2 != null) {
                aMapLocationClient2.setLocationListener(this.locationListener);
            }
            com.amap.api.location.AMapLocationClient aMapLocationClient3 = this.locationClient;
            if (aMapLocationClient3 != null) {
                aMapLocationClient3.startLocation();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    private final com.amap.api.location.AMapLocationClientOption getDefaultOption() {
        com.amap.api.location.AMapLocationClientOption aMapLocationClientOption = new com.amap.api.location.AMapLocationClientOption();
        aMapLocationClientOption.setLocationMode(com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        aMapLocationClientOption.setGpsFirst(false);
        aMapLocationClientOption.setHttpTimeOut(30000L);
        aMapLocationClientOption.setInterval(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL);
        aMapLocationClientOption.setNeedAddress(false);
        aMapLocationClientOption.setOnceLocation(false);
        aMapLocationClientOption.setOnceLocationLatest(false);
        com.amap.api.location.AMapLocationClientOption.setLocationProtocol(com.amap.api.location.AMapLocationClientOption.AMapLocationProtocol.HTTP);
        aMapLocationClientOption.setSensorEnable(false);
        aMapLocationClientOption.setWifiScan(true);
        aMapLocationClientOption.setLocationCacheEnable(true);
        aMapLocationClientOption.setGeoLanguage(com.amap.api.location.AMapLocationClientOption.GeoLanguage.DEFAULT);
        return aMapLocationClientOption;
    }

    private final void killService() {
        com.qcwireless.qcwatch.ui.home.gps.util.MyWakeLock myWakeLock = this.myWakeLock;
        if (myWakeLock != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(myWakeLock);
            myWakeLock.releaseWakeLock();
        }
        android.app.AlarmManager alarmManager = this.am;
        if (alarmManager != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(alarmManager);
            alarmManager.cancel(this.pi);
        }
        this.serviceKilled = true;
        this.isFirstRun = true;
        pauseService();
        postInitialValue();
        stopForeground(true);
        stopSelf();
    }

    public int onStartCommand(android.content.Intent intent, int flags, int startId) {
        java.lang.String action;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.Notification initBandNotification = new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
            if (initBandNotification != null) {
                startForeground(com.qcwireless.qcwatch.ui.base.util.NotificationUtils.QCNotification, initBandNotification);
            } else {
                startForeground(com.qcwireless.qcwatch.ui.base.util.NotificationUtils.QCNotification, new android.app.Notification());
            }
        }
        if (intent != null && (action = intent.getAction()) != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1023568191) {
                if (hashCode != 923148003) {
                    if (hashCode == 1729812633 && action.equals(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.ACTION_START_OR_RESUME_SERVICE)) {
                        if (this.isFirstRun) {
                            startForegroundService();
                            this.isFirstRun = false;
                        } else {
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "service  resume");
                            startTimer();
                        }
                    }
                } else if (action.equals(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.ACTION_PAUSE_SERVICE)) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "service pause");
                    pauseService();
                }
            } else if (action.equals(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.ACTION_STOP_SERVICE)) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "service stop");
                killService();
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    private final void startTimer() {
        addEmptyPolylines();
        isTracking.postValue(true);
        this.timeStarted = java.lang.System.currentTimeMillis();
        this.isTimeEnabled = true;
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain()), (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.gps.service.TrackingService$startTimer$1(this, null), 3, (java.lang.Object) null);
    }

    private final void pauseService() {
        isTracking.postValue(false);
        this.isTimeEnabled = false;
    }

    private final void updateLocationTracking(boolean isTracking2) {
        if (isTracking2) {
            com.google.android.gms.location.LocationRequest locationRequest = new com.google.android.gms.location.LocationRequest();
            locationRequest.setInterval(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.LOCATION_UPDATE_INTERVAL);
            locationRequest.setFastestInterval(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL);
            locationRequest.setPriority(100);
            if (com.qcwireless.qc_utils.date.LanguageUtil.isChina()) {
                initLocation();
                return;
            } else {
                getFusedLocationProviderClient().requestLocationUpdates(locationRequest, this.locationCallback, android.os.Looper.getMainLooper());
                return;
            }
        }
        if (com.qcwireless.qc_utils.date.LanguageUtil.isChina()) {
            com.amap.api.location.AMapLocationClient aMapLocationClient = this.locationClient;
            if (aMapLocationClient == null || aMapLocationClient == null) {
                return;
            }
            aMapLocationClient.stopLocation();
            return;
        }
        getFusedLocationProviderClient().removeLocationUpdates(this.locationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addPathPoints(android.location.Location location) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.lastLocationTime;
        if (!com.qcwireless.qc_utils.date.LanguageUtil.isChina() && this.lastLocationTime > 0) {
            android.location.Location location2 = this.lastPosition;
            if (location2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("lastPosition");
                location2 = null;
            }
            float f = currentTimeMillis / 1000.0f;
            if (location2.distanceTo(location) / f > 5.5d) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("-------漂移");
                android.location.Location location3 = this.lastPosition;
                if (location3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("lastPosition");
                    location3 = null;
                }
                sb.append(location3.distanceTo(location) / f);
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, sb.toString());
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append("-------1漂移");
                android.location.Location location4 = this.lastPosition;
                if (location4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("lastPosition");
                    location4 = null;
                }
                sb2.append(location4.distanceTo(location) / f);
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(sb2.toString(), 0, 1, null);
                return;
            }
        }
        this.lastLocationTime = java.lang.System.currentTimeMillis();
        this.lastPosition = location;
        if (com.qcwireless.qc_utils.date.LanguageUtil.isChina()) {
            com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon qcLatLon = new com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon(location.getLatitude(), location.getLongitude(), 99.0d, location.getSpeed());
            androidx.lifecycle.MutableLiveData<java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon>> mutableLiveData = pathPoints;
            java.util.List list = (java.util.List) mutableLiveData.getValue();
            if (list != null) {
                list.add(qcLatLon);
                mutableLiveData.postValue(list);
            }
        } else {
            com.qcwireless.qcwatch.ui.home.gps.bean.Gps transform2 = com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.transform2(location.getLatitude(), location.getLongitude());
            com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon qcLatLon2 = new com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon(transform2.getWgLat(), transform2.getWgLon(), 99.0d, location.getSpeed());
            androidx.lifecycle.MutableLiveData<java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon>> mutableLiveData2 = pathPoints;
            java.util.List list2 = (java.util.List) mutableLiveData2.getValue();
            if (list2 != null) {
                list2.add(qcLatLon2);
                mutableLiveData2.postValue(list2);
            }
        }
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.DeviceGpsDataEvent(pathPoints));
    }

    private final java.lang.Object addEmptyPolylines() {
        androidx.lifecycle.MutableLiveData<java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon>> mutableLiveData = pathPoints;
        java.util.List list = (java.util.List) mutableLiveData.getValue();
        if (list != null) {
            mutableLiveData.postValue(list);
        } else {
            list = null;
        }
        if (list != null) {
            return list;
        }
        mutableLiveData.postValue(new java.util.ArrayList());
        return kotlin.Unit.INSTANCE;
    }

    private final void startForegroundService() {
        startTimer();
        isTracking.postValue(true);
        java.lang.Object systemService = getSystemService("notification");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            createNotificationChannel(notificationManager);
        }
        this.timeRunInSeconds.observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.gps.service.TrackingService$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.m1022startForegroundService$lambda7(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.this, (java.lang.Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: startForegroundService$lambda-7, reason: not valid java name */
    public static final void m1022startForegroundService$lambda7(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService trackingService, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingService, "this$0");
        if (trackingService.serviceKilled) {
            return;
        }
        new com.qcwireless.qcwatch.ui.base.util.NotificationUtils((android.content.Context) trackingService).initBandNotification();
    }

    private final void createNotificationChannel(android.app.NotificationManager notificationManager) {
        notificationManager.createNotificationChannel(new android.app.NotificationChannel(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.NOTIFICATION_CHANNEL_ID, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.NOTIFICATION_CHANNEL_NAME, 2));
    }

    /* compiled from: TrackingService.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/service/TrackingService$MyAMapLocationListener;", "Lcom/amap/api/location/AMapLocationListener;", "(Lcom/qcwireless/qcwatch/ui/home/gps/service/TrackingService;)V", "onLocationChanged", "", "amapLocation", "Lcom/amap/api/location/AMapLocation;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyAMapLocationListener implements com.amap.api.location.AMapLocationListener {
        public MyAMapLocationListener() {
        }

        public void onLocationChanged(com.amap.api.location.AMapLocation amapLocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amapLocation, "amapLocation");
            if (amapLocation.getLatitude() == 0.0d) {
                if (amapLocation.getLongitude() == 0.0d) {
                    return;
                }
            }
            com.amap.api.maps.model.LatLng latLng = new com.amap.api.maps.model.LatLng(amapLocation.getLatitude(), amapLocation.getLongitude());
            java.lang.Object value = com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.INSTANCE.isTracking().getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value);
            if (((java.lang.Boolean) value).booleanValue()) {
                com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.this.addPathPoints((android.location.Location) amapLocation);
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "NEW LOCATION " + latLng.latitude + ',' + latLng.longitude);
            }
        }
    }

    /* compiled from: TrackingService.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/service/TrackingService$Constant;", "", "()V", com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.ACTION_PAUSE_SERVICE, "", com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.ACTION_SHOW_TRACKING_FRAGMENT, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.ACTION_START_OR_RESUME_SERVICE, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.ACTION_STOP_SERVICE, "FASTEST_UPDATE_INTERVAL", "", "LOCATION_UPDATE_INTERVAL", "MAP_ZOOM", "", "MAP_ZOOM_SMALL", "NOTIFICATION_CHANNEL_ID", "NOTIFICATION_CHANNEL_NAME", "POLYLINE_WIDTH", "REQUEST_CODE_LOCATION", "", "RUNNING_DATABSE_NAME", "UPDATE_TIME_INTERVAL", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Constant {
        public static final java.lang.String ACTION_PAUSE_SERVICE = "ACTION_PAUSE_SERVICE";
        public static final java.lang.String ACTION_SHOW_TRACKING_FRAGMENT = "ACTION_SHOW_TRACKING_FRAGMENT";
        public static final java.lang.String ACTION_START_OR_RESUME_SERVICE = "ACTION_START_OR_RESUME_SERVICE";
        public static final java.lang.String ACTION_STOP_SERVICE = "ACTION_STOP_SERVICE";
        public static final long FASTEST_UPDATE_INTERVAL = 2000;
        public static final com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant INSTANCE = new com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant();
        public static final long LOCATION_UPDATE_INTERVAL = 5000;
        public static final float MAP_ZOOM = 18.0f;
        public static final float MAP_ZOOM_SMALL = 16.0f;
        public static final java.lang.String NOTIFICATION_CHANNEL_ID = "tracking_channel";
        public static final java.lang.String NOTIFICATION_CHANNEL_NAME = "Tracking";
        public static final float POLYLINE_WIDTH = 10.0f;
        public static final int REQUEST_CODE_LOCATION = 0;
        public static final java.lang.String RUNNING_DATABSE_NAME = "running_db";
        public static final long UPDATE_TIME_INTERVAL = 1000;

        private Constant() {
        }
    }
}
