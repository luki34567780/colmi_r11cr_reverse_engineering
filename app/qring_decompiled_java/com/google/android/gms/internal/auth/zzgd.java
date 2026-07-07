package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzgd {
    private static final java.lang.Class<?> zza;
    private static final com.google.android.gms.internal.auth.zzgp<?, ?> zzb;
    private static final com.google.android.gms.internal.auth.zzgp<?, ?> zzc;
    private static final com.google.android.gms.internal.auth.zzgp<?, ?> zzd;

    static {
        java.lang.Class<?> cls;
        try {
            cls = java.lang.Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzj(false);
        zzc = zzj(true);
        zzd = new com.google.android.gms.internal.auth.zzgr();
    }

    public static com.google.android.gms.internal.auth.zzgp<?, ?> zza() {
        return zzb;
    }

    public static com.google.android.gms.internal.auth.zzgp<?, ?> zzb() {
        return zzc;
    }

    public static com.google.android.gms.internal.auth.zzgp<?, ?> zzc() {
        return zzd;
    }

    static <UT, UB> UB zzd(int i, java.util.List<java.lang.Integer> list, com.google.android.gms.internal.auth.zzet zzetVar, UB ub, com.google.android.gms.internal.auth.zzgp<UT, UB> zzgpVar) {
        if (zzetVar == null) {
            return ub;
        }
        if (list instanceof java.util.RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzetVar.zza()) {
                    if (i3 != i2) {
                        list.set(i2, java.lang.Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zze(i, intValue, ub, zzgpVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            java.util.Iterator<java.lang.Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzetVar.zza()) {
                    ub = (UB) zze(i, intValue2, ub, zzgpVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB zze(int i, int i2, UB ub, com.google.android.gms.internal.auth.zzgp<UT, UB> zzgpVar) {
        if (ub == null) {
            ub = zzgpVar.zzc();
        }
        zzgpVar.zzd(ub, i, i2);
        return ub;
    }

    static <T, UT, UB> void zzf(com.google.android.gms.internal.auth.zzgp<UT, UB> zzgpVar, T t, T t2) {
        zzgpVar.zzf(t, zzgpVar.zzb(zzgpVar.zza(t), zzgpVar.zza(t2)));
    }

    public static void zzg(java.lang.Class<?> cls) {
        java.lang.Class<?> cls2;
        if (!com.google.android.gms.internal.auth.zzeq.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzh(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <T> void zzi(com.google.android.gms.internal.auth.zzfl zzflVar, T t, T t2, long j) {
        com.google.android.gms.internal.auth.zzgz.zzp(t, j, com.google.android.gms.internal.auth.zzfl.zza(com.google.android.gms.internal.auth.zzgz.zzf(t, j), com.google.android.gms.internal.auth.zzgz.zzf(t2, j)));
    }

    private static com.google.android.gms.internal.auth.zzgp<?, ?> zzj(boolean z) {
        java.lang.Class<?> cls;
        try {
            cls = java.lang.Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (com.google.android.gms.internal.auth.zzgp) cls.getConstructor(java.lang.Boolean.TYPE).newInstance(java.lang.Boolean.valueOf(z));
        } catch (java.lang.Throwable unused2) {
            return null;
        }
    }
}
