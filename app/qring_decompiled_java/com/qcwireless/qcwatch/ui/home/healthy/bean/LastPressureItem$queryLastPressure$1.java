package com.qcwireless.qcwatch.ui.home.healthy.bean;

/* compiled from: LastPressureItem.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/home/healthy/bean/LastPressureItem;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.bean.LastPressureItem$queryLastPressure$1", f = "LastPressureItem.kt", i = {}, l = {47, 59, 69}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class LastPressureItem$queryLastPressure$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastPressureItem>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;

    LastPressureItem$queryLastPressure$1(kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastPressureItem$queryLastPressure$1> continuation) {
        super(2, continuation);
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> lastPressureItem$queryLastPressure$1 = new com.qcwireless.qcwatch.ui.home.healthy.bean.LastPressureItem$queryLastPressure$1(continuation);
        lastPressureItem$queryLastPressure$1.L$0 = obj;
        return lastPressureItem$queryLastPressure$1;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastPressureItem> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureLineChartHomeView.DataBean> queryLastPressure = com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.INSTANCE.getGetInstance().queryLastPressure();
            com.qcwireless.qcwatch.ui.base.repository.entity.PressureManualEntity queryAppPressure = com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.INSTANCE.getGetInstance().queryAppPressure();
            if (!queryLastPressure.isEmpty()) {
                if (queryAppPressure != null && queryAppPressure.getTimestamp() > queryLastPressure.get(0).getUnixTime()) {
                    com.qcwireless.qcwatch.ui.home.healthy.bean.LastPressureItem lastPressureItem = new com.qcwireless.qcwatch.ui.home.healthy.bean.LastPressureItem();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(queryAppPressure.getDateStr(), new com.qcwireless.qc_utils.date.DateUtil(queryLastPressure.get(0).getUnixTime(), true).getY_M_D())) {
                        lastPressureItem.setData(queryLastPressure);
                    } else {
                        lastPressureItem.setData(new java.util.ArrayList());
                    }
                    lastPressureItem.setDateStr(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil(queryAppPressure.getTimestamp(), true)));
                    if (queryAppPressure.getTimestamp() > queryLastPressure.get(0).getUnixTime() + queryLastPressure.get(queryLastPressure.size() - 1).getSeconds()) {
                        lastPressureItem.setValue(queryAppPressure.getPressure());
                    } else {
                        lastPressureItem.setValue(queryLastPressure.get(queryLastPressure.size() - 1).getMaxValue());
                    }
                    this.label = 1;
                    if (flowCollector.emit(lastPressureItem, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    com.qcwireless.qcwatch.ui.home.healthy.bean.LastPressureItem lastPressureItem2 = new com.qcwireless.qcwatch.ui.home.healthy.bean.LastPressureItem();
                    lastPressureItem2.setData(queryLastPressure);
                    lastPressureItem2.setDateStr(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil(queryLastPressure.get(0).getUnixTime(), true)));
                    int unixTime = queryLastPressure.get(0).getUnixTime() + queryLastPressure.get(queryLastPressure.size() - 1).getSeconds();
                    if (queryAppPressure != null && queryAppPressure.getTimestamp() > unixTime) {
                        lastPressureItem2.setValue(queryAppPressure.getPressure());
                    } else {
                        lastPressureItem2.setValue(queryLastPressure.get(queryLastPressure.size() - 1).getMaxValue());
                    }
                    this.label = 2;
                    if (flowCollector.emit(lastPressureItem2, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                com.qcwireless.qcwatch.ui.base.repository.entity.PressureManualEntity queryAppPressure2 = com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.INSTANCE.getGetInstance().queryAppPressure();
                com.qcwireless.qcwatch.ui.home.healthy.bean.LastPressureItem lastPressureItem3 = new com.qcwireless.qcwatch.ui.home.healthy.bean.LastPressureItem();
                if (queryAppPressure2 != null) {
                    lastPressureItem3.setData(new java.util.ArrayList());
                    lastPressureItem3.setDateStr(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil(queryAppPressure2.getTimestamp(), true)));
                    lastPressureItem3.setValue(queryAppPressure2.getPressure());
                }
                this.label = 3;
                if (flowCollector.emit(lastPressureItem3, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
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
