package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzf extends com.google.android.gms.common.internal.zza {
    public final android.os.IBinder zze;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i, android.os.IBinder iBinder, android.os.Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.zzf = baseGmsClient;
        this.zze = iBinder;
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final void zzb(com.google.android.gms.common.ConnectionResult connectionResult) {
        if (this.zzf.zzx != null) {
            this.zzf.zzx.onConnectionFailed(connectionResult);
        }
        this.zzf.onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final boolean zzd() {
        com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        try {
            android.os.IBinder iBinder = this.zze;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(iBinder);
            java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.zzf.getServiceDescriptor().equals(interfaceDescriptor)) {
                java.lang.String serviceDescriptor = this.zzf.getServiceDescriptor();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(serviceDescriptor).length() + 34 + java.lang.String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(serviceDescriptor);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                android.util.Log.w("GmsClient", sb.toString());
                return false;
            }
            android.os.IInterface createServiceInterface = this.zzf.createServiceInterface(this.zze);
            if (createServiceInterface == null || !(com.google.android.gms.common.internal.BaseGmsClient.zzn(this.zzf, 2, 4, createServiceInterface) || com.google.android.gms.common.internal.BaseGmsClient.zzn(this.zzf, 3, 4, createServiceInterface))) {
                return false;
            }
            this.zzf.zzB = null;
            android.os.Bundle connectionHint = this.zzf.getConnectionHint();
            com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zzf;
            baseConnectionCallbacks = baseGmsClient.zzw;
            if (baseConnectionCallbacks == null) {
                return true;
            }
            baseConnectionCallbacks2 = baseGmsClient.zzw;
            baseConnectionCallbacks2.onConnected(connectionHint);
            return true;
        } catch (android.os.RemoteException unused) {
            android.util.Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
