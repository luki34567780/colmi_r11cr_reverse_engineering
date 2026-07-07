package com.chad.library.adapter.base.diff;

/* compiled from: BrvahAsyncDifferConfig.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000eB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "T", "", "mainThreadExecutor", "Ljava/util/concurrent/Executor;", "backgroundThreadExecutor", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "getBackgroundThreadExecutor", "()Ljava/util/concurrent/Executor;", "getDiffCallback", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getMainThreadExecutor", "Builder", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BrvahAsyncDifferConfig<T> {
    private final java.util.concurrent.Executor backgroundThreadExecutor;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffCallback;
    private final java.util.concurrent.Executor mainThreadExecutor;

    public BrvahAsyncDifferConfig(java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor2, "backgroundThreadExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemCallback, "diffCallback");
        this.mainThreadExecutor = executor;
        this.backgroundThreadExecutor = executor2;
        this.diffCallback = itemCallback;
    }

    public final java.util.concurrent.Executor getMainThreadExecutor() {
        return this.mainThreadExecutor;
    }

    public final java.util.concurrent.Executor getBackgroundThreadExecutor() {
        return this.backgroundThreadExecutor;
    }

    public final androidx.recyclerview.widget.DiffUtil.ItemCallback<T> getDiffCallback() {
        return this.diffCallback;
    }

    /* compiled from: BrvahAsyncDifferConfig.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0001\u000eB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0007J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig$Builder;", "T", "", "mDiffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "mBackgroundThreadExecutor", "Ljava/util/concurrent/Executor;", "mMainThreadExecutor", "build", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "setBackgroundThreadExecutor", "executor", "setMainThreadExecutor", "Companion", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder<T> {
        private static java.util.concurrent.Executor sDiffExecutor;
        private java.util.concurrent.Executor mBackgroundThreadExecutor;
        private final androidx.recyclerview.widget.DiffUtil.ItemCallback<T> mDiffCallback;
        private java.util.concurrent.Executor mMainThreadExecutor;
        private static final java.lang.Object sExecutorLock = new java.lang.Object();

        public Builder(androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemCallback, "mDiffCallback");
            this.mDiffCallback = itemCallback;
        }

        public final com.chad.library.adapter.base.diff.BrvahAsyncDifferConfig.Builder<T> setMainThreadExecutor(java.util.concurrent.Executor executor) {
            this.mMainThreadExecutor = executor;
            return this;
        }

        public final com.chad.library.adapter.base.diff.BrvahAsyncDifferConfig.Builder<T> setBackgroundThreadExecutor(java.util.concurrent.Executor executor) {
            this.mBackgroundThreadExecutor = executor;
            return this;
        }

        public final com.chad.library.adapter.base.diff.BrvahAsyncDifferConfig<T> build() {
            if (this.mBackgroundThreadExecutor == null) {
                synchronized (sExecutorLock) {
                    if (sDiffExecutor == null) {
                        sDiffExecutor = java.util.concurrent.Executors.newFixedThreadPool(2);
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                this.mBackgroundThreadExecutor = sDiffExecutor;
            }
            java.util.concurrent.Executor executor = this.mMainThreadExecutor;
            java.util.concurrent.Executor executor2 = this.mBackgroundThreadExecutor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(executor2);
            return new com.chad.library.adapter.base.diff.BrvahAsyncDifferConfig<>(executor, executor2, this.mDiffCallback);
        }
    }
}
