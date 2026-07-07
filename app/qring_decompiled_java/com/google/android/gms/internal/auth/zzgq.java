package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzgq {
    private static final com.google.android.gms.internal.auth.zzgq zza = new com.google.android.gms.internal.auth.zzgq(0, new int[0], new java.lang.Object[0], false);
    private int zzb;
    private int[] zzc;
    private java.lang.Object[] zzd;
    private boolean zze;

    private zzgq() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private zzgq(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = z;
    }

    public static com.google.android.gms.internal.auth.zzgq zza() {
        return zza;
    }

    static com.google.android.gms.internal.auth.zzgq zzb(com.google.android.gms.internal.auth.zzgq zzgqVar, com.google.android.gms.internal.auth.zzgq zzgqVar2) {
        int i = zzgqVar.zzb + zzgqVar2.zzb;
        int[] copyOf = java.util.Arrays.copyOf(zzgqVar.zzc, i);
        java.lang.System.arraycopy(zzgqVar2.zzc, 0, copyOf, zzgqVar.zzb, zzgqVar2.zzb);
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(zzgqVar.zzd, i);
        java.lang.System.arraycopy(zzgqVar2.zzd, 0, copyOf2, zzgqVar.zzb, zzgqVar2.zzb);
        return new com.google.android.gms.internal.auth.zzgq(i, copyOf, copyOf2, true);
    }

    static com.google.android.gms.internal.auth.zzgq zzc() {
        return new com.google.android.gms.internal.auth.zzgq(0, new int[8], new java.lang.Object[8], true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.android.gms.internal.auth.zzgq)) {
            return false;
        }
        com.google.android.gms.internal.auth.zzgq zzgqVar = (com.google.android.gms.internal.auth.zzgq) obj;
        int i = this.zzb;
        if (i == zzgqVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgqVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    java.lang.Object[] objArr = this.zzd;
                    java.lang.Object[] objArr2 = zzgqVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        java.lang.Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void zzd() {
        this.zze = false;
    }

    final void zze(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            com.google.android.gms.internal.auth.zzfs.zzb(sb, i, java.lang.String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzf(int i, java.lang.Object obj) {
        if (!this.zze) {
            throw new java.lang.UnsupportedOperationException();
        }
        int i2 = this.zzb;
        int[] iArr = this.zzc;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.zzc = java.util.Arrays.copyOf(iArr, i3);
            this.zzd = java.util.Arrays.copyOf(this.zzd, i3);
        }
        int[] iArr2 = this.zzc;
        int i4 = this.zzb;
        iArr2[i4] = i;
        this.zzd[i4] = obj;
        this.zzb = i4 + 1;
    }
}
