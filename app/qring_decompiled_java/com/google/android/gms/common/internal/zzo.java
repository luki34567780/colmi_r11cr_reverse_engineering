package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzo implements android.content.ServiceConnection, com.google.android.gms.common.internal.zzs {
    final /* synthetic */ com.google.android.gms.common.internal.zzr zza;
    private final java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> zzb = new java.util.HashMap();
    private int zzc = 2;
    private boolean zzd;
    private android.os.IBinder zze;
    private final com.google.android.gms.common.internal.zzn zzf;
    private android.content.ComponentName zzg;

    public zzo(com.google.android.gms.common.internal.zzr zzrVar, com.google.android.gms.common.internal.zzn zznVar) {
        this.zza = zzrVar;
        this.zzf = zznVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        java.util.HashMap hashMap;
        android.os.Handler handler;
        hashMap = this.zza.zzb;
        synchronized (hashMap) {
            handler = this.zza.zzd;
            handler.removeMessages(1, this.zzf);
            this.zze = iBinder;
            this.zzg = componentName;
            java.util.Iterator<android.content.ServiceConnection> it = this.zzb.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.zzc = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        java.util.HashMap hashMap;
        android.os.Handler handler;
        hashMap = this.zza.zzb;
        synchronized (hashMap) {
            handler = this.zza.zzd;
            handler.removeMessages(1, this.zzf);
            this.zze = null;
            this.zzg = componentName;
            java.util.Iterator<android.content.ServiceConnection> it = this.zzb.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.zzc = 2;
        }
    }

    public final int zza() {
        return this.zzc;
    }

    public final android.content.ComponentName zzb() {
        return this.zzg;
    }

    public final android.os.IBinder zzc() {
        return this.zze;
    }

    public final void zzd(android.content.ServiceConnection serviceConnection, android.content.ServiceConnection serviceConnection2, java.lang.String str) {
        this.zzb.put(serviceConnection, serviceConnection2);
    }

    public final void zze(java.lang.String str, java.util.concurrent.Executor executor) {
        com.google.android.gms.common.stats.ConnectionTracker connectionTracker;
        android.content.Context context;
        android.content.Context context2;
        com.google.android.gms.common.stats.ConnectionTracker connectionTracker2;
        android.content.Context context3;
        android.os.Handler handler;
        android.os.Handler handler2;
        long j;
        this.zzc = 3;
        com.google.android.gms.common.internal.zzr zzrVar = this.zza;
        connectionTracker = zzrVar.zzf;
        context = zzrVar.zzc;
        com.google.android.gms.common.internal.zzn zznVar = this.zzf;
        context2 = zzrVar.zzc;
        boolean zza = connectionTracker.zza(context, str, zznVar.zzc(context2), this, this.zzf.zza(), executor);
        this.zzd = zza;
        if (zza) {
            handler = this.zza.zzd;
            android.os.Message obtainMessage = handler.obtainMessage(1, this.zzf);
            handler2 = this.zza.zzd;
            j = this.zza.zzh;
            handler2.sendMessageDelayed(obtainMessage, j);
            return;
        }
        this.zzc = 2;
        try {
            com.google.android.gms.common.internal.zzr zzrVar2 = this.zza;
            connectionTracker2 = zzrVar2.zzf;
            context3 = zzrVar2.zzc;
            connectionTracker2.unbindService(context3, this);
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    public final void zzf(android.content.ServiceConnection serviceConnection, java.lang.String str) {
        this.zzb.remove(serviceConnection);
    }

    public final void zzg(java.lang.String str) {
        android.os.Handler handler;
        com.google.android.gms.common.stats.ConnectionTracker connectionTracker;
        android.content.Context context;
        handler = this.zza.zzd;
        handler.removeMessages(1, this.zzf);
        com.google.android.gms.common.internal.zzr zzrVar = this.zza;
        connectionTracker = zzrVar.zzf;
        context = zzrVar.zzc;
        connectionTracker.unbindService(context, this);
        this.zzd = false;
        this.zzc = 2;
    }

    public final boolean zzh(android.content.ServiceConnection serviceConnection) {
        return this.zzb.containsKey(serviceConnection);
    }

    public final boolean zzi() {
        return this.zzb.isEmpty();
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
