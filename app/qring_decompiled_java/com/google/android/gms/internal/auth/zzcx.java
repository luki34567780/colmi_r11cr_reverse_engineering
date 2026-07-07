package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzcx {
    final java.lang.String zza;
    final android.net.Uri zzb;
    final java.lang.String zzc;
    final java.lang.String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;

    @javax.annotation.Nullable
    final com.google.android.gms.internal.auth.zzdd<android.content.Context, java.lang.Boolean> zzi;

    public zzcx(android.net.Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzcx(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, boolean z4, @javax.annotation.Nullable com.google.android.gms.internal.auth.zzdd<android.content.Context, java.lang.Boolean> zzddVar) {
        this.zza = null;
        this.zzb = uri;
        this.zzc = "";
        this.zzd = "";
        this.zze = z;
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
    }

    public final com.google.android.gms.internal.auth.zzcx zza() {
        if (this.zzc.isEmpty()) {
            return new com.google.android.gms.internal.auth.zzcx(null, this.zzb, this.zzc, this.zzd, true, false, false, false, null);
        }
        throw new java.lang.IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final com.google.android.gms.internal.auth.zzcz<java.lang.Double> zzb(java.lang.String str, double d) {
        return new com.google.android.gms.internal.auth.zzcv(this, str, java.lang.Double.valueOf(0.0d), true);
    }

    public final com.google.android.gms.internal.auth.zzcz<java.lang.Long> zzc(java.lang.String str, long j) {
        return new com.google.android.gms.internal.auth.zzct(this, str, java.lang.Long.valueOf(j), true);
    }

    public final com.google.android.gms.internal.auth.zzcz<java.lang.Boolean> zzd(java.lang.String str, boolean z) {
        return new com.google.android.gms.internal.auth.zzcu(this, str, java.lang.Boolean.valueOf(z), true);
    }

    public final <T> com.google.android.gms.internal.auth.zzcz<T> zze(java.lang.String str, T t, com.google.android.gms.internal.auth.zzhl zzhlVar) {
        return new com.google.android.gms.internal.auth.zzcw(this, "getTokenRefactor__blocked_packages", t, true, zzhlVar, null);
    }
}
