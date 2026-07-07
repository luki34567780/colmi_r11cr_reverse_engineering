package com.qcwireless.qcwatch.ui.home.gps;

/* compiled from: GpsCNRunActivity.kt */
@kotlin.Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0017\u0018\u0000 j2\u00020\u0001:\u0003ijkB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020(H\u0002J\b\u0010A\u001a\u00020?H\u0002J\b\u0010B\u001a\u00020?H\u0002J\b\u0010C\u001a\u00020?H\u0002J\b\u0010D\u001a\u00020?H\u0002J\b\u0010E\u001a\u00020?H\u0002J\b\u0010F\u001a\u00020?H\u0016J\u0012\u0010G\u001a\u00020?2\b\u0010H\u001a\u0004\u0018\u00010IH\u0014J\b\u0010J\u001a\u00020?H\u0015J\u0010\u0010K\u001a\u00020?2\u0006\u0010L\u001a\u00020MH\u0016J+\u0010N\u001a\u00020?2\u0006\u0010O\u001a\u00020P2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020S0R2\u0006\u0010T\u001a\u00020UH\u0016¢\u0006\u0002\u0010VJ\b\u0010W\u001a\u00020?H\u0014J\u0010\u0010X\u001a\u00020?2\u0006\u0010Y\u001a\u00020IH\u0014J\u0010\u0010Z\u001a\u00020?2\u0006\u0010[\u001a\u00020SH\u0002J\u000e\u0010\\\u001a\u00020?2\u0006\u0010]\u001a\u00020PJ\b\u0010^\u001a\u00020?H\u0015J\u0006\u0010_\u001a\u00020?J\b\u0010`\u001a\u00020?H\u0002J\b\u0010a\u001a\u00020?H\u0002J\b\u0010b\u001a\u00020?H\u0002J\b\u0010c\u001a\u00020?H\u0002J\b\u0010d\u001a\u00020?H\u0002J\b\u0010e\u001a\u00020?H\u0002J\b\u0010f\u001a\u00020?H\u0002J\u0010\u0010g\u001a\u00020?2\u0006\u0010 \u001a\u00020\u0019H\u0002J\b\u0010h\u001a\u00020?H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010%\u001a\u00060&R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082.¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020201X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b:\u0010;¨\u0006l"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GpsCNRunActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "aMap", "Lcom/amap/api/maps/AMap;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityGpsRunCnBinding;", "calorieTotal", "", "getCalorieTotal", "()F", "setCalorieTotal", "(F)V", "cameraPosition", "Lcom/amap/api/maps/model/CameraPosition;", "currentTimeInMiliis", "", "defaultLocation", "Lcom/amap/api/maps/model/LatLng;", "df", "Ljava/text/DecimalFormat;", "distanceInMeters", "getDistanceInMeters", "setDistanceInMeters", "firstLocation", "", "gnss", "Landroid/location/GnssStatus$Callback;", "gpsResponse", "Lcom/oudmon/ble/base/communication/ICommandResponse;", "Lcom/oudmon/ble/base/communication/rsp/AppGpsRsp;", "gpsStart", "isTracking", "lastKnownLocation", "Landroid/location/Location;", "locationClient", "Lcom/amap/api/location/AMapLocationClient;", "locationListener", "Lcom/qcwireless/qcwatch/ui/home/gps/GpsCNRunActivity$MyAMapLocationListener;", "locationOption", "Lcom/amap/api/location/AMapLocationClientOption;", "locationPermissionGranted", "mapView", "Lcom/amap/api/maps/MapView;", "marker", "Lcom/amap/api/maps/model/Marker;", "myLocationStyle", "Lcom/amap/api/maps/model/MyLocationStyle;", "pathPoint", "", "Lcom/qcwireless/qcwatch/ui/home/gps/bean/QcLatLon;", "startAnim", "Landroid/view/animation/TranslateAnimation;", "startTime", "timer", "Ljava/util/Timer;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/gps/vm/GPSRunActivityViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/gps/vm/GPSRunActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "endViewAnim", "", "getDefaultOption", "getLocationPermission", "initGPSListener", "initLocation", "initMap", "moveCameraToUser", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSaveInstanceState", "outState", "sendCommandToService", "action", "setGpsStatues", "number", "setupViews", "showGpsEnd", "showGpsExitDialog", "startViewAnim", "stopGps", "stopRun", "subscribeToObservers", "syncDistance", "toggleRun", "upDateTracking", "updateLocationUI", "Callback", "Companion", "MyAMapLocationListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GpsCNRunActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private static final int DEFAULT_ZOOM = 15;
    private static final java.lang.String KEY_CAMERA_POSITION = "camera_position";
    private static final java.lang.String KEY_LOCATION = "location";
    private static final int M_MAX_ENTRIES = 5;
    private static final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;
    private com.amap.api.maps.AMap aMap;
    private com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding binding;
    private float calorieTotal;
    private com.amap.api.maps.model.CameraPosition cameraPosition;
    private long currentTimeInMiliis;
    private java.text.DecimalFormat df;
    private float distanceInMeters;
    private boolean firstLocation;
    private boolean isTracking;
    private android.location.Location lastKnownLocation;
    private com.amap.api.location.AMapLocationClient locationClient;
    private com.amap.api.location.AMapLocationClientOption locationOption;
    private boolean locationPermissionGranted;
    private com.amap.api.maps.MapView mapView;
    private com.amap.api.maps.model.Marker marker;
    private com.amap.api.maps.model.MyLocationStyle myLocationStyle;
    private android.view.animation.TranslateAnimation startAnim;
    private long startTime;
    private java.util.Timer timer;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private android.location.GnssStatus.Callback gnss = new com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.Callback();
    private boolean gpsStart = true;
    private final com.amap.api.maps.model.LatLng defaultLocation = new com.amap.api.maps.model.LatLng(-33.8523341d, 151.2106085d);
    private java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon> pathPoint = new java.util.ArrayList();
    private final com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.MyAMapLocationListener locationListener = new com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.MyAMapLocationListener();
    private com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.AppGpsRsp> gpsResponse = new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$$ExternalSyntheticLambda6
        @Override // com.oudmon.ble.base.communication.ICommandResponse
        public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
            com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.m982gpsResponse$lambda13(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this, (com.oudmon.ble.base.communication.rsp.AppGpsRsp) baseRspCmd);
        }
    };

    public GpsCNRunActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel m992invoke() {
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

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding inflate = com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (savedInstanceState != null) {
            this.lastKnownLocation = (android.location.Location) savedInstanceState.getParcelable(KEY_LOCATION);
            this.cameraPosition = savedInstanceState.getParcelable(KEY_CAMERA_POSITION);
        }
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding = this.binding;
        com.amap.api.maps.MapView mapView = null;
        if (activityGpsRunCnBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding = null;
        }
        androidx.constraintlayout.widget.ConstraintLayout root = activityGpsRunCnBinding.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        setContentView((android.view.View) root);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding2 = this.binding;
        if (activityGpsRunCnBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding2 = null;
        }
        com.amap.api.maps.MapView mapView2 = activityGpsRunCnBinding2.map;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mapView2, "binding.map");
        this.mapView = mapView2;
        if (mapView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mapView");
        } else {
            mapView = mapView2;
        }
        mapView.onCreate(savedInstanceState);
        initMap();
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
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding = this.binding;
        if (activityGpsRunCnBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding = null;
        }
        activityGpsRunCnBinding.imageStop.setListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.m984setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUiDelay(this, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$setupViews$2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity) {
                com.oudmon.ble.base.communication.ICommandResponse iCommandResponse;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsCNRunActivity, "$this$ktxRunOnUiDelay");
                com.oudmon.ble.base.communication.CommandHandle commandHandle = com.oudmon.ble.base.communication.CommandHandle.getInstance();
                com.oudmon.ble.base.communication.req.PhoneGpsReq gpsStatus = com.oudmon.ble.base.communication.req.PhoneGpsReq.getGpsStatus((byte) 6);
                iCommandResponse = gpsCNRunActivity.gpsResponse;
                commandHandle.executeReqCmd(gpsStatus, iCommandResponse);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding2 = this.binding;
        if (activityGpsRunCnBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding2 = null;
        }
        activityGpsRunCnBinding2.imageEnd.setListener(new com.qcwireless.qcwatch.ui.base.view.gps.GpsEndView.GpsEndListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$$ExternalSyntheticLambda8
            @Override // com.qcwireless.qcwatch.ui.base.view.gps.GpsEndView.GpsEndListener
            public final void gpsEnd() {
                com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.m985setupViews$lambda2(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding3 = this.binding;
        if (activityGpsRunCnBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding3 = null;
        }
        activityGpsRunCnBinding3.imageStop.setEndListener(new com.qcwireless.qcwatch.ui.base.view.gps.LockView.EndListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$$ExternalSyntheticLambda9
            @Override // com.qcwireless.qcwatch.ui.base.view.gps.LockView.EndListener
            public final void onEnd() {
                com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.m986setupViews$lambda3(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this);
            }
        });
        android.view.View[] viewArr = new android.view.View[4];
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding4 = this.binding;
        if (activityGpsRunCnBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding4 = null;
        }
        viewArr[0] = activityGpsRunCnBinding4.imageBack;
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding5 = this.binding;
        if (activityGpsRunCnBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding5 = null;
        }
        viewArr[1] = activityGpsRunCnBinding5.imageContinue;
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding6 = this.binding;
        if (activityGpsRunCnBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding6 = null;
        }
        viewArr[2] = activityGpsRunCnBinding6.imageScreenLock;
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding7 = this.binding;
        if (activityGpsRunCnBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding7 = null;
        }
        viewArr[3] = activityGpsRunCnBinding7.viewTopOfLayout;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$setupViews$5
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding8;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding9;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding10;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding11;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding12;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding13;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding14;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding15;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding16;
                com.oudmon.ble.base.communication.ICommandResponse iCommandResponse;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding17;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding18;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityGpsRunCnBinding8 = com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.binding;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding19 = null;
                if (activityGpsRunCnBinding8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunCnBinding8 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityGpsRunCnBinding8.imageBack)) {
                    com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.showGpsExitDialog();
                    return;
                }
                activityGpsRunCnBinding9 = com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.binding;
                if (activityGpsRunCnBinding9 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunCnBinding9 = null;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityGpsRunCnBinding9.imageContinue)) {
                    activityGpsRunCnBinding10 = com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.binding;
                    if (activityGpsRunCnBinding10 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityGpsRunCnBinding10 = null;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityGpsRunCnBinding10.imageScreenLock)) {
                        activityGpsRunCnBinding12 = com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.binding;
                        if (activityGpsRunCnBinding12 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityGpsRunCnBinding12 = null;
                        }
                        activityGpsRunCnBinding12.imageStop.setLock(true);
                        activityGpsRunCnBinding13 = com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.binding;
                        if (activityGpsRunCnBinding13 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityGpsRunCnBinding13 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunCnBinding13.tvLabelUnlock);
                        activityGpsRunCnBinding14 = com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.binding;
                        if (activityGpsRunCnBinding14 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityGpsRunCnBinding14 = null;
                        }
                        activityGpsRunCnBinding14.imageStop.flipAnimator(1);
                        activityGpsRunCnBinding15 = com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.binding;
                        if (activityGpsRunCnBinding15 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityGpsRunCnBinding15 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunCnBinding15.imageScreenLock);
                        activityGpsRunCnBinding16 = com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.binding;
                        if (activityGpsRunCnBinding16 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityGpsRunCnBinding19 = activityGpsRunCnBinding16;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunCnBinding19.viewTopOfLayout);
                        return;
                    }
                    activityGpsRunCnBinding11 = com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.binding;
                    if (activityGpsRunCnBinding11 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityGpsRunCnBinding19 = activityGpsRunCnBinding11;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityGpsRunCnBinding19.viewTopOfLayout)) {
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "---click--");
                        return;
                    }
                    return;
                }
                com.oudmon.ble.base.communication.CommandHandle commandHandle = com.oudmon.ble.base.communication.CommandHandle.getInstance();
                com.oudmon.ble.base.communication.req.PhoneGpsReq gpsStatus = com.oudmon.ble.base.communication.req.PhoneGpsReq.getGpsStatus((byte) 3);
                iCommandResponse = com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.gpsResponse;
                commandHandle.executeReqCmd(gpsStatus, iCommandResponse);
                activityGpsRunCnBinding17 = com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.binding;
                if (activityGpsRunCnBinding17 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunCnBinding17 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunCnBinding17.tvLabelEnd);
                activityGpsRunCnBinding18 = com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.binding;
                if (activityGpsRunCnBinding18 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityGpsRunCnBinding19 = activityGpsRunCnBinding18;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunCnBinding19.imageScreenLock);
                com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.startViewAnim();
                com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.isTracking = false;
                com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.toggleRun();
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
    public static final void m984setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsCNRunActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding = gpsCNRunActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding2 = null;
        if (activityGpsRunCnBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding = null;
        }
        activityGpsRunCnBinding.imageStop.setVisibility(4);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding3 = gpsCNRunActivity.binding;
        if (activityGpsRunCnBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding3 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunCnBinding3.imageContinue);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding4 = gpsCNRunActivity.binding;
        if (activityGpsRunCnBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding4 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunCnBinding4.imageEnd);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding5 = gpsCNRunActivity.binding;
        if (activityGpsRunCnBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding5 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunCnBinding5.imageScreenLock);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding6 = gpsCNRunActivity.binding;
        if (activityGpsRunCnBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGpsRunCnBinding2 = activityGpsRunCnBinding6;
        }
        activityGpsRunCnBinding2.imageStop.setEnabled(false);
        gpsCNRunActivity.isTracking = true;
        gpsCNRunActivity.toggleRun();
        gpsCNRunActivity.endViewAnim();
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PhoneGpsReq.getGpsStatus((byte) 2), gpsCNRunActivity.gpsResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m985setupViews$lambda2(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsCNRunActivity, "this$0");
        long j = 1000;
        if ((gpsCNRunActivity.currentTimeInMiliis / j) / 60 < 1) {
            gpsCNRunActivity.showGpsExitDialog();
        } else {
            if (gpsCNRunActivity.startTime == 0) {
                gpsCNRunActivity.startTime = (java.lang.System.currentTimeMillis() - gpsCNRunActivity.currentTimeInMiliis) / j;
            }
            try {
                if (((int) gpsCNRunActivity.distanceInMeters) == 0) {
                    float calculatePolyLineLength = com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.calculatePolyLineLength(gpsCNRunActivity.pathPoint);
                    gpsCNRunActivity.distanceInMeters = calculatePolyLineLength;
                    gpsCNRunActivity.calorieTotal = (30 * calculatePolyLineLength) / 1000;
                }
            } catch (java.lang.Exception unused) {
            }
            long j2 = gpsCNRunActivity.startTime;
            int i = (int) gpsCNRunActivity.currentTimeInMiliis;
            float f = gpsCNRunActivity.distanceInMeters;
            float f2 = gpsCNRunActivity.calorieTotal;
            java.lang.String json = com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(gpsCNRunActivity.pathPoint);
            java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
            gpsCNRunActivity.getViewModel().saveGpsDetail(new com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail(j2, i, f, f2, json, y_m_d, com.qcwireless.qcwatch.QJavaApplication.getInstance().getGpsType()));
            gpsCNRunActivity.stopRun();
        }
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PhoneGpsReq.getGpsStatus((byte) 4), gpsCNRunActivity.gpsResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3, reason: not valid java name */
    public static final void m986setupViews$lambda3(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsCNRunActivity, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "endListener");
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding = gpsCNRunActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding2 = null;
        if (activityGpsRunCnBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding = null;
        }
        activityGpsRunCnBinding.imageStop.setLock(false);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding3 = gpsCNRunActivity.binding;
        if (activityGpsRunCnBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding3 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunCnBinding3.tvLabelUnlock);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding4 = gpsCNRunActivity.binding;
        if (activityGpsRunCnBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding4 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunCnBinding4.imageScreenLock);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding5 = gpsCNRunActivity.binding;
        if (activityGpsRunCnBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGpsRunCnBinding2 = activityGpsRunCnBinding5;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunCnBinding2.viewTopOfLayout);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding = this.binding;
            if (activityGpsRunCnBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityGpsRunCnBinding = null;
            }
            activityGpsRunCnBinding.gpsHeart.setItemTitle("00");
        }
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().addNotifyListener(30, new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$$ExternalSyntheticLambda7
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.m983onResume$lambda4(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this, (com.oudmon.ble.base.communication.rsp.RealTimeHeartRateRsp) baseRspCmd);
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
    public static final void m983onResume$lambda4(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity, final com.oudmon.ble.base.communication.rsp.RealTimeHeartRateRsp realTimeHeartRateRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsCNRunActivity, "this$0");
        if (realTimeHeartRateRsp == null || realTimeHeartRateRsp.getHeart() <= 0) {
            return;
        }
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(gpsCNRunActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$onResume$1$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity2) {
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsCNRunActivity2, "$this$ktxRunOnUi");
                activityGpsRunCnBinding = gpsCNRunActivity2.binding;
                if (activityGpsRunCnBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunCnBinding = null;
                }
                activityGpsRunCnBinding.gpsHeart.setItemTitle(java.lang.String.valueOf(com.oudmon.ble.base.communication.rsp.RealTimeHeartRateRsp.this.getHeart()));
            }
        });
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
        com.amap.api.maps.AMap aMap = this.aMap;
        if (aMap != null) {
            outState.putParcelable(KEY_CAMERA_POSITION, (android.os.Parcelable) aMap.getCameraPosition());
            outState.putParcelable(KEY_LOCATION, this.lastKnownLocation);
        }
        super.onSaveInstanceState(outState);
    }

    private final void initMap() {
        com.amap.api.maps.MapView mapView = this.mapView;
        com.amap.api.maps.model.MyLocationStyle myLocationStyle = null;
        if (mapView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mapView");
            mapView = null;
        }
        this.aMap = mapView.getMap();
        com.amap.api.maps.model.MyLocationStyle myLocationStyle2 = new com.amap.api.maps.model.MyLocationStyle();
        this.myLocationStyle = myLocationStyle2;
        myLocationStyle2.interval(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL);
        com.amap.api.maps.model.MyLocationStyle myLocationStyle3 = this.myLocationStyle;
        if (myLocationStyle3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("myLocationStyle");
            myLocationStyle3 = null;
        }
        myLocationStyle3.myLocationType(1);
        com.amap.api.maps.AMap aMap = this.aMap;
        if (aMap != null) {
            aMap.setLocationSource(new com.amap.api.maps.LocationSource() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$initMap$1
                public void deactivate() {
                }

                public void activate(com.amap.api.maps.LocationSource.OnLocationChangedListener p0) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "activate");
                    com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.initLocation();
                }
            });
        }
        com.amap.api.maps.AMap aMap2 = this.aMap;
        if (aMap2 != null) {
            com.amap.api.maps.model.MyLocationStyle myLocationStyle4 = this.myLocationStyle;
            if (myLocationStyle4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("myLocationStyle");
            } else {
                myLocationStyle = myLocationStyle4;
            }
            aMap2.setMyLocationStyle(myLocationStyle);
        }
        com.amap.api.maps.AMap aMap3 = this.aMap;
        if (aMap3 == null) {
            return;
        }
        aMap3.setMyLocationEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initLocation() {
        try {
            this.locationClient = new com.amap.api.location.AMapLocationClient(getApplicationContext());
            this.locationOption = getDefaultOption();
            com.amap.api.location.AMapLocationClient aMapLocationClient = this.locationClient;
            com.amap.api.location.AMapLocationClient aMapLocationClient2 = null;
            if (aMapLocationClient == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("locationClient");
                aMapLocationClient = null;
            }
            com.amap.api.location.AMapLocationClientOption aMapLocationClientOption = this.locationOption;
            if (aMapLocationClientOption == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("locationOption");
                aMapLocationClientOption = null;
            }
            aMapLocationClient.setLocationOption(aMapLocationClientOption);
            com.amap.api.location.AMapLocationClient aMapLocationClient3 = this.locationClient;
            if (aMapLocationClient3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("locationClient");
                aMapLocationClient3 = null;
            }
            aMapLocationClient3.setLocationListener(this.locationListener);
            com.amap.api.location.AMapLocationClient aMapLocationClient4 = this.locationClient;
            if (aMapLocationClient4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("locationClient");
            } else {
                aMapLocationClient2 = aMapLocationClient4;
            }
            aMapLocationClient2.startLocation();
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
        aMapLocationClientOption.setNeedAddress(true);
        aMapLocationClientOption.setOnceLocation(true);
        aMapLocationClientOption.setOnceLocationLatest(true);
        com.amap.api.location.AMapLocationClientOption.setLocationProtocol(com.amap.api.location.AMapLocationClientOption.AMapLocationProtocol.HTTP);
        aMapLocationClientOption.setSensorEnable(false);
        aMapLocationClientOption.setWifiScan(true);
        aMapLocationClientOption.setLocationCacheEnable(true);
        aMapLocationClientOption.setGeoLanguage(com.amap.api.location.AMapLocationClientOption.GeoLanguage.DEFAULT);
        return aMapLocationClientOption;
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
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        this.locationPermissionGranted = false;
        if (requestCode == 1) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                this.locationPermissionGranted = true;
            }
        }
        updateLocationUI();
    }

    private final void updateLocationUI() {
        com.amap.api.maps.AMap aMap = this.aMap;
        if (aMap == null) {
            return;
        }
        if (aMap != null) {
            try {
                aMap.setMyLocationEnabled(false);
            } catch (java.lang.SecurityException e) {
                android.util.Log.e("Exception: %s", e.getMessage(), e);
                return;
            }
        }
        com.amap.api.maps.AMap aMap2 = this.aMap;
        com.amap.api.maps.UiSettings uiSettings = aMap2 != null ? aMap2.getUiSettings() : null;
        if (uiSettings != null) {
            uiSettings.setMyLocationButtonEnabled(false);
        }
        if (this.locationPermissionGranted) {
            return;
        }
        this.lastKnownLocation = null;
        getLocationPermission();
    }

    /* compiled from: GpsCNRunActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GpsCNRunActivity$Callback;", "Landroid/location/GnssStatus$Callback;", "(Lcom/qcwireless/qcwatch/ui/home/gps/GpsCNRunActivity;)V", "onFirstFix", "", "ttffMillis", "", "onSatelliteStatusChanged", "status", "Landroid/location/GnssStatus;", "onStarted", "onStopped", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
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
            com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.setGpsStatues(status.getSatelliteCount());
        }
    }

    public final void setGpsStatues(int number) {
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding = null;
        if (number <= 0) {
            com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding2 = this.binding;
            if (activityGpsRunCnBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGpsRunCnBinding = activityGpsRunCnBinding2;
            }
            activityGpsRunCnBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_1);
            return;
        }
        if (number <= 2) {
            com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding3 = this.binding;
            if (activityGpsRunCnBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGpsRunCnBinding = activityGpsRunCnBinding3;
            }
            activityGpsRunCnBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_2);
            return;
        }
        if (number <= 5) {
            com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding4 = this.binding;
            if (activityGpsRunCnBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGpsRunCnBinding = activityGpsRunCnBinding4;
            }
            activityGpsRunCnBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_3);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding5 = this.binding;
        if (activityGpsRunCnBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGpsRunCnBinding = activityGpsRunCnBinding5;
        }
        activityGpsRunCnBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_4);
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
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding2 = null;
        if (activityGpsRunCnBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding = null;
        }
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(activityGpsRunCnBinding.imageStop.getMeasuredWidth(), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(300L);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding3 = this.binding;
        if (activityGpsRunCnBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding3 = null;
        }
        activityGpsRunCnBinding3.imageEnd.startAnimation(translateAnimation);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding4 = this.binding;
        if (activityGpsRunCnBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding4 = null;
        }
        android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(-activityGpsRunCnBinding4.imageStop.getMeasuredWidth(), 0.0f, 0.0f, 0.0f);
        translateAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$endViewAnim$1
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
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding5;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
                activityGpsRunCnBinding5 = com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.binding;
                if (activityGpsRunCnBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunCnBinding5 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunCnBinding5.tvLabelEnd);
            }
        });
        translateAnimation2.setDuration(300L);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding5 = this.binding;
        if (activityGpsRunCnBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGpsRunCnBinding2 = activityGpsRunCnBinding5;
        }
        activityGpsRunCnBinding2.imageContinue.startAnimation(translateAnimation2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startViewAnim() {
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding2 = null;
        if (activityGpsRunCnBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding = null;
        }
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, activityGpsRunCnBinding.imageStop.getMeasuredWidth(), 0.0f, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$startViewAnim$1
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
            com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding3 = this.binding;
            if (activityGpsRunCnBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityGpsRunCnBinding3 = null;
            }
            android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(0.0f, -activityGpsRunCnBinding3.imageStop.getMeasuredWidth(), 0.0f, 0.0f);
            this.startAnim = translateAnimation2;
            kotlin.jvm.internal.Intrinsics.checkNotNull(translateAnimation2);
            translateAnimation2.setDuration(300L);
            android.view.animation.TranslateAnimation translateAnimation3 = this.startAnim;
            kotlin.jvm.internal.Intrinsics.checkNotNull(translateAnimation3);
            translateAnimation3.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$startViewAnim$2
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
                    com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.showGpsEnd();
                }
            });
        }
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding4 = this.binding;
        if (activityGpsRunCnBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding4 = null;
        }
        activityGpsRunCnBinding4.imageEnd.startAnimation(translateAnimation);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding5 = this.binding;
        if (activityGpsRunCnBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGpsRunCnBinding2 = activityGpsRunCnBinding5;
        }
        activityGpsRunCnBinding2.imageContinue.startAnimation(this.startAnim);
    }

    public final void showGpsEnd() {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "showGpsEnd");
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding2 = null;
        if (activityGpsRunCnBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunCnBinding.imageEnd);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding3 = this.binding;
        if (activityGpsRunCnBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding3 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunCnBinding3.imageContinue);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding4 = this.binding;
        if (activityGpsRunCnBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding4 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunCnBinding4.imageStop);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding5 = this.binding;
        if (activityGpsRunCnBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGpsRunCnBinding2 = activityGpsRunCnBinding5;
        }
        activityGpsRunCnBinding2.imageStop.setEnabled(true);
    }

    private final void subscribeToObservers() {
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.INSTANCE.isTracking().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$$ExternalSyntheticLambda3
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.m989subscribeToObservers$lambda6(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this, (java.lang.Boolean) obj);
            }
        });
        com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.INSTANCE.getPathPoints().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$$ExternalSyntheticLambda5
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.m990subscribeToObservers$lambda8(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this, (java.util.List) obj);
            }
        });
        com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.INSTANCE.getTimeRunInMillis().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$$ExternalSyntheticLambda4
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.m991subscribeToObservers$lambda9(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this, (java.lang.Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: subscribeToObservers$lambda-6, reason: not valid java name */
    public static final void m989subscribeToObservers$lambda6(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsCNRunActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "it");
        gpsCNRunActivity.upDateTracking(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: subscribeToObservers$lambda-8, reason: not valid java name */
    public static final void m990subscribeToObservers$lambda8(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsCNRunActivity, "this$0");
        new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "it");
        gpsCNRunActivity.pathPoint = list;
        gpsCNRunActivity.moveCameraToUser();
        gpsCNRunActivity.distanceInMeters = com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.calculatePolyLineLength(list);
        if (!gpsCNRunActivity.firstLocation && gpsCNRunActivity.pathPoint.size() > 0) {
            com.amap.api.maps.model.LatLng latLng = new com.amap.api.maps.model.LatLng(((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.first(gpsCNRunActivity.pathPoint)).getLatitude(), ((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.first(gpsCNRunActivity.pathPoint)).getLongitude());
            com.amap.api.maps.AMap aMap = gpsCNRunActivity.aMap;
            if (aMap != null) {
                aMap.addMarker(new com.amap.api.maps.model.MarkerOptions().position(latLng).icon(com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(com.qcwireless.qcwatch.R.mipmap.gps_start_mark)).anchor(0.5f, 0.5f));
            }
            gpsCNRunActivity.firstLocation = true;
        }
        float f = 30;
        float f2 = 1000;
        float f3 = (gpsCNRunActivity.distanceInMeters * f) / f2;
        gpsCNRunActivity.calorieTotal = f3;
        try {
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding = gpsCNRunActivity.binding;
                if (activityGpsRunCnBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunCnBinding = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView = activityGpsRunCnBinding.gpsDistance;
                java.text.DecimalFormat decimalFormat = gpsCNRunActivity.df;
                if (decimalFormat == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("df");
                    decimalFormat = null;
                }
                java.lang.String format = decimalFormat.format(java.lang.Float.valueOf((gpsCNRunActivity.distanceInMeters * 1.0f) / f2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "df.format(distanceInMeters * 1.0f / 1000)");
                qSportItemView.setItemTitle(format);
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding2 = gpsCNRunActivity.binding;
                if (activityGpsRunCnBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunCnBinding2 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView2 = activityGpsRunCnBinding2.gpsDistance;
                java.lang.String string = gpsCNRunActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_88);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_88)");
                qSportItemView2.setItemUnit(string);
            } else {
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding3 = gpsCNRunActivity.binding;
                if (activityGpsRunCnBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunCnBinding3 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView3 = activityGpsRunCnBinding3.gpsDistance;
                java.text.DecimalFormat decimalFormat2 = gpsCNRunActivity.df;
                if (decimalFormat2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("df");
                    decimalFormat2 = null;
                }
                java.lang.String format2 = decimalFormat2.format(java.lang.Float.valueOf(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kmToIn((gpsCNRunActivity.distanceInMeters * 1.0f) / f2)));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "df.format(kmToIn(distanceInMeters * 1.0f / 1000))");
                qSportItemView3.setItemTitle(format2);
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding4 = gpsCNRunActivity.binding;
                if (activityGpsRunCnBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunCnBinding4 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView4 = activityGpsRunCnBinding4.gpsDistance;
                java.lang.String string2 = gpsCNRunActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_358);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_358)");
                qSportItemView4.setItemUnit(string2);
            }
        } catch (java.lang.Exception unused) {
        }
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding5 = gpsCNRunActivity.binding;
        if (activityGpsRunCnBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding5 = null;
        }
        activityGpsRunCnBinding5.gpsCalorie.setItemTitle(java.lang.String.valueOf((int) f3));
        if (((int) gpsCNRunActivity.distanceInMeters) == 0) {
            float calculatePolyLineLength = com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.calculatePolyLineLength(gpsCNRunActivity.pathPoint);
            gpsCNRunActivity.distanceInMeters = calculatePolyLineLength;
            gpsCNRunActivity.calorieTotal = (f * calculatePolyLineLength) / f2;
        }
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(com.oudmon.ble.base.communication.req.PhoneGpsReq.setPhoneDataReq((int) (gpsCNRunActivity.distanceInMeters * 100), (int) (gpsCNRunActivity.calorieTotal * f2)));
        float f4 = gpsCNRunActivity.currentTimeInMiliis / gpsCNRunActivity.distanceInMeters;
        if (f4 > 5999.0f) {
            com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding6 = gpsCNRunActivity.binding;
            if (activityGpsRunCnBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityGpsRunCnBinding6 = null;
            }
            activityGpsRunCnBinding6.gpsPace.setItemTitle("--");
            f4 = 5999.0f;
        } else {
            com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding7 = gpsCNRunActivity.binding;
            if (activityGpsRunCnBinding7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityGpsRunCnBinding7 = null;
            }
            com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView5 = activityGpsRunCnBinding7.gpsPace;
            java.lang.String dayMinToStrSymbol = com.qcwireless.qc_utils.date.DateUtil.dayMinToStrSymbol((int) f4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dayMinToStrSymbol, "dayMinToStrSymbol(fStr.toInt())");
            qSportItemView5.setItemTitle(dayMinToStrSymbol);
        }
        if (gpsCNRunActivity.pathPoint.size() > 0) {
            double d = f4;
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Double.valueOf(d));
            ((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.last(gpsCNRunActivity.pathPoint)).setPace(d);
        }
        if (!(!gpsCNRunActivity.pathPoint.isEmpty()) || gpsCNRunActivity.pathPoint.size() <= 2) {
            return;
        }
        com.amap.api.maps.model.PolylineOptions useGradient = new com.amap.api.maps.model.PolylineOptions().width(10.0f).lineJoinType(com.amap.api.maps.model.PolylineOptions.LineJoinType.LineJoinRound).lineCapType(com.amap.api.maps.model.PolylineOptions.LineCapType.LineCapRound).useGradient(true);
        for (com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon qcLatLon : gpsCNRunActivity.pathPoint) {
            useGradient.color(com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.getPaceColor(qcLatLon.getSpeed()));
            useGradient.add(new com.amap.api.maps.model.LatLng(qcLatLon.getLatitude(), qcLatLon.getLongitude()));
        }
        com.amap.api.maps.AMap aMap2 = gpsCNRunActivity.aMap;
        if (aMap2 != null) {
            aMap2.addPolyline(useGradient);
        }
        com.amap.api.maps.model.Marker marker = gpsCNRunActivity.marker;
        if (marker != null && marker != null) {
            marker.remove();
        }
        com.amap.api.maps.AMap aMap3 = gpsCNRunActivity.aMap;
        gpsCNRunActivity.marker = aMap3 != null ? aMap3.addMarker(new com.amap.api.maps.model.MarkerOptions().position(new com.amap.api.maps.model.LatLng(((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.last(gpsCNRunActivity.pathPoint)).getLatitude(), ((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.last(gpsCNRunActivity.pathPoint)).getLongitude())).icon(com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(com.qcwireless.qcwatch.R.mipmap.gps_mark)).anchor(0.5f, 0.5f)) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: subscribeToObservers$lambda-9, reason: not valid java name */
    public static final void m991subscribeToObservers$lambda9(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsCNRunActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l, "it");
        long longValue = l.longValue();
        gpsCNRunActivity.currentTimeInMiliis = longValue;
        if (longValue == 0 && gpsCNRunActivity.gpsStart) {
            gpsCNRunActivity.gpsStart = false;
        }
        java.lang.String formattedStopWatchTIme = com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.getFormattedStopWatchTIme(longValue, false);
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding = gpsCNRunActivity.binding;
        if (activityGpsRunCnBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding = null;
        }
        activityGpsRunCnBinding.gpsTimes.setItemTitle(formattedStopWatchTIme);
    }

    /* compiled from: GpsCNRunActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GpsCNRunActivity$MyAMapLocationListener;", "Lcom/amap/api/location/AMapLocationListener;", "(Lcom/qcwireless/qcwatch/ui/home/gps/GpsCNRunActivity;)V", "onLocationChanged", "", "amapLocation", "Lcom/amap/api/location/AMapLocation;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyAMapLocationListener implements com.amap.api.location.AMapLocationListener {
        public MyAMapLocationListener() {
        }

        public void onLocationChanged(com.amap.api.location.AMapLocation amapLocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amapLocation, "amapLocation");
            com.amap.api.maps.model.LatLng latLng = new com.amap.api.maps.model.LatLng(amapLocation.getLatitude(), amapLocation.getLongitude());
            com.amap.api.maps.AMap aMap = com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.aMap;
            if (aMap != null) {
                aMap.moveCamera(com.amap.api.maps.CameraUpdateFactory.newLatLngZoom(latLng, 18.0f));
            }
        }
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
        com.amap.api.maps.AMap aMap;
        if ((!this.pathPoint.isEmpty()) && (!this.pathPoint.isEmpty()) && (aMap = this.aMap) != null) {
            aMap.animateCamera(com.amap.api.maps.CameraUpdateFactory.newLatLngZoom(new com.amap.api.maps.model.LatLng(((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.last(this.pathPoint)).getLatitude(), ((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.last(this.pathPoint)).getLongitude()), 18.0f));
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
            com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding = this.binding;
            if (activityGpsRunCnBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityGpsRunCnBinding = null;
            }
            activityGpsRunCnBinding.gpsHeart.setItemTitle("00");
            return;
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.DeviceGpsEvent) {
            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$onMessageEvent$1
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity) {
                        java.util.List list;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsCNRunActivity, "$this$ktxRunOnBgSingle");
                        try {
                            if (((int) gpsCNRunActivity.getDistanceInMeters()) == 0) {
                                list = gpsCNRunActivity.pathPoint;
                                gpsCNRunActivity.setDistanceInMeters(com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.calculatePolyLineLength(list));
                                gpsCNRunActivity.setCalorieTotal((30 * gpsCNRunActivity.getDistanceInMeters()) / 1000);
                            }
                        } catch (java.lang.Exception unused) {
                        }
                        try {
                            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(com.oudmon.ble.base.communication.req.PhoneGpsReq.setPhoneDataReq((int) (gpsCNRunActivity.getDistanceInMeters() * 100), (int) (gpsCNRunActivity.getCalorieTotal() * 1000)));
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
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$onMessageEvent$2
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity) {
                            java.util.List list;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsCNRunActivity, "$this$ktxRunOnBgSingle");
                            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                                try {
                                    list = gpsCNRunActivity.pathPoint;
                                    gpsCNRunActivity.setDistanceInMeters(com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.calculatePolyLineLength(list));
                                    gpsCNRunActivity.setCalorieTotal((30 * gpsCNRunActivity.getDistanceInMeters()) / 1000);
                                } catch (java.lang.Exception unused) {
                                }
                                try {
                                    com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(com.oudmon.ble.base.communication.req.PhoneGpsReq.setPhoneDataReq((int) (gpsCNRunActivity.getDistanceInMeters() * 100), (int) (gpsCNRunActivity.getCalorieTotal() * 1000)));
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
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding = this.binding;
        if (activityGpsRunCnBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding = null;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(activityGpsRunCnBinding.imageStop.isLock()));
        com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding2 = this.binding;
        if (activityGpsRunCnBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsRunCnBinding2 = null;
        }
        if (activityGpsRunCnBinding2.imageStop.isLock()) {
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
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.m987showGpsExitDialog$lambda11(objectRef, view);
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.m988showGpsExitDialog$lambda12(booleanRef, this, objectRef, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGpsExitDialog$lambda-11, reason: not valid java name */
    public static final void m987showGpsExitDialog$lambda11(kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGpsExitDialog$lambda-12, reason: not valid java name */
    public static final void m988showGpsExitDialog$lambda12(kotlin.jvm.internal.Ref.BooleanRef booleanRef, com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity, kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(booleanRef, "$exitSave");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsCNRunActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        if (booleanRef.element) {
            if (gpsCNRunActivity.startTime == 0) {
                gpsCNRunActivity.startTime = (java.lang.System.currentTimeMillis() - gpsCNRunActivity.currentTimeInMiliis) / 1000;
            }
            try {
                if (((int) gpsCNRunActivity.distanceInMeters) == 0) {
                    float calculatePolyLineLength = com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.calculatePolyLineLength(gpsCNRunActivity.pathPoint);
                    gpsCNRunActivity.distanceInMeters = calculatePolyLineLength;
                    gpsCNRunActivity.calorieTotal = (30 * calculatePolyLineLength) / 1000;
                }
            } catch (java.lang.Exception unused) {
            }
            long j = gpsCNRunActivity.startTime;
            int i = (int) gpsCNRunActivity.currentTimeInMiliis;
            float f = gpsCNRunActivity.distanceInMeters;
            float f2 = gpsCNRunActivity.calorieTotal;
            java.lang.String json = com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(gpsCNRunActivity.pathPoint);
            java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
            gpsCNRunActivity.getViewModel().saveGpsDetail(new com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail(j, i, f, f2, json, y_m_d, com.qcwireless.qcwatch.QJavaApplication.getInstance().getGpsType()));
        }
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PhoneGpsReq.getGpsStatus((byte) 4), gpsCNRunActivity.gpsResponse);
        gpsCNRunActivity.stopRun();
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.ui.base.bean.event.HealthItemRefreshEvent());
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    private final void initGPSListener() {
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PhoneGpsReq.getGpsStatus((byte) 3), this.gpsResponse);
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().addNotifyListener(116, this.gpsResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gpsResponse$lambda-13, reason: not valid java name */
    public static final void m982gpsResponse$lambda13(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity, com.oudmon.ble.base.communication.rsp.AppGpsRsp appGpsRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsCNRunActivity, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, appGpsRsp);
        if (appGpsRsp != null) {
            try {
                int gpsStatus = appGpsRsp.getGpsStatus();
                if (gpsStatus == 2) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(gpsCNRunActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$gpsResponse$1$1
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity2) {
                            com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding;
                            com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding2;
                            com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding3;
                            com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding4;
                            com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding5;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsCNRunActivity2, "$this$ktxRunOnUi");
                            activityGpsRunCnBinding = gpsCNRunActivity2.binding;
                            com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding6 = null;
                            if (activityGpsRunCnBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityGpsRunCnBinding = null;
                            }
                            activityGpsRunCnBinding.imageStop.setVisibility(4);
                            activityGpsRunCnBinding2 = gpsCNRunActivity2.binding;
                            if (activityGpsRunCnBinding2 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityGpsRunCnBinding2 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunCnBinding2.imageContinue);
                            activityGpsRunCnBinding3 = gpsCNRunActivity2.binding;
                            if (activityGpsRunCnBinding3 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityGpsRunCnBinding3 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunCnBinding3.imageEnd);
                            activityGpsRunCnBinding4 = gpsCNRunActivity2.binding;
                            if (activityGpsRunCnBinding4 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityGpsRunCnBinding4 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunCnBinding4.imageScreenLock);
                            activityGpsRunCnBinding5 = gpsCNRunActivity2.binding;
                            if (activityGpsRunCnBinding5 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityGpsRunCnBinding6 = activityGpsRunCnBinding5;
                            }
                            activityGpsRunCnBinding6.imageStop.setEnabled(false);
                            gpsCNRunActivity2.isTracking = true;
                            gpsCNRunActivity2.toggleRun();
                            gpsCNRunActivity2.endViewAnim();
                        }
                    });
                    return;
                }
                if (gpsStatus != 3) {
                    if (gpsStatus != 4) {
                        if (gpsStatus != 6) {
                            return;
                        }
                        gpsCNRunActivity.startTime = appGpsRsp.getTimeStamp();
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(appGpsRsp.getTimeStamp()));
                        return;
                    }
                    if ((gpsCNRunActivity.currentTimeInMiliis / 1000) / 60 < 1) {
                        gpsCNRunActivity.stopRun();
                        return;
                    } else {
                        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(gpsCNRunActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$gpsResponse$1$2
                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                invoke((com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity) obj);
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity2) {
                                long j;
                                long j2;
                                java.util.List list;
                                java.util.List list2;
                                com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel viewModel;
                                java.util.List list3;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsCNRunActivity2, "$this$ktxRunOnUi");
                                gpsCNRunActivity2.stopGps();
                                try {
                                    list3 = gpsCNRunActivity2.pathPoint;
                                    gpsCNRunActivity2.setDistanceInMeters(com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.calculatePolyLineLength(list3));
                                    gpsCNRunActivity2.setCalorieTotal((30 * gpsCNRunActivity2.getDistanceInMeters()) / 1000);
                                } catch (java.lang.Exception unused) {
                                }
                                j = gpsCNRunActivity2.startTime;
                                j2 = gpsCNRunActivity2.currentTimeInMiliis;
                                float distanceInMeters = gpsCNRunActivity2.getDistanceInMeters();
                                float calorieTotal = gpsCNRunActivity2.getCalorieTotal();
                                list = gpsCNRunActivity2.pathPoint;
                                java.lang.String json = com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(list);
                                java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                                com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail gpsDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail(j, (int) j2, distanceInMeters, calorieTotal, json, y_m_d, com.qcwireless.qcwatch.QJavaApplication.getInstance().getGpsType());
                                list2 = gpsCNRunActivity2.pathPoint;
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(list2));
                                viewModel = gpsCNRunActivity2.getViewModel();
                                viewModel.saveGpsDetail(gpsDetail);
                                gpsCNRunActivity2.stopRun();
                            }
                        });
                        return;
                    }
                }
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding = gpsCNRunActivity.binding;
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding2 = null;
                if (activityGpsRunCnBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsRunCnBinding = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsRunCnBinding.tvLabelEnd);
                com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding activityGpsRunCnBinding3 = gpsCNRunActivity.binding;
                if (activityGpsRunCnBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityGpsRunCnBinding2 = activityGpsRunCnBinding3;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGpsRunCnBinding2.imageScreenLock);
                gpsCNRunActivity.startViewAnim();
                gpsCNRunActivity.isTracking = false;
                gpsCNRunActivity.toggleRun();
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
            timer.scheduleAtFixedRate(new java.util.TimerTask() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$syncDistance$1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    final com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity = com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$syncDistance$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$syncDistance$1$run$1
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$syncDistance$1) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity$syncDistance$1 gpsCNRunActivity$syncDistance$1) {
                            java.util.List list;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsCNRunActivity$syncDistance$1, "$this$ktxRunOnBgSingle");
                            try {
                                if (((int) com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.getDistanceInMeters()) == 0) {
                                    com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity2 = com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this;
                                    list = gpsCNRunActivity2.pathPoint;
                                    gpsCNRunActivity2.setDistanceInMeters(com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.calculatePolyLineLength(list));
                                    com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity gpsCNRunActivity3 = com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this;
                                    gpsCNRunActivity3.setCalorieTotal((30 * gpsCNRunActivity3.getDistanceInMeters()) / 1000);
                                }
                            } catch (java.lang.Exception unused) {
                            }
                            try {
                                com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(com.oudmon.ble.base.communication.req.PhoneGpsReq.setPhoneDataReq((int) (com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.getDistanceInMeters() * 100), (int) (com.qcwireless.qcwatch.ui.home.gps.GpsCNRunActivity.this.getCalorieTotal() * 1000)));
                            } catch (java.lang.Exception unused2) {
                            }
                        }
                    });
                }
            }, 0L, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL);
        }
    }
}
