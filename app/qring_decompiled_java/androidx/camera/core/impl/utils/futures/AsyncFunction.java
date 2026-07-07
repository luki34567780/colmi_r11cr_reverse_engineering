package androidx.camera.core.impl.utils.futures;

@java.lang.FunctionalInterface
/* loaded from: classes.dex */
public interface AsyncFunction<I, O> {
    com.google.common.util.concurrent.ListenableFuture<O> apply(I input) throws java.lang.Exception;
}
