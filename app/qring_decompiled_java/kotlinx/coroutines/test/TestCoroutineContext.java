package kotlinx.coroutines.test;

/* compiled from: TestCoroutineContext.kt */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This API has been deprecated to integrate with Structured Concurrency.", replaceWith = @kotlin.ReplaceWith(expression = "TestCoroutineScope", imports = {"kotlin.coroutines.test"}))
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001<B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0019J$\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0 J$\u0010\"\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0 J*\u0010#\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020!0 J$\u0010$\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0 J\u0006\u0010%\u001a\u00020\u001bJ\u0014\u0010&\u001a\u00020\u001b2\n\u0010'\u001a\u00060(j\u0002`)H\u0002J5\u0010*\u001a\u0002H+\"\u0004\b\u0000\u0010+2\u0006\u0010,\u001a\u0002H+2\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002H+0.H\u0016¢\u0006\u0002\u00100J(\u00101\u001a\u0004\u0018\u0001H2\"\b\b\u0000\u00102*\u00020/2\f\u00103\u001a\b\u0012\u0004\u0012\u0002H204H\u0096\u0002¢\u0006\u0002\u00105J\u0014\u00106\u001a\u00020\u00012\n\u00103\u001a\u0006\u0012\u0002\b\u000304H\u0016J\u0010\u00107\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u001c\u00108\u001a\u00020\u00122\n\u0010'\u001a\u00060(j\u0002`)2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u00109\u001a\u00020\u0006H\u0002J\b\u0010:\u001a\u00020\u0003H\u0016J\u0006\u0010;\u001a\u00020\u001bJ\u0010\u0010;\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "name", "", "(Ljava/lang/String;)V", "counter", "", "ctxDispatcher", "Lkotlinx/coroutines/test/TestCoroutineContext$Dispatcher;", "ctxHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "exceptions", "", "", "getExceptions", "()Ljava/util/List;", "queue", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/test/TimedRunnableObsolete;", "time", "uncaughtExceptions", "", "advanceTimeBy", "delayTime", "unit", "Ljava/util/concurrent/TimeUnit;", "advanceTimeTo", "", "targetTime", "assertAllUnhandledExceptions", "message", "predicate", "Lkotlin/Function1;", "", "assertAnyUnhandledException", "assertExceptions", "assertUnhandledException", "cancelAllActions", "enqueue", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "now", "postDelayed", "processNextEvent", "toString", "triggerActions", "Dispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestCoroutineContext implements kotlin.coroutines.CoroutineContext {
    private long counter;
    private final kotlinx.coroutines.test.TestCoroutineContext.Dispatcher ctxDispatcher;
    private final kotlinx.coroutines.CoroutineExceptionHandler ctxHandler;
    private final java.lang.String name;
    private final kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.test.TimedRunnable> queue;
    private long time;
    private final java.util.List<java.lang.Throwable> uncaughtExceptions;

    /* JADX WARN: Multi-variable type inference failed */
    public TestCoroutineContext() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TestCoroutineContext(java.lang.String str) {
        this.name = str;
        this.uncaughtExceptions = new java.util.ArrayList();
        this.ctxDispatcher = new kotlinx.coroutines.test.TestCoroutineContext.Dispatcher();
        this.ctxHandler = new kotlinx.coroutines.test.TestCoroutineContext$special$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE, this);
        this.queue = new kotlinx.coroutines.internal.ThreadSafeHeap<>();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlin.coroutines.CoroutineContext.DefaultImpls.plus(this, coroutineContext);
    }

    public /* synthetic */ TestCoroutineContext(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public final java.util.List<java.lang.Throwable> getExceptions() {
        return this.uncaughtExceptions;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R initial, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> operation) {
        return operation.invoke(operation.invoke(initial, this.ctxDispatcher), this.ctxHandler);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        if (key == kotlin.coroutines.ContinuationInterceptor.INSTANCE) {
            return this.ctxDispatcher;
        }
        if (key == kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE) {
            return this.ctxHandler;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return key == kotlin.coroutines.ContinuationInterceptor.INSTANCE ? this.ctxHandler : key == kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE ? this.ctxDispatcher : this;
    }

    public static /* synthetic */ long now$default(kotlinx.coroutines.test.TestCoroutineContext testCoroutineContext, java.util.concurrent.TimeUnit timeUnit, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        }
        return testCoroutineContext.now(timeUnit);
    }

    public final long now(java.util.concurrent.TimeUnit unit) {
        return unit.convert(this.time, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static /* synthetic */ long advanceTimeBy$default(kotlinx.coroutines.test.TestCoroutineContext testCoroutineContext, long j, java.util.concurrent.TimeUnit timeUnit, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        }
        return testCoroutineContext.advanceTimeBy(j, timeUnit);
    }

    public final long advanceTimeBy(long delayTime, java.util.concurrent.TimeUnit unit) {
        long j = this.time;
        advanceTimeTo(unit.toNanos(delayTime) + j, java.util.concurrent.TimeUnit.NANOSECONDS);
        return unit.convert(this.time - j, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static /* synthetic */ void advanceTimeTo$default(kotlinx.coroutines.test.TestCoroutineContext testCoroutineContext, long j, java.util.concurrent.TimeUnit timeUnit, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        }
        testCoroutineContext.advanceTimeTo(j, timeUnit);
    }

    public final void advanceTimeTo(long targetTime, java.util.concurrent.TimeUnit unit) {
        long nanos = unit.toNanos(targetTime);
        triggerActions(nanos);
        if (nanos > this.time) {
            this.time = nanos;
        }
    }

    public final void triggerActions() {
        triggerActions(this.time);
    }

    public final void cancelAllActions() {
        if (this.queue.isEmpty()) {
            return;
        }
        this.queue.clear();
    }

    public static /* synthetic */ void assertUnhandledException$default(kotlinx.coroutines.test.TestCoroutineContext testCoroutineContext, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        testCoroutineContext.assertUnhandledException(str, function1);
    }

    public final void assertUnhandledException(java.lang.String message, kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> predicate) {
        if (this.uncaughtExceptions.size() != 1 || !predicate.invoke(this.uncaughtExceptions.get(0)).booleanValue()) {
            throw new java.lang.AssertionError(message);
        }
        this.uncaughtExceptions.clear();
    }

    public static /* synthetic */ void assertAllUnhandledExceptions$default(kotlinx.coroutines.test.TestCoroutineContext testCoroutineContext, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        testCoroutineContext.assertAllUnhandledExceptions(str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void assertAllUnhandledExceptions(java.lang.String message, kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> predicate) {
        java.util.List<java.lang.Throwable> list = this.uncaughtExceptions;
        boolean z = true;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!predicate.invoke(it.next()).booleanValue()) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            throw new java.lang.AssertionError(message);
        }
        this.uncaughtExceptions.clear();
    }

    public static /* synthetic */ void assertAnyUnhandledException$default(kotlinx.coroutines.test.TestCoroutineContext testCoroutineContext, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        testCoroutineContext.assertAnyUnhandledException(str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void assertAnyUnhandledException(java.lang.String message, kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> predicate) {
        java.util.List<java.lang.Throwable> list = this.uncaughtExceptions;
        boolean z = false;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (predicate.invoke(it.next()).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            throw new java.lang.AssertionError(message);
        }
        this.uncaughtExceptions.clear();
    }

    public static /* synthetic */ void assertExceptions$default(kotlinx.coroutines.test.TestCoroutineContext testCoroutineContext, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        testCoroutineContext.assertExceptions(str, function1);
    }

    public final void assertExceptions(java.lang.String message, kotlin.jvm.functions.Function1<? super java.util.List<? extends java.lang.Throwable>, java.lang.Boolean> predicate) {
        if (!predicate.invoke(this.uncaughtExceptions).booleanValue()) {
            throw new java.lang.AssertionError(message);
        }
        this.uncaughtExceptions.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueue(java.lang.Runnable block) {
        kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.test.TimedRunnable> threadSafeHeap = this.queue;
        long j = this.counter;
        this.counter = 1 + j;
        threadSafeHeap.addLast(new kotlinx.coroutines.test.TimedRunnable(block, j, 0L, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.test.TimedRunnable postDelayed(java.lang.Runnable block, long delayTime) {
        long j = this.counter;
        this.counter = 1 + j;
        kotlinx.coroutines.test.TimedRunnable timedRunnable = new kotlinx.coroutines.test.TimedRunnable(block, j, this.time + java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(delayTime));
        this.queue.addLast(timedRunnable);
        return timedRunnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long processNextEvent() {
        kotlinx.coroutines.test.TimedRunnable peek = this.queue.peek();
        if (peek != null) {
            triggerActions(peek.time);
        }
        return this.queue.isEmpty() ? Long.MAX_VALUE : 0L;
    }

    private final void triggerActions(long targetTime) {
        kotlinx.coroutines.test.TimedRunnable timedRunnable;
        while (true) {
            kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.test.TimedRunnable> threadSafeHeap = this.queue;
            synchronized (threadSafeHeap) {
                kotlinx.coroutines.test.TimedRunnable firstImpl = threadSafeHeap.firstImpl();
                timedRunnable = null;
                if (firstImpl != null) {
                    if (firstImpl.time <= targetTime) {
                        timedRunnable = threadSafeHeap.removeAtImpl(0);
                    }
                }
            }
            kotlinx.coroutines.test.TimedRunnable timedRunnable2 = timedRunnable;
            if (timedRunnable2 == null) {
                return;
            }
            if (timedRunnable2.time != 0) {
                this.time = timedRunnable2.time;
            }
            timedRunnable2.run();
        }
    }

    public java.lang.String toString() {
        java.lang.String str = this.name;
        return str == null ? kotlin.jvm.internal.Intrinsics.stringPlus("TestCoroutineContext@", kotlinx.coroutines.DebugStringsKt.getHexAddress(this)) : str;
    }

    /* compiled from: TestCoroutineContext.kt */
    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u001e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineContext$Dispatcher;", "Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/Delay;", "(Lkotlinx/coroutines/test/TestCoroutineContext;)V", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "processNextEvent", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "shouldBeProcessedFromContext", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private final class Dispatcher extends kotlinx.coroutines.EventLoop implements kotlinx.coroutines.Delay {
        @Override // kotlinx.coroutines.EventLoop
        public boolean shouldBeProcessedFromContext() {
            return true;
        }

        public Dispatcher() {
            kotlinx.coroutines.EventLoop.incrementUseCount$default(this, false, 1, null);
        }

        @Override // kotlinx.coroutines.Delay
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        public java.lang.Object delay(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return kotlinx.coroutines.Delay.DefaultImpls.delay(this, j, continuation);
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        /* renamed from: dispatch */
        public void mo2574dispatch(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
            kotlinx.coroutines.test.TestCoroutineContext.this.enqueue(block);
        }

        @Override // kotlinx.coroutines.Delay
        /* renamed from: scheduleResumeAfterDelay */
        public void mo2575scheduleResumeAfterDelay(long timeMillis, final kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> continuation) {
            kotlinx.coroutines.test.TestCoroutineContext.this.postDelayed(new java.lang.Runnable() { // from class: kotlinx.coroutines.test.TestCoroutineContext$Dispatcher$scheduleResumeAfterDelay$$inlined$Runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    kotlinx.coroutines.CancellableContinuation.this.resumeUndispatched(this, kotlin.Unit.INSTANCE);
                }
            }, timeMillis);
        }

        @Override // kotlinx.coroutines.Delay
        public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long timeMillis, java.lang.Runnable block, kotlin.coroutines.CoroutineContext context) {
            final kotlinx.coroutines.test.TimedRunnable postDelayed = kotlinx.coroutines.test.TestCoroutineContext.this.postDelayed(block, timeMillis);
            final kotlinx.coroutines.test.TestCoroutineContext testCoroutineContext = kotlinx.coroutines.test.TestCoroutineContext.this;
            return new kotlinx.coroutines.DisposableHandle() { // from class: kotlinx.coroutines.test.TestCoroutineContext$Dispatcher$invokeOnTimeout$1
                @Override // kotlinx.coroutines.DisposableHandle
                public void dispose() {
                    kotlinx.coroutines.internal.ThreadSafeHeap threadSafeHeap;
                    threadSafeHeap = kotlinx.coroutines.test.TestCoroutineContext.this.queue;
                    threadSafeHeap.remove(postDelayed);
                }
            };
        }

        @Override // kotlinx.coroutines.EventLoop
        public long processNextEvent() {
            return kotlinx.coroutines.test.TestCoroutineContext.this.processNextEvent();
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        public java.lang.String toString() {
            return "Dispatcher(" + kotlinx.coroutines.test.TestCoroutineContext.this + ')';
        }
    }
}
