package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzby extends com.google.android.gms.internal.location.zzbx {
    static final com.google.android.gms.internal.location.zzbx zza = new com.google.android.gms.internal.location.zzby(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzby(java.lang.Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.location.zzbr.zza(i, this.zzc, "index");
        java.lang.Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzbx, com.google.android.gms.internal.location.zzbu
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    final java.lang.Object[] zzg() {
        return this.zzb;
    }
}
