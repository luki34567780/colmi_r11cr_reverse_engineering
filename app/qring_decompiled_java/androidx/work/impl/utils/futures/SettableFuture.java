package androidx.work.impl.utils.futures;

/* loaded from: classes.dex */
public final class SettableFuture<V> extends androidx.work.impl.utils.futures.AbstractFuture<V> {
    public static <V> androidx.work.impl.utils.futures.SettableFuture<V> create() {
        return new androidx.work.impl.utils.futures.SettableFuture<>();
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean set(V value) {
        return super.set(value);
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean setException(java.lang.Throwable throwable) {
        return super.setException(throwable);
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> future) {
        return super.setFuture(future);
    }

    private SettableFuture() {
    }
}
