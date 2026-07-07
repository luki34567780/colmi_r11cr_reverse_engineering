package io.fotoapparat.coroutines;

/* compiled from: AwaitBroadcastChannel.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0086@ø\u0001\u0000"}, d2 = {"getValue", "", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "continuation", "Lkotlin/coroutines/Continuation;"}, k = 3, mv = {1, 1, 13})
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io/fotoapparat/coroutines/AwaitBroadcastChannel", f = "AwaitBroadcastChannel.kt", i = {0}, l = {19, 21}, m = "getValue", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class AwaitBroadcastChannel$getValue$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.fotoapparat.coroutines.AwaitBroadcastChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AwaitBroadcastChannel$getValue$1(io.fotoapparat.coroutines.AwaitBroadcastChannel awaitBroadcastChannel, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.this$0 = awaitBroadcastChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getValue(this);
    }
}
