package io.reactivex.disposables;

/* loaded from: classes3.dex */
public final class Disposables {
    private Disposables() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static io.reactivex.disposables.Disposable fromRunnable(java.lang.Runnable runnable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(runnable, "run is null");
        return new io.reactivex.disposables.RunnableDisposable(runnable);
    }

    public static io.reactivex.disposables.Disposable fromAction(io.reactivex.functions.Action action) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(action, "run is null");
        return new io.reactivex.disposables.ActionDisposable(action);
    }

    public static io.reactivex.disposables.Disposable fromFuture(java.util.concurrent.Future<?> future) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(future, "future is null");
        return fromFuture(future, true);
    }

    public static io.reactivex.disposables.Disposable fromFuture(java.util.concurrent.Future<?> future, boolean z) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(future, "future is null");
        return new io.reactivex.disposables.FutureDisposable(future, z);
    }

    public static io.reactivex.disposables.Disposable fromSubscription(org.reactivestreams.Subscription subscription) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(subscription, "subscription is null");
        return new io.reactivex.disposables.SubscriptionDisposable(subscription);
    }

    public static io.reactivex.disposables.Disposable empty() {
        return fromRunnable(io.reactivex.internal.functions.Functions.EMPTY_RUNNABLE);
    }

    public static io.reactivex.disposables.Disposable disposed() {
        return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
    }
}
