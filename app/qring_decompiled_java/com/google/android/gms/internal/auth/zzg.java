package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public interface zzg extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    com.google.android.gms.tasks.Task<java.lang.Void> zza(com.google.android.gms.internal.auth.zzbw zzbwVar);

    com.google.android.gms.tasks.Task<com.google.android.gms.auth.AccountChangeEventsResponse> zzb(com.google.android.gms.auth.AccountChangeEventsRequest accountChangeEventsRequest);

    com.google.android.gms.tasks.Task<android.os.Bundle> zzc(android.accounts.Account account, java.lang.String str, android.os.Bundle bundle);

    com.google.android.gms.tasks.Task<android.os.Bundle> zzd(android.accounts.Account account);

    com.google.android.gms.tasks.Task<android.os.Bundle> zze(java.lang.String str);
}
