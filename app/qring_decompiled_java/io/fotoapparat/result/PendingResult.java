package io.fotoapparat.result;

/* compiled from: PendingResult.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001a*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001aB%\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ+\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0001\u0010\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u0002H\u000e0\u0010¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0012\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ&\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0000\"\u0004\b\u0001\u0010\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u000e0\u0010J\u001c\u0010\u0015\u001a\u00020\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00160\u0010J\u0014\u0010\u0018\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lio/fotoapparat/result/PendingResult;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "", "future", "Ljava/util/concurrent/Future;", "logger", "Lio/fotoapparat/log/Logger;", "executor", "Ljava/util/concurrent/Executor;", "(Ljava/util/concurrent/Future;Lio/fotoapparat/log/Logger;Ljava/util/concurrent/Executor;)V", "resultUnsafe", "getResultUnsafe", "()Ljava/lang/Object;", "adapt", "R", "adapter", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "await", "transform", "transformer", "whenAvailable", "", "callback", "whenDone", "Lio/fotoapparat/result/WhenDoneListener;", "Companion", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public class PendingResult<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.fotoapparat.result.PendingResult.Companion INSTANCE = new io.fotoapparat.result.PendingResult.Companion(null);
    private final java.util.concurrent.Executor executor;
    private final java.util.concurrent.Future<T> future;
    private final io.fotoapparat.log.Logger logger;

    public PendingResult(java.util.concurrent.Future<T> future, io.fotoapparat.log.Logger logger, java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(future, "future");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(logger, "logger");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(executor, "executor");
        this.future = future;
        this.logger = logger;
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T getResultUnsafe() {
        io.fotoapparat.concurrent.EnsureBgThreadKt.ensureBackgroundThread();
        return this.future.get();
    }

    public final <R> io.fotoapparat.result.PendingResult<R> transform(final kotlin.jvm.functions.Function1<? super T, ? extends R> transformer) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(transformer, "transformer");
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable<V>() { // from class: io.fotoapparat.result.PendingResult$transform$transformTask$1
            /* JADX WARN: Type inference failed for: r0v1, types: [R, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final R call() {
                java.util.concurrent.Future future;
                kotlin.jvm.functions.Function1 function1 = transformer;
                future = io.fotoapparat.result.PendingResult.this.future;
                return function1.invoke(future.get());
            }
        });
        this.executor.execute(futureTask);
        return new io.fotoapparat.result.PendingResult<>(futureTask, this.logger, this.executor);
    }

    public final T await() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return this.future.get();
    }

    public final <R> R adapt(kotlin.jvm.functions.Function1<? super java.util.concurrent.Future<T>, ? extends R> adapter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        return adapter.invoke(this.future);
    }

    public final void whenAvailable(final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(callback, "callback");
        this.executor.execute(new java.lang.Runnable() { // from class: io.fotoapparat.result.PendingResult$whenAvailable$1
            @Override // java.lang.Runnable
            public final void run() {
                io.fotoapparat.log.Logger logger;
                io.fotoapparat.log.Logger logger2;
                io.fotoapparat.log.Logger logger3;
                io.fotoapparat.log.Logger logger4;
                final java.lang.Object resultUnsafe;
                try {
                    resultUnsafe = io.fotoapparat.result.PendingResult.this.getResultUnsafe();
                    io.fotoapparat.result.PendingResultKt.notifyOnMainThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: io.fotoapparat.result.PendingResult$whenAvailable$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            invoke2();
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            callback.invoke(resultUnsafe);
                        }
                    });
                } catch (io.fotoapparat.exception.UnableToDecodeBitmapException unused) {
                    logger4 = io.fotoapparat.result.PendingResult.this.logger;
                    logger4.log("Couldn't decode bitmap from byte array");
                    io.fotoapparat.result.PendingResultKt.notifyOnMainThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: io.fotoapparat.result.PendingResult$whenAvailable$1.2
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            invoke2();
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            callback.invoke(null);
                        }
                    });
                } catch (java.lang.InterruptedException unused2) {
                    logger3 = io.fotoapparat.result.PendingResult.this.logger;
                    logger3.log("Couldn't deliver pending result: Camera stopped before delivering result.");
                } catch (java.util.concurrent.CancellationException unused3) {
                    logger2 = io.fotoapparat.result.PendingResult.this.logger;
                    logger2.log("Couldn't deliver pending result: Camera operation was cancelled.");
                } catch (java.util.concurrent.ExecutionException unused4) {
                    logger = io.fotoapparat.result.PendingResult.this.logger;
                    logger.log("Couldn't deliver pending result: Operation failed internally.");
                    io.fotoapparat.result.PendingResultKt.notifyOnMainThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: io.fotoapparat.result.PendingResult$whenAvailable$1.3
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            invoke2();
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            callback.invoke(null);
                        }
                    });
                }
            }
        });
    }

    public final void whenDone(io.fotoapparat.result.WhenDoneListener<? super T> callback) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(callback, "callback");
        whenAvailable(new io.fotoapparat.result.PendingResult$whenDone$1(callback));
    }

    /* compiled from: PendingResult.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/fotoapparat/result/PendingResult$Companion;", "", "()V", "fromFuture", "Lio/fotoapparat/result/PendingResult;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "future", "Ljava/util/concurrent/Future;", "logger", "Lio/fotoapparat/log/Logger;", "fromFuture$fotoapparat_release", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> io.fotoapparat.result.PendingResult<T> fromFuture$fotoapparat_release(java.util.concurrent.Future<T> future, io.fotoapparat.log.Logger logger) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(future, "future");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(logger, "logger");
            java.util.concurrent.ExecutorService pendingResultExecutor = io.fotoapparat.hardware.ExecutorKt.getPendingResultExecutor();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(pendingResultExecutor, "pendingResultExecutor");
            return new io.fotoapparat.result.PendingResult<>(future, logger, pendingResultExecutor);
        }
    }
}
