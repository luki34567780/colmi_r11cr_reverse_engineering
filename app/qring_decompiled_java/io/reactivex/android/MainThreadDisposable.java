package io.reactivex.android;

/* loaded from: classes3.dex */
public abstract class MainThreadDisposable implements io.reactivex.disposables.Disposable {
    private final java.util.concurrent.atomic.AtomicBoolean unsubscribed = new java.util.concurrent.atomic.AtomicBoolean();

    protected abstract void onDispose();

    public static void verifyMainThread() {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            return;
        }
        throw new java.lang.IllegalStateException("Expected to be called on the main thread but was " + java.lang.Thread.currentThread().getName());
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.unsubscribed.get();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.unsubscribed.compareAndSet(false, true)) {
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                onDispose();
            } else {
                io.reactivex.android.schedulers.AndroidSchedulers.mainThread().scheduleDirect(new java.lang.Runnable() { // from class: io.reactivex.android.MainThreadDisposable.1
                    @Override // java.lang.Runnable
                    public void run() {
                        io.reactivex.android.MainThreadDisposable.this.onDispose();
                    }
                });
            }
        }
    }
}
