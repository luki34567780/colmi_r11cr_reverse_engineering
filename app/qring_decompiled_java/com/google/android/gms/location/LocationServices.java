package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class LocationServices {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;

    @java.lang.Deprecated
    public static final com.google.android.gms.location.FusedLocationProviderApi FusedLocationApi;

    @java.lang.Deprecated
    public static final com.google.android.gms.location.GeofencingApi GeofencingApi;

    @java.lang.Deprecated
    public static final com.google.android.gms.location.SettingsApi SettingsApi;
    private static final com.google.android.gms.common.api.Api.ClientKey zza;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzb;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zza = clientKey;
        com.google.android.gms.location.zzbq zzbqVar = new com.google.android.gms.location.zzbq();
        zzb = zzbqVar;
        API = new com.google.android.gms.common.api.Api<>("LocationServices.API", zzbqVar, clientKey);
        FusedLocationApi = new com.google.android.gms.internal.location.zzz();
        GeofencingApi = new com.google.android.gms.internal.location.zzaf();
        SettingsApi = new com.google.android.gms.internal.location.zzbm();
    }

    private LocationServices() {
    }

    public static com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient(android.app.Activity activity) {
        return new com.google.android.gms.location.FusedLocationProviderClient(activity);
    }

    public static com.google.android.gms.location.GeofencingClient getGeofencingClient(android.app.Activity activity) {
        return new com.google.android.gms.location.GeofencingClient(activity);
    }

    public static com.google.android.gms.location.SettingsClient getSettingsClient(android.app.Activity activity) {
        return new com.google.android.gms.location.SettingsClient(activity);
    }

    public static com.google.android.gms.internal.location.zzbe zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(googleApiClient != null, "GoogleApiClient parameter is required.");
        com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) googleApiClient.getClient(zza);
        com.google.android.gms.common.internal.Preconditions.checkState(zzbeVar != null, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return zzbeVar;
    }

    public static com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient(android.content.Context context) {
        return new com.google.android.gms.location.FusedLocationProviderClient(context);
    }

    public static com.google.android.gms.location.GeofencingClient getGeofencingClient(android.content.Context context) {
        return new com.google.android.gms.location.GeofencingClient(context);
    }

    public static com.google.android.gms.location.SettingsClient getSettingsClient(android.content.Context context) {
        return new com.google.android.gms.location.SettingsClient(context);
    }
}
