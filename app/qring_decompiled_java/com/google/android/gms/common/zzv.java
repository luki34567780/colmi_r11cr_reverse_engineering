package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzv extends com.google.android.gms.common.zzw {
    private final java.util.concurrent.Callable<java.lang.String> zzd;

    /* synthetic */ zzv(java.util.concurrent.Callable callable, com.google.android.gms.common.zzu zzuVar) {
        super(false, null, null);
        this.zzd = callable;
    }

    @Override // com.google.android.gms.common.zzw
    final java.lang.String zza() {
        try {
            return this.zzd.call();
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
