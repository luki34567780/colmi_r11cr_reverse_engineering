package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zza extends com.google.android.gms.maps.internal.zzat {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMarkerClickListener zza;

    zza(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener onMarkerClickListener) {
        this.zza = onMarkerClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzau
    public final boolean zzb(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        return this.zza.onMarkerClick(new com.google.android.gms.maps.model.Marker(zzaaVar));
    }
}
