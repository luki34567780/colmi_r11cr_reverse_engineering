package kotlinx.coroutines.flow;

/* compiled from: Reduce.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FlowKt__ReduceKt$single$2<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $result;

    FlowKt__ReduceKt$single$2(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef) {
        this.$result = objectRef;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!(this.$result.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL)) {
            throw new java.lang.IllegalArgumentException("Flow has more than one element".toString());
        }
        this.$result.element = t;
        return kotlin.Unit.INSTANCE;
    }
}
