package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzd extends com.google.android.gms.maps.internal.zzag {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener zza;

    zzd(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        this.zza = onInfoWindowLongClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzah
    public final void zzb(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        this.zza.onInfoWindowLongClick(new com.google.android.gms.maps.model.Marker(zzaaVar));
    }
}
