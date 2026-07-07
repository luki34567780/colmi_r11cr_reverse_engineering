package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzeq<MessageType extends com.google.android.gms.internal.auth.zzeq<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.auth.zzeo<MessageType, BuilderType>> extends com.google.android.gms.internal.auth.zzdm<MessageType, BuilderType> {
    private static final java.util.Map<java.lang.Object, com.google.android.gms.internal.auth.zzeq<?, ?>> zzb = new java.util.concurrent.ConcurrentHashMap();
    protected com.google.android.gms.internal.auth.zzgq zzc = com.google.android.gms.internal.auth.zzgq.zza();

    static <T extends com.google.android.gms.internal.auth.zzeq> T zza(java.lang.Class<T> cls) {
        java.util.Map<java.lang.Object, com.google.android.gms.internal.auth.zzeq<?, ?>> map = zzb;
        com.google.android.gms.internal.auth.zzeq<?, ?> zzeqVar = map.get(cls);
        if (zzeqVar == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                zzeqVar = map.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzeqVar == null) {
            zzeqVar = (com.google.android.gms.internal.auth.zzeq) ((com.google.android.gms.internal.auth.zzeq) com.google.android.gms.internal.auth.zzgz.zze(cls)).zzj(6, null, null);
            if (zzeqVar == null) {
                throw new java.lang.IllegalStateException();
            }
            map.put(cls, zzeqVar);
        }
        return zzeqVar;
    }

    protected static <T extends com.google.android.gms.internal.auth.zzeq<T, ?>> T zzb(T t, byte[] bArr) throws com.google.android.gms.internal.auth.zzew {
        boolean z = false;
        T t2 = (T) zzc(t, bArr, 0, bArr.length, com.google.android.gms.internal.auth.zzeg.zza());
        if (t2 != null) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            byte byteValue = ((java.lang.Byte) t2.zzj(1, null, null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue != 0) {
                z = com.google.android.gms.internal.auth.zzfy.zza().zzb(t2.getClass()).zzi(t2);
                t2.zzj(2, true != z ? null : t2, null);
            }
            if (!z) {
                com.google.android.gms.internal.auth.zzew zzewVar = new com.google.android.gms.internal.auth.zzew(new com.google.android.gms.internal.auth.zzgo(t2).getMessage());
                zzewVar.zze(t2);
                throw zzewVar;
            }
        }
        return t2;
    }

    static <T extends com.google.android.gms.internal.auth.zzeq<T, ?>> T zzc(T t, byte[] bArr, int i, int i2, com.google.android.gms.internal.auth.zzeg zzegVar) throws com.google.android.gms.internal.auth.zzew {
        T t2 = (T) t.zzj(4, null, null);
        try {
            com.google.android.gms.internal.auth.zzgb zzb2 = com.google.android.gms.internal.auth.zzfy.zza().zzb(t2.getClass());
            zzb2.zzg(t2, bArr, 0, i2, new com.google.android.gms.internal.auth.zzdp(zzegVar));
            zzb2.zze(t2);
            if (t2.zza == 0) {
                return t2;
            }
            throw new java.lang.RuntimeException();
        } catch (com.google.android.gms.internal.auth.zzew e) {
            e.zze(t2);
            throw e;
        } catch (java.io.IOException e2) {
            if (e2.getCause() instanceof com.google.android.gms.internal.auth.zzew) {
                throw ((com.google.android.gms.internal.auth.zzew) e2.getCause());
            }
            com.google.android.gms.internal.auth.zzew zzewVar = new com.google.android.gms.internal.auth.zzew(e2);
            zzewVar.zze(t2);
            throw zzewVar;
        } catch (java.lang.IndexOutOfBoundsException unused) {
            com.google.android.gms.internal.auth.zzew zzf = com.google.android.gms.internal.auth.zzew.zzf();
            zzf.zze(t2);
            throw zzf;
        }
    }

    protected static <E> com.google.android.gms.internal.auth.zzeu<E> zzd() {
        return com.google.android.gms.internal.auth.zzfz.zze();
    }

    static java.lang.Object zzf(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static java.lang.Object zzg(com.google.android.gms.internal.auth.zzfq zzfqVar, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.auth.zzga(zzfqVar, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    protected static <T extends com.google.android.gms.internal.auth.zzeq> void zzi(java.lang.Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return com.google.android.gms.internal.auth.zzfy.zza().zzb(getClass()).zzh(this, (com.google.android.gms.internal.auth.zzeq) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zza = com.google.android.gms.internal.auth.zzfy.zza().zzb(getClass()).zza(this);
        this.zza = zza;
        return zza;
    }

    public final java.lang.String toString() {
        return com.google.android.gms.internal.auth.zzfs.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.auth.zzfq
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.auth.zzfp zze() {
        com.google.android.gms.internal.auth.zzeo zzeoVar = (com.google.android.gms.internal.auth.zzeo) zzj(5, null, null);
        zzeoVar.zze(this);
        return zzeoVar;
    }

    @Override // com.google.android.gms.internal.auth.zzfr
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.auth.zzfq zzh() {
        return (com.google.android.gms.internal.auth.zzeq) zzj(6, null, null);
    }

    protected abstract java.lang.Object zzj(int i, java.lang.Object obj, java.lang.Object obj2);
}
