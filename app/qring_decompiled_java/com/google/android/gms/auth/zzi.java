package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzi implements com.google.android.gms.auth.zzk<java.util.List<com.google.android.gms.auth.AccountChangeEvent>> {
    final /* synthetic */ com.google.android.gms.auth.AccountChangeEventsRequest zza;

    zzi(com.google.android.gms.auth.AccountChangeEventsRequest accountChangeEventsRequest) {
        this.zza = accountChangeEventsRequest;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ java.util.List<com.google.android.gms.auth.AccountChangeEvent> zza(android.os.IBinder iBinder) throws android.os.RemoteException, java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        com.google.android.gms.auth.AccountChangeEventsResponse zzh = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzh(this.zza);
        com.google.android.gms.auth.zzl.zzd(zzh);
        return zzh.getEvents();
    }
}
