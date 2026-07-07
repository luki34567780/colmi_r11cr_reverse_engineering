package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzbn extends com.google.android.gms.internal.auth.zzbd {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzbn(com.google.android.gms.internal.auth.zzbo zzboVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzc(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(str != null ? com.google.android.gms.common.api.Status.RESULT_SUCCESS : new com.google.android.gms.common.api.Status(com.google.android.gms.auth.api.proxy.AuthApiStatusCodes.AUTH_APP_CERT_ERROR), str, this.zza);
    }
}
