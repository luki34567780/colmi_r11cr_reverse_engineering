package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class MapView extends android.widget.FrameLayout {
    private final com.google.android.gms.maps.zzah zza;

    public MapView(android.content.Context context) {
        super(context);
        this.zza = new com.google.android.gms.maps.zzah(this, context, null);
        setClickable(true);
    }

    public void getMapAsync(com.google.android.gms.maps.OnMapReadyCallback onMapReadyCallback) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getMapAsync() must be called on the main thread");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onMapReadyCallback, "callback must not be null.");
        this.zza.zza(onMapReadyCallback);
    }

    public void onCreate(android.os.Bundle bundle) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.zza.onCreate(bundle);
            if (this.zza.getDelegate() == null) {
                com.google.android.gms.dynamic.DeferredLifecycleHelper.showGooglePlayUnavailableMessage(this);
            }
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        this.zza.onDestroy();
    }

    public void onEnterAmbient(android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("onEnterAmbient() must be called on the main thread");
        com.google.android.gms.maps.zzah zzahVar = this.zza;
        if (zzahVar.getDelegate() != null) {
            ((com.google.android.gms.maps.zzag) zzahVar.getDelegate()).zza(bundle);
        }
    }

    public void onExitAmbient() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("onExitAmbient() must be called on the main thread");
        com.google.android.gms.maps.zzah zzahVar = this.zza;
        if (zzahVar.getDelegate() != null) {
            ((com.google.android.gms.maps.zzag) zzahVar.getDelegate()).zzb();
        }
    }

    public void onLowMemory() {
        this.zza.onLowMemory();
    }

    public void onPause() {
        this.zza.onPause();
    }

    public void onResume() {
        this.zza.onResume();
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
        this.zza.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.zza.onStart();
    }

    public void onStop() {
        this.zza.onStop();
    }

    public MapView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = new com.google.android.gms.maps.zzah(this, context, com.google.android.gms.maps.GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zza = new com.google.android.gms.maps.zzah(this, context, com.google.android.gms.maps.GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(android.content.Context context, com.google.android.gms.maps.GoogleMapOptions googleMapOptions) {
        super(context);
        this.zza = new com.google.android.gms.maps.zzah(this, context, googleMapOptions);
        setClickable(true);
    }
}
