package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class MapFragment extends android.app.Fragment {
    private final com.google.android.gms.maps.zzae zza = new com.google.android.gms.maps.zzae(this);

    public static com.google.android.gms.maps.MapFragment newInstance() {
        return new com.google.android.gms.maps.MapFragment();
    }

    public void getMapAsync(com.google.android.gms.maps.OnMapReadyCallback onMapReadyCallback) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getMapAsync must be called on the main thread.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onMapReadyCallback, "callback must not be null.");
        this.zza.zzb(onMapReadyCallback);
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        java.lang.ClassLoader classLoader = com.google.android.gms.maps.MapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        com.google.android.gms.maps.zzae.zza(this.zza, activity);
    }

    @Override // android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.zza.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View onCreateView = this.zza.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setClickable(true);
        return onCreateView;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.zza.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.zza.onDestroyView();
        super.onDestroyView();
    }

    public final void onEnterAmbient(android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("onEnterAmbient must be called on the main thread.");
        com.google.android.gms.maps.zzae zzaeVar = this.zza;
        if (zzaeVar.getDelegate() != null) {
            ((com.google.android.gms.maps.zzad) zzaeVar.getDelegate()).zza(bundle);
        }
    }

    public final void onExitAmbient() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("onExitAmbient must be called on the main thread.");
        com.google.android.gms.maps.zzae zzaeVar = this.zza;
        if (zzaeVar.getDelegate() != null) {
            ((com.google.android.gms.maps.zzad) zzaeVar.getDelegate()).zzb();
        }
    }

    @Override // android.app.Fragment
    public void onInflate(android.app.Activity activity, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            com.google.android.gms.maps.zzae.zza(this.zza, activity);
            com.google.android.gms.maps.GoogleMapOptions createFromAttributes = com.google.android.gms.maps.GoogleMapOptions.createFromAttributes(activity, attributeSet);
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable("MapOptions", createFromAttributes);
            this.zza.onInflate(activity, bundle2, bundle);
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.zza.onLowMemory();
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public void onPause() {
        this.zza.onPause();
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.zza.onResume();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        java.lang.ClassLoader classLoader = com.google.android.gms.maps.MapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.zza.onSaveInstanceState(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.zza.onStart();
    }

    @Override // android.app.Fragment
    public void onStop() {
        this.zza.onStop();
        super.onStop();
    }

    @Override // android.app.Fragment
    public void setArguments(android.os.Bundle bundle) {
        super.setArguments(bundle);
    }

    public static com.google.android.gms.maps.MapFragment newInstance(com.google.android.gms.maps.GoogleMapOptions googleMapOptions) {
        com.google.android.gms.maps.MapFragment mapFragment = new com.google.android.gms.maps.MapFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        mapFragment.setArguments(bundle);
        return mapFragment;
    }
}
