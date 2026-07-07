package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeIsEmpty<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, java.lang.Boolean> {
    public MaybeIsEmpty(io.reactivex.MaybeSource<T> maybeSource) {
        super(maybeSource);
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super java.lang.Boolean> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeIsEmpty.IsEmptyMaybeObserver(maybeObserver));
    }

    static final class IsEmptyMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super java.lang.Boolean> downstream;
        io.reactivex.disposables.Disposable upstream;

        IsEmptyMaybeObserver(io.reactivex.MaybeObserver<? super java.lang.Boolean> maybeObserver) {
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.downstream.onSuccess(false);
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onSuccess(true);
        }
    }
}
