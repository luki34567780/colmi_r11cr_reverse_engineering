package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzr extends com.google.android.gms.common.internal.GmsClientSupervisor {
    private final java.util.HashMap<com.google.android.gms.common.internal.zzn, com.google.android.gms.common.internal.zzo> zzb = new java.util.HashMap<>();
    private final android.content.Context zzc;
    private volatile android.os.Handler zzd;
    private final com.google.android.gms.common.internal.zzq zze;
    private final com.google.android.gms.common.stats.ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;

    zzr(android.content.Context context, android.os.Looper looper) {
        com.google.android.gms.common.internal.zzq zzqVar = new com.google.android.gms.common.internal.zzq(this, null);
        this.zze = zzqVar;
        this.zzc = context.getApplicationContext();
        this.zzd = new com.google.android.gms.internal.common.zzi(looper, zzqVar);
        this.zzf = com.google.android.gms.common.stats.ConnectionTracker.getInstance();
        this.zzg = com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.LOCATION_UPDATE_INTERVAL;
        this.zzh = 300000L;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final void zza(com.google.android.gms.common.internal.zzn zznVar, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            com.google.android.gms.common.internal.zzo zzoVar = this.zzb.get(zznVar);
            if (zzoVar == null) {
                java.lang.String obj = zznVar.toString();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(obj);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            if (!zzoVar.zzh(serviceConnection)) {
                java.lang.String obj2 = zznVar.toString();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(obj2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(obj2);
                throw new java.lang.IllegalStateException(sb2.toString());
            }
            zzoVar.zzf(serviceConnection, str);
            if (zzoVar.zzi()) {
                this.zzd.sendMessageDelayed(this.zzd.obtainMessage(0, zznVar), this.zzg);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final boolean zzc(com.google.android.gms.common.internal.zzn zznVar, android.content.ServiceConnection serviceConnection, java.lang.String str, java.util.concurrent.Executor executor) {
        boolean zzj;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            com.google.android.gms.common.internal.zzo zzoVar = this.zzb.get(zznVar);
            if (zzoVar == null) {
                zzoVar = new com.google.android.gms.common.internal.zzo(this, zznVar);
                zzoVar.zzd(serviceConnection, serviceConnection, str);
                zzoVar.zze(str, executor);
                this.zzb.put(zznVar, zzoVar);
            } else {
                this.zzd.removeMessages(0, zznVar);
                if (zzoVar.zzh(serviceConnection)) {
                    java.lang.String obj = zznVar.toString();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(obj);
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                zzoVar.zzd(serviceConnection, serviceConnection, str);
                int zza = zzoVar.zza();
                if (zza == 1) {
                    serviceConnection.onServiceConnected(zzoVar.zzb(), zzoVar.zzc());
                } else if (zza == 2) {
                    zzoVar.zze(str, executor);
                }
            }
            zzj = zzoVar.zzj();
        }
        return zzj;
    }

    final void zzi(android.os.Looper looper) {
        synchronized (this.zzb) {
            this.zzd = new com.google.android.gms.internal.common.zzi(looper, this.zze);
        }
    }
}
