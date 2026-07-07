package com.qcwireless.qcwatch.ui.home.gps.service;

/* compiled from: TrackingService.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.gps.service.TrackingService$startTimer$1", f = "TrackingService.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class TrackingService$startTimer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.gps.service.TrackingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackingService$startTimer$1(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService trackingService, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.gps.service.TrackingService$startTimer$1> continuation) {
        super(2, continuation);
        this.this$0 = trackingService;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.home.gps.service.TrackingService$startTimer$1(this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        androidx.lifecycle.MutableLiveData mutableLiveData;
        androidx.lifecycle.MutableLiveData mutableLiveData2;
        long j9;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0 || i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            do {
                java.lang.Object value = com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.INSTANCE.isTracking().getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(value);
                if (((java.lang.Boolean) value).booleanValue()) {
                    com.qcwireless.qcwatch.ui.home.gps.service.TrackingService trackingService = this.this$0;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    j3 = this.this$0.timeStarted;
                    trackingService.lapTime = currentTimeMillis - j3;
                    androidx.lifecycle.MutableLiveData<java.lang.Long> timeRunInMillis = com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.INSTANCE.getTimeRunInMillis();
                    j4 = this.this$0.timeRun;
                    j5 = this.this$0.lapTime;
                    timeRunInMillis.postValue(kotlin.coroutines.jvm.internal.Boxing.boxLong(j4 + j5));
                    org.greenrobot.eventbus.EventBus eventBus = org.greenrobot.eventbus.EventBus.getDefault();
                    j6 = this.this$0.timeRun;
                    j7 = this.this$0.lapTime;
                    eventBus.post(new com.qcwireless.qcwatch.base.event.DeviceGpsTimeEvent(j6 + j7));
                    java.lang.Object value2 = com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.INSTANCE.getTimeRunInMillis().getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(value2);
                    long longValue = ((java.lang.Number) value2).longValue();
                    j8 = this.this$0.lastSeconTimeStamp;
                    if (longValue >= j8 + 1000) {
                        mutableLiveData = this.this$0.timeRunInSeconds;
                        mutableLiveData2 = this.this$0.timeRunInSeconds;
                        java.lang.Object value3 = mutableLiveData2.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(value3);
                        mutableLiveData.postValue(kotlin.coroutines.jvm.internal.Boxing.boxLong(((java.lang.Number) value3).longValue() + 1));
                        com.qcwireless.qcwatch.ui.home.gps.service.TrackingService trackingService2 = this.this$0;
                        j9 = trackingService2.lastSeconTimeStamp;
                        trackingService2.lastSeconTimeStamp = j9 + 1000;
                    }
                    this.label = 1;
                } else {
                    com.qcwireless.qcwatch.ui.home.gps.service.TrackingService trackingService3 = this.this$0;
                    j = trackingService3.timeRun;
                    j2 = this.this$0.lapTime;
                    trackingService3.timeRun = j + j2;
                    return kotlin.Unit.INSTANCE;
                }
            } while (kotlinx.coroutines.DelayKt.delay(1000L, (kotlin.coroutines.Continuation) this) != coroutine_suspended);
            return coroutine_suspended;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
