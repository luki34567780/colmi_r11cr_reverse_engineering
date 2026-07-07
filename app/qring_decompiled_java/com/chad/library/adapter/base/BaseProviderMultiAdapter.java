package com.chad.library.adapter.base;

/* compiled from: BaseProviderMultiAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0003H\u0014J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u001d\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u001aJ+\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00028\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0014¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0014H\u0014J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u001e\u0010\"\u001a\u00020\u00142\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010 \u001a\u00020\u0014H$J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0010\u0010'\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016R'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006("}, d2 = {"Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "T", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "data", "", "(Ljava/util/List;)V", "mItemProviders", "Landroid/util/SparseArray;", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "getMItemProviders", "()Landroid/util/SparseArray;", "mItemProviders$delegate", "Lkotlin/Lazy;", "addItemProvider", "", "provider", "bindChildClick", "viewHolder", "viewType", "", "bindClick", "bindViewClickListener", "convert", "holder", "item", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "payloads", "", "", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "getDefItemViewType", "position", "getItemProvider", "getItemType", "onCreateDefViewHolder", "parent", "Landroid/view/ViewGroup;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public abstract class BaseProviderMultiAdapter<T> extends com.chad.library.adapter.base.BaseQuickAdapter<T, com.chad.library.adapter.base.viewholder.BaseViewHolder> {

    /* renamed from: mItemProviders$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy mItemProviders;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BaseProviderMultiAdapter() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chad.library.adapter.base.BaseProviderMultiAdapter.<init>():void");
    }

    protected abstract int getItemType(java.util.List<? extends T> data, int position);

    public /* synthetic */ BaseProviderMultiAdapter(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    public BaseProviderMultiAdapter(java.util.List<T> list) {
        super(0, list);
        this.mItemProviders = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0<android.util.SparseArray<com.chad.library.adapter.base.provider.BaseItemProvider<T>>>() { // from class: com.chad.library.adapter.base.BaseProviderMultiAdapter$mItemProviders$2
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final android.util.SparseArray<com.chad.library.adapter.base.provider.BaseItemProvider<T>> m19invoke() {
                return new android.util.SparseArray<>();
            }
        });
    }

    private final android.util.SparseArray<com.chad.library.adapter.base.provider.BaseItemProvider<T>> getMItemProviders() {
        return (android.util.SparseArray) this.mItemProviders.getValue();
    }

    public void addItemProvider(com.chad.library.adapter.base.provider.BaseItemProvider<T> provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
        provider.setAdapter$com_github_CymChad_brvah(this);
        getMItemProviders().put(provider.getItemViewType(), provider);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected com.chad.library.adapter.base.viewholder.BaseViewHolder onCreateDefViewHolder(android.view.ViewGroup parent, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        com.chad.library.adapter.base.provider.BaseItemProvider<T> itemProvider = getItemProvider(viewType);
        if (itemProvider == null) {
            throw new java.lang.IllegalStateException(("ViewType: " + viewType + " no such provider found，please use addItemProvider() first!").toString());
        }
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        itemProvider.setContext(context);
        com.chad.library.adapter.base.viewholder.BaseViewHolder onCreateViewHolder = itemProvider.onCreateViewHolder(parent, viewType);
        itemProvider.onViewHolderCreated(onCreateViewHolder, viewType);
        return onCreateViewHolder;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected int getDefItemViewType(int position) {
        return getItemType(getData(), position);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void convert(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, T item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        com.chad.library.adapter.base.provider.BaseItemProvider<T> itemProvider = getItemProvider(holder.getItemViewType());
        kotlin.jvm.internal.Intrinsics.checkNotNull(itemProvider);
        itemProvider.convert(holder, item);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void convert(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, T item, java.util.List<? extends java.lang.Object> payloads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloads, "payloads");
        com.chad.library.adapter.base.provider.BaseItemProvider<T> itemProvider = getItemProvider(holder.getItemViewType());
        kotlin.jvm.internal.Intrinsics.checkNotNull(itemProvider);
        itemProvider.convert(holder, item, payloads);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void bindViewClickListener(com.chad.library.adapter.base.viewholder.BaseViewHolder viewHolder, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.bindViewClickListener(viewHolder, viewType);
        bindClick(viewHolder);
        bindChildClick(viewHolder, viewType);
    }

    protected com.chad.library.adapter.base.provider.BaseItemProvider<T> getItemProvider(int viewType) {
        return getMItemProviders().get(viewType);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onViewAttachedToWindow(com.chad.library.adapter.base.viewholder.BaseViewHolder holder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((com.chad.library.adapter.base.BaseProviderMultiAdapter<T>) holder);
        com.chad.library.adapter.base.provider.BaseItemProvider<T> itemProvider = getItemProvider(holder.getItemViewType());
        if (itemProvider != null) {
            itemProvider.onViewAttachedToWindow(holder);
        }
    }

    public void onViewDetachedFromWindow(com.chad.library.adapter.base.viewholder.BaseViewHolder holder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow((androidx.recyclerview.widget.RecyclerView.ViewHolder) holder);
        com.chad.library.adapter.base.provider.BaseItemProvider<T> itemProvider = getItemProvider(holder.getItemViewType());
        if (itemProvider != null) {
            itemProvider.onViewDetachedFromWindow(holder);
        }
    }

    protected void bindClick(final com.chad.library.adapter.base.viewholder.BaseViewHolder viewHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (getMOnItemClickListener() == null) {
            viewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.chad.library.adapter.base.BaseProviderMultiAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.chad.library.adapter.base.BaseProviderMultiAdapter.m17bindClick$lambda2(com.chad.library.adapter.base.viewholder.BaseViewHolder.this, this, view);
                }
            });
        }
        if (getMOnItemLongClickListener() == null) {
            viewHolder.itemView.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.chad.library.adapter.base.BaseProviderMultiAdapter$$ExternalSyntheticLambda2
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    boolean m18bindClick$lambda3;
                    m18bindClick$lambda3 = com.chad.library.adapter.base.BaseProviderMultiAdapter.m18bindClick$lambda3(com.chad.library.adapter.base.viewholder.BaseViewHolder.this, this, view);
                    return m18bindClick$lambda3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindClick$lambda-2, reason: not valid java name */
    public static final void m17bindClick$lambda2(com.chad.library.adapter.base.viewholder.BaseViewHolder baseViewHolder, com.chad.library.adapter.base.BaseProviderMultiAdapter baseProviderMultiAdapter, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseViewHolder, "$viewHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseProviderMultiAdapter, "this$0");
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - baseProviderMultiAdapter.getHeaderLayoutCount();
        com.chad.library.adapter.base.provider.BaseItemProvider<T> baseItemProvider = baseProviderMultiAdapter.getMItemProviders().get(baseViewHolder.getItemViewType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "it");
        baseItemProvider.onClick(baseViewHolder, view, baseProviderMultiAdapter.getData().get(headerLayoutCount), headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindClick$lambda-3, reason: not valid java name */
    public static final boolean m18bindClick$lambda3(com.chad.library.adapter.base.viewholder.BaseViewHolder baseViewHolder, com.chad.library.adapter.base.BaseProviderMultiAdapter baseProviderMultiAdapter, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseViewHolder, "$viewHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseProviderMultiAdapter, "this$0");
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - baseProviderMultiAdapter.getHeaderLayoutCount();
        com.chad.library.adapter.base.provider.BaseItemProvider<T> baseItemProvider = baseProviderMultiAdapter.getMItemProviders().get(baseViewHolder.getItemViewType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "it");
        return baseItemProvider.onLongClick(baseViewHolder, view, baseProviderMultiAdapter.getData().get(headerLayoutCount), headerLayoutCount);
    }

    protected void bindChildClick(final com.chad.library.adapter.base.viewholder.BaseViewHolder viewHolder, int viewType) {
        final com.chad.library.adapter.base.provider.BaseItemProvider<T> itemProvider;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (getMOnItemChildClickListener() == null) {
            final com.chad.library.adapter.base.provider.BaseItemProvider<T> itemProvider2 = getItemProvider(viewType);
            if (itemProvider2 == null) {
                return;
            }
            java.util.Iterator<T> it = itemProvider2.getChildClickViewIds().iterator();
            while (it.hasNext()) {
                android.view.View findViewById = viewHolder.itemView.findViewById(((java.lang.Number) it.next()).intValue());
                if (findViewById != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById<View>(id)");
                    if (!findViewById.isClickable()) {
                        findViewById.setClickable(true);
                    }
                    findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.chad.library.adapter.base.BaseProviderMultiAdapter$$ExternalSyntheticLambda1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            com.chad.library.adapter.base.BaseProviderMultiAdapter.m15bindChildClick$lambda6$lambda5$lambda4(com.chad.library.adapter.base.viewholder.BaseViewHolder.this, this, itemProvider2, view);
                        }
                    });
                }
            }
        }
        if (getMOnItemChildLongClickListener() != null || (itemProvider = getItemProvider(viewType)) == null) {
            return;
        }
        java.util.Iterator<T> it2 = itemProvider.getChildLongClickViewIds().iterator();
        while (it2.hasNext()) {
            android.view.View findViewById2 = viewHolder.itemView.findViewById(((java.lang.Number) it2.next()).intValue());
            if (findViewById2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById<View>(id)");
                if (!findViewById2.isLongClickable()) {
                    findViewById2.setLongClickable(true);
                }
                findViewById2.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.chad.library.adapter.base.BaseProviderMultiAdapter$$ExternalSyntheticLambda3
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view) {
                        boolean m16bindChildClick$lambda9$lambda8$lambda7;
                        m16bindChildClick$lambda9$lambda8$lambda7 = com.chad.library.adapter.base.BaseProviderMultiAdapter.m16bindChildClick$lambda9$lambda8$lambda7(com.chad.library.adapter.base.viewholder.BaseViewHolder.this, this, itemProvider, view);
                        return m16bindChildClick$lambda9$lambda8$lambda7;
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindChildClick$lambda-6$lambda-5$lambda-4, reason: not valid java name */
    public static final void m15bindChildClick$lambda6$lambda5$lambda4(com.chad.library.adapter.base.viewholder.BaseViewHolder baseViewHolder, com.chad.library.adapter.base.BaseProviderMultiAdapter baseProviderMultiAdapter, com.chad.library.adapter.base.provider.BaseItemProvider baseItemProvider, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseViewHolder, "$viewHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseProviderMultiAdapter, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseItemProvider, "$provider");
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - baseProviderMultiAdapter.getHeaderLayoutCount();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "v");
        baseItemProvider.onChildClick(baseViewHolder, view, baseProviderMultiAdapter.getData().get(headerLayoutCount), headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindChildClick$lambda-9$lambda-8$lambda-7, reason: not valid java name */
    public static final boolean m16bindChildClick$lambda9$lambda8$lambda7(com.chad.library.adapter.base.viewholder.BaseViewHolder baseViewHolder, com.chad.library.adapter.base.BaseProviderMultiAdapter baseProviderMultiAdapter, com.chad.library.adapter.base.provider.BaseItemProvider baseItemProvider, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseViewHolder, "$viewHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseProviderMultiAdapter, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseItemProvider, "$provider");
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - baseProviderMultiAdapter.getHeaderLayoutCount();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "v");
        return baseItemProvider.onChildLongClick(baseViewHolder, view, baseProviderMultiAdapter.getData().get(headerLayoutCount), headerLayoutCount);
    }
}
