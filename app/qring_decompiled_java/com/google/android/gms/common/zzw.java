package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
class zzw {
    private static final com.google.android.gms.common.zzw zzd = new com.google.android.gms.common.zzw(true, null, null);
    final boolean zza;

    @javax.annotation.Nullable
    final java.lang.String zzb;

    @javax.annotation.Nullable
    final java.lang.Throwable zzc;

    zzw(boolean z, @javax.annotation.Nullable java.lang.String str, @javax.annotation.Nullable java.lang.Throwable th) {
        this.zza = z;
        this.zzb = str;
        this.zzc = th;
    }

    static com.google.android.gms.common.zzw zzb() {
        return zzd;
    }

    static com.google.android.gms.common.zzw zzc(java.lang.String str) {
        return new com.google.android.gms.common.zzw(false, str, null);
    }

    static com.google.android.gms.common.zzw zzd(java.lang.String str, java.lang.Throwable th) {
        return new com.google.android.gms.common.zzw(false, str, th);
    }

    @javax.annotation.Nullable
    java.lang.String zza() {
        return this.zzb;
    }

    final void zze() {
        if (this.zza || !android.util.Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzc != null) {
            android.util.Log.d("GoogleCertificatesRslt", zza(), this.zzc);
        } else {
            android.util.Log.d("GoogleCertificatesRslt", zza());
        }
    }
}
