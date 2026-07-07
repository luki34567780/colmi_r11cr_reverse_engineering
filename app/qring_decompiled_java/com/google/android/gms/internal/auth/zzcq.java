package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzcq {
    private static final androidx.collection.ArrayMap<java.lang.String, android.net.Uri> zza = new androidx.collection.ArrayMap<>();

    public static synchronized android.net.Uri zza(java.lang.String str) {
        android.net.Uri uri;
        synchronized (com.google.android.gms.internal.auth.zzcq.class) {
            androidx.collection.ArrayMap<java.lang.String, android.net.Uri> arrayMap = zza;
            uri = (android.net.Uri) arrayMap.get("com.google.android.gms.auth_account");
            if (uri == null) {
                java.lang.String valueOf = java.lang.String.valueOf(android.net.Uri.encode("com.google.android.gms.auth_account"));
                uri = android.net.Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new java.lang.String("content://com.google.android.gms.phenotype/"));
                arrayMap.put("com.google.android.gms.auth_account", uri);
            }
        }
        return uri;
    }
}
