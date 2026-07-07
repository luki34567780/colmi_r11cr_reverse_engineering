package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class BlockingObservableMostRecent<T> implements java.lang.Iterable<T> {
    final T initialValue;
    final io.reactivex.ObservableSource<T> source;

    public BlockingObservableMostRecent(io.reactivex.ObservableSource<T> observableSource, T t) {
        this.source = observableSource;
        this.initialValue = t;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        io.reactivex.internal.operators.observable.BlockingObservableMostRecent.MostRecentObserver mostRecentObserver = new io.reactivex.internal.operators.observable.BlockingObservableMostRecent.MostRecentObserver(this.initialValue);
        this.source.subscribe(mostRecentObserver);
        return mostRecentObserver.getIterable();
    }

    static final class MostRecentObserver<T> extends io.reactivex.observers.DefaultObserver<T> {
        volatile java.lang.Object value;

        MostRecentObserver(T t) {
            this.value = io.reactivex.internal.util.NotificationLite.next(t);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.value = io.reactivex.internal.util.NotificationLite.complete();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.value = io.reactivex.internal.util.NotificationLite.error(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.value = io.reactivex.internal.util.NotificationLite.next(t);
        }

        public io.reactivex.internal.operators.observable.BlockingObservableMostRecent.MostRecentObserver<T>.Iterator getIterable() {
            return new io.reactivex.internal.operators.observable.BlockingObservableMostRecent.MostRecentObserver.Iterator();
        }

        final class Iterator implements java.util.Iterator<T> {
            private java.lang.Object buf;

            Iterator() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                this.buf = io.reactivex.internal.operators.observable.BlockingObservableMostRecent.MostRecentObserver.this.value;
                return !io.reactivex.internal.util.NotificationLite.isComplete(r0);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.buf == null) {
                        this.buf = io.reactivex.internal.operators.observable.BlockingObservableMostRecent.MostRecentObserver.this.value;
                    }
                    if (io.reactivex.internal.util.NotificationLite.isComplete(this.buf)) {
                        throw new java.util.NoSuchElementException();
                    }
                    if (io.reactivex.internal.util.NotificationLite.isError(this.buf)) {
                        throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(io.reactivex.internal.util.NotificationLite.getError(this.buf));
                    }
                    return (T) io.reactivex.internal.util.NotificationLite.getValue(this.buf);
                } finally {
                    this.buf = null;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new java.lang.UnsupportedOperationException("Read only iterator");
            }
        }
    }
}
