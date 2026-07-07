package com.google.android.gms.auth.account;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzg implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter<com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult, android.accounts.Account> {
    zzg(com.google.android.gms.auth.account.WorkAccountClient workAccountClient) {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* bridge */ /* synthetic */ android.accounts.Account convert(com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult addAccountResult) {
        return addAccountResult.getAccount();
    }
}
