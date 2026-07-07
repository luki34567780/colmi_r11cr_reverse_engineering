package com.qcwireless.qcwatch.ui.home.gps;

/* compiled from: GpsRunActivity.kt */
@kotlin.Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0016\u0018\u0000 b2\u00020\u00012\u00020\u0002:\u0002abB\u0005¢\u0006\u0002\u0010\u0003J\b\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u000208H\u0002J\b\u0010:\u001a\u000208H\u0002J\b\u0010;\u001a\u000208H\u0002J\b\u0010<\u001a\u000208H\u0002J\b\u0010=\u001a\u000208H\u0016J\u0012\u0010>\u001a\u0002082\b\u0010?\u001a\u0004\u0018\u00010@H\u0014J\b\u0010A\u001a\u000208H\u0015J\u0010\u0010B\u001a\u0002082\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010C\u001a\u0002082\u0006\u0010D\u001a\u00020EH\u0016J+\u0010F\u001a\u0002082\u0006\u0010G\u001a\u00020H2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010L\u001a\u00020MH\u0016¢\u0006\u0002\u0010NJ\b\u0010O\u001a\u000208H\u0014J\u0010\u0010P\u001a\u0002082\u0006\u0010Q\u001a\u00020@H\u0014J\u0010\u0010R\u001a\u0002082\u0006\u0010S\u001a\u00020KH\u0002J\u000e\u0010T\u001a\u0002082\u0006\u0010U\u001a\u00020HJ\b\u0010V\u001a\u000208H\u0015J\u0006\u0010W\u001a\u000208J\b\u0010X\u001a\u000208H\u0002J\b\u0010Y\u001a\u000208H\u0002J\b\u0010Z\u001a\u000208H\u0002J\b\u0010[\u001a\u000208H\u0002J\b\u0010\\\u001a\u000208H\u0002J\b\u0010]\u001a\u000208H\u0002J\b\u0010^\u001a\u000208H\u0002J\u0010\u0010_\u001a\u0002082\u0006\u0010!\u001a\u00020\u0018H\u0002J\b\u0010`\u001a\u000208H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00101\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b3\u00104¨\u0006c"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GpsRunActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityGpsRunBinding;", "calorieTotal", "", "getCalorieTotal", "()F", "setCalorieTotal", "(F)V", "cameraPosition", "Lcom/google/android/gms/maps/model/CameraPosition;", "currentTimeInMiliis", "", "defaultLocation", "Lcom/google/android/gms/maps/model/LatLng;", "df", "Ljava/text/DecimalFormat;", "distanceInMeters", "getDistanceInMeters", "setDistanceInMeters", "firstLocation", "", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "gnss", "Landroid/location/GnssStatus$Callback;", "gpsResponse", "Lcom/oudmon/ble/base/communication/ICommandResponse;", "Lcom/oudmon/ble/base/communication/rsp/AppGpsRsp;", "gpsStart", "isTracking", "lastKnownLocation", "Landroid/location/Location;", "locationPermissionGranted", "map", "Lcom/google/android/gms/maps/GoogleMap;", "marker", "Lcom/google/android/gms/maps/model/Marker;", "pathPoint", "", "Lcom/qcwireless/qcwatch/ui/home/gps/bean/QcLatLon;", "startAnim", "Landroid/view/animation/TranslateAnimation;", "startTime", "timer", "Ljava/util/Timer;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/gps/vm/GPSRunActivityViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/gps/vm/GPSRunActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "endViewAnim", "", "getDeviceLocation", "getLocationPermission", "initGPSListener", "moveCameraToUser", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMapReady", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSaveInstanceState", "outState", "sendCommandToService", "action", "setGpsStatues", "number", "setupViews", "showGpsEnd", "showGpsExitDialog", "startViewAnim", "stopGps", "stopRun", "subscribeToObservers", "syncDistance", "toggleRun", "upDateTracking", "updateLocationUI", "Callback", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GpsRunActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity implements com.google.android.gms.maps.OnMapReadyCallback {
    private static final int DEFAULT_ZOOM = 15;
    private static final java.lang.String KEY_CAMERA_POSITION = "camera_position";
    private static final java.lang.String KEY_LOCATION = "location";
    private static final int M_MAX_ENTRIES = 5;
    private static final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;
    private com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding binding;
    private float calorieTotal;
    private com.google.android.gms.maps.model.CameraPosition cameraPosition;
    private long currentTimeInMiliis;
    private java.text.DecimalFormat df;
    private float distanceInMeters;
    private boolean firstLocation;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    private boolean isTracking;
    private android.location.Location lastKnownLocation;
    private boolean locationPermissionGranted;
    private com.google.android.gms.maps.GoogleMap map;
    private com.google.android.gms.maps.model.Marker marker;
    private android.view.animation.TranslateAnimation startAnim;
    private long startTime;
    private java.util.Timer timer;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private android.location.GnssStatus.Callback gnss = new com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.Callback();
    private boolean gpsStart = true;
    private final com.google.android.gms.maps.model.LatLng defaultLocation = new com.google.android.gms.maps.model.LatLng(-33.8523341d, 151.2106085d);
    private java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon> pathPoint = new java.util.ArrayList();
    private com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.AppGpsRsp> gpsResponse = new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$$ExternalSyntheticLambda8
        @Override // com.oudmon.ble.base.communication.ICommandResponse
        public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
            com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.m1003gpsResponse$lambda14(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this, (com.oudmon.ble.base.communication.rsp.AppGpsRsp) baseRspCmd);
        }
    };

    public GpsRunActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel m1013invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel.class), qualifier, qualifier);
            }
        });
    }

    public final float getDistanceInMeters() {
        return this.distanceInMeters;
    }

    public final void setDistanceInMeters(float f) {
        this.distanceInMeters = f;
    }

    public final float getCalorieTotal() {
        return this.calorieTotal;
    }

    public final void setCalorieTotal(float f) {
        this.calorieTotal = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel) this.viewModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding inflate = com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (savedInstanceState != null) {
            this.lastKnownLocation = (android.location.Location) savedInstanceState.getParcelable(KEY_LOCATION);
            this.cameraPosition = (com.google.android.gms.maps.model.CameraPosition) savedInstanceState.getParcelable(KEY_CAMERA_POSITION);
        }
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding = this.binding;
        if (activityGpsRunBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding = null;
        }
        android.view.View root = activityGpsRunBinding.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        setContentView(root);
        com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient((android.app.Activity) this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(this)");
        this.fusedLocationProviderClient = fusedLocationProviderClient;
        com.google.android.gms.maps.SupportMapFragment supportMapFragment = (com.google.android.gms.maps.SupportMapFragment) getSupportFragmentManager().findFragmentById(com.qcwireless.qcwatch.R.id.map);
        if (supportMapFragment != null) {
            supportMapFragment.getMapAsync(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        initGPSListener();
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.00", new java.text.DecimalFormatSymbols(java.util.Locale.US));
        this.df = decimalFormat;
        decimalFormat.setRoundingMode(java.math.RoundingMode.HALF_UP);
        if (this.binding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        setStatusBarNoBackground();
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding = this.binding;
        if (activityGpsRunBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding = null;
        }
        activityGpsRunBinding.imageStop.setListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.m1005setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUiDelay(this, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$setupViews$2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity) {
                com.oudmon.ble.base.communication.ICommandResponse iCommandResponse;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRunActivity, "$this$ktxRunOnUiDelay");
                com.oudmon.ble.base.communication.CommandHandle commandHandle = com.oudmon.ble.base.communication.CommandHandle.getInstance();
                com.oudmon.ble.base.communication.req.PhoneGpsReq gpsStatus = com.oudmon.ble.base.communication.req.PhoneGpsReq.getGpsStatus((byte) 6);
                iCommandResponse = gpsRunActivity.gpsResponse;
                commandHandle.executeReqCmd(gpsStatus, iCommandResponse);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding2 = this.binding;
        if (activityGpsRunBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding2 = null;
        }
        activityGpsRunBinding2.imageEnd.setListener(new com.qcwireless.qcwatch.ui.base.view.gps.GpsEndView.GpsEndListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$$ExternalSyntheticLambda10
            @Override // com.qcwireless.qcwatch.ui.base.view.gps.GpsEndView.GpsEndListener
            public final void gpsEnd() {
                com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.m1006setupViews$lambda2(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding3 = this.binding;
        if (activityGpsRunBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding3 = null;
        }
        activityGpsRunBinding3.imageStop.setEndListener(new com.qcwireless.qcwatch.ui.base.view.gps.LockView.EndListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$$ExternalSyntheticLambda1
            @Override // com.qcwireless.qcwatch.ui.base.view.gps.LockView.EndListener
            public final void onEnd() {
                com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.m1007setupViews$lambda3(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this);
            }
        });
        android.view.View[] viewArr = new android.view.View[4];
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding4 = this.binding;
        if (activityGpsRunBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding4 = null;
        }
        viewArr[0] = activityGpsRunBinding4.imageBack;
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding5 = this.binding;
        if (activityGpsRunBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding5 = null;
        }
        viewArr[1] = activityGpsRunBinding5.imageContinue;
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding6 = this.binding;
        if (activityGpsRunBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding6 = null;
        }
        viewArr[2] = activityGpsRunBinding6.imageScreenLock;
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding7 = this.binding;
        if (activityGpsRunBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding7 = null;
        }
        viewArr[3] = activityGpsRunBinding7.viewTopOfLayout;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$setupViews$5
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding8;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding9;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding10;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding11;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding12;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding13;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding14;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding15;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding16;
                com.oudmon.ble.base.communication.ICommandResponse iCommandResponse;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding17;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding18;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityGpsRunBinding8 = com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.binding;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding19 = null;
                if (activityGpsRunBinding8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunBinding8 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityGpsRunBinding8.imageBack)) {
                    com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.showGpsExitDialog();
                    return;
                }
                activityGpsRunBinding9 = com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.binding;
                if (activityGpsRunBinding9 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunBinding9 = null;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityGpsRunBinding9.imageContinue)) {
                    activityGpsRunBinding10 = com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.binding;
                    if (activityGpsRunBinding10 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityGpsRunBinding10 = null;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityGpsRunBinding10.imageScreenLock)) {
                        activityGpsRunBinding12 = com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.binding;
                        if (activityGpsRunBinding12 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityGpsRunBinding12 = null;
                        }
                        activityGpsRunBinding12.imageStop.setLock(true);
                        activityGpsRunBinding13 = com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.binding;
                        if (activityGpsRunBinding13 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityGpsRunBinding13 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunBinding13.tvLabelUnlock);
                        activityGpsRunBinding14 = com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.binding;
                        if (activityGpsRunBinding14 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityGpsRunBinding14 = null;
                        }
                        activityGpsRunBinding14.imageStop.flipAnimator(1);
                        activityGpsRunBinding15 = com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.binding;
                        if (activityGpsRunBinding15 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityGpsRunBinding15 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunBinding15.imageScreenLock);
                        activityGpsRunBinding16 = com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.binding;
                        if (activityGpsRunBinding16 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityGpsRunBinding19 = activityGpsRunBinding16;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunBinding19.viewTopOfLayout);
                        return;
                    }
                    activityGpsRunBinding11 = com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.binding;
                    if (activityGpsRunBinding11 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityGpsRunBinding19 = activityGpsRunBinding11;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityGpsRunBinding19.viewTopOfLayout)) {
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "---click--");
                        return;
                    }
                    return;
                }
                com.oudmon.ble.base.communication.CommandHandle commandHandle = com.oudmon.ble.base.communication.CommandHandle.getInstance();
                com.oudmon.ble.base.communication.req.PhoneGpsReq gpsStatus = com.oudmon.ble.base.communication.req.PhoneGpsReq.getGpsStatus((byte) 3);
                iCommandResponse = com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.gpsResponse;
                commandHandle.executeReqCmd(gpsStatus, iCommandResponse);
                activityGpsRunBinding17 = com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.binding;
                if (activityGpsRunBinding17 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunBinding17 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunBinding17.tvLabelEnd);
                activityGpsRunBinding18 = com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.binding;
                if (activityGpsRunBinding18 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityGpsRunBinding19 = activityGpsRunBinding18;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunBinding19.imageScreenLock);
                com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.startViewAnim();
                com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.isTracking = false;
                com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.toggleRun();
            }
        });
        android.content.Context context = (android.content.Context) this;
        if (androidx.core.app.ActivityCompat.checkSelfPermission(context, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION) != 0) {
            return;
        }
        android.location.LocationManager locationManager = com.qcwireless.qcwatch.base.ktx.SystemServiceExtKt.getLocationManager(context);
        if (locationManager != null) {
            locationManager.registerGnssStatusCallback(this.gnss, (android.os.Handler) null);
        }
        toggleRun();
        subscribeToObservers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1$lambda-0, reason: not valid java name */
    public static final void m1005setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRunActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding = gpsRunActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding2 = null;
        if (activityGpsRunBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding = null;
        }
        activityGpsRunBinding.imageStop.setVisibility(4);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding3 = gpsRunActivity.binding;
        if (activityGpsRunBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding3 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunBinding3.imageContinue);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding4 = gpsRunActivity.binding;
        if (activityGpsRunBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding4 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunBinding4.imageEnd);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding5 = gpsRunActivity.binding;
        if (activityGpsRunBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding5 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunBinding5.imageScreenLock);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding6 = gpsRunActivity.binding;
        if (activityGpsRunBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGpsRunBinding2 = activityGpsRunBinding6;
        }
        activityGpsRunBinding2.imageStop.setEnabled(false);
        gpsRunActivity.isTracking = true;
        gpsRunActivity.toggleRun();
        gpsRunActivity.endViewAnim();
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PhoneGpsReq.getGpsStatus((byte) 2), gpsRunActivity.gpsResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m1006setupViews$lambda2(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRunActivity, "this$0");
        long j = 1000;
        if ((gpsRunActivity.currentTimeInMiliis / j) / 60 < 1) {
            gpsRunActivity.showGpsExitDialog();
        } else {
            if (gpsRunActivity.startTime == 0) {
                gpsRunActivity.startTime = (java.lang.System.currentTimeMillis() - gpsRunActivity.currentTimeInMiliis) / j;
            }
            try {
                if (((int) gpsRunActivity.distanceInMeters) == 0) {
                    float calculatePolyLineLength = com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.calculatePolyLineLength(gpsRunActivity.pathPoint);
                    gpsRunActivity.distanceInMeters = calculatePolyLineLength;
                    gpsRunActivity.calorieTotal = (30 * calculatePolyLineLength) / 1000;
                }
            } catch (java.lang.Exception unused) {
            }
            long j2 = gpsRunActivity.startTime;
            int i = (int) gpsRunActivity.currentTimeInMiliis;
            float f = gpsRunActivity.distanceInMeters;
            float f2 = gpsRunActivity.calorieTotal;
            java.lang.String json = com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(gpsRunActivity.pathPoint);
            java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
            gpsRunActivity.getViewModel().saveGpsDetail(new com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail(j2, i, f, f2, json, y_m_d, com.qcwireless.qcwatch.QJavaApplication.getInstance().getGpsType()));
            gpsRunActivity.stopRun();
        }
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PhoneGpsReq.getGpsStatus((byte) 4), gpsRunActivity.gpsResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3, reason: not valid java name */
    public static final void m1007setupViews$lambda3(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRunActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding = gpsRunActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding2 = null;
        if (activityGpsRunBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding = null;
        }
        activityGpsRunBinding.imageStop.setLock(false);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding3 = gpsRunActivity.binding;
        if (activityGpsRunBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding3 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunBinding3.tvLabelUnlock);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding4 = gpsRunActivity.binding;
        if (activityGpsRunBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding4 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunBinding4.imageScreenLock);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding5 = gpsRunActivity.binding;
        if (activityGpsRunBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGpsRunBinding2 = activityGpsRunBinding5;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunBinding2.viewTopOfLayout);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding = this.binding;
            if (activityGpsRunBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityGpsRunBinding = null;
            }
            activityGpsRunBinding.gpsHeart.setItemTitle("00");
        }
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().addNotifyListener(30, new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$$ExternalSyntheticLambda9
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.m1004onResume$lambda4(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this, (com.oudmon.ble.base.communication.rsp.RealTimeHeartRateRsp) baseRspCmd);
            }
        });
        try {
            if (((int) this.distanceInMeters) == 0) {
                float calculatePolyLineLength = com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.calculatePolyLineLength(this.pathPoint);
                this.distanceInMeters = calculatePolyLineLength;
                this.calorieTotal = (30 * calculatePolyLineLength) / 1000;
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(com.oudmon.ble.base.communication.req.PhoneGpsReq.setPhoneDataReq((int) (this.distanceInMeters * 100), (int) (this.calorieTotal * 1000)));
        } catch (java.lang.Exception unused2) {
        }
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            syncDistance();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onResume$lambda-4, reason: not valid java name */
    public static final void m1004onResume$lambda4(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity, final com.oudmon.ble.base.communication.rsp.RealTimeHeartRateRsp realTimeHeartRateRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRunActivity, "this$0");
        if (realTimeHeartRateRsp == null || realTimeHeartRateRsp.getHeart() <= 0) {
            return;
        }
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(gpsRunActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$onResume$1$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity2) {
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRunActivity2, "$this$ktxRunOnUi");
                activityGpsRunBinding = gpsRunActivity2.binding;
                if (activityGpsRunBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunBinding = null;
                }
                activityGpsRunBinding.gpsHeart.setItemTitle(java.lang.String.valueOf(com.oudmon.ble.base.communication.rsp.RealTimeHeartRateRsp.this.getHeart()));
            }
        });
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
        com.google.android.gms.maps.GoogleMap googleMap = this.map;
        if (googleMap != null) {
            outState.putParcelable(KEY_CAMERA_POSITION, googleMap.getCameraPosition());
            outState.putParcelable(KEY_LOCATION, this.lastKnownLocation);
        }
        super.onSaveInstanceState(outState);
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public void onMapReady(com.google.android.gms.maps.GoogleMap map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
        getLocationPermission();
        updateLocationUI();
        getDeviceLocation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getDeviceLocation() {
        try {
            if (this.locationPermissionGranted) {
                com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = this.fusedLocationProviderClient;
                if (fusedLocationProviderClient == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("fusedLocationProviderClient");
                    fusedLocationProviderClient = null;
                }
                com.google.android.gms.tasks.Task<android.location.Location> lastLocation = fusedLocationProviderClient.getLastLocation();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lastLocation, "fusedLocationProviderClient.lastLocation");
                lastLocation.addOnCompleteListener((android.app.Activity) this, new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$$ExternalSyntheticLambda7
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(com.google.android.gms.tasks.Task task) {
                        com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.m1002getDeviceLocation$lambda6(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this, task);
                    }
                });
            }
        } catch (java.lang.SecurityException e) {
            android.util.Log.e("Exception: %s", e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getDeviceLocation$lambda-6, reason: not valid java name */
    public static final void m1002getDeviceLocation$lambda6(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity, com.google.android.gms.tasks.Task task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRunActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            android.location.Location location = (android.location.Location) task.getResult();
            gpsRunActivity.lastKnownLocation = location;
            if (location != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(location);
                double latitude = location.getLatitude();
                android.location.Location location2 = gpsRunActivity.lastKnownLocation;
                kotlin.jvm.internal.Intrinsics.checkNotNull(location2);
                com.qcwireless.qcwatch.ui.home.gps.bean.Gps transform2 = com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.transform2(latitude, location2.getLongitude());
                com.google.android.gms.maps.GoogleMap googleMap = gpsRunActivity.map;
                if (googleMap != null) {
                    googleMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(new com.google.android.gms.maps.model.LatLng(transform2.getWgLat(), transform2.getWgLon()), 15.0f));
                    return;
                }
                return;
            }
            return;
        }
        android.util.Log.d(gpsRunActivity.getTAG(), "Current location is null. Using defaults.");
        android.util.Log.e(gpsRunActivity.getTAG(), "Exception: %s", task.getException());
        com.google.android.gms.maps.GoogleMap googleMap2 = gpsRunActivity.map;
        if (googleMap2 != null) {
            googleMap2.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(gpsRunActivity.defaultLocation, 15.0f));
        }
        com.google.android.gms.maps.GoogleMap googleMap3 = gpsRunActivity.map;
        com.google.android.gms.maps.UiSettings uiSettings = googleMap3 != null ? googleMap3.getUiSettings() : null;
        if (uiSettings == null) {
            return;
        }
        uiSettings.setMyLocationButtonEnabled(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getLocationPermission() {
        if (androidx.core.content.ContextCompat.checkSelfPermission(getApplicationContext(), com.hjq.permissions.Permission.ACCESS_FINE_LOCATION) == 0) {
            this.locationPermissionGranted = true;
        } else {
            androidx.core.app.ActivityCompat.requestPermissions((android.app.Activity) this, new java.lang.String[]{com.hjq.permissions.Permission.ACCESS_FINE_LOCATION}, 1);
        }
    }

    public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        this.locationPermissionGranted = false;
        if (requestCode == 1) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                this.locationPermissionGranted = true;
            }
        }
        updateLocationUI();
    }

    private final void updateLocationUI() {
        com.google.android.gms.maps.GoogleMap googleMap = this.map;
        if (googleMap == null) {
            return;
        }
        if (googleMap != null) {
            try {
                googleMap.setMyLocationEnabled(false);
            } catch (java.lang.SecurityException e) {
                android.util.Log.e("Exception: %s", e.getMessage(), e);
                return;
            }
        }
        com.google.android.gms.maps.GoogleMap googleMap2 = this.map;
        com.google.android.gms.maps.UiSettings uiSettings = googleMap2 != null ? googleMap2.getUiSettings() : null;
        if (uiSettings != null) {
            uiSettings.setMyLocationButtonEnabled(false);
        }
        if (this.locationPermissionGranted) {
            return;
        }
        this.lastKnownLocation = null;
        getLocationPermission();
    }

    /* compiled from: GpsRunActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GpsRunActivity$Callback;", "Landroid/location/GnssStatus$Callback;", "(Lcom/qcwireless/qcwatch/ui/home/gps/GpsRunActivity;)V", "onFirstFix", "", "ttffMillis", "", "onSatelliteStatusChanged", "status", "Landroid/location/GnssStatus;", "onStarted", "onStopped", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class Callback extends android.location.GnssStatus.Callback {
        public Callback() {
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            super.onStarted();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            super.onStopped();
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int ttffMillis) {
            super.onFirstFix(ttffMillis);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
            super.onSatelliteStatusChanged(status);
            com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.setGpsStatues(status.getSatelliteCount());
        }
    }

    public final void setGpsStatues(int number) {
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding = null;
        if (number <= 0) {
            com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding2 = this.binding;
            if (activityGpsRunBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGpsRunBinding = activityGpsRunBinding2;
            }
            activityGpsRunBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_1);
            return;
        }
        if (number <= 2) {
            com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding3 = this.binding;
            if (activityGpsRunBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGpsRunBinding = activityGpsRunBinding3;
            }
            activityGpsRunBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_2);
            return;
        }
        if (number <= 5) {
            com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding4 = this.binding;
            if (activityGpsRunBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGpsRunBinding = activityGpsRunBinding4;
            }
            activityGpsRunBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_3);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding5 = this.binding;
        if (activityGpsRunBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGpsRunBinding = activityGpsRunBinding5;
        }
        activityGpsRunBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        try {
            java.util.Timer timer = this.timer;
            if (timer != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(timer);
                timer.cancel();
            }
            com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().removeNotifyListener(30);
            this.gnss.onStopped();
            android.location.LocationManager locationManager = com.qcwireless.qcwatch.base.ktx.SystemServiceExtKt.getLocationManager((android.content.Context) this);
            kotlin.jvm.internal.Intrinsics.checkNotNull(locationManager);
            locationManager.unregisterGnssStatusCallback(this.gnss);
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endViewAnim() {
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding2 = null;
        if (activityGpsRunBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding = null;
        }
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(activityGpsRunBinding.imageStop.getMeasuredWidth(), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(300L);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding3 = this.binding;
        if (activityGpsRunBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding3 = null;
        }
        activityGpsRunBinding3.imageEnd.startAnimation(translateAnimation);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding4 = this.binding;
        if (activityGpsRunBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding4 = null;
        }
        android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(-activityGpsRunBinding4.imageStop.getMeasuredWidth(), 0.0f, 0.0f, 0.0f);
        translateAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$endViewAnim$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation animation) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation animation) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation animation) {
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding5;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
                activityGpsRunBinding5 = com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.binding;
                if (activityGpsRunBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunBinding5 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunBinding5.tvLabelEnd);
            }
        });
        translateAnimation2.setDuration(300L);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding5 = this.binding;
        if (activityGpsRunBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGpsRunBinding2 = activityGpsRunBinding5;
        }
        activityGpsRunBinding2.imageContinue.startAnimation(translateAnimation2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startViewAnim() {
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding2 = null;
        if (activityGpsRunBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding = null;
        }
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, activityGpsRunBinding.imageStop.getMeasuredWidth(), 0.0f, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$startViewAnim$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation animation) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation animation) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation animation) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
        if (this.startAnim == null) {
            com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding3 = this.binding;
            if (activityGpsRunBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityGpsRunBinding3 = null;
            }
            android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(0.0f, -activityGpsRunBinding3.imageStop.getMeasuredWidth(), 0.0f, 0.0f);
            this.startAnim = translateAnimation2;
            kotlin.jvm.internal.Intrinsics.checkNotNull(translateAnimation2);
            translateAnimation2.setDuration(300L);
            android.view.animation.TranslateAnimation translateAnimation3 = this.startAnim;
            kotlin.jvm.internal.Intrinsics.checkNotNull(translateAnimation3);
            translateAnimation3.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$startViewAnim$2
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(android.view.animation.Animation animation) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(android.view.animation.Animation animation) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(android.view.animation.Animation animation) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
                    com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.showGpsEnd();
                }
            });
        }
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding4 = this.binding;
        if (activityGpsRunBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding4 = null;
        }
        activityGpsRunBinding4.imageEnd.startAnimation(translateAnimation);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding5 = this.binding;
        if (activityGpsRunBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGpsRunBinding2 = activityGpsRunBinding5;
        }
        activityGpsRunBinding2.imageContinue.startAnimation(this.startAnim);
    }

    public final void showGpsEnd() {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "showGpsEnd");
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding2 = null;
        if (activityGpsRunBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunBinding.imageEnd);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding3 = this.binding;
        if (activityGpsRunBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding3 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunBinding3.imageContinue);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding4 = this.binding;
        if (activityGpsRunBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding4 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunBinding4.imageStop);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding5 = this.binding;
        if (activityGpsRunBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGpsRunBinding2 = activityGpsRunBinding5;
        }
        activityGpsRunBinding2.imageStop.setEnabled(true);
    }

    private final void subscribeToObservers() {
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.INSTANCE.isTracking().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$$ExternalSyntheticLambda4
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.m1011subscribeToObservers$lambda7(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this, (java.lang.Boolean) obj);
            }
        });
        com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.INSTANCE.getPathPoints().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$$ExternalSyntheticLambda6
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.m1012subscribeToObservers$lambda9(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this, (java.util.List) obj);
            }
        });
        com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.INSTANCE.getTimeRunInMillis().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$$ExternalSyntheticLambda5
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.m1010subscribeToObservers$lambda10(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this, (java.lang.Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: subscribeToObservers$lambda-7, reason: not valid java name */
    public static final void m1011subscribeToObservers$lambda7(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRunActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "it");
        gpsRunActivity.upDateTracking(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: subscribeToObservers$lambda-9, reason: not valid java name */
    public static final void m1012subscribeToObservers$lambda9(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRunActivity, "this$0");
        new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "it");
        gpsRunActivity.pathPoint = list;
        gpsRunActivity.moveCameraToUser();
        gpsRunActivity.distanceInMeters = com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.calculatePolyLineLength(list);
        if (!gpsRunActivity.firstLocation && gpsRunActivity.pathPoint.size() > 0) {
            com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.first(gpsRunActivity.pathPoint)).getLatitude(), ((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.first(gpsRunActivity.pathPoint)).getLongitude());
            com.google.android.gms.maps.GoogleMap googleMap = gpsRunActivity.map;
            if (googleMap != null) {
                googleMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(latLng).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(com.qcwireless.qcwatch.R.mipmap.gps_start_mark)).anchor(0.5f, 0.5f));
            }
            gpsRunActivity.firstLocation = true;
        }
        float f = 30;
        float f2 = 1000;
        float f3 = (gpsRunActivity.distanceInMeters * f) / f2;
        gpsRunActivity.calorieTotal = f3;
        try {
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding = gpsRunActivity.binding;
                if (activityGpsRunBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunBinding = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView = activityGpsRunBinding.gpsDistance;
                java.text.DecimalFormat decimalFormat = gpsRunActivity.df;
                if (decimalFormat == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("df");
                    decimalFormat = null;
                }
                java.lang.String format = decimalFormat.format(java.lang.Float.valueOf((gpsRunActivity.distanceInMeters * 1.0f) / f2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "df.format(distanceInMeters * 1.0f / 1000)");
                qSportItemView.setItemTitle(format);
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding2 = gpsRunActivity.binding;
                if (activityGpsRunBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunBinding2 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView2 = activityGpsRunBinding2.gpsDistance;
                java.lang.String string = gpsRunActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_88);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_88)");
                qSportItemView2.setItemUnit(string);
            } else {
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding3 = gpsRunActivity.binding;
                if (activityGpsRunBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunBinding3 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView3 = activityGpsRunBinding3.gpsDistance;
                java.text.DecimalFormat decimalFormat2 = gpsRunActivity.df;
                if (decimalFormat2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("df");
                    decimalFormat2 = null;
                }
                java.lang.String format2 = decimalFormat2.format(java.lang.Float.valueOf(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kmToIn((gpsRunActivity.distanceInMeters * 1.0f) / f2)));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "df.format(kmToIn(distanceInMeters * 1.0f / 1000))");
                qSportItemView3.setItemTitle(format2);
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding4 = gpsRunActivity.binding;
                if (activityGpsRunBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunBinding4 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView4 = activityGpsRunBinding4.gpsDistance;
                java.lang.String string2 = gpsRunActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_358);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_358)");
                qSportItemView4.setItemUnit(string2);
            }
        } catch (java.lang.Exception unused) {
        }
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding5 = gpsRunActivity.binding;
        if (activityGpsRunBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding5 = null;
        }
        activityGpsRunBinding5.gpsCalorie.setItemTitle(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(f3)));
        if (((int) gpsRunActivity.distanceInMeters) == 0) {
            float calculatePolyLineLength = com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.calculatePolyLineLength(gpsRunActivity.pathPoint);
            gpsRunActivity.distanceInMeters = calculatePolyLineLength;
            gpsRunActivity.calorieTotal = (f * calculatePolyLineLength) / f2;
        }
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(com.oudmon.ble.base.communication.req.PhoneGpsReq.setPhoneDataReq((int) (gpsRunActivity.distanceInMeters * 100), kotlin.math.MathKt.roundToInt(gpsRunActivity.calorieTotal * f2)));
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, gpsRunActivity.currentTimeInMiliis + "----" + gpsRunActivity.distanceInMeters);
        float f4 = ((float) gpsRunActivity.currentTimeInMiliis) / gpsRunActivity.distanceInMeters;
        if (f4 > 5999.0f) {
            com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding6 = gpsRunActivity.binding;
            if (activityGpsRunBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityGpsRunBinding6 = null;
            }
            activityGpsRunBinding6.gpsPace.setItemTitle("--");
            f4 = 5999.0f;
        } else {
            com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding7 = gpsRunActivity.binding;
            if (activityGpsRunBinding7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityGpsRunBinding7 = null;
            }
            com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView5 = activityGpsRunBinding7.gpsPace;
            java.lang.String dayMinToStrSymbol = com.qcwireless.qc_utils.date.DateUtil.dayMinToStrSymbol((int) f4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dayMinToStrSymbol, "dayMinToStrSymbol(fStr.toInt())");
            qSportItemView5.setItemTitle(dayMinToStrSymbol);
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(gpsRunActivity.pathPoint.size()));
        if (gpsRunActivity.pathPoint.size() > 0) {
            double d = f4;
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Double.valueOf(d));
            ((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.last(gpsRunActivity.pathPoint)).setPace(d);
        }
        if (!(!gpsRunActivity.pathPoint.isEmpty()) || gpsRunActivity.pathPoint.size() <= 2) {
            return;
        }
        com.google.android.gms.maps.model.PolylineOptions jointType = new com.google.android.gms.maps.model.PolylineOptions().width(10.0f).jointType(2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jointType, "PolylineOptions()\n      …ointType(JointType.ROUND)");
        for (com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon qcLatLon : gpsRunActivity.pathPoint) {
            jointType.add(new com.google.android.gms.maps.model.LatLng(qcLatLon.getLatitude(), qcLatLon.getLongitude()));
            jointType.addSpan(new com.google.android.gms.maps.model.StyleSpan(com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.getPaceColor(qcLatLon.getSpeed())));
        }
        com.google.android.gms.maps.GoogleMap googleMap2 = gpsRunActivity.map;
        if (googleMap2 != null) {
            googleMap2.addPolyline(jointType);
        }
        com.google.android.gms.maps.model.Marker marker = gpsRunActivity.marker;
        if (marker != null && marker != null) {
            marker.remove();
        }
        com.google.android.gms.maps.GoogleMap googleMap3 = gpsRunActivity.map;
        gpsRunActivity.marker = googleMap3 != null ? googleMap3.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(new com.google.android.gms.maps.model.LatLng(((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.last(gpsRunActivity.pathPoint)).getLatitude(), ((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.last(gpsRunActivity.pathPoint)).getLongitude())).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(com.qcwireless.qcwatch.R.mipmap.gps_mark)).anchor(0.5f, 0.5f)) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: subscribeToObservers$lambda-10, reason: not valid java name */
    public static final void m1010subscribeToObservers$lambda10(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRunActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l, "it");
        long longValue = l.longValue();
        gpsRunActivity.currentTimeInMiliis = longValue;
        if (longValue == 0 && gpsRunActivity.gpsStart) {
            gpsRunActivity.gpsStart = false;
        }
        java.lang.String formattedStopWatchTIme = com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.getFormattedStopWatchTIme(longValue, false);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding = gpsRunActivity.binding;
        if (activityGpsRunBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding = null;
        }
        activityGpsRunBinding.gpsTimes.setItemTitle(formattedStopWatchTIme);
    }

    private final void upDateTracking(boolean isTracking) {
        this.isTracking = isTracking;
        if (!isTracking) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "start");
        } else {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "stop");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleRun() {
        if (this.isTracking) {
            sendCommandToService(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.ACTION_PAUSE_SERVICE);
        } else {
            sendCommandToService(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.ACTION_START_OR_RESUME_SERVICE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void stopRun() {
        sendCommandToService(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.ACTION_STOP_SERVICE);
        finish();
        android.app.Activity activity = (android.app.Activity) this;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.gps.GpsHistoryActivity.class);
        for (kotlin.Pair pair : arrayList) {
            if (pair != null) {
                java.lang.String str = (java.lang.String) pair.getFirst();
                java.lang.Object second = pair.getSecond();
                if (second instanceof java.lang.Integer) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Byte) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Character) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Short) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Boolean) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Long) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Float) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Double) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.String) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                } else if (second instanceof java.lang.CharSequence) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                } else if (second instanceof android.os.Parcelable) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                } else if (second instanceof java.lang.Object[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                } else if (second instanceof java.util.ArrayList) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                } else if (second instanceof java.io.Serializable) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                } else if (second instanceof boolean[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                } else if (second instanceof byte[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                } else if (second instanceof short[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                } else if (second instanceof char[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                } else if (second instanceof int[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                } else if (second instanceof long[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                } else if (second instanceof float[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                } else if (second instanceof double[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                } else if (second instanceof android.os.Bundle) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                } else if (second instanceof android.content.Intent) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                } else {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        }
        activity.startActivity(intent);
    }

    private final void moveCameraToUser() {
        com.google.android.gms.maps.GoogleMap googleMap;
        if ((!this.pathPoint.isEmpty()) && (!this.pathPoint.isEmpty()) && (googleMap = this.map) != null) {
            googleMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(new com.google.android.gms.maps.model.LatLng(((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.last(this.pathPoint)).getLatitude(), ((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.last(this.pathPoint)).getLongitude()), 18.0f));
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) {
            if (((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect()) {
                return;
            }
            com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding = this.binding;
            if (activityGpsRunBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityGpsRunBinding = null;
            }
            activityGpsRunBinding.gpsHeart.setItemTitle("00");
            return;
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.DeviceGpsEvent) {
            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$onMessageEvent$1
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity) {
                        java.util.List list;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRunActivity, "$this$ktxRunOnBgSingle");
                        try {
                            if (((int) gpsRunActivity.getDistanceInMeters()) == 0) {
                                list = gpsRunActivity.pathPoint;
                                gpsRunActivity.setDistanceInMeters(com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.calculatePolyLineLength(list));
                                gpsRunActivity.setCalorieTotal((30 * gpsRunActivity.getDistanceInMeters()) / 1000);
                            }
                        } catch (java.lang.Exception unused) {
                        }
                        try {
                            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(com.oudmon.ble.base.communication.req.PhoneGpsReq.setPhoneDataReq((int) (gpsRunActivity.getDistanceInMeters() * 100), (int) (gpsRunActivity.getCalorieTotal() * 1000)));
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                });
            }
        } else {
            if (messageEvent instanceof com.qcwireless.qcwatch.base.event.DeviceGpsDataEvent) {
                try {
                    java.lang.Object value = ((com.qcwireless.qcwatch.base.event.DeviceGpsDataEvent) messageEvent).getData().getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(value);
                    this.pathPoint = (java.util.List) value;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$onMessageEvent$2
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity) {
                            java.util.List list;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRunActivity, "$this$ktxRunOnBgSingle");
                            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                                try {
                                    list = gpsRunActivity.pathPoint;
                                    gpsRunActivity.setDistanceInMeters(com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.calculatePolyLineLength(list));
                                    gpsRunActivity.setCalorieTotal((30 * gpsRunActivity.getDistanceInMeters()) / 1000);
                                } catch (java.lang.Exception unused) {
                                }
                                try {
                                    com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(com.oudmon.ble.base.communication.req.PhoneGpsReq.setPhoneDataReq((int) (gpsRunActivity.getDistanceInMeters() * 100), (int) (gpsRunActivity.getCalorieTotal() * 1000)));
                                } catch (java.lang.Exception unused2) {
                                }
                            }
                        }
                    });
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            }
            if (messageEvent instanceof com.qcwireless.qcwatch.base.event.DeviceGpsTimeEvent) {
                this.currentTimeInMiliis = ((com.qcwireless.qcwatch.base.event.DeviceGpsTimeEvent) messageEvent).getTime();
            }
        }
    }

    public void onBackPressed() {
        com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding = this.binding;
        if (activityGpsRunBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunBinding = null;
        }
        if (activityGpsRunBinding.imageStop.isLock()) {
            java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_277);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_277)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return;
        }
        showGpsExitDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void sendCommandToService(java.lang.String action) {
        android.content.Intent intent = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.class);
        intent.setAction(action);
        startService(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showGpsExitDialog() {
        java.lang.String string;
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        if ((this.currentTimeInMiliis / 1000) / 60 < 1) {
            booleanRef.element = false;
            string = getString(com.qcwireless.qcwatch.R.string.qc_text_278);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_278)");
        } else {
            booleanRef.element = true;
            string = getString(com.qcwireless.qcwatch.R.string.qc_text_279);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_279)");
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_gps_exit);
        objectRef.element = builder.create();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).show();
        android.view.View contentView = ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        ((android.widget.TextView) contentView.findViewById(2131297477)).setText(string);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.m1008showGpsExitDialog$lambda12(objectRef, view);
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.m1009showGpsExitDialog$lambda13(booleanRef, this, objectRef, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGpsExitDialog$lambda-12, reason: not valid java name */
    public static final void m1008showGpsExitDialog$lambda12(kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGpsExitDialog$lambda-13, reason: not valid java name */
    public static final void m1009showGpsExitDialog$lambda13(kotlin.jvm.internal.Ref.BooleanRef booleanRef, com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity, kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(booleanRef, "$exitSave");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRunActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        if (booleanRef.element) {
            if (gpsRunActivity.startTime == 0) {
                gpsRunActivity.startTime = (java.lang.System.currentTimeMillis() - gpsRunActivity.currentTimeInMiliis) / 1000;
            }
            try {
                if (((int) gpsRunActivity.distanceInMeters) == 0) {
                    float calculatePolyLineLength = com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.calculatePolyLineLength(gpsRunActivity.pathPoint);
                    gpsRunActivity.distanceInMeters = calculatePolyLineLength;
                    gpsRunActivity.calorieTotal = (30 * calculatePolyLineLength) / 1000;
                }
            } catch (java.lang.Exception unused) {
            }
            long j = gpsRunActivity.startTime;
            int i = (int) gpsRunActivity.currentTimeInMiliis;
            float f = gpsRunActivity.distanceInMeters;
            float f2 = gpsRunActivity.calorieTotal;
            java.lang.String json = com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(gpsRunActivity.pathPoint);
            java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
            gpsRunActivity.getViewModel().saveGpsDetail(new com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail(j, i, f, f2, json, y_m_d, com.qcwireless.qcwatch.QJavaApplication.getInstance().getGpsType()));
        }
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PhoneGpsReq.getGpsStatus((byte) 4), gpsRunActivity.gpsResponse);
        gpsRunActivity.stopRun();
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.ui.base.bean.event.HealthItemRefreshEvent());
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    private final void initGPSListener() {
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PhoneGpsReq.getGpsStatus((byte) 3), this.gpsResponse);
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().addNotifyListener(116, this.gpsResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gpsResponse$lambda-14, reason: not valid java name */
    public static final void m1003gpsResponse$lambda14(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity, com.oudmon.ble.base.communication.rsp.AppGpsRsp appGpsRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRunActivity, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, appGpsRsp);
        if (appGpsRsp != null) {
            try {
                int gpsStatus = appGpsRsp.getGpsStatus();
                if (gpsStatus == 2) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(gpsRunActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$gpsResponse$1$1
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity2) {
                            com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding;
                            com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding2;
                            com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding3;
                            com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding4;
                            com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding5;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRunActivity2, "$this$ktxRunOnUi");
                            activityGpsRunBinding = gpsRunActivity2.binding;
                            com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding6 = null;
                            if (activityGpsRunBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityGpsRunBinding = null;
                            }
                            activityGpsRunBinding.imageStop.setVisibility(4);
                            activityGpsRunBinding2 = gpsRunActivity2.binding;
                            if (activityGpsRunBinding2 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityGpsRunBinding2 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunBinding2.imageContinue);
                            activityGpsRunBinding3 = gpsRunActivity2.binding;
                            if (activityGpsRunBinding3 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityGpsRunBinding3 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunBinding3.imageEnd);
                            activityGpsRunBinding4 = gpsRunActivity2.binding;
                            if (activityGpsRunBinding4 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityGpsRunBinding4 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunBinding4.imageScreenLock);
                            activityGpsRunBinding5 = gpsRunActivity2.binding;
                            if (activityGpsRunBinding5 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityGpsRunBinding6 = activityGpsRunBinding5;
                            }
                            activityGpsRunBinding6.imageStop.setEnabled(false);
                            gpsRunActivity2.isTracking = true;
                            gpsRunActivity2.toggleRun();
                            gpsRunActivity2.endViewAnim();
                        }
                    });
                    return;
                }
                if (gpsStatus != 3) {
                    if (gpsStatus != 4) {
                        if (gpsStatus != 6) {
                            return;
                        }
                        gpsRunActivity.startTime = appGpsRsp.getTimeStamp();
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(appGpsRsp.getTimeStamp()));
                        return;
                    }
                    if ((gpsRunActivity.currentTimeInMiliis / 1000) / 60 < 1) {
                        gpsRunActivity.stopRun();
                        return;
                    } else {
                        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(gpsRunActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$gpsResponse$1$2
                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                invoke((com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity) obj);
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity2) {
                                long j;
                                long j2;
                                java.util.List list;
                                java.util.List list2;
                                com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel viewModel;
                                java.util.List list3;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRunActivity2, "$this$ktxRunOnUi");
                                gpsRunActivity2.stopGps();
                                try {
                                    list3 = gpsRunActivity2.pathPoint;
                                    gpsRunActivity2.setDistanceInMeters(com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.calculatePolyLineLength(list3));
                                    gpsRunActivity2.setCalorieTotal((30 * gpsRunActivity2.getDistanceInMeters()) / 1000);
                                } catch (java.lang.Exception unused) {
                                }
                                j = gpsRunActivity2.startTime;
                                j2 = gpsRunActivity2.currentTimeInMiliis;
                                float distanceInMeters = gpsRunActivity2.getDistanceInMeters();
                                float calorieTotal = gpsRunActivity2.getCalorieTotal();
                                list = gpsRunActivity2.pathPoint;
                                java.lang.String json = com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(list);
                                java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                                com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail gpsDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail(j, (int) j2, distanceInMeters, calorieTotal, json, y_m_d, com.qcwireless.qcwatch.QJavaApplication.getInstance().getGpsType());
                                list2 = gpsRunActivity2.pathPoint;
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(list2));
                                viewModel = gpsRunActivity2.getViewModel();
                                viewModel.saveGpsDetail(gpsDetail);
                                gpsRunActivity2.stopRun();
                            }
                        });
                        return;
                    }
                }
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding = gpsRunActivity.binding;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding2 = null;
                if (activityGpsRunBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunBinding = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunBinding.tvLabelEnd);
                com.qcwireless.qcwatch.databinding.ActivityGpsRunBinding activityGpsRunBinding3 = gpsRunActivity.binding;
                if (activityGpsRunBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityGpsRunBinding2 = activityGpsRunBinding3;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunBinding2.imageScreenLock);
                gpsRunActivity.startViewAnim();
                gpsRunActivity.isTracking = false;
                gpsRunActivity.toggleRun();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopGps() {
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PhoneGpsReq.getGpsStatus((byte) 6), this.gpsResponse);
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PhoneGpsReq.getGpsStatus((byte) 4), this.gpsResponse);
    }

    private final void syncDistance() {
        if (this.timer == null) {
            java.util.Timer timer = new java.util.Timer();
            this.timer = timer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(timer);
            timer.scheduleAtFixedRate(new java.util.TimerTask() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$syncDistance$1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    final com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity = com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$syncDistance$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$syncDistance$1$run$1
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$syncDistance$1) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity$syncDistance$1 gpsRunActivity$syncDistance$1) {
                            java.util.List list;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRunActivity$syncDistance$1, "$this$ktxRunOnBgSingle");
                            try {
                                if (((int) com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.getDistanceInMeters()) == 0) {
                                    com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity2 = com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this;
                                    list = gpsRunActivity2.pathPoint;
                                    gpsRunActivity2.setDistanceInMeters(com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.calculatePolyLineLength(list));
                                    com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity gpsRunActivity3 = com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this;
                                    gpsRunActivity3.setCalorieTotal((30 * gpsRunActivity3.getDistanceInMeters()) / 1000);
                                }
                            } catch (java.lang.Exception unused) {
                            }
                            try {
                                com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(com.oudmon.ble.base.communication.req.PhoneGpsReq.setPhoneDataReq((int) (com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.getDistanceInMeters() * 100), (int) (com.qcwireless.qcwatch.ui.home.gps.GpsRunActivity.this.getCalorieTotal() * 1000)));
                            } catch (java.lang.Exception unused2) {
                            }
                        }
                    });
                }
            }, 0L, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL);
        }
    }
}
