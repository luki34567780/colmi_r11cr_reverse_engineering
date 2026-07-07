package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzf extends com.google.android.gms.internal.fitness.zzbp {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zza;

    public zzf(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder) {
        this.zza = resultHolder;
    }

    @Override // com.google.android.gms.internal.fitness.zzbq
    public final void zzb(com.google.android.gms.fitness.result.DataSourcesResult dataSourcesResult) {
        this.zza.setResult(dataSourcesResult);
    }
}
