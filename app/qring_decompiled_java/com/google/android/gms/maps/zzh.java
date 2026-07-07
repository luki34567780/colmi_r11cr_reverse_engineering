package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzh extends com.google.android.gms.maps.internal.zzax {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener zza;

    zzh(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        this.zza = onMyLocationButtonClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzay
    public final boolean zzb() throws android.os.RemoteException {
        return this.zza.onMyLocationButtonClick();
    }
}
