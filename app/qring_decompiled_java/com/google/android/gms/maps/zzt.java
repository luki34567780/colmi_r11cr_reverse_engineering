package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzt extends com.google.android.gms.maps.internal.zzm {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnCameraChangeListener zza;

    zzt(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnCameraChangeListener onCameraChangeListener) {
        this.zza = onCameraChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzn
    public final void zzb(com.google.android.gms.maps.model.CameraPosition cameraPosition) {
        this.zza.onCameraChange(cameraPosition);
    }
}
