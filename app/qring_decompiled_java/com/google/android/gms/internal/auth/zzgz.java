package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzgz {
    static final boolean zza;
    private static final sun.misc.Unsafe zzb;
    private static final java.lang.Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final com.google.android.gms.internal.auth.zzgy zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0156  */
    static {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzgz.<clinit>():void");
    }

    private zzgz() {
    }

    static double zza(java.lang.Object obj, long j) {
        return zzf.zza(obj, j);
    }

    static float zzb(java.lang.Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    static int zzc(java.lang.Object obj, long j) {
        return zzf.zzi(obj, j);
    }

    static long zzd(java.lang.Object obj, long j) {
        return zzf.zzj(obj, j);
    }

    static <T> T zze(java.lang.Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (java.lang.InstantiationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    static java.lang.Object zzf(java.lang.Object obj, long j) {
        return zzf.zzl(obj, j);
    }

    static sun.misc.Unsafe zzg() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.auth.zzgv());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void zzh(java.lang.Throwable th) {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.android.gms.internal.auth.zzgz.class.getName());
        java.util.logging.Level level = java.util.logging.Level.WARNING;
        java.lang.String valueOf = java.lang.String.valueOf(th);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }

    static /* synthetic */ void zzi(java.lang.Object obj, long j, boolean z) {
        long j2 = (-4) & j;
        com.google.android.gms.internal.auth.zzgy zzgyVar = zzf;
        int zzi = zzgyVar.zzi(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzgyVar.zzm(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & zzi));
    }

    static /* synthetic */ void zzj(java.lang.Object obj, long j, boolean z) {
        long j2 = (-4) & j;
        com.google.android.gms.internal.auth.zzgy zzgyVar = zzf;
        int i = (((int) j) & 3) << 3;
        zzgyVar.zzm(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & zzgyVar.zzi(obj, j2)));
    }

    static void zzk(java.lang.Object obj, long j, boolean z) {
        zzf.zzc(obj, j, z);
    }

    static void zzl(java.lang.Object obj, long j, double d) {
        zzf.zzd(obj, j, d);
    }

    static void zzm(java.lang.Object obj, long j, float f) {
        zzf.zze(obj, j, f);
    }

    static void zzn(java.lang.Object obj, long j, int i) {
        zzf.zzm(obj, j, i);
    }

    static void zzo(java.lang.Object obj, long j, long j2) {
        zzf.zzn(obj, j, j2);
    }

    static void zzp(java.lang.Object obj, long j, java.lang.Object obj2) {
        zzf.zzo(obj, j, obj2);
    }

    static /* synthetic */ boolean zzq(java.lang.Object obj, long j) {
        return ((byte) ((zzf.zzi(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean zzr(java.lang.Object obj, long j) {
        return ((byte) ((zzf.zzi(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    static boolean zzs(java.lang.Class<?> cls) {
        int i = com.google.android.gms.internal.auth.zzdo.zza;
        try {
            java.lang.Class<?> cls2 = zzc;
            cls2.getMethod("peekLong", cls, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            cls2.getMethod("peekInt", cls, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, java.lang.Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    static boolean zzt(java.lang.Object obj, long j) {
        return zzf.zzf(obj, j);
    }

    static boolean zzu() {
        return zzh;
    }

    static boolean zzv() {
        return zzg;
    }

    private static int zzw(java.lang.Class<?> cls) {
        if (zzh) {
            return zzf.zzg(cls);
        }
        return -1;
    }

    private static int zzx(java.lang.Class<?> cls) {
        if (zzh) {
            return zzf.zzh(cls);
        }
        return -1;
    }

    private static java.lang.reflect.Field zzy() {
        int i = com.google.android.gms.internal.auth.zzdo.zza;
        java.lang.reflect.Field zzz = zzz(java.nio.Buffer.class, "effectiveDirectAddress");
        if (zzz != null) {
            return zzz;
        }
        java.lang.reflect.Field zzz2 = zzz(java.nio.Buffer.class, "address");
        if (zzz2 == null || zzz2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return zzz2;
    }

    private static java.lang.reflect.Field zzz(java.lang.Class<?> cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
