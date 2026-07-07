package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zbc extends androidx.loader.content.AsyncTaskLoader implements com.google.android.gms.common.api.internal.SignInConnectionListener {
    private final java.util.concurrent.Semaphore zba;
    private final java.util.Set zbb;

    public zbc(android.content.Context context, java.util.Set set) {
        super(context);
        this.zba = new java.util.concurrent.Semaphore(0);
        this.zbb = set;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object loadInBackground() {
        java.util.Iterator it = this.zbb.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((com.google.android.gms.common.api.GoogleApiClient) it.next()).maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.zba.tryAcquire(i, 5L, java.util.concurrent.TimeUnit.SECONDS);
            return null;
        } catch (java.lang.InterruptedException e) {
            android.util.Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            java.lang.Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.zba.release();
    }

    protected final void onStartLoading() {
        this.zba.drainPermits();
        forceLoad();
    }
}
