package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzo extends com.google.android.gms.maps.internal.zzbf {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnPolygonClickListener zza;

    zzo(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnPolygonClickListener onPolygonClickListener) {
        this.zza = onPolygonClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbg
    public final void zzb(com.google.android.gms.internal.maps.zzad zzadVar) {
        this.zza.onPolygonClick(new com.google.android.gms.maps.model.Polygon(zzadVar));
    }
}
