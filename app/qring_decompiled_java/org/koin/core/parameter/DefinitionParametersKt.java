package org.koin.core.parameter;

/* compiled from: DefinitionParameters.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a#\u0010\u0002\u001a\u00020\u00012\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006*\u0016\u0010\u0007\"\b\u0012\u0004\u0012\u00020\u00010\b2\b\u0012\u0004\u0012\u00020\u00010\b¨\u0006\t"}, d2 = {"emptyParametersHolder", "Lorg/koin/core/parameter/DefinitionParameters;", "parametersOf", "parameters", "", "", "([Ljava/lang/Object;)Lorg/koin/core/parameter/DefinitionParameters;", "ParametersDefinition", "Lkotlin/Function0;", "koin-core"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class DefinitionParametersKt {
    public static final org.koin.core.parameter.DefinitionParameters parametersOf(java.lang.Object... parameters) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameters, "parameters");
        if (parameters.length <= 5) {
            return new org.koin.core.parameter.DefinitionParameters(java.util.Arrays.copyOf(parameters, parameters.length));
        }
        throw new java.lang.IllegalStateException("Can't build DefinitionParameters for more than 5 arguments".toString());
    }

    public static final org.koin.core.parameter.DefinitionParameters emptyParametersHolder() {
        return new org.koin.core.parameter.DefinitionParameters(new java.lang.Object[0]);
    }
}
