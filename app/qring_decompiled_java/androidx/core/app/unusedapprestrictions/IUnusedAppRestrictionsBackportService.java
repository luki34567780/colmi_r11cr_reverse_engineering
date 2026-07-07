package androidx.core.app.unusedapprestrictions;

/* loaded from: classes.dex */
public interface IUnusedAppRestrictionsBackportService extends android.os.IInterface {

    public static class Default implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        public void isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws android.os.RemoteException {
        }
    }

    void isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService {
        private static final java.lang.String DESCRIPTOR = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";
        static final int TRANSACTION_isPermissionRevocationEnabledForApp = 1;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService)) {
                return (androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService) queryLocalInterface;
            }
            return new androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        private static class Proxy implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService {
            public static androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService sDefaultImpl;
            private android.os.IBinder mRemote;

            public java.lang.String getInterfaceDescriptor() {
                return androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.DESCRIPTOR;
            }

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
            public void isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iUnusedAppRestrictionsBackportCallback != null ? iUnusedAppRestrictionsBackportCallback.asBinder() : null);
                    if (this.mRemote.transact(1, obtain, null, 1) || androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.getDefaultImpl().isPermissionRevocationEnabledForApp(iUnusedAppRestrictionsBackportCallback);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService iUnusedAppRestrictionsBackportService) {
            if (androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (iUnusedAppRestrictionsBackportService == null) {
                return false;
            }
            androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.Proxy.sDefaultImpl = iUnusedAppRestrictionsBackportService;
            return true;
        }

        public static androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService getDefaultImpl() {
            return androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.Proxy.sDefaultImpl;
        }
    }
}
