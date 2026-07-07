package io.reactivex.plugins;

/* loaded from: classes3.dex */
public final class RxJavaPlugins {
    static volatile io.reactivex.functions.Consumer<? super java.lang.Throwable> errorHandler;
    static volatile boolean failNonBlockingScheduler;
    static volatile boolean lockdown;
    static volatile io.reactivex.functions.BooleanSupplier onBeforeBlocking;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Completable, ? extends io.reactivex.Completable> onCompletableAssembly;
    static volatile io.reactivex.functions.BiFunction<? super io.reactivex.Completable, ? super io.reactivex.CompletableObserver, ? extends io.reactivex.CompletableObserver> onCompletableSubscribe;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> onComputationHandler;
    static volatile io.reactivex.functions.Function<? super io.reactivex.flowables.ConnectableFlowable, ? extends io.reactivex.flowables.ConnectableFlowable> onConnectableFlowableAssembly;
    static volatile io.reactivex.functions.Function<? super io.reactivex.observables.ConnectableObservable, ? extends io.reactivex.observables.ConnectableObservable> onConnectableObservableAssembly;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Flowable, ? extends io.reactivex.Flowable> onFlowableAssembly;
    static volatile io.reactivex.functions.BiFunction<? super io.reactivex.Flowable, ? super org.reactivestreams.Subscriber, ? extends org.reactivestreams.Subscriber> onFlowableSubscribe;
    static volatile io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> onInitComputationHandler;
    static volatile io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> onInitIoHandler;
    static volatile io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> onInitNewThreadHandler;
    static volatile io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> onInitSingleHandler;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> onIoHandler;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Maybe, ? extends io.reactivex.Maybe> onMaybeAssembly;
    static volatile io.reactivex.functions.BiFunction<? super io.reactivex.Maybe, ? super io.reactivex.MaybeObserver, ? extends io.reactivex.MaybeObserver> onMaybeSubscribe;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> onNewThreadHandler;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Observable, ? extends io.reactivex.Observable> onObservableAssembly;
    static volatile io.reactivex.functions.BiFunction<? super io.reactivex.Observable, ? super io.reactivex.Observer, ? extends io.reactivex.Observer> onObservableSubscribe;
    static volatile io.reactivex.functions.Function<? super io.reactivex.parallel.ParallelFlowable, ? extends io.reactivex.parallel.ParallelFlowable> onParallelAssembly;
    static volatile io.reactivex.functions.Function<? super java.lang.Runnable, ? extends java.lang.Runnable> onScheduleHandler;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Single, ? extends io.reactivex.Single> onSingleAssembly;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> onSingleHandler;
    static volatile io.reactivex.functions.BiFunction<? super io.reactivex.Single, ? super io.reactivex.SingleObserver, ? extends io.reactivex.SingleObserver> onSingleSubscribe;

    public static void lockdown() {
        lockdown = true;
    }

    public static boolean isLockdown() {
        return lockdown;
    }

