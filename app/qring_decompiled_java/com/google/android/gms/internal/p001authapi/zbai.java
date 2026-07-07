package com.google.android.gms.internal.p001authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes2.dex */
public final class zbai extends com.google.android.gms.internal.p001authapi.zba implements android.os.IInterface {
    zbai(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(com.google.android.gms.internal.p001authapi.zby zbyVar, com.google.android.gms.auth.api.identity.BeginSignInRequest beginSignInRequest) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p001authapi.zbc.zbd(zba, zbyVar);
        com.google.android.gms.internal.p001authapi.zbc.zbc(zba, beginSignInRequest);
        zbb(1, zba);
    }

    public final void zbd(com.google.android.gms.internal.p001authapi.zbab zbabVar, com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p001authapi.zbc.zbd(zba, zbabVar);
        com.google.android.gms.internal.p001authapi.zbc.zbc(zba, getPhoneNumberHintIntentRequest);
        zba.writeString(str);
        zbb(4, zba);
    }

    public final void zbe(com.google.android.gms.internal.p001authapi.zbad zbadVar, com.google.android.gms.auth.api.identity.GetSignInIntentRequest getSignInIntentRequest) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p001authapi.zbc.zbd(zba, zbadVar);
        com.google.android.gms.internal.p001authapi.zbc.zbc(zba, getSignInIntentRequest);
        zbb(3, zba);
    }

    public final void zbf(com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p001authapi.zbc.zbd(zba, iStatusCallback);
        zba.writeString(str);
        zbb(2, zba);
    }
}
