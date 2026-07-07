package com.google.android.gms.internal.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzw extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzx {
    public static com.google.android.gms.internal.maps.zzx zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate");
        return queryLocalInterface instanceof com.google.android.gms.internal.maps.zzx ? (com.google.android.gms.internal.maps.zzx) queryLocalInterface : new com.google.android.gms.internal.maps.zzv(iBinder);
    }
}