    public static void setFailOnNonBlockingScheduler(boolean z) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        failNonBlockingScheduler = z;
    }

    public static boolean isFailOnNonBlockingScheduler() {
        return failNonBlockingScheduler;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> getComputationSchedulerHandler() {
        return onComputationHandler;
    }

    public static io.reactivex.functions.Consumer<? super java.lang.Throwable> getErrorHandler() {
        return errorHandler;
    }

    public static io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> getInitComputationSchedulerHandler() {
        return onInitComputationHandler;
    }

    public static io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> getInitIoSchedulerHandler() {
        return onInitIoHandler;
    }

    public static io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> getInitNewThreadSchedulerHandler() {
        return onInitNewThreadHandler;
    }

    public static io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> getInitSingleSchedulerHandler() {
        return onInitSingleHandler;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> getIoSchedulerHandler() {
        return onIoHandler;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> getNewThreadSchedulerHandler() {
        return onNewThreadHandler;
    }

    public static io.reactivex.functions.Function<? super java.lang.Runnable, ? extends java.lang.Runnable> getScheduleHandler() {
        return onScheduleHandler;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> getSingleSchedulerHandler() {
        return onSingleHandler;
    }

    public static io.reactivex.Scheduler initComputationScheduler(java.util.concurrent.Callable<io.reactivex.Scheduler> callable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(callable, "Scheduler Callable can't be null");
        io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> function = onInitComputationHandler;
        if (function == null) {
            return callRequireNonNull(callable);
        }
        return applyRequireNonNull(function, callable);
    }

    public static io.reactivex.Scheduler initIoScheduler(java.util.concurrent.Callable<io.reactivex.Scheduler> callable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(callable, "Scheduler Callable can't be null");
        io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> function = onInitIoHandler;
        if (function == null) {
            return callRequireNonNull(callable);
        }
        return applyRequireNonNull(function, callable);
    }

    public static io.reactivex.Scheduler initNewThreadScheduler(java.util.concurrent.Callable<io.reactivex.Scheduler> callable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(callable, "Scheduler Callable can't be null");
        io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> function = onInitNewThreadHandler;
        if (function == null) {
            return callRequireNonNull(callable);
        }
        return applyRequireNonNull(function, callable);
    }

    public static io.reactivex.Scheduler initSingleScheduler(java.util.concurrent.Callable<io.reactivex.Scheduler> callable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(callable, "Scheduler Callable can't be null");
        io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> function = onInitSingleHandler;
        if (function == null) {
            return callRequireNonNull(callable);
        }
        return applyRequireNonNull(function, callable);
    }

    public static io.reactivex.Scheduler onComputationScheduler(io.reactivex.Scheduler scheduler) {
        io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> function = onComputationHandler;
        return function == null ? scheduler : (io.reactivex.Scheduler) apply(function, scheduler);
    }

    public static void onError(java.lang.Throwable th) {
        io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer = errorHandler;
        if (th == null) {
            th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!isBug(th)) {
            th = new io.reactivex.exceptions.UndeliverableException(th);
        }
        if (consumer != null) {
            try {
                consumer.accept(th);
                return;
            } catch (java.lang.Throwable th2) {
                th2.printStackTrace();
                uncaught(th2);
            }
        }
        th.printStackTrace();
        uncaught(th);
    }

    static boolean isBug(java.lang.Throwable th) {
        return (th instanceof io.reactivex.exceptions.OnErrorNotImplementedException) || (th instanceof io.reactivex.exceptions.MissingBackpressureException) || (th instanceof java.lang.IllegalStateException) || (th instanceof java.lang.NullPointerException) || (th instanceof java.lang.IllegalArgumentException) || (th instanceof io.reactivex.exceptions.CompositeException);
    }

    static void uncaught(java.lang.Throwable th) {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static io.reactivex.Scheduler onIoScheduler(io.reactivex.Scheduler scheduler) {
        io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> function = onIoHandler;
        return function == null ? scheduler : (io.reactivex.Scheduler) apply(function, scheduler);
    }

    public static io.reactivex.Scheduler onNewThreadScheduler(io.reactivex.Scheduler scheduler) {
        io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> function = onNewThreadHandler;
        return function == null ? scheduler : (io.reactivex.Scheduler) apply(function, scheduler);
    }

    public static java.lang.Runnable onSchedule(java.lang.Runnable runnable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(runnable, "run is null");
        io.reactivex.functions.Function<? super java.lang.Runnable, ? extends java.lang.Runnable> function = onScheduleHandler;
        return function == null ? runnable : (java.lang.Runnable) apply(function, runnable);
    }

    public static io.reactivex.Scheduler onSingleScheduler(io.reactivex.Scheduler scheduler) {
        io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> function = onSingleHandler;
        return function == null ? scheduler : (io.reactivex.Scheduler) apply(function, scheduler);
    }

    public static void reset() {
        setErrorHandler(null);
        setScheduleHandler(null);
        setComputationSchedulerHandler(null);
        setInitComputationSchedulerHandler(null);
        setIoSchedulerHandler(null);
        setInitIoSchedulerHandler(null);
        setSingleSchedulerHandler(null);
        setInitSingleSchedulerHandler(null);
        setNewThreadSchedulerHandler(null);
        setInitNewThreadSchedulerHandler(null);
        setOnFlowableAssembly(null);
        setOnFlowableSubscribe(null);
        setOnObservableAssembly(null);
        setOnObservableSubscribe(null);
        setOnSingleAssembly(null);
        setOnSingleSubscribe(null);
        setOnCompletableAssembly(null);
        setOnCompletableSubscribe(null);
        setOnConnectableFlowableAssembly(null);
        setOnConnectableObservableAssembly(null);
        setOnMaybeAssembly(null);
        setOnMaybeSubscribe(null);
        setOnParallelAssembly(null);
        setFailOnNonBlockingScheduler(false);
        setOnBeforeBlocking(null);
    }

    public static void setComputationSchedulerHandler(io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> function) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onComputationHandler = function;
    }

    public static void setErrorHandler(io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        errorHandler = consumer;
    }

    public static void setInitComputationSchedulerHandler(io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> function) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onInitComputationHandler = function;
    }

    public static void setInitIoSchedulerHandler(io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> function) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onInitIoHandler = function;
    }

    public static void setInitNewThreadSchedulerHandler(io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> function) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onInitNewThreadHandler = function;
    }

    public static void setInitSingleSchedulerHandler(io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> function) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onInitSingleHandler = function;
    }

    public static void setIoSchedulerHandler(io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> function) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onIoHandler = function;
    }

    public static void setNewThreadSchedulerHandler(io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> function) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onNewThreadHandler = function;
    }

    public static void setScheduleHandler(io.reactivex.functions.Function<? super java.lang.Runnable, ? extends java.lang.Runnable> function) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onScheduleHandler = function;
    }

    public static void setSingleSchedulerHandler(io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> function) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onSingleHandler = function;
    }

    static void unlock() {
        lockdown = false;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Completable, ? extends io.reactivex.Completable> getOnCompletableAssembly() {
        return onCompletableAssembly;
    }

    public static io.reactivex.functions.BiFunction<? super io.reactivex.Completable, ? super io.reactivex.CompletableObserver, ? extends io.reactivex.CompletableObserver> getOnCompletableSubscribe() {
        return onCompletableSubscribe;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Flowable, ? extends io.reactivex.Flowable> getOnFlowableAssembly() {
        return onFlowableAssembly;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.flowables.ConnectableFlowable, ? extends io.reactivex.flowables.ConnectableFlowable> getOnConnectableFlowableAssembly() {
        return onConnectableFlowableAssembly;
    }

    public static io.reactivex.functions.BiFunction<? super io.reactivex.Flowable, ? super org.reactivestreams.Subscriber, ? extends org.reactivestreams.Subscriber> getOnFlowableSubscribe() {
        return onFlowableSubscribe;
    }

    public static io.reactivex.functions.BiFunction<? super io.reactivex.Maybe, ? super io.reactivex.MaybeObserver, ? extends io.reactivex.MaybeObserver> getOnMaybeSubscribe() {
        return onMaybeSubscribe;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Maybe, ? extends io.reactivex.Maybe> getOnMaybeAssembly() {
        return onMaybeAssembly;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Single, ? extends io.reactivex.Single> getOnSingleAssembly() {
        return onSingleAssembly;
    }

    public static io.reactivex.functions.BiFunction<? super io.reactivex.Single, ? super io.reactivex.SingleObserver, ? extends io.reactivex.SingleObserver> getOnSingleSubscribe() {
        return onSingleSubscribe;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Observable, ? extends io.reactivex.Observable> getOnObservableAssembly() {
        return onObservableAssembly;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.observables.ConnectableObservable, ? extends io.reactivex.observables.ConnectableObservable> getOnConnectableObservableAssembly() {
        return onConnectableObservableAssembly;
    }

    public static io.reactivex.functions.BiFunction<? super io.reactivex.Observable, ? super io.reactivex.Observer, ? extends io.reactivex.Observer> getOnObservableSubscribe() {
        return onObservableSubscribe;
    }

    public static void setOnCompletableAssembly(io.reactivex.functions.Function<? super io.reactivex.Completable, ? extends io.reactivex.Completable> function) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onCompletableAssembly = function;
    }

    public static void setOnCompletableSubscribe(io.reactivex.functions.BiFunction<? super io.reactivex.Completable, ? super io.reactivex.CompletableObserver, ? extends io.reactivex.CompletableObserver> biFunction) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onCompletableSubscribe = biFunction;
    }

    public static void setOnFlowableAssembly(io.reactivex.functions.Function<? super io.reactivex.Flowable, ? extends io.reactivex.Flowable> function) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onFlowableAssembly = function;
    }

    public static void setOnMaybeAssembly(io.reactivex.functions.Function<? super io.reactivex.Maybe, ? extends io.reactivex.Maybe> function) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onMaybeAssembly = function;
    }

    public static void setOnConnectableFlowableAssembly(io.reactivex.functions.Function<? super io.reactivex.flowables.ConnectableFlowable, ? extends io.reactivex.flowables.ConnectableFlowable> function) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onConnectableFlowableAssembly = function;
    }

    public static void setOnFlowableSubscribe(io.reactivex.functions.BiFunction<? super io.reactivex.Flowable, ? super org.reactivestreams.Subscriber, ? extends org.reactivestreams.Subscriber> biFunction) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onFlowableSubscribe = biFunction;
    }

    public static void setOnMaybeSubscribe(io.reactivex.functions.BiFunction<? super io.reactivex.Maybe, io.reactivex.MaybeObserver, ? extends io.reactivex.MaybeObserver> biFunction) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onMaybeSubscribe = biFunction;
    }

    public static void setOnObservableAssembly(io.reactivex.functions.Function<? super io.reactivex.Observable, ? extends io.reactivex.Observable> function) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onObservableAssembly = function;
    }

    public static void setOnConnectableObservableAssembly(io.reactivex.functions.Function<? super io.reactivex.observables.ConnectableObservable, ? extends io.reactivex.observables.ConnectableObservable> function) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onConnectableObservableAssembly = function;
    }

    public static void setOnObservableSubscribe(io.reactivex.functions.BiFunction<? super io.reactivex.Observable, ? super io.reactivex.Observer, ? extends io.reactivex.Observer> biFunction) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onObservableSubscribe = biFunction;
    }

    public static void setOnSingleAssembly(io.reactivex.functions.Function<? super io.reactivex.Single, ? extends io.reactivex.Single> function) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onSingleAssembly = function;
    }

    public static void setOnSingleSubscribe(io.reactivex.functions.BiFunction<? super io.reactivex.Single, ? super io.reactivex.SingleObserver, ? extends io.reactivex.SingleObserver> biFunction) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onSingleSubscribe = biFunction;
    }

    public static <T> org.reactivestreams.Subscriber<? super T> onSubscribe(io.reactivex.Flowable<T> flowable, org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.functions.BiFunction<? super io.reactivex.Flowable, ? super org.reactivestreams.Subscriber, ? extends org.reactivestreams.Subscriber> biFunction = onFlowableSubscribe;
        return biFunction != null ? (org.reactivestreams.Subscriber) apply(biFunction, flowable, subscriber) : subscriber;
    }

    public static <T> io.reactivex.Observer<? super T> onSubscribe(io.reactivex.Observable<T> observable, io.reactivex.Observer<? super T> observer) {
        io.reactivex.functions.BiFunction<? super io.reactivex.Observable, ? super io.reactivex.Observer, ? extends io.reactivex.Observer> biFunction = onObservableSubscribe;
        return biFunction != null ? (io.reactivex.Observer) apply(biFunction, observable, observer) : observer;
    }

    public static <T> io.reactivex.SingleObserver<? super T> onSubscribe(io.reactivex.Single<T> single, io.reactivex.SingleObserver<? super T> singleObserver) {
        io.reactivex.functions.BiFunction<? super io.reactivex.Single, ? super io.reactivex.SingleObserver, ? extends io.reactivex.SingleObserver> biFunction = onSingleSubscribe;
        return biFunction != null ? (io.reactivex.SingleObserver) apply(biFunction, single, singleObserver) : singleObserver;
    }

    public static io.reactivex.CompletableObserver onSubscribe(io.reactivex.Completable completable, io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.functions.BiFunction<? super io.reactivex.Completable, ? super io.reactivex.CompletableObserver, ? extends io.reactivex.CompletableObserver> biFunction = onCompletableSubscribe;
        return biFunction != null ? (io.reactivex.CompletableObserver) apply(biFunction, completable, completableObserver) : completableObserver;
    }

    public static <T> io.reactivex.MaybeObserver<? super T> onSubscribe(io.reactivex.Maybe<T> maybe, io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.functions.BiFunction<? super io.reactivex.Maybe, ? super io.reactivex.MaybeObserver, ? extends io.reactivex.MaybeObserver> biFunction = onMaybeSubscribe;
        return biFunction != null ? (io.reactivex.MaybeObserver) apply(biFunction, maybe, maybeObserver) : maybeObserver;
    }

    public static <T> io.reactivex.Maybe<T> onAssembly(io.reactivex.Maybe<T> maybe) {
        io.reactivex.functions.Function<? super io.reactivex.Maybe, ? extends io.reactivex.Maybe> function = onMaybeAssembly;
        return function != null ? (io.reactivex.Maybe) apply(function, maybe) : maybe;
    }

    public static <T> io.reactivex.Flowable<T> onAssembly(io.reactivex.Flowable<T> flowable) {
        io.reactivex.functions.Function<? super io.reactivex.Flowable, ? extends io.reactivex.Flowable> function = onFlowableAssembly;
        return function != null ? (io.reactivex.Flowable) apply(function, flowable) : flowable;
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> onAssembly(io.reactivex.flowables.ConnectableFlowable<T> connectableFlowable) {
        io.reactivex.functions.Function<? super io.reactivex.flowables.ConnectableFlowable, ? extends io.reactivex.flowables.ConnectableFlowable> function = onConnectableFlowableAssembly;
        return function != null ? (io.reactivex.flowables.ConnectableFlowable) apply(function, connectableFlowable) : connectableFlowable;
    }

    public static <T> io.reactivex.Observable<T> onAssembly(io.reactivex.Observable<T> observable) {
        io.reactivex.functions.Function<? super io.reactivex.Observable, ? extends io.reactivex.Observable> function = onObservableAssembly;
        return function != null ? (io.reactivex.Observable) apply(function, observable) : observable;
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> onAssembly(io.reactivex.observables.ConnectableObservable<T> connectableObservable) {
        io.reactivex.functions.Function<? super io.reactivex.observables.ConnectableObservable, ? extends io.reactivex.observables.ConnectableObservable> function = onConnectableObservableAssembly;
        return function != null ? (io.reactivex.observables.ConnectableObservable) apply(function, connectableObservable) : connectableObservable;
    }

    public static <T> io.reactivex.Single<T> onAssembly(io.reactivex.Single<T> single) {
        io.reactivex.functions.Function<? super io.reactivex.Single, ? extends io.reactivex.Single> function = onSingleAssembly;
        return function != null ? (io.reactivex.Single) apply(function, single) : single;
    }

    public static io.reactivex.Completable onAssembly(io.reactivex.Completable completable) {
        io.reactivex.functions.Function<? super io.reactivex.Completable, ? extends io.reactivex.Completable> function = onCompletableAssembly;
        return function != null ? (io.reactivex.Completable) apply(function, completable) : completable;
    }

    public static void setOnParallelAssembly(io.reactivex.functions.Function<? super io.reactivex.parallel.ParallelFlowable, ? extends io.reactivex.parallel.ParallelFlowable> function) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onParallelAssembly = function;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.parallel.ParallelFlowable, ? extends io.reactivex.parallel.ParallelFlowable> getOnParallelAssembly() {
        return onParallelAssembly;
    }

    public static <T> io.reactivex.parallel.ParallelFlowable<T> onAssembly(io.reactivex.parallel.ParallelFlowable<T> parallelFlowable) {
        io.reactivex.functions.Function<? super io.reactivex.parallel.ParallelFlowable, ? extends io.reactivex.parallel.ParallelFlowable> function = onParallelAssembly;
        return function != null ? (io.reactivex.parallel.ParallelFlowable) apply(function, parallelFlowable) : parallelFlowable;
    }

    public static boolean onBeforeBlocking() {
        io.reactivex.functions.BooleanSupplier booleanSupplier = onBeforeBlocking;
        if (booleanSupplier == null) {
            return false;
        }
        try {
            return booleanSupplier.getAsBoolean();
        } catch (java.lang.Throwable th) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    public static void setOnBeforeBlocking(io.reactivex.functions.BooleanSupplier booleanSupplier) {
        if (lockdown) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        onBeforeBlocking = booleanSupplier;
    }

    public static io.reactivex.functions.BooleanSupplier getOnBeforeBlocking() {
        return onBeforeBlocking;
    }

    public static io.reactivex.Scheduler createComputationScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        return new io.reactivex.internal.schedulers.ComputationScheduler((java.util.concurrent.ThreadFactory) io.reactivex.internal.functions.ObjectHelper.requireNonNull(threadFactory, "threadFactory is null"));
    }

    public static io.reactivex.Scheduler createIoScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        return new io.reactivex.internal.schedulers.IoScheduler((java.util.concurrent.ThreadFactory) io.reactivex.internal.functions.ObjectHelper.requireNonNull(threadFactory, "threadFactory is null"));
    }

    public static io.reactivex.Scheduler createNewThreadScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        return new io.reactivex.internal.schedulers.NewThreadScheduler((java.util.concurrent.ThreadFactory) io.reactivex.internal.functions.ObjectHelper.requireNonNull(threadFactory, "threadFactory is null"));
    }

    public static io.reactivex.Scheduler createSingleScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        return new io.reactivex.internal.schedulers.SingleScheduler((java.util.concurrent.ThreadFactory) io.reactivex.internal.functions.ObjectHelper.requireNonNull(threadFactory, "threadFactory is null"));
    }

    static <T, R> R apply(io.reactivex.functions.Function<T, R> function, T t) {
        try {
            return function.apply(t);
        } catch (java.lang.Throwable th) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    static <T, U, R> R apply(io.reactivex.functions.BiFunction<T, U, R> biFunction, T t, U u) {
        try {
            return biFunction.apply(t, u);
        } catch (java.lang.Throwable th) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    static io.reactivex.Scheduler callRequireNonNull(java.util.concurrent.Callable<io.reactivex.Scheduler> callable) {
        try {
            return (io.reactivex.Scheduler) io.reactivex.internal.functions.ObjectHelper.requireNonNull(callable.call(), "Scheduler Callable result can't be null");
        } catch (java.lang.Throwable th) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    static io.reactivex.Scheduler applyRequireNonNull(io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> function, java.util.concurrent.Callable<io.reactivex.Scheduler> callable) {
        return (io.reactivex.Scheduler) io.reactivex.internal.functions.ObjectHelper.requireNonNull(apply(function, callable), "Scheduler Callable result can't be null");
    }

    private RxJavaPlugins() {
        throw new java.lang.IllegalStateException("No instances!");
    }
}
