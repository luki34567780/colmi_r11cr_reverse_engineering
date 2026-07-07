package com.qcwireless.qcwatch.ui.device.music.adapter;

/* compiled from: MusicMenuListAdapter.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/adapter/MusicMenuListAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/qcwireless/qcwatch/ui/device/music/bean/MenuSongBean;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_deletePosition", "Landroidx/lifecycle/MutableLiveData;", "", "deletePosition", "Landroidx/lifecycle/LiveData;", "getDeletePosition", "()Landroidx/lifecycle/LiveData;", "convert", "", "holder", "item", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MusicMenuListAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _deletePosition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMenuListAdapter(android.content.Context context) {
        super(com.qcwireless.qcwatch.R.layout.recycleview_item_music_menu, null, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this._deletePosition = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<java.lang.Integer> getDeletePosition() {
        return this._deletePosition;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.getView(com.qcwireless.qcwatch.R.id.tv_menu_name);
        android.widget.TextView textView2 = (android.widget.TextView) holder.getView(com.qcwireless.qcwatch.R.id.tv_song_count);
        textView.setText(item.getMenuName());
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_541), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(item.getSongCounts())}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        textView2.setText(format);
    }
}
