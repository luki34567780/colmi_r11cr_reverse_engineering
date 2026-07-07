package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzq extends com.google.android.gms.maps.internal.zzbu {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback zza;

    zzq(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback snapshotReadyCallback) {
        this.zza = snapshotReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzbv
    public final void zzb(android.graphics.Bitmap bitmap) throws android.os.RemoteException {
        this.zza.onSnapshotReady(bitmap);
    }

    @Override // com.google.android.gms.maps.internal.zzbv
    public final void zzc(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        this.zza.onSnapshotReady((android.graphics.Bitmap) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }
}
