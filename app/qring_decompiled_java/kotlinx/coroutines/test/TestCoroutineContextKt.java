package kotlinx.coroutines.test;

/* compiled from: TestCoroutineContext.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¨\u0006\u0007"}, d2 = {"withTestContext", "", "testContext", "Lkotlinx/coroutines/test/TestCoroutineContext;", "testBody", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestCoroutineContextKt {
    public static /* synthetic */ void withTestContext$default(kotlinx.coroutines.test.TestCoroutineContext testCoroutineContext, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            testCoroutineContext = new kotlinx.coroutines.test.TestCoroutineContext(null, 1, null);
        }
        withTestContext(testCoroutineContext, function1);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This API has been deprecated to integrate with Structured Concurrency.", replaceWith = @kotlin.ReplaceWith(expression = "testContext.runBlockingTest(testBody)", imports = {"kotlin.coroutines.test"}))
    public static final void withTestContext(kotlinx.coroutines.test.TestCoroutineContext testCoroutineContext, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.test.TestCoroutineContext, kotlin.Unit> function1) {
        function1.invoke(testCoroutineContext);
        java.util.List<java.lang.Throwable> exceptions = testCoroutineContext.getExceptions();
        boolean z = true;
        if (!(exceptions instanceof java.util.Collection) || !exceptions.isEmpty()) {
            java.util.Iterator<T> it = exceptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!(((java.lang.Throwable) it.next()) instanceof java.util.concurrent.CancellationException)) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            throw new java.lang.AssertionError(kotlin.jvm.internal.Intrinsics.stringPlus("Coroutine encountered unhandled exceptions:\n", testCoroutineContext.getExceptions()));
        }
    }
}
