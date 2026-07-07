package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzcv extends com.google.android.gms.internal.auth.zzcz<java.lang.Double> {
    zzcv(com.google.android.gms.internal.auth.zzcx zzcxVar, java.lang.String str, java.lang.Double d, boolean z) {
        super(zzcxVar, str, d, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzcz
    final /* bridge */ /* synthetic */ java.lang.Double zza(java.lang.Object obj) {
        try {
            return java.lang.Double.valueOf(java.lang.Double.parseDouble((java.lang.String) obj));
        } catch (java.lang.NumberFormatException unused) {
            java.lang.String zzc = super.zzc();
            java.lang.String str = (java.lang.String) obj;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzc).length() + 27 + str.length());
            sb.append("Invalid double value for ");
            sb.append(zzc);
            sb.append(": ");
            sb.append(str);
            android.util.Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
