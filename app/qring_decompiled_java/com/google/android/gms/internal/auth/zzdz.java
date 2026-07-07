package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
class zzdz extends com.google.android.gms.internal.auth.zzdy {
    protected final byte[] zza;

    zzdz(byte[] bArr) {
        java.util.Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.auth.zzeb) || zzd() != ((com.google.android.gms.internal.auth.zzeb) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.auth.zzdz)) {
            return obj.equals(this);
        }
        com.google.android.gms.internal.auth.zzdz zzdzVar = (com.google.android.gms.internal.auth.zzdz) obj;
        int zzj = zzj();
        int zzj2 = zzdzVar.zzj();
        if (zzj != 0 && zzj2 != 0 && zzj != zzj2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzdzVar.zzd()) {
            int zzd2 = zzd();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(zzd);
            sb.append(zzd2);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (zzd > zzdzVar.zzd()) {
            int zzd3 = zzdzVar.zzd();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(zzd);
            sb2.append(", ");
            sb2.append(zzd3);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (!(zzdzVar instanceof com.google.android.gms.internal.auth.zzdz)) {
            return zzdzVar.zzf(0, zzd).equals(zzf(0, zzd));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzdzVar.zza;
        zzdzVar.zzc();
        int i = 0;
        int i2 = 0;
        while (i < zzd) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    protected final int zze(int i, int i2, int i3) {
        return com.google.android.gms.internal.auth.zzev.zzd(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final com.google.android.gms.internal.auth.zzeb zzf(int i, int i2) {
        int zzi = zzi(0, i2, zzd());
        return zzi == 0 ? com.google.android.gms.internal.auth.zzeb.zzb : new com.google.android.gms.internal.auth.zzdw(this.zza, 0, zzi);
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    protected final java.lang.String zzg(java.nio.charset.Charset charset) {
        return new java.lang.String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final boolean zzh() {
        return com.google.android.gms.internal.auth.zzhd.zzd(this.zza, 0, zzd());
    }
}
