package com.android.internal.telephony;

/* loaded from: classes.dex */
public interface ITelephony extends android.os.IInterface {

    public static class Default implements com.android.internal.telephony.ITelephony {
        @Override // com.android.internal.telephony.ITelephony
        public void answerRingingCall() throws android.os.RemoteException {
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.android.internal.telephony.ITelephony
        public boolean disableDataConnectivity() throws android.os.RemoteException {
            return false;
        }

        @Override // com.android.internal.telephony.ITelephony
        public boolean enableDataConnectivity() throws android.os.RemoteException {
            return false;
        }

        @Override // com.android.internal.telephony.ITelephony
        public boolean endCall() throws android.os.RemoteException {
            return false;
        }

        @Override // com.android.internal.telephony.ITelephony
        public boolean isDataConnectivityPossible() throws android.os.RemoteException {
            return false;
        }
    }

    void answerRingingCall() throws android.os.RemoteException;

    boolean disableDataConnectivity() throws android.os.RemoteException;

    boolean enableDataConnectivity() throws android.os.RemoteException;

    boolean endCall() throws android.os.RemoteException;

    boolean isDataConnectivityPossible() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ITelephony {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ITelephony";
        static final int TRANSACTION_answerRingingCall = 2;
        static final int TRANSACTION_disableDataConnectivity = 4;
        static final int TRANSACTION_enableDataConnectivity = 3;
        static final int TRANSACTION_endCall = 1;
        static final int TRANSACTION_isDataConnectivityPossible = 5;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static com.android.internal.telephony.ITelephony asInterface(android.os.IBinder obj) {
            if (obj == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = obj.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof com.android.internal.telephony.ITelephony)) {
                return (com.android.internal.telephony.ITelephony) queryLocalInterface;
            }
            return new com.android.internal.telephony.ITelephony.Stub.Proxy(obj);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean endCall = endCall();
                parcel2.writeNoException();
                parcel2.writeInt(endCall ? 1 : 0);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                answerRingingCall();
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean enableDataConnectivity = enableDataConnectivity();
                parcel2.writeNoException();
                parcel2.writeInt(enableDataConnectivity ? 1 : 0);
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean disableDataConnectivity = disableDataConnectivity();
                parcel2.writeNoException();
                parcel2.writeInt(disableDataConnectivity ? 1 : 0);
                return true;
            }
            if (i != 5) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DESCRIPTOR);
            boolean isDataConnectivityPossible = isDataConnectivityPossible();
            parcel2.writeNoException();
            parcel2.writeInt(isDataConnectivityPossible ? 1 : 0);
            return true;
        }

        private static class Proxy implements com.android.internal.telephony.ITelephony {
            public static com.android.internal.telephony.ITelephony sDefaultImpl;
            private android.os.IBinder mRemote;

            public java.lang.String getInterfaceDescriptor() {
                return com.android.internal.telephony.ITelephony.Stub.DESCRIPTOR;
            }

            Proxy(android.os.IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.android.internal.telephony.ITelephony
            public boolean endCall() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.android.internal.telephony.ITelephony.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && com.android.internal.telephony.ITelephony.Stub.getDefaultImpl() != null) {
                        return com.android.internal.telephony.ITelephony.Stub.getDefaultImpl().endCall();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.internal.telephony.ITelephony
            public void answerRingingCall() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.android.internal.telephony.ITelephony.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && com.android.internal.telephony.ITelephony.Stub.getDefaultImpl() != null) {
                        com.android.internal.telephony.ITelephony.Stub.getDefaultImpl().answerRingingCall();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.internal.telephony.ITelephony
            public boolean enableDataConnectivity() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.android.internal.telephony.ITelephony.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && com.android.internal.telephony.ITelephony.Stub.getDefaultImpl() != null) {
                        return com.android.internal.telephony.ITelephony.Stub.getDefaultImpl().enableDataConnectivity();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.internal.telephony.ITelephony
            public boolean disableDataConnectivity() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.android.internal.telephony.ITelephony.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && com.android.internal.telephony.ITelephony.Stub.getDefaultImpl() != null) {
                        return com.android.internal.telephony.ITelephony.Stub.getDefaultImpl().disableDataConnectivity();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.internal.telephony.ITelephony
            public boolean isDataConnectivityPossible() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.android.internal.telephony.ITelephony.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && com.android.internal.telephony.ITelephony.Stub.getDefaultImpl() != null) {
                        return com.android.internal.telephony.ITelephony.Stub.getDefaultImpl().isDataConnectivityPossible();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(com.android.internal.telephony.ITelephony impl) {
            if (com.android.internal.telephony.ITelephony.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            com.android.internal.telephony.ITelephony.Stub.Proxy.sDefaultImpl = impl;
            return true;
        }

        public static com.android.internal.telephony.ITelephony getDefaultImpl() {
            return com.android.internal.telephony.ITelephony.Stub.Proxy.sDefaultImpl;
        }
    }
}
