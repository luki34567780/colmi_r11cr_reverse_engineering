package org.koin.core.module;

/* compiled from: Module.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\"\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\b2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0010JX\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00140\b\"\u0006\b\u0000\u0010\u0014\u0018\u00012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u0004\u001a\u00020\u00032)\b\b\u0010\u0015\u001a#\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u0002H\u00140\u001dj\b\u0012\u0004\u0012\u0002H\u0014` ¢\u0006\u0002\b!H\u0086\bJ\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000#2\u0006\u0010$\u001a\u00020\u0000H\u0086\u0002J'\u0010\u0019\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001c2\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130'¢\u0006\u0002\b!Jb\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00140\b\"\u0006\b\u0000\u0010\u0014\u0018\u00012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032)\b\b\u0010\u0015\u001a#\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u0002H\u00140\u001dj\b\u0012\u0004\u0012\u0002H\u0014` ¢\u0006\u0002\b!H\u0086\bJ\u0018\u0010*\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R,\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b`\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0007j\b\u0012\u0004\u0012\u00020\u0010`\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006+"}, d2 = {"Lorg/koin/core/module/Module;", "", "isCreatedAtStart", "", "override", "(ZZ)V", "definitions", "Ljava/util/ArrayList;", "Lorg/koin/core/definition/BeanDefinition;", "Lkotlin/collections/ArrayList;", "getDefinitions$koin_core", "()Ljava/util/ArrayList;", "isCreatedAtStart$koin_core", "()Z", "getOverride$koin_core", "scopes", "Lorg/koin/dsl/ScopeSet;", "getScopes$koin_core", "declareDefinition", "", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "definition", "options", "Lorg/koin/core/definition/Options;", "declareScope", "scope", "factory", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "plus", "", "module", "scopeName", "scopeSet", "Lkotlin/Function1;", "single", "createdAtStart", "updateOptions", "koin-core"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class Module {
    private final boolean isCreatedAtStart;
    private final boolean override;
    private final java.util.ArrayList<org.koin.core.definition.BeanDefinition<?>> definitions = new java.util.ArrayList<>();
    private final java.util.ArrayList<org.koin.dsl.ScopeSet> scopes = new java.util.ArrayList<>();

    public Module(boolean z, boolean z2) {
        this.isCreatedAtStart = z;
        this.override = z2;
    }

    /* renamed from: isCreatedAtStart$koin_core, reason: from getter */
    public final boolean getIsCreatedAtStart() {
        return this.isCreatedAtStart;
    }

    /* renamed from: getOverride$koin_core, reason: from getter */
    public final boolean getOverride() {
        return this.override;
    }

    public final java.util.ArrayList<org.koin.core.definition.BeanDefinition<?>> getDefinitions$koin_core() {
        return this.definitions;
    }

    public final java.util.ArrayList<org.koin.dsl.ScopeSet> getScopes$koin_core() {
        return this.scopes;
    }

    public final <T> void declareDefinition(org.koin.core.definition.BeanDefinition<T> definition, org.koin.core.definition.Options options) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(definition, "definition");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(options, "options");
        updateOptions(definition, options);
        this.definitions.add(definition);
    }

    public final void declareScope(org.koin.dsl.ScopeSet scope) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scope, "scope");
        this.scopes.add(scope);
    }

    static /* synthetic */ org.koin.core.definition.BeanDefinition single$default(org.koin.core.module.Module module, org.koin.core.qualifier.Qualifier qualifier, boolean z, boolean z2, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Single;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
        org.koin.core.definition.BeanDefinition beanDefinition = new org.koin.core.definition.BeanDefinition(qualifier, null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        module.declareDefinition(beanDefinition, new org.koin.core.definition.Options(z, z2));
        return beanDefinition;
    }

    private final <T> org.koin.core.definition.BeanDefinition<T> single(org.koin.core.qualifier.Qualifier qualifier, boolean createdAtStart, boolean override, kotlin.jvm.functions.Function2<? super org.koin.core.scope.Scope, ? super org.koin.core.parameter.DefinitionParameters, ? extends T> definition) {
        org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Single;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
        org.koin.core.definition.BeanDefinition<T> beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(definition);
        beanDefinition.setKind(kind);
        declareDefinition(beanDefinition, new org.koin.core.definition.Options(createdAtStart, override));
        return beanDefinition;
    }

    private final void updateOptions(org.koin.core.definition.BeanDefinition<?> beanDefinition, org.koin.core.definition.Options options) {
        beanDefinition.getOptions().setCreatedAtStart(options.isCreatedAtStart() || this.isCreatedAtStart);
        beanDefinition.getOptions().setOverride(options.getOverride() || this.override);
    }

    public final void scope(org.koin.core.qualifier.Qualifier scopeName, kotlin.jvm.functions.Function1<? super org.koin.dsl.ScopeSet, kotlin.Unit> scopeSet) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scopeName, "scopeName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scopeSet, "scopeSet");
        org.koin.dsl.ScopeSet scopeSet2 = new org.koin.dsl.ScopeSet(scopeName);
        scopeSet.invoke(scopeSet2);
        declareScope(scopeSet2);
    }

    static /* synthetic */ org.koin.core.definition.BeanDefinition factory$default(org.koin.core.module.Module module, org.koin.core.qualifier.Qualifier qualifier, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Factory;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
        org.koin.core.definition.BeanDefinition beanDefinition = new org.koin.core.definition.BeanDefinition(qualifier, null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        module.declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, z, 1, null));
        return beanDefinition;
    }

    private final <T> org.koin.core.definition.BeanDefinition<T> factory(org.koin.core.qualifier.Qualifier qualifier, boolean override, kotlin.jvm.functions.Function2<? super org.koin.core.scope.Scope, ? super org.koin.core.parameter.DefinitionParameters, ? extends T> definition) {
        org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Factory;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
        org.koin.core.definition.BeanDefinition<T> beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(definition);
        beanDefinition.setKind(kind);
        declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, override, 1, null));
        return beanDefinition;
    }

    public final java.util.List<org.koin.core.module.Module> plus(org.koin.core.module.Module module) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new org.koin.core.module.Module[]{this, module});
    }
}
