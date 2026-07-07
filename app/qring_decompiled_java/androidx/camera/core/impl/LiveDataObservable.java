package androidx.camera.core.impl;

/* loaded from: classes.dex */
public final class LiveDataObservable<T> implements androidx.camera.core.impl.Observable<T> {
    final androidx.lifecycle.MutableLiveData<androidx.camera.core.impl.LiveDataObservable.Result<T>> mLiveData = new androidx.lifecycle.MutableLiveData<>();
    private final java.util.Map<androidx.camera.core.impl.Observable.Observer<T>, androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter<T>> mObservers = new java.util.HashMap();

    public void postValue(T value) {
        this.mLiveData.postValue(androidx.camera.core.impl.LiveDataObservable.Result.fromValue(value));
    }

    public void postError(java.lang.Throwable error) {
        this.mLiveData.postValue(androidx.camera.core.impl.LiveDataObservable.Result.fromError(error));
    }

    public androidx.lifecycle.LiveData<androidx.camera.core.impl.LiveDataObservable.Result<T>> getLiveData() {
        return this.mLiveData;
    }

    @Override // androidx.camera.core.impl.Observable
    public com.google.common.util.concurrent.ListenableFuture<T> fetchData() {
        return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver<T>() { // from class: androidx.camera.core.impl.LiveDataObservable.1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public java.lang.Object attachCompleter(final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T> completer) {
                androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.LiveDataObservable.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        androidx.camera.core.impl.LiveDataObservable.Result<T> value = androidx.camera.core.impl.LiveDataObservable.this.mLiveData.getValue();
                        if (value == null) {
                            completer.setException(new java.lang.IllegalStateException("Observable has not yet been initialized with a value."));
                        } else if (value.completedSuccessfully()) {
                            completer.set(value.getValue());
                        } else {
                            androidx.core.util.Preconditions.checkNotNull(value.getError());
                            completer.setException(value.getError());
                        }
                    }
                });
                return androidx.camera.core.impl.LiveDataObservable.this + " [fetch@" + android.os.SystemClock.uptimeMillis() + "]";
            }
        });
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(java.util.concurrent.Executor executor, androidx.camera.core.impl.Observable.Observer<T> observer) {
        synchronized (this.mObservers) {
            final androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter<T> liveDataObserverAdapter = this.mObservers.get(observer);
            if (liveDataObserverAdapter != null) {
                liveDataObserverAdapter.disable();
            }
            final androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter<T> liveDataObserverAdapter2 = new androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter<>(executor, observer);
            this.mObservers.put(observer, liveDataObserverAdapter2);
            androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.LiveDataObservable.2
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.core.impl.LiveDataObservable.this.mLiveData.removeObserver(liveDataObserverAdapter);
                    androidx.camera.core.impl.LiveDataObservable.this.mLiveData.observeForever(liveDataObserverAdapter2);
                }
            });
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(androidx.camera.core.impl.Observable.Observer<T> observer) {
        synchronized (this.mObservers) {
            final androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter<T> remove = this.mObservers.remove(observer);
            if (remove != null) {
                remove.disable();
                androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.LiveDataObservable.3
                    @Override // java.lang.Runnable
                    public void run() {
                        androidx.camera.core.impl.LiveDataObservable.this.mLiveData.removeObserver(remove);
                    }
                });
            }
        }
    }

    public static final class Result<T> {
        private java.lang.Throwable mError;
        private T mValue;

        private Result(T value, java.lang.Throwable error) {
            this.mValue = value;
            this.mError = error;
        }

        static <T> androidx.camera.core.impl.LiveDataObservable.Result<T> fromValue(T value) {
            return new androidx.camera.core.impl.LiveDataObservable.Result<>(value, null);
        }

        static <T> androidx.camera.core.impl.LiveDataObservable.Result<T> fromError(java.lang.Throwable error) {
            return new androidx.camera.core.impl.LiveDataObservable.Result<>(null, (java.lang.Throwable) androidx.core.util.Preconditions.checkNotNull(error));
        }

        public boolean completedSuccessfully() {
            return this.mError == null;
        }

        public T getValue() {
            if (!completedSuccessfully()) {
                throw new java.lang.IllegalStateException("Result contains an error. Does not contain a value.");
            }
            return this.mValue;
        }

        public java.lang.Throwable getError() {
            return this.mError;
        }

        public java.lang.String toString() {
            java.lang.String str;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("[Result: <");
            if (completedSuccessfully()) {
                str = "Value: " + this.mValue;
            } else {
                str = "Error: " + this.mError;
            }
            sb.append(str);
            sb.append(">]");
            return sb.toString();
        }
    }

    private static final class LiveDataObserverAdapter<T> implements androidx.lifecycle.Observer<androidx.camera.core.impl.LiveDataObservable.Result<T>> {
        final java.util.concurrent.atomic.AtomicBoolean mActive = new java.util.concurrent.atomic.AtomicBoolean(true);
        final java.util.concurrent.Executor mExecutor;
        final androidx.camera.core.impl.Observable.Observer<T> mObserver;

        LiveDataObserverAdapter(java.util.concurrent.Executor executor, androidx.camera.core.impl.Observable.Observer<T> observer) {
            this.mExecutor = executor;
            this.mObserver = observer;
        }

        void disable() {
            this.mActive.set(false);
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(final androidx.camera.core.impl.LiveDataObservable.Result<T> result) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    if (androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter.this.mActive.get()) {
                        if (result.completedSuccessfully()) {
                            androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter.this.mObserver.onNewData(result.getValue());
                        } else {
                            androidx.core.util.Preconditions.checkNotNull(result.getError());
                            androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter.this.mObserver.onError(result.getError());
                        }
                    }
                }
            });
        }
    }
}
