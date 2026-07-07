package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzeq implements com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzeq(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(com.google.android.gms.common.api.Status status) {
        throw new java.lang.UnsupportedOperationException("This method should never get invoked");
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* synthetic */ void setResult(java.lang.Object obj) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException((com.google.android.gms.common.api.Status) obj, this.zza);
    }
}
