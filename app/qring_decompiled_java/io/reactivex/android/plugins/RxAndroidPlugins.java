package io.reactivex.android.plugins;

/* loaded from: classes3.dex */
public final class RxAndroidPlugins {
    private static volatile io.reactivex.functions.Function<java.util.concurrent.Callable<io.reactivex.Scheduler>, io.reactivex.Scheduler> onInitMainThreadHandler;
    private static volatile io.reactivex.functions.Function<io.reactivex.Scheduler, io.reactivex.Scheduler> onMainThreadHandler;

    public static void setInitMainThreadSchedulerHandler(io.reactivex.functions.Function<java.util.concurrent.Callable<io.reactivex.Scheduler>, io.reactivex.Scheduler> function) {
        onInitMainThreadHandler = function;
    }

    public static io.reactivex.Scheduler initMainThreadScheduler(java.util.concurrent.Callable<io.reactivex.Scheduler> callable) {
        java.util.Objects.requireNonNull(callable, "scheduler == null");
        io.reactivex.functions.Function<java.util.concurrent.Callable<io.reactivex.Scheduler>, io.reactivex.Scheduler> function = onInitMainThreadHandler;
        if (function == null) {
            return callRequireNonNull(callable);
        }
        return applyRequireNonNull(function, callable);
    }

    public static void setMainThreadSchedulerHandler(io.reactivex.functions.Function<io.reactivex.Scheduler, io.reactivex.Scheduler> function) {
        onMainThreadHandler = function;
    }

    public static io.reactivex.Scheduler onMainThreadScheduler(io.reactivex.Scheduler scheduler) {
        java.util.Objects.requireNonNull(scheduler, "scheduler == null");
        io.reactivex.functions.Function<io.reactivex.Scheduler, io.reactivex.Scheduler> function = onMainThreadHandler;
        return function == null ? scheduler : (io.reactivex.Scheduler) apply(function, scheduler);
    }

    public static io.reactivex.functions.Function<java.util.concurrent.Callable<io.reactivex.Scheduler>, io.reactivex.Scheduler> getInitMainThreadSchedulerHandler() {
        return onInitMainThreadHandler;
    }

    public static io.reactivex.functions.Function<io.reactivex.Scheduler, io.reactivex.Scheduler> getOnMainThreadSchedulerHandler() {
        return onMainThreadHandler;
    }

    public static void reset() {
        setInitMainThreadSchedulerHandler(null);
        setMainThreadSchedulerHandler(null);
    }

    static io.reactivex.Scheduler callRequireNonNull(java.util.concurrent.Callable<io.reactivex.Scheduler> callable) {
        try {
            io.reactivex.Scheduler call = callable.call();
            if (call != null) {
                return call;
            }
            throw new java.lang.NullPointerException("Scheduler Callable returned null");
        } catch (java.lang.Throwable th) {
            throw io.reactivex.exceptions.Exceptions.propagate(th);
        }
    }

    static io.reactivex.Scheduler applyRequireNonNull(io.reactivex.functions.Function<java.util.concurrent.Callable<io.reactivex.Scheduler>, io.reactivex.Scheduler> function, java.util.concurrent.Callable<io.reactivex.Scheduler> callable) {
        io.reactivex.Scheduler scheduler = (io.reactivex.Scheduler) apply(function, callable);
        java.util.Objects.requireNonNull(scheduler, "Scheduler Callable returned null");
        return scheduler;
    }

    static <T, R> R apply(io.reactivex.functions.Function<T, R> function, T t) {
        try {
            return function.apply(t);
        } catch (java.lang.Throwable th) {
            throw io.reactivex.exceptions.Exceptions.propagate(th);
        }
    }

    private RxAndroidPlugins() {
        throw new java.lang.AssertionError("No instances.");
    }
}
