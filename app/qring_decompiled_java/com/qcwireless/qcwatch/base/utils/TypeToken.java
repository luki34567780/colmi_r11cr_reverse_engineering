package com.qcwireless.qcwatch.base.utils;

/* compiled from: MoshiUtils.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/qcwireless/qcwatch/base/utils/TypeToken;", "T", "", "()V", "type", "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public abstract class TypeToken<T> {
    public final java.lang.reflect.Type getType() {
        java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
        java.util.Objects.requireNonNull(genericSuperclass, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        java.lang.reflect.Type canonicalize = com.squareup.moshi.internal.Util.canonicalize(((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(canonicalize, "run {\n            val su…peArguments[0])\n        }");
        return canonicalize;
    }
}
