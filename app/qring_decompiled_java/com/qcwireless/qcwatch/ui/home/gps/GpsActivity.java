package com.qcwireless.qcwatch.ui.home.gps;

/* compiled from: GpsActivity.kt */
@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\f\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u000289B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\u0012\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001dH\u0015J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&H\u0016J+\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020.H\u0016¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020\u001dH\u0014J\u0010\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020!H\u0014J\b\u00103\u001a\u00020\u001dH\u0002J\u000e\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u00020)J\b\u00106\u001a\u00020\u001dH\u0015J\b\u00107\u001a\u00020\u001dH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006:"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GpsActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityGpsBinding;", "cameraPosition", "Lcom/google/android/gms/maps/model/CameraPosition;", "defaultLocation", "Lcom/google/android/gms/maps/model/LatLng;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "gnss", "Landroid/location/GnssStatus$Callback;", "lastKnownLocation", "Landroid/location/Location;", "locationPermissionGranted", "", "map", "Lcom/google/android/gms/maps/GoogleMap;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/gps/vm/GPSActivityViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/gps/vm/GPSActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "checkPermission", "getDeviceLocation", "", "getLocationPermission", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMapReady", "onMarkerClick", "p0", "Lcom/google/android/gms/maps/model/Marker;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSaveInstanceState", "outState", "openBatteryWhiteList", "setGpsStatues", "number", "setupViews", "updateLocationUI", "Callback", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GpsActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity implements com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener {
    private static final int DEFAULT_ZOOM = 15;
    private static final java.lang.String KEY_CAMERA_POSITION = "camera_position";
    private static final java.lang.String KEY_LOCATION = "location";
    private static final int M_MAX_ENTRIES = 5;
    private static final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;
    private com.qcwireless.qcwatch.databinding.ActivityGpsBinding binding;
    private com.google.android.gms.maps.model.CameraPosition cameraPosition;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    private android.location.Location lastKnownLocation;
    private boolean locationPermissionGranted;
    private com.google.android.gms.maps.GoogleMap map;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private android.location.GnssStatus.Callback gnss = new com.qcwireless.qcwatch.ui.home.gps.GpsActivity.Callback();
    private final com.google.android.gms.maps.model.LatLng defaultLocation = new com.google.android.gms.maps.model.LatLng(-33.8523341d, 151.2106085d);

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(com.google.android.gms.maps.model.Marker p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
        return false;
    }

    public GpsActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel m977invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel.class), qualifier, qualifier);
            }
        });
    }

    private final com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel) this.viewModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityGpsBinding inflate = com.qcwireless.qcwatch.databinding.ActivityGpsBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        android.view.View root = inflate.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        setContentView(root);
        if (savedInstanceState != null) {
            this.lastKnownLocation = (android.location.Location) savedInstanceState.getParcelable(KEY_LOCATION);
            this.cameraPosition = (com.google.android.gms.maps.model.CameraPosition) savedInstanceState.getParcelable(KEY_CAMERA_POSITION);
        }
        com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient((android.app.Activity) this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(this)");
        this.fusedLocationProviderClient = fusedLocationProviderClient;
        com.google.android.gms.maps.SupportMapFragment supportMapFragment = (com.google.android.gms.maps.SupportMapFragment) getSupportFragmentManager().findFragmentById(com.qcwireless.qcwatch.R.id.map);
        if (supportMapFragment != null) {
            supportMapFragment.getMapAsync(this);
        }
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        setStatusBarBackground(com.qcwireless.qcwatch.R.color.gps_bg);
        com.qcwireless.qcwatch.databinding.ActivityGpsBinding activityGpsBinding = this.binding;
        if (activityGpsBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsBinding = null;
        }
        activityGpsBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_92));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityGpsBinding.titleBar.divider);
        android.view.View[] viewArr = new android.view.View[2];
        com.qcwireless.qcwatch.databinding.ActivityGpsBinding activityGpsBinding2 = this.binding;
        if (activityGpsBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsBinding2 = null;
        }
        viewArr[0] = activityGpsBinding2.btnGpsGo;
        com.qcwireless.qcwatch.databinding.ActivityGpsBinding activityGpsBinding3 = this.binding;
        if (activityGpsBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsBinding3 = null;
        }
        viewArr[1] = activityGpsBinding3.tvSportHistory;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsActivity$setupViews$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivityGpsBinding activityGpsBinding4;
                com.qcwireless.qcwatch.databinding.ActivityGpsBinding activityGpsBinding5;
                boolean checkPermission;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityGpsBinding4 = com.qcwireless.qcwatch.ui.home.gps.GpsActivity.this.binding;
                com.qcwireless.qcwatch.databinding.ActivityGpsBinding activityGpsBinding6 = null;
                if (activityGpsBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsBinding4 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityGpsBinding4.btnGpsGo)) {
                    checkPermission = com.qcwireless.qcwatch.ui.home.gps.GpsActivity.this.checkPermission();
                    if (!checkPermission) {
                        com.qcwireless.qcwatch.ui.home.gps.GpsActivity.this.openBatteryWhiteList();
                        java.lang.String string = com.qcwireless.qcwatch.ui.home.gps.GpsActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_390);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_390)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                        return;
                    }
                    android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.home.gps.GpsActivity.this;
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.gps.GpsPrepareActivity.class);
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
                    return;
                }
                activityGpsBinding5 = com.qcwireless.qcwatch.ui.home.gps.GpsActivity.this.binding;
                if (activityGpsBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityGpsBinding6 = activityGpsBinding5;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityGpsBinding6.tvSportHistory)) {
                    android.app.Activity activity2 = (android.app.Activity) com.qcwireless.qcwatch.ui.home.gps.GpsActivity.this;
                    java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
                    android.content.Intent intent2 = new android.content.Intent(activity2, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.gps.GpsHistoryActivity.class);
                    for (kotlin.Pair pair2 : arrayList2) {
                        if (pair2 != null) {
                            java.lang.String str2 = (java.lang.String) pair2.getFirst();
                            java.lang.Object second2 = pair2.getSecond();
                            if (second2 instanceof java.lang.Integer) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).intValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Byte) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).byteValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Character) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Character) second2).charValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Short) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).shortValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Boolean) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Boolean) second2).booleanValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Long) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).longValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Float) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).floatValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Double) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).doubleValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.String) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.lang.String) second2), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.CharSequence) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.lang.CharSequence) second2), "putExtra(name, value)");
                            } else if (second2 instanceof android.os.Parcelable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Parcelable) second2), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Object[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                            } else if (second2 instanceof java.util.ArrayList) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                            } else if (second2 instanceof java.io.Serializable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                            } else if (second2 instanceof boolean[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (boolean[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof byte[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (byte[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof short[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (short[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof char[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (char[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof int[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (int[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof long[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (long[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof float[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (float[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof double[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (double[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof android.os.Bundle) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Bundle) second2), "putExtra(name, value)");
                            } else if (second2 instanceof android.content.Intent) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Parcelable) second2), "putExtra(name, value)");
                            } else {
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    activity2.startActivity(intent2);
                }
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
        getViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsActivity$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.gps.GpsActivity.m976setupViews$lambda2(com.qcwireless.qcwatch.ui.home.gps.GpsActivity.this, (java.lang.String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m976setupViews$lambda2(com.qcwireless.qcwatch.ui.home.gps.GpsActivity gpsActivity, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsActivity, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, str);
        com.qcwireless.qcwatch.databinding.ActivityGpsBinding activityGpsBinding = gpsActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityGpsBinding activityGpsBinding2 = null;
        if (activityGpsBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsBinding = null;
        }
        activityGpsBinding.tvTotalDistance.setText(str);
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
            com.qcwireless.qcwatch.databinding.ActivityGpsBinding activityGpsBinding3 = gpsActivity.binding;
            if (activityGpsBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGpsBinding2 = activityGpsBinding3;
            }
            activityGpsBinding2.tvGpsUnit.setText(gpsActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_88));
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityGpsBinding activityGpsBinding4 = gpsActivity.binding;
        if (activityGpsBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGpsBinding2 = activityGpsBinding4;
        }
        activityGpsBinding2.tvGpsUnit.setText(gpsActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_358));
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        getViewModel().queryTotalDistance();
        updateLocationUI();
        getDeviceLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkPermission() {
        if (android.os.Build.VERSION.SDK_INT < 23) {
            return false;
        }
        java.lang.Object systemService = getSystemService("power");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((android.os.PowerManager) systemService).isIgnoringBatteryOptimizations(getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openBatteryWhiteList() {
        try {
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                android.content.Intent intent = new android.content.Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                intent.setData(android.net.Uri.parse("package:" + getPackageName()));
                startActivityForResult(intent, com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.Type_Sync_TimeOut);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    /* compiled from: GpsActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GpsActivity$Callback;", "Landroid/location/GnssStatus$Callback;", "(Lcom/qcwireless/qcwatch/ui/home/gps/GpsActivity;)V", "onFirstFix", "", "ttffMillis", "", "onSatelliteStatusChanged", "status", "Landroid/location/GnssStatus;", "onStarted", "onStopped", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
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
            com.qcwireless.qcwatch.ui.home.gps.GpsActivity.this.setGpsStatues(status.getSatelliteCount());
        }
    }

    public final void setGpsStatues(int number) {
        com.qcwireless.qcwatch.databinding.ActivityGpsBinding activityGpsBinding = null;
        if (number <= 0) {
            com.qcwireless.qcwatch.databinding.ActivityGpsBinding activityGpsBinding2 = this.binding;
            if (activityGpsBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGpsBinding = activityGpsBinding2;
            }
            activityGpsBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_1);
            return;
        }
        if (number <= 2) {
            com.qcwireless.qcwatch.databinding.ActivityGpsBinding activityGpsBinding3 = this.binding;
            if (activityGpsBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGpsBinding = activityGpsBinding3;
            }
            activityGpsBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_2);
            return;
        }
        if (number <= 5) {
            com.qcwireless.qcwatch.databinding.ActivityGpsBinding activityGpsBinding4 = this.binding;
            if (activityGpsBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGpsBinding = activityGpsBinding4;
            }
            activityGpsBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_3);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityGpsBinding activityGpsBinding5 = this.binding;
        if (activityGpsBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGpsBinding = activityGpsBinding5;
        }
        activityGpsBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        try {
            this.gnss.onStopped();
            android.location.LocationManager locationManager = com.qcwireless.qcwatch.base.ktx.SystemServiceExtKt.getLocationManager((android.content.Context) this);
            kotlin.jvm.internal.Intrinsics.checkNotNull(locationManager);
            locationManager.unregisterGnssStatusCallback(this.gnss);
        } catch (java.lang.Exception unused) {
        }
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
                lastLocation.addOnCompleteListener((android.app.Activity) this, new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsActivity$$ExternalSyntheticLambda1
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(com.google.android.gms.tasks.Task task) {
                        com.qcwireless.qcwatch.ui.home.gps.GpsActivity.m975getDeviceLocation$lambda3(com.qcwireless.qcwatch.ui.home.gps.GpsActivity.this, task);
                    }
                });
            }
        } catch (java.lang.SecurityException e) {
            android.util.Log.e("Exception: %s", e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getDeviceLocation$lambda-3, reason: not valid java name */
    public static final void m975getDeviceLocation$lambda3(com.qcwireless.qcwatch.ui.home.gps.GpsActivity gpsActivity, com.google.android.gms.tasks.Task task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            android.location.Location location = (android.location.Location) task.getResult();
            gpsActivity.lastKnownLocation = location;
            if (location != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(location);
                double latitude = location.getLatitude();
                android.location.Location location2 = gpsActivity.lastKnownLocation;
                kotlin.jvm.internal.Intrinsics.checkNotNull(location2);
                com.qcwireless.qcwatch.ui.home.gps.bean.Gps transform2 = com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.transform2(latitude, location2.getLongitude());
                com.google.android.gms.maps.GoogleMap googleMap = gpsActivity.map;
                if (googleMap != null) {
                    googleMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(new com.google.android.gms.maps.model.LatLng(transform2.getWgLat(), transform2.getWgLon()), 15.0f));
                }
                com.google.android.gms.maps.GoogleMap googleMap2 = gpsActivity.map;
                if (googleMap2 != null) {
                    googleMap2.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(new com.google.android.gms.maps.model.LatLng(transform2.getWgLat(), transform2.getWgLon())).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(com.qcwireless.qcwatch.R.mipmap.gps_mark)).anchor(0.5f, 0.5f));
                    return;
                }
                return;
            }
            return;
        }
        android.util.Log.d(gpsActivity.getTAG(), "Current location is null. Using defaults.");
        android.util.Log.e(gpsActivity.getTAG(), "Exception: %s", task.getException());
        com.google.android.gms.maps.GoogleMap googleMap3 = gpsActivity.map;
        if (googleMap3 != null) {
            googleMap3.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(gpsActivity.defaultLocation, 15.0f));
        }
        com.google.android.gms.maps.GoogleMap googleMap4 = gpsActivity.map;
        com.google.android.gms.maps.UiSettings uiSettings = googleMap4 != null ? googleMap4.getUiSettings() : null;
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
        try {
            if (this.locationPermissionGranted) {
                if (googleMap != null) {
                    googleMap.setMyLocationEnabled(false);
                }
                com.google.android.gms.maps.GoogleMap googleMap2 = this.map;
                com.google.android.gms.maps.UiSettings uiSettings = googleMap2 != null ? googleMap2.getUiSettings() : null;
                if (uiSettings == null) {
                    return;
                }
                uiSettings.setMyLocationButtonEnabled(false);
                return;
            }
            if (googleMap != null) {
                googleMap.setMyLocationEnabled(false);
            }
            com.google.android.gms.maps.GoogleMap googleMap3 = this.map;
            com.google.android.gms.maps.UiSettings uiSettings2 = googleMap3 != null ? googleMap3.getUiSettings() : null;
            if (uiSettings2 != null) {
                uiSettings2.setMyLocationButtonEnabled(false);
            }
            this.lastKnownLocation = null;
            getLocationPermission();
        } catch (java.lang.SecurityException e) {
            android.util.Log.e("Exception: %s", e.getMessage(), e);
        }
    }
}
