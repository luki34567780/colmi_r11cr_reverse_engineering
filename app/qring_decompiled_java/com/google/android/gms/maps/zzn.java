package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzn extends com.google.android.gms.maps.internal.zzw {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnCircleClickListener zza;

    zzn(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnCircleClickListener onCircleClickListener) {
        this.zza = onCircleClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzx
    public final void zzb(com.google.android.gms.internal.maps.zzl zzlVar) {
        this.zza.onCircleClick(new com.google.android.gms.maps.model.Circle(zzlVar));
    }
}
