package com.qcwireless.qcwatch.ui.plate.adapter;

/* compiled from: DeviceWatchFaceListAdapter.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/adapter/DeviceWatchFaceListAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/qcwireless/qcwatch/ui/plate/bean/DeviceWatchFaceBean;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_deletePosition", "Landroidx/lifecycle/MutableLiveData;", "", "deletePosition", "Landroidx/lifecycle/LiveData;", "getDeletePosition", "()Landroidx/lifecycle/LiveData;", "convert", "", "holder", "item", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DeviceWatchFaceListAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _deletePosition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceWatchFaceListAdapter(android.content.Context context) {
        super(com.qcwireless.qcwatch.R.layout.recycleview_item_watch_face_device, null, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this._deletePosition = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<java.lang.Integer> getDeletePosition() {
        return this._deletePosition;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, final com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.getView(com.qcwireless.qcwatch.R.id.image_watch_face);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.getView(com.qcwireless.qcwatch.R.id.image_delete);
        if (item.getDelete()) {
            com.qcwireless.qcwatch.base.view.ViewKt.visible(imageView2);
        } else {
            com.qcwireless.qcwatch.base.view.ViewKt.gone(imageView2);
        }
        if (item.getWatchFace().getLocalImageUrl().length() > 0) {
            com.bumptech.glide.Glide.with(getContext()).load("file://" + item.getWatchFace().getLocalImageUrl()).signature(new com.bumptech.glide.signature.ObjectKey(item.getWatchFace().getName())).fitCenter().into(imageView);
        } else {
            com.bumptech.glide.Glide.with(getContext()).load(item.getWatchFace().getPreImageUrl()).signature(new com.bumptech.glide.signature.ObjectKey(item.getWatchFace().getName())).fitCenter().into(imageView);
        }
        imageView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter.m1375convert$lambda0(com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter.this, item, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convert$lambda-0, reason: not valid java name */
    public static final void m1375convert$lambda0(com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter deviceWatchFaceListAdapter, com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean deviceWatchFaceBean, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWatchFaceListAdapter, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWatchFaceBean, "$item");
        deviceWatchFaceListAdapter._deletePosition.postValue(java.lang.Integer.valueOf(deviceWatchFaceListAdapter.getItemPosition(deviceWatchFaceBean)));
    }
}
