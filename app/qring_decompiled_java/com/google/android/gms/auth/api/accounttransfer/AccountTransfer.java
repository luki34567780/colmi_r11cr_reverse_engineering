package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class AccountTransfer {
    public static final java.lang.String ACTION_ACCOUNT_EXPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";
    public static final java.lang.String ACTION_ACCOUNT_IMPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";
    public static final java.lang.String ACTION_START_ACCOUNT_EXPORT = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";
    public static final java.lang.String KEY_EXTRA_ACCOUNT_TYPE = "key_extra_account_type";
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.accounttransfer.zzq> zza;

    @java.lang.Deprecated
    public static final com.google.android.gms.internal.auth.zzao zzb;

    @java.lang.Deprecated
    public static final com.google.android.gms.internal.auth.zzao zzc;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzap> zzd;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzap, com.google.android.gms.auth.api.accounttransfer.zzq> zze;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzap> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zzd = clientKey;
        com.google.android.gms.auth.api.accounttransfer.zza zzaVar = new com.google.android.gms.auth.api.accounttransfer.zza();
        zze = zzaVar;
        zza = new com.google.android.gms.common.api.Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", zzaVar, clientKey);
        zzb = new com.google.android.gms.internal.auth.zzao();
        zzc = new com.google.android.gms.internal.auth.zzao();
    }

    private AccountTransfer() {
    }

    public static com.google.android.gms.auth.api.accounttransfer.AccountTransferClient getAccountTransferClient(android.app.Activity activity) {
        return new com.google.android.gms.auth.api.accounttransfer.AccountTransferClient(activity, (com.google.android.gms.auth.api.accounttransfer.zzq) null);
    }

    public static com.google.android.gms.auth.api.accounttransfer.AccountTransferClient getAccountTransferClient(android.content.Context context) {
        return new com.google.android.gms.auth.api.accounttransfer.AccountTransferClient(context, (com.google.android.gms.auth.api.accounttransfer.zzq) null);
    }
}
