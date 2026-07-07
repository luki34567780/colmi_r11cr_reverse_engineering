package com.qcwireless.qcwatch.ui.home.bloodoxgen;

/* compiled from: BloodOxygenViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel$queryLastData$1", f = "BloodOxygenViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class BloodOxygenViewModel$queryLastData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BloodOxygenViewModel$queryLastData$1(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel bloodOxygenViewModel, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel$queryLastData$1> continuation) {
        super(2, continuation);
        this.this$0 = bloodOxygenViewModel;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel$queryLastData$1(this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository bloodOxygenRepository;
        com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository bloodOxygenRepository2;
        androidx.lifecycle.MutableLiveData mutableLiveData;
        androidx.lifecycle.MutableLiveData mutableLiveData2;
        androidx.lifecycle.MutableLiveData mutableLiveData3;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        bloodOxygenRepository = this.this$0.bloodOxygenRepository;
        com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenEntity queryLastBloodOxygenDate = bloodOxygenRepository.queryLastBloodOxygenDate();
        bloodOxygenRepository2 = this.this$0.bloodOxygenRepository;
        com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity queryLastManualBloodOxygenDate = bloodOxygenRepository2.queryLastManualBloodOxygenDate();
        int timestamp = queryLastManualBloodOxygenDate != null ? queryLastManualBloodOxygenDate.getTimestamp() : 0;
        int unixTime = queryLastBloodOxygenDate != null ? (int) queryLastBloodOxygenDate.getUnixTime() : 0;
        if (unixTime > timestamp) {
            mutableLiveData3 = this.this$0._lastDate;
            mutableLiveData3.postValue(new com.qcwireless.qc_utils.date.DateUtil(unixTime, true));
        } else if (timestamp > 0) {
            mutableLiveData2 = this.this$0._lastDate;
            mutableLiveData2.postValue(new com.qcwireless.qc_utils.date.DateUtil(timestamp, true));
        } else {
            mutableLiveData = this.this$0._lastDate;
            mutableLiveData.postValue(new com.qcwireless.qc_utils.date.DateUtil());
        }
        return kotlin.Unit.INSTANCE;
    }
}
