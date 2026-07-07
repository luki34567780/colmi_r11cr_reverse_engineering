package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzp extends com.google.android.gms.maps.internal.zzbh {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnPolylineClickListener zza;

    zzp(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnPolylineClickListener onPolylineClickListener) {
        this.zza = onPolylineClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbi
    public final void zzb(com.google.android.gms.internal.maps.zzag zzagVar) {
        this.zza.onPolylineClick(new com.google.android.gms.maps.model.Polyline(zzagVar));
    }
}
