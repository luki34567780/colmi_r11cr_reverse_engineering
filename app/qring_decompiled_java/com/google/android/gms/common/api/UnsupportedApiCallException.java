package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class UnsupportedApiCallException extends java.lang.UnsupportedOperationException {
    private final com.google.android.gms.common.Feature zza;

    public UnsupportedApiCallException(com.google.android.gms.common.Feature feature) {
        this.zza = feature;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String.valueOf(valueOf).length();
        return "Missing ".concat(java.lang.String.valueOf(valueOf));
    }
}
