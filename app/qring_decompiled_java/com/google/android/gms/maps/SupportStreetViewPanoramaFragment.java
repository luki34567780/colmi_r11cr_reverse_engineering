package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class SupportStreetViewPanoramaFragment extends androidx.fragment.app.Fragment {
    private final com.google.android.gms.maps.zzay zza = new com.google.android.gms.maps.zzay(this);

    public static com.google.android.gms.maps.SupportStreetViewPanoramaFragment newInstance() {
        return new com.google.android.gms.maps.SupportStreetViewPanoramaFragment();
    }

    public void getStreetViewPanoramaAsync(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onStreetViewPanoramaReadyCallback, "callback must not be null.");
        this.zza.zzb(onStreetViewPanoramaReadyCallback);
    }

    public void onActivityCreated(android.os.Bundle bundle) {
        java.lang.ClassLoader classLoader = com.google.android.gms.maps.SupportStreetViewPanoramaFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        com.google.android.gms.maps.zzay.zza(this.zza, activity);
    }

    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.zza.onCreate(bundle);
    }

    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return this.zza.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.zza.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.zza.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(android.app.Activity activity, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            com.google.android.gms.maps.zzay.zza(this.zza, activity);
            this.zza.onInflate(activity, new android.os.Bundle(), bundle);
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.zza.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        this.zza.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.zza.onResume();
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
        java.lang.ClassLoader classLoader = com.google.android.gms.maps.SupportStreetViewPanoramaFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.zza.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        this.zza.onStart();
    }

    public void onStop() {
        this.zza.onStop();
        super.onStop();
    }

    public void setArguments(android.os.Bundle bundle) {
        super.setArguments(bundle);
    }

    public static com.google.android.gms.maps.SupportStreetViewPanoramaFragment newInstance(com.google.android.gms.maps.StreetViewPanoramaOptions streetViewPanoramaOptions) {
        com.google.android.gms.maps.SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment = new com.google.android.gms.maps.SupportStreetViewPanoramaFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetViewPanoramaOptions);
        supportStreetViewPanoramaFragment.setArguments(bundle);
        return supportStreetViewPanoramaFragment;
    }
}
