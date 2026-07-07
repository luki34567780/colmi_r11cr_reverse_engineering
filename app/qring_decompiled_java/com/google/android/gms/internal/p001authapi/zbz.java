package com.google.android.gms.internal.p001authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes2.dex */
public final class zbz extends com.google.android.gms.internal.p001authapi.zba implements android.os.IInterface {
    zbz(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(com.google.android.gms.internal.p001authapi.zbaf zbafVar, com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p001authapi.zbc.zbd(zba, zbafVar);
        com.google.android.gms.internal.p001authapi.zbc.zbc(zba, saveAccountLinkingTokenRequest);
        zbb(1, zba);
    }

    public final void zbd(com.google.android.gms.internal.p001authapi.zbah zbahVar, com.google.android.gms.auth.api.identity.SavePasswordRequest savePasswordRequest) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p001authapi.zbc.zbd(zba, zbahVar);
        com.google.android.gms.internal.p001authapi.zbc.zbc(zba, savePasswordRequest);
        zbb(2, zba);
    }
}
