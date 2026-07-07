package com.qcwireless.qcwatch.ui.activity;

/* compiled from: MainActivity.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.activity.MainActivity$deviceScanConfig$1", f = "MainActivity.kt", i = {}, l = {269, 269}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class MainActivity$deviceScanConfig$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;

    MainActivity$deviceScanConfig$1(kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.activity.MainActivity$deviceScanConfig$1> continuation) {
        super(2, continuation);
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.activity.MainActivity$deviceScanConfig$1(continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.INSTANCE.getGetInstance().getDeviceScanConfigFromServer(com.qcwireless.qcwatch.base.view.GlobalKt.getAppName(), (kotlin.coroutines.Continuation) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.activity.MainActivity$deviceScanConfig$1.1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.String>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.String> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.String valueOf = java.lang.String.valueOf(netState.isSuccess());
                if (valueOf.length() > 0) {
                    java.util.Iterator it = kotlin.text.StringsKt.split$default(valueOf, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null).iterator();
                    while (it.hasNext()) {
                        com.qcwireless.qcwatch.QJavaApplication.getInstance().putScanKeys((java.lang.String) it.next());
                    }
                    com.oudmon.ble.base.scan.BleScannerHelper.getInstance().setScanFilter(com.qcwireless.qcwatch.QJavaApplication.getInstance().getKeys());
                }
                return kotlin.Unit.INSTANCE;
            }
        }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
