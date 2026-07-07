package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzew extends java.io.IOException {
    private com.google.android.gms.internal.auth.zzfq zza;

    public zzew(java.io.IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    static com.google.android.gms.internal.auth.zzew zza() {
        return new com.google.android.gms.internal.auth.zzew("Protocol message contained an invalid tag (zero).");
    }

    static com.google.android.gms.internal.auth.zzew zzb() {
        return new com.google.android.gms.internal.auth.zzew("Protocol message had invalid UTF-8.");
    }

    static com.google.android.gms.internal.auth.zzew zzc() {
        return new com.google.android.gms.internal.auth.zzew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static com.google.android.gms.internal.auth.zzew zzd() {
        return new com.google.android.gms.internal.auth.zzew("Failed to parse the message.");
    }

    static com.google.android.gms.internal.auth.zzew zzf() {
        return new com.google.android.gms.internal.auth.zzew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final com.google.android.gms.internal.auth.zzew zze(com.google.android.gms.internal.auth.zzfq zzfqVar) {
        this.zza = zzfqVar;
        return this;
    }

    public zzew(java.lang.String str) {
        super(str);
        this.zza = null;
    }
}
