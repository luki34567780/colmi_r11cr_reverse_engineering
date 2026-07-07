package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzeb implements java.lang.Iterable<java.lang.Byte>, java.io.Serializable {
    private static final java.util.Comparator<com.google.android.gms.internal.auth.zzeb> zza;
    public static final com.google.android.gms.internal.auth.zzeb zzb = new com.google.android.gms.internal.auth.zzdz(com.google.android.gms.internal.auth.zzev.zzc);
    private static final com.google.android.gms.internal.auth.zzea zzd;
    private int zzc = 0;

    static {
        int i = com.google.android.gms.internal.auth.zzdo.zza;
        zzd = new com.google.android.gms.internal.auth.zzea(null);
        zza = new com.google.android.gms.internal.auth.zzdu();
    }

    zzeb() {
    }

    public static com.google.android.gms.internal.auth.zzeb zzk(byte[] bArr, int i, int i2) {
        zzi(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return new com.google.android.gms.internal.auth.zzdz(bArr2);
    }

    public static com.google.android.gms.internal.auth.zzeb zzl(java.lang.String str) {
        return new com.google.android.gms.internal.auth.zzdz(str.getBytes(com.google.android.gms.internal.auth.zzev.zza));
    }

    public abstract boolean equals(java.lang.Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zze(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
        return new com.google.android.gms.internal.auth.zzds(this);
    }

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        objArr[1] = java.lang.Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? com.google.android.gms.internal.auth.zzgn.zza(this) : java.lang.String.valueOf(com.google.android.gms.internal.auth.zzgn.zza(zzf(0, 47))).concat("...");
        return java.lang.String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    abstract byte zzb(int i);

    public abstract int zzd();

    protected abstract int zze(int i, int i2, int i3);

    public abstract com.google.android.gms.internal.auth.zzeb zzf(int i, int i2);

    protected abstract java.lang.String zzg(java.nio.charset.Charset charset);

    public abstract boolean zzh();

    protected final int zzj() {
        return this.zzc;
    }

    public final java.lang.String zzm(java.nio.charset.Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }

    static int zzi(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new java.lang.IndexOutOfBoundsException(sb3.toString());
    }
}
