package org.koin.ext;

/* compiled from: KClassExt.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0002H\u0002\"\u001e\u0010\u0000\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"classNames", "", "Lkotlin/reflect/KClass;", "", "getFullName", "saveFullName", "koin-core"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class KClassExtKt {
    private static final java.util.Map<kotlin.reflect.KClass<?>, java.lang.String> classNames = new java.util.concurrent.ConcurrentHashMap();

    public static final java.lang.String getFullName(kotlin.reflect.KClass<?> getFullName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getFullName, "$this$getFullName");
        java.lang.String str = classNames.get(getFullName);
        return str != null ? str : saveFullName(getFullName);
    }

    private static final java.lang.String saveFullName(kotlin.reflect.KClass<?> kClass) {
        java.lang.String name = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass).getName();
        java.util.Map<kotlin.reflect.KClass<?>, java.lang.String> map = classNames;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "name");
        map.put(kClass, name);
        return name;
    }
}
