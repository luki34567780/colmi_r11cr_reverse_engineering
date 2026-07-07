package com.google.android.gms.internal.p002authapiphone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: classes2.dex */
public final class zzr extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> implements com.google.android.gms.auth.api.phone.SmsCodeAutofillClient {
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.p002authapiphone.zzw> zza;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.p002authapiphone.zzw, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzb;
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzc;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.p002authapiphone.zzw> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zza = clientKey;
        com.google.android.gms.internal.p002authapiphone.zzn zznVar = new com.google.android.gms.internal.p002authapiphone.zzn();
        zzb = zznVar;
        zzc = new com.google.android.gms.common.api.Api<>("SmsCodeAutofill.API", zznVar, clientKey);
    }

    public zzr(android.app.Activity activity) {
        super(activity, zzc, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final com.google.android.gms.tasks.Task<java.lang.Integer> checkPermissionState() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p002authapiphone.zzac.zza).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.p002authapiphone.zzh) ((com.google.android.gms.internal.p002authapiphone.zzw) obj).getService()).zzc(new com.google.android.gms.internal.p002authapiphone.zzp(com.google.android.gms.internal.p002authapiphone.zzr.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(1564).build());
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> hasOngoingSmsRequest(final java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkArgument(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p002authapiphone.zzac.zza).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p002authapiphone.zzr zzrVar = com.google.android.gms.internal.p002authapiphone.zzr.this;
                ((com.google.android.gms.internal.p002authapiphone.zzh) ((com.google.android.gms.internal.p002authapiphone.zzw) obj).getService()).zzd(str, new com.google.android.gms.internal.p002authapiphone.zzq(zzrVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(1565).build());
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> startSmsCodeRetriever() {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p002authapiphone.zzac.zza).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.p002authapiphone.zzh) ((com.google.android.gms.internal.p002authapiphone.zzw) obj).getService()).zze(new com.google.android.gms.internal.p002authapiphone.zzo(com.google.android.gms.internal.p002authapiphone.zzr.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(1563).build());
    }

    public zzr(android.content.Context context) {
        super(context, zzc, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
