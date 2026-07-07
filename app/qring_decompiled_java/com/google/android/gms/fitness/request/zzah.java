package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzah {
    private static final com.google.android.gms.fitness.request.zzah zza = new com.google.android.gms.fitness.request.zzah();
    private final java.util.Map zzb = new java.util.HashMap();

    private zzah() {
    }

    public static com.google.android.gms.fitness.request.zzah zza() {
        return zza;
    }

    private static com.google.android.gms.common.api.internal.ListenerHolder zzf(com.google.android.gms.fitness.request.OnDataPointListener onDataPointListener, android.os.Looper looper) {
        return com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(onDataPointListener, looper, "OnDataPointListener");
    }

    public final com.google.android.gms.fitness.request.zzaj zzb(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        com.google.android.gms.fitness.request.zzaj zzajVar;
        synchronized (this.zzb) {
            com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolder.getListenerKey(), "Key must not be null");
            zzajVar = (com.google.android.gms.fitness.request.zzaj) this.zzb.get(listenerKey);
            if (zzajVar == null) {
                zzajVar = new com.google.android.gms.fitness.request.zzaj(listenerHolder, null);
                this.zzb.put(listenerKey, zzajVar);
            }
        }
        return zzajVar;
    }

    public final com.google.android.gms.fitness.request.zzaj zzc(com.google.android.gms.fitness.request.OnDataPointListener onDataPointListener, android.os.Looper looper) {
        return zzb(zzf(onDataPointListener, looper));
    }

    public final com.google.android.gms.fitness.request.zzaj zzd(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        synchronized (this.zzb) {
            com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = listenerHolder.getListenerKey();
            if (listenerKey == null) {
                return null;
            }
            com.google.android.gms.fitness.request.zzaj zzajVar = (com.google.android.gms.fitness.request.zzaj) this.zzb.remove(listenerKey);
            if (zzajVar != null) {
                zzajVar.zzc();
            }
            return zzajVar;
        }
    }

    public final com.google.android.gms.fitness.request.zzaj zze(com.google.android.gms.fitness.request.OnDataPointListener onDataPointListener, android.os.Looper looper) {
        return zzd(zzf(onDataPointListener, looper));
    }
}
