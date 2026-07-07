package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public interface IStatusCallback extends android.os.IInterface {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static abstract class Stub extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.api.internal.IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        public static com.google.android.gms.common.api.internal.IStatusCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return queryLocalInterface instanceof com.google.android.gms.common.api.internal.IStatusCallback ? (com.google.android.gms.common.api.internal.IStatusCallback) queryLocalInterface : new com.google.android.gms.common.api.internal.zaby(iBinder);
        }

        @Override // com.google.android.gms.internal.base.zab
        protected final boolean zaa(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i != 1) {
                return false;
            }
            onResult((com.google.android.gms.common.api.Status) com.google.android.gms.internal.base.zac.zaa(parcel, com.google.android.gms.common.api.Status.CREATOR));
            return true;
        }
    }

    void onResult(com.google.android.gms.common.api.Status status) throws android.os.RemoteException;
}
