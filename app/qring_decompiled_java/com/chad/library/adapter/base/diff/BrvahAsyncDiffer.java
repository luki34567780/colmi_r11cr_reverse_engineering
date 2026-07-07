package com.chad.library.adapter.base.diff;

/* compiled from: BrvahAsyncDiffer.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001/B%\u0012\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0002\u0010\u0015J\u001b\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00132\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001aJ\u0016\u0010\u001b\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J%\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00028\u00002\b\u0010\u001f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\u0013J(\u0010\"\u001a\u00020\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J \u0010(\u001a\u00020\u00132\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J\u0013\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00028\u0000¢\u0006\u0002\u0010\u0015J\u000e\u0010,\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eJ\u0014\u0010-\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\nJ$\u0010.\u001a\u00020\u00132\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0007R\u0018\u0010\u0003\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "T", "Lcom/chad/library/adapter/base/diff/DifferImp;", "adapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "config", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;)V", "mListeners", "", "Lcom/chad/library/adapter/base/diff/ListChangeListener;", "mMainThreadExecutor", "Ljava/util/concurrent/Executor;", "mMaxScheduledGeneration", "", "mUpdateCallback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "sMainThreadExecutor", "addData", "", "data", "(Ljava/lang/Object;)V", "index", "(ILjava/lang/Object;)V", "addList", "list", "", "addListListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "changeData", "newData", "payload", "(ILjava/lang/Object;Ljava/lang/Object;)V", "clearAllListListener", "latchList", "newList", "diffResult", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "commitCallback", "Ljava/lang/Runnable;", "onCurrentListChanged", "previousList", "remove", "t", "removeAt", "removeListListener", "submitList", "MainThreadExecutor", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BrvahAsyncDiffer<T> implements com.chad.library.adapter.base.diff.DifferImp<T> {
    private final com.chad.library.adapter.base.BaseQuickAdapter<T, ?> adapter;
    private final com.chad.library.adapter.base.diff.BrvahAsyncDifferConfig<T> config;
    private final java.util.List<com.chad.library.adapter.base.diff.ListChangeListener<T>> mListeners;
    private java.util.concurrent.Executor mMainThreadExecutor;
    private int mMaxScheduledGeneration;
    private final androidx.recyclerview.widget.ListUpdateCallback mUpdateCallback;
    private final java.util.concurrent.Executor sMainThreadExecutor;

    public final void submitList(java.util.List<T> list) {
        submitList$default(this, list, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor] */
    public BrvahAsyncDiffer(com.chad.library.adapter.base.BaseQuickAdapter<T, ?> baseQuickAdapter, com.chad.library.adapter.base.diff.BrvahAsyncDifferConfig<T> brvahAsyncDifferConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "adapter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brvahAsyncDifferConfig, "config");
        this.adapter = baseQuickAdapter;
        this.config = brvahAsyncDifferConfig;
        this.mUpdateCallback = new com.chad.library.adapter.base.diff.BrvahListUpdateCallback(baseQuickAdapter);
        com.chad.library.adapter.base.diff.BrvahAsyncDiffer.MainThreadExecutor mainThreadExecutor = new com.chad.library.adapter.base.diff.BrvahAsyncDiffer.MainThreadExecutor();
        this.sMainThreadExecutor = mainThreadExecutor;
        ?? mainThreadExecutor2 = brvahAsyncDifferConfig.getMainThreadExecutor();
        this.mMainThreadExecutor = mainThreadExecutor2 != 0 ? mainThreadExecutor2 : mainThreadExecutor;
        this.mListeners = new java.util.concurrent.CopyOnWriteArrayList();
    }

    /* compiled from: BrvahAsyncDiffer.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer$MainThreadExecutor;", "Ljava/util/concurrent/Executor;", "()V", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "execute", "", "command", "Ljava/lang/Runnable;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class MainThreadExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper());

        public final android.os.Handler getMHandler() {
            return this.mHandler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable command) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
            this.mHandler.post(command);
        }
    }

    public final void addData(int index, T data) {
        java.util.List<? extends T> data2 = this.adapter.getData();
        this.adapter.getData().add(index, data);
        this.mUpdateCallback.onInserted(index, 1);
        onCurrentListChanged(data2, null);
    }

    public final void addData(T data) {
        java.util.List<? extends T> data2 = this.adapter.getData();
        this.adapter.getData().add(data);
        this.mUpdateCallback.onInserted(data2.size(), 1);
        onCurrentListChanged(data2, null);
    }

    public final void addList(java.util.List<? extends T> list) {
        if (list == null) {
            return;
        }
        java.util.List<? extends T> data = this.adapter.getData();
        this.adapter.getData().addAll(list);
        this.mUpdateCallback.onInserted(data.size(), list.size());
        onCurrentListChanged(data, null);
    }

    public final void changeData(int index, T newData, T payload) {
        java.util.List<? extends T> data = this.adapter.getData();
        this.adapter.getData().set(index, newData);
        this.mUpdateCallback.onChanged(index, 1, payload);
        onCurrentListChanged(data, null);
    }

    public final void removeAt(int index) {
        java.util.List<? extends T> data = this.adapter.getData();
        this.adapter.getData().remove(index);
        this.mUpdateCallback.onRemoved(index, 1);
        onCurrentListChanged(data, null);
    }

    public final void remove(T t) {
        java.util.List<? extends T> data = this.adapter.getData();
        int indexOf = this.adapter.getData().indexOf(t);
        if (indexOf == -1) {
            return;
        }
        this.adapter.getData().remove(indexOf);
        this.mUpdateCallback.onRemoved(indexOf, 1);
        onCurrentListChanged(data, null);
    }

    public static /* synthetic */ void submitList$default(com.chad.library.adapter.base.diff.BrvahAsyncDiffer brvahAsyncDiffer, java.util.List list, java.lang.Runnable runnable, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            runnable = null;
        }
        brvahAsyncDiffer.submitList(list, runnable);
    }

    public final void submitList(final java.util.List<T> newList, final java.lang.Runnable commitCallback) {
        final int i = this.mMaxScheduledGeneration + 1;
        this.mMaxScheduledGeneration = i;
        if (newList == this.adapter.getData()) {
            if (commitCallback != null) {
                commitCallback.run();
                return;
            }
            return;
        }
        final java.util.List<? extends T> data = this.adapter.getData();
        if (newList == null) {
            int size = this.adapter.getData().size();
            this.adapter.setData$com_github_CymChad_brvah(new java.util.ArrayList());
            this.mUpdateCallback.onRemoved(0, size);
            onCurrentListChanged(data, commitCallback);
            return;
        }
        if (this.adapter.getData().isEmpty()) {
            this.adapter.setData$com_github_CymChad_brvah(newList);
            this.mUpdateCallback.onInserted(0, newList.size());
            onCurrentListChanged(data, commitCallback);
            return;
        }
        this.config.getBackgroundThreadExecutor().execute(new java.lang.Runnable() { // from class: com.chad.library.adapter.base.diff.BrvahAsyncDiffer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.chad.library.adapter.base.diff.BrvahAsyncDiffer.m29submitList$lambda1(com.chad.library.adapter.base.diff.BrvahAsyncDiffer.this, data, newList, i, commitCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitList$lambda-1, reason: not valid java name */
    public static final void m29submitList$lambda1(final com.chad.library.adapter.base.diff.BrvahAsyncDiffer brvahAsyncDiffer, final java.util.List list, final java.util.List list2, final int i, final java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brvahAsyncDiffer, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "$oldList");
        final androidx.recyclerview.widget.DiffUtil.DiffResult calculateDiff = androidx.recyclerview.widget.DiffUtil.calculateDiff(new androidx.recyclerview.widget.DiffUtil.Callback() { // from class: com.chad.library.adapter.base.diff.BrvahAsyncDiffer$submitList$1$result$1
            public int getOldListSize() {
                return list.size();
            }

            public int getNewListSize() {
                return list2.size();
            }

            public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                com.chad.library.adapter.base.diff.BrvahAsyncDifferConfig brvahAsyncDifferConfig;
                java.lang.Object obj = list.get(oldItemPosition);
                java.lang.Object obj2 = list2.get(newItemPosition);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                brvahAsyncDifferConfig = ((com.chad.library.adapter.base.diff.BrvahAsyncDiffer) brvahAsyncDiffer).config;
                return brvahAsyncDifferConfig.getDiffCallback().areItemsTheSame(obj, obj2);
            }

            public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                com.chad.library.adapter.base.diff.BrvahAsyncDifferConfig brvahAsyncDifferConfig;
                java.lang.Object obj = list.get(oldItemPosition);
                java.lang.Object obj2 = list2.get(newItemPosition);
                if (obj != null && obj2 != null) {
                    brvahAsyncDifferConfig = ((com.chad.library.adapter.base.diff.BrvahAsyncDiffer) brvahAsyncDiffer).config;
                    return brvahAsyncDifferConfig.getDiffCallback().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new java.lang.AssertionError();
            }

            public java.lang.Object getChangePayload(int oldItemPosition, int newItemPosition) {
                com.chad.library.adapter.base.diff.BrvahAsyncDifferConfig brvahAsyncDifferConfig;
                java.lang.Object obj = list.get(oldItemPosition);
                java.lang.Object obj2 = list2.get(newItemPosition);
                if (obj != null && obj2 != null) {
                    brvahAsyncDifferConfig = ((com.chad.library.adapter.base.diff.BrvahAsyncDiffer) brvahAsyncDiffer).config;
                    return brvahAsyncDifferConfig.getDiffCallback().getChangePayload(obj, obj2);
                }
                throw new java.lang.AssertionError();
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calculateDiff, "@JvmOverloads\n    fun su…        }\n        }\n    }");
        brvahAsyncDiffer.mMainThreadExecutor.execute(new java.lang.Runnable() { // from class: com.chad.library.adapter.base.diff.BrvahAsyncDiffer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.chad.library.adapter.base.diff.BrvahAsyncDiffer.m30submitList$lambda1$lambda0(com.chad.library.adapter.base.diff.BrvahAsyncDiffer.this, i, list2, calculateDiff, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitList$lambda-1$lambda-0, reason: not valid java name */
    public static final void m30submitList$lambda1$lambda0(com.chad.library.adapter.base.diff.BrvahAsyncDiffer brvahAsyncDiffer, int i, java.util.List list, androidx.recyclerview.widget.DiffUtil.DiffResult diffResult, java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brvahAsyncDiffer, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diffResult, "$result");
        if (brvahAsyncDiffer.mMaxScheduledGeneration == i) {
            brvahAsyncDiffer.latchList(list, diffResult, runnable);
        }
    }

    private final void latchList(java.util.List<T> newList, androidx.recyclerview.widget.DiffUtil.DiffResult diffResult, java.lang.Runnable commitCallback) {
        java.util.List<? extends T> data = this.adapter.getData();
        this.adapter.setData$com_github_CymChad_brvah(newList);
        diffResult.dispatchUpdatesTo(this.mUpdateCallback);
        onCurrentListChanged(data, commitCallback);
    }

    private final void onCurrentListChanged(java.util.List<? extends T> previousList, java.lang.Runnable commitCallback) {
        java.util.Iterator<com.chad.library.adapter.base.diff.ListChangeListener<T>> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onCurrentListChanged(previousList, this.adapter.getData());
        }
        if (commitCallback != null) {
            commitCallback.run();
        }
    }

    @Override // com.chad.library.adapter.base.diff.DifferImp
    public void addListListener(com.chad.library.adapter.base.diff.ListChangeListener<T> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.mListeners.add(listener);
    }

    public final void removeListListener(com.chad.library.adapter.base.diff.ListChangeListener<T> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.mListeners.remove(listener);
    }

    public final void clearAllListListener() {
        this.mListeners.clear();
    }
}
