package com.qcwireless.qcwatch.ui.home.gps;

/* compiled from: GpsMapActivity.kt */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0012\u0010*\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\b\u0010-\u001a\u00020$H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\nR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006/"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GpsMapActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityGpsMapBinding;", "calorieTotal", "", "getCalorieTotal", "()F", "setCalorieTotal", "(F)V", "cameraPosition", "Lcom/google/android/gms/maps/model/CameraPosition;", "df", "Ljava/text/DecimalFormat;", "distanceInMeters", "getDistanceInMeters", "setDistanceInMeters", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "pathPoint", "", "Lcom/qcwireless/qcwatch/ui/home/gps/bean/QcLatLon;", "showKm", "", "getShowKm", "()I", "setShowKm", "(I)V", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/gps/vm/GPSActivityViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/gps/vm/GPSActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addLatestPolyline", "", "map", "Lcom/google/android/gms/maps/GoogleMap;", "checkPermission", "", "moveCameraToUser", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GpsMapActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private static final int DEFAULT_ZOOM = 15;
    private static final java.lang.String KEY_CAMERA_POSITION = "camera_position";
    private static final java.lang.String KEY_LOCATION = "location";
    private static final int M_MAX_ENTRIES = 5;
    private static final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;
    private com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding binding;
    private float calorieTotal;
    private com.google.android.gms.maps.model.CameraPosition cameraPosition;
    private java.text.DecimalFormat df;
    private float distanceInMeters;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    private java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon> pathPoint = new java.util.ArrayList();
    private int showKm;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public GpsMapActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsMapActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel m996invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel.class), qualifier, qualifier);
            }
        });
    }

    private final com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel) this.viewModel.getValue();
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

    public final int getShowKm() {
        return this.showKm;
    }

    public final void setShowKm(int i) {
        this.showKm = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding inflate = com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding activityGpsMapBinding = null;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        android.view.View root = inflate.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        setContentView(root);
        com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient((android.app.Activity) this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(this)");
        this.fusedLocationProviderClient = fusedLocationProviderClient;
        long longExtra = getIntent().getLongExtra("start", 0L);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Long.valueOf(longExtra));
        getViewModel().queryByStartTime(longExtra);
        getViewModel().getGpsDetail().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsMapActivity$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.gps.GpsMapActivity.m994onCreate$lambda0(com.qcwireless.qcwatch.ui.home.gps.GpsMapActivity.this, (com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding activityGpsMapBinding2 = this.binding;
        if (activityGpsMapBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsMapBinding2 = null;
        }
        activityGpsMapBinding2.mapView.onCreate(null);
        com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding activityGpsMapBinding3 = this.binding;
        if (activityGpsMapBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsMapBinding3 = null;
        }
        activityGpsMapBinding3.mapView.onResume();
        com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding activityGpsMapBinding4 = this.binding;
        if (activityGpsMapBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGpsMapBinding = activityGpsMapBinding4;
        }
        activityGpsMapBinding.mapView.getMapAsync(new com.google.android.gms.maps.OnMapReadyCallback() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsMapActivity$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.maps.OnMapReadyCallback
            public final void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
                com.qcwireless.qcwatch.ui.home.gps.GpsMapActivity.m995onCreate$lambda1(com.qcwireless.qcwatch.ui.home.gps.GpsMapActivity.this, googleMap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final void m994onCreate$lambda0(com.qcwireless.qcwatch.ui.home.gps.GpsMapActivity gpsMapActivity, com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail gpsDetail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsMapActivity, "this$0");
        if (gpsDetail != null) {
            com.qcwireless.qcwatch.base.utils.MoshiUtils moshiUtils = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE;
            java.lang.String locations = gpsDetail.getLocations();
            java.lang.reflect.ParameterizedType newParameterizedType = com.squareup.moshi.Types.newParameterizedType(java.util.List.class, new java.lang.reflect.Type[]{com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon.class});
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newParameterizedType, "newParameterizedType(Mut…lass.java, T::class.java)");
            java.util.ArrayList arrayList = (java.util.List) moshiUtils.fromJson(locations, newParameterizedType);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            gpsMapActivity.pathPoint = arrayList;
            com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding activityGpsMapBinding = null;
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
                com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding activityGpsMapBinding2 = gpsMapActivity.binding;
                if (activityGpsMapBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsMapBinding2 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView = activityGpsMapBinding2.gpsDistance;
                java.text.DecimalFormat decimalFormat = gpsMapActivity.df;
                if (decimalFormat == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("df");
                    decimalFormat = null;
                }
                java.lang.String format = decimalFormat.format(java.lang.Float.valueOf(gpsDetail.getDistance() / 1000));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "df.format(it.distance / 1000)");
                qSportItemView.setItemTitle(format);
                com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding activityGpsMapBinding3 = gpsMapActivity.binding;
                if (activityGpsMapBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsMapBinding3 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView2 = activityGpsMapBinding3.gpsDistance;
                java.lang.String string = gpsMapActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_88);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_88)");
                qSportItemView2.setItemUnit(string);
            } else {
                com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding activityGpsMapBinding4 = gpsMapActivity.binding;
                if (activityGpsMapBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsMapBinding4 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView3 = activityGpsMapBinding4.gpsDistance;
                java.text.DecimalFormat decimalFormat2 = gpsMapActivity.df;
                if (decimalFormat2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("df");
                    decimalFormat2 = null;
                }
                java.lang.String format2 = decimalFormat2.format(java.lang.Float.valueOf(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kmToIn(gpsDetail.getDistance() / 1000)));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "df.format(kmToIn(it.distance / 1000))");
                qSportItemView3.setItemTitle(format2);
                com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding activityGpsMapBinding5 = gpsMapActivity.binding;
                if (activityGpsMapBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsMapBinding5 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView4 = activityGpsMapBinding5.gpsDistance;
                java.lang.String string2 = gpsMapActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_358);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_358)");
                qSportItemView4.setItemUnit(string2);
            }
            com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding activityGpsMapBinding6 = gpsMapActivity.binding;
            if (activityGpsMapBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityGpsMapBinding6 = null;
            }
            activityGpsMapBinding6.gpsCalorie.setItemTitle(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(gpsDetail.getCalorie())));
            com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding activityGpsMapBinding7 = gpsMapActivity.binding;
            if (activityGpsMapBinding7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGpsMapBinding = activityGpsMapBinding7;
            }
            com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView5 = activityGpsMapBinding.gpsTimes;
            java.lang.String minsToHHmmdd = com.qcwireless.qc_utils.date.DateUtil.minsToHHmmdd(gpsDetail.getDuration() / 1000);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(minsToHHmmdd, "minsToHHmmdd(it.duration / 1000)");
            qSportItemView5.setItemTitle(minsToHHmmdd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1, reason: not valid java name */
    public static final void m995onCreate$lambda1(com.qcwireless.qcwatch.ui.home.gps.GpsMapActivity gpsMapActivity, com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsMapActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "it");
        gpsMapActivity.addLatestPolyline(googleMap);
        gpsMapActivity.moveCameraToUser(googleMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addLatestPolyline(com.google.android.gms.maps.GoogleMap map) {
        int i;
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(this.pathPoint.size()));
        if ((!this.pathPoint.isEmpty()) && this.pathPoint.size() > 2) {
            com.google.android.gms.maps.model.PolylineOptions jointType = new com.google.android.gms.maps.model.PolylineOptions().width(10.0f).jointType(2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jointType, "PolylineOptions()\n      …ointType(JointType.ROUND)");
            for (com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon qcLatLon : this.pathPoint) {
                jointType.add(new com.google.android.gms.maps.model.LatLng(qcLatLon.getLatitude(), qcLatLon.getLongitude()));
                jointType.addSpan(new com.google.android.gms.maps.model.StyleSpan(com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.getPaceColor(qcLatLon.getSpeed())));
            }
            map.addPolyline(jointType);
        }
        float f = 0.0f;
        int size = this.pathPoint.size() - 2;
        char c = 0;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon qcLatLon2 = this.pathPoint.get(i2);
                int i3 = i2 + 1;
                com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon qcLatLon3 = this.pathPoint.get(i3);
                float[] fArr = new float[1];
                android.location.Location.distanceBetween(qcLatLon2.getLatitude(), qcLatLon2.getLongitude(), qcLatLon3.getLatitude(), qcLatLon3.getLongitude(), fArr);
                f += fArr[c];
                int i4 = ((int) f) / 1000;
                if (f < 1000.0f || i4 <= this.showKm) {
                    i = i2;
                } else {
                    this.showKm = i4;
                    java.lang.String valueOf = java.lang.String.valueOf(i4);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(valueOf);
                    sb.append(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric() ? "km" : "mile");
                    int i5 = i2;
                    com.google.android.gms.maps.model.Marker addMarker = map.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(new com.google.android.gms.maps.model.LatLng(qcLatLon3.getLatitude(), qcLatLon3.getLongitude())).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.fromText((android.content.Context) this, sb.toString()))).flat(true).anchor(0.5f, 0.5f));
                    if (addMarker != null) {
                        addMarker.showInfoWindow();
                    }
                    i = i5;
                }
                if (i != size) {
                    i2 = i3;
                    c = 0;
                }
            }
        }
        try {
            map.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(new com.google.android.gms.maps.model.LatLng(this.pathPoint.get(0).getLatitude(), this.pathPoint.get(0).getLongitude())).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(com.qcwireless.qcwatch.R.mipmap.gps_start_mark)).anchor(0.4f, 0.4f));
            com.google.android.gms.maps.model.MarkerOptions markerOptions = new com.google.android.gms.maps.model.MarkerOptions();
            java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon> list = this.pathPoint;
            double latitude = list.get(list.size() - 1).getLatitude();
            java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon> list2 = this.pathPoint;
            map.addMarker(markerOptions.position(new com.google.android.gms.maps.model.LatLng(latitude, list2.get(list2.size() - 1).getLongitude())).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(com.qcwireless.qcwatch.R.mipmap.gps_end_mark)).anchor(0.5f, 0.5f));
        } catch (java.lang.Exception unused) {
        }
    }

    private final void moveCameraToUser(com.google.android.gms.maps.GoogleMap map) {
        if ((!this.pathPoint.isEmpty()) && (!this.pathPoint.isEmpty())) {
            map.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(new com.google.android.gms.maps.model.LatLng(((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.last(this.pathPoint)).getLatitude(), ((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.last(this.pathPoint)).getLongitude()), 18.0f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.00", new java.text.DecimalFormatSymbols(java.util.Locale.US));
        this.df = decimalFormat;
        decimalFormat.setRoundingMode(java.math.RoundingMode.HALF_UP);
        if (this.binding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        setStatusBarNoBackground();
        android.view.View[] viewArr = new android.view.View[1];
        com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding activityGpsMapBinding = this.binding;
        if (activityGpsMapBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsMapBinding = null;
        }
        viewArr[0] = activityGpsMapBinding.imageBack;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsMapActivity$setupViews$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding activityGpsMapBinding2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityGpsMapBinding2 = com.qcwireless.qcwatch.ui.home.gps.GpsMapActivity.this.binding;
                if (activityGpsMapBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsMapBinding2 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityGpsMapBinding2.imageBack)) {
                    com.qcwireless.qcwatch.ui.home.gps.GpsMapActivity.this.finish();
                }
            }
        });
        if (androidx.core.app.ActivityCompat.checkSelfPermission((android.content.Context) this, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION) != 0) {
            return;
        }
        checkPermission();
    }

    private final boolean checkPermission() {
        if (android.os.Build.VERSION.SDK_INT < 23) {
            return false;
        }
        java.lang.Object systemService = getSystemService("power");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((android.os.PowerManager) systemService).isIgnoringBatteryOptimizations(getPackageName());
    }
}
