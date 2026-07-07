package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzdh implements com.google.android.gms.fitness.GoalsApi {
    @Override // com.google.android.gms.fitness.GoalsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.GoalsResult> readCurrentGoals(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.GoalsReadRequest goalsReadRequest) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzdg(this, googleApiClient, goalsReadRequest));
    }
}
