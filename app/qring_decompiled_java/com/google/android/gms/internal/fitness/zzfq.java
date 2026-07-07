package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzfq extends com.google.android.gms.internal.fitness.zzfm {
    static final com.google.android.gms.internal.fitness.zzfm zza = new com.google.android.gms.internal.fitness.zzfq(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzfq(java.lang.Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.fitness.zzff.zza(i, this.zzc, "index");
        java.lang.Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fitness.zzfm, com.google.android.gms.internal.fitness.zzfj
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fitness.zzfj
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fitness.zzfj
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fitness.zzfj
    final java.lang.Object[] zze() {
        return this.zzb;
    }
}
