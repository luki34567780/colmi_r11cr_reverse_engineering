package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzae extends com.google.android.gms.dynamic.DeferredLifecycleHelper {
    protected com.google.android.gms.dynamic.OnDelegateCreatedListener zza;
    private final android.app.Fragment zzb;
    private android.app.Activity zzc;
    private final java.util.List zzd = new java.util.ArrayList();

    zzae(android.app.Fragment fragment) {
        this.zzb = fragment;
    }

    static /* synthetic */ void zza(com.google.android.gms.maps.zzae zzaeVar, android.app.Activity activity) {
        zzaeVar.zzc = activity;
        zzaeVar.zzc();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    protected final void createDelegate(com.google.android.gms.dynamic.OnDelegateCreatedListener onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzc();
    }

    public final void zzb(com.google.android.gms.maps.OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            ((com.google.android.gms.maps.zzad) getDelegate()).getMapAsync(onMapReadyCallback);
        } else {
            this.zzd.add(onMapReadyCallback);
        }
    }

    public final void zzc() {
        if (this.zzc == null || this.zza == null || getDelegate() != null) {
            return;
        }
        try {
            com.google.android.gms.maps.MapsInitializer.initialize(this.zzc);
            com.google.android.gms.maps.internal.IMapFragmentDelegate zzf = com.google.android.gms.maps.internal.zzcb.zza(this.zzc, null).zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzc));
            if (zzf == null) {
                return;
            }
            this.zza.onDelegateCreated(new com.google.android.gms.maps.zzad(this.zzb, zzf));
            java.util.Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.maps.zzad) getDelegate()).getMapAsync((com.google.android.gms.maps.OnMapReadyCallback) it.next());
            }
            this.zzd.clear();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException unused) {
        }
    }
}
