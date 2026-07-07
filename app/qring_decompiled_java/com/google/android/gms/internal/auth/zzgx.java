package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzgx extends com.google.android.gms.internal.auth.zzgy {
    zzgx(sun.misc.Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final double zza(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(zzj(obj, j));
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final float zzb(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(zzi(obj, j));
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final void zzc(java.lang.Object obj, long j, boolean z) {
        if (com.google.android.gms.internal.auth.zzgz.zza) {
            com.google.android.gms.internal.auth.zzgz.zzi(obj, j, z);
        } else {
            com.google.android.gms.internal.auth.zzgz.zzj(obj, j, z);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final void zzd(java.lang.Object obj, long j, double d) {
        zzn(obj, j, java.lang.Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final void zze(java.lang.Object obj, long j, float f) {
        zzm(obj, j, java.lang.Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final boolean zzf(java.lang.Object obj, long j) {
        return com.google.android.gms.internal.auth.zzgz.zza ? com.google.android.gms.internal.auth.zzgz.zzq(obj, j) : com.google.android.gms.internal.auth.zzgz.zzr(obj, j);
    }
}
