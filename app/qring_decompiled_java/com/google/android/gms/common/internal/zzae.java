package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzae extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.zzaf {
    public static com.google.android.gms.common.internal.zzaf zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof com.google.android.gms.common.internal.zzaf ? (com.google.android.gms.common.internal.zzaf) queryLocalInterface : new com.google.android.gms.common.internal.zzad(iBinder);
    }
}
