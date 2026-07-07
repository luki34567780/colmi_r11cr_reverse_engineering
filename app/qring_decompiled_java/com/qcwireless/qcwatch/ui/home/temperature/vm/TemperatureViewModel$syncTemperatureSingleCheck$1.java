package com.qcwireless.qcwatch.ui.home.temperature.vm;

/* compiled from: TemperatureViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel$syncTemperatureSingleCheck$1", f = "TemperatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class TemperatureViewModel$syncTemperatureSingleCheck$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TemperatureViewModel$syncTemperatureSingleCheck$1(com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel temperatureViewModel, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel$syncTemperatureSingleCheck$1> continuation) {
        super(2, continuation);
        this.this$0 = temperatureViewModel;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel$syncTemperatureSingleCheck$1(this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository temperatureRepository;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        temperatureRepository = this.this$0.temperatureRepository;
        temperatureRepository.initData();
        temperatureRepository.syncTodayTemperature();
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUiDelay(temperatureRepository, 500L, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel$syncTemperatureSingleCheck$1$1$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository) obj2);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository temperatureRepository2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(temperatureRepository2, "$this$ktxRunOnUiDelay");
                temperatureRepository2.syncSingleCheckTemperature(0);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
