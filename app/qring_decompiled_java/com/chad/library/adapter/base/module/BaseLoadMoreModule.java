package com.chad.library.adapter.base.module;

/* compiled from: LoadMoreModule.kt */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020 H\u0000¢\u0006\u0002\b-J\u0006\u0010.\u001a\u00020+J\u0012\u0010/\u001a\u00020 2\b\u00100\u001a\u0004\u0018\u000101H\u0002J\u0006\u00102\u001a\u00020\u0006J\b\u00103\u001a\u00020+H\u0002J\u0010\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u000206H\u0002J\u0006\u00107\u001a\u00020+J\u0012\u00108\u001a\u00020+2\b\b\u0002\u00109\u001a\u00020\u0006H\u0007J\u0006\u0010:\u001a\u00020+J\u0006\u0010;\u001a\u00020+J\r\u0010<\u001a\u00020+H\u0000¢\u0006\u0002\b=J\u0012\u0010>\u001a\u00020+2\b\u0010?\u001a\u0004\u0018\u00010$H\u0016J\u0015\u0010@\u001a\u00020+2\u0006\u0010A\u001a\u00020BH\u0000¢\u0006\u0002\bCR\u0016\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR$\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\nR\u001e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR\u0011\u0010\u0014\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\bR\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010&\u001a\u00020 2\u0006\u0010\r\u001a\u00020 @FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010)¨\u0006D"}, d2 = {"Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "Lcom/chad/library/adapter/base/listener/LoadMoreListenerImp;", "baseQuickAdapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "enableLoadMoreEndClick", "", "getEnableLoadMoreEndClick", "()Z", "setEnableLoadMoreEndClick", "(Z)V", "isAutoLoadMore", "setAutoLoadMore", "value", "isEnableLoadMore", "setEnableLoadMore", "isEnableLoadMoreIfNotFullPage", "setEnableLoadMoreIfNotFullPage", "<set-?>", "isLoadEndMoreGone", "isLoading", "Lcom/chad/library/adapter/base/loadmore/LoadMoreStatus;", "loadMoreStatus", "getLoadMoreStatus", "()Lcom/chad/library/adapter/base/loadmore/LoadMoreStatus;", "loadMoreView", "Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;", "getLoadMoreView", "()Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;", "setLoadMoreView", "(Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;)V", "loadMoreViewPosition", "", "getLoadMoreViewPosition", "()I", "mLoadMoreListener", "Lcom/chad/library/adapter/base/listener/OnLoadMoreListener;", "mNextLoadEnable", "preLoadNumber", "getPreLoadNumber", "setPreLoadNumber", "(I)V", "autoLoadMore", "", "position", "autoLoadMore$com_github_CymChad_brvah", "checkDisableLoadMoreIfNotFullPage", "getTheBiggestNumber", "numbers", "", "hasLoadMoreView", "invokeLoadMoreListener", "isFullScreen", "llm", "Landroidx/recyclerview/widget/LinearLayoutManager;", "loadMoreComplete", "loadMoreEnd", "gone", "loadMoreFail", "loadMoreToLoading", "reset", "reset$com_github_CymChad_brvah", "setOnLoadMoreListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setupViewHolder", "viewHolder", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "setupViewHolder$com_github_CymChad_brvah", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public class BaseLoadMoreModule implements com.chad.library.adapter.base.listener.LoadMoreListenerImp {
    private final com.chad.library.adapter.base.BaseQuickAdapter<?, ?> baseQuickAdapter;
    private boolean enableLoadMoreEndClick;
    private boolean isAutoLoadMore;
    private boolean isEnableLoadMore;
    private boolean isEnableLoadMoreIfNotFullPage;
    private boolean isLoadEndMoreGone;
    private com.chad.library.adapter.base.loadmore.LoadMoreStatus loadMoreStatus;
    private com.chad.library.adapter.base.loadmore.BaseLoadMoreView loadMoreView;
    private com.chad.library.adapter.base.listener.OnLoadMoreListener mLoadMoreListener;
    private boolean mNextLoadEnable;
    private int preLoadNumber;

    public final void loadMoreEnd() {
        loadMoreEnd$default(this, false, 1, null);
    }

    public BaseLoadMoreModule(com.chad.library.adapter.base.BaseQuickAdapter<?, ?> baseQuickAdapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "baseQuickAdapter");
        this.baseQuickAdapter = baseQuickAdapter;
        this.mNextLoadEnable = true;
        this.loadMoreStatus = com.chad.library.adapter.base.loadmore.LoadMoreStatus.Complete;
        this.loadMoreView = com.chad.library.adapter.base.module.LoadMoreModuleConfig.getDefLoadMoreView();
        this.isAutoLoadMore = true;
        this.isEnableLoadMoreIfNotFullPage = true;
        this.preLoadNumber = 1;
    }

    public final com.chad.library.adapter.base.loadmore.LoadMoreStatus getLoadMoreStatus() {
        return this.loadMoreStatus;
    }

    /* renamed from: isLoadEndMoreGone, reason: from getter */
    public final boolean getIsLoadEndMoreGone() {
        return this.isLoadEndMoreGone;
    }

    public final com.chad.library.adapter.base.loadmore.BaseLoadMoreView getLoadMoreView() {
        return this.loadMoreView;
    }

    public final void setLoadMoreView(com.chad.library.adapter.base.loadmore.BaseLoadMoreView baseLoadMoreView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseLoadMoreView, "<set-?>");
        this.loadMoreView = baseLoadMoreView;
    }

    public final boolean getEnableLoadMoreEndClick() {
        return this.enableLoadMoreEndClick;
    }

    public final void setEnableLoadMoreEndClick(boolean z) {
        this.enableLoadMoreEndClick = z;
    }

    /* renamed from: isAutoLoadMore, reason: from getter */
    public final boolean getIsAutoLoadMore() {
        return this.isAutoLoadMore;
    }

    public final void setAutoLoadMore(boolean z) {
        this.isAutoLoadMore = z;
    }

    /* renamed from: isEnableLoadMoreIfNotFullPage, reason: from getter */
    public final boolean getIsEnableLoadMoreIfNotFullPage() {
        return this.isEnableLoadMoreIfNotFullPage;
    }

    public final void setEnableLoadMoreIfNotFullPage(boolean z) {
        this.isEnableLoadMoreIfNotFullPage = z;
    }

    public final int getPreLoadNumber() {
        return this.preLoadNumber;
    }

    public final void setPreLoadNumber(int i) {
        if (i > 1) {
            this.preLoadNumber = i;
        }
    }

    public final boolean isLoading() {
        return this.loadMoreStatus == com.chad.library.adapter.base.loadmore.LoadMoreStatus.Loading;
    }

    public final int getLoadMoreViewPosition() {
        if (this.baseQuickAdapter.hasEmptyView()) {
            return -1;
        }
        com.chad.library.adapter.base.BaseQuickAdapter<?, ?> baseQuickAdapter = this.baseQuickAdapter;
        return baseQuickAdapter.getHeaderLayoutCount() + baseQuickAdapter.getData().size() + baseQuickAdapter.getFooterLayoutCount();
    }

    /* renamed from: isEnableLoadMore, reason: from getter */
    public final boolean getIsEnableLoadMore() {
        return this.isEnableLoadMore;
    }

    public final void setEnableLoadMore(boolean z) {
        boolean hasLoadMoreView = hasLoadMoreView();
        this.isEnableLoadMore = z;
        boolean hasLoadMoreView2 = hasLoadMoreView();
        if (hasLoadMoreView) {
            if (hasLoadMoreView2) {
                return;
            }
            this.baseQuickAdapter.notifyItemRemoved(getLoadMoreViewPosition());
        } else if (hasLoadMoreView2) {
            this.loadMoreStatus = com.chad.library.adapter.base.loadmore.LoadMoreStatus.Complete;
            this.baseQuickAdapter.notifyItemInserted(getLoadMoreViewPosition());
        }
    }

    public final void setupViewHolder$com_github_CymChad_brvah(com.chad.library.adapter.base.viewholder.BaseViewHolder viewHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        viewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.chad.library.adapter.base.module.BaseLoadMoreModule$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.chad.library.adapter.base.module.BaseLoadMoreModule.m40setupViewHolder$lambda1(com.chad.library.adapter.base.module.BaseLoadMoreModule.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViewHolder$lambda-1, reason: not valid java name */
    public static final void m40setupViewHolder$lambda1(com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseLoadMoreModule, "this$0");
        if (baseLoadMoreModule.loadMoreStatus == com.chad.library.adapter.base.loadmore.LoadMoreStatus.Fail) {
            baseLoadMoreModule.loadMoreToLoading();
            return;
        }
        if (baseLoadMoreModule.loadMoreStatus == com.chad.library.adapter.base.loadmore.LoadMoreStatus.Complete) {
            baseLoadMoreModule.loadMoreToLoading();
        } else if (baseLoadMoreModule.enableLoadMoreEndClick && baseLoadMoreModule.loadMoreStatus == com.chad.library.adapter.base.loadmore.LoadMoreStatus.End) {
            baseLoadMoreModule.loadMoreToLoading();
        }
    }

    public final void loadMoreToLoading() {
        if (this.loadMoreStatus == com.chad.library.adapter.base.loadmore.LoadMoreStatus.Loading) {
            return;
        }
        this.loadMoreStatus = com.chad.library.adapter.base.loadmore.LoadMoreStatus.Loading;
        this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
        invokeLoadMoreListener();
    }

    public final boolean hasLoadMoreView() {
        if (this.mLoadMoreListener == null || !this.isEnableLoadMore) {
            return false;
        }
        if (this.loadMoreStatus == com.chad.library.adapter.base.loadmore.LoadMoreStatus.End && this.isLoadEndMoreGone) {
            return false;
        }
        return !this.baseQuickAdapter.getData().isEmpty();
    }

    public final void autoLoadMore$com_github_CymChad_brvah(int position) {
        if (this.isAutoLoadMore && hasLoadMoreView() && position >= this.baseQuickAdapter.getItemCount() - this.preLoadNumber && this.loadMoreStatus == com.chad.library.adapter.base.loadmore.LoadMoreStatus.Complete && this.loadMoreStatus != com.chad.library.adapter.base.loadmore.LoadMoreStatus.Loading && this.mNextLoadEnable) {
            invokeLoadMoreListener();
        }
    }

    private final void invokeLoadMoreListener() {
        this.loadMoreStatus = com.chad.library.adapter.base.loadmore.LoadMoreStatus.Loading;
        androidx.recyclerview.widget.RecyclerView recyclerViewOrNull = this.baseQuickAdapter.getRecyclerViewOrNull();
        if (recyclerViewOrNull != null) {
            recyclerViewOrNull.post(new java.lang.Runnable() { // from class: com.chad.library.adapter.base.module.BaseLoadMoreModule$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.chad.library.adapter.base.module.BaseLoadMoreModule.m39invokeLoadMoreListener$lambda3$lambda2(com.chad.library.adapter.base.module.BaseLoadMoreModule.this);
                }
            });
            return;
        }
        com.chad.library.adapter.base.listener.OnLoadMoreListener onLoadMoreListener = this.mLoadMoreListener;
        if (onLoadMoreListener != null) {
            onLoadMoreListener.onLoadMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeLoadMoreListener$lambda-3$lambda-2, reason: not valid java name */
    public static final void m39invokeLoadMoreListener$lambda3$lambda2(com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseLoadMoreModule, "this$0");
        com.chad.library.adapter.base.listener.OnLoadMoreListener onLoadMoreListener = baseLoadMoreModule.mLoadMoreListener;
        if (onLoadMoreListener != null) {
            onLoadMoreListener.onLoadMore();
        }
    }

    public final void checkDisableLoadMoreIfNotFullPage() {
        final androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        if (this.isEnableLoadMoreIfNotFullPage) {
            return;
        }
        this.mNextLoadEnable = false;
        androidx.recyclerview.widget.RecyclerView recyclerViewOrNull = this.baseQuickAdapter.getRecyclerViewOrNull();
        if (recyclerViewOrNull == null || (layoutManager = recyclerViewOrNull.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            recyclerViewOrNull.postDelayed(new java.lang.Runnable() { // from class: com.chad.library.adapter.base.module.BaseLoadMoreModule$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.chad.library.adapter.base.module.BaseLoadMoreModule.m37checkDisableLoadMoreIfNotFullPage$lambda4(com.chad.library.adapter.base.module.BaseLoadMoreModule.this, layoutManager);
                }
            }, 50L);
        } else if (layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
            recyclerViewOrNull.postDelayed(new java.lang.Runnable() { // from class: com.chad.library.adapter.base.module.BaseLoadMoreModule$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.chad.library.adapter.base.module.BaseLoadMoreModule.m38checkDisableLoadMoreIfNotFullPage$lambda5(layoutManager, this);
                }
            }, 50L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkDisableLoadMoreIfNotFullPage$lambda-4, reason: not valid java name */
    public static final void m37checkDisableLoadMoreIfNotFullPage$lambda4(com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule, androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseLoadMoreModule, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutManager, "$manager");
        if (baseLoadMoreModule.isFullScreen((androidx.recyclerview.widget.LinearLayoutManager) layoutManager)) {
            baseLoadMoreModule.mNextLoadEnable = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkDisableLoadMoreIfNotFullPage$lambda-5, reason: not valid java name */
    public static final void m38checkDisableLoadMoreIfNotFullPage$lambda5(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutManager, "$manager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseLoadMoreModule, "this$0");
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager;
        int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
        staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(iArr);
        if (baseLoadMoreModule.getTheBiggestNumber(iArr) + 1 != baseLoadMoreModule.baseQuickAdapter.getItemCount()) {
            baseLoadMoreModule.mNextLoadEnable = true;
        }
    }

    private final boolean isFullScreen(androidx.recyclerview.widget.LinearLayoutManager llm) {
        return (llm.findLastCompletelyVisibleItemPosition() + 1 == this.baseQuickAdapter.getItemCount() && llm.findFirstCompletelyVisibleItemPosition() == 0) ? false : true;
    }

    private final int getTheBiggestNumber(int[] numbers) {
        int i = -1;
        if (numbers != null) {
            if (!(numbers.length == 0)) {
                for (int i2 : numbers) {
                    if (i2 > i) {
                        i = i2;
                    }
                }
            }
        }
        return i;
    }

    public static /* synthetic */ void loadMoreEnd$default(com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMoreEnd");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        baseLoadMoreModule.loadMoreEnd(z);
    }

    public final void loadMoreEnd(boolean gone) {
        if (hasLoadMoreView()) {
            this.isLoadEndMoreGone = gone;
            this.loadMoreStatus = com.chad.library.adapter.base.loadmore.LoadMoreStatus.End;
            if (gone) {
                this.baseQuickAdapter.notifyItemRemoved(getLoadMoreViewPosition());
            } else {
                this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
            }
        }
    }

    public final void loadMoreComplete() {
        if (hasLoadMoreView()) {
            this.loadMoreStatus = com.chad.library.adapter.base.loadmore.LoadMoreStatus.Complete;
            this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
            checkDisableLoadMoreIfNotFullPage();
        }
    }

    public final void loadMoreFail() {
        if (hasLoadMoreView()) {
            this.loadMoreStatus = com.chad.library.adapter.base.loadmore.LoadMoreStatus.Fail;
            this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
        }
    }

    @Override // com.chad.library.adapter.base.listener.LoadMoreListenerImp
    public void setOnLoadMoreListener(com.chad.library.adapter.base.listener.OnLoadMoreListener listener) {
        this.mLoadMoreListener = listener;
        setEnableLoadMore(true);
    }

    public final void reset$com_github_CymChad_brvah() {
        if (this.mLoadMoreListener != null) {
            setEnableLoadMore(true);
            this.loadMoreStatus = com.chad.library.adapter.base.loadmore.LoadMoreStatus.Complete;
        }
    }
}
