package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzz extends com.google.android.gms.maps.internal.zzap {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMapLongClickListener zza;

    zzz(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMapLongClickListener onMapLongClickListener) {
        this.zza = onMapLongClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzaq
    public final void zzb(com.google.android.gms.maps.model.LatLng latLng) {
        this.zza.onMapLongClick(latLng);
    }
}
