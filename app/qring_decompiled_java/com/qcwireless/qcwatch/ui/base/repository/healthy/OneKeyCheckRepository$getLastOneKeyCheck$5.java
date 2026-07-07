package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: OneKeyCheckRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/home/healthy/bean/LastOneKeyBean;", "t", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.healthy.OneKeyCheckRepository$getLastOneKeyCheck$5", f = "OneKeyCheckRepository.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class OneKeyCheckRepository$getLastOneKeyCheck$5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $mac;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.healthy.OneKeyCheckRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneKeyCheckRepository$getLastOneKeyCheck$5(com.qcwireless.qcwatch.ui.base.repository.healthy.OneKeyCheckRepository oneKeyCheckRepository, java.lang.String str, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.healthy.OneKeyCheckRepository$getLastOneKeyCheck$5> continuation) {
        super(3, continuation);
        this.this$0 = oneKeyCheckRepository;
        this.$mac = str;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.qcwireless.qcwatch.ui.base.repository.healthy.OneKeyCheckRepository$getLastOneKeyCheck$5 oneKeyCheckRepository$getLastOneKeyCheck$5 = new com.qcwireless.qcwatch.ui.base.repository.healthy.OneKeyCheckRepository$getLastOneKeyCheck$5(this.this$0, this.$mac, continuation);
        oneKeyCheckRepository$getLastOneKeyCheck$5.L$0 = flowCollector;
        oneKeyCheckRepository$getLastOneKeyCheck$5.L$1 = th;
        return oneKeyCheckRepository$getLastOneKeyCheck$5.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            ((java.lang.Throwable) this.L$1).printStackTrace();
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, kotlin.Unit.INSTANCE);
            final com.qcwireless.qcwatch.ui.base.repository.healthy.OneKeyCheckRepository oneKeyCheckRepository = this.this$0;
            final java.lang.String str = this.$mac;
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(flowCollector, new kotlin.jvm.functions.Function1<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean>, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.OneKeyCheckRepository$getLastOneKeyCheck$5.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    invoke((kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean>) obj2);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean> flowCollector2) {
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao qcDeviceSettingDao;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowCollector2, "$this$ktxRunOnBgSingle");
                    qcDeviceSettingDao = com.qcwireless.qcwatch.ui.base.repository.healthy.OneKeyCheckRepository.this.qcDeviceSettingDao;
                    qcDeviceSettingDao.insert(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(str, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.LastOneKeyCheck, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(new com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean())));
                }
            });
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(new com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean(), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
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
