package com.qcwireless.qcwatch.ui.home.gps;

/* compiled from: GpsCNMapActivity.kt */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0004H\u0002J\b\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0004H\u0002J\u0012\u0010+\u001a\u00020&2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\b\u0010.\u001a\u00020&H\u0014J\b\u0010/\u001a\u00020&H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\fR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u00061"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GpsCNMapActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "aMap", "Lcom/amap/api/maps/AMap;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityGpsMapCnBinding;", "calorieTotal", "", "getCalorieTotal", "()F", "setCalorieTotal", "(F)V", "cameraPosition", "Lcom/amap/api/maps/model/CameraPosition;", "df", "Ljava/text/DecimalFormat;", "distanceInMeters", "getDistanceInMeters", "setDistanceInMeters", "mapView", "Lcom/amap/api/maps/MapView;", "pathPoint", "", "Lcom/qcwireless/qcwatch/ui/home/gps/bean/QcLatLon;", "showKm", "", "getShowKm", "()I", "setShowKm", "(I)V", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/gps/vm/GPSActivityViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/gps/vm/GPSActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addLatestPolyline", "", "map", "checkPermission", "", "moveCameraToUser", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setupViews", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GpsCNMapActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private static final int DEFAULT_ZOOM = 15;
    private static final java.lang.String KEY_CAMERA_POSITION = "camera_position";
    private static final java.lang.String KEY_LOCATION = "location";
    private static final int M_MAX_ENTRIES = 5;
    private static final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;
    private com.amap.api.maps.AMap aMap;
    private com.qcwireless.qcwatch.databinding.ActivityGpsMapCnBinding binding;
    private float calorieTotal;
    private com.amap.api.maps.model.CameraPosition cameraPosition;
    private java.text.DecimalFormat df;
    private float distanceInMeters;
    private com.amap.api.maps.MapView mapView;
    private java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon> pathPoint = new java.util.ArrayList();
    private int showKm;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public GpsCNMapActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNMapActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel m980invoke() {
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

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityGpsMapCnBinding inflate = com.qcwireless.qcwatch.databinding.ActivityGpsMapCnBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        com.qcwireless.qcwatch.databinding.ActivityGpsMapCnBinding activityGpsMapCnBinding = null;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        androidx.constraintlayout.widget.ConstraintLayout root = inflate.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        setContentView((android.view.View) root);
        com.qcwireless.qcwatch.databinding.ActivityGpsMapCnBinding activityGpsMapCnBinding2 = this.binding;
        if (activityGpsMapCnBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsMapCnBinding2 = null;
        }
        com.amap.api.maps.MapView mapView = activityGpsMapCnBinding2.mapView;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mapView, "binding.mapView");
        this.mapView = mapView;
        if (mapView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mapView");
            mapView = null;
        }
        mapView.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityGpsMapCnBinding activityGpsMapCnBinding3 = this.binding;
        if (activityGpsMapCnBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGpsMapCnBinding = activityGpsMapCnBinding3;
        }
        this.aMap = activityGpsMapCnBinding.mapView.getMap();
        long longExtra = getIntent().getLongExtra("start", 0L);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Long.valueOf(longExtra));
        getViewModel().queryByStartTime(longExtra);
        getViewModel().getGpsDetail().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNMapActivity$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.gps.GpsCNMapActivity.m979onCreate$lambda0(com.qcwireless.qcwatch.ui.home.gps.GpsCNMapActivity.this, (com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final void m979onCreate$lambda0(com.qcwireless.qcwatch.ui.home.gps.GpsCNMapActivity gpsCNMapActivity, com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail gpsDetail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsCNMapActivity, "this$0");
        if (gpsDetail != null) {
            com.qcwireless.qcwatch.base.utils.MoshiUtils moshiUtils = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE;
            java.lang.String locations = gpsDetail.getLocations();
            java.lang.reflect.ParameterizedType newParameterizedType = com.squareup.moshi.Types.newParameterizedType(java.util.List.class, new java.lang.reflect.Type[]{com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon.class});
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newParameterizedType, "newParameterizedType(Mut…lass.java, T::class.java)");
            java.util.ArrayList arrayList = (java.util.List) moshiUtils.fromJson(locations, newParameterizedType);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            gpsCNMapActivity.pathPoint = arrayList;
            com.qcwireless.qcwatch.databinding.ActivityGpsMapCnBinding activityGpsMapCnBinding = null;
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
                com.qcwireless.qcwatch.databinding.ActivityGpsMapCnBinding activityGpsMapCnBinding2 = gpsCNMapActivity.binding;
                if (activityGpsMapCnBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsMapCnBinding2 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView = activityGpsMapCnBinding2.gpsDistance;
                java.text.DecimalFormat decimalFormat = gpsCNMapActivity.df;
                if (decimalFormat == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("df");
                    decimalFormat = null;
                }
                java.lang.String format = decimalFormat.format(java.lang.Float.valueOf(gpsDetail.getDistance() / 1000));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "df.format(it.distance / 1000)");
                qSportItemView.setItemTitle(format);
                com.qcwireless.qcwatch.databinding.ActivityGpsMapCnBinding activityGpsMapCnBinding3 = gpsCNMapActivity.binding;
                if (activityGpsMapCnBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsMapCnBinding3 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView2 = activityGpsMapCnBinding3.gpsDistance;
                java.lang.String string = gpsCNMapActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_88);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_88)");
                qSportItemView2.setItemUnit(string);
            } else {
                com.qcwireless.qcwatch.databinding.ActivityGpsMapCnBinding activityGpsMapCnBinding4 = gpsCNMapActivity.binding;
                if (activityGpsMapCnBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsMapCnBinding4 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView3 = activityGpsMapCnBinding4.gpsDistance;
                java.text.DecimalFormat decimalFormat2 = gpsCNMapActivity.df;
                if (decimalFormat2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("df");
                    decimalFormat2 = null;
                }
                java.lang.String format2 = decimalFormat2.format(java.lang.Float.valueOf(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kmToIn(gpsDetail.getDistance() / 1000)));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "df.format(kmToIn(it.distance / 1000))");
                qSportItemView3.setItemTitle(format2);
                com.qcwireless.qcwatch.databinding.ActivityGpsMapCnBinding activityGpsMapCnBinding5 = gpsCNMapActivity.binding;
                if (activityGpsMapCnBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsMapCnBinding5 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView4 = activityGpsMapCnBinding5.gpsDistance;
                java.lang.String string2 = gpsCNMapActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_358);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_358)");
                qSportItemView4.setItemUnit(string2);
            }
            com.qcwireless.qcwatch.databinding.ActivityGpsMapCnBinding activityGpsMapCnBinding6 = gpsCNMapActivity.binding;
            if (activityGpsMapCnBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityGpsMapCnBinding6 = null;
            }
            activityGpsMapCnBinding6.gpsCalorie.setItemTitle(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(gpsDetail.getCalorie())));
            com.qcwireless.qcwatch.databinding.ActivityGpsMapCnBinding activityGpsMapCnBinding7 = gpsCNMapActivity.binding;
            if (activityGpsMapCnBinding7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGpsMapCnBinding = activityGpsMapCnBinding7;
            }
            com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView5 = activityGpsMapCnBinding.gpsTimes;
            java.lang.String minsToHHmmdd = com.qcwireless.qc_utils.date.DateUtil.minsToHHmmdd(gpsDetail.getDuration() / 1000);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(minsToHHmmdd, "minsToHHmmdd(it.duration / 1000)");
            qSportItemView5.setItemTitle(minsToHHmmdd);
            try {
                com.amap.api.maps.AMap aMap = gpsCNMapActivity.aMap;
                kotlin.jvm.internal.Intrinsics.checkNotNull(aMap);
                gpsCNMapActivity.addLatestPolyline(aMap);
                com.amap.api.maps.AMap aMap2 = gpsCNMapActivity.aMap;
                kotlin.jvm.internal.Intrinsics.checkNotNull(aMap2);
                gpsCNMapActivity.moveCameraToUser(aMap2);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addLatestPolyline(com.amap.api.maps.AMap map) {
        int i;
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(this.pathPoint.size()));
        if ((!this.pathPoint.isEmpty()) && this.pathPoint.size() > 2) {
            com.amap.api.maps.model.PolylineOptions useGradient = new com.amap.api.maps.model.PolylineOptions().width(10.0f).lineJoinType(com.amap.api.maps.model.PolylineOptions.LineJoinType.LineJoinRound).lineCapType(com.amap.api.maps.model.PolylineOptions.LineCapType.LineCapRound).useGradient(true);
            for (com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon qcLatLon : this.pathPoint) {
                useGradient.add(new com.amap.api.maps.model.LatLng(qcLatLon.getLatitude(), qcLatLon.getLongitude()));
                useGradient.color(com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.getPaceColor(qcLatLon.getSpeed()));
            }
            map.addPolyline(useGradient);
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
                    com.amap.api.maps.model.Marker addMarker = map.addMarker(new com.amap.api.maps.model.MarkerOptions().position(new com.amap.api.maps.model.LatLng(qcLatLon3.getLatitude(), qcLatLon3.getLongitude())).icon(com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(com.qcwireless.qcwatch.ui.home.gps.util.GpsUtilsKt.fromText((android.content.Context) this, sb.toString()))).anchor(0.5f, 0.5f));
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
            map.addMarker(new com.amap.api.maps.model.MarkerOptions().position(new com.amap.api.maps.model.LatLng(this.pathPoint.get(0).getLatitude(), this.pathPoint.get(0).getLongitude())).icon(com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(com.qcwireless.qcwatch.R.mipmap.gps_start_mark)).anchor(0.4f, 0.4f));
            com.amap.api.maps.model.MarkerOptions markerOptions = new com.amap.api.maps.model.MarkerOptions();
            java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon> list = this.pathPoint;
            double latitude = list.get(list.size() - 1).getLatitude();
            java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon> list2 = this.pathPoint;
            map.addMarker(markerOptions.position(new com.amap.api.maps.model.LatLng(latitude, list2.get(list2.size() - 1).getLongitude())).icon(com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(com.qcwireless.qcwatch.R.mipmap.gps_end_mark)).anchor(0.5f, 0.5f));
        } catch (java.lang.Exception unused) {
        }
    }

    private final void moveCameraToUser(com.amap.api.maps.AMap map) {
        if ((!this.pathPoint.isEmpty()) && (!this.pathPoint.isEmpty())) {
            map.animateCamera(com.amap.api.maps.CameraUpdateFactory.newLatLngZoom(new com.amap.api.maps.model.LatLng(((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.last(this.pathPoint)).getLatitude(), ((com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon) kotlin.collections.CollectionsKt.last(this.pathPoint)).getLongitude()), 18.0f));
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
        com.qcwireless.qcwatch.databinding.ActivityGpsMapCnBinding activityGpsMapCnBinding = this.binding;
        if (activityGpsMapCnBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsMapCnBinding = null;
        }
        viewArr[0] = activityGpsMapCnBinding.imageBack;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsCNMapActivity$setupViews$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivityGpsMapCnBinding activityGpsMapCnBinding2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityGpsMapCnBinding2 = com.qcwireless.qcwatch.ui.home.gps.GpsCNMapActivity.this.binding;
                if (activityGpsMapCnBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGpsMapCnBinding2 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityGpsMapCnBinding2.imageBack)) {
                    com.qcwireless.qcwatch.ui.home.gps.GpsCNMapActivity.this.finish();
                }
            }
        });
        if (androidx.core.app.ActivityCompat.checkSelfPermission((android.content.Context) this, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION) != 0) {
            return;
        }
        checkPermission();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        try {
            this.aMap = null;
        } catch (java.lang.Exception unused) {
        }
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
