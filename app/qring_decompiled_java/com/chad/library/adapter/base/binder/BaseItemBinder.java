package com.chad.library.adapter.base.binder;

/* compiled from: BaseItemBinder.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0014\u0010%\u001a\u00020&2\f\b\u0001\u0010'\u001a\u00020(\"\u00020\u0016J\u0014\u0010)\u001a\u00020&2\f\b\u0001\u0010'\u001a\u00020(\"\u00020\u0016J\u001d\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00028\u0000H&¢\u0006\u0002\u0010,J+\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00028\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040.H\u0016¢\u0006\u0002\u0010/J\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017J\u0016\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017J-\u00102\u001a\u00020&2\u0006\u0010+\u001a\u00028\u00012\u0006\u00103\u001a\u0002042\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u00105\u001a\u00020\u0016H\u0016¢\u0006\u0002\u00106J-\u00107\u001a\u0002082\u0006\u0010+\u001a\u00028\u00012\u0006\u00103\u001a\u0002042\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u00105\u001a\u00020\u0016H\u0016¢\u0006\u0002\u00109J-\u0010:\u001a\u00020&2\u0006\u0010+\u001a\u00028\u00012\u0006\u00103\u001a\u0002042\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u00105\u001a\u00020\u0016H\u0016¢\u0006\u0002\u00106J\u001d\u0010;\u001a\u00028\u00012\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0016H&¢\u0006\u0002\u0010?J\u0015\u0010@\u001a\u0002082\u0006\u0010+\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010AJ-\u0010B\u001a\u0002082\u0006\u0010+\u001a\u00028\u00012\u0006\u00103\u001a\u0002042\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u00105\u001a\u00020\u0016H\u0016¢\u0006\u0002\u00109J\u0015\u0010C\u001a\u00020&2\u0006\u0010+\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010DJ\u0015\u0010E\u001a\u00020&2\u0006\u0010+\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010DR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR+\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R+\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b#\u0010\u0019¨\u0006F"}, d2 = {"Lcom/chad/library/adapter/base/binder/BaseItemBinder;", "T", "VH", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "()V", "_adapter", "Lcom/chad/library/adapter/base/BaseBinderAdapter;", "get_adapter$com_github_CymChad_brvah", "()Lcom/chad/library/adapter/base/BaseBinderAdapter;", "set_adapter$com_github_CymChad_brvah", "(Lcom/chad/library/adapter/base/BaseBinderAdapter;)V", "_context", "Landroid/content/Context;", "get_context$com_github_CymChad_brvah", "()Landroid/content/Context;", "set_context$com_github_CymChad_brvah", "(Landroid/content/Context;)V", "adapter", "getAdapter", "clickViewIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getClickViewIds", "()Ljava/util/ArrayList;", "clickViewIds$delegate", "Lkotlin/Lazy;", "context", "getContext", "data", "", "getData", "()Ljava/util/List;", "longClickViewIds", "getLongClickViewIds", "longClickViewIds$delegate", "addChildClickViewIds", "", "ids", "", "addChildLongClickViewIds", "convert", "holder", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "payloads", "", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "getChildClickViewIds", "getChildLongClickViewIds", "onChildClick", "view", "Landroid/view/View;", "position", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)V", "onChildLongClick", "", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)Z", "onClick", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "onFailedToRecycleView", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)Z", "onLongClick", "onViewAttachedToWindow", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "onViewDetachedFromWindow", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public abstract class BaseItemBinder<T, VH extends com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    private com.chad.library.adapter.base.BaseBinderAdapter _adapter;
    private android.content.Context _context;

    /* renamed from: clickViewIds$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy clickViewIds = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0<java.util.ArrayList<java.lang.Integer>>() { // from class: com.chad.library.adapter.base.binder.BaseItemBinder$clickViewIds$2
        public final java.util.ArrayList<java.lang.Integer> invoke() {
            return new java.util.ArrayList<>();
        }
    });

    /* renamed from: longClickViewIds$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy longClickViewIds = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0<java.util.ArrayList<java.lang.Integer>>() { // from class: com.chad.library.adapter.base.binder.BaseItemBinder$longClickViewIds$2
        public final java.util.ArrayList<java.lang.Integer> invoke() {
            return new java.util.ArrayList<>();
        }
    });

    public abstract void convert(VH holder, T data);

    public void convert(VH holder, T data, java.util.List<? extends java.lang.Object> payloads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloads, "payloads");
    }

    public void onChildClick(VH holder, android.view.View view, T data, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
    }

    public boolean onChildLongClick(VH holder, android.view.View view, T data, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        return false;
    }

    public void onClick(VH holder, android.view.View view, T data, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
    }

    public abstract VH onCreateViewHolder(android.view.ViewGroup parent, int viewType);

    public boolean onFailedToRecycleView(VH holder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        return false;
    }

    public boolean onLongClick(VH holder, android.view.View view, T data, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        return false;
    }

    public void onViewAttachedToWindow(VH holder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
    }

    public void onViewDetachedFromWindow(VH holder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
    }

    private final java.util.ArrayList<java.lang.Integer> getClickViewIds() {
        return (java.util.ArrayList) this.clickViewIds.getValue();
    }

    private final java.util.ArrayList<java.lang.Integer> getLongClickViewIds() {
        return (java.util.ArrayList) this.longClickViewIds.getValue();
    }

    /* renamed from: get_adapter$com_github_CymChad_brvah, reason: from getter */
    public final com.chad.library.adapter.base.BaseBinderAdapter get_adapter() {
        return this._adapter;
    }

    public final void set_adapter$com_github_CymChad_brvah(com.chad.library.adapter.base.BaseBinderAdapter baseBinderAdapter) {
        this._adapter = baseBinderAdapter;
    }

    /* renamed from: get_context$com_github_CymChad_brvah, reason: from getter */
    public final android.content.Context get_context() {
        return this._context;
    }

    public final void set_context$com_github_CymChad_brvah(android.content.Context context) {
        this._context = context;
    }

    public final com.chad.library.adapter.base.BaseBinderAdapter getAdapter() {
        com.chad.library.adapter.base.BaseBinderAdapter baseBinderAdapter = this._adapter;
        if (baseBinderAdapter == null) {
            throw new java.lang.IllegalStateException(("This " + this + " has not been attached to BaseBinderAdapter yet.\n                    You should not call the method before addItemBinder().").toString());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(baseBinderAdapter);
        return baseBinderAdapter;
    }

    public final android.content.Context getContext() {
        android.content.Context context = this._context;
        if (context == null) {
            throw new java.lang.IllegalStateException(("This " + this + " has not been attached to BaseBinderAdapter yet.\n                    You should not call the method before onCreateViewHolder().").toString());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        return context;
    }

    public final java.util.List<java.lang.Object> getData() {
        return getAdapter().getData();
    }

    public final java.util.ArrayList<java.lang.Integer> getChildClickViewIds() {
        return getClickViewIds();
    }

    public final java.util.ArrayList<java.lang.Integer> getChildLongClickViewIds() {
        return getLongClickViewIds();
    }

    public final void addChildClickViewIds(int... ids) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ids, "ids");
        for (int i : ids) {
            getClickViewIds().add(java.lang.Integer.valueOf(i));
        }
    }

    public final void addChildLongClickViewIds(int... ids) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ids, "ids");
        for (int i : ids) {
            getLongClickViewIds().add(java.lang.Integer.valueOf(i));
        }
    }
}
