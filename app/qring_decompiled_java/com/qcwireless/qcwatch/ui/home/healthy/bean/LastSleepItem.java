package com.qcwireless.qcwatch.ui.home.healthy.bean;

/* compiled from: LastSleepItem.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/bean/LastSleepItem;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "()V", "itemType", "", "getItemType", "()I", "calcLastSleep", "Lkotlinx/coroutines/flow/Flow;", "Lcom/qcwireless/qcwatch/ui/home/sleep/bean/SleepViewBean;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class LastSleepItem implements com.chad.library.adapter.base.entity.MultiItemEntity {
    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return 1;
    }

    public final kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean> calcLastSleep() {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.home.healthy.bean.LastSleepItem$calcLastSleep$1(null)), new com.qcwireless.qcwatch.ui.home.healthy.bean.LastSleepItem$calcLastSleep$2(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.home.healthy.bean.LastSleepItem$calcLastSleep$3(null));
    }
}
