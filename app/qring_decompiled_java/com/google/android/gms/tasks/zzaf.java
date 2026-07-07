package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzaf implements com.google.android.gms.tasks.zzae {
    private final java.lang.Object zza = new java.lang.Object();
    private final int zzb;
    private final com.google.android.gms.tasks.zzw<java.lang.Void> zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private java.lang.Exception zzg;
    private boolean zzh;

    public zzaf(int i, com.google.android.gms.tasks.zzw<java.lang.Void> zzwVar) {
        this.zzb = i;
        this.zzc = zzwVar;
    }

    private final void zza() {
        if (this.zzd + this.zze + this.zzf == this.zzb) {
            if (this.zzg == null) {
                if (this.zzh) {
                    this.zzc.zzc();
                    return;
                } else {
                    this.zzc.zzb(null);
                    return;
                }
            }
            com.google.android.gms.tasks.zzw<java.lang.Void> zzwVar = this.zzc;
            int i = this.zze;
            int i2 = this.zzb;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(54);
            sb.append(i);
            sb.append(" out of ");
            sb.append(i2);
            sb.append(" underlying tasks failed");
            zzwVar.zza(new java.util.concurrent.ExecutionException(sb.toString(), this.zzg));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(java.lang.Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(java.lang.Object obj) {
        synchronized (this.zza) {
            this.zzd++;
            zza();
        }
    }
}
