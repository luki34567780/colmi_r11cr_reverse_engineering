package com.qcwireless.qcwatch.ui.home.healthy.bean;

/* compiled from: LastBodyTemperatureItem.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/home/healthy/bean/LastBodyTemperatureItem;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem$lastTemperature$1", f = "LastBodyTemperatureItem.kt", i = {}, l = {35, 37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class LastBodyTemperatureItem$lastTemperature$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;

    LastBodyTemperatureItem$lastTemperature$1(kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem$lastTemperature$1> continuation) {
        super(2, continuation);
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> lastBodyTemperatureItem$lastTemperature$1 = new com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem$lastTemperature$1(continuation);
        lastBodyTemperatureItem$lastTemperature$1.L$0 = obj;
        return lastBodyTemperatureItem$lastTemperature$1;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            java.util.List<com.qcwireless.qcwatch.ui.base.view.QTemperatureLineHomeChartView.TemperatureDataBean> queryTemperatureLast = com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository.INSTANCE.getGetInstance().queryTemperatureLast();
            if (!queryTemperatureLast.isEmpty()) {
                com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem lastBodyTemperatureItem = new com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem();
                lastBodyTemperatureItem.setData(queryTemperatureLast);
                lastBodyTemperatureItem.setDateStr(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil(queryTemperatureLast.get(0).getUnixTime(), true)));
                lastBodyTemperatureItem.setValue(queryTemperatureLast.get(queryTemperatureLast.size() - 1).getValue());
                this.label = 1;
                if (flowCollector.emit(lastBodyTemperatureItem, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.label = 2;
                if (flowCollector.emit(new com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem(), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1 || i == 2) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return kotlin.Unit.INSTANCE;
    }
}
