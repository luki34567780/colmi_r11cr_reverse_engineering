package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzd<TResult, TContinuationResult> implements com.google.android.gms.tasks.zzq<TResult> {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> zzb;
    private final com.google.android.gms.tasks.zzw<TContinuationResult> zzc;

    public zzd(java.util.concurrent.Executor executor, com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> continuation, com.google.android.gms.tasks.zzw<TContinuationResult> zzwVar) {
        this.zza = executor;
        this.zzb = continuation;
        this.zzc = zzwVar;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(com.google.android.gms.tasks.Task<TResult> task) {
        this.zza.execute(new com.google.android.gms.tasks.zzc(this, task));
    }
}
