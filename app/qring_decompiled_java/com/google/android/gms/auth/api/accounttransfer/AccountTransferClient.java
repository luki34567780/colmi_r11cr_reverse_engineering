package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public class AccountTransferClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.auth.api.accounttransfer.zzq> {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzap> zzb;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzap, com.google.android.gms.auth.api.accounttransfer.zzq> zzc;
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.accounttransfer.zzq> zzd;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzap> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zzb = clientKey;
        com.google.android.gms.auth.api.accounttransfer.zzb zzbVar = new com.google.android.gms.auth.api.accounttransfer.zzb();
        zzc = zzbVar;
        zzd = new com.google.android.gms.common.api.Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", zzbVar, clientKey);
    }

    AccountTransferClient(android.app.Activity activity, com.google.android.gms.auth.api.accounttransfer.zzq zzqVar) {
        super(activity, zzd, com.google.android.gms.auth.api.accounttransfer.zzq.zza, new com.google.android.gms.common.api.GoogleApi.Settings.Builder().setMapper(new com.google.android.gms.common.api.internal.ApiExceptionMapper()).build());
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.accounttransfer.DeviceMetaData> getDeviceMetaData(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        return doRead(new com.google.android.gms.auth.api.accounttransfer.zzg(this, 1608, new com.google.android.gms.internal.auth.zzaq(str)));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> notifyCompletion(java.lang.String str, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        return doWrite(new com.google.android.gms.auth.api.accounttransfer.zzi(this, 1610, new com.google.android.gms.internal.auth.zzav(str, i)));
    }

    public com.google.android.gms.tasks.Task<byte[]> retrieveData(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        return doRead(new com.google.android.gms.auth.api.accounttransfer.zze(this, 1607, new com.google.android.gms.internal.auth.zzax(str)));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> sendData(java.lang.String str, byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        return doWrite(new com.google.android.gms.auth.api.accounttransfer.zzc(this, 1606, new com.google.android.gms.internal.auth.zzaz(str, bArr)));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> showUserChallenge(java.lang.String str, android.app.PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        return doWrite(new com.google.android.gms.auth.api.accounttransfer.zzh(this, 1609, new com.google.android.gms.internal.auth.zzbb(str, pendingIntent)));
    }

    AccountTransferClient(android.content.Context context, com.google.android.gms.auth.api.accounttransfer.zzq zzqVar) {
        super(context, zzd, com.google.android.gms.auth.api.accounttransfer.zzq.zza, new com.google.android.gms.common.api.GoogleApi.Settings.Builder().setMapper(new com.google.android.gms.common.api.internal.ApiExceptionMapper()).build());
    }
}
