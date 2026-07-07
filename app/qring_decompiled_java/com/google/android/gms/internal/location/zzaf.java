package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzaf implements com.google.android.gms.location.GeofencingApi {
    @Override // com.google.android.gms.location.GeofencingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addGeofences(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzac(this, googleApiClient, geofencingRequest, pendingIntent));
    }

    @Override // com.google.android.gms.location.GeofencingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeGeofences(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        return zza(googleApiClient, com.google.android.gms.location.zzbx.zzb(pendingIntent));
    }

    public final com.google.android.gms.common.api.PendingResult zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.zzbx zzbxVar) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzad(this, googleApiClient, zzbxVar));
    }

    @Override // com.google.android.gms.location.GeofencingApi
    @java.lang.Deprecated
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addGeofences(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.util.List<com.google.android.gms.location.Geofence> list, android.app.PendingIntent pendingIntent) {
        com.google.android.gms.location.GeofencingRequest.Builder builder = new com.google.android.gms.location.GeofencingRequest.Builder();
        builder.addGeofences(list);
        builder.setInitialTrigger(5);
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzac(this, googleApiClient, builder.build(), pendingIntent));
    }

    @Override // com.google.android.gms.location.GeofencingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeGeofences(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.util.List<java.lang.String> list) {
        return zza(googleApiClient, com.google.android.gms.location.zzbx.zza(list));
    }
}
