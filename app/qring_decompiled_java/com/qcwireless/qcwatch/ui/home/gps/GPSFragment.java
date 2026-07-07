package com.qcwireless.qcwatch.ui.home.gps;

/* compiled from: GPSFragment.kt */
@kotlin.Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\f\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0003DEFB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020#H\u0017J&\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020#H\u0017J\b\u0010/\u001a\u00020#H\u0016J\u0010\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020\u000fH\u0016J\u0010\u00102\u001a\u00020#2\u0006\u00103\u001a\u000204H\u0007J\b\u00105\u001a\u00020#H\u0016J+\u00106\u001a\u00020#2\u0006\u00107\u001a\u0002082\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010:\u001a\u00020;H\u0016¢\u0006\u0002\u0010<J\b\u0010=\u001a\u00020#H\u0016J\u0010\u0010>\u001a\u00020#2\u0006\u0010?\u001a\u00020-H\u0016J\u000e\u0010@\u001a\u00020#2\u0006\u0010A\u001a\u000208J\b\u0010B\u001a\u00020#H\u0002J\b\u0010C\u001a\u00020#H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082.¢\u0006\u0004\n\u0002\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006G"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GPSFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentGPSBinding;", "cameraPosition", "Lcom/google/android/gms/maps/model/CameraPosition;", "defaultLocation", "Lcom/google/android/gms/maps/model/LatLng;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "gnss", "Landroid/location/GnssStatus$Callback;", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "lastKnownLocation", "Landroid/location/Location;", "locationManager", "Landroid/location/LocationManager;", "locationPermissionGranted", "", "mapView", "Lcom/google/android/gms/maps/MapView;", "titleList", "", "", "[Ljava/lang/String;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/gps/vm/GPSActivityViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/gps/vm/GPSActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getDeviceLocation", "", "getLocationPermission", "loadDataOnce", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLowMemory", "onMapReady", "map", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onPause", "onRequestPermissionsResult", "requestCode", "", "permissions", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSaveInstanceState", "outState", "setGpsStatues", "number", "showLocationWarningDialog", "updateLocationUI", "Callback", "Companion", "LocationPermissionCallback", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GPSFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment implements com.google.android.gms.maps.OnMapReadyCallback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.gps.GPSFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.gps.GPSFragment.Companion(null);
    private static final int DEFAULT_ZOOM = 15;
    private static final java.lang.String KEY_CAMERA_POSITION = "camera_position";
    private static final java.lang.String KEY_LOCATION = "location";
    private static final int M_MAX_ENTRIES = 5;
    private static final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;
    private com.qcwireless.qcwatch.databinding.FragmentGPSBinding binding;
    private com.google.android.gms.maps.model.CameraPosition cameraPosition;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    private com.google.android.gms.maps.GoogleMap googleMap;
    private android.location.Location lastKnownLocation;
    private android.location.LocationManager locationManager;
    private boolean locationPermissionGranted;
    private com.google.android.gms.maps.MapView mapView;
    private java.lang.String[] titleList;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private android.location.GnssStatus.Callback gnss = new com.qcwireless.qcwatch.ui.home.gps.GPSFragment.Callback();
    private final com.google.android.gms.maps.model.LatLng defaultLocation = new com.google.android.gms.maps.model.LatLng(-33.8523341d, 151.2106085d);

    public GPSFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GPSFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel m973invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel.class), qualifier, qualifier);
            }
        });
    }

    private final com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentGPSBinding inflate = com.qcwireless.qcwatch.databinding.FragmentGPSBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        java.lang.Object systemService = getActivity().getSystemService(KEY_LOCATION);
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.locationManager = (android.location.LocationManager) systemService;
        if (savedInstanceState != null) {
            this.lastKnownLocation = (android.location.Location) savedInstanceState.getParcelable(KEY_LOCATION);
            this.cameraPosition = (com.google.android.gms.maps.model.CameraPosition) savedInstanceState.getParcelable(KEY_CAMERA_POSITION);
        }
        com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(getActivity());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(activity)");
        this.fusedLocationProviderClient = fusedLocationProviderClient;
        com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding2 = null;
        if (fragmentGPSBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentGPSBinding = null;
        }
        com.google.android.gms.maps.MapView mapView = fragmentGPSBinding.mapview;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mapView, "binding.mapview");
        this.mapView = mapView;
        if (mapView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mapView");
            mapView = null;
        }
        mapView.onCreate(savedInstanceState);
        com.google.android.gms.maps.MapView mapView2 = this.mapView;
        if (mapView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mapView");
            mapView2 = null;
        }
        mapView2.getMapAsync(this);
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
        com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding3 = this.binding;
        if (fragmentGPSBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentGPSBinding2 = fragmentGPSBinding3;
        }
        return fragmentGPSBinding2.getRoot();
    }

    public void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
        com.google.android.gms.maps.GoogleMap googleMap = this.googleMap;
        if (googleMap == null) {
            return;
        }
        outState.putParcelable(KEY_CAMERA_POSITION, googleMap != null ? googleMap.getCameraPosition() : null);
        outState.putParcelable(KEY_LOCATION, this.lastKnownLocation);
        super.onSaveInstanceState(outState);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void loadDataOnce() {
        super.loadDataOnce();
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_6666028);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_6666028)");
        java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_6666029);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_6666029)");
        java.lang.String string3 = getString(com.qcwireless.qcwatch.R.string.qc_text_6666030);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_6666030)");
        this.titleList = new java.lang.String[]{string, string2, string3};
        android.view.View[] viewArr = new android.view.View[2];
        com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding2 = null;
        if (fragmentGPSBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentGPSBinding = null;
        }
        viewArr[0] = fragmentGPSBinding.btnGpsGo;
        com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding3 = this.binding;
        if (fragmentGPSBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentGPSBinding3 = null;
        }
        viewArr[1] = fragmentGPSBinding3.tvSportHistory;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GPSFragment$loadDataOnce$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding4;
                com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding5;
                com.qcwireless.qcwatch.ui.home.gps.GPSFragment gPSFragment;
                android.content.Context activity;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                fragmentGPSBinding4 = com.qcwireless.qcwatch.ui.home.gps.GPSFragment.this.binding;
                com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding6 = null;
                if (fragmentGPSBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentGPSBinding4 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentGPSBinding4.btnGpsGo)) {
                    com.qcwireless.qcwatch.ui.home.gps.GPSFragment.this.showLocationWarningDialog();
                    return;
                }
                fragmentGPSBinding5 = com.qcwireless.qcwatch.ui.home.gps.GPSFragment.this.binding;
                if (fragmentGPSBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentGPSBinding6 = fragmentGPSBinding5;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentGPSBinding6.tvSportHistory) || (activity = (gPSFragment = com.qcwireless.qcwatch.ui.home.gps.GPSFragment.this).getActivity()) == null) {
                    return;
                }
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
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
                gPSFragment.startActivity(intent);
            }
        });
        if (androidx.core.app.ActivityCompat.checkSelfPermission(getActivity(), com.hjq.permissions.Permission.ACCESS_FINE_LOCATION) != 0) {
            return;
        }
        android.location.LocationManager locationManager = this.locationManager;
        if (locationManager == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("locationManager");
            locationManager = null;
        }
        locationManager.registerGnssStatusCallback(this.gnss, (android.os.Handler) null);
        getViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.gps.GPSFragment$$ExternalSyntheticLambda2
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.gps.GPSFragment.m970loadDataOnce$lambda1(com.qcwireless.qcwatch.ui.home.gps.GPSFragment.this, (java.lang.String) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding4 = this.binding;
        if (fragmentGPSBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentGPSBinding4 = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView qSwitchButtonView = fragmentGPSBinding4.gpsQsvView;
        java.lang.String[] strArr = this.titleList;
        if (strArr == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("titleList");
            strArr = null;
        }
        qSwitchButtonView.setTitle(strArr);
        com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding5 = this.binding;
        if (fragmentGPSBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentGPSBinding5 = null;
        }
        fragmentGPSBinding5.gpsQsvView.select(0, true);
        com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding6 = this.binding;
        if (fragmentGPSBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentGPSBinding6 = null;
        }
        fragmentGPSBinding6.gpsQsvView.setActivity((com.qcwireless.qcwatch.ui.base.BaseActivity) getActivity());
        com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding7 = this.binding;
        if (fragmentGPSBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentGPSBinding2 = fragmentGPSBinding7;
        }
        fragmentGPSBinding2.gpsQsvView.setOnTabSelectedListener(new com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView.OnTabSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GPSFragment$loadDataOnce$3
            @Override // com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView.OnTabSelectedListener
            public void onTabSelected(int index) {
                com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding8;
                com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding9;
                com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding10;
                com.qcwireless.qcwatch.QJavaApplication.getInstance().setGpsType(index);
                com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding11 = null;
                if (index == 0) {
                    fragmentGPSBinding8 = com.qcwireless.qcwatch.ui.home.gps.GPSFragment.this.binding;
                    if (fragmentGPSBinding8 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentGPSBinding11 = fragmentGPSBinding8;
                    }
                    fragmentGPSBinding11.tvSportHistory.setText(com.qcwireless.qcwatch.ui.home.gps.GPSFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_274));
                    return;
                }
                if (index == 1) {
                    fragmentGPSBinding9 = com.qcwireless.qcwatch.ui.home.gps.GPSFragment.this.binding;
                    if (fragmentGPSBinding9 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentGPSBinding11 = fragmentGPSBinding9;
                    }
                    fragmentGPSBinding11.tvSportHistory.setText(com.qcwireless.qcwatch.ui.home.gps.GPSFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_6666552));
                    return;
                }
                if (index != 2) {
                    return;
                }
                fragmentGPSBinding10 = com.qcwireless.qcwatch.ui.home.gps.GPSFragment.this.binding;
                if (fragmentGPSBinding10 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentGPSBinding11 = fragmentGPSBinding10;
                }
                fragmentGPSBinding11.tvSportHistory.setText(com.qcwireless.qcwatch.ui.home.gps.GPSFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_6666553));
            }
        });
        getViewModel().queryTotalDistance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-1, reason: not valid java name */
    public static final void m970loadDataOnce$lambda1(com.qcwireless.qcwatch.ui.home.gps.GPSFragment gPSFragment, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gPSFragment, "this$0");
        com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding = gPSFragment.binding;
        com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding2 = null;
        if (fragmentGPSBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentGPSBinding = null;
        }
        fragmentGPSBinding.tvTotalDistance.setText(str);
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
            com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding3 = gPSFragment.binding;
            if (fragmentGPSBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentGPSBinding2 = fragmentGPSBinding3;
            }
            fragmentGPSBinding2.tvGpsUnit.setText(gPSFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_88));
            return;
        }
        com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding4 = gPSFragment.binding;
        if (fragmentGPSBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentGPSBinding2 = fragmentGPSBinding4;
        }
        fragmentGPSBinding2.tvGpsUnit.setText(gPSFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_358));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLocationWarningDialog() {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_location_warning);
        objectRef.element = builder.create();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).show();
        android.view.View contentView = ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GPSFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.gps.GPSFragment.m971showLocationWarningDialog$lambda2(objectRef, this, view);
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GPSFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.gps.GPSFragment.m972showLocationWarningDialog$lambda3(objectRef, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLocationWarningDialog$lambda-2, reason: not valid java name */
    public static final void m971showLocationWarningDialog$lambda2(kotlin.jvm.internal.Ref.ObjectRef objectRef, com.qcwireless.qcwatch.ui.home.gps.GPSFragment gPSFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gPSFragment, "this$0");
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
        com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestLocationPermission(gPSFragment.getActivity(), gPSFragment.new LocationPermissionCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLocationWarningDialog$lambda-3, reason: not valid java name */
    public static final void m972showLocationWarningDialog$lambda3(kotlin.jvm.internal.Ref.ObjectRef objectRef, com.qcwireless.qcwatch.ui.home.gps.GPSFragment gPSFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gPSFragment, "this$0");
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
        com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestLocationPermission(gPSFragment.getActivity(), gPSFragment.new LocationPermissionCallback());
    }

    /* compiled from: GPSFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GPSFragment$Callback;", "Landroid/location/GnssStatus$Callback;", "(Lcom/qcwireless/qcwatch/ui/home/gps/GPSFragment;)V", "onFirstFix", "", "ttffMillis", "", "onSatelliteStatusChanged", "status", "Landroid/location/GnssStatus;", "onStarted", "onStopped", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
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
            com.qcwireless.qcwatch.ui.home.gps.GPSFragment.this.setGpsStatues(status.getSatelliteCount());
        }
    }

    /* compiled from: GPSFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GPSFragment$LocationPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/home/gps/GPSFragment;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class LocationPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public LocationPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getLocationOnce(com.qcwireless.qcwatch.QCApplication.INSTANCE.getApplication());
            com.qcwireless.qcwatch.ui.home.gps.GPSFragment gPSFragment = com.qcwireless.qcwatch.ui.home.gps.GPSFragment.this;
            android.content.Context activity = gPSFragment.getActivity();
            if (activity != null) {
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
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
                gPSFragment.startActivity(intent);
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, permissions);
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            if (never) {
                java.lang.String string = com.qcwireless.qcwatch.ui.home.gps.GPSFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                com.hjq.permissions.XXPermissions.startPermissionActivity(com.qcwireless.qcwatch.ui.home.gps.GPSFragment.this.getActivity(), permissions);
            }
        }
    }

    public final void setGpsStatues(int number) {
        com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding = null;
        if (number <= 0) {
            com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding2 = this.binding;
            if (fragmentGPSBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentGPSBinding = fragmentGPSBinding2;
            }
            fragmentGPSBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_1);
            return;
        }
        if (number <= 2) {
            com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding3 = this.binding;
            if (fragmentGPSBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentGPSBinding = fragmentGPSBinding3;
            }
            fragmentGPSBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_2);
            return;
        }
        if (number <= 5) {
            com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding4 = this.binding;
            if (fragmentGPSBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentGPSBinding = fragmentGPSBinding4;
            }
            fragmentGPSBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_3);
            return;
        }
        com.qcwireless.qcwatch.databinding.FragmentGPSBinding fragmentGPSBinding5 = this.binding;
        if (fragmentGPSBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentGPSBinding = fragmentGPSBinding5;
        }
        fragmentGPSBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_4);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onDestroy() {
        super.onDestroy();
        try {
            com.google.android.gms.maps.MapView mapView = this.mapView;
            android.location.LocationManager locationManager = null;
            if (mapView == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mapView");
                mapView = null;
            }
            mapView.onDestroy();
            this.gnss.onStopped();
            android.location.LocationManager locationManager2 = this.locationManager;
            if (locationManager2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("locationManager");
            } else {
                locationManager = locationManager2;
            }
            locationManager.unregisterGnssStatusCallback(this.gnss);
            org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onResume() {
        super.onResume();
        com.google.android.gms.maps.MapView mapView = this.mapView;
        if (mapView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mapView");
            mapView = null;
        }
        mapView.onResume();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onPause() {
        super.onPause();
        com.google.android.gms.maps.MapView mapView = this.mapView;
        if (mapView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mapView");
            mapView = null;
        }
        mapView.onPause();
    }

    public void onLowMemory() {
        super.onLowMemory();
        com.google.android.gms.maps.MapView mapView = this.mapView;
        if (mapView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mapView");
            mapView = null;
        }
        mapView.onLowMemory();
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, messageEvent.getClass().getName());
        if ((messageEvent instanceof com.qcwireless.qcwatch.base.event.RefreshEvent) && kotlin.jvm.internal.Intrinsics.areEqual(getClass(), ((com.qcwireless.qcwatch.base.event.RefreshEvent) messageEvent).getActivityClass())) {
            getViewModel().queryTotalDistance();
        }
    }

    private final void getDeviceLocation() {
        if (this.googleMap == null) {
            return;
        }
        try {
            if (this.locationPermissionGranted) {
                com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = this.fusedLocationProviderClient;
                if (fusedLocationProviderClient == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("fusedLocationProviderClient");
                    fusedLocationProviderClient = null;
                }
                com.google.android.gms.tasks.Task<android.location.Location> lastLocation = fusedLocationProviderClient.getLastLocation();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lastLocation, "fusedLocationProviderClient.lastLocation");
                lastLocation.addOnCompleteListener(getActivity(), new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GPSFragment$$ExternalSyntheticLambda3
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(com.google.android.gms.tasks.Task task) {
                        com.qcwireless.qcwatch.ui.home.gps.GPSFragment.m969getDeviceLocation$lambda4(com.qcwireless.qcwatch.ui.home.gps.GPSFragment.this, task);
                    }
                });
                return;
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "没有权限");
        } catch (java.lang.SecurityException e) {
            android.util.Log.e("Exception: %s", e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getDeviceLocation$lambda-4, reason: not valid java name */
    public static final void m969getDeviceLocation$lambda4(com.qcwireless.qcwatch.ui.home.gps.GPSFragment gPSFragment, com.google.android.gms.tasks.Task task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gPSFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            android.location.Location location = (android.location.Location) task.getResult();
            gPSFragment.lastKnownLocation = location;
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, location);
            android.location.Location location2 = gPSFragment.lastKnownLocation;
            if (location2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(location2);
                double latitude = location2.getLatitude();
                android.location.Location location3 = gPSFragment.lastKnownLocation;
                kotlin.jvm.internal.Intrinsics.checkNotNull(location3);
                com.qcwireless.qcwatch.ui.home.gps.bean.Gps transform2 = com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.transform2(latitude, location3.getLongitude());
                com.google.android.gms.maps.GoogleMap googleMap = gPSFragment.googleMap;
                if (googleMap != null) {
                    googleMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(new com.google.android.gms.maps.model.LatLng(transform2.getWgLat(), transform2.getWgLon()), 15.0f));
                }
                com.google.android.gms.maps.GoogleMap googleMap2 = gPSFragment.googleMap;
                if (googleMap2 != null) {
                    googleMap2.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(new com.google.android.gms.maps.model.LatLng(transform2.getWgLat(), transform2.getWgLon())).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(com.qcwireless.qcwatch.R.mipmap.gps_mark)).anchor(0.5f, 0.5f));
                }
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "移动到点");
            return;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "Current location is null. Using defaults.");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, task.getException());
        com.google.android.gms.maps.GoogleMap googleMap3 = gPSFragment.googleMap;
        if (googleMap3 != null) {
            googleMap3.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(gPSFragment.defaultLocation, 15.0f));
        }
        com.google.android.gms.maps.GoogleMap googleMap4 = gPSFragment.googleMap;
        com.google.android.gms.maps.UiSettings uiSettings = googleMap4 != null ? googleMap4.getUiSettings() : null;
        if (uiSettings == null) {
            return;
        }
        uiSettings.setMyLocationButtonEnabled(false);
    }

    private final void getLocationPermission() {
        if (androidx.core.content.ContextCompat.checkSelfPermission(getActivity(), com.hjq.permissions.Permission.ACCESS_FINE_LOCATION) == 0) {
            this.locationPermissionGranted = true;
        } else {
            androidx.core.app.ActivityCompat.requestPermissions(getActivity(), new java.lang.String[]{com.hjq.permissions.Permission.ACCESS_FINE_LOCATION}, 1);
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
        com.google.android.gms.maps.GoogleMap googleMap = this.googleMap;
        if (googleMap == null) {
            return;
        }
        try {
            if (this.locationPermissionGranted) {
                if (googleMap != null) {
                    googleMap.setMyLocationEnabled(false);
                }
                com.google.android.gms.maps.GoogleMap googleMap2 = this.googleMap;
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
            com.google.android.gms.maps.GoogleMap googleMap3 = this.googleMap;
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

    /* compiled from: GPSFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GPSFragment$Companion;", "", "()V", "DEFAULT_ZOOM", "", "KEY_CAMERA_POSITION", "", "KEY_LOCATION", "M_MAX_ENTRIES", "PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/gps/GPSFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.gps.GPSFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.gps.GPSFragment();
        }
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public void onMapReady(com.google.android.gms.maps.GoogleMap map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "map");
        this.googleMap = map;
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "--------------onMapReady");
        getLocationPermission();
        updateLocationUI();
        getDeviceLocation();
    }
}
