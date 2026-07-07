package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzdr extends com.google.android.gms.internal.fitness.zzbm {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zza;
    private int zzb = 0;
    private com.google.android.gms.fitness.result.DataReadResult zzc;

    @Override // com.google.android.gms.internal.fitness.zzbn
    public final void zzd(com.google.android.gms.fitness.result.DataReadResult dataReadResult) {
        synchronized (this) {
            if (android.util.Log.isLoggable("Fitness", 2)) {
                android.util.Log.v("Fitness", "Received batch result " + this.zzb);
            }
            com.google.android.gms.fitness.result.DataReadResult dataReadResult2 = this.zzc;
            if (dataReadResult2 == null) {
                this.zzc = dataReadResult;
            } else {
                dataReadResult2.zzb(dataReadResult);
            }
            int i = this.zzb + 1;
            this.zzb = i;
            if (i == this.zzc.zza()) {
                this.zza.setResult(this.zzc);
            }
        }
    }
}
