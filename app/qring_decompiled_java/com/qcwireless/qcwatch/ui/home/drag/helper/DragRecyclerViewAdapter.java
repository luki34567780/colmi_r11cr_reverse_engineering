package com.qcwireless.qcwatch.ui.home.drag.helper;

/* compiled from: DragRecyclerViewAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0002 !B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000fH\u0017J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000fH\u0016J\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\fR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/drag/helper/DragRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/qcwireless/qcwatch/ui/home/drag/helper/DragRecyclerViewAdapter$ItemViewHolder;", "Lcom/qcwireless/qcwatch/ui/home/drag/helper/IItemTouchHelperAdapter;", "list", "", "Lcom/qcwireless/qcwatch/ui/home/drag/helper/ItemEntity;", "mDragListener", "Lcom/qcwireless/qcwatch/ui/home/drag/helper/OnStartDragListener;", "(Ljava/util/List;Lcom/qcwireless/qcwatch/ui/home/drag/helper/OnStartDragListener;)V", "dataList", "mOnClickSwitchListener", "Lcom/qcwireless/qcwatch/ui/home/drag/helper/DragRecyclerViewAdapter$OnClickSwitchListener;", "moduleTypeMap", "", "", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemDismiss", "onItemMove", "fromPosition", "toPosition", "setOnClickSwitchListener", "onClickSwitchListener", "ItemViewHolder", "OnClickSwitchListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DragRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter.ItemViewHolder> implements com.qcwireless.qcwatch.ui.home.drag.helper.IItemTouchHelperAdapter {
    private java.util.List<com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> dataList;
    private com.qcwireless.qcwatch.ui.home.drag.helper.OnStartDragListener mDragListener;
    private com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter.OnClickSwitchListener mOnClickSwitchListener;
    private java.util.Map<java.lang.Integer, java.lang.String> moduleTypeMap;

    /* compiled from: DragRecyclerViewAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/drag/helper/DragRecyclerViewAdapter$OnClickSwitchListener;", "", "onClick", "", "position", "", "isChecked", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnClickSwitchListener {
        void onClick(int position, boolean isChecked);
    }

    public DragRecyclerViewAdapter(java.util.List<com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> list, com.qcwireless.qcwatch.ui.home.drag.helper.OnStartDragListener onStartDragListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onStartDragListener, "mDragListener");
        this.dataList = list;
        this.mDragListener = onStartDragListener;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.moduleTypeMap = linkedHashMap;
        linkedHashMap.put(2, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_85));
        this.moduleTypeMap.put(1, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_84));
        this.moduleTypeMap.put(3, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_83));
        this.moduleTypeMap.put(4, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_87));
        this.moduleTypeMap.put(11, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_6666561));
        this.moduleTypeMap.put(12, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_569));
    }

    public com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter.ItemViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.qcwireless.qcwatch.R.layout.drag_item_rcv, parent, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "from(parent.context).inf…_item_rcv, parent, false)");
        return new com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter.ItemViewHolder(this, inflate);
    }

    public void onBindViewHolder(final com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter.ItemViewHolder holder, final int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = this.dataList.get(position);
        holder.getTitle().setText(this.moduleTypeMap.get(java.lang.Integer.valueOf(((com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity) objectRef.element).getModelType())));
        holder.getCheckBox().setChecked(((com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity) objectRef.element).isChecked());
        if (this.mOnClickSwitchListener != null) {
            holder.getCheckBox().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter.m960onBindViewHolder$lambda0(objectRef, this, position, view);
                }
            });
        }
        holder.getMenu().setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                boolean m961onBindViewHolder$lambda1;
                m961onBindViewHolder$lambda1 = com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter.m961onBindViewHolder$lambda1(com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter.this, holder, view, motionEvent);
                return m961onBindViewHolder$lambda1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-0, reason: not valid java name */
    public static final void m960onBindViewHolder$lambda0(kotlin.jvm.internal.Ref.ObjectRef objectRef, com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter dragRecyclerViewAdapter, int i, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$item");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dragRecyclerViewAdapter, "this$0");
        boolean isChecked = ((com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity) objectRef.element).isChecked();
        ((com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity) objectRef.element).setChecked(!isChecked);
        com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter.OnClickSwitchListener onClickSwitchListener = dragRecyclerViewAdapter.mOnClickSwitchListener;
        kotlin.jvm.internal.Intrinsics.checkNotNull(onClickSwitchListener);
        onClickSwitchListener.onClick(i, !isChecked);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-1, reason: not valid java name */
    public static final boolean m961onBindViewHolder$lambda1(com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter dragRecyclerViewAdapter, com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter.ItemViewHolder itemViewHolder, android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dragRecyclerViewAdapter, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemViewHolder, "$holder");
        if (motionEvent.getAction() != 0) {
            return false;
        }
        dragRecyclerViewAdapter.mDragListener.onStartDrag(itemViewHolder);
        return false;
    }

    public int getItemCount() {
        return this.dataList.size();
    }

    @Override // com.qcwireless.qcwatch.ui.home.drag.helper.IItemTouchHelperAdapter
    public void onItemMove(int fromPosition, int toPosition) {
        java.util.Collections.swap(this.dataList, fromPosition, toPosition);
        notifyItemMoved(fromPosition, toPosition);
        this.mDragListener.onEndDrag(this.dataList);
    }

    @Override // com.qcwireless.qcwatch.ui.home.drag.helper.IItemTouchHelperAdapter
    public void onItemDismiss(int position) {
        this.dataList.remove(position);
        notifyItemRemoved(position);
    }

    public final void setOnClickSwitchListener(com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter.OnClickSwitchListener onClickSwitchListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClickSwitchListener, "onClickSwitchListener");
        this.mOnClickSwitchListener = onClickSwitchListener;
    }

    /* compiled from: DragRecyclerViewAdapter.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/drag/helper/DragRecyclerViewAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/qcwireless/qcwatch/ui/home/drag/helper/IItemTouchHelperViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/qcwireless/qcwatch/ui/home/drag/helper/DragRecyclerViewAdapter;Landroid/view/View;)V", "checkBox", "Landroidx/appcompat/widget/AppCompatCheckBox;", "getCheckBox", "()Landroidx/appcompat/widget/AppCompatCheckBox;", "menu", "Landroid/widget/ImageView;", "getMenu", "()Landroid/widget/ImageView;", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "onItemClear", "", "onItemSelected", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements com.qcwireless.qcwatch.ui.home.drag.helper.IItemTouchHelperViewHolder {
        private final androidx.appcompat.widget.AppCompatCheckBox checkBox;
        private final android.widget.ImageView menu;
        final /* synthetic */ com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter this$0;
        private final android.widget.TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter dragRecyclerViewAdapter, android.view.View view) {
            super(view);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = dragRecyclerViewAdapter;
            android.view.View findViewById = view.findViewById(com.qcwireless.qcwatch.R.id.item_list_text_textView);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.….item_list_text_textView)");
            this.title = (android.widget.TextView) findViewById;
            android.view.View findViewById2 = view.findViewById(com.qcwireless.qcwatch.R.id.item_list_menu_imageView);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.…item_list_menu_imageView)");
            this.menu = (android.widget.ImageView) findViewById2;
            androidx.appcompat.widget.AppCompatCheckBox findViewById3 = view.findViewById(com.qcwireless.qcwatch.R.id.item_list_switchCompat);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.item_list_switchCompat)");
            this.checkBox = findViewById3;
        }

        public final android.widget.TextView getTitle() {
            return this.title;
        }

        public final android.widget.ImageView getMenu() {
            return this.menu;
        }

        public final androidx.appcompat.widget.AppCompatCheckBox getCheckBox() {
            return this.checkBox;
        }

        @Override // com.qcwireless.qcwatch.ui.home.drag.helper.IItemTouchHelperViewHolder
        public void onItemSelected() {
            this.itemView.setTranslationZ(10.0f);
        }

        @Override // com.qcwireless.qcwatch.ui.home.drag.helper.IItemTouchHelperViewHolder
        public void onItemClear() {
            this.itemView.setTranslationZ(0.0f);
        }
    }
}
