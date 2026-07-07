package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzh implements com.google.android.gms.auth.zzk<java.lang.Void> {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ android.os.Bundle zzb;

    zzh(java.lang.String str, android.os.Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ java.lang.Void zza(android.os.IBinder iBinder) throws android.os.RemoteException, java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        android.os.Bundle zzd = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzd(this.zza, this.zzb);
        com.google.android.gms.auth.zzl.zzd(zzd);
        java.lang.String string = zzd.getString("Error");
        if (zzd.getBoolean("booleanResult")) {
            return null;
        }
        throw new com.google.android.gms.auth.GoogleAuthException(string);
    }
}
