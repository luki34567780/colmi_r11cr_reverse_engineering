package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class StreetViewPanoramaView extends android.widget.FrameLayout {
    private final com.google.android.gms.maps.zzas zza;

    public StreetViewPanoramaView(android.content.Context context) {
        super((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "context must not be null"));
        this.zza = new com.google.android.gms.maps.zzas(this, context, null);
    }

    public void getStreetViewPanoramaAsync(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onStreetViewPanoramaReadyCallback, "callback must not be null");
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
        this.zza.zza(onStreetViewPanoramaReadyCallback);
    }

    public final void onCreate(android.os.Bundle bundle) {
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

    public final void onLowMemory() {
        this.zza.onLowMemory();
    }

    public final void onPause() {
        this.zza.onPause();
    }

    public void onResume() {
        this.zza.onResume();
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        this.zza.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.zza.onStart();
    }

    public void onStop() {
        this.zza.onStop();
    }

    public StreetViewPanoramaView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "context must not be null"), attributeSet);
        this.zza = new com.google.android.gms.maps.zzas(this, context, null);
    }

    public StreetViewPanoramaView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "context must not be null"), attributeSet, i);
        this.zza = new com.google.android.gms.maps.zzas(this, context, null);
    }

    public StreetViewPanoramaView(android.content.Context context, com.google.android.gms.maps.StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "context must not be null"));
        this.zza = new com.google.android.gms.maps.zzas(this, context, streetViewPanoramaOptions);
    }
}
