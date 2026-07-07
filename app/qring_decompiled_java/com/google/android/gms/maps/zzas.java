package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzas extends com.google.android.gms.dynamic.DeferredLifecycleHelper {
    protected com.google.android.gms.dynamic.OnDelegateCreatedListener zza;
    private final android.view.ViewGroup zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.maps.StreetViewPanoramaOptions zzd;
    private final java.util.List zze = new java.util.ArrayList();

    zzas(android.view.ViewGroup viewGroup, android.content.Context context, com.google.android.gms.maps.StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.zzb = viewGroup;
        this.zzc = context;
        this.zzd = streetViewPanoramaOptions;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    protected final void createDelegate(com.google.android.gms.dynamic.OnDelegateCreatedListener onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzb();
    }

    public final void zza(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        if (getDelegate() != null) {
            ((com.google.android.gms.maps.zzar) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            this.zze.add(onStreetViewPanoramaReadyCallback);
        }
    }

    public final void zzb() {
        if (this.zza == null || getDelegate() != null) {
            return;
        }
        try {
            com.google.android.gms.maps.MapsInitializer.initialize(this.zzc);
            this.zza.onDelegateCreated(new com.google.android.gms.maps.zzar(this.zzb, com.google.android.gms.maps.internal.zzcb.zza(this.zzc, null).zzi(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzc), this.zzd)));
            java.util.Iterator it = this.zze.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.maps.zzar) getDelegate()).getStreetViewPanoramaAsync((com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback) it.next());
            }
            this.zze.clear();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException unused) {
        }
    }
}
