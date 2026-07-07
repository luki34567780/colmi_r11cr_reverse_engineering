package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzft<T> implements com.google.android.gms.internal.auth.zzgb<T> {
    private static final int[] zza = new int[0];
    private static final sun.misc.Unsafe zzb = com.google.android.gms.internal.auth.zzgz.zzg();
    private final int[] zzc;
    private final java.lang.Object[] zzd;
    private final int zze;
    private final int zzf;
    private final com.google.android.gms.internal.auth.zzfq zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final com.google.android.gms.internal.auth.zzfe zzl;
    private final com.google.android.gms.internal.auth.zzgp<?, ?> zzm;
    private final com.google.android.gms.internal.auth.zzeh<?> zzn;
    private final com.google.android.gms.internal.auth.zzfv zzo;
    private final com.google.android.gms.internal.auth.zzfl zzp;

    /* JADX WARN: Multi-variable type inference failed */
    private zzft(int[] iArr, int[] iArr2, java.lang.Object[] objArr, int i, int i2, com.google.android.gms.internal.auth.zzfq zzfqVar, boolean z, boolean z2, int[] iArr3, int i3, int i4, com.google.android.gms.internal.auth.zzfv zzfvVar, com.google.android.gms.internal.auth.zzfe zzfeVar, com.google.android.gms.internal.auth.zzgp<?, ?> zzgpVar, com.google.android.gms.internal.auth.zzeh<?> zzehVar, com.google.android.gms.internal.auth.zzfl zzflVar) {
        this.zzc = iArr;
        this.zzd = iArr2;
        this.zze = objArr;
        this.zzf = i;
        this.zzh = zzfqVar;
        this.zzi = z2;
        this.zzj = iArr3;
        this.zzk = i3;
        this.zzo = i4;
        this.zzl = zzfvVar;
        this.zzm = zzfeVar;
        this.zzn = zzgpVar;
        this.zzg = i2;
        this.zzp = zzehVar;
    }

    private static java.lang.reflect.Field zzA(java.lang.Class<?> cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            java.lang.String name = cls.getName();
            java.lang.String arrays = java.util.Arrays.toString(declaredFields);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 40 + java.lang.String.valueOf(name).length() + java.lang.String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new java.lang.RuntimeException(sb.toString());
        }
    }

    private final void zzB(T t, T t2, int i) {
        long zzv = zzv(i) & 1048575;
        if (zzG(t2, i)) {
            java.lang.Object zzf = com.google.android.gms.internal.auth.zzgz.zzf(t, zzv);
            java.lang.Object zzf2 = com.google.android.gms.internal.auth.zzgz.zzf(t2, zzv);
            if (zzf != null && zzf2 != null) {
                com.google.android.gms.internal.auth.zzgz.zzp(t, zzv, com.google.android.gms.internal.auth.zzev.zzg(zzf, zzf2));
                zzD(t, i);
            } else if (zzf2 != null) {
                com.google.android.gms.internal.auth.zzgz.zzp(t, zzv, zzf2);
                zzD(t, i);
            }
        }
    }

    private final void zzC(T t, T t2, int i) {
        int zzv = zzv(i);
        int i2 = this.zzc[i];
        long j = zzv & 1048575;
        if (zzJ(t2, i2, i)) {
            java.lang.Object zzf = zzJ(t, i2, i) ? com.google.android.gms.internal.auth.zzgz.zzf(t, j) : null;
            java.lang.Object zzf2 = com.google.android.gms.internal.auth.zzgz.zzf(t2, j);
            if (zzf != null && zzf2 != null) {
                com.google.android.gms.internal.auth.zzgz.zzp(t, j, com.google.android.gms.internal.auth.zzev.zzg(zzf, zzf2));
                zzE(t, i2, i);
            } else if (zzf2 != null) {
                com.google.android.gms.internal.auth.zzgz.zzp(t, j, zzf2);
                zzE(t, i2, i);
            }
        }
    }

    private final void zzD(T t, int i) {
        int zzs = zzs(i);
        long j = 1048575 & zzs;
        if (j == 1048575) {
            return;
        }
        com.google.android.gms.internal.auth.zzgz.zzn(t, j, (1 << (zzs >>> 20)) | com.google.android.gms.internal.auth.zzgz.zzc(t, j));
    }

    private final void zzE(T t, int i, int i2) {
        com.google.android.gms.internal.auth.zzgz.zzn(t, zzs(i2) & 1048575, i);
    }

    private final boolean zzF(T t, T t2, int i) {
        return zzG(t, i) == zzG(t2, i);
    }

    private final boolean zzG(T t, int i) {
        int zzs = zzs(i);
        long j = zzs & 1048575;
        if (j != 1048575) {
            return (com.google.android.gms.internal.auth.zzgz.zzc(t, j) & (1 << (zzs >>> 20))) != 0;
        }
        int zzv = zzv(i);
        long j2 = zzv & 1048575;
        switch (zzu(zzv)) {
            case 0:
                return com.google.android.gms.internal.auth.zzgz.zza(t, j2) != 0.0d;
            case 1:
                return com.google.android.gms.internal.auth.zzgz.zzb(t, j2) != 0.0f;
            case 2:
                return com.google.android.gms.internal.auth.zzgz.zzd(t, j2) != 0;
            case 3:
                return com.google.android.gms.internal.auth.zzgz.zzd(t, j2) != 0;
            case 4:
                return com.google.android.gms.internal.auth.zzgz.zzc(t, j2) != 0;
            case 5:
                return com.google.android.gms.internal.auth.zzgz.zzd(t, j2) != 0;
            case 6:
                return com.google.android.gms.internal.auth.zzgz.zzc(t, j2) != 0;
            case 7:
                return com.google.android.gms.internal.auth.zzgz.zzt(t, j2);
            case 8:
                java.lang.Object zzf = com.google.android.gms.internal.auth.zzgz.zzf(t, j2);
                if (zzf instanceof java.lang.String) {
                    return !((java.lang.String) zzf).isEmpty();
                }
                if (zzf instanceof com.google.android.gms.internal.auth.zzeb) {
                    return !com.google.android.gms.internal.auth.zzeb.zzb.equals(zzf);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return com.google.android.gms.internal.auth.zzgz.zzf(t, j2) != null;
            case 10:
                return !com.google.android.gms.internal.auth.zzeb.zzb.equals(com.google.android.gms.internal.auth.zzgz.zzf(t, j2));
            case 11:
                return com.google.android.gms.internal.auth.zzgz.zzc(t, j2) != 0;
            case 12:
                return com.google.android.gms.internal.auth.zzgz.zzc(t, j2) != 0;
            case 13:
                return com.google.android.gms.internal.auth.zzgz.zzc(t, j2) != 0;
            case 14:
                return com.google.android.gms.internal.auth.zzgz.zzd(t, j2) != 0;
            case 15:
                return com.google.android.gms.internal.auth.zzgz.zzc(t, j2) != 0;
            case 16:
                return com.google.android.gms.internal.auth.zzgz.zzd(t, j2) != 0;
            case 17:
                return com.google.android.gms.internal.auth.zzgz.zzf(t, j2) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    private final boolean zzH(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzG(t, i) : (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zzI(java.lang.Object obj, int i, com.google.android.gms.internal.auth.zzgb zzgbVar) {
        return zzgbVar.zzi(com.google.android.gms.internal.auth.zzgz.zzf(obj, i & 1048575));
    }

    private final boolean zzJ(T t, int i, int i2) {
        return com.google.android.gms.internal.auth.zzgz.zzc(t, (long) (zzs(i2) & 1048575)) == i;
    }

    static com.google.android.gms.internal.auth.zzgq zzc(java.lang.Object obj) {
        com.google.android.gms.internal.auth.zzeq zzeqVar = (com.google.android.gms.internal.auth.zzeq) obj;
        com.google.android.gms.internal.auth.zzgq zzgqVar = zzeqVar.zzc;
        if (zzgqVar != com.google.android.gms.internal.auth.zzgq.zza()) {
            return zzgqVar;
        }
        com.google.android.gms.internal.auth.zzgq zzc = com.google.android.gms.internal.auth.zzgq.zzc();
        zzeqVar.zzc = zzc;
        return zzc;
    }

    static <T> com.google.android.gms.internal.auth.zzft<T> zzj(java.lang.Class<T> cls, com.google.android.gms.internal.auth.zzfn zzfnVar, com.google.android.gms.internal.auth.zzfv zzfvVar, com.google.android.gms.internal.auth.zzfe zzfeVar, com.google.android.gms.internal.auth.zzgp<?, ?> zzgpVar, com.google.android.gms.internal.auth.zzeh<?> zzehVar, com.google.android.gms.internal.auth.zzfl zzflVar) {
        if (zzfnVar instanceof com.google.android.gms.internal.auth.zzga) {
            return zzk((com.google.android.gms.internal.auth.zzga) zzfnVar, zzfvVar, zzfeVar, zzgpVar, zzehVar, zzflVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.android.gms.internal.auth.zzft<T> zzk(com.google.android.gms.internal.auth.zzga r34, com.google.android.gms.internal.auth.zzfv r35, com.google.android.gms.internal.auth.zzfe r36, com.google.android.gms.internal.auth.zzgp<?, ?> r37, com.google.android.gms.internal.auth.zzeh<?> r38, com.google.android.gms.internal.auth.zzfl r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.zzk(com.google.android.gms.internal.auth.zzga, com.google.android.gms.internal.auth.zzfv, com.google.android.gms.internal.auth.zzfe, com.google.android.gms.internal.auth.zzgp, com.google.android.gms.internal.auth.zzeh, com.google.android.gms.internal.auth.zzfl):com.google.android.gms.internal.auth.zzft");
    }

    private static <T> int zzl(T t, long j) {
        return ((java.lang.Integer) com.google.android.gms.internal.auth.zzgz.zzf(t, j)).intValue();
    }

    private final <K, V> int zzm(T t, byte[] bArr, int i, int i2, int i3, long j, com.google.android.gms.internal.auth.zzdp zzdpVar) throws java.io.IOException {
        sun.misc.Unsafe unsafe = zzb;
        java.lang.Object zzz = zzz(i3);
        java.lang.Object object = unsafe.getObject(t, j);
        if (!((com.google.android.gms.internal.auth.zzfk) object).zze()) {
            com.google.android.gms.internal.auth.zzfk<K, V> zzb2 = com.google.android.gms.internal.auth.zzfk.zza().zzb();
            com.google.android.gms.internal.auth.zzfl.zza(zzb2, object);
            unsafe.putObject(t, j, zzb2);
        }
        throw null;
    }

    private final int zzn(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, com.google.android.gms.internal.auth.zzdp zzdpVar) throws java.io.IOException {
        sun.misc.Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdq.zzn(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdq.zzb(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = com.google.android.gms.internal.auth.zzdq.zzm(bArr, i, zzdpVar);
                    unsafe.putObject(t, j, java.lang.Long.valueOf(zzdpVar.zzb));
                    unsafe.putInt(t, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i, zzdpVar);
                    unsafe.putObject(t, j, java.lang.Integer.valueOf(zzdpVar.zza));
                    unsafe.putInt(t, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, java.lang.Long.valueOf(com.google.android.gms.internal.auth.zzdq.zzn(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, java.lang.Integer.valueOf(com.google.android.gms.internal.auth.zzdq.zzb(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = com.google.android.gms.internal.auth.zzdq.zzm(bArr, i, zzdpVar);
                    unsafe.putObject(t, j, java.lang.Boolean.valueOf(zzdpVar.zzb != 0));
                    unsafe.putInt(t, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i, zzdpVar);
                    int i9 = zzdpVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !com.google.android.gms.internal.auth.zzhd.zzd(bArr, zzj2, zzj2 + i9)) {
                            throw com.google.android.gms.internal.auth.zzew.zzb();
                        }
                        unsafe.putObject(t, j, new java.lang.String(bArr, zzj2, i9, com.google.android.gms.internal.auth.zzev.zza));
                        zzj2 += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int zzd = com.google.android.gms.internal.auth.zzdq.zzd(zzy(i8), bArr, i, i2, zzdpVar);
                    java.lang.Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzdpVar.zzc);
                    } else {
                        unsafe.putObject(t, j, com.google.android.gms.internal.auth.zzev.zzg(object, zzdpVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzd;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = com.google.android.gms.internal.auth.zzdq.zza(bArr, i, zzdpVar);
                    unsafe.putObject(t, j, zzdpVar.zzc);
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i, zzdpVar);
                    int i10 = zzdpVar.zza;
                    com.google.android.gms.internal.auth.zzet zzx = zzx(i8);
                    if (zzx == null || zzx.zza()) {
                        unsafe.putObject(t, j, java.lang.Integer.valueOf(i10));
                        unsafe.putInt(t, j2, i4);
                    } else {
                        zzc(t).zzf(i3, java.lang.Long.valueOf(i10));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int zzj4 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i, zzdpVar);
                    unsafe.putObject(t, j, java.lang.Integer.valueOf(com.google.android.gms.internal.auth.zzee.zzb(zzdpVar.zza)));
                    unsafe.putInt(t, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = com.google.android.gms.internal.auth.zzdq.zzm(bArr, i, zzdpVar);
                    unsafe.putObject(t, j, java.lang.Long.valueOf(com.google.android.gms.internal.auth.zzee.zzc(zzdpVar.zzb)));
                    unsafe.putInt(t, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int zzc = com.google.android.gms.internal.auth.zzdq.zzc(zzy(i8), bArr, i, i2, (i3 & (-8)) | 4, zzdpVar);
                    java.lang.Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzdpVar.zzc);
                    } else {
                        unsafe.putObject(t, j, com.google.android.gms.internal.auth.zzev.zzg(object2, zzdpVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x02a8, code lost:
    
        if (r0 != r15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02aa, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r19;
        r1 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02be, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02f1, code lost:
    
        if (r0 != r15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0314, code lost:
    
        if (r0 != r15) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0097. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzo(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.auth.zzdp r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.zzo(java.lang.Object, byte[], int, int, com.google.android.gms.internal.auth.zzdp):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int zzp(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, com.google.android.gms.internal.auth.zzdp zzdpVar) throws java.io.IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int zzj;
        int i12 = i;
        sun.misc.Unsafe unsafe = zzb;
        com.google.android.gms.internal.auth.zzeu zzeuVar = (com.google.android.gms.internal.auth.zzeu) unsafe.getObject(t, j2);
        if (!zzeuVar.zzc()) {
            int size = zzeuVar.size();
            zzeuVar = zzeuVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(t, j2, zzeuVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    com.google.android.gms.internal.auth.zzef zzefVar = (com.google.android.gms.internal.auth.zzef) zzeuVar;
                    int zzj2 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i12, zzdpVar);
                    int i13 = zzdpVar.zza + zzj2;
                    while (zzj2 < i13) {
                        zzefVar.zze(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdq.zzn(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i13) {
                        return zzj2;
                    }
                    throw com.google.android.gms.internal.auth.zzew.zzf();
                }
                if (i5 == 1) {
                    com.google.android.gms.internal.auth.zzef zzefVar2 = (com.google.android.gms.internal.auth.zzef) zzeuVar;
                    zzefVar2.zze(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdq.zzn(bArr, i)));
                    while (true) {
                        i8 = i12 + 8;
                        if (i8 < i2) {
                            i12 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i8, zzdpVar);
                            if (i3 == zzdpVar.zza) {
                                zzefVar2.zze(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdq.zzn(bArr, i12)));
                            }
                        }
                    }
                    return i8;
                }
                return i12;
            case 19:
            case 36:
                if (i5 == 2) {
                    com.google.android.gms.internal.auth.zzem zzemVar = (com.google.android.gms.internal.auth.zzem) zzeuVar;
                    int zzj3 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i12, zzdpVar);
                    int i14 = zzdpVar.zza + zzj3;
                    while (zzj3 < i14) {
                        zzemVar.zze(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdq.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i14) {
                        return zzj3;
                    }
                    throw com.google.android.gms.internal.auth.zzew.zzf();
                }
                if (i5 == 5) {
                    com.google.android.gms.internal.auth.zzem zzemVar2 = (com.google.android.gms.internal.auth.zzem) zzeuVar;
                    zzemVar2.zze(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdq.zzb(bArr, i)));
                    while (true) {
                        i9 = i12 + 4;
                        if (i9 < i2) {
                            i12 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i9, zzdpVar);
                            if (i3 == zzdpVar.zza) {
                                zzemVar2.zze(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdq.zzb(bArr, i12)));
                            }
                        }
                    }
                    return i9;
                }
                return i12;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    com.google.android.gms.internal.auth.zzff zzffVar = (com.google.android.gms.internal.auth.zzff) zzeuVar;
                    int zzj4 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i12, zzdpVar);
                    int i15 = zzdpVar.zza + zzj4;
                    while (zzj4 < i15) {
                        zzj4 = com.google.android.gms.internal.auth.zzdq.zzm(bArr, zzj4, zzdpVar);
                        zzffVar.zze(zzdpVar.zzb);
                    }
                    if (zzj4 == i15) {
                        return zzj4;
                    }
                    throw com.google.android.gms.internal.auth.zzew.zzf();
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.auth.zzff zzffVar2 = (com.google.android.gms.internal.auth.zzff) zzeuVar;
                    int zzm = com.google.android.gms.internal.auth.zzdq.zzm(bArr, i12, zzdpVar);
                    zzffVar2.zze(zzdpVar.zzb);
                    while (zzm < i2) {
                        int zzj5 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, zzm, zzdpVar);
                        if (i3 != zzdpVar.zza) {
                            return zzm;
                        }
                        zzm = com.google.android.gms.internal.auth.zzdq.zzm(bArr, zzj5, zzdpVar);
                        zzffVar2.zze(zzdpVar.zzb);
                    }
                    return zzm;
                }
                return i12;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return com.google.android.gms.internal.auth.zzdq.zzf(bArr, i12, zzeuVar, zzdpVar);
                }
                if (i5 == 0) {
                    return com.google.android.gms.internal.auth.zzdq.zzl(i3, bArr, i, i2, zzeuVar, zzdpVar);
                }
                return i12;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    com.google.android.gms.internal.auth.zzff zzffVar3 = (com.google.android.gms.internal.auth.zzff) zzeuVar;
                    int zzj6 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i12, zzdpVar);
                    int i16 = zzdpVar.zza + zzj6;
                    while (zzj6 < i16) {
                        zzffVar3.zze(com.google.android.gms.internal.auth.zzdq.zzn(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i16) {
                        return zzj6;
                    }
                    throw com.google.android.gms.internal.auth.zzew.zzf();
                }
                if (i5 == 1) {
                    com.google.android.gms.internal.auth.zzff zzffVar4 = (com.google.android.gms.internal.auth.zzff) zzeuVar;
                    zzffVar4.zze(com.google.android.gms.internal.auth.zzdq.zzn(bArr, i));
                    while (true) {
                        i10 = i12 + 8;
                        if (i10 < i2) {
                            i12 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i10, zzdpVar);
                            if (i3 == zzdpVar.zza) {
                                zzffVar4.zze(com.google.android.gms.internal.auth.zzdq.zzn(bArr, i12));
                            }
                        }
                    }
                    return i10;
                }
                return i12;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    com.google.android.gms.internal.auth.zzer zzerVar = (com.google.android.gms.internal.auth.zzer) zzeuVar;
                    int zzj7 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i12, zzdpVar);
                    int i17 = zzdpVar.zza + zzj7;
                    while (zzj7 < i17) {
                        zzerVar.zze(com.google.android.gms.internal.auth.zzdq.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i17) {
                        return zzj7;
                    }
                    throw com.google.android.gms.internal.auth.zzew.zzf();
                }
                if (i5 == 5) {
                    com.google.android.gms.internal.auth.zzer zzerVar2 = (com.google.android.gms.internal.auth.zzer) zzeuVar;
                    zzerVar2.zze(com.google.android.gms.internal.auth.zzdq.zzb(bArr, i));
                    while (true) {
                        i11 = i12 + 4;
                        if (i11 < i2) {
                            i12 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i11, zzdpVar);
                            if (i3 == zzdpVar.zza) {
                                zzerVar2.zze(com.google.android.gms.internal.auth.zzdq.zzb(bArr, i12));
                            }
                        }
                    }
                    return i11;
                }
                return i12;
            case 25:
            case 42:
                if (i5 == 2) {
                    com.google.android.gms.internal.auth.zzdr zzdrVar = (com.google.android.gms.internal.auth.zzdr) zzeuVar;
                    zzj = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i12, zzdpVar);
                    int i18 = zzdpVar.zza + zzj;
                    while (zzj < i18) {
                        zzj = com.google.android.gms.internal.auth.zzdq.zzm(bArr, zzj, zzdpVar);
                        zzdrVar.zze(zzdpVar.zzb != 0);
                    }
                    if (zzj != i18) {
                        throw com.google.android.gms.internal.auth.zzew.zzf();
                    }
                    return zzj;
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.auth.zzdr zzdrVar2 = (com.google.android.gms.internal.auth.zzdr) zzeuVar;
                    int zzm2 = com.google.android.gms.internal.auth.zzdq.zzm(bArr, i12, zzdpVar);
                    zzdrVar2.zze(zzdpVar.zzb != 0);
                    while (zzm2 < i2) {
                        int zzj8 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, zzm2, zzdpVar);
                        if (i3 != zzdpVar.zza) {
                            return zzm2;
                        }
                        zzm2 = com.google.android.gms.internal.auth.zzdq.zzm(bArr, zzj8, zzdpVar);
                        zzdrVar2.zze(zzdpVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i12;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        i12 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i12, zzdpVar);
                        int i19 = zzdpVar.zza;
                        if (i19 < 0) {
                            throw com.google.android.gms.internal.auth.zzew.zzc();
                        }
                        if (i19 == 0) {
                            zzeuVar.add("");
                        } else {
                            zzeuVar.add(new java.lang.String(bArr, i12, i19, com.google.android.gms.internal.auth.zzev.zza));
                            i12 += i19;
                        }
                        while (i12 < i2) {
                            int zzj9 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i12, zzdpVar);
                            if (i3 == zzdpVar.zza) {
                                i12 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, zzj9, zzdpVar);
                                int i20 = zzdpVar.zza;
                                if (i20 < 0) {
                                    throw com.google.android.gms.internal.auth.zzew.zzc();
                                }
                                if (i20 == 0) {
                                    zzeuVar.add("");
                                } else {
                                    zzeuVar.add(new java.lang.String(bArr, i12, i20, com.google.android.gms.internal.auth.zzev.zza));
                                    i12 += i20;
                                }
                            }
                        }
                    } else {
                        i12 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i12, zzdpVar);
                        int i21 = zzdpVar.zza;
                        if (i21 < 0) {
                            throw com.google.android.gms.internal.auth.zzew.zzc();
                        }
                        if (i21 == 0) {
                            zzeuVar.add("");
                        } else {
                            int i22 = i12 + i21;
                            if (!com.google.android.gms.internal.auth.zzhd.zzd(bArr, i12, i22)) {
                                throw com.google.android.gms.internal.auth.zzew.zzb();
                            }
                            zzeuVar.add(new java.lang.String(bArr, i12, i21, com.google.android.gms.internal.auth.zzev.zza));
                            i12 = i22;
                        }
                        while (i12 < i2) {
                            int zzj10 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i12, zzdpVar);
                            if (i3 == zzdpVar.zza) {
                                i12 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, zzj10, zzdpVar);
                                int i23 = zzdpVar.zza;
                                if (i23 < 0) {
                                    throw com.google.android.gms.internal.auth.zzew.zzc();
                                }
                                if (i23 == 0) {
                                    zzeuVar.add("");
                                } else {
                                    int i24 = i12 + i23;
                                    if (!com.google.android.gms.internal.auth.zzhd.zzd(bArr, i12, i24)) {
                                        throw com.google.android.gms.internal.auth.zzew.zzb();
                                    }
                                    zzeuVar.add(new java.lang.String(bArr, i12, i23, com.google.android.gms.internal.auth.zzev.zza));
                                    i12 = i24;
                                }
                            }
                        }
                    }
                }
                return i12;
            case 27:
                if (i5 == 2) {
                    return com.google.android.gms.internal.auth.zzdq.zze(zzy(i6), i3, bArr, i, i2, zzeuVar, zzdpVar);
                }
                return i12;
            case 28:
                if (i5 == 2) {
                    int zzj11 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i12, zzdpVar);
                    int i25 = zzdpVar.zza;
                    if (i25 < 0) {
                        throw com.google.android.gms.internal.auth.zzew.zzc();
                    }
                    if (i25 > bArr.length - zzj11) {
                        throw com.google.android.gms.internal.auth.zzew.zzf();
                    }
                    if (i25 == 0) {
                        zzeuVar.add(com.google.android.gms.internal.auth.zzeb.zzb);
                    } else {
                        zzeuVar.add(com.google.android.gms.internal.auth.zzeb.zzk(bArr, zzj11, i25));
                        zzj11 += i25;
                    }
                    while (zzj11 < i2) {
                        int zzj12 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, zzj11, zzdpVar);
                        if (i3 != zzdpVar.zza) {
                            return zzj11;
                        }
                        zzj11 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, zzj12, zzdpVar);
                        int i26 = zzdpVar.zza;
                        if (i26 < 0) {
                            throw com.google.android.gms.internal.auth.zzew.zzc();
                        }
                        if (i26 > bArr.length - zzj11) {
                            throw com.google.android.gms.internal.auth.zzew.zzf();
                        }
                        if (i26 == 0) {
                            zzeuVar.add(com.google.android.gms.internal.auth.zzeb.zzb);
                        } else {
                            zzeuVar.add(com.google.android.gms.internal.auth.zzeb.zzk(bArr, zzj11, i26));
                            zzj11 += i26;
                        }
                    }
                    return zzj11;
                }
                return i12;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zzj = com.google.android.gms.internal.auth.zzdq.zzl(i3, bArr, i, i2, zzeuVar, zzdpVar);
                    }
                    return i12;
                }
                zzj = com.google.android.gms.internal.auth.zzdq.zzf(bArr, i12, zzeuVar, zzdpVar);
                com.google.android.gms.internal.auth.zzeq zzeqVar = (com.google.android.gms.internal.auth.zzeq) t;
                com.google.android.gms.internal.auth.zzgq zzgqVar = zzeqVar.zzc;
                if (zzgqVar == com.google.android.gms.internal.auth.zzgq.zza()) {
                    zzgqVar = null;
                }
                java.lang.Object zzd = com.google.android.gms.internal.auth.zzgd.zzd(i4, zzeuVar, zzx(i6), zzgqVar, this.zzm);
                if (zzd != null) {
                    zzeqVar.zzc = (com.google.android.gms.internal.auth.zzgq) zzd;
                    return zzj;
                }
                return zzj;
            case 33:
            case 47:
                if (i5 == 2) {
                    com.google.android.gms.internal.auth.zzer zzerVar3 = (com.google.android.gms.internal.auth.zzer) zzeuVar;
                    int zzj13 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i12, zzdpVar);
                    int i27 = zzdpVar.zza + zzj13;
                    while (zzj13 < i27) {
                        zzj13 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, zzj13, zzdpVar);
                        zzerVar3.zze(com.google.android.gms.internal.auth.zzee.zzb(zzdpVar.zza));
                    }
                    if (zzj13 == i27) {
                        return zzj13;
                    }
                    throw com.google.android.gms.internal.auth.zzew.zzf();
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.auth.zzer zzerVar4 = (com.google.android.gms.internal.auth.zzer) zzeuVar;
                    int zzj14 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i12, zzdpVar);
                    zzerVar4.zze(com.google.android.gms.internal.auth.zzee.zzb(zzdpVar.zza));
                    while (zzj14 < i2) {
                        int zzj15 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, zzj14, zzdpVar);
                        if (i3 != zzdpVar.zza) {
                            return zzj14;
                        }
                        zzj14 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, zzj15, zzdpVar);
                        zzerVar4.zze(com.google.android.gms.internal.auth.zzee.zzb(zzdpVar.zza));
                    }
                    return zzj14;
                }
                return i12;
            case 34:
            case 48:
                if (i5 == 2) {
                    com.google.android.gms.internal.auth.zzff zzffVar5 = (com.google.android.gms.internal.auth.zzff) zzeuVar;
                    int zzj16 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, i12, zzdpVar);
                    int i28 = zzdpVar.zza + zzj16;
                    while (zzj16 < i28) {
                        zzj16 = com.google.android.gms.internal.auth.zzdq.zzm(bArr, zzj16, zzdpVar);
                        zzffVar5.zze(com.google.android.gms.internal.auth.zzee.zzc(zzdpVar.zzb));
                    }
                    if (zzj16 == i28) {
                        return zzj16;
                    }
                    throw com.google.android.gms.internal.auth.zzew.zzf();
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.auth.zzff zzffVar6 = (com.google.android.gms.internal.auth.zzff) zzeuVar;
                    int zzm3 = com.google.android.gms.internal.auth.zzdq.zzm(bArr, i12, zzdpVar);
                    zzffVar6.zze(com.google.android.gms.internal.auth.zzee.zzc(zzdpVar.zzb));
                    while (zzm3 < i2) {
                        int zzj17 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, zzm3, zzdpVar);
                        if (i3 != zzdpVar.zza) {
                            return zzm3;
                        }
                        zzm3 = com.google.android.gms.internal.auth.zzdq.zzm(bArr, zzj17, zzdpVar);
                        zzffVar6.zze(com.google.android.gms.internal.auth.zzee.zzc(zzdpVar.zzb));
                    }
                    return zzm3;
                }
                return i12;
            default:
                if (i5 == 3) {
                    com.google.android.gms.internal.auth.zzgb zzy = zzy(i6);
                    int i29 = (i3 & (-8)) | 4;
                    int zzc = com.google.android.gms.internal.auth.zzdq.zzc(zzy, bArr, i, i2, i29, zzdpVar);
                    zzeuVar.add(zzdpVar.zzc);
                    while (zzc < i2) {
                        int zzj18 = com.google.android.gms.internal.auth.zzdq.zzj(bArr, zzc, zzdpVar);
                        if (i3 != zzdpVar.zza) {
                            return zzc;
                        }
                        zzc = com.google.android.gms.internal.auth.zzdq.zzc(zzy, bArr, zzj18, i2, i29, zzdpVar);
                        zzeuVar.add(zzdpVar.zzc);
                    }
                    return zzc;
                }
                return i12;
        }
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, 0);
    }

    private final int zzr(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, i2);
    }

    private final int zzs(int i) {
        return this.zzc[i + 2];
    }

    private final int zzt(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzu(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzv(int i) {
        return this.zzc[i + 1];
    }

    private static <T> long zzw(T t, long j) {
        return ((java.lang.Long) com.google.android.gms.internal.auth.zzgz.zzf(t, j)).longValue();
    }

    private final com.google.android.gms.internal.auth.zzet zzx(int i) {
        int i2 = i / 3;
        return (com.google.android.gms.internal.auth.zzet) this.zzd[i2 + i2 + 1];
    }

    private final com.google.android.gms.internal.auth.zzgb zzy(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        com.google.android.gms.internal.auth.zzgb zzgbVar = (com.google.android.gms.internal.auth.zzgb) this.zzd[i3];
        if (zzgbVar != null) {
            return zzgbVar;
        }
        com.google.android.gms.internal.auth.zzgb<T> zzb2 = com.google.android.gms.internal.auth.zzfy.zza().zzb((java.lang.Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final java.lang.Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final int zza(T t) {
        int i;
        int zzc;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzv = zzv(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzv;
            int i5 = 37;
            switch (zzu(zzv)) {
                case 0:
                    i = i2 * 53;
                    zzc = com.google.android.gms.internal.auth.zzev.zzc(java.lang.Double.doubleToLongBits(com.google.android.gms.internal.auth.zzgz.zza(t, j)));
                    i2 = i + zzc;
                    break;
                case 1:
                    i = i2 * 53;
                    zzc = java.lang.Float.floatToIntBits(com.google.android.gms.internal.auth.zzgz.zzb(t, j));
                    i2 = i + zzc;
                    break;
                case 2:
                    i = i2 * 53;
                    zzc = com.google.android.gms.internal.auth.zzev.zzc(com.google.android.gms.internal.auth.zzgz.zzd(t, j));
                    i2 = i + zzc;
                    break;
                case 3:
                    i = i2 * 53;
                    zzc = com.google.android.gms.internal.auth.zzev.zzc(com.google.android.gms.internal.auth.zzgz.zzd(t, j));
                    i2 = i + zzc;
                    break;
                case 4:
                    i = i2 * 53;
                    zzc = com.google.android.gms.internal.auth.zzgz.zzc(t, j);
                    i2 = i + zzc;
                    break;
                case 5:
                    i = i2 * 53;
                    zzc = com.google.android.gms.internal.auth.zzev.zzc(com.google.android.gms.internal.auth.zzgz.zzd(t, j));
                    i2 = i + zzc;
                    break;
                case 6:
                    i = i2 * 53;
                    zzc = com.google.android.gms.internal.auth.zzgz.zzc(t, j);
                    i2 = i + zzc;
                    break;
                case 7:
                    i = i2 * 53;
                    zzc = com.google.android.gms.internal.auth.zzev.zza(com.google.android.gms.internal.auth.zzgz.zzt(t, j));
                    i2 = i + zzc;
                    break;
                case 8:
                    i = i2 * 53;
                    zzc = ((java.lang.String) com.google.android.gms.internal.auth.zzgz.zzf(t, j)).hashCode();
                    i2 = i + zzc;
                    break;
                case 9:
                    java.lang.Object zzf = com.google.android.gms.internal.auth.zzgz.zzf(t, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzc = com.google.android.gms.internal.auth.zzgz.zzf(t, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 11:
                    i = i2 * 53;
                    zzc = com.google.android.gms.internal.auth.zzgz.zzc(t, j);
                    i2 = i + zzc;
                    break;
                case 12:
                    i = i2 * 53;
                    zzc = com.google.android.gms.internal.auth.zzgz.zzc(t, j);
                    i2 = i + zzc;
                    break;
                case 13:
                    i = i2 * 53;
                    zzc = com.google.android.gms.internal.auth.zzgz.zzc(t, j);
                    i2 = i + zzc;
                    break;
                case 14:
                    i = i2 * 53;
                    zzc = com.google.android.gms.internal.auth.zzev.zzc(com.google.android.gms.internal.auth.zzgz.zzd(t, j));
                    i2 = i + zzc;
                    break;
                case 15:
                    i = i2 * 53;
                    zzc = com.google.android.gms.internal.auth.zzgz.zzc(t, j);
                    i2 = i + zzc;
                    break;
                case 16:
                    i = i2 * 53;
                    zzc = com.google.android.gms.internal.auth.zzev.zzc(com.google.android.gms.internal.auth.zzgz.zzd(t, j));
                    i2 = i + zzc;
                    break;
                case 17:
                    java.lang.Object zzf2 = com.google.android.gms.internal.auth.zzgz.zzf(t, j);
                    if (zzf2 != null) {
                        i5 = zzf2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    zzc = com.google.android.gms.internal.auth.zzgz.zzf(t, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 50:
                    i = i2 * 53;
                    zzc = com.google.android.gms.internal.auth.zzgz.zzf(t, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 51:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = com.google.android.gms.internal.auth.zzev.zzc(java.lang.Double.doubleToLongBits(((java.lang.Double) com.google.android.gms.internal.auth.zzgz.zzf(t, j)).doubleValue()));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = java.lang.Float.floatToIntBits(((java.lang.Float) com.google.android.gms.internal.auth.zzgz.zzf(t, j)).floatValue());
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = com.google.android.gms.internal.auth.zzev.zzc(zzw(t, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = com.google.android.gms.internal.auth.zzev.zzc(zzw(t, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(t, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = com.google.android.gms.internal.auth.zzev.zzc(zzw(t, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(t, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = com.google.android.gms.internal.auth.zzev.zza(((java.lang.Boolean) com.google.android.gms.internal.auth.zzgz.zzf(t, j)).booleanValue());
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = ((java.lang.String) com.google.android.gms.internal.auth.zzgz.zzf(t, j)).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = com.google.android.gms.internal.auth.zzgz.zzf(t, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = com.google.android.gms.internal.auth.zzgz.zzf(t, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(t, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(t, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(t, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = com.google.android.gms.internal.auth.zzev.zzc(zzw(t, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(t, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = com.google.android.gms.internal.auth.zzev.zzc(zzw(t, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzJ(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = com.google.android.gms.internal.auth.zzgz.zzf(t, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return (i2 * 53) + this.zzm.zza(t).hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x0322, code lost:
    
        if (r0 != r2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0324, code lost:
    
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r13 = r32;
        r11 = r33;
        r9 = r34;
        r1 = r18;
        r2 = r19;
        r3 = r20;
        r5 = r22;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x033c, code lost:
    
        r7 = r33;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0366, code lost:
    
        if (r0 != r15) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0388, code lost:
    
        if (r0 != r15) goto L111;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0089. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zzb(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.auth.zzdp r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzdp):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final T zzd() {
        return (T) ((com.google.android.gms.internal.auth.zzeq) this.zzg).zzj(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final void zze(T t) {
        int i;
        int i2 = this.zzj;
        while (true) {
            i = this.zzk;
            if (i2 >= i) {
                break;
            }
            long zzv = zzv(this.zzi[i2]) & 1048575;
            java.lang.Object zzf = com.google.android.gms.internal.auth.zzgz.zzf(t, zzv);
            if (zzf != null) {
                ((com.google.android.gms.internal.auth.zzfk) zzf).zzc();
                com.google.android.gms.internal.auth.zzgz.zzp(t, zzv, zzf);
            }
            i2++;
        }
        int length = this.zzi.length;
        while (i < length) {
            this.zzl.zza(t, this.zzi[i]);
            i++;
        }
        this.zzm.zze(t);
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final void zzg(T t, byte[] bArr, int i, int i2, com.google.android.gms.internal.auth.zzdp zzdpVar) throws java.io.IOException {
        if (this.zzh) {
            zzo(t, bArr, i, i2, zzdpVar);
        } else {
            zzb(t, bArr, i, i2, 0, zzdpVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final boolean zzh(T t, T t2) {
        boolean zzh;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzv = zzv(i);
            long j = zzv & 1048575;
            switch (zzu(zzv)) {
                case 0:
                    if (zzF(t, t2, i) && java.lang.Double.doubleToLongBits(com.google.android.gms.internal.auth.zzgz.zza(t, j)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.auth.zzgz.zza(t2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzF(t, t2, i) && java.lang.Float.floatToIntBits(com.google.android.gms.internal.auth.zzgz.zzb(t, j)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.auth.zzgz.zzb(t2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzF(t, t2, i) && com.google.android.gms.internal.auth.zzgz.zzd(t, j) == com.google.android.gms.internal.auth.zzgz.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzF(t, t2, i) && com.google.android.gms.internal.auth.zzgz.zzd(t, j) == com.google.android.gms.internal.auth.zzgz.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzF(t, t2, i) && com.google.android.gms.internal.auth.zzgz.zzc(t, j) == com.google.android.gms.internal.auth.zzgz.zzc(t2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzF(t, t2, i) && com.google.android.gms.internal.auth.zzgz.zzd(t, j) == com.google.android.gms.internal.auth.zzgz.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzF(t, t2, i) && com.google.android.gms.internal.auth.zzgz.zzc(t, j) == com.google.android.gms.internal.auth.zzgz.zzc(t2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzF(t, t2, i) && com.google.android.gms.internal.auth.zzgz.zzt(t, j) == com.google.android.gms.internal.auth.zzgz.zzt(t2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzF(t, t2, i) && com.google.android.gms.internal.auth.zzgd.zzh(com.google.android.gms.internal.auth.zzgz.zzf(t, j), com.google.android.gms.internal.auth.zzgz.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzF(t, t2, i) && com.google.android.gms.internal.auth.zzgd.zzh(com.google.android.gms.internal.auth.zzgz.zzf(t, j), com.google.android.gms.internal.auth.zzgz.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzF(t, t2, i) && com.google.android.gms.internal.auth.zzgd.zzh(com.google.android.gms.internal.auth.zzgz.zzf(t, j), com.google.android.gms.internal.auth.zzgz.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzF(t, t2, i) && com.google.android.gms.internal.auth.zzgz.zzc(t, j) == com.google.android.gms.internal.auth.zzgz.zzc(t2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzF(t, t2, i) && com.google.android.gms.internal.auth.zzgz.zzc(t, j) == com.google.android.gms.internal.auth.zzgz.zzc(t2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzF(t, t2, i) && com.google.android.gms.internal.auth.zzgz.zzc(t, j) == com.google.android.gms.internal.auth.zzgz.zzc(t2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzF(t, t2, i) && com.google.android.gms.internal.auth.zzgz.zzd(t, j) == com.google.android.gms.internal.auth.zzgz.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzF(t, t2, i) && com.google.android.gms.internal.auth.zzgz.zzc(t, j) == com.google.android.gms.internal.auth.zzgz.zzc(t2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzF(t, t2, i) && com.google.android.gms.internal.auth.zzgz.zzd(t, j) == com.google.android.gms.internal.auth.zzgz.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzF(t, t2, i) && com.google.android.gms.internal.auth.zzgd.zzh(com.google.android.gms.internal.auth.zzgz.zzf(t, j), com.google.android.gms.internal.auth.zzgz.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzh = com.google.android.gms.internal.auth.zzgd.zzh(com.google.android.gms.internal.auth.zzgz.zzf(t, j), com.google.android.gms.internal.auth.zzgz.zzf(t2, j));
                    break;
                case 50:
                    zzh = com.google.android.gms.internal.auth.zzgd.zzh(com.google.android.gms.internal.auth.zzgz.zzf(t, j), com.google.android.gms.internal.auth.zzgz.zzf(t2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzs = zzs(i) & 1048575;
                    if (com.google.android.gms.internal.auth.zzgz.zzc(t, zzs) == com.google.android.gms.internal.auth.zzgz.zzc(t2, zzs) && com.google.android.gms.internal.auth.zzgd.zzh(com.google.android.gms.internal.auth.zzgz.zzf(t, j), com.google.android.gms.internal.auth.zzgz.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzh) {
                return false;
            }
        }
        return this.zzm.zza(t).equals(this.zzm.zza(t2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzgb
    public final boolean zzi(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzj) {
            int i6 = this.zzi[i5];
            int i7 = this.zzc[i6];
            int zzv = zzv(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzv) != 0 && !zzH(t, i6, i, i2, i10)) {
                return false;
            }
            int zzu = zzu(zzv);
            if (zzu != 9 && zzu != 17) {
                if (zzu != 27) {
                    if (zzu == 60 || zzu == 68) {
                        if (zzJ(t, i7, i6) && !zzI(t, zzv, zzy(i6))) {
                            return false;
                        }
                    } else if (zzu != 49) {
                        if (zzu == 50 && !((com.google.android.gms.internal.auth.zzfk) com.google.android.gms.internal.auth.zzgz.zzf(t, zzv & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                java.util.List list = (java.util.List) com.google.android.gms.internal.auth.zzgz.zzf(t, zzv & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    com.google.android.gms.internal.auth.zzgb zzy = zzy(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzy.zzi(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzH(t, i6, i, i2, i10) && !zzI(t, zzv, zzy(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final void zzf(T t, T t2) {
        java.util.Objects.requireNonNull(t2);
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzv = zzv(i);
            long j = 1048575 & zzv;
            int i2 = this.zzc[i];
            switch (zzu(zzv)) {
                case 0:
                    if (zzG(t2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzl(t, j, com.google.android.gms.internal.auth.zzgz.zza(t2, j));
                        zzD(t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzG(t2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzm(t, j, com.google.android.gms.internal.auth.zzgz.zzb(t2, j));
                        zzD(t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzG(t2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzo(t, j, com.google.android.gms.internal.auth.zzgz.zzd(t2, j));
                        zzD(t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzG(t2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzo(t, j, com.google.android.gms.internal.auth.zzgz.zzd(t2, j));
                        zzD(t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzG(t2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzn(t, j, com.google.android.gms.internal.auth.zzgz.zzc(t2, j));
                        zzD(t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzG(t2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzo(t, j, com.google.android.gms.internal.auth.zzgz.zzd(t2, j));
                        zzD(t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzG(t2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzn(t, j, com.google.android.gms.internal.auth.zzgz.zzc(t2, j));
                        zzD(t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzG(t2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzk(t, j, com.google.android.gms.internal.auth.zzgz.zzt(t2, j));
                        zzD(t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzG(t2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzp(t, j, com.google.android.gms.internal.auth.zzgz.zzf(t2, j));
                        zzD(t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(t, t2, i);
                    break;
                case 10:
                    if (zzG(t2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzp(t, j, com.google.android.gms.internal.auth.zzgz.zzf(t2, j));
                        zzD(t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzG(t2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzn(t, j, com.google.android.gms.internal.auth.zzgz.zzc(t2, j));
                        zzD(t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzG(t2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzn(t, j, com.google.android.gms.internal.auth.zzgz.zzc(t2, j));
                        zzD(t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzG(t2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzn(t, j, com.google.android.gms.internal.auth.zzgz.zzc(t2, j));
                        zzD(t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzG(t2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzo(t, j, com.google.android.gms.internal.auth.zzgz.zzd(t2, j));
                        zzD(t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzG(t2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzn(t, j, com.google.android.gms.internal.auth.zzgz.zzc(t2, j));
                        zzD(t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzG(t2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzo(t, j, com.google.android.gms.internal.auth.zzgz.zzd(t2, j));
                        zzD(t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzl.zzb(t, t2, j);
                    break;
                case 50:
                    com.google.android.gms.internal.auth.zzgd.zzi(this.zzp, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzJ(t2, i2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzp(t, j, com.google.android.gms.internal.auth.zzgz.zzf(t2, j));
                        zzE(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzJ(t2, i2, i)) {
                        com.google.android.gms.internal.auth.zzgz.zzp(t, j, com.google.android.gms.internal.auth.zzgz.zzf(t2, j));
                        zzE(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(t, t2, i);
                    break;
            }
        }
        com.google.android.gms.internal.auth.zzgd.zzf(this.zzm, t, t2);
    }
}
