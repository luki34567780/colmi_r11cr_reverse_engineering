package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzdk {
    public static <T> com.google.android.gms.internal.auth.zzdg<T> zza(com.google.android.gms.internal.auth.zzdg<T> zzdgVar) {
        return ((zzdgVar instanceof com.google.android.gms.internal.auth.zzdi) || (zzdgVar instanceof com.google.android.gms.internal.auth.zzdh)) ? zzdgVar : zzdgVar instanceof java.io.Serializable ? new com.google.android.gms.internal.auth.zzdh(zzdgVar) : new com.google.android.gms.internal.auth.zzdi(zzdgVar);
    }

    public static <T> com.google.android.gms.internal.auth.zzdg<T> zzb(T t) {
        return new com.google.android.gms.internal.auth.zzdj(t);
    }
}
