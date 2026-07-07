package io.fotoapparat.result;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: PendingResult.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0017\u0010\u0003\u001a\u0013\u0018\u0001H\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "p1", "Lkotlin/ParameterName;", "name", "it", "invoke", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes3.dex */
final class PendingResult$whenDone$1<T> extends kotlin.jvm.internal.FunctionReference implements kotlin.jvm.functions.Function1<T, kotlin.Unit> {
    PendingResult$whenDone$1(io.fotoapparat.result.WhenDoneListener whenDoneListener) {
        super(1, whenDoneListener);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final java.lang.String getName() {
        return "whenDone";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final kotlin.reflect.KDeclarationContainer getOwner() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.fotoapparat.result.WhenDoneListener.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final java.lang.String getSignature() {
        return "whenDone(Ljava/lang/Object;)V";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
        invoke2((io.fotoapparat.result.PendingResult$whenDone$1<T>) obj);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(T t) {
        ((io.fotoapparat.result.WhenDoneListener) this.receiver).whenDone(t);
    }
}
