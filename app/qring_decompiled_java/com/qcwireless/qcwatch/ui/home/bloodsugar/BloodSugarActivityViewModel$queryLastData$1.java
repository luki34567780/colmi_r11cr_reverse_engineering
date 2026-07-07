package com.qcwireless.qcwatch.ui.home.bloodsugar;

/* compiled from: BloodSugarActivityViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel$queryLastData$1", f = "BloodSugarActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class BloodSugarActivityViewModel$queryLastData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BloodSugarActivityViewModel$queryLastData$1(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel bloodSugarActivityViewModel, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel$queryLastData$1> continuation) {
        super(2, continuation);
        this.this$0 = bloodSugarActivityViewModel;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel$queryLastData$1(this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository bloodSugarRepository;
        androidx.lifecycle.MutableLiveData mutableLiveData;
        androidx.lifecycle.MutableLiveData mutableLiveData2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        bloodSugarRepository = this.this$0.bloodSugarRepository;
        com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity queryLastBloodSugarDate = bloodSugarRepository.queryLastBloodSugarDate();
        if (queryLastBloodSugarDate == null) {
            mutableLiveData2 = this.this$0._lastDate;
            mutableLiveData2.postValue(new com.qcwireless.qc_utils.date.DateUtil());
        } else {
            mutableLiveData = this.this$0._lastDate;
            mutableLiveData.postValue(new com.qcwireless.qc_utils.date.DateUtil(queryLastBloodSugarDate.getUnixTime(), true));
        }
        return kotlin.Unit.INSTANCE;
    }
}
