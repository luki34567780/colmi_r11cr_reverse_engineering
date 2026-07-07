package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: MenstruationRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$addMenstruationData$2", f = "MenstruationRepository.kt", i = {}, l = {239}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class MenstruationRepository$addMenstruationData$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super java.util.Map<java.lang.String, ? extends java.lang.Integer>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.qcwireless.qc_utils.date.DateUtil $d;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MenstruationRepository$addMenstruationData$2(com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository menstruationRepository, com.qcwireless.qc_utils.date.DateUtil dateUtil, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$addMenstruationData$2> continuation) {
        super(2, continuation);
        this.this$0 = menstruationRepository;
        this.$d = dateUtil;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> menstruationRepository$addMenstruationData$2 = new com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$addMenstruationData$2(this.this$0, this.$d, continuation);
        menstruationRepository$addMenstruationData$2.L$0 = obj;
        return menstruationRepository$addMenstruationData$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.util.Map<java.lang.String, java.lang.Integer>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean queryMenstruationSetting;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            queryMenstruationSetting = this.this$0.queryMenstruationSetting();
            java.util.List<com.qcwireless.qc_utils.date.DateUtil> loadMonthData = this.this$0.loadMonthData(this.$d.getYear(), this.$d.getMonth());
            com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity queryMaxStartTime = this.this$0.queryMaxStartTime();
            if (queryMaxStartTime != null) {
                this.this$0.showCurrMonth(linkedHashMap, new com.qcwireless.qc_utils.date.DateUtil(queryMaxStartTime.getStartTime(), true), queryMenstruationSetting);
            }
            java.util.List<com.qcwireless.qc_utils.date.DateUtil> loadPreData = this.this$0.loadPreData();
            if (loadPreData != null && (!loadPreData.isEmpty())) {
                int size = loadPreData.size();
                for (int i2 = 0; i2 < size; i2++) {
                    com.qcwireless.qc_utils.date.DateUtil dateUtil = loadPreData.get(i2);
                    java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil(dateUtil.getYear(), dateUtil.getMonth(), dateUtil.getDay()).getY_M_D();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil(d2.year, d2.month, d2.day).y_M_D");
                    linkedHashMap.put(y_m_d, kotlin.coroutines.jvm.internal.Boxing.boxInt(1));
                }
            }
            if (loadMonthData != null && (!loadMonthData.isEmpty())) {
                int size2 = loadMonthData.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    com.qcwireless.qc_utils.date.DateUtil dateUtil2 = loadMonthData.get(i3);
                    java.lang.String y_m_d2 = new com.qcwireless.qc_utils.date.DateUtil(dateUtil2.getYear(), dateUtil2.getMonth(), dateUtil2.getDay()).getY_M_D();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "DateUtil(d2.year, d2.month, d2.day).y_M_D");
                    linkedHashMap.put(y_m_d2, kotlin.coroutines.jvm.internal.Boxing.boxInt(3));
                }
            }
            this.label = 1;
            if (flowCollector.emit(linkedHashMap, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
