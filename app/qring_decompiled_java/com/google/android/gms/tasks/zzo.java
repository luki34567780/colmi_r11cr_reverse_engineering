package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzo implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzp zzb;

    zzo(com.google.android.gms.tasks.zzp zzpVar, com.google.android.gms.tasks.Task task) {
        this.zzb = zzpVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.tasks.SuccessContinuation successContinuation;
        try {
            successContinuation = this.zzb.zzb;
            com.google.android.gms.tasks.Task then = successContinuation.then(this.zza.getResult());
            if (then == null) {
                this.zzb.onFailure(new java.lang.NullPointerException("Continuation returned null"));
                return;
            }
            then.addOnSuccessListener(com.google.android.gms.tasks.TaskExecutors.zza, this.zzb);
            then.addOnFailureListener(com.google.android.gms.tasks.TaskExecutors.zza, this.zzb);
            then.addOnCanceledListener(com.google.android.gms.tasks.TaskExecutors.zza, this.zzb);
        } catch (com.google.android.gms.tasks.RuntimeExecutionException e) {
            if (e.getCause() instanceof java.lang.Exception) {
                this.zzb.onFailure((java.lang.Exception) e.getCause());
            } else {
                this.zzb.onFailure(e);
            }
        } catch (java.util.concurrent.CancellationException unused) {
            this.zzb.onCanceled();
        } catch (java.lang.Exception e2) {
            this.zzb.onFailure(e2);
        }
    }
}
