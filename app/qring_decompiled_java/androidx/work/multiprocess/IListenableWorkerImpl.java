package androidx.work.multiprocess;

/* loaded from: classes.dex */
public interface IListenableWorkerImpl extends android.os.IInterface {

    public static class Default implements androidx.work.multiprocess.IListenableWorkerImpl {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.IListenableWorkerImpl
        public void interrupt(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IListenableWorkerImpl
        public void startWork(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }
    }

    void interrupt(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    void startWork(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.work.multiprocess.IListenableWorkerImpl {
        private static final java.lang.String DESCRIPTOR = "androidx.work.multiprocess.IListenableWorkerImpl";
        static final int TRANSACTION_interrupt = 2;
        static final int TRANSACTION_startWork = 1;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static androidx.work.multiprocess.IListenableWorkerImpl asInterface(android.os.IBinder obj) {
            if (obj == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = obj.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof androidx.work.multiprocess.IListenableWorkerImpl)) {
                return (androidx.work.multiprocess.IListenableWorkerImpl) queryLocalInterface;
            }
            return new androidx.work.multiprocess.IListenableWorkerImpl.Stub.Proxy(obj);
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            if (code == 1) {
                data.enforceInterface(DESCRIPTOR);
                startWork(data.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                return true;
            }
            if (code == 2) {
                data.enforceInterface(DESCRIPTOR);
                interrupt(data.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                return true;
            }
            if (code == 1598968902) {
                reply.writeString(DESCRIPTOR);
                return true;
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements androidx.work.multiprocess.IListenableWorkerImpl {
            public static androidx.work.multiprocess.IListenableWorkerImpl sDefaultImpl;
            private android.os.IBinder mRemote;

            public java.lang.String getInterfaceDescriptor() {
                return androidx.work.multiprocess.IListenableWorkerImpl.Stub.DESCRIPTOR;
            }

            Proxy(android.os.IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.work.multiprocess.IListenableWorkerImpl
            public void startWork(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IListenableWorkerImpl.Stub.DESCRIPTOR);
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.mRemote.transact(1, obtain, null, 1) || androidx.work.multiprocess.IListenableWorkerImpl.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.work.multiprocess.IListenableWorkerImpl.Stub.getDefaultImpl().startWork(request, callback);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IListenableWorkerImpl
            public void interrupt(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IListenableWorkerImpl.Stub.DESCRIPTOR);
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.mRemote.transact(2, obtain, null, 1) || androidx.work.multiprocess.IListenableWorkerImpl.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.work.multiprocess.IListenableWorkerImpl.Stub.getDefaultImpl().interrupt(request, callback);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(androidx.work.multiprocess.IListenableWorkerImpl impl) {
            if (androidx.work.multiprocess.IListenableWorkerImpl.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            androidx.work.multiprocess.IListenableWorkerImpl.Stub.Proxy.sDefaultImpl = impl;
            return true;
        }

        public static androidx.work.multiprocess.IListenableWorkerImpl getDefaultImpl() {
            return androidx.work.multiprocess.IListenableWorkerImpl.Stub.Proxy.sDefaultImpl;
        }
    }
}
