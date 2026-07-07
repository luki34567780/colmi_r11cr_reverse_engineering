package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzcu extends com.google.android.gms.internal.auth.zzcz<java.lang.Boolean> {
    zzcu(com.google.android.gms.internal.auth.zzcx zzcxVar, java.lang.String str, java.lang.Boolean bool, boolean z) {
        super(zzcxVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzcz
    final /* bridge */ /* synthetic */ java.lang.Boolean zza(java.lang.Object obj) {
        if (com.google.android.gms.internal.auth.zzcb.zzc.matcher(obj).matches()) {
            return true;
        }
        if (com.google.android.gms.internal.auth.zzcb.zzd.matcher(obj).matches()) {
            return false;
        }
        java.lang.String zzc = super.zzc();
        java.lang.String str = (java.lang.String) obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzc).length() + 28 + str.length());
        sb.append("Invalid boolean value for ");
        sb.append(zzc);
        sb.append(": ");
        sb.append(str);
        android.util.Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
