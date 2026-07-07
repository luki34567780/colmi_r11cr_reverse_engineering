package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzd extends com.google.android.gms.auth.api.accounttransfer.zzj<byte[]> {
    final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zze zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzd(com.google.android.gms.auth.api.accounttransfer.zze zzeVar, com.google.android.gms.auth.api.accounttransfer.zzk zzkVar) {
        super(zzkVar);
        this.zza = zzeVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzb(byte[] bArr) {
        this.zza.zzb.setResult(bArr);
    }
}
