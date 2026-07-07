package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzb extends com.google.android.gms.internal.common.zzi {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, android.os.Looper looper) {
        super(looper);
        this.zza = baseGmsClient;
    }

    private static final void zza(android.os.Message message) {
        com.google.android.gms.common.internal.zzc zzcVar = (com.google.android.gms.common.internal.zzc) message.obj;
        zzcVar.zzc();
        zzcVar.zzg();
    }

    private static final boolean zzb(android.os.Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        com.google.android.gms.common.ConnectionResult connectionResult;
        com.google.android.gms.common.ConnectionResult connectionResult2;
        boolean z;
        if (this.zza.zzd.get() != message.arg1) {
            if (zzb(message)) {
                zza(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || ((message.what == 4 && !this.zza.enableLocalFallback()) || message.what == 5)) && !this.zza.isConnecting()) {
            zza(message);
            return;
        }
        if (message.what == 4) {
            this.zza.zzB = new com.google.android.gms.common.ConnectionResult(message.arg2);
            if (com.google.android.gms.common.internal.BaseGmsClient.zzo(this.zza)) {
                com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zza;
                z = baseGmsClient.zzC;
                if (!z) {
                    baseGmsClient.zzp(3, null);
                    return;
                }
            }
            com.google.android.gms.common.internal.BaseGmsClient baseGmsClient2 = this.zza;
            connectionResult2 = baseGmsClient2.zzB;
            com.google.android.gms.common.ConnectionResult connectionResult3 = connectionResult2 != null ? baseGmsClient2.zzB : new com.google.android.gms.common.ConnectionResult(8);
            this.zza.zzc.onReportServiceBinding(connectionResult3);
            this.zza.onConnectionFailed(connectionResult3);
            return;
        }
        if (message.what == 5) {
            com.google.android.gms.common.internal.BaseGmsClient baseGmsClient3 = this.zza;
            connectionResult = baseGmsClient3.zzB;
            com.google.android.gms.common.ConnectionResult connectionResult4 = connectionResult != null ? baseGmsClient3.zzB : new com.google.android.gms.common.ConnectionResult(8);
            this.zza.zzc.onReportServiceBinding(connectionResult4);
            this.zza.onConnectionFailed(connectionResult4);
            return;
        }
        if (message.what == 3) {
            com.google.android.gms.common.ConnectionResult connectionResult5 = new com.google.android.gms.common.ConnectionResult(message.arg2, message.obj instanceof android.app.PendingIntent ? (android.app.PendingIntent) message.obj : null);
            this.zza.zzc.onReportServiceBinding(connectionResult5);
            this.zza.onConnectionFailed(connectionResult5);
            return;
        }
        if (message.what == 6) {
            this.zza.zzp(5, null);
            com.google.android.gms.common.internal.BaseGmsClient baseGmsClient4 = this.zza;
            baseConnectionCallbacks = baseGmsClient4.zzw;
            if (baseConnectionCallbacks != null) {
                baseConnectionCallbacks2 = baseGmsClient4.zzw;
                baseConnectionCallbacks2.onConnectionSuspended(message.arg2);
            }
            this.zza.onConnectionSuspended(message.arg2);
            com.google.android.gms.common.internal.BaseGmsClient.zzn(this.zza, 5, 1, null);
            return;
        }
        if (message.what == 2 && !this.zza.isConnected()) {
            zza(message);
            return;
        }
        if (zzb(message)) {
            ((com.google.android.gms.common.internal.zzc) message.obj).zze();
            return;
        }
        int i = message.what;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        android.util.Log.wtf("GmsClient", sb.toString(), new java.lang.Exception());
    }
}
