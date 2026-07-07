package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzm extends com.google.android.gms.maps.internal.zzy {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener zza;

    zzm(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener onGroundOverlayClickListener) {
        this.zza = onGroundOverlayClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzz
    public final void zzb(com.google.android.gms.internal.maps.zzo zzoVar) {
        this.zza.onGroundOverlayClick(new com.google.android.gms.maps.model.GroundOverlay(zzoVar));
    }
}
