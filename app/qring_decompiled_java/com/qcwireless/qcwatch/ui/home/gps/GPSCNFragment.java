package com.qcwireless.qcwatch.ui.home.gps;

/* compiled from: GPSCNFragment.kt */
@kotlin.Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u0000 D2\u00020\u0001:\u0003CDEB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020'H\u0002J\b\u0010)\u001a\u00020'H\u0002J\b\u0010*\u001a\u00020'H\u0017J&\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020'H\u0017J\b\u00104\u001a\u00020'H\u0016J\u0010\u00105\u001a\u00020'2\u0006\u00106\u001a\u000207H\u0007J\b\u00108\u001a\u00020'H\u0016J+\u00109\u001a\u00020'2\u0006\u0010:\u001a\u00020;2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010=\u001a\u00020>H\u0016¢\u0006\u0002\u0010?J\b\u0010@\u001a\u00020'H\u0016J\u000e\u0010A\u001a\u00020'2\u0006\u0010B\u001a\u00020;R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082.¢\u0006\u0004\n\u0002\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006F"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GPSCNFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "aMap", "Lcom/amap/api/maps/AMap;", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentGPSCnBinding;", "defaultLocation", "Lcom/amap/api/maps/model/LatLng;", "gnss", "Landroid/location/GnssStatus$Callback;", "lastKnownLocation", "Landroid/location/Location;", "locationClient", "Lcom/amap/api/location/AMapLocationClient;", "locationListener", "Lcom/qcwireless/qcwatch/ui/home/gps/GPSCNFragment$MyAMapLocationListener;", "locationManager", "Landroid/location/LocationManager;", "locationOption", "Lcom/amap/api/location/AMapLocationClientOption;", "locationPermissionGranted", "", "mapView", "Lcom/amap/api/maps/MapView;", "myLocationStyle", "Lcom/amap/api/maps/model/MyLocationStyle;", "titleList", "", "", "[Ljava/lang/String;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/gps/vm/GPSActivityViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/gps/vm/GPSActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getDefaultOption", "getLocationPermission", "", "initLocation", "initMap", "loadDataOnce", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLowMemory", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onPause", "onRequestPermissionsResult", "requestCode", "", "permissions", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "setGpsStatues", "number", "Callback", "Companion", "MyAMapLocationListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GPSCNFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.Companion(null);
    private static final int DEFAULT_ZOOM = 15;
    private static final java.lang.String KEY_CAMERA_POSITION = "camera_position";
    private static final java.lang.String KEY_LOCATION = "location";
    private static final int M_MAX_ENTRIES = 5;
    private static final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;
    private com.amap.api.maps.AMap aMap;
    private com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding binding;
    private android.location.Location lastKnownLocation;
    private com.amap.api.location.AMapLocationClient locationClient;
    private android.location.LocationManager locationManager;
    private com.amap.api.location.AMapLocationClientOption locationOption;
    private boolean locationPermissionGranted;
    private com.amap.api.maps.MapView mapView;
    private com.amap.api.maps.model.MyLocationStyle myLocationStyle;
    private java.lang.String[] titleList;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private android.location.GnssStatus.Callback gnss = new com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.Callback();
    private final com.amap.api.maps.model.LatLng defaultLocation = new com.amap.api.maps.model.LatLng(-33.8523341d, 151.2106085d);
    private final com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.MyAMapLocationListener locationListener = new com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.MyAMapLocationListener();

    public GPSCNFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel m965invoke() {
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
        com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding inflate = com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        java.lang.Object systemService = getActivity().getSystemService(KEY_LOCATION);
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.locationManager = (android.location.LocationManager) systemService;
        if (savedInstanceState != null) {
            this.lastKnownLocation = (android.location.Location) savedInstanceState.getParcelable(KEY_LOCATION);
        }
        com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding2 = null;
        if (fragmentGPSCnBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentGPSCnBinding = null;
        }
        com.amap.api.maps.MapView mapView = fragmentGPSCnBinding.mapview;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mapView, "binding.mapview");
        this.mapView = mapView;
        if (mapView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mapView");
            mapView = null;
        }
        mapView.onCreate(savedInstanceState);
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
        com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding3 = this.binding;
        if (fragmentGPSCnBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentGPSCnBinding2 = fragmentGPSCnBinding3;
        }
        return fragmentGPSCnBinding2.getRoot();
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
        getLocationPermission();
        android.view.View[] viewArr = new android.view.View[2];
        com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding2 = null;
        if (fragmentGPSCnBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentGPSCnBinding = null;
        }
        viewArr[0] = fragmentGPSCnBinding.btnGpsGo;
        com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding3 = this.binding;
        if (fragmentGPSCnBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentGPSCnBinding3 = null;
        }
        viewArr[1] = fragmentGPSCnBinding3.tvSportHistory;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment$loadDataOnce$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding4;
                com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding5;
                com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment gPSCNFragment;
                android.content.Context activity;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                fragmentGPSCnBinding4 = com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.this.binding;
                com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding6 = null;
                if (fragmentGPSCnBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentGPSCnBinding4 = null;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentGPSCnBinding4.btnGpsGo)) {
                    fragmentGPSCnBinding5 = com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.this.binding;
                    if (fragmentGPSCnBinding5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentGPSCnBinding6 = fragmentGPSCnBinding5;
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentGPSCnBinding6.tvSportHistory) || (activity = (gPSCNFragment = com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.this).getActivity()) == null) {
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
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                    gPSCNFragment.startActivity(intent);
                    kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                    return;
                }
                com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment gPSCNFragment2 = com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.this;
                android.content.Context activity2 = gPSCNFragment2.getActivity();
                if (activity2 != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity2, "it");
                    android.content.Intent intent2 = new android.content.Intent(activity2, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.gps.GpsPrepareActivity.class);
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
                                kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                    gPSCNFragment2.startActivity(intent2);
                    kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit12 = kotlin.Unit.INSTANCE;
                }
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
        getViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.m964loadDataOnce$lambda0(com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.this, (java.lang.String) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding4 = this.binding;
        if (fragmentGPSCnBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentGPSCnBinding4 = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView qSwitchButtonView = fragmentGPSCnBinding4.gpsQsvView;
        java.lang.String[] strArr = this.titleList;
        if (strArr == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("titleList");
            strArr = null;
        }
        qSwitchButtonView.setTitle(strArr);
        com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding5 = this.binding;
        if (fragmentGPSCnBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentGPSCnBinding5 = null;
        }
        fragmentGPSCnBinding5.gpsQsvView.select(0, true);
        com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding6 = this.binding;
        if (fragmentGPSCnBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentGPSCnBinding6 = null;
        }
        fragmentGPSCnBinding6.gpsQsvView.setActivity((com.qcwireless.qcwatch.ui.base.BaseActivity) getActivity());
        com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding7 = this.binding;
        if (fragmentGPSCnBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentGPSCnBinding2 = fragmentGPSCnBinding7;
        }
        fragmentGPSCnBinding2.gpsQsvView.setOnTabSelectedListener(new com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView.OnTabSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment$loadDataOnce$3
            @Override // com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView.OnTabSelectedListener
            public void onTabSelected(int index) {
                com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding8;
                com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding9;
                com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding10;
                com.qcwireless.qcwatch.QJavaApplication.getInstance().setGpsType(index);
                com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding11 = null;
                if (index == 0) {
                    fragmentGPSCnBinding8 = com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.this.binding;
                    if (fragmentGPSCnBinding8 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentGPSCnBinding11 = fragmentGPSCnBinding8;
                    }
                    fragmentGPSCnBinding11.tvSportHistory.setText(com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_274));
                    return;
                }
                if (index == 1) {
                    fragmentGPSCnBinding9 = com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.this.binding;
                    if (fragmentGPSCnBinding9 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentGPSCnBinding11 = fragmentGPSCnBinding9;
                    }
                    fragmentGPSCnBinding11.tvSportHistory.setText(com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_6666552));
                    return;
                }
                if (index != 2) {
                    return;
                }
                fragmentGPSCnBinding10 = com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.this.binding;
                if (fragmentGPSCnBinding10 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentGPSCnBinding11 = fragmentGPSCnBinding10;
                }
                fragmentGPSCnBinding11.tvSportHistory.setText(com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_6666553));
            }
        });
        getViewModel().queryTotalDistance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-0, reason: not valid java name */
    public static final void m964loadDataOnce$lambda0(com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment gPSCNFragment, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gPSCNFragment, "this$0");
        com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding = gPSCNFragment.binding;
        com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding2 = null;
        if (fragmentGPSCnBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentGPSCnBinding = null;
        }
        fragmentGPSCnBinding.tvTotalDistance.setText(str);
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
            com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding3 = gPSCNFragment.binding;
            if (fragmentGPSCnBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentGPSCnBinding2 = fragmentGPSCnBinding3;
            }
            fragmentGPSCnBinding2.tvGpsUnit.setText(gPSCNFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_88));
            return;
        }
        com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding4 = gPSCNFragment.binding;
        if (fragmentGPSCnBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentGPSCnBinding2 = fragmentGPSCnBinding4;
        }
        fragmentGPSCnBinding2.tvGpsUnit.setText(gPSCNFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_358));
    }

    /* compiled from: GPSCNFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GPSCNFragment$Callback;", "Landroid/location/GnssStatus$Callback;", "(Lcom/qcwireless/qcwatch/ui/home/gps/GPSCNFragment;)V", "onFirstFix", "", "ttffMillis", "", "onSatelliteStatusChanged", "status", "Landroid/location/GnssStatus;", "onStarted", "onStopped", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
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
            com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.this.setGpsStatues(status.getSatelliteCount());
        }
    }

    public final void setGpsStatues(int number) {
        com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding = null;
        if (number <= 0) {
            com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding2 = this.binding;
            if (fragmentGPSCnBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentGPSCnBinding = fragmentGPSCnBinding2;
            }
            fragmentGPSCnBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_1);
            return;
        }
        if (number <= 2) {
            com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding3 = this.binding;
            if (fragmentGPSCnBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentGPSCnBinding = fragmentGPSCnBinding3;
            }
            fragmentGPSCnBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_2);
            return;
        }
        if (number <= 5) {
            com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding4 = this.binding;
            if (fragmentGPSCnBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentGPSCnBinding = fragmentGPSCnBinding4;
            }
            fragmentGPSCnBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_3);
            return;
        }
        com.qcwireless.qcwatch.databinding.FragmentGPSCnBinding fragmentGPSCnBinding5 = this.binding;
        if (fragmentGPSCnBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentGPSCnBinding = fragmentGPSCnBinding5;
        }
        fragmentGPSCnBinding.imageSignal.setImageResource(com.qcwireless.qcwatch.R.mipmap.signal_4);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onDestroy() {
        super.onDestroy();
        try {
            com.amap.api.maps.MapView mapView = this.mapView;
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
        com.amap.api.maps.MapView mapView = this.mapView;
        if (mapView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mapView");
            mapView = null;
        }
        mapView.onResume();
        initMap();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onPause() {
        super.onPause();
        com.amap.api.maps.MapView mapView = this.mapView;
        if (mapView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mapView");
            mapView = null;
        }
        mapView.onPause();
    }

    public void onLowMemory() {
        super.onLowMemory();
        com.amap.api.maps.MapView mapView = this.mapView;
        if (mapView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mapView");
            mapView = null;
        }
        mapView.onLowMemory();
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if ((messageEvent instanceof com.qcwireless.qcwatch.base.event.RefreshEvent) && kotlin.jvm.internal.Intrinsics.areEqual(getClass(), ((com.qcwireless.qcwatch.base.event.RefreshEvent) messageEvent).getActivityClass())) {
            getViewModel().queryTotalDistance();
        }
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
            aMap.setLocationSource(new com.amap.api.maps.LocationSource() { // from class: com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment$initMap$1
                public void deactivate() {
                }

                public void activate(com.amap.api.maps.LocationSource.OnLocationChangedListener p0) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "activate");
                    com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.this.initLocation();
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
        aMap3.setMyLocationEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initLocation() {
        try {
            this.locationClient = new com.amap.api.location.AMapLocationClient(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication());
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
    }

    /* compiled from: GPSCNFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GPSCNFragment$Companion;", "", "()V", "DEFAULT_ZOOM", "", "KEY_CAMERA_POSITION", "", "KEY_LOCATION", "M_MAX_ENTRIES", "PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/gps/GPSCNFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment();
        }
    }

    /* compiled from: GPSCNFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GPSCNFragment$MyAMapLocationListener;", "Lcom/amap/api/location/AMapLocationListener;", "(Lcom/qcwireless/qcwatch/ui/home/gps/GPSCNFragment;)V", "onLocationChanged", "", "amapLocation", "Lcom/amap/api/location/AMapLocation;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyAMapLocationListener implements com.amap.api.location.AMapLocationListener {
        public MyAMapLocationListener() {
        }

        public void onLocationChanged(com.amap.api.location.AMapLocation amapLocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amapLocation, "amapLocation");
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "lat:" + amapLocation.getLatitude() + "lon:" + amapLocation.getLongitude());
            com.amap.api.maps.model.LatLng latLng = new com.amap.api.maps.model.LatLng(amapLocation.getLatitude(), amapLocation.getLongitude());
            com.amap.api.maps.model.BitmapDescriptor fromBitmap = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(android.graphics.BitmapFactory.decodeResource(com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.this.getResources(), com.qcwireless.qcwatch.R.mipmap.gps_mark));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromBitmap, "fromBitmap(bMap)");
            com.amap.api.maps.model.MarkerOptions markerOptions = new com.amap.api.maps.model.MarkerOptions();
            markerOptions.icon(fromBitmap);
            markerOptions.anchor(0.5f, 0.5f);
            markerOptions.position(latLng);
            com.amap.api.maps.AMap aMap = com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.this.aMap;
            if (aMap != null) {
                aMap.clear();
            }
            com.amap.api.maps.AMap aMap2 = com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.this.aMap;
            if (aMap2 != null) {
                aMap2.addMarker(markerOptions);
            }
            com.amap.api.maps.AMap aMap3 = com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.this.aMap;
            if (aMap3 != null) {
                aMap3.moveCamera(com.amap.api.maps.CameraUpdateFactory.newLatLngZoom(latLng, 18.0f));
            }
        }
    }
}
