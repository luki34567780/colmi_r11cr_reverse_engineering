package com.qcwireless.qcwatch.ui.mine.skin.adapter;

/* compiled from: SkinSelectAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/skin/adapter/SkinSelectAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/qcwireless/qcwatch/ui/mine/skin/bean/SkinSelectBean;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "()V", "convert", "", "holder", "item", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class SkinSelectAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.qcwireless.qcwatch.ui.mine.skin.bean.SkinSelectBean, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    public SkinSelectAdapter() {
        super(com.qcwireless.qcwatch.R.layout.recycleview_item_skin, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, com.qcwireless.qcwatch.ui.mine.skin.bean.SkinSelectBean item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        com.qcwireless.qcwatch.ui.base.view.skin.QSkinItemView qSkinItemView = (com.qcwireless.qcwatch.ui.base.view.skin.QSkinItemView) holder.getView(com.qcwireless.qcwatch.R.id.skin_item);
        qSkinItemView.setCheckStatus(item.getCheck());
        int type = item.getType();
        if (type == com.qcwireless.qcwatch.ui.mine.skin.util.SkinType.INSTANCE.getSkin_Default()) {
            qSkinItemView.setSkinBg(com.qcwireless.qcwatch.R.drawable.bg_gradient_skin_defalut);
            qSkinItemView.setSkinName(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_298));
            return;
        }
        if (type == com.qcwireless.qcwatch.ui.mine.skin.util.SkinType.INSTANCE.getSkin_Blue()) {
            qSkinItemView.setSkinBg(com.qcwireless.qcwatch.R.drawable.bg_gradient_skin_blue);
            qSkinItemView.setSkinName(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_302));
        } else if (type == com.qcwireless.qcwatch.ui.mine.skin.util.SkinType.INSTANCE.getSkin_Black()) {
            qSkinItemView.setSkinBg(com.qcwireless.qcwatch.R.drawable.bg_gradient_skin_black);
            qSkinItemView.setSkinName(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_301));
        } else if (type == com.qcwireless.qcwatch.ui.mine.skin.util.SkinType.INSTANCE.getSkin_Pink()) {
            qSkinItemView.setSkinBg(com.qcwireless.qcwatch.R.drawable.bg_gradient_skin_pink);
            qSkinItemView.setSkinName(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_299));
        }
    }
}
