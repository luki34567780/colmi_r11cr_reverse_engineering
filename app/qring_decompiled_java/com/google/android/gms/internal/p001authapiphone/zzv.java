package com.google.android.gms.internal.p001authapiphone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzv extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> implements com.google.android.gms.auth.api.phone.SmsCodeBrowserClient {
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.p001authapiphone.zzw> zza;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.p001authapiphone.zzw, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzb;
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzc;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.p001authapiphone.zzw> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zza = clientKey;
        com.google.android.gms.internal.p001authapiphone.zzt zztVar = new com.google.android.gms.internal.p001authapiphone.zzt();
        zzb = zztVar;
        zzc = new com.google.android.gms.common.api.Api<>("SmsCodeBrowser.API", zztVar, clientKey);
    }

    public zzv(android.app.Activity activity) {
        super(activity, zzc, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeBrowserClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> startSmsCodeRetriever() {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p001authapiphone.zzac.zzb).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.p001authapiphone.zzh) ((com.google.android.gms.internal.p001authapiphone.zzw) obj).getService()).zzf(new com.google.android.gms.internal.p001authapiphone.zzu(com.google.android.gms.internal.p001authapiphone.zzv.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(1566).build());
    }

    public zzv(android.content.Context context) {
        super(context, zzc, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
