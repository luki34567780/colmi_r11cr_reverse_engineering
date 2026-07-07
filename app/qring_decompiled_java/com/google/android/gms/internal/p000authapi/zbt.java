package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zbt extends com.google.android.gms.internal.p000authapi.zba implements android.os.IInterface {
    zbt(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    public final void zbc(com.google.android.gms.internal.p000authapi.zbs zbsVar, com.google.android.gms.internal.p000authapi.zbp zbpVar) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbsVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, zbpVar);
        zbb(3, zba);
    }

    public final void zbd(com.google.android.gms.internal.p000authapi.zbs zbsVar, com.google.android.gms.auth.api.credentials.CredentialRequest credentialRequest) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbsVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, credentialRequest);
        zbb(1, zba);
    }

    public final void zbe(com.google.android.gms.internal.p000authapi.zbs zbsVar, com.google.android.gms.internal.p000authapi.zbu zbuVar) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbsVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, zbuVar);
        zbb(2, zba);
    }

    public final void zbf(com.google.android.gms.internal.p000authapi.zbs zbsVar) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbsVar);
        zbb(4, zba);
    }
}
