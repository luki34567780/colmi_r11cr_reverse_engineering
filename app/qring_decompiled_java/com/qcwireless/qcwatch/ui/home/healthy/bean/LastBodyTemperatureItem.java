package com.qcwireless.qcwatch.ui.home.healthy.bean;

/* compiled from: LastBodyTemperatureItem.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u001bR\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/bean/LastBodyTemperatureItem;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "()V", "data", "", "Lcom/qcwireless/qcwatch/ui/base/view/QTemperatureLineHomeChartView$TemperatureDataBean;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "dateStr", "", "getDateStr", "()Ljava/lang/String;", "setDateStr", "(Ljava/lang/String;)V", "itemType", "", "getItemType", "()I", "value", "", "getValue", "()F", "setValue", "(F)V", "lastTemperature", "Lkotlinx/coroutines/flow/Flow;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class LastBodyTemperatureItem implements com.chad.library.adapter.base.entity.MultiItemEntity {
    private java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QTemperatureLineHomeChartView.TemperatureDataBean> data;
    private java.lang.String dateStr;
    private float value;

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return 6;
    }

    public LastBodyTemperatureItem() {
        java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
        this.dateStr = y_m_d;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QTemperatureLineHomeChartView.TemperatureDataBean> getData() {
        return this.data;
    }

    public final void setData(java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QTemperatureLineHomeChartView.TemperatureDataBean> list) {
        this.data = list;
    }

    public final java.lang.String getDateStr() {
        return this.dateStr;
    }

    public final void setDateStr(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateStr = str;
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f) {
        this.value = f;
    }

    public final kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem> lastTemperature() {
        return kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem$lastTemperature$1(null)), new com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem$lastTemperature$2(null)), new com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem$lastTemperature$3(null)), kotlinx.coroutines.Dispatchers.getIO());
    }
}
