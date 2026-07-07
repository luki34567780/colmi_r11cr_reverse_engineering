package androidx.work.multiprocess;

/* loaded from: classes.dex */
public interface IWorkManagerImplCallback extends android.os.IInterface {

    public static class Default implements androidx.work.multiprocess.IWorkManagerImplCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.IWorkManagerImplCallback
        public void onFailure(java.lang.String error) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImplCallback
        public void onSuccess(byte[] response) throws android.os.RemoteException {
        }
    }

    void onFailure(java.lang.String error) throws android.os.RemoteException;

    void onSuccess(byte[] response) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.work.multiprocess.IWorkManagerImplCallback {
        private static final java.lang.String DESCRIPTOR = "androidx.work.multiprocess.IWorkManagerImplCallback";
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 1;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static androidx.work.multiprocess.IWorkManagerImplCallback asInterface(android.os.IBinder obj) {
            if (obj == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = obj.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof androidx.work.multiprocess.IWorkManagerImplCallback)) {
                return (androidx.work.multiprocess.IWorkManagerImplCallback) queryLocalInterface;
            }
            return new androidx.work.multiprocess.IWorkManagerImplCallback.Stub.Proxy(obj);
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            if (code == 1) {
                data.enforceInterface(DESCRIPTOR);
                onSuccess(data.createByteArray());
                return true;
            }
            if (code == 2) {
                data.enforceInterface(DESCRIPTOR);
                onFailure(data.readString());
                return true;
            }
            if (code == 1598968902) {
                reply.writeString(DESCRIPTOR);
                return true;
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements androidx.work.multiprocess.IWorkManagerImplCallback {
            public static androidx.work.multiprocess.IWorkManagerImplCallback sDefaultImpl;
            private android.os.IBinder mRemote;

            public java.lang.String getInterfaceDescriptor() {
                return androidx.work.multiprocess.IWorkManagerImplCallback.Stub.DESCRIPTOR;
            }

            Proxy(android.os.IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.work.multiprocess.IWorkManagerImplCallback
            public void onSuccess(byte[] response) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImplCallback.Stub.DESCRIPTOR);
                    obtain.writeByteArray(response);
                    if (this.mRemote.transact(1, obtain, null, 1) || androidx.work.multiprocess.IWorkManagerImplCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.work.multiprocess.IWorkManagerImplCallback.Stub.getDefaultImpl().onSuccess(response);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImplCallback
            public void onFailure(java.lang.String error) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImplCallback.Stub.DESCRIPTOR);
                    obtain.writeString(error);
                    if (this.mRemote.transact(2, obtain, null, 1) || androidx.work.multiprocess.IWorkManagerImplCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.work.multiprocess.IWorkManagerImplCallback.Stub.getDefaultImpl().onFailure(error);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(androidx.work.multiprocess.IWorkManagerImplCallback impl) {
            if (androidx.work.multiprocess.IWorkManagerImplCallback.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            androidx.work.multiprocess.IWorkManagerImplCallback.Stub.Proxy.sDefaultImpl = impl;
            return true;
        }

        public static androidx.work.multiprocess.IWorkManagerImplCallback getDefaultImpl() {
            return androidx.work.multiprocess.IWorkManagerImplCallback.Stub.Proxy.sDefaultImpl;
        }
    }
}
