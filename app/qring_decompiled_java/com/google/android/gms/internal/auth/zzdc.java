package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzdc<T> extends com.google.android.gms.internal.auth.zzde<T> {
    static final com.google.android.gms.internal.auth.zzdc<java.lang.Object> zza = new com.google.android.gms.internal.auth.zzdc<>();

    private zzdc() {
    }

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final java.lang.String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.auth.zzde
    public final T zza() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.auth.zzde
    public final boolean zzb() {
        return false;
    }
}
