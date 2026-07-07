package com.qcwireless.qcwatch.ui.home.pressure.day;

/* compiled from: DayPressureFragmentViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel$queryLastData$1", f = "DayPressureFragmentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class DayPressureFragmentViewModel$queryLastData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DayPressureFragmentViewModel$queryLastData$1(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel dayPressureFragmentViewModel, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel$queryLastData$1> continuation) {
        super(2, continuation);
        this.this$0 = dayPressureFragmentViewModel;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel$queryLastData$1(this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository pressureRepository;
        com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository pressureRepository2;
        androidx.lifecycle.MutableLiveData mutableLiveData;
        androidx.lifecycle.MutableLiveData mutableLiveData2;
        androidx.lifecycle.MutableLiveData mutableLiveData3;
        androidx.lifecycle.MutableLiveData mutableLiveData4;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        pressureRepository = this.this$0.pressureRepository;
        com.qcwireless.qcwatch.ui.base.repository.entity.PressureDetail queryLastPressureDate = pressureRepository.queryLastPressureDate();
        pressureRepository2 = this.this$0.pressureRepository;
        com.qcwireless.qcwatch.ui.base.repository.entity.PressureManualEntity queryAppPressure = pressureRepository2.queryAppPressure();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, queryLastPressureDate);
        if (queryLastPressureDate == null) {
            if (queryAppPressure != null) {
                mutableLiveData4 = this.this$0._lastDate;
                mutableLiveData4.postValue(new com.qcwireless.qc_utils.date.DateUtil(queryAppPressure.getTimestamp(), true));
            } else {
                mutableLiveData3 = this.this$0._lastDate;
                mutableLiveData3.postValue(new com.qcwireless.qc_utils.date.DateUtil());
            }
        } else if (queryAppPressure == null || queryAppPressure.getTimestamp() <= queryLastPressureDate.getUnixTime()) {
            mutableLiveData = this.this$0._lastDate;
            mutableLiveData.postValue(new com.qcwireless.qc_utils.date.DateUtil(queryLastPressureDate.getUnixTime(), true));
        } else {
            mutableLiveData2 = this.this$0._lastDate;
            mutableLiveData2.postValue(new com.qcwireless.qc_utils.date.DateUtil(queryAppPressure.getTimestamp(), true));
        }
        return kotlin.Unit.INSTANCE;
    }
}
