package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzhi extends com.google.android.gms.internal.auth.zzeq<com.google.android.gms.internal.auth.zzhi, com.google.android.gms.internal.auth.zzhh> implements com.google.android.gms.internal.auth.zzfr {
    private static final com.google.android.gms.internal.auth.zzhi zzb;
    private com.google.android.gms.internal.auth.zzeu<java.lang.String> zzd = com.google.android.gms.internal.auth.zzeq.zzd();

    static {
        com.google.android.gms.internal.auth.zzhi zzhiVar = new com.google.android.gms.internal.auth.zzhi();
        zzb = zzhiVar;
        com.google.android.gms.internal.auth.zzeq.zzi(com.google.android.gms.internal.auth.zzhi.class, zzhiVar);
    }

    private zzhi() {
    }

    public static com.google.android.gms.internal.auth.zzhi zzl(byte[] bArr) throws com.google.android.gms.internal.auth.zzew {
        return (com.google.android.gms.internal.auth.zzhi) com.google.android.gms.internal.auth.zzeq.zzb(zzb, bArr);
    }

    @Override // com.google.android.gms.internal.auth.zzeq
    protected final java.lang.Object zzj(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzg(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.auth.zzhi();
        }
        com.google.android.gms.internal.auth.zzhg zzhgVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.auth.zzhh(zzhgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final java.util.List<java.lang.String> zzm() {
        return this.zzd;
    }
}
