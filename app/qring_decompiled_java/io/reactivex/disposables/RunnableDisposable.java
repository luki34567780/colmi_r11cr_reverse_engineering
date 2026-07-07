package io.reactivex.disposables;

/* loaded from: classes3.dex */
final class RunnableDisposable extends io.reactivex.disposables.ReferenceDisposable<java.lang.Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    RunnableDisposable(java.lang.Runnable runnable) {
        super(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(java.lang.Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public java.lang.String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
