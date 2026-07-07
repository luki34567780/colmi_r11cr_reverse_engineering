package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzaf extends com.google.android.gms.maps.internal.zzar {
    final /* synthetic */ com.google.android.gms.maps.OnMapReadyCallback zza;

    zzaf(com.google.android.gms.maps.zzag zzagVar, com.google.android.gms.maps.OnMapReadyCallback onMapReadyCallback) {
        this.zza = onMapReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzas
    public final void zzb(com.google.android.gms.maps.internal.IGoogleMapDelegate iGoogleMapDelegate) throws android.os.RemoteException {
        this.zza.onMapReady(new com.google.android.gms.maps.GoogleMap(iGoogleMapDelegate));
    }
}
