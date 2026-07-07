package com.qcwireless.qcwatch.ui.base.util;

/* compiled from: AndroidLocationUtils.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/util/AndroidLocationUtils;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getLocation", "", "context", "Landroid/content/Context;", "callback", "Lcom/qcwireless/qcwatch/ui/base/util/Callback;", "getLocationByNetwork", "getLocationListener", "Landroid/location/LocationListener;", "isLocationProviderEnabled", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class AndroidLocationUtils {
    public static final com.qcwireless.qcwatch.ui.base.util.AndroidLocationUtils INSTANCE = new com.qcwireless.qcwatch.ui.base.util.AndroidLocationUtils();
    private static final java.lang.String TAG = "LocationUtils";

    private AndroidLocationUtils() {
    }

    public final void getLocation(final android.content.Context context, final com.qcwireless.qcwatch.ui.base.util.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        final android.location.LocationListener locationListener = getLocationListener(callback);
        try {
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.util.AndroidLocationUtils, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.util.AndroidLocationUtils$getLocation$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.base.util.AndroidLocationUtils) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.base.util.AndroidLocationUtils androidLocationUtils) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidLocationUtils, "$this$ktxRunOnUi");
                    java.lang.Object systemService = context.getSystemService("location");
                    java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
                    android.location.LocationManager locationManager = (android.location.LocationManager) systemService;
                    if (!locationManager.isProviderEnabled("gps")) {
                        androidLocationUtils.getLocationByNetwork(context, callback);
                    } else {
                        locationManager.requestLocationUpdates("gps", 3000L, 100.0f, locationListener);
                    }
                }
            });
        } catch (java.lang.Exception e) {
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, e.getMessage());
        }
    }

    private final android.location.LocationListener getLocationListener(final com.qcwireless.qcwatch.ui.base.util.Callback callback) {
        return new android.location.LocationListener() { // from class: com.qcwireless.qcwatch.ui.base.util.AndroidLocationUtils$getLocationListener$1
            @Override // android.location.LocationListener
            public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
                com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "11111onStatusChanged");
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(java.lang.String provider) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
                com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "11111onProviderEnabled");
            }

            @Override // android.location.LocationListener
            public void onProviderDisabled(java.lang.String provider) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
                com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "1111onProviderDisabled");
            }

            @Override // android.location.LocationListener
            public void onLocationChanged(android.location.Location location) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "location");
                com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "1111111111");
                com.qcwireless.qcwatch.ui.base.util.Callback.this.onLocationChanged(location);
            }
        };
    }

    public final boolean isLocationProviderEnabled(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.Object systemService = context.getSystemService("location");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        android.location.LocationManager locationManager = (android.location.LocationManager) systemService;
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getLocationByNetwork(android.content.Context context, com.qcwireless.qcwatch.ui.base.util.Callback callback) {
        android.location.LocationListener locationListener = getLocationListener(callback);
        java.lang.Object systemService = context.getSystemService("location");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        android.location.LocationManager locationManager = (android.location.LocationManager) systemService;
        try {
            if (locationManager.isProviderEnabled("network")) {
                locationManager.requestLocationUpdates("network", 3000L, 10.0f, locationListener);
            }
        } catch (java.lang.Exception e) {
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, e.getMessage());
        }
    }
}
