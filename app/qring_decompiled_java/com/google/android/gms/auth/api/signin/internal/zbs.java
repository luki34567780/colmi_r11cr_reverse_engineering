package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zbs extends com.google.android.gms.internal.p000authapi.zba implements android.os.IInterface {
    zbs(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void zbc(com.google.android.gms.auth.api.signin.internal.zbr zbrVar, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbrVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, googleSignInOptions);
        zbb(103, zba);
    }

    public final void zbd(com.google.android.gms.auth.api.signin.internal.zbr zbrVar, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbrVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, googleSignInOptions);
        zbb(102, zba);
    }

    public final void zbe(com.google.android.gms.auth.api.signin.internal.zbr zbrVar, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbrVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, googleSignInOptions);
        zbb(101, zba);
    }
}
