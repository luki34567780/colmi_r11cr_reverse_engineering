package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzab extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> implements com.google.android.gms.internal.auth.zzg {
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzi> zza;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzi, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzb;
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzc;
    private static final com.google.android.gms.common.logging.Logger zzd;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzi> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zza = clientKey;
        com.google.android.gms.internal.auth.zzv zzvVar = new com.google.android.gms.internal.auth.zzv();
        zzb = zzvVar;
        zzc = new com.google.android.gms.common.api.Api<>("GoogleAuthService.API", zzvVar, clientKey);
        zzd = com.google.android.gms.auth.zzd.zza("GoogleAuthServiceClient");
    }

    zzab(android.content.Context context) {
        super(context, zzc, com.google.android.gms.common.api.Api.ApiOptions.NoOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    static /* synthetic */ void zzf(com.google.android.gms.common.api.Status status, java.lang.Object obj, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        if (com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(status, obj, taskCompletionSource)) {
            return;
        }
        zzd.w("The task is already complete.", new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final com.google.android.gms.tasks.Task<java.lang.Void> zza(final com.google.android.gms.internal.auth.zzbw zzbwVar) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.auth.zze.zzf).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth.zzt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.auth.zzab zzabVar = com.google.android.gms.internal.auth.zzab.this;
                ((com.google.android.gms.internal.auth.zzp) ((com.google.android.gms.internal.auth.zzi) obj).getService()).zzd(new com.google.android.gms.internal.auth.zzx(zzabVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), zzbwVar);
            }
        }).setMethodKey(1513).build());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.AccountChangeEventsResponse> zzb(final com.google.android.gms.auth.AccountChangeEventsRequest accountChangeEventsRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(accountChangeEventsRequest, "request cannot be null.");
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.auth.zze.zzg).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.auth.zzab zzabVar = com.google.android.gms.internal.auth.zzab.this;
                com.google.android.gms.auth.AccountChangeEventsRequest accountChangeEventsRequest2 = accountChangeEventsRequest;
                ((com.google.android.gms.internal.auth.zzp) ((com.google.android.gms.internal.auth.zzi) obj).getService()).zze(new com.google.android.gms.internal.auth.zzz(zzabVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), accountChangeEventsRequest2);
            }
        }).setMethodKey(1515).build());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final com.google.android.gms.tasks.Task<android.os.Bundle> zzc(final android.accounts.Account account, final java.lang.String str, final android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(account, "Account name cannot be null!");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Scope cannot be null!");
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.auth.zze.zzf).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth.zzr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.auth.zzab zzabVar = com.google.android.gms.internal.auth.zzab.this;
                ((com.google.android.gms.internal.auth.zzp) ((com.google.android.gms.internal.auth.zzi) obj).getService()).zzf(new com.google.android.gms.internal.auth.zzw(zzabVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), account, str, bundle);
            }
        }).setMethodKey(1512).build());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final com.google.android.gms.tasks.Task<android.os.Bundle> zzd(final android.accounts.Account account) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(account, "account cannot be null.");
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.auth.zze.zzg).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.auth.zzab zzabVar = com.google.android.gms.internal.auth.zzab.this;
                ((com.google.android.gms.internal.auth.zzp) ((com.google.android.gms.internal.auth.zzi) obj).getService()).zzg(new com.google.android.gms.internal.auth.zzaa(zzabVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), account);
            }
        }).setMethodKey(1517).build());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final com.google.android.gms.tasks.Task<android.os.Bundle> zze(final java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Client package name cannot be null!");
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.auth.zze.zzg).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth.zzu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.auth.zzab zzabVar = com.google.android.gms.internal.auth.zzab.this;
                ((com.google.android.gms.internal.auth.zzp) ((com.google.android.gms.internal.auth.zzi) obj).getService()).zzh(new com.google.android.gms.internal.auth.zzy(zzabVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), str);
            }
        }).setMethodKey(1514).build());
    }
}
