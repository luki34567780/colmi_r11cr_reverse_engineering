package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzfk extends com.google.android.gms.internal.fitness.zzfh {
    private final com.google.android.gms.internal.fitness.zzfm zza;

    zzfk(com.google.android.gms.internal.fitness.zzfm zzfmVar, int i) {
        super(zzfmVar.size(), i);
        this.zza = zzfmVar;
    }

    @Override // com.google.android.gms.internal.fitness.zzfh
    protected final java.lang.Object zza(int i) {
        return this.zza.get(i);
    }
}
