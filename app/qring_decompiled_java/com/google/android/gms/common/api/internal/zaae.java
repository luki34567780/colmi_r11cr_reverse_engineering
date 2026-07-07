package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zaae extends com.google.android.gms.common.api.internal.zap {
    private final androidx.collection.ArraySet<com.google.android.gms.common.api.internal.ApiKey<?>> zad;
    private final com.google.android.gms.common.api.internal.GoogleApiManager zae;

    zaae(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment, com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, com.google.android.gms.common.GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.zad = new androidx.collection.ArraySet<>();
        this.zae = googleApiManager;
        this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    public static void zad(android.app.Activity activity, com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, com.google.android.gms.common.api.internal.ApiKey<?> apiKey) {
        com.google.android.gms.common.api.internal.LifecycleFragment fragment = getFragment(activity);
        com.google.android.gms.common.api.internal.zaae zaaeVar = (com.google.android.gms.common.api.internal.zaae) fragment.getCallbackOrNull("ConnectionlessLifecycleHelper", com.google.android.gms.common.api.internal.zaae.class);
        if (zaaeVar == null) {
            zaaeVar = new com.google.android.gms.common.api.internal.zaae(fragment, googleApiManager, com.google.android.gms.common.GoogleApiAvailability.getInstance());
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(apiKey, "ApiKey cannot be null");
        zaaeVar.zad.add(apiKey);
        googleApiManager.zaC(zaaeVar);
    }

    private final void zae() {
        if (this.zad.isEmpty()) {
            return;
        }
        this.zae.zaC(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        zae();
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        zae();
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        this.zae.zaD(this);
    }

    final androidx.collection.ArraySet<com.google.android.gms.common.api.internal.ApiKey<?>> zaa() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zab(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        this.zae.zaz(connectionResult, i);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zac() {
        this.zae.zaA();
    }
}
