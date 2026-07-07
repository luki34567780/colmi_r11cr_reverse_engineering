package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zze extends com.google.android.gms.maps.internal.zzae {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener zza;

    zze(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener onInfoWindowCloseListener) {
        this.zza = onInfoWindowCloseListener;
    }

    @Override // com.google.android.gms.maps.internal.zzaf
    public final void zzb(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        this.zza.onInfoWindowClose(new com.google.android.gms.maps.model.Marker(zzaaVar));
    }
}
