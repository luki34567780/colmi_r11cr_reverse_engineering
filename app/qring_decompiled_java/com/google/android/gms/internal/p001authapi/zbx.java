package com.google.android.gms.internal.p001authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes2.dex */
public abstract class zbx extends com.google.android.gms.internal.p001authapi.zbb implements com.google.android.gms.internal.p001authapi.zby {
    public zbx() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // com.google.android.gms.internal.p001authapi.zbb
    protected final boolean zba(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, com.google.android.gms.common.api.Status.CREATOR);
        com.google.android.gms.auth.api.identity.BeginSignInResult beginSignInResult = (com.google.android.gms.auth.api.identity.BeginSignInResult) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, com.google.android.gms.auth.api.identity.BeginSignInResult.CREATOR);
        com.google.android.gms.internal.p001authapi.zbc.zbb(parcel);
        zbb(status, beginSignInResult);
        return true;
    }
}
