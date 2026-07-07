package io.reactivex.subjects;

/* loaded from: classes3.dex */
public final class PublishSubject<T> extends io.reactivex.subjects.Subject<T> {
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.PublishSubject.PublishDisposable<T>[]> subscribers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
    static final io.reactivex.subjects.PublishSubject.PublishDisposable[] TERMINATED = new io.reactivex.subjects.PublishSubject.PublishDisposable[0];
    static final io.reactivex.subjects.PublishSubject.PublishDisposable[] EMPTY = new io.reactivex.subjects.PublishSubject.PublishDisposable[0];

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.PublishSubject<T> create() {
        return new io.reactivex.subjects.PublishSubject<>();
    }

    PublishSubject() {
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.subjects.PublishSubject.PublishDisposable<T> publishDisposable = new io.reactivex.subjects.PublishSubject.PublishDisposable<>(observer, this);
        observer.onSubscribe(publishDisposable);
        if (add(publishDisposable)) {
            if (publishDisposable.isDisposed()) {
                remove(publishDisposable);
            }
        } else {
            java.lang.Throwable th = this.error;
            if (th != null) {
                observer.onError(th);
            } else {
                observer.onComplete();
            }
        }
    }

    boolean add(io.reactivex.subjects.PublishSubject.PublishDisposable<T> publishDisposable) {
        io.reactivex.subjects.PublishSubject.PublishDisposable<T>[] publishDisposableArr;
        io.reactivex.subjects.PublishSubject.PublishDisposable<T>[] publishDisposableArr2;
        do {
            publishDisposableArr = this.subscribers.get();
            if (publishDisposableArr == TERMINATED) {
                return false;
            }
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new io.reactivex.subjects.PublishSubject.PublishDisposable[length + 1];
            java.lang.System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!this.subscribers.compareAndSet(publishDisposableArr, publishDisposableArr2));
        return true;
    }

    void remove(io.reactivex.subjects.PublishSubject.PublishDisposable<T> publishDisposable) {
        io.reactivex.subjects.PublishSubject.PublishDisposable<T>[] publishDisposableArr;
        io.reactivex.subjects.PublishSubject.PublishDisposable<T>[] publishDisposableArr2;
        do {
            publishDisposableArr = this.subscribers.get();
            if (publishDisposableArr == TERMINATED || publishDisposableArr == EMPTY) {
                return;
            }
            int length = publishDisposableArr.length;
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (publishDisposableArr[i2] == publishDisposable) {
                    i = i2;
                    break;
                }
                i2++;
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                publishDisposableArr2 = EMPTY;
            } else {
                io.reactivex.subjects.PublishSubject.PublishDisposable<T>[] publishDisposableArr3 = new io.reactivex.subjects.PublishSubject.PublishDisposable[length - 1];
                java.lang.System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i);
                java.lang.System.arraycopy(publishDisposableArr, i + 1, publishDisposableArr3, i, (length - i) - 1);
                publishDisposableArr2 = publishDisposableArr3;
            }
        } while (!this.subscribers.compareAndSet(publishDisposableArr, publishDisposableArr2));
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (this.subscribers.get() == TERMINATED) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (io.reactivex.subjects.PublishSubject.PublishDisposable<T> publishDisposable : this.subscribers.get()) {
            publishDisposable.onNext(t);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        io.reactivex.subjects.PublishSubject.PublishDisposable<T>[] publishDisposableArr = this.subscribers.get();
        io.reactivex.subjects.PublishSubject.PublishDisposable<T>[] publishDisposableArr2 = TERMINATED;
        if (publishDisposableArr == publishDisposableArr2) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        for (io.reactivex.subjects.PublishSubject.PublishDisposable<T> publishDisposable : this.subscribers.getAndSet(publishDisposableArr2)) {
            publishDisposable.onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        io.reactivex.subjects.PublishSubject.PublishDisposable<T>[] publishDisposableArr = this.subscribers.get();
        io.reactivex.subjects.PublishSubject.PublishDisposable<T>[] publishDisposableArr2 = TERMINATED;
        if (publishDisposableArr == publishDisposableArr2) {
            return;
        }
        for (io.reactivex.subjects.PublishSubject.PublishDisposable<T> publishDisposable : this.subscribers.getAndSet(publishDisposableArr2)) {
            publishDisposable.onComplete();
        }
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return this.subscribers.get().length != 0;
    }

    @Override // io.reactivex.subjects.Subject
    public java.lang.Throwable getThrowable() {
        if (this.subscribers.get() == TERMINATED) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return this.subscribers.get() == TERMINATED && this.error != null;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return this.subscribers.get() == TERMINATED && this.error == null;
    }

    static final class PublishDisposable<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 3562861878281475070L;
        final io.reactivex.Observer<? super T> downstream;
        final io.reactivex.subjects.PublishSubject<T> parent;

        PublishDisposable(io.reactivex.Observer<? super T> observer, io.reactivex.subjects.PublishSubject<T> publishSubject) {
            this.downstream = observer;
            this.parent = publishSubject;
        }

        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.downstream.onNext(t);
        }

        public void onError(java.lang.Throwable th) {
            if (get()) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }

        public void onComplete() {
            if (get()) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.remove(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }
    }
}
