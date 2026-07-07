package com.qcwireless.qcwatch.ui.device.contact.helper;

/* compiled from: DragRecyclerViewAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001aB\u001b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\fR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/contact/helper/DragRecyclerViewAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/ContactsEntity;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lcom/qcwireless/qcwatch/ui/device/contact/helper/IItemTouchHelperAdapter;", "list", "", "mDragListener", "Lcom/qcwireless/qcwatch/ui/device/contact/helper/OnStartDragListener;", "(Ljava/util/List;Lcom/qcwireless/qcwatch/ui/device/contact/helper/OnStartDragListener;)V", "dataList", "mOnClickSwitchListener", "Lcom/qcwireless/qcwatch/ui/device/contact/helper/DragRecyclerViewAdapter$OnClickSwitchListener;", "convert", "", "holder", "item", "getItemCount", "", "onItemDismiss", "position", "onItemMove", "fromPosition", "toPosition", "setOnClickSwitchListener", "onClickSwitchListener", "OnClickSwitchListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DragRecyclerViewAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity, com.chad.library.adapter.base.viewholder.BaseViewHolder> implements com.qcwireless.qcwatch.ui.device.contact.helper.IItemTouchHelperAdapter {
    private java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> dataList;
    private com.qcwireless.qcwatch.ui.device.contact.helper.OnStartDragListener mDragListener;
    private com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter.OnClickSwitchListener mOnClickSwitchListener;

    /* compiled from: DragRecyclerViewAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/contact/helper/DragRecyclerViewAdapter$OnClickSwitchListener;", "", "onDeleteItem", "", "position", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnClickSwitchListener {
        void onDeleteItem(int position);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragRecyclerViewAdapter(java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> list, com.qcwireless.qcwatch.ui.device.contact.helper.OnStartDragListener onStartDragListener) {
        super(com.qcwireless.qcwatch.R.layout.contact_item_rcv, list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onStartDragListener, "mDragListener");
        this.dataList = list;
        this.mDragListener = onStartDragListener;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public int getItemCount() {
        return this.dataList.size();
    }

    @Override // com.qcwireless.qcwatch.ui.device.contact.helper.IItemTouchHelperAdapter
    public void onItemMove(int fromPosition, int toPosition) {
        java.util.Collections.swap(this.dataList, fromPosition, toPosition);
        notifyItemMoved(fromPosition, toPosition);
        this.mDragListener.onEndDrag(this.dataList);
    }

    @Override // com.qcwireless.qcwatch.ui.device.contact.helper.IItemTouchHelperAdapter
    public void onItemDismiss(int position) {
        this.dataList.remove(position);
        notifyItemRemoved(position);
    }

    public final void setOnClickSwitchListener(com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter.OnClickSwitchListener onClickSwitchListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClickSwitchListener, "onClickSwitchListener");
        this.mOnClickSwitchListener = onClickSwitchListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(final com.chad.library.adapter.base.viewholder.BaseViewHolder holder, final com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        if (item.getContactName().length() > 0) {
            holder.setText(com.qcwireless.qcwatch.R.id.item_list_text_textView, item.getContactName());
        } else {
            holder.setText(com.qcwireless.qcwatch.R.id.item_list_text_textView, item.getPhoneNumber());
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.getView(com.qcwireless.qcwatch.R.id.item_list_menu_imageView);
        android.widget.Button button = (android.widget.Button) holder.getView(com.qcwireless.qcwatch.R.id.btn_delete);
        imageView.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter$$ExternalSyntheticLambda1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                boolean m684convert$lambda0;
                m684convert$lambda0 = com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter.m684convert$lambda0(com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter.this, holder, view);
                return m684convert$lambda0;
            }
        });
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter.m685convert$lambda1(com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter.this, item, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convert$lambda-0, reason: not valid java name */
    public static final boolean m684convert$lambda0(com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter dragRecyclerViewAdapter, com.chad.library.adapter.base.viewholder.BaseViewHolder baseViewHolder, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dragRecyclerViewAdapter, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseViewHolder, "$holder");
        dragRecyclerViewAdapter.mDragListener.onStartDrag(baseViewHolder);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convert$lambda-1, reason: not valid java name */
    public static final void m685convert$lambda1(com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter dragRecyclerViewAdapter, com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity contactsEntity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dragRecyclerViewAdapter, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsEntity, "$item");
        com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter.OnClickSwitchListener onClickSwitchListener = dragRecyclerViewAdapter.mOnClickSwitchListener;
        if (onClickSwitchListener != null) {
            onClickSwitchListener.onDeleteItem(dragRecyclerViewAdapter.getItemPosition(contactsEntity));
        }
    }
}
