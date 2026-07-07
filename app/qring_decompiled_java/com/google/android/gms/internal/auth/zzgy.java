package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
abstract class zzgy {
    final sun.misc.Unsafe zza;

    zzgy(sun.misc.Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(java.lang.Object obj, long j);

    public abstract float zzb(java.lang.Object obj, long j);

    public abstract void zzc(java.lang.Object obj, long j, boolean z);

    public abstract void zzd(java.lang.Object obj, long j, double d);

    public abstract void zze(java.lang.Object obj, long j, float f);

    public abstract boolean zzf(java.lang.Object obj, long j);

    public final int zzg(java.lang.Class<?> cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzh(java.lang.Class<?> cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final int zzi(java.lang.Object obj, long j) {
        return this.zza.getInt(obj, j);
    }

    public final long zzj(java.lang.Object obj, long j) {
        return this.zza.getLong(obj, j);
    }

    public final long zzk(java.lang.reflect.Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final java.lang.Object zzl(java.lang.Object obj, long j) {
        return this.zza.getObject(obj, j);
    }

    public final void zzm(java.lang.Object obj, long j, int i) {
        this.zza.putInt(obj, j, i);
    }

    public final void zzn(java.lang.Object obj, long j, long j2) {
        this.zza.putLong(obj, j, j2);
    }

    public final void zzo(java.lang.Object obj, long j, java.lang.Object obj2) {
        this.zza.putObject(obj, j, obj2);
    }
}
