package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzf extends com.google.android.gms.maps.internal.zzh {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.InfoWindowAdapter zza;

    zzf(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.InfoWindowAdapter infoWindowAdapter) {
        this.zza = infoWindowAdapter;
    }

    @Override // com.google.android.gms.maps.internal.zzi
    public final com.google.android.gms.dynamic.IObjectWrapper zzb(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getInfoContents(new com.google.android.gms.maps.model.Marker(zzaaVar)));
    }

    @Override // com.google.android.gms.maps.internal.zzi
    public final com.google.android.gms.dynamic.IObjectWrapper zzc(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getInfoWindow(new com.google.android.gms.maps.model.Marker(zzaaVar)));
    }
}
