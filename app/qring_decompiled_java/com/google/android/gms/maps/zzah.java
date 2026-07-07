package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzah extends com.google.android.gms.dynamic.DeferredLifecycleHelper {
    protected com.google.android.gms.dynamic.OnDelegateCreatedListener zza;
    private final android.view.ViewGroup zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.maps.GoogleMapOptions zzd;
    private final java.util.List zze = new java.util.ArrayList();

    zzah(android.view.ViewGroup viewGroup, android.content.Context context, com.google.android.gms.maps.GoogleMapOptions googleMapOptions) {
        this.zzb = viewGroup;
        this.zzc = context;
        this.zzd = googleMapOptions;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    protected final void createDelegate(com.google.android.gms.dynamic.OnDelegateCreatedListener onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzb();
    }

    public final void zza(com.google.android.gms.maps.OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            ((com.google.android.gms.maps.zzag) getDelegate()).getMapAsync(onMapReadyCallback);
        } else {
            this.zze.add(onMapReadyCallback);
        }
    }

    public final void zzb() {
        if (this.zza == null || getDelegate() != null) {
            return;
        }
        try {
            com.google.android.gms.maps.MapsInitializer.initialize(this.zzc);
            com.google.android.gms.maps.internal.IMapViewDelegate zzg = com.google.android.gms.maps.internal.zzcb.zza(this.zzc, null).zzg(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzc), this.zzd);
            if (zzg == null) {
                return;
            }
            this.zza.onDelegateCreated(new com.google.android.gms.maps.zzag(this.zzb, zzg));
            java.util.Iterator it = this.zze.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.maps.zzag) getDelegate()).getMapAsync((com.google.android.gms.maps.OnMapReadyCallback) it.next());
            }
            this.zze.clear();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException unused) {
        }
    }
}
