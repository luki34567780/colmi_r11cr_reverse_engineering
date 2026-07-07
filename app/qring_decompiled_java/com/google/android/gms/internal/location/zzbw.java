package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzbw extends com.google.android.gms.internal.location.zzbx {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.location.zzbx zzc;

    zzbw(com.google.android.gms.internal.location.zzbx zzbxVar, int i, int i2) {
        this.zzc = zzbxVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.location.zzbr.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbx, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.location.zzbu
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    @javax.annotation.CheckForNull
    final java.lang.Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.location.zzbx
    /* renamed from: zzh */
    public final com.google.android.gms.internal.location.zzbx subList(int i, int i2) {
        com.google.android.gms.internal.location.zzbr.zzc(i, i2, this.zzb);
        com.google.android.gms.internal.location.zzbx zzbxVar = this.zzc;
        int i3 = this.zza;
        return zzbxVar.subList(i + i3, i2 + i3);
    }
}
