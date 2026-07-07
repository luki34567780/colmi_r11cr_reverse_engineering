package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzg extends com.google.android.gms.maps.internal.zzaz {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener zza;

    zzg(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        this.zza = onMyLocationChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzba
    public final void zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zza.onMyLocationChange((android.location.Location) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }
}
