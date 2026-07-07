package com.qcwireless.qcwatch.ui.home.bp;

/* compiled from: BloodPressureViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel$syncBp$1", f = "BloodPressureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class BloodPressureViewModel$syncBp$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BloodPressureViewModel$syncBp$1(com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel bloodPressureViewModel, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel$syncBp$1> continuation) {
        super(2, continuation);
        this.this$0 = bloodPressureViewModel;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel$syncBp$1(this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository bloodPressureRepository;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        bloodPressureRepository = this.this$0.bloodPressureRepository;
        final com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel bloodPressureViewModel = this.this$0;
        bloodPressureRepository.syncAutoBp(new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp>() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel$syncBp$1$1$1
            @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
            public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp t) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                final com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel bloodPressureViewModel2 = com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel$syncBp$1$1$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel$syncBp$1$1$1$result$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                        invoke((com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel$syncBp$1$1$1) obj2);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel$syncBp$1$1$1 bloodPressureViewModel$syncBp$1$1$1) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureViewModel$syncBp$1$1$1, "$this$ktxRunOnBgSingle");
                        com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.this.queryBloodPressureByDateDetail(new com.qcwireless.qc_utils.date.DateUtil());
                    }
                });
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
