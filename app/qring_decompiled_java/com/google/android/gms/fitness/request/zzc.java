package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzc {
    private static final com.google.android.gms.fitness.request.zzc zza = new com.google.android.gms.fitness.request.zzc();
    private final java.util.Map zzb = new java.util.HashMap();

    private zzc() {
    }

    public static com.google.android.gms.fitness.request.zzc zza() {
        return zza;
    }

    private static com.google.android.gms.common.api.internal.ListenerHolder zzf(com.google.android.gms.fitness.request.BleScanCallback bleScanCallback, android.os.Looper looper) {
        return com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(bleScanCallback, looper, "BleScanCallback");
    }

    public final com.google.android.gms.fitness.request.zze zzb(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        com.google.android.gms.fitness.request.zze zzeVar;
        synchronized (this.zzb) {
            com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolder.getListenerKey(), "Key must not be null");
            zzeVar = (com.google.android.gms.fitness.request.zze) this.zzb.get(listenerKey);
            if (zzeVar == null) {
                zzeVar = new com.google.android.gms.fitness.request.zze(listenerHolder, null);
                this.zzb.put(listenerKey, zzeVar);
            }
        }
        return zzeVar;
    }

    public final com.google.android.gms.fitness.request.zze zzc(com.google.android.gms.fitness.request.BleScanCallback bleScanCallback, android.os.Looper looper) {
        return zzb(zzf(bleScanCallback, looper));
    }

    public final com.google.android.gms.fitness.request.zze zzd(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        synchronized (this.zzb) {
            com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = listenerHolder.getListenerKey();
            if (listenerKey == null) {
                return null;
            }
            com.google.android.gms.fitness.request.zze zzeVar = (com.google.android.gms.fitness.request.zze) this.zzb.get(listenerKey);
            if (zzeVar != null) {
                zzeVar.zzd();
            }
            return zzeVar;
        }
    }

    public final com.google.android.gms.fitness.request.zze zze(com.google.android.gms.fitness.request.BleScanCallback bleScanCallback, android.os.Looper looper) {
        return zzd(zzf(bleScanCallback, looper));
    }
}
