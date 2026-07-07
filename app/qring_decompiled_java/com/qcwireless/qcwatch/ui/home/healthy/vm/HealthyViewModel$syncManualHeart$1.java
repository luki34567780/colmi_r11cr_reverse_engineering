package com.qcwireless.qcwatch.ui.home.healthy.vm;

/* compiled from: HealthyViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncManualHeart$1", f = "HealthyViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class HealthyViewModel$syncManualHeart$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthyViewModel$syncManualHeart$1(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncManualHeart$1> continuation) {
        super(2, continuation);
        this.this$0 = healthyViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-1$lambda-0, reason: not valid java name */
    public static final void m1085invokeSuspend$lambda1$lambda0(com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate manualHeartRate) {
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncManualHeart$1(this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        heartRateDetailRepository = this.this$0.heartDetailRepository;
        heartRateDetailRepository.syncManualHeartRate(new com.oudmon.ble.base.communication.bigData.resp.ILargeDataManualHeartRateResponse() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncManualHeart$1$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.bigData.resp.ILargeDataManualHeartRateResponse
            public final void manualHeart(com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate manualHeartRate) {
                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncManualHeart$1.m1085invokeSuspend$lambda1$lambda0(manualHeartRate);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
