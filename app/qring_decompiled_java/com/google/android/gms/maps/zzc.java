package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzc extends com.google.android.gms.maps.internal.zzac {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener zza;

    zzc(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        this.zza = onInfoWindowClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzad
    public final void zzb(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        this.zza.onInfoWindowClick(new com.google.android.gms.maps.model.Marker(zzaaVar));
    }
}
