package com.google.android.gms.dynamic;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public interface IObjectWrapper extends android.os.IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.dynamic.IObjectWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static com.google.android.gms.dynamic.IObjectWrapper asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof com.google.android.gms.dynamic.IObjectWrapper ? (com.google.android.gms.dynamic.IObjectWrapper) queryLocalInterface : new com.google.android.gms.dynamic.zzb(iBinder);
        }
    }
}
