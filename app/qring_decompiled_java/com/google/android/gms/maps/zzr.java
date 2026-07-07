package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzr extends com.google.android.gms.maps.internal.zzbd {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnPoiClickListener zza;

    zzr(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnPoiClickListener onPoiClickListener) {
        this.zza = onPoiClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbe
    public final void zzb(com.google.android.gms.maps.model.PointOfInterest pointOfInterest) throws android.os.RemoteException {
        this.zza.onPoiClick(pointOfInterest);
    }
}
