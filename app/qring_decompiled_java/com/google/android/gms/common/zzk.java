package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
abstract class zzk extends com.google.android.gms.common.zzi {
    private static final java.lang.ref.WeakReference<byte[]> zza = new java.lang.ref.WeakReference<>(null);
    private java.lang.ref.WeakReference<byte[]> zzb;

    zzk(byte[] bArr) {
        super(bArr);
        this.zzb = zza;
    }

    protected abstract byte[] zzb();

    @Override // com.google.android.gms.common.zzi
    final byte[] zzf() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.zzb.get();
            if (bArr == null) {
                bArr = zzb();
                this.zzb = new java.lang.ref.WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
