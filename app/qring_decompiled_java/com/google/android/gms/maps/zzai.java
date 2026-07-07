package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzai extends com.google.android.gms.maps.internal.zzbl {
    final /* synthetic */ com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener zza;

    zzai(com.google.android.gms.maps.StreetViewPanorama streetViewPanorama, com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
        this.zza = onStreetViewPanoramaChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbm
    public final void zzb(com.google.android.gms.maps.model.StreetViewPanoramaLocation streetViewPanoramaLocation) {
        this.zza.onStreetViewPanoramaChange(streetViewPanoramaLocation);
    }
}
