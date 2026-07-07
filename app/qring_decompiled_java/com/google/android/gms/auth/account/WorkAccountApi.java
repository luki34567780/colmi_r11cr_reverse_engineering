package com.google.android.gms.auth.account;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public interface WorkAccountApi {

    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
    @java.lang.Deprecated
    public interface AddAccountResult extends com.google.android.gms.common.api.Result {
        android.accounts.Account getAccount();
    }

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult> addWorkAccount(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Result> removeWorkAccount(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.accounts.Account account);

    @java.lang.Deprecated
    void setWorkAuthenticatorEnabled(com.google.android.gms.common.api.GoogleApiClient googleApiClient, boolean z);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Result> setWorkAuthenticatorEnabledWithResult(com.google.android.gms.common.api.GoogleApiClient googleApiClient, boolean z);
}
