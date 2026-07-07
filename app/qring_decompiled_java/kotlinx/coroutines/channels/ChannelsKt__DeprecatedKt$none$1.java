package kotlinx.coroutines.channels;

/* compiled from: Deprecated.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {447}, m = io.reactivex.annotations.SchedulerSupport.NONE, n = {"$this$consume$iv"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$none$1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    ChannelsKt__DeprecatedKt$none$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object none;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        none = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.none(null, this);
        return none;
    }
}
