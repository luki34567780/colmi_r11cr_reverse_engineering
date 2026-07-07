package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzax implements com.google.android.gms.maps.internal.StreetViewLifecycleDelegate {
    private final androidx.fragment.app.Fragment zza;
    private final com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate zzb;

    public zzax(androidx.fragment.app.Fragment fragment, com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegate) {
        this.zzb = (com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate) com.google.android.gms.common.internal.Preconditions.checkNotNull(iStreetViewPanoramaFragmentDelegate);
        this.zza = (androidx.fragment.app.Fragment) com.google.android.gms.common.internal.Preconditions.checkNotNull(fragment);
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onCreate(android.os.Bundle bundle) {
        try {
            android.os.Bundle bundle2 = new android.os.Bundle();
            com.google.android.gms.maps.internal.zzca.zzb(bundle, bundle2);
            android.os.Bundle arguments = this.zza.getArguments();
            if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                com.google.android.gms.maps.internal.zzca.zzc(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
            }
            this.zzb.onCreate(bundle2);
            com.google.android.gms.maps.internal.zzca.zzb(bundle2, bundle);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        try {
            android.os.Bundle bundle2 = new android.os.Bundle();
            com.google.android.gms.maps.internal.zzca.zzb(bundle, bundle2);
            com.google.android.gms.dynamic.IObjectWrapper onCreateView = this.zzb.onCreateView(com.google.android.gms.dynamic.ObjectWrapper.wrap(layoutInflater), com.google.android.gms.dynamic.ObjectWrapper.wrap(viewGroup), bundle2);
            com.google.android.gms.maps.internal.zzca.zzb(bundle2, bundle);
            return (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(onCreateView);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.maps.internal.StreetViewLifecycleDelegate
    public final void getStreetViewPanoramaAsync(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        try {
            this.zzb.getStreetViewPanoramaAsync(new com.google.android.gms.maps.zzaw(this, onStreetViewPanoramaReadyCallback));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onDestroy() {
        try {
            this.zzb.onDestroy();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onDestroyView() {
        try {
            this.zzb.onDestroyView();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onLowMemory() {
        try {
            this.zzb.onLowMemory();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onPause() {
        try {
            this.zzb.onPause();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onResume() {
        try {
            this.zzb.onResume();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onStart() {
        try {
            this.zzb.onStart();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onStop() {
        try {
            this.zzb.onStop();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onInflate(android.app.Activity activity, android.os.Bundle bundle, android.os.Bundle bundle2) {
        try {
            android.os.Bundle bundle3 = new android.os.Bundle();
            com.google.android.gms.maps.internal.zzca.zzb(bundle2, bundle3);
            this.zzb.onInflate(com.google.android.gms.dynamic.ObjectWrapper.wrap(activity), null, bundle3);
            com.google.android.gms.maps.internal.zzca.zzb(bundle3, bundle2);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        try {
            android.os.Bundle bundle2 = new android.os.Bundle();
            com.google.android.gms.maps.internal.zzca.zzb(bundle, bundle2);
            this.zzb.onSaveInstanceState(bundle2);
            com.google.android.gms.maps.internal.zzca.zzb(bundle2, bundle);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
