package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzj implements com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzj(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(taskCompletionSource);
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(com.google.android.gms.common.api.Status status) {
        if (status == null) {
            return;
        }
        this.zza.setException(new com.google.android.gms.common.api.ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* synthetic */ void setResult(java.lang.Object obj) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException((com.google.android.gms.common.api.Status) obj, null, this.zza);
    }
}
