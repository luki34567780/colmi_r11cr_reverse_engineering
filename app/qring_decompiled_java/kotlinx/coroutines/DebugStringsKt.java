package kotlinx.coroutines;

/* compiled from: DebugStrings.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\bH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"classSimpleName", "", "", "getClassSimpleName", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "getHexAddress", "toDebugString", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugStringsKt {
    public static final java.lang.String getHexAddress(java.lang.Object obj) {
        return java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
    }

    public static final java.lang.String toDebugString(kotlin.coroutines.Continuation<?> continuation) {
        java.lang.Object m1091constructorimpl;
        if (continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation) {
            return continuation.toString();
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m1091constructorimpl = kotlin.Result.m1091constructorimpl(continuation + '@' + getHexAddress(continuation));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m1091constructorimpl = kotlin.Result.m1091constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m1094exceptionOrNullimpl(m1091constructorimpl) != null) {
            m1091constructorimpl = ((java.lang.Object) continuation.getClass().getName()) + '@' + getHexAddress(continuation);
        }
        return (java.lang.String) m1091constructorimpl;
    }

    public static final java.lang.String getClassSimpleName(java.lang.Object obj) {
        return obj.getClass().getSimpleName();
    }
}
