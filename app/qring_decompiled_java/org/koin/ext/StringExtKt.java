package org.koin.ext;

/* compiled from: StringExt.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0002¨\u0006\u0005"}, d2 = {"isFloat", "", "", "isInt", "quoted", "koin-core"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class StringExtKt {
    public static final boolean isFloat(java.lang.String isFloat) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isFloat, "$this$isFloat");
        return kotlin.text.StringsKt.toFloatOrNull(isFloat) != null;
    }

    public static final boolean isInt(java.lang.String isInt) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isInt, "$this$isInt");
        return kotlin.text.StringsKt.toIntOrNull(isInt) != null;
    }

    public static final java.lang.String quoted(java.lang.String quoted) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(quoted, "$this$quoted");
        return kotlin.text.StringsKt.replace$default(quoted, "\"", "", false, 4, (java.lang.Object) null);
    }
}
