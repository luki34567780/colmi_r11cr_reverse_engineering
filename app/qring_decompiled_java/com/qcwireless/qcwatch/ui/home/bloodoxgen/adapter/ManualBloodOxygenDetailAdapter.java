package com.qcwireless.qcwatch.ui.home.bloodoxgen.adapter;

/* compiled from: ManualBloodOxygenDetailAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0014¨\u0006\r"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bloodoxgen/adapter/ManualBloodOxygenDetailAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/qcwireless/qcwatch/ui/home/bloodoxgen/bean/BloodOxyDetailBean;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "context", "Landroid/content/Context;", "data", "", "(Landroid/content/Context;Ljava/util/List;)V", "convert", "", "holder", "item", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ManualBloodOxygenDetailAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualBloodOxygenDetailAdapter(android.content.Context context, java.util.List<com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean> list) {
        super(com.qcwireless.qcwatch.R.layout.recycle_view_blood_oxygen_manual_detail, list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "data");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(item.getMinValue());
        sb.append('%');
        java.lang.String sb2 = sb.toString();
        java.lang.String hHmmDate = new com.oudmon.ble.base.util.DateUtil(item.getSeconds(), true).getHHmmDate();
        holder.setText(com.qcwireless.qcwatch.R.id.blood_oxygen_value, sb2);
        holder.setText(com.qcwireless.qcwatch.R.id.blood_oxygen_time, hHmmDate);
    }
}
