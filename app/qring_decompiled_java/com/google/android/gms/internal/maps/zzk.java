package com.google.android.gms.internal.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzk extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzl {
    public static com.google.android.gms.internal.maps.zzl zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        return queryLocalInterface instanceof com.google.android.gms.internal.maps.zzl ? (com.google.android.gms.internal.maps.zzl) queryLocalInterface : new com.google.android.gms.internal.maps.zzj(iBinder);
    }
}
