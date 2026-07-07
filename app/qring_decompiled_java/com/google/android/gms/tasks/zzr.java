package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzr<TResult> {
    private final java.lang.Object zza = new java.lang.Object();
    private java.util.Queue<com.google.android.gms.tasks.zzq<TResult>> zzb;
    private boolean zzc;

    zzr() {
    }

    public final void zza(com.google.android.gms.tasks.zzq<TResult> zzqVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new java.util.ArrayDeque();
            }
            this.zzb.add(zzqVar);
        }
    }

    public final void zzb(com.google.android.gms.tasks.Task<TResult> task) {
        com.google.android.gms.tasks.zzq<TResult> poll;
        synchronized (this.zza) {
            if (this.zzb != null && !this.zzc) {
                this.zzc = true;
                while (true) {
                    synchronized (this.zza) {
                        poll = this.zzb.poll();
                        if (poll == null) {
                            this.zzc = false;
                            return;
                        }
                    }
                    poll.zzd(task);
                }
            }
        }
    }
}
