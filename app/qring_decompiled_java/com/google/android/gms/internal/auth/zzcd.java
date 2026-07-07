package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzcd extends com.google.android.gms.internal.auth.zzcy {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.auth.zzdg<com.google.android.gms.internal.auth.zzde<com.google.android.gms.internal.auth.zzco>> zzb;

    zzcd(android.content.Context context, @javax.annotation.Nullable com.google.android.gms.internal.auth.zzdg<com.google.android.gms.internal.auth.zzde<com.google.android.gms.internal.auth.zzco>> zzdgVar) {
        java.util.Objects.requireNonNull(context, "Null context");
        this.zza = context;
        this.zzb = zzdgVar;
    }

    public final boolean equals(java.lang.Object obj) {
        com.google.android.gms.internal.auth.zzdg<com.google.android.gms.internal.auth.zzde<com.google.android.gms.internal.auth.zzco>> zzdgVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.auth.zzcy) {
            com.google.android.gms.internal.auth.zzcy zzcyVar = (com.google.android.gms.internal.auth.zzcy) obj;
            if (this.zza.equals(zzcyVar.zza()) && ((zzdgVar = this.zzb) != null ? zzdgVar.equals(zzcyVar.zzb()) : zzcyVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        com.google.android.gms.internal.auth.zzdg<com.google.android.gms.internal.auth.zzde<com.google.android.gms.internal.auth.zzco>> zzdgVar = this.zzb;
        return hashCode ^ (zzdgVar == null ? 0 : zzdgVar.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.zzb);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 46 + java.lang.String.valueOf(valueOf2).length());
        sb.append("FlagsContext{context=");
        sb.append(valueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.auth.zzcy
    final android.content.Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzcy
    @javax.annotation.Nullable
    final com.google.android.gms.internal.auth.zzdg<com.google.android.gms.internal.auth.zzde<com.google.android.gms.internal.auth.zzco>> zzb() {
        return this.zzb;
    }
}
