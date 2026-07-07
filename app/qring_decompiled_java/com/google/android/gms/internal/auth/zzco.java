package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzco {
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> zza;

    zzco(java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map) {
        this.zza = map;
    }

    @javax.annotation.Nullable
    public final java.lang.String zza(@javax.annotation.Nullable android.net.Uri uri, @javax.annotation.Nullable java.lang.String str, @javax.annotation.Nullable java.lang.String str2, java.lang.String str3) {
        if (uri == null) {
            return null;
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.zza.get(uri.toString());
        if (map == null) {
            return null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(str3);
        return map.get(valueOf.length() != 0 ? "".concat(valueOf) : new java.lang.String(""));
    }
}
