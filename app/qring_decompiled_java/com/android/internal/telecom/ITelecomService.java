package com.android.internal.telecom;

/* loaded from: classes.dex */
public interface ITelecomService extends android.os.IInterface {

    public static class Default implements com.android.internal.telecom.ITelecomService {
        @Override // com.android.internal.telecom.ITelecomService
        public void acceptRingingCall(java.lang.String callingPackage) throws android.os.RemoteException {
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.android.internal.telecom.ITelecomService
        public boolean endCall(java.lang.String callingPackage) throws android.os.RemoteException {
            return false;
        }
    }

    void acceptRingingCall(java.lang.String callingPackage) throws android.os.RemoteException;

    boolean endCall(java.lang.String callingPackage) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.ITelecomService {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.ITelecomService";
        static final int TRANSACTION_acceptRingingCall = 2;
        static final int TRANSACTION_endCall = 1;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static com.android.internal.telecom.ITelecomService asInterface(android.os.IBinder obj) {
            if (obj == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = obj.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof com.android.internal.telecom.ITelecomService)) {
                return (com.android.internal.telecom.ITelecomService) queryLocalInterface;
            }
            return new com.android.internal.telecom.ITelecomService.Stub.Proxy(obj);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean endCall = endCall(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(endCall ? 1 : 0);
                return true;
            }
            if (i != 2) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DESCRIPTOR);
            acceptRingingCall(parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        private static class Proxy implements com.android.internal.telecom.ITelecomService {
            public static com.android.internal.telecom.ITelecomService sDefaultImpl;
            private android.os.IBinder mRemote;

            public java.lang.String getInterfaceDescriptor() {
                return com.android.internal.telecom.ITelecomService.Stub.DESCRIPTOR;
            }

            Proxy(android.os.IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.android.internal.telecom.ITelecomService
            public boolean endCall(java.lang.String callingPackage) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.android.internal.telecom.ITelecomService.Stub.DESCRIPTOR);
                    obtain.writeString(callingPackage);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && com.android.internal.telecom.ITelecomService.Stub.getDefaultImpl() != null) {
                        return com.android.internal.telecom.ITelecomService.Stub.getDefaultImpl().endCall(callingPackage);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.internal.telecom.ITelecomService
            public void acceptRingingCall(java.lang.String callingPackage) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.android.internal.telecom.ITelecomService.Stub.DESCRIPTOR);
                    obtain.writeString(callingPackage);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && com.android.internal.telecom.ITelecomService.Stub.getDefaultImpl() != null) {
                        com.android.internal.telecom.ITelecomService.Stub.getDefaultImpl().acceptRingingCall(callingPackage);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(com.android.internal.telecom.ITelecomService impl) {
            if (com.android.internal.telecom.ITelecomService.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            com.android.internal.telecom.ITelecomService.Stub.Proxy.sDefaultImpl = impl;
            return true;
        }

        public static com.android.internal.telecom.ITelecomService getDefaultImpl() {
            return com.android.internal.telecom.ITelecomService.Stub.Proxy.sDefaultImpl;
        }
    }
}
