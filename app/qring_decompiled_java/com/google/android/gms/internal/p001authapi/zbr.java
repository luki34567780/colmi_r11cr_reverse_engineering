package com.google.android.gms.internal.p001authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes2.dex */
public abstract class zbr extends com.google.android.gms.internal.p001authapi.zbb implements com.google.android.gms.internal.p001authapi.zbs {
    public zbr() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // com.google.android.gms.internal.p001authapi.zbb
    protected final boolean zba(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, com.google.android.gms.common.api.Status.CREATOR);
            com.google.android.gms.auth.api.credentials.Credential credential = (com.google.android.gms.auth.api.credentials.Credential) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, com.google.android.gms.auth.api.credentials.Credential.CREATOR);
            com.google.android.gms.internal.p001authapi.zbc.zbb(parcel);
            zbb(status, credential);
        } else if (i == 2) {
            com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, com.google.android.gms.common.api.Status.CREATOR);
            com.google.android.gms.internal.p001authapi.zbc.zbb(parcel);
            zbc(status2);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, com.google.android.gms.common.api.Status.CREATOR);
            java.lang.String readString = parcel.readString();
            com.google.android.gms.internal.p001authapi.zbc.zbb(parcel);
            zbd(status3, readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
