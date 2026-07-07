package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public interface LocationSource {

    /* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
    public interface OnLocationChangedListener {
        void onLocationChanged(android.location.Location location);
    }

    void activate(com.google.android.gms.maps.LocationSource.OnLocationChangedListener onLocationChangedListener);

    void deactivate();
}
