package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzj extends com.google.android.gms.maps.internal.zzan {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback zza;

    zzj(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.zza = onMapLoadedCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzao
    public final void zzb() throws android.os.RemoteException {
        this.zza.onMapLoaded();
    }
}
