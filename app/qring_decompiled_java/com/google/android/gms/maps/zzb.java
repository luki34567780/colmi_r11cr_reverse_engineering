package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzb extends com.google.android.gms.maps.internal.zzav {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMarkerDragListener zza;

    zzb(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMarkerDragListener onMarkerDragListener) {
        this.zza = onMarkerDragListener;
    }

    @Override // com.google.android.gms.maps.internal.zzaw
    public final void zzb(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        this.zza.onMarkerDrag(new com.google.android.gms.maps.model.Marker(zzaaVar));
    }

    @Override // com.google.android.gms.maps.internal.zzaw
    public final void zzc(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        this.zza.onMarkerDragEnd(new com.google.android.gms.maps.model.Marker(zzaaVar));
    }

    @Override // com.google.android.gms.maps.internal.zzaw
    public final void zzd(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        this.zza.onMarkerDragStart(new com.google.android.gms.maps.model.Marker(zzaaVar));
    }
}
