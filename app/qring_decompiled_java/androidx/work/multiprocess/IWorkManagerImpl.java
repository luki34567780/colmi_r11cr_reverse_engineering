package androidx.work.multiprocess;

/* loaded from: classes.dex */
public interface IWorkManagerImpl extends android.os.IInterface {

    public static class Default implements androidx.work.multiprocess.IWorkManagerImpl {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelAllWork(androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelAllWorkByTag(java.lang.String tag, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelUniqueWork(java.lang.String name, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelWorkById(java.lang.String id, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void enqueueContinuation(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void enqueueWorkRequests(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void queryWorkInfo(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void setProgress(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }
    }

    void cancelAllWork(androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    void cancelAllWorkByTag(java.lang.String tag, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    void cancelUniqueWork(java.lang.String name, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    void cancelWorkById(java.lang.String id, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    void enqueueContinuation(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    void enqueueWorkRequests(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    void queryWorkInfo(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    void setProgress(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.work.multiprocess.IWorkManagerImpl {
        private static final java.lang.String DESCRIPTOR = "androidx.work.multiprocess.IWorkManagerImpl";
        static final int TRANSACTION_cancelAllWork = 6;
        static final int TRANSACTION_cancelAllWorkByTag = 4;
        static final int TRANSACTION_cancelUniqueWork = 5;
        static final int TRANSACTION_cancelWorkById = 3;
        static final int TRANSACTION_enqueueContinuation = 2;
        static final int TRANSACTION_enqueueWorkRequests = 1;
        static final int TRANSACTION_queryWorkInfo = 7;
        static final int TRANSACTION_setProgress = 8;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static androidx.work.multiprocess.IWorkManagerImpl asInterface(android.os.IBinder obj) {
            if (obj == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = obj.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof androidx.work.multiprocess.IWorkManagerImpl)) {
                return (androidx.work.multiprocess.IWorkManagerImpl) queryLocalInterface;
            }
            return new androidx.work.multiprocess.IWorkManagerImpl.Stub.Proxy(obj);
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            if (code == 1598968902) {
                reply.writeString(DESCRIPTOR);
                return true;
            }
            switch (code) {
                case 1:
                    data.enforceInterface(DESCRIPTOR);
                    enqueueWorkRequests(data.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                case 2:
                    data.enforceInterface(DESCRIPTOR);
                    enqueueContinuation(data.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                case 3:
                    data.enforceInterface(DESCRIPTOR);
                    cancelWorkById(data.readString(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                case 4:
                    data.enforceInterface(DESCRIPTOR);
                    cancelAllWorkByTag(data.readString(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                case 5:
                    data.enforceInterface(DESCRIPTOR);
                    cancelUniqueWork(data.readString(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                case 6:
                    data.enforceInterface(DESCRIPTOR);
                    cancelAllWork(androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                case 7:
                    data.enforceInterface(DESCRIPTOR);
                    queryWorkInfo(data.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                case 8:
                    data.enforceInterface(DESCRIPTOR);
                    setProgress(data.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }

        private static class Proxy implements androidx.work.multiprocess.IWorkManagerImpl {
            public static androidx.work.multiprocess.IWorkManagerImpl sDefaultImpl;
            private android.os.IBinder mRemote;

            public java.lang.String getInterfaceDescriptor() {
                return androidx.work.multiprocess.IWorkManagerImpl.Stub.DESCRIPTOR;
            }

            Proxy(android.os.IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void enqueueWorkRequests(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.Stub.DESCRIPTOR);
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.mRemote.transact(1, obtain, null, 1) || androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl().enqueueWorkRequests(request, callback);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void enqueueContinuation(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.Stub.DESCRIPTOR);
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.mRemote.transact(2, obtain, null, 1) || androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl().enqueueContinuation(request, callback);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void cancelWorkById(java.lang.String id, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.Stub.DESCRIPTOR);
                    obtain.writeString(id);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.mRemote.transact(3, obtain, null, 1) || androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl().cancelWorkById(id, callback);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void cancelAllWorkByTag(java.lang.String tag, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.Stub.DESCRIPTOR);
                    obtain.writeString(tag);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.mRemote.transact(4, obtain, null, 1) || androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl().cancelAllWorkByTag(tag, callback);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void cancelUniqueWork(java.lang.String name, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.Stub.DESCRIPTOR);
                    obtain.writeString(name);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.mRemote.transact(5, obtain, null, 1) || androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl().cancelUniqueWork(name, callback);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void cancelAllWork(androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.mRemote.transact(6, obtain, null, 1) || androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl().cancelAllWork(callback);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void queryWorkInfo(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.Stub.DESCRIPTOR);
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.mRemote.transact(7, obtain, null, 1) || androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl().queryWorkInfo(request, callback);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void setProgress(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.Stub.DESCRIPTOR);
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.mRemote.transact(8, obtain, null, 1) || androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl().setProgress(request, callback);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(androidx.work.multiprocess.IWorkManagerImpl impl) {
            if (androidx.work.multiprocess.IWorkManagerImpl.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            androidx.work.multiprocess.IWorkManagerImpl.Stub.Proxy.sDefaultImpl = impl;
            return true;
        }

        public static androidx.work.multiprocess.IWorkManagerImpl getDefaultImpl() {
            return androidx.work.multiprocess.IWorkManagerImpl.Stub.Proxy.sDefaultImpl;
        }
    }
}
