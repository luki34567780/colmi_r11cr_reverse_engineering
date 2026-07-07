package kotlin.reflect;

/* compiled from: TypesJVM.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.reflect.Type, java.lang.String> {
    public static final kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1 INSTANCE = new kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1();

    ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, kotlin.reflect.TypesJVMKt.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.String invoke(java.lang.reflect.Type p0) {
        java.lang.String typeToString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
        typeToString = kotlin.reflect.TypesJVMKt.typeToString(p0);
        return typeToString;
    }
}
