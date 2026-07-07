package com.google.android.gms.auth.api.phone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class SmsRetrieverClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> implements com.google.android.gms.auth.api.phone.SmsRetrieverApi {
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.p001authapiphone.zzw> zza;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.p001authapiphone.zzw, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzb;
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzc;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.p001authapiphone.zzw> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zza = clientKey;
        com.google.android.gms.auth.api.phone.zza zzaVar = new com.google.android.gms.auth.api.phone.zza();
        zzb = zzaVar;
        zzc = new com.google.android.gms.common.api.Api<>("SmsRetriever.API", zzaVar, clientKey);
    }

    public SmsRetrieverClient(android.app.Activity activity) {
        super(activity, zzc, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> startSmsRetriever();

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> startSmsUserConsent(java.lang.String str);

    public SmsRetrieverClient(android.content.Context context) {
        super(context, zzc, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
