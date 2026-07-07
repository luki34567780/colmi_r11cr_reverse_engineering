package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class GeofencingClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    public static final /* synthetic */ int zza = 0;

    public GeofencingClient(android.app.Activity activity) {
        super(activity, com.google.android.gms.location.LocationServices.API, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> addGeofences(com.google.android.gms.location.GeofencingRequest geofencingRequest, final android.app.PendingIntent pendingIntent) {
        final com.google.android.gms.location.GeofencingRequest zza2 = geofencingRequest.zza(getContextAttributionTag());
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzay
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.location.GeofencingRequest geofencingRequest2 = com.google.android.gms.location.GeofencingRequest.this;
                android.app.PendingIntent pendingIntent2 = pendingIntent;
                int i = com.google.android.gms.location.GeofencingClient.zza;
                ((com.google.android.gms.internal.location.zzbe) obj).zzq(geofencingRequest2, pendingIntent2, new com.google.android.gms.location.zzba((com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(2424).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeGeofences(final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzax
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                android.app.PendingIntent pendingIntent2 = pendingIntent;
                int i = com.google.android.gms.location.GeofencingClient.zza;
                ((com.google.android.gms.internal.location.zzbe) obj).zzw(pendingIntent2, new com.google.android.gms.location.zzba((com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(2425).build());
    }

    public GeofencingClient(android.content.Context context) {
        super(context, com.google.android.gms.location.LocationServices.API, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeGeofences(final java.util.List<java.lang.String> list) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzaz
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                java.util.List list2 = list;
                int i = com.google.android.gms.location.GeofencingClient.zza;
                ((com.google.android.gms.internal.location.zzbe) obj).zzx(list2, new com.google.android.gms.location.zzba((com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(2425).build());
    }
}
