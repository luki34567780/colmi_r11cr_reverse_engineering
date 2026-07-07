package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzy extends com.google.android.gms.maps.internal.zzal {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMapClickListener zza;

    zzy(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMapClickListener onMapClickListener) {
        this.zza = onMapClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzam
    public final void zzb(com.google.android.gms.maps.model.LatLng latLng) {
        this.zza.onMapClick(latLng);
    }
}
