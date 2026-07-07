package com.app.watch.keeping.entity;

/* loaded from: classes.dex */
public interface ICactusInterface extends android.os.IInterface {

    public static class Default implements com.app.watch.keeping.entity.ICactusInterface {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.app.watch.keeping.entity.ICactusInterface
        public void connectionTimes(int i) throws android.os.RemoteException {
        }

        @Override // com.app.watch.keeping.entity.ICactusInterface
        public void wakeup(com.app.watch.keeping.entity.CactusConfig cactusConfig) throws android.os.RemoteException {
        }
    }

    void connectionTimes(int i) throws android.os.RemoteException;

    void wakeup(com.app.watch.keeping.entity.CactusConfig cactusConfig) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.app.watch.keeping.entity.ICactusInterface {
        private static final java.lang.String DESCRIPTOR = "com.app.watch.keeping.entity.ICactusInterface";
        static final int TRANSACTION_connectionTimes = 2;
        static final int TRANSACTION_wakeup = 1;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static com.app.watch.keeping.entity.ICactusInterface asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof com.app.watch.keeping.entity.ICactusInterface)) {
                return (com.app.watch.keeping.entity.ICactusInterface) queryLocalInterface;
            }
            return new com.app.watch.keeping.entity.ICactusInterface.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                wakeup(parcel.readInt() != 0 ? com.app.watch.keeping.entity.CactusConfig.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
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
            connectionTimes(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        private static class Proxy implements com.app.watch.keeping.entity.ICactusInterface {
            public static com.app.watch.keeping.entity.ICactusInterface sDefaultImpl;
            private android.os.IBinder mRemote;

            public java.lang.String getInterfaceDescriptor() {
                return com.app.watch.keeping.entity.ICactusInterface.Stub.DESCRIPTOR;
            }

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.app.watch.keeping.entity.ICactusInterface
            public void wakeup(com.app.watch.keeping.entity.CactusConfig cactusConfig) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.app.watch.keeping.entity.ICactusInterface.Stub.DESCRIPTOR);
                    if (cactusConfig != null) {
                        obtain.writeInt(1);
                        cactusConfig.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && com.app.watch.keeping.entity.ICactusInterface.Stub.getDefaultImpl() != null) {
                        com.app.watch.keeping.entity.ICactusInterface.Stub.getDefaultImpl().wakeup(cactusConfig);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.watch.keeping.entity.ICactusInterface
            public void connectionTimes(int i) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.app.watch.keeping.entity.ICactusInterface.Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && com.app.watch.keeping.entity.ICactusInterface.Stub.getDefaultImpl() != null) {
                        com.app.watch.keeping.entity.ICactusInterface.Stub.getDefaultImpl().connectionTimes(i);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(com.app.watch.keeping.entity.ICactusInterface iCactusInterface) {
            if (com.app.watch.keeping.entity.ICactusInterface.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (iCactusInterface == null) {
                return false;
            }
            com.app.watch.keeping.entity.ICactusInterface.Stub.Proxy.sDefaultImpl = iCactusInterface;
            return true;
        }

        public static com.app.watch.keeping.entity.ICactusInterface getDefaultImpl() {
            return com.app.watch.keeping.entity.ICactusInterface.Stub.Proxy.sDefaultImpl;
        }
    }
}
