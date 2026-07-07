package com.google.android.gms.internal.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzaf extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzag {
    public static com.google.android.gms.internal.maps.zzag zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        return queryLocalInterface instanceof com.google.android.gms.internal.maps.zzag ? (com.google.android.gms.internal.maps.zzag) queryLocalInterface : new com.google.android.gms.internal.maps.zzae(iBinder);
    }
}
