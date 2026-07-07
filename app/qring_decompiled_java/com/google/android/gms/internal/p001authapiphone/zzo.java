package com.google.android.gms.internal.p001authapiphone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzo extends com.google.android.gms.common.api.internal.IStatusCallback.Stub {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzo(com.google.android.gms.internal.p001authapiphone.zzr zzrVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(com.google.android.gms.common.api.Status status) {
        if (status.getStatusCode() == 6) {
            this.zza.trySetException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status));
        } else {
            com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, this.zza);
        }
    }
}
