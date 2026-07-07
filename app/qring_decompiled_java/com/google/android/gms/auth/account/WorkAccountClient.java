package com.google.android.gms.auth.account;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public class WorkAccountClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    private final com.google.android.gms.auth.account.WorkAccountApi zza;

    WorkAccountClient(android.app.Activity activity) {
        super(activity, com.google.android.gms.auth.account.WorkAccount.API, com.google.android.gms.common.api.Api.ApiOptions.NoOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zza = new com.google.android.gms.internal.auth.zzal();
    }

    public com.google.android.gms.tasks.Task<android.accounts.Account> addWorkAccount(java.lang.String str) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zza.addWorkAccount(asGoogleApiClient(), str), new com.google.android.gms.auth.account.zzg(this));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeWorkAccount(android.accounts.Account account) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(this.zza.removeWorkAccount(asGoogleApiClient(), account));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> setWorkAuthenticatorEnabled(boolean z) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(this.zza.setWorkAuthenticatorEnabledWithResult(asGoogleApiClient(), z));
    }

    WorkAccountClient(android.content.Context context) {
        super(context, com.google.android.gms.auth.account.WorkAccount.API, com.google.android.gms.common.api.Api.ApiOptions.NoOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zza = new com.google.android.gms.internal.auth.zzal();
    }
}
