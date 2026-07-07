package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zada<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.TransformedResult<R> implements com.google.android.gms.common.api.ResultCallback<R> {
    private final java.lang.ref.WeakReference<com.google.android.gms.common.api.GoogleApiClient> zag;
    private final com.google.android.gms.common.api.internal.zacz zah;
    private com.google.android.gms.common.api.ResultTransform<? super R, ? extends com.google.android.gms.common.api.Result> zaa = null;
    private com.google.android.gms.common.api.internal.zada<? extends com.google.android.gms.common.api.Result> zab = null;
    private volatile com.google.android.gms.common.api.ResultCallbacks<? super R> zac = null;
    private com.google.android.gms.common.api.PendingResult<R> zad = null;
    private final java.lang.Object zae = new java.lang.Object();
    private com.google.android.gms.common.api.Status zaf = null;
    private boolean zai = false;

    public zada(java.lang.ref.WeakReference<com.google.android.gms.common.api.GoogleApiClient> weakReference) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(weakReference, "GoogleApiClient reference must not be null");
        this.zag = weakReference;
        com.google.android.gms.common.api.GoogleApiClient googleApiClient = weakReference.get();
        this.zah = new com.google.android.gms.common.api.internal.zacz(this, googleApiClient != null ? googleApiClient.getLooper() : android.os.Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaj(com.google.android.gms.common.api.Status status) {
        synchronized (this.zae) {
            this.zaf = status;
            zal(status);
        }
    }

    private final void zak() {
        if (this.zaa == null && this.zac == null) {
            return;
        }
        com.google.android.gms.common.api.GoogleApiClient googleApiClient = this.zag.get();
        if (!this.zai && this.zaa != null && googleApiClient != null) {
            googleApiClient.zao(this);
            this.zai = true;
        }
        com.google.android.gms.common.api.Status status = this.zaf;
        if (status != null) {
            zal(status);
            return;
        }
        com.google.android.gms.common.api.PendingResult<R> pendingResult = this.zad;
        if (pendingResult != null) {
            pendingResult.setResultCallback(this);
        }
    }

    private final void zal(com.google.android.gms.common.api.Status status) {
        synchronized (this.zae) {
            com.google.android.gms.common.api.ResultTransform<? super R, ? extends com.google.android.gms.common.api.Result> resultTransform = this.zaa;
            if (resultTransform != null) {
                ((com.google.android.gms.common.api.internal.zada) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zab)).zaj((com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.Preconditions.checkNotNull(resultTransform.onFailure(status), "onFailure must not return null"));
            } else if (zam()) {
                ((com.google.android.gms.common.api.ResultCallbacks) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zac)).onFailure(status);
            }
        }
    }

    private final boolean zam() {
        return (this.zac == null || this.zag.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zan(com.google.android.gms.common.api.Result result) {
        if (result instanceof com.google.android.gms.common.api.Releasable) {
            try {
                ((com.google.android.gms.common.api.Releasable) result).release();
            } catch (java.lang.RuntimeException e) {
                java.lang.String valueOf = java.lang.String.valueOf(result);
                java.lang.String.valueOf(valueOf).length();
                android.util.Log.w("TransformedResultImpl", "Unable to release ".concat(java.lang.String.valueOf(valueOf)), e);
            }
        }
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    public final void andFinally(com.google.android.gms.common.api.ResultCallbacks<? super R> resultCallbacks) {
        synchronized (this.zae) {
            boolean z = true;
            com.google.android.gms.common.internal.Preconditions.checkState(this.zac == null, "Cannot call andFinally() twice.");
            if (this.zaa != null) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zac = resultCallbacks;
            zak();
        }
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(R r) {
        synchronized (this.zae) {
            if (!r.getStatus().isSuccess()) {
                zaj(r.getStatus());
                zan(r);
            } else if (this.zaa != null) {
                com.google.android.gms.common.api.internal.zaco.zaa().submit(new com.google.android.gms.common.api.internal.zacy(this, r));
            } else if (zam()) {
                ((com.google.android.gms.common.api.ResultCallbacks) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zac)).onSuccess(r);
            }
        }
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    public final <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> resultTransform) {
        com.google.android.gms.common.api.internal.zada<? extends com.google.android.gms.common.api.Result> zadaVar;
        synchronized (this.zae) {
            boolean z = true;
            com.google.android.gms.common.internal.Preconditions.checkState(this.zaa == null, "Cannot call then() twice.");
            if (this.zac != null) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zaa = resultTransform;
            zadaVar = new com.google.android.gms.common.api.internal.zada<>(this.zag);
            this.zab = zadaVar;
            zak();
        }
        return zadaVar;
    }

    final void zah() {
        this.zac = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zai(com.google.android.gms.common.api.PendingResult<?> pendingResult) {
        synchronized (this.zae) {
            this.zad = pendingResult;
            zak();
        }
    }
}
