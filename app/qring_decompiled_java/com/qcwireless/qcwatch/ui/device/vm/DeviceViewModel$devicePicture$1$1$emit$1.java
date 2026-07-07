package com.qcwireless.qcwatch.ui.device.vm;

/* compiled from: DeviceViewModel.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel$devicePicture$1$1", f = "DeviceViewModel.kt", i = {0}, l = {171, 172}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class DeviceViewModel$devicePicture$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel$devicePicture$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DeviceViewModel$devicePicture$1$1$emit$1(com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel$devicePicture$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel$devicePicture$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= com.bumptech.glide.request.target.Target.SIZE_ORIGINAL;
        return this.this$0.emit((com.qcwireless.qcwatch.ui.base.bean.device.DevicePictureBean) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
    }
}
