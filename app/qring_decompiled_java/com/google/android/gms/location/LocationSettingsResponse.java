package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class LocationSettingsResponse extends com.google.android.gms.common.api.Response<com.google.android.gms.location.LocationSettingsResult> {
    public LocationSettingsResponse() {
    }

    public com.google.android.gms.location.LocationSettingsStates getLocationSettingsStates() {
        return getResult().getLocationSettingsStates();
    }

    public LocationSettingsResponse(com.google.android.gms.location.LocationSettingsResult locationSettingsResult) {
        super(locationSettingsResult);
    }
}
