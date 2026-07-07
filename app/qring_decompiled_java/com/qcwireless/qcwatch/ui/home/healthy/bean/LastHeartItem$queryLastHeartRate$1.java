package com.qcwireless.qcwatch.ui.home.healthy.bean;

/* compiled from: LastHeartItem.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/home/healthy/bean/LastHeartItem;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem$queryLastHeartRate$1", f = "LastHeartItem.kt", i = {}, l = {56, 75, 85}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class LastHeartItem$queryLastHeartRate$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;

    LastHeartItem$queryLastHeartRate$1(kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem$queryLastHeartRate$1> continuation) {
        super(2, continuation);
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> lastHeartItem$queryLastHeartRate$1 = new com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem$queryLastHeartRate$1(continuation);
        lastHeartItem$queryLastHeartRate$1.L$0 = obj;
        return lastHeartItem$queryLastHeartRate$1;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            java.util.List<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> queryLastHeartDetail = com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.INSTANCE.getGetInstance().queryLastHeartDetail();
            if (!queryLastHeartDetail.isEmpty()) {
                com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity queryAppHeartLast = com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.INSTANCE.getGetInstance().queryAppHeartLast();
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, queryAppHeartLast);
                if (queryAppHeartLast != null && queryAppHeartLast.getTimestamp() > queryLastHeartDetail.get(0).getUnixTime()) {
                    com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem lastHeartItem = new com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(queryAppHeartLast.getDateStr(), new com.qcwireless.qc_utils.date.DateUtil(queryLastHeartDetail.get(0).getUnixTime(), true).getY_M_D())) {
                        lastHeartItem.setData(queryLastHeartDetail);
                    } else {
                        lastHeartItem.setData(new java.util.ArrayList());
                    }
                    lastHeartItem.setDateStr(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil(queryAppHeartLast.getTimestamp(), true)));
                    if (queryAppHeartLast.getTimestamp() > queryLastHeartDetail.get(0).getUnixTime() + (queryLastHeartDetail.get(queryLastHeartDetail.size() - 1).getMin() * 60)) {
                        lastHeartItem.setValue(queryAppHeartLast.getHeart());
                    } else {
                        lastHeartItem.setValue(queryLastHeartDetail.get(queryLastHeartDetail.size() - 1).getValue());
                    }
                    this.label = 1;
                    if (flowCollector.emit(lastHeartItem, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity queryAppHeartLast2 = com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.INSTANCE.getGetInstance().queryAppHeartLast(new com.qcwireless.qc_utils.date.DateUtil(queryLastHeartDetail.get(0).getUnixTime(), true));
                    com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem lastHeartItem2 = new com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem();
                    lastHeartItem2.setData(queryLastHeartDetail);
                    lastHeartItem2.setDateStr(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil(queryLastHeartDetail.get(0).getUnixTime(), true)));
                    long unixTime = queryLastHeartDetail.get(0).getUnixTime() + (queryLastHeartDetail.get(queryLastHeartDetail.size() - 1).getMin() * 60);
                    if (queryAppHeartLast2 != null && queryAppHeartLast2.getTimestamp() > unixTime) {
                        lastHeartItem2.setValue(queryAppHeartLast2.getHeart());
                    } else {
                        lastHeartItem2.setValue(queryLastHeartDetail.get(queryLastHeartDetail.size() - 1).getValue());
                    }
                    this.label = 2;
                    if (flowCollector.emit(lastHeartItem2, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity queryAppHeartLast3 = com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.INSTANCE.getGetInstance().queryAppHeartLast(new com.qcwireless.qc_utils.date.DateUtil());
                com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem lastHeartItem3 = new com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem();
                lastHeartItem3.setData(new java.util.ArrayList());
                if (queryAppHeartLast3 != null) {
                    lastHeartItem3.setDateStr(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil()));
                    lastHeartItem3.setValue(queryAppHeartLast3.getHeart());
                }
                this.label = 3;
                if (flowCollector.emit(lastHeartItem3, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1 || i == 2 || i == 3) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return kotlin.Unit.INSTANCE;
    }
}
