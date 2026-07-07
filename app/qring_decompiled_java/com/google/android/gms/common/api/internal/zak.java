package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zak extends com.google.android.gms.common.api.internal.zap {
    private final android.util.SparseArray<com.google.android.gms.common.api.internal.zaj> zad;

    private zak(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, com.google.android.gms.common.GoogleApiAvailability.getInstance());
        this.zad = new android.util.SparseArray<>();
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public static com.google.android.gms.common.api.internal.zak zaa(com.google.android.gms.common.api.internal.LifecycleActivity lifecycleActivity) {
        com.google.android.gms.common.api.internal.LifecycleFragment fragment = getFragment(lifecycleActivity);
        com.google.android.gms.common.api.internal.zak zakVar = (com.google.android.gms.common.api.internal.zak) fragment.getCallbackOrNull("AutoManageHelper", com.google.android.gms.common.api.internal.zak.class);
        return zakVar != null ? zakVar : new com.google.android.gms.common.api.internal.zak(fragment);
    }

    private final com.google.android.gms.common.api.internal.zaj zai(int i) {
        if (this.zad.size() <= i) {
            return null;
        }
        android.util.SparseArray<com.google.android.gms.common.api.internal.zaj> sparseArray = this.zad;
        return sparseArray.get(sparseArray.keyAt(i));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        for (int i = 0; i < this.zad.size(); i++) {
            com.google.android.gms.common.api.internal.zaj zai = zai(i);
            if (zai != null) {
                printWriter.append((java.lang.CharSequence) str).append("GoogleApiClient #").print(zai.zaa);
                printWriter.println(":");
                zai.zab.dump(java.lang.String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        boolean z = this.zaa;
        java.lang.String valueOf = java.lang.String.valueOf(this.zad);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        android.util.Log.d("AutoManageHelper", sb.toString());
        if (this.zab.get() == null) {
            for (int i = 0; i < this.zad.size(); i++) {
                com.google.android.gms.common.api.internal.zaj zai = zai(i);
                if (zai != null) {
                    zai.zab.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i = 0; i < this.zad.size(); i++) {
            com.google.android.gms.common.api.internal.zaj zai = zai(i);
            if (zai != null) {
                zai.zab.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zab(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        android.util.Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            android.util.Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new java.lang.Exception());
            return;
        }
        com.google.android.gms.common.api.internal.zaj zajVar = this.zad.get(i);
        if (zajVar != null) {
            zae(i);
            com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zajVar.zac;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zac() {
        for (int i = 0; i < this.zad.size(); i++) {
            com.google.android.gms.common.api.internal.zaj zai = zai(i);
            if (zai != null) {
                zai.zab.connect();
            }
        }
    }

    public final void zad(int i, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        boolean z = this.zad.indexOfKey(i) < 0;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        com.google.android.gms.common.internal.Preconditions.checkState(z, sb.toString());
        com.google.android.gms.common.api.internal.zam zamVar = this.zab.get();
        boolean z2 = this.zaa;
        java.lang.String valueOf = java.lang.String.valueOf(zamVar);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(valueOf);
        android.util.Log.d("AutoManageHelper", sb2.toString());
        com.google.android.gms.common.api.internal.zaj zajVar = new com.google.android.gms.common.api.internal.zaj(this, i, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(zajVar);
        this.zad.put(i, zajVar);
        if (this.zaa && zamVar == null) {
            android.util.Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.connect();
        }
    }

    public final void zae(int i) {
        com.google.android.gms.common.api.internal.zaj zajVar = this.zad.get(i);
        this.zad.remove(i);
        if (zajVar != null) {
            zajVar.zab.unregisterConnectionFailedListener(zajVar);
            zajVar.zab.disconnect();
        }
    }
}
