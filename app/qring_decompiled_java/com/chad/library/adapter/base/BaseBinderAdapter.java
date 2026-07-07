package com.chad.library.adapter.base;

/* compiled from: BaseBinderAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001-B\u0017\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J9\u0010\u0011\u001a\u00020\u0000\"\n\b\u0000\u0010\u0012\u0018\u0001*\u00020\u00022\u0010\u0010\u0013\u001a\f\u0012\u0004\u0012\u0002H\u0012\u0012\u0002\b\u00030\u000e2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u0002H\u0012\u0018\u00010\nH\u0086\bJF\u0010\u0011\u001a\u00020\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00022\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00120\t2\u0010\u0010\u0013\u001a\f\u0012\u0004\u0012\u0002H\u0012\u0012\u0002\b\u00030\u000e2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u0002H\u0012\u0018\u00010\nH\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0010H\u0014J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0014J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0010H\u0014J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0002H\u0014J&\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0014J\u0014\u0010!\u001a\u00020\u00102\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\tH\u0004J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0010H\u0014J\u001c\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u001e\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020\u0010H\u0014J\u0010\u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u0003H\u0016J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0003H\u0016J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0003H\u0016RB\u0010\u0007\u001a6\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n0\bj\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u000f\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00100\bj\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u0010`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/chad/library/adapter/base/BaseBinderAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "list", "", "(Ljava/util/List;)V", "classDiffMap", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lkotlin/collections/HashMap;", "mBinderArray", "Landroid/util/SparseArray;", "Lcom/chad/library/adapter/base/binder/BaseItemBinder;", "mTypeMap", "", "addItemBinder", "T", "baseItemBinder", "callback", "clazz", "bindChildClick", "", "viewHolder", "viewType", "bindClick", "bindViewClickListener", "convert", "holder", "item", "payloads", "", "findViewType", "getDefItemViewType", "position", "getItemBinder", "getItemBinderOrNull", "onCreateDefViewHolder", "parent", "Landroid/view/ViewGroup;", "onFailedToRecycleView", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ItemCallback", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public class BaseBinderAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<java.lang.Object, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    private final java.util.HashMap<java.lang.Class<?>, androidx.recyclerview.widget.DiffUtil.ItemCallback<java.lang.Object>> classDiffMap;
    private final android.util.SparseArray<com.chad.library.adapter.base.binder.BaseItemBinder<java.lang.Object, ?>> mBinderArray;
    private final java.util.HashMap<java.lang.Class<?>, java.lang.Integer> mTypeMap;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BaseBinderAdapter() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chad.library.adapter.base.BaseBinderAdapter.<init>():void");
    }

    public final <T> com.chad.library.adapter.base.BaseBinderAdapter addItemBinder(java.lang.Class<? extends T> cls, com.chad.library.adapter.base.binder.BaseItemBinder<T, ?> baseItemBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "clazz");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseItemBinder, "baseItemBinder");
        return addItemBinder$default(this, cls, baseItemBinder, null, 4, null);
    }

    public BaseBinderAdapter(java.util.List<java.lang.Object> list) {
        super(0, list);
        this.classDiffMap = new java.util.HashMap<>();
        this.mTypeMap = new java.util.HashMap<>();
        this.mBinderArray = new android.util.SparseArray<>();
        setDiffCallback(new com.chad.library.adapter.base.BaseBinderAdapter.ItemCallback());
    }

    public /* synthetic */ BaseBinderAdapter(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    public static /* synthetic */ com.chad.library.adapter.base.BaseBinderAdapter addItemBinder$default(com.chad.library.adapter.base.BaseBinderAdapter baseBinderAdapter, java.lang.Class cls, com.chad.library.adapter.base.binder.BaseItemBinder baseItemBinder, androidx.recyclerview.widget.DiffUtil.ItemCallback itemCallback, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItemBinder");
        }
        if ((i & 4) != 0) {
            itemCallback = null;
        }
        return baseBinderAdapter.addItemBinder(cls, baseItemBinder, itemCallback);
    }

    public final <T> com.chad.library.adapter.base.BaseBinderAdapter addItemBinder(java.lang.Class<? extends T> clazz, com.chad.library.adapter.base.binder.BaseItemBinder<T, ?> baseItemBinder, androidx.recyclerview.widget.DiffUtil.ItemCallback<T> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseItemBinder, "baseItemBinder");
        int size = this.mTypeMap.size() + 1;
        this.mTypeMap.put(clazz, java.lang.Integer.valueOf(size));
        this.mBinderArray.append(size, baseItemBinder);
        baseItemBinder.set_adapter$com_github_CymChad_brvah(this);
        if (callback != null) {
            this.classDiffMap.put(clazz, callback);
        }
        return this;
    }

    public static /* synthetic */ com.chad.library.adapter.base.BaseBinderAdapter addItemBinder$default(com.chad.library.adapter.base.BaseBinderAdapter baseBinderAdapter, com.chad.library.adapter.base.binder.BaseItemBinder baseItemBinder, androidx.recyclerview.widget.DiffUtil.ItemCallback itemCallback, int i, java.lang.Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                itemCallback = null;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseItemBinder, "baseItemBinder");
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            baseBinderAdapter.addItemBinder(java.lang.Object.class, baseItemBinder, itemCallback);
            return baseBinderAdapter;
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItemBinder");
    }

    public final /* synthetic */ <T> com.chad.library.adapter.base.BaseBinderAdapter addItemBinder(com.chad.library.adapter.base.binder.BaseItemBinder<T, ?> baseItemBinder, androidx.recyclerview.widget.DiffUtil.ItemCallback<T> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseItemBinder, "baseItemBinder");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        addItemBinder(java.lang.Object.class, baseItemBinder, callback);
        return this;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected com.chad.library.adapter.base.viewholder.BaseViewHolder onCreateDefViewHolder(android.view.ViewGroup parent, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        com.chad.library.adapter.base.binder.BaseItemBinder<java.lang.Object, com.chad.library.adapter.base.viewholder.BaseViewHolder> itemBinder = getItemBinder(viewType);
        itemBinder.set_context$com_github_CymChad_brvah(getContext());
        return itemBinder.onCreateViewHolder(parent, viewType);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void convert(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, java.lang.Object item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        getItemBinder(holder.getItemViewType()).convert(holder, item);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void convert(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, java.lang.Object item, java.util.List<? extends java.lang.Object> payloads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloads, "payloads");
        getItemBinder(holder.getItemViewType()).convert(holder, item, payloads);
    }

    public com.chad.library.adapter.base.binder.BaseItemBinder<java.lang.Object, com.chad.library.adapter.base.viewholder.BaseViewHolder> getItemBinder(int viewType) {
        com.chad.library.adapter.base.binder.BaseItemBinder<java.lang.Object, com.chad.library.adapter.base.viewholder.BaseViewHolder> baseItemBinder = (com.chad.library.adapter.base.binder.BaseItemBinder) this.mBinderArray.get(viewType);
        if (baseItemBinder != null) {
            return baseItemBinder;
        }
        throw new java.lang.IllegalStateException(("getItemBinder: viewType '" + viewType + "' no such Binder found，please use addItemBinder() first!").toString());
    }

    public com.chad.library.adapter.base.binder.BaseItemBinder<java.lang.Object, com.chad.library.adapter.base.viewholder.BaseViewHolder> getItemBinderOrNull(int viewType) {
        com.chad.library.adapter.base.binder.BaseItemBinder<java.lang.Object, com.chad.library.adapter.base.viewholder.BaseViewHolder> baseItemBinder = (com.chad.library.adapter.base.binder.BaseItemBinder) this.mBinderArray.get(viewType);
        if (baseItemBinder == null) {
            return null;
        }
        return baseItemBinder;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected int getDefItemViewType(int position) {
        return findViewType(getData().get(position).getClass());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void bindViewClickListener(com.chad.library.adapter.base.viewholder.BaseViewHolder viewHolder, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.bindViewClickListener(viewHolder, viewType);
        bindClick(viewHolder);
        bindChildClick(viewHolder, viewType);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onViewAttachedToWindow(com.chad.library.adapter.base.viewholder.BaseViewHolder holder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((com.chad.library.adapter.base.BaseBinderAdapter) holder);
        com.chad.library.adapter.base.binder.BaseItemBinder<java.lang.Object, com.chad.library.adapter.base.viewholder.BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(holder.getItemViewType());
        if (itemBinderOrNull != null) {
            itemBinderOrNull.onViewAttachedToWindow(holder);
        }
    }

    public void onViewDetachedFromWindow(com.chad.library.adapter.base.viewholder.BaseViewHolder holder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow((androidx.recyclerview.widget.RecyclerView.ViewHolder) holder);
        com.chad.library.adapter.base.binder.BaseItemBinder<java.lang.Object, com.chad.library.adapter.base.viewholder.BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(holder.getItemViewType());
        if (itemBinderOrNull != null) {
            itemBinderOrNull.onViewDetachedFromWindow(holder);
        }
    }

    public boolean onFailedToRecycleView(com.chad.library.adapter.base.viewholder.BaseViewHolder holder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        com.chad.library.adapter.base.binder.BaseItemBinder<java.lang.Object, com.chad.library.adapter.base.viewholder.BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(holder.getItemViewType());
        if (itemBinderOrNull != null) {
            return itemBinderOrNull.onFailedToRecycleView(holder);
        }
        return false;
    }

    protected final int findViewType(java.lang.Class<?> clazz) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
        java.lang.Integer num = this.mTypeMap.get(clazz);
        if (num == null) {
            throw new java.lang.IllegalStateException(("findViewType: ViewType: " + clazz + " Not Find!").toString());
        }
        return num.intValue();
    }

    protected void bindClick(final com.chad.library.adapter.base.viewholder.BaseViewHolder viewHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (getMOnItemClickListener() == null) {
            viewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.chad.library.adapter.base.BaseBinderAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.chad.library.adapter.base.BaseBinderAdapter.m11bindClick$lambda4(com.chad.library.adapter.base.viewholder.BaseViewHolder.this, this, view);
                }
            });
        }
        if (getMOnItemLongClickListener() == null) {
            viewHolder.itemView.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.chad.library.adapter.base.BaseBinderAdapter$$ExternalSyntheticLambda2
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    boolean m12bindClick$lambda5;
                    m12bindClick$lambda5 = com.chad.library.adapter.base.BaseBinderAdapter.m12bindClick$lambda5(com.chad.library.adapter.base.viewholder.BaseViewHolder.this, this, view);
                    return m12bindClick$lambda5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindClick$lambda-4, reason: not valid java name */
    public static final void m11bindClick$lambda4(com.chad.library.adapter.base.viewholder.BaseViewHolder baseViewHolder, com.chad.library.adapter.base.BaseBinderAdapter baseBinderAdapter, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseViewHolder, "$viewHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseBinderAdapter, "this$0");
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - baseBinderAdapter.getHeaderLayoutCount();
        com.chad.library.adapter.base.binder.BaseItemBinder<java.lang.Object, com.chad.library.adapter.base.viewholder.BaseViewHolder> itemBinder = baseBinderAdapter.getItemBinder(baseViewHolder.getItemViewType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "it");
        itemBinder.onClick(baseViewHolder, view, baseBinderAdapter.getData().get(headerLayoutCount), headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindClick$lambda-5, reason: not valid java name */
    public static final boolean m12bindClick$lambda5(com.chad.library.adapter.base.viewholder.BaseViewHolder baseViewHolder, com.chad.library.adapter.base.BaseBinderAdapter baseBinderAdapter, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseViewHolder, "$viewHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseBinderAdapter, "this$0");
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - baseBinderAdapter.getHeaderLayoutCount();
        com.chad.library.adapter.base.binder.BaseItemBinder<java.lang.Object, com.chad.library.adapter.base.viewholder.BaseViewHolder> itemBinder = baseBinderAdapter.getItemBinder(baseViewHolder.getItemViewType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "it");
        return itemBinder.onLongClick(baseViewHolder, view, baseBinderAdapter.getData().get(headerLayoutCount), headerLayoutCount);
    }

    protected void bindChildClick(final com.chad.library.adapter.base.viewholder.BaseViewHolder viewHolder, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (getMOnItemChildClickListener() == null) {
            final com.chad.library.adapter.base.binder.BaseItemBinder<java.lang.Object, com.chad.library.adapter.base.viewholder.BaseViewHolder> itemBinder = getItemBinder(viewType);
            java.util.Iterator<T> it = itemBinder.getChildClickViewIds().iterator();
            while (it.hasNext()) {
                android.view.View findViewById = viewHolder.itemView.findViewById(((java.lang.Number) it.next()).intValue());
                if (findViewById != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById<View>(id)");
                    if (!findViewById.isClickable()) {
                        findViewById.setClickable(true);
                    }
                    findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.chad.library.adapter.base.BaseBinderAdapter$$ExternalSyntheticLambda1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            com.chad.library.adapter.base.BaseBinderAdapter.m10bindChildClick$lambda8$lambda7$lambda6(com.chad.library.adapter.base.viewholder.BaseViewHolder.this, this, itemBinder, view);
                        }
                    });
                }
            }
        }
        if (getMOnItemChildLongClickListener() == null) {
            final com.chad.library.adapter.base.binder.BaseItemBinder<java.lang.Object, com.chad.library.adapter.base.viewholder.BaseViewHolder> itemBinder2 = getItemBinder(viewType);
            java.util.Iterator<T> it2 = itemBinder2.getChildLongClickViewIds().iterator();
            while (it2.hasNext()) {
                android.view.View findViewById2 = viewHolder.itemView.findViewById(((java.lang.Number) it2.next()).intValue());
                if (findViewById2 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById<View>(id)");
                    if (!findViewById2.isLongClickable()) {
                        findViewById2.setLongClickable(true);
                    }
                    findViewById2.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.chad.library.adapter.base.BaseBinderAdapter$$ExternalSyntheticLambda3
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(android.view.View view) {
                            boolean m9bindChildClick$lambda11$lambda10$lambda9;
                            m9bindChildClick$lambda11$lambda10$lambda9 = com.chad.library.adapter.base.BaseBinderAdapter.m9bindChildClick$lambda11$lambda10$lambda9(com.chad.library.adapter.base.viewholder.BaseViewHolder.this, this, itemBinder2, view);
                            return m9bindChildClick$lambda11$lambda10$lambda9;
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindChildClick$lambda-8$lambda-7$lambda-6, reason: not valid java name */
    public static final void m10bindChildClick$lambda8$lambda7$lambda6(com.chad.library.adapter.base.viewholder.BaseViewHolder baseViewHolder, com.chad.library.adapter.base.BaseBinderAdapter baseBinderAdapter, com.chad.library.adapter.base.binder.BaseItemBinder baseItemBinder, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseViewHolder, "$viewHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseBinderAdapter, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseItemBinder, "$provider");
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - baseBinderAdapter.getHeaderLayoutCount();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "v");
        baseItemBinder.onChildClick(baseViewHolder, view, baseBinderAdapter.getData().get(headerLayoutCount), headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindChildClick$lambda-11$lambda-10$lambda-9, reason: not valid java name */
    public static final boolean m9bindChildClick$lambda11$lambda10$lambda9(com.chad.library.adapter.base.viewholder.BaseViewHolder baseViewHolder, com.chad.library.adapter.base.BaseBinderAdapter baseBinderAdapter, com.chad.library.adapter.base.binder.BaseItemBinder baseItemBinder, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseViewHolder, "$viewHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseBinderAdapter, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseItemBinder, "$provider");
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - baseBinderAdapter.getHeaderLayoutCount();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "v");
        return baseItemBinder.onChildLongClick(baseViewHolder, view, baseBinderAdapter.getData().get(headerLayoutCount), headerLayoutCount);
    }

    /* compiled from: BaseBinderAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0017J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/chad/library/adapter/base/BaseBinderAdapter$ItemCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "(Lcom/chad/library/adapter/base/BaseBinderAdapter;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "getChangePayload", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private final class ItemCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<java.lang.Object> {
        public ItemCallback() {
        }

        public boolean areItemsTheSame(java.lang.Object oldItem, java.lang.Object newItem) {
            androidx.recyclerview.widget.DiffUtil.ItemCallback itemCallback;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (kotlin.jvm.internal.Intrinsics.areEqual(oldItem.getClass(), newItem.getClass()) && (itemCallback = (androidx.recyclerview.widget.DiffUtil.ItemCallback) com.chad.library.adapter.base.BaseBinderAdapter.this.classDiffMap.get(oldItem.getClass())) != null) {
                return itemCallback.areItemsTheSame(oldItem, newItem);
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(oldItem, newItem);
        }

        public boolean areContentsTheSame(java.lang.Object oldItem, java.lang.Object newItem) {
            androidx.recyclerview.widget.DiffUtil.ItemCallback itemCallback;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(oldItem.getClass(), newItem.getClass()) || (itemCallback = (androidx.recyclerview.widget.DiffUtil.ItemCallback) com.chad.library.adapter.base.BaseBinderAdapter.this.classDiffMap.get(oldItem.getClass())) == null) {
                return true;
            }
            return itemCallback.areContentsTheSame(oldItem, newItem);
        }

        public java.lang.Object getChangePayload(java.lang.Object oldItem, java.lang.Object newItem) {
            androidx.recyclerview.widget.DiffUtil.ItemCallback itemCallback;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(oldItem.getClass(), newItem.getClass()) || (itemCallback = (androidx.recyclerview.widget.DiffUtil.ItemCallback) com.chad.library.adapter.base.BaseBinderAdapter.this.classDiffMap.get(oldItem.getClass())) == null) {
                return null;
            }
            return itemCallback.getChangePayload(oldItem, newItem);
        }
    }
}
