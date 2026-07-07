package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzfu<T> implements com.google.android.gms.internal.auth.zzgb<T> {
    private final com.google.android.gms.internal.auth.zzfq zza;
    private final com.google.android.gms.internal.auth.zzgp<?, ?> zzb;
    private final com.google.android.gms.internal.auth.zzeh<?> zzc;

    private zzfu(com.google.android.gms.internal.auth.zzgp<?, ?> zzgpVar, com.google.android.gms.internal.auth.zzeh<?> zzehVar, com.google.android.gms.internal.auth.zzfq zzfqVar) {
        this.zzb = zzgpVar;
        zzehVar.zzc(zzfqVar);
        this.zzc = zzehVar;
        this.zza = zzfqVar;
    }

    static <T> com.google.android.gms.internal.auth.zzfu<T> zzb(com.google.android.gms.internal.auth.zzgp<?, ?> zzgpVar, com.google.android.gms.internal.auth.zzeh<?> zzehVar, com.google.android.gms.internal.auth.zzfq zzfqVar) {
        return new com.google.android.gms.internal.auth.zzfu<>(zzgpVar, zzehVar, zzfqVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final int zza(T t) {
        return this.zzb.zza(t).hashCode();
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final T zzd() {
        return (T) ((com.google.android.gms.internal.auth.zzeo) ((com.google.android.gms.internal.auth.zzeq) this.zza).zzj(5, null, null)).zzg();
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final void zze(T t) {
        this.zzb.zze(t);
        this.zzc.zzb(t);
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final void zzf(T t, T t2) {
        com.google.android.gms.internal.auth.zzgd.zzf(this.zzb, t, t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzgb
    public final void zzg(T t, byte[] bArr, int i, int i2, com.google.android.gms.internal.auth.zzdp zzdpVar) throws java.io.IOException {
        com.google.android.gms.internal.auth.zzeq zzeqVar = (com.google.android.gms.internal.auth.zzeq) t;
        if (zzeqVar.zzc == com.google.android.gms.internal.auth.zzgq.zza()) {
            zzeqVar.zzc = com.google.android.gms.internal.auth.zzgq.zzc();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final boolean zzh(T t, T t2) {
        return this.zzb.zza(t).equals(this.zzb.zza(t2));
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final boolean zzi(T t) {
        this.zzc.zza(t);
        throw null;
    }
}
