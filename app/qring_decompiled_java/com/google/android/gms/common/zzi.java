package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
abstract class zzi extends com.google.android.gms.common.internal.zzy {
    private final int zza;

    protected zzi(byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(bArr.length == 25);
        this.zza = java.util.Arrays.hashCode(bArr);
    }

    protected static byte[] zze(java.lang.String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        com.google.android.gms.dynamic.IObjectWrapper zzd;
        if (obj != null && (obj instanceof com.google.android.gms.common.internal.zzz)) {
            try {
                com.google.android.gms.common.internal.zzz zzzVar = (com.google.android.gms.common.internal.zzz) obj;
                if (zzzVar.zzc() == this.zza && (zzd = zzzVar.zzd()) != null) {
                    return java.util.Arrays.equals(zzf(), (byte[]) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzd));
                }
                return false;
            } catch (android.os.RemoteException e) {
                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final int zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final com.google.android.gms.dynamic.IObjectWrapper zzd() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(zzf());
    }

    abstract byte[] zzf();
}
