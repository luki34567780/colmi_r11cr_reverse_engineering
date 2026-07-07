package com.qcwireless.qcwatch.ui.device.album.adapter;

/* compiled from: AlbumAdapter.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/album/adapter/AlbumAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/qcwireless/qcwatch/ui/device/album/bean/AlbumBean;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "context", "Landroid/content/Context;", "data", "", "(Landroid/content/Context;Ljava/util/List;)V", "height", "", "width", "convert", "", "holder", "item", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class AlbumAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    private int height;
    private int width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumAdapter(android.content.Context context, java.util.List<com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean> list) {
        super(com.qcwireless.qcwatch.R.layout.recycleview_item_album, list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "data");
        this.width = 368;
        this.height = 448;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.getView(com.qcwireless.qcwatch.R.id.image_select);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.getView(com.qcwireless.qcwatch.R.id.image_result);
        android.widget.TextView textView = (android.widget.TextView) holder.getView(com.qcwireless.qcwatch.R.id.tv_status);
        android.widget.TextView textView2 = (android.widget.TextView) holder.getView(com.qcwireless.qcwatch.R.id.tv_progress_value);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) holder.getView(com.qcwireless.qcwatch.R.id.progress_style);
        com.bumptech.glide.Glide.with(getContext()).load("file://" + item.getPath()).centerCrop().override(this.width, this.height).into(imageView);
        int type = item.getType();
        if (type == -1) {
            textView.setText(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_582));
            imageView2.setImageResource(com.qcwireless.qcwatch.R.mipmap.album_fail);
            com.qcwireless.qcwatch.base.view.ViewKt.visible(imageView2);
        } else if (type == 1) {
            textView.setText(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_583));
            com.qcwireless.qcwatch.base.view.ViewKt.gone(imageView2);
        } else if (type == 100) {
            textView.setText(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_581));
            imageView2.setImageResource(com.qcwireless.qcwatch.R.mipmap.album_success);
            com.qcwireless.qcwatch.base.view.ViewKt.visible(imageView2);
        } else {
            textView.setText(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_584));
            com.qcwireless.qcwatch.base.view.ViewKt.gone(imageView2);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(item.getProgress());
        sb.append('%');
        textView2.setText(sb.toString());
        progressBar.setProgress(item.getProgress());
    }
}
