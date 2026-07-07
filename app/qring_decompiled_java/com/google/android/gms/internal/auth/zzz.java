package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzz extends com.google.android.gms.internal.auth.zzl {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzz(com.google.android.gms.internal.auth.zzab zzabVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzm
    public final void zzb(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.AccountChangeEventsResponse accountChangeEventsResponse) {
        com.google.android.gms.internal.auth.zzab.zzf(status, accountChangeEventsResponse, this.zza);
    }
}
