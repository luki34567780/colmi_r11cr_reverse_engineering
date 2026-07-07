package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class ComputableLiveData<T> {
    final java.util.concurrent.atomic.AtomicBoolean mComputing;
    final java.util.concurrent.Executor mExecutor;
    final java.util.concurrent.atomic.AtomicBoolean mInvalid;
    final java.lang.Runnable mInvalidationRunnable;
    final androidx.lifecycle.LiveData<T> mLiveData;
    final java.lang.Runnable mRefreshRunnable;

    protected abstract T compute();

    public ComputableLiveData() {
        this(androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor());
    }

    public ComputableLiveData(java.util.concurrent.Executor executor) {
        this.mInvalid = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.mComputing = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.mRefreshRunnable = new java.lang.Runnable() { // from class: androidx.lifecycle.ComputableLiveData.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                do {
                    boolean z = false;
                    if (androidx.lifecycle.ComputableLiveData.this.mComputing.compareAndSet(false, true)) {
                        java.lang.Object obj = null;
                        boolean z2 = false;
                        while (androidx.lifecycle.ComputableLiveData.this.mInvalid.compareAndSet(true, false)) {
                            try {
                                obj = androidx.lifecycle.ComputableLiveData.this.compute();
                                z2 = true;
                            } catch (java.lang.Throwable th) {
                                androidx.lifecycle.ComputableLiveData.this.mComputing.set(false);
                                throw th;
                            }
                        }
                        if (z2) {
                            androidx.lifecycle.ComputableLiveData.this.mLiveData.postValue(obj);
                        }
                        androidx.lifecycle.ComputableLiveData.this.mComputing.set(false);
                        z = z2;
                    }
                    if (!z) {
                        return;
                    }
                } while (androidx.lifecycle.ComputableLiveData.this.mInvalid.get());
            }
        };
        this.mInvalidationRunnable = new java.lang.Runnable() { // from class: androidx.lifecycle.ComputableLiveData.3
            @Override // java.lang.Runnable
            public void run() {
                boolean hasActiveObservers = androidx.lifecycle.ComputableLiveData.this.mLiveData.hasActiveObservers();
                if (androidx.lifecycle.ComputableLiveData.this.mInvalid.compareAndSet(false, true) && hasActiveObservers) {
                    androidx.lifecycle.ComputableLiveData.this.mExecutor.execute(androidx.lifecycle.ComputableLiveData.this.mRefreshRunnable);
                }
            }
        };
        this.mExecutor = executor;
        this.mLiveData = new androidx.lifecycle.LiveData<T>() { // from class: androidx.lifecycle.ComputableLiveData.1
            @Override // androidx.lifecycle.LiveData
            protected void onActive() {
                androidx.lifecycle.ComputableLiveData.this.mExecutor.execute(androidx.lifecycle.ComputableLiveData.this.mRefreshRunnable);
            }
        };
    }

    public androidx.lifecycle.LiveData<T> getLiveData() {
        return this.mLiveData;
    }

    public void invalidate() {
        androidx.arch.core.executor.ArchTaskExecutor.getInstance().executeOnMainThread(this.mInvalidationRunnable);
    }
}
