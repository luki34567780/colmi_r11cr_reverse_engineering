package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzea implements com.google.android.gms.fitness.RecordingApi {
    private final com.google.android.gms.common.api.PendingResult zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.Subscription subscription) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzdv(this, googleApiClient, subscription));
    }

    @Override // com.google.android.gms.fitness.RecordingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.ListSubscriptionsResult> listSubscriptions(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzdt(this, googleApiClient));
    }

    @Override // com.google.android.gms.fitness.RecordingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> subscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataSource dataSource) {
        com.google.android.gms.fitness.data.zzaf zzafVar = new com.google.android.gms.fitness.data.zzaf();
        zzafVar.zza(dataSource);
        return zza(googleApiClient, zzafVar.zzc());
    }

    @Override // com.google.android.gms.fitness.RecordingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unsubscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataSource dataSource) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzdx(this, googleApiClient, dataSource));
    }

    @Override // com.google.android.gms.fitness.RecordingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.ListSubscriptionsResult> listSubscriptions(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzdu(this, googleApiClient, dataType));
    }

    @Override // com.google.android.gms.fitness.RecordingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> subscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType) {
        com.google.android.gms.fitness.data.zzaf zzafVar = new com.google.android.gms.fitness.data.zzaf();
        zzafVar.zzb(dataType);
        return zza(googleApiClient, zzafVar.zzc());
    }

    @Override // com.google.android.gms.fitness.RecordingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unsubscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzdw(this, googleApiClient, dataType));
    }

    @Override // com.google.android.gms.fitness.RecordingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unsubscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.Subscription subscription) {
        if (subscription.getDataType() == null) {
            return unsubscribe(googleApiClient, (com.google.android.gms.fitness.data.DataSource) com.google.android.gms.common.internal.Preconditions.checkNotNull(subscription.getDataSource()));
        }
        return unsubscribe(googleApiClient, (com.google.android.gms.fitness.data.DataType) com.google.android.gms.common.internal.Preconditions.checkNotNull(subscription.getDataType()));
    }
}
