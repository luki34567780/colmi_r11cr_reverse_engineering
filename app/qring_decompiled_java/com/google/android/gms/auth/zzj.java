package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzj implements com.google.android.gms.auth.zzk<java.lang.Boolean> {
    final /* synthetic */ java.lang.String zza;

    zzj(java.lang.String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ java.lang.Boolean zza(android.os.IBinder iBinder) throws android.os.RemoteException, java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        com.google.android.gms.common.logging.Logger logger;
        android.os.Bundle zzg = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzg(this.zza);
        com.google.android.gms.auth.zzl.zzd(zzg);
        java.lang.String string = zzg.getString("Error");
        android.content.Intent intent = (android.content.Intent) zzg.getParcelable("userRecoveryIntent");
        com.google.android.gms.internal.auth.zzby zza = com.google.android.gms.internal.auth.zzby.zza(string);
        if (com.google.android.gms.internal.auth.zzby.SUCCESS.equals(zza)) {
            return true;
        }
        if (!com.google.android.gms.internal.auth.zzby.zzb(zza)) {
            throw new com.google.android.gms.auth.GoogleAuthException(string);
        }
        logger = com.google.android.gms.auth.zzl.zzd;
        java.lang.String valueOf = java.lang.String.valueOf(zza);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 31);
        sb.append("isUserRecoverableError status: ");
        sb.append(valueOf);
        logger.w("GoogleAuthUtil", sb.toString());
        throw new com.google.android.gms.auth.UserRecoverableAuthException(string, intent);
    }
}
