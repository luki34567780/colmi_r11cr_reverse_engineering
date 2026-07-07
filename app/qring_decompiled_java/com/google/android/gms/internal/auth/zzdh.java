package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzdh<T> implements java.io.Serializable, com.google.android.gms.internal.auth.zzdg {
    final com.google.android.gms.internal.auth.zzdg<T> zza;
    volatile transient boolean zzb;

    @javax.annotation.CheckForNull
    transient T zzc;

    zzdh(com.google.android.gms.internal.auth.zzdg<T> zzdgVar) {
        java.util.Objects.requireNonNull(zzdgVar);
        this.zza = zzdgVar;
    }

    public final java.lang.String toString() {
        java.lang.Object obj;
        if (this.zzb) {
            java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.zza;
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
                    T zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
