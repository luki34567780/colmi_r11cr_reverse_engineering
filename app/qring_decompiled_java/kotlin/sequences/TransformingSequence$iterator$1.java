package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Sequences.kt */
@kotlin.Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\u000e\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"kotlin/sequences/TransformingSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransformingSequence$iterator$1<R> implements java.util.Iterator<R>, kotlin.jvm.internal.markers.KMappedMarker {
    private final java.util.Iterator<T> iterator;
    final /* synthetic */ kotlin.sequences.TransformingSequence<T, R> this$0;

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    TransformingSequence$iterator$1(kotlin.sequences.TransformingSequence<T, R> transformingSequence) {
        kotlin.sequences.Sequence sequence;
        this.this$0 = transformingSequence;
        sequence = ((kotlin.sequences.TransformingSequence) transformingSequence).sequence;
        this.iterator = sequence.iterator();
    }

    public final java.util.Iterator<T> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Iterator
    public R next() {
        kotlin.jvm.functions.Function1 function1;
        function1 = ((kotlin.sequences.TransformingSequence) this.this$0).transformer;
        return (R) function1.invoke(this.iterator.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }
}
