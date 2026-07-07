package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzcw extends com.google.android.gms.internal.auth.zzcz {
    final /* synthetic */ com.google.android.gms.internal.auth.zzhl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcw(com.google.android.gms.internal.auth.zzcx zzcxVar, java.lang.String str, java.lang.Object obj, boolean z, com.google.android.gms.internal.auth.zzhl zzhlVar, byte[] bArr) {
        super(zzcxVar, "getTokenRefactor__blocked_packages", obj, true, null);
        this.zza = zzhlVar;
    }

    @Override // com.google.android.gms.internal.auth.zzcz
    final java.lang.Object zza(java.lang.Object obj) {
        try {
            return com.google.android.gms.internal.auth.zzhi.zzl(android.util.Base64.decode((java.lang.String) obj, 3));
        } catch (java.io.IOException | java.lang.IllegalArgumentException unused) {
            java.lang.String zzc = super.zzc();
            java.lang.String str = (java.lang.String) obj;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzc).length() + 27 + str.length());
            sb.append("Invalid byte[] value for ");
            sb.append(zzc);
            sb.append(": ");
            sb.append(str);
            android.util.Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
