package org.koin.core;

/* compiled from: Koin.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JA\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017¢\u0006\u0002\u0010\u0018J6\u0010\u000f\u001a\u0002H\u0010\"\u0006\b\u0000\u0010\u0010\u0018\u0001\"\u0006\b\u0001\u0010\u0019\u0018\u00012\u0016\b\n\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017H\u0086\b¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\r\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001eJ\u001a\u0010\u001f\u001a\u00020\b2\n\u0010 \u001a\u00060!j\u0002`\"2\u0006\u0010#\u001a\u00020$J@\u0010%\u001a\u00020\u001c\"\u0006\b\u0000\u0010&\u0018\u00012\u0006\u0010'\u001a\u0002H&2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u0014\b\u0002\u0010(\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0018\u00010)H\u0086\b¢\u0006\u0002\u0010*J\u0012\u0010+\u001a\u00020\u001c2\n\u0010 \u001a\u00060!j\u0002`\"J=\u0010,\u001a\u0002H&\"\u0004\b\u0000\u0010&2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030\u00122\b\u0010#\u001a\u0004\u0018\u00010$2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017¢\u0006\u0002\u0010.J:\u0010,\u001a\u0002H&\"\u0006\b\u0000\u0010&\u0018\u00012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u0016\b\n\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017H\u0087\b¢\u0006\u0002\u0010/J\u0017\u00100\u001a\b\u0012\u0004\u0012\u0002H&0)\"\u0006\b\u0000\u0010&\u0018\u0001H\u0086\bJ\u001a\u00101\u001a\u00020\b2\n\u0010 \u001a\u00060!j\u0002`\"2\u0006\u0010#\u001a\u00020$J<\u00102\u001a\u0004\u0018\u0001H&\"\u0006\b\u0000\u0010&\u0018\u00012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u0016\b\n\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017H\u0087\b¢\u0006\u0002\u0010/J\u001b\u00103\u001a\u0004\u0018\u0001H&\"\u0004\b\u0000\u0010&2\u0006\u00104\u001a\u00020!¢\u0006\u0002\u00105J!\u00103\u001a\u0002H&\"\u0004\b\u0000\u0010&2\u0006\u00104\u001a\u00020!2\u0006\u00106\u001a\u0002H&¢\u0006\u0002\u00107J\u0012\u00108\u001a\u00020\b2\n\u0010 \u001a\u00060!j\u0002`\"J\u0014\u00109\u001a\u0004\u0018\u00010\b2\n\u0010 \u001a\u00060!j\u0002`\"J;\u0010:\u001a\b\u0012\u0004\u0012\u0002H&0;\"\u0006\b\u0000\u0010&\u0018\u00012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u0016\b\n\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017H\u0087\bJ=\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H&0;\"\u0006\b\u0000\u0010&\u0018\u00012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u0016\b\n\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017H\u0087\bJ%\u0010=\u001a\u00020\u001c\"\b\b\u0000\u0010&*\u00020\u00012\u0006\u00104\u001a\u00020!2\u0006\u0010>\u001a\u0002H&¢\u0006\u0002\u0010?R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006@"}, d2 = {"Lorg/koin/core/Koin;", "", "()V", "propertyRegistry", "Lorg/koin/core/registry/PropertyRegistry;", "getPropertyRegistry", "()Lorg/koin/core/registry/PropertyRegistry;", "rootScope", "Lorg/koin/core/scope/Scope;", "getRootScope", "()Lorg/koin/core/scope/Scope;", "scopeRegistry", "Lorg/koin/core/registry/ScopeRegistry;", "getScopeRegistry", "()Lorg/koin/core/registry/ScopeRegistry;", "bind", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "primaryType", "Lkotlin/reflect/KClass;", "secondaryType", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "P", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "close", "", "createEagerInstances", "createEagerInstances$koin_core", "createScope", "scopeId", "", "Lorg/koin/core/scope/ScopeID;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "declare", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "instance", "secondaryTypes", "", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;)V", "deleteScope", "get", "clazz", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getAll", "getOrCreateScope", "getOrNull", "getProperty", "key", "(Ljava/lang/String;)Ljava/lang/Object;", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getScope", "getScopeOrNull", "inject", "Lkotlin/Lazy;", "injectOrNull", "setProperty", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "koin-core"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class Koin {
    private final org.koin.core.registry.ScopeRegistry scopeRegistry = new org.koin.core.registry.ScopeRegistry();
    private final org.koin.core.registry.PropertyRegistry propertyRegistry = new org.koin.core.registry.PropertyRegistry();
    private final org.koin.core.scope.Scope rootScope = new org.koin.core.scope.Scope("-Root-", true, this);

    private final <T> T get() {
        return (T) get$default(this, null, null, 3, null);
    }

    private final <T> T get(org.koin.core.qualifier.Qualifier qualifier) {
        return (T) get$default(this, qualifier, null, 2, null);
    }

    private final <T> T getOrNull() {
        return (T) getOrNull$default(this, null, null, 3, null);
    }

    private final <T> T getOrNull(org.koin.core.qualifier.Qualifier qualifier) {
        return (T) getOrNull$default(this, qualifier, null, 2, null);
    }

    private final <T> kotlin.Lazy<T> inject() {
        return inject$default(this, null, null, 3, null);
    }

    private final <T> kotlin.Lazy<T> inject(org.koin.core.qualifier.Qualifier qualifier) {
        return inject$default(this, qualifier, null, 2, null);
    }

    private final <T> kotlin.Lazy<T> injectOrNull() {
        return injectOrNull$default(this, null, null, 3, null);
    }

    private final <T> kotlin.Lazy<T> injectOrNull(org.koin.core.qualifier.Qualifier qualifier) {
        return injectOrNull$default(this, qualifier, null, 2, null);
    }

    public final org.koin.core.registry.ScopeRegistry getScopeRegistry() {
        return this.scopeRegistry;
    }

    public final org.koin.core.registry.PropertyRegistry getPropertyRegistry() {
        return this.propertyRegistry;
    }

    public final org.koin.core.scope.Scope getRootScope() {
        return this.rootScope;
    }

    static /* synthetic */ kotlin.Lazy inject$default(org.koin.core.Koin koin, final org.koin.core.qualifier.Qualifier qualifier, final kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        final org.koin.core.scope.Scope rootScope = koin.getRootScope();
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<T>() { // from class: org.koin.core.Koin$inject$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                org.koin.core.scope.Scope scope = org.koin.core.scope.Scope.this;
                org.koin.core.qualifier.Qualifier qualifier2 = qualifier;
                kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function02 = function0;
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
                return (T) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier2, function02);
            }
        });
    }

    private final <T> kotlin.Lazy<T> inject(final org.koin.core.qualifier.Qualifier qualifier, final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> parameters) {
        final org.koin.core.scope.Scope rootScope = getRootScope();
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<T>() { // from class: org.koin.core.Koin$inject$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                org.koin.core.scope.Scope scope = org.koin.core.scope.Scope.this;
                org.koin.core.qualifier.Qualifier qualifier2 = qualifier;
                kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = parameters;
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
                return (T) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier2, function0);
            }
        });
    }

    static /* synthetic */ kotlin.Lazy injectOrNull$default(org.koin.core.Koin koin, final org.koin.core.qualifier.Qualifier qualifier, final kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        final org.koin.core.scope.Scope rootScope = koin.getRootScope();
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<T>() { // from class: org.koin.core.Koin$injectOrNull$$inlined$injectOrNull$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                org.koin.core.scope.Scope scope = org.koin.core.scope.Scope.this;
                org.koin.core.qualifier.Qualifier qualifier2 = qualifier;
                kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function02 = function0;
                try {
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T?");
                    return (T) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier2, function02);
                } catch (java.lang.Exception unused) {
                    org.koin.core.logger.Logger logger = org.koin.core.KoinApplication.INSTANCE.getLogger();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Can't get instance for ");
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T?");
                    sb.append(org.koin.ext.KClassExtKt.getFullName(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class)));
                    logger.error(sb.toString());
                    return null;
                }
            }
        });
    }

    private final <T> kotlin.Lazy<T> injectOrNull(final org.koin.core.qualifier.Qualifier qualifier, final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> parameters) {
        final org.koin.core.scope.Scope rootScope = getRootScope();
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<T>() { // from class: org.koin.core.Koin$injectOrNull$$inlined$injectOrNull$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                org.koin.core.scope.Scope scope = org.koin.core.scope.Scope.this;
                org.koin.core.qualifier.Qualifier qualifier2 = qualifier;
                kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = parameters;
                try {
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T?");
                    return (T) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier2, function0);
                } catch (java.lang.Exception unused) {
                    org.koin.core.logger.Logger logger = org.koin.core.KoinApplication.INSTANCE.getLogger();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Can't get instance for ");
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T?");
                    sb.append(org.koin.ext.KClassExtKt.getFullName(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class)));
                    logger.error(sb.toString());
                    return null;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.lang.Object get$default(org.koin.core.Koin koin, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        org.koin.core.scope.Scope rootScope = koin.getRootScope();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.get((kotlin.reflect.KClass<?>) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) function0);
    }

    private final <T> T get(org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> parameters) {
        org.koin.core.scope.Scope rootScope = getRootScope();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
        return (T) rootScope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier, parameters);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.lang.Object getOrNull$default(org.koin.core.Koin koin, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        org.koin.core.scope.Scope rootScope = koin.getRootScope();
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T?");
            return rootScope.get((kotlin.reflect.KClass<?>) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) function0);
        } catch (java.lang.Exception unused) {
            org.koin.core.logger.Logger logger = org.koin.core.KoinApplication.INSTANCE.getLogger();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Can't get instance for ");
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T?");
            sb.append(org.koin.ext.KClassExtKt.getFullName(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class)));
            logger.error(sb.toString());
            return null;
        }
    }

    private final <T> T getOrNull(org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> parameters) {
        org.koin.core.scope.Scope rootScope = getRootScope();
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T?");
            return (T) rootScope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier, parameters);
        } catch (java.lang.Exception unused) {
            org.koin.core.logger.Logger logger = org.koin.core.KoinApplication.INSTANCE.getLogger();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Can't get instance for ");
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T?");
            sb.append(org.koin.ext.KClassExtKt.getFullName(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class)));
            logger.error(sb.toString());
            return null;
        }
    }

    public final <T> T get(kotlin.reflect.KClass<?> clazz, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> parameters) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        return (T) this.rootScope.get(clazz, qualifier, parameters);
    }

    static /* synthetic */ void declare$default(org.koin.core.Koin koin, java.lang.Object obj, org.koin.core.qualifier.Qualifier qualifier, java.util.List list, int i, java.lang.Object obj2) {
        org.koin.core.definition.BeanDefinition<?> beanDefinition;
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        org.koin.core.scope.Scope rootScope = koin.getRootScope();
        if (rootScope.isRoot()) {
            org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
            org.koin.core.scope.Scope$declare$definition$1 scope$declare$definition$1 = new org.koin.core.scope.Scope$declare$definition$1(obj);
            org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Single;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
            beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
            beanDefinition.setDefinition(scope$declare$definition$1);
            beanDefinition.setKind(kind);
        } else {
            org.koin.core.definition.DefinitionFactory definitionFactory2 = org.koin.core.definition.DefinitionFactory.INSTANCE;
            org.koin.core.scope.ScopeDefinition scopeDefinition = rootScope.getScopeDefinition();
            org.koin.core.qualifier.Qualifier qualifier2 = scopeDefinition != null ? scopeDefinition.getQualifier() : null;
            org.koin.core.scope.Scope$declare$definition$2 scope$declare$definition$2 = new org.koin.core.scope.Scope$declare$definition$2(obj);
            org.koin.core.definition.Kind kind2 = org.koin.core.definition.Kind.Scoped;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
            beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, qualifier2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
            beanDefinition.setDefinition(scope$declare$definition$2);
            beanDefinition.setKind(kind2);
        }
        if (list != null) {
            beanDefinition.getSecondaryTypes().addAll(list);
        }
        rootScope.getBeanRegistry().saveDefinition(beanDefinition);
    }

    private final <T> void declare(T instance, org.koin.core.qualifier.Qualifier qualifier, java.util.List<? extends kotlin.reflect.KClass<?>> secondaryTypes) {
        org.koin.core.definition.BeanDefinition<?> beanDefinition;
        org.koin.core.scope.Scope rootScope = getRootScope();
        if (rootScope.isRoot()) {
            org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
            org.koin.core.scope.Scope$declare$definition$1 scope$declare$definition$1 = new org.koin.core.scope.Scope$declare$definition$1(instance);
            org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Single;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
            beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
            beanDefinition.setDefinition(scope$declare$definition$1);
            beanDefinition.setKind(kind);
        } else {
            org.koin.core.definition.DefinitionFactory definitionFactory2 = org.koin.core.definition.DefinitionFactory.INSTANCE;
            org.koin.core.scope.ScopeDefinition scopeDefinition = rootScope.getScopeDefinition();
            org.koin.core.qualifier.Qualifier qualifier2 = scopeDefinition != null ? scopeDefinition.getQualifier() : null;
            org.koin.core.scope.Scope$declare$definition$2 scope$declare$definition$2 = new org.koin.core.scope.Scope$declare$definition$2(instance);
            org.koin.core.definition.Kind kind2 = org.koin.core.definition.Kind.Scoped;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
            beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, qualifier2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
            beanDefinition.setDefinition(scope$declare$definition$2);
            beanDefinition.setKind(kind2);
        }
        if (secondaryTypes != null) {
            beanDefinition.getSecondaryTypes().addAll(secondaryTypes);
        }
        rootScope.getBeanRegistry().saveDefinition(beanDefinition);
    }

    private final <T> java.util.List<T> getAll() {
        org.koin.core.scope.Scope rootScope = getRootScope();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.getAll(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.lang.Object bind$default(org.koin.core.Koin koin, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        org.koin.core.scope.Scope rootScope = koin.getRootScope();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH);
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "P");
        return rootScope.bind(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), orCreateKotlinClass, function0);
    }

    private final <S, P> S bind(kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> parameters) {
        org.koin.core.scope.Scope rootScope = getRootScope();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH);
        kotlin.reflect.KClass<?> orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "P");
        return (S) rootScope.bind(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), orCreateKotlinClass, parameters);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object bind$default(org.koin.core.Koin koin, kotlin.reflect.KClass kClass, kotlin.reflect.KClass kClass2, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        return koin.bind(kClass, kClass2, function0);
    }

    public final <S> S bind(kotlin.reflect.KClass<?> primaryType, kotlin.reflect.KClass<?> secondaryType, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> parameters) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(primaryType, "primaryType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(secondaryType, "secondaryType");
        return (S) this.rootScope.bind(primaryType, secondaryType, parameters);
    }

    public final void createEagerInstances$koin_core() {
        this.rootScope.createEagerInstances$koin_core();
    }

    public final org.koin.core.scope.Scope createScope(java.lang.String scopeId, org.koin.core.qualifier.Qualifier qualifier) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scopeId, "scopeId");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(qualifier, "qualifier");
        if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.DEBUG)) {
            org.koin.core.KoinApplication.INSTANCE.getLogger().debug("!- create scope - id:" + scopeId + " q:" + qualifier);
        }
        return this.scopeRegistry.createScopeInstance(this, scopeId, qualifier);
    }

    public final org.koin.core.scope.Scope getOrCreateScope(java.lang.String scopeId, org.koin.core.qualifier.Qualifier qualifier) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scopeId, "scopeId");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(qualifier, "qualifier");
        org.koin.core.scope.Scope scopeInstanceOrNull = this.scopeRegistry.getScopeInstanceOrNull(scopeId);
        return scopeInstanceOrNull != null ? scopeInstanceOrNull : createScope(scopeId, qualifier);
    }

    public final org.koin.core.scope.Scope getScope(java.lang.String scopeId) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scopeId, "scopeId");
        return this.scopeRegistry.getScopeInstance(scopeId);
    }

    public final org.koin.core.scope.Scope getScopeOrNull(java.lang.String scopeId) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scopeId, "scopeId");
        return this.scopeRegistry.getScopeInstanceOrNull(scopeId);
    }

    public final void deleteScope(java.lang.String scopeId) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scopeId, "scopeId");
        this.scopeRegistry.deleteScopeInstance(scopeId);
    }

    public final <T> T getProperty(java.lang.String key, T defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        T t = (T) this.propertyRegistry.getProperty(key);
        return t != null ? t : defaultValue;
    }

    public final <T> T getProperty(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        return (T) this.propertyRegistry.getProperty(key);
    }

    public final <T> void setProperty(java.lang.String key, T value) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");
        this.propertyRegistry.saveProperty$koin_core(key, value);
    }

    public final void close() {
        this.scopeRegistry.close();
        this.rootScope.close();
        this.propertyRegistry.close();
    }
}
