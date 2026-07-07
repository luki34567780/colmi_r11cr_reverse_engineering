package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zze implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzf zzb;

    zze(com.google.android.gms.tasks.zzf zzfVar, com.google.android.gms.tasks.Task task) {
        this.zzb = zzfVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.tasks.zzw zzwVar;
        com.google.android.gms.tasks.zzw zzwVar2;
        com.google.android.gms.tasks.zzw zzwVar3;
        com.google.android.gms.tasks.Continuation continuation;
        try {
            continuation = this.zzb.zzb;
            com.google.android.gms.tasks.Task task = (com.google.android.gms.tasks.Task) continuation.then(this.zza);
            if (task == null) {
                this.zzb.onFailure(new java.lang.NullPointerException("Continuation returned null"));
                return;
            }
            task.addOnSuccessListener(com.google.android.gms.tasks.TaskExecutors.zza, this.zzb);
            task.addOnFailureListener(com.google.android.gms.tasks.TaskExecutors.zza, this.zzb);
            task.addOnCanceledListener(com.google.android.gms.tasks.TaskExecutors.zza, this.zzb);
        } catch (com.google.android.gms.tasks.RuntimeExecutionException e) {
            if (e.getCause() instanceof java.lang.Exception) {
                zzwVar3 = this.zzb.zzc;
                zzwVar3.zza((java.lang.Exception) e.getCause());
            } else {
                zzwVar2 = this.zzb.zzc;
                zzwVar2.zza(e);
            }
        } catch (java.lang.Exception e2) {
            zzwVar = this.zzb.zzc;
            zzwVar.zza(e2);
        }
    }
}
