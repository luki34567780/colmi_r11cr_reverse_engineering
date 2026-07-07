package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzes extends com.google.android.gms.internal.fitness.zzco {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zza;

    public zzes(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder) {
        this.zza = resultHolder;
    }

    public static com.google.android.gms.internal.fitness.zzes zzc(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        return new com.google.android.gms.internal.fitness.zzes(new com.google.android.gms.internal.fitness.zzeq(taskCompletionSource));
    }

    public static com.google.android.gms.internal.fitness.zzes zze(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        return new com.google.android.gms.internal.fitness.zzes(new com.google.android.gms.internal.fitness.zzer(taskCompletionSource));
    }

    @Override // com.google.android.gms.internal.fitness.zzcp
    public final void zzd(com.google.android.gms.common.api.Status status) {
        this.zza.setResult(status);
    }
}
