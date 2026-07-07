package com.qcwireless.qcwatch.ui.home.healthy.bean;

/* compiled from: LastMenstruationItem.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/bean/LastMenstruationItem;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "()V", "date", "", "getDate", "()Ljava/lang/String;", "dateStr", "getDateStr", "itemType", "", "getItemType", "()I", "queryTodayStatus", "Lkotlinx/coroutines/flow/Flow;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class LastMenstruationItem implements com.chad.library.adapter.base.entity.MultiItemEntity {
    private final java.lang.String date = com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil());
    private final java.lang.String dateStr;

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return 5;
    }

    public LastMenstruationItem() {
        java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
        this.dateStr = y_m_d;
    }

    public final java.lang.String getDate() {
        return this.date;
    }

    public final java.lang.String getDateStr() {
        return this.dateStr;
    }

    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> queryTodayStatus() {
        return kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.home.healthy.bean.LastMenstruationItem$queryTodayStatus$1(this, null)), new com.qcwireless.qcwatch.ui.home.healthy.bean.LastMenstruationItem$queryTodayStatus$2(null)), new com.qcwireless.qcwatch.ui.home.healthy.bean.LastMenstruationItem$queryTodayStatus$3(null)), kotlinx.coroutines.Dispatchers.getIO());
    }
}
