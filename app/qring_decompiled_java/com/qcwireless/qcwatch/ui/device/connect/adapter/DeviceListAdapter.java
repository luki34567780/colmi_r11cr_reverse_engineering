package com.qcwireless.qcwatch.ui.device.connect.adapter;

/* compiled from: DeviceListAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0014¨\u0006\r"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/connect/adapter/DeviceListAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/qcwireless/qcwatch/ui/device/connect/bean/SmartWatch;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "context", "Landroid/content/Context;", "data", "", "(Landroid/content/Context;Ljava/util/List;)V", "convert", "", "holder", "item", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DeviceListAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceListAdapter(android.content.Context context, java.util.List<com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch> list) {
        super(com.qcwireless.qcwatch.R.layout.recycleview_item_device, list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "data");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        java.lang.String deviceName = item.getDeviceName();
        if (kotlin.text.StringsKt.startsWith$default(deviceName, "O_", false, 2, (java.lang.Object) null)) {
            deviceName = deviceName.substring(2, deviceName.length());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceName, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        holder.setText(com.qcwireless.qcwatch.R.id.rcv_device_name, deviceName);
        holder.setText(com.qcwireless.qcwatch.R.id.rcv_device_address, item.getDeviceAddress());
    }
}
