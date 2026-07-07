package kotlin.collections;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Iterables.kt */
@kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class CollectionsKt__IterablesKt$Iterable$1<T> implements java.lang.Iterable<T>, kotlin.jvm.internal.markers.KMappedMarker {
    final /* synthetic */ kotlin.jvm.functions.Function0<java.util.Iterator<T>> $iterator;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionsKt__IterablesKt$Iterable$1(kotlin.jvm.functions.Function0<? extends java.util.Iterator<? extends T>> function0) {
        this.$iterator = function0;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return this.$iterator.invoke();
    }
}
