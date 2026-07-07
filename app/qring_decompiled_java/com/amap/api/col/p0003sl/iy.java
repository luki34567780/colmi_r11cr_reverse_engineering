package com.amap.api.col.p0003sl;

/* compiled from: AdvertisingId.java */
/* loaded from: classes.dex */
public final class iy {

    /* compiled from: AdvertisingId.java */
    private static final class a {
        private final java.lang.String a;
        private final boolean b;

        a(java.lang.String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }
    }

    public static java.lang.String a(android.content.Context context) {
        try {
            com.amap.api.col.3sl.iy.a b2 = b(context);
            if (b2 != null && !b2.a()) {
                return b2.a;
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    private static com.amap.api.col.3sl.iy.a b(android.content.Context context) throws java.lang.Exception {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            return null;
        }
        try {
            byte b2 = 0;
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            com.amap.api.col.3sl.iy.b bVar = new com.amap.api.col.3sl.iy.b(b2);
            android.content.Intent intent = new android.content.Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (context.bindService(intent, bVar, 1)) {
                try {
                    try {
                        com.amap.api.col.3sl.iy.c cVar = new com.amap.api.col.3sl.iy.c(bVar.a());
                        boolean b3 = cVar.b();
                        return new com.amap.api.col.3sl.iy.a(b3 ? "" : cVar.a(), b3);
                    } catch (java.lang.Exception e) {
                        throw e;
                    }
                } finally {
                    context.unbindService(bVar);
                }
            }
            throw new java.io.IOException("Google Play connection failed");
        } catch (java.lang.Exception e2) {
            throw e2;
        }
    }

    /* compiled from: AdvertisingId.java */
    private static final class b implements android.content.ServiceConnection {
        boolean a;
        private final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> b;

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
        }

        private b() {
            this.a = false;
            this.b = new java.util.concurrent.LinkedBlockingQueue<>(1);
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            try {
                this.b.put(iBinder);
            } catch (java.lang.InterruptedException unused) {
            }
        }

        public final android.os.IBinder a() throws java.lang.InterruptedException {
            if (this.a) {
                throw new java.lang.IllegalStateException();
            }
            this.a = true;
            return this.b.take();
        }
    }

    /* compiled from: AdvertisingId.java */
    private static final class c implements android.os.IInterface {
        private android.os.IBinder a;

        public c(android.os.IBinder iBinder) {
            this.a = iBinder;
        }

        @Override // android.os.IInterface
        public final android.os.IBinder asBinder() {
            return this.a;
        }

        public final java.lang.String a() throws android.os.RemoteException {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean b() throws android.os.RemoteException {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
