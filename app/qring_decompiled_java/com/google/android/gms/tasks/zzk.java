package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzk implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzl zzb;

    zzk(com.google.android.gms.tasks.zzl zzlVar, com.google.android.gms.tasks.Task task) {
        this.zzb = zzlVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        com.google.android.gms.tasks.OnFailureListener onFailureListener;
        com.google.android.gms.tasks.OnFailureListener onFailureListener2;
        obj = this.zzb.zzb;
        synchronized (obj) {
            com.google.android.gms.tasks.zzl zzlVar = this.zzb;
            onFailureListener = zzlVar.zzc;
            if (onFailureListener != null) {
                onFailureListener2 = zzlVar.zzc;
                onFailureListener2.onFailure((java.lang.Exception) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza.getException()));
            }
        }
    }
}
