package com.google.android.gms.internal.p001authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes2.dex */
public abstract class zbac extends com.google.android.gms.internal.p001authapi.zbb implements com.google.android.gms.internal.p001authapi.zbad {
    public zbac() {
        super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
    }

    @Override // com.google.android.gms.internal.p001authapi.zbb
    protected final boolean zba(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, com.google.android.gms.common.api.Status.CREATOR);
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, android.app.PendingIntent.CREATOR);
        com.google.android.gms.internal.p001authapi.zbc.zbb(parcel);
        zbb(status, pendingIntent);
        return true;
    }
}
