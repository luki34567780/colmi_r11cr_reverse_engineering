package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzf extends com.google.android.gms.auth.api.accounttransfer.zzj<com.google.android.gms.auth.api.accounttransfer.DeviceMetaData> {
    final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzf(com.google.android.gms.auth.api.accounttransfer.zzg zzgVar, com.google.android.gms.auth.api.accounttransfer.zzk zzkVar) {
        super(zzkVar);
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzc(com.google.android.gms.auth.api.accounttransfer.DeviceMetaData deviceMetaData) {
        this.zza.zzb.setResult(deviceMetaData);
    }
}
