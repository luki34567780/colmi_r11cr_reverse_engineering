package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzfl extends com.google.android.gms.internal.fitness.zzfm {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.fitness.zzfm zzc;

    zzfl(com.google.android.gms.internal.fitness.zzfm zzfmVar, int i, int i2) {
        this.zzc = zzfmVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.fitness.zzff.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.fitness.zzfm, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.fitness.zzfj
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.fitness.zzfj
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.fitness.zzfj
    @javax.annotation.CheckForNull
    final java.lang.Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.fitness.zzfm
    /* renamed from: zzf */
    public final com.google.android.gms.internal.fitness.zzfm subList(int i, int i2) {
        com.google.android.gms.internal.fitness.zzff.zzc(i, i2, this.zzb);
        com.google.android.gms.internal.fitness.zzfm zzfmVar = this.zzc;
        int i3 = this.zza;
        return zzfmVar.subList(i + i3, i2 + i3);
    }
}
