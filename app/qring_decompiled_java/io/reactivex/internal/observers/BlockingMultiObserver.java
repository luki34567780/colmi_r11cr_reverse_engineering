package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public final class BlockingMultiObserver<T> extends java.util.concurrent.CountDownLatch implements io.reactivex.SingleObserver<T>, io.reactivex.CompletableObserver, io.reactivex.MaybeObserver<T> {
    volatile boolean cancelled;
    java.lang.Throwable error;
    io.reactivex.disposables.Disposable upstream;
    T value;

    public BlockingMultiObserver() {
        super(1);
    }

    void dispose() {
        this.cancelled = true;
        io.reactivex.disposables.Disposable disposable = this.upstream;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        this.upstream = disposable;
        if (this.cancelled) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        this.value = t;
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public void onError(java.lang.Throwable th) {
        this.error = th;
        countDown();
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        countDown();
    }

    public T blockingGet() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                await();
            } catch (java.lang.InterruptedException e) {
                dispose();
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
            }
        }
        java.lang.Throwable th = this.error;
        if (th != null) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
        return this.value;
    }

    public T blockingGet(T t) {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                await();
            } catch (java.lang.InterruptedException e) {
                dispose();
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
            }
        }
        java.lang.Throwable th = this.error;
        if (th != null) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
        T t2 = this.value;
        return t2 != null ? t2 : t;
    }

    public java.lang.Throwable blockingGetError() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                await();
            } catch (java.lang.InterruptedException e) {
                dispose();
                return e;
            }
        }
        return this.error;
    }

    public java.lang.Throwable blockingGetError(long j, java.util.concurrent.TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                if (!await(j, timeUnit)) {
                    dispose();
                    throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(new java.util.concurrent.TimeoutException(io.reactivex.internal.util.ExceptionHelper.timeoutMessage(j, timeUnit)));
                }
            } catch (java.lang.InterruptedException e) {
                dispose();
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
            }
        }
        return this.error;
    }

    public boolean blockingAwait(long j, java.util.concurrent.TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                if (!await(j, timeUnit)) {
                    dispose();
                    return false;
                }
            } catch (java.lang.InterruptedException e) {
                dispose();
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
            }
        }
        java.lang.Throwable th = this.error;
        if (th == null) {
            return true;
        }
        throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
    }
}
