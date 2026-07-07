package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzi implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzj zzb;

    zzi(com.google.android.gms.tasks.zzj zzjVar, com.google.android.gms.tasks.Task task) {
        this.zzb = zzjVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        com.google.android.gms.tasks.OnCompleteListener onCompleteListener;
        com.google.android.gms.tasks.OnCompleteListener onCompleteListener2;
        obj = this.zzb.zzb;
        synchronized (obj) {
            com.google.android.gms.tasks.zzj zzjVar = this.zzb;
            onCompleteListener = zzjVar.zzc;
            if (onCompleteListener != null) {
                onCompleteListener2 = zzjVar.zzc;
                onCompleteListener2.onComplete(this.zza);
            }
        }
    }
}
