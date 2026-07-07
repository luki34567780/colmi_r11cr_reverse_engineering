package com.google.android.gms.internal.p001authapiphone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzp extends com.google.android.gms.internal.p001authapiphone.zzd {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzp(com.google.android.gms.internal.p001authapiphone.zzr zzrVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zze
    public final void zzb(com.google.android.gms.common.api.Status status, int i) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, java.lang.Integer.valueOf(i), this.zza);
    }
}
