package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzai implements com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult {
    private static final android.accounts.Account zza = new android.accounts.Account("DUMMY_NAME", "com.google");
    private final com.google.android.gms.common.api.Status zzb;
    private final android.accounts.Account zzc;

    public zzai(com.google.android.gms.common.api.Status status, android.accounts.Account account) {
        this.zzb = status;
        this.zzc = account == null ? zza : account;
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult
    public final android.accounts.Account getAccount() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzb;
    }
}
