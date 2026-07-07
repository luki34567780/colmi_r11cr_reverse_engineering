package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzq implements android.os.Handler.Callback {
    final /* synthetic */ com.google.android.gms.common.internal.zzr zza;

    /* synthetic */ zzq(com.google.android.gms.common.internal.zzr zzrVar, com.google.android.gms.common.internal.zzp zzpVar) {
        this.zza = zzrVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.util.HashMap hashMap3;
        java.util.HashMap hashMap4;
        java.util.HashMap hashMap5;
        int i = message.what;
        if (i == 0) {
            hashMap = this.zza.zzb;
            synchronized (hashMap) {
                com.google.android.gms.common.internal.zzn zznVar = (com.google.android.gms.common.internal.zzn) message.obj;
                hashMap2 = this.zza.zzb;
                com.google.android.gms.common.internal.zzo zzoVar = (com.google.android.gms.common.internal.zzo) hashMap2.get(zznVar);
                if (zzoVar != null && zzoVar.zzi()) {
                    if (zzoVar.zzj()) {
                        zzoVar.zzg("GmsClientSupervisor");
                    }
                    hashMap3 = this.zza.zzb;
                    hashMap3.remove(zznVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        hashMap4 = this.zza.zzb;
        synchronized (hashMap4) {
            com.google.android.gms.common.internal.zzn zznVar2 = (com.google.android.gms.common.internal.zzn) message.obj;
            hashMap5 = this.zza.zzb;
            com.google.android.gms.common.internal.zzo zzoVar2 = (com.google.android.gms.common.internal.zzo) hashMap5.get(zznVar2);
            if (zzoVar2 != null && zzoVar2.zza() == 3) {
                java.lang.String valueOf = java.lang.String.valueOf(zznVar2);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(valueOf);
                android.util.Log.e("GmsClientSupervisor", sb.toString(), new java.lang.Exception());
                android.content.ComponentName zzb = zzoVar2.zzb();
                if (zzb == null) {
                    zzb = zznVar2.zzb();
                }
                if (zzb == null) {
                    java.lang.String zzd = zznVar2.zzd();
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzd);
                    zzb = new android.content.ComponentName(zzd, com.google.android.gms.fitness.FitnessActivities.UNKNOWN);
                }
                zzoVar2.onServiceDisconnected(zzb);
            }
        }
        return true;
    }
}
