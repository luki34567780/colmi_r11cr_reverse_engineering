package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzdi<T> implements com.google.android.gms.internal.auth.zzdg<T> {

    @javax.annotation.CheckForNull
    volatile com.google.android.gms.internal.auth.zzdg<T> zza;
    volatile boolean zzb;

    @javax.annotation.CheckForNull
    T zzc;

    zzdi(com.google.android.gms.internal.auth.zzdg<T> zzdgVar) {
        java.util.Objects.requireNonNull(zzdgVar);
        this.zza = zzdgVar;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.zza;
        if (obj == null) {
            java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        java.lang.String valueOf2 = java.lang.String.valueOf(obj);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.auth.zzdg
    public final T zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    com.google.android.gms.internal.auth.zzdg<T> zzdgVar = this.zza;
                    zzdgVar.getClass();
                    T zza = zzdgVar.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    this.zza = null;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
