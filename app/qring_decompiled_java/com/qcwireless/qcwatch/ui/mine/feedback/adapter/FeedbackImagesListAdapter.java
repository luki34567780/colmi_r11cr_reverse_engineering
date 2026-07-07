package com.qcwireless.qcwatch.ui.mine.feedback.adapter;

/* compiled from: FeedbackImagesListAdapter.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/feedback/adapter/FeedbackImagesListAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/qcwireless/qcwatch/ui/mine/feedback/bean/FeedbackImageBean;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_deletePosition", "Landroidx/lifecycle/MutableLiveData;", "", "deletePosition", "Landroidx/lifecycle/LiveData;", "getDeletePosition", "()Landroidx/lifecycle/LiveData;", "convert", "", "holder", "item", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class FeedbackImagesListAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.qcwireless.qcwatch.ui.mine.feedback.bean.FeedbackImageBean, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _deletePosition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackImagesListAdapter(android.content.Context context) {
        super(com.qcwireless.qcwatch.R.layout.recycleview_item_feedback_image, null, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this._deletePosition = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<java.lang.Integer> getDeletePosition() {
        return this._deletePosition;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, final com.qcwireless.qcwatch.ui.mine.feedback.bean.FeedbackImageBean item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.getView(com.qcwireless.qcwatch.R.id.image_feedback_image);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.getView(com.qcwireless.qcwatch.R.id.image_delete);
        com.bumptech.glide.Glide.with(getContext()).load("file://" + item.getPath()).into(imageView);
        imageView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.adapter.FeedbackImagesListAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.feedback.adapter.FeedbackImagesListAdapter.m1290convert$lambda0(com.qcwireless.qcwatch.ui.mine.feedback.adapter.FeedbackImagesListAdapter.this, item, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convert$lambda-0, reason: not valid java name */
    public static final void m1290convert$lambda0(com.qcwireless.qcwatch.ui.mine.feedback.adapter.FeedbackImagesListAdapter feedbackImagesListAdapter, com.qcwireless.qcwatch.ui.mine.feedback.bean.FeedbackImageBean feedbackImageBean, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feedbackImagesListAdapter, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feedbackImageBean, "$item");
        feedbackImagesListAdapter._deletePosition.postValue(java.lang.Integer.valueOf(feedbackImagesListAdapter.getItemPosition(feedbackImageBean)));
    }
}
