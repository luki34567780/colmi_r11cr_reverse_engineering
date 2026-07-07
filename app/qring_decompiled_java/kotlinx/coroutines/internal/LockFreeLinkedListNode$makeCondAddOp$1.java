package kotlinx.coroutines.internal;

/* compiled from: LockFreeLinkedList.kt */
@kotlin.Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class LockFreeLinkedListNode$makeCondAddOp$1 extends kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp {
    final /* synthetic */ kotlin.jvm.functions.Function0<java.lang.Boolean> $condition;
    final /* synthetic */ kotlinx.coroutines.internal.LockFreeLinkedListNode $node;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockFreeLinkedListNode$makeCondAddOp$1(kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        super(lockFreeLinkedListNode);
        this.$node = lockFreeLinkedListNode;
        this.$condition = function0;
    }

    @Override // kotlinx.coroutines.internal.AtomicOp
    public java.lang.Object prepare(kotlinx.coroutines.internal.LockFreeLinkedListNode affected) {
        if (this.$condition.invoke().booleanValue()) {
            return null;
        }
        return kotlinx.coroutines.internal.LockFreeLinkedListKt.getCONDITION_FALSE();
    }
}
