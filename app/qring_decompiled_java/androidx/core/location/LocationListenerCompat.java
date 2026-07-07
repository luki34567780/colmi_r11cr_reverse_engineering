package androidx.core.location;

/* loaded from: classes.dex */
public interface LocationListenerCompat extends android.location.LocationListener {

    /* renamed from: androidx.core.location.LocationListenerCompat$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onProviderDisabled(androidx.core.location.LocationListenerCompat _this, java.lang.String str) {
        }

        public static void $default$onProviderEnabled(androidx.core.location.LocationListenerCompat _this, java.lang.String str) {
        }

        public static void $default$onStatusChanged(androidx.core.location.LocationListenerCompat _this, java.lang.String str, int i, android.os.Bundle bundle) {
        }
    }

    @Override // android.location.LocationListener
    void onProviderDisabled(java.lang.String str);

    @Override // android.location.LocationListener
    void onProviderEnabled(java.lang.String str);

    @Override // android.location.LocationListener
    void onStatusChanged(java.lang.String str, int i, android.os.Bundle bundle);
}
