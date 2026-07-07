package com.qcwireless.qcwatch.ui.home.bloodsugar.adapter;

/* compiled from: BloodSugarDetailAdapter.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bloodsugar/adapter/BloodSugarDetailAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/qcwireless/qcwatch/ui/home/bloodsugar/bean/BloodSugarDetailBean;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "context", "Landroid/content/Context;", "data", "", "(Landroid/content/Context;Ljava/util/List;)V", "app", "", "getApp", "()Z", "setApp", "(Z)V", "convert", "", "holder", "item", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BloodSugarDetailAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    private boolean app;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodSugarDetailAdapter(android.content.Context context, java.util.List<com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean> list) {
        super(com.qcwireless.qcwatch.R.layout.recycle_view_blood_sugar_detail, list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "data");
    }

    public final boolean getApp() {
        return this.app;
    }

    public final void setApp(boolean z) {
        this.app = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        if (this.app) {
            holder.setText(com.qcwireless.qcwatch.R.id.blood_sugar_value, item.getMaxValue() + "mmol/L");
            holder.setText(com.qcwireless.qcwatch.R.id.blood_sugar_time, java.lang.String.valueOf(new com.oudmon.ble.base.util.DateUtil((long) item.getSeconds(), true).getHHmmDate()));
            return;
        }
        long zeroTime = new com.oudmon.ble.base.util.DateUtil().getZeroTime();
        java.lang.String str = item.getMinValue() + '-' + item.getMaxValue() + "mmol/L";
        java.lang.String hHmmDate = new com.oudmon.ble.base.util.DateUtil(item.getSeconds() + zeroTime, true).getHHmmDate();
        java.lang.String hHmmDate2 = new com.oudmon.ble.base.util.DateUtil(zeroTime + item.getSeconds() + 3600, true).getHHmmDate();
        holder.setText(com.qcwireless.qcwatch.R.id.blood_sugar_value, str);
        holder.setText(com.qcwireless.qcwatch.R.id.blood_sugar_time, hHmmDate + '-' + hHmmDate2);
    }
}
