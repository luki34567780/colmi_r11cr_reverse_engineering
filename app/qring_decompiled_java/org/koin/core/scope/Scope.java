package org.koin.core.scope;

/* compiled from: Scope.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ?\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%¢\u0006\u0002\u0010&J6\u0010\u001d\u001a\u0002H\u001e\"\u0006\b\u0000\u0010\u001e\u0018\u0001\"\u0006\b\u0001\u0010'\u0018\u00012\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\u0086\b¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020*J\r\u0010+\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\u000e\u0010-\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b.J+\u0010/\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\r\u00100\u001a\u00020*H\u0000¢\u0006\u0002\b1J@\u00102\u001a\u00020*\"\u0006\b\u0000\u00103\u0018\u00012\u0006\u00104\u001a\u0002H32\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0014\b\u0002\u00107\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0018\u000108H\u0086\b¢\u0006\u0002\u00109J\r\u0010:\u001a\u00020*H\u0000¢\u0006\u0002\b;J\u0013\u0010<\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\"\u0010>\u001a\u0006\u0012\u0002\b\u00030?2\b\u00105\u001a\u0004\u0018\u0001062\n\u0010@\u001a\u0006\u0012\u0002\b\u00030 H\u0002JC\u0010A\u001a\u0002H3\"\u0004\b\u0000\u001032\n\u0010@\u001a\u0006\u0012\u0002\b\u00030B2\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\u0007¢\u0006\u0002\u0010CJ=\u0010A\u001a\u0002H3\"\u0004\b\u0000\u001032\n\u0010@\u001a\u0006\u0012\u0002\b\u00030 2\b\u00105\u001a\u0004\u0018\u0001062\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%¢\u0006\u0002\u0010DJ:\u0010A\u001a\u0002H3\"\u0006\b\u0000\u00103\u0018\u00012\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\u0087\b¢\u0006\u0002\u0010EJ\u0017\u0010F\u001a\b\u0012\u0004\u0012\u0002H308\"\u0006\b\u0000\u00103\u0018\u0001H\u0086\bJ\u001e\u0010F\u001a\b\u0012\u0004\u0012\u0002H308\"\u0004\b\u0000\u001032\n\u0010@\u001a\u0006\u0012\u0002\b\u00030 J\u0006\u0010G\u001a\u00020\bJ<\u0010H\u001a\u0004\u0018\u0001H3\"\u0006\b\u0000\u00103\u0018\u00012\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\u0087\b¢\u0006\u0002\u0010EJ\u0019\u0010I\u001a\u0002H3\"\u0004\b\u0000\u001032\u0006\u0010J\u001a\u00020\u0003¢\u0006\u0002\u0010KJ!\u0010I\u001a\u0002H3\"\u0004\b\u0000\u001032\u0006\u0010J\u001a\u00020\u00032\u0006\u0010L\u001a\u0002H3¢\u0006\u0002\u0010MJ\u001b\u0010N\u001a\u0004\u0018\u0001H3\"\u0004\b\u0000\u001032\u0006\u0010J\u001a\u00020\u0003¢\u0006\u0002\u0010KJ\u0012\u0010O\u001a\u00020\u00002\n\u0010P\u001a\u00060\u0003j\u0002`\u0004J\t\u0010Q\u001a\u00020RHÖ\u0001J;\u0010S\u001a\b\u0012\u0004\u0012\u0002H30T\"\u0006\b\u0000\u00103\u0018\u00012\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\u0087\bJ=\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H30T\"\u0006\b\u0000\u00103\u0018\u00012\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\u0087\bJ\u000e\u0010V\u001a\u00020*2\u0006\u0010W\u001a\u00020\u0012J?\u0010X\u001a\u0002H3\"\u0004\b\u0000\u001032\b\u00105\u001a\u0004\u0018\u0001062\n\u0010@\u001a\u0006\u0012\u0002\b\u00030 2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\u0002¢\u0006\u0002\u0010YJ\b\u0010Z\u001a\u00020\u0003H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006["}, d2 = {"Lorg/koin/core/scope/Scope;", "", com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID, "", "Lorg/koin/core/scope/ScopeID;", "isRoot", "", "_koin", "Lorg/koin/core/Koin;", "(Ljava/lang/String;ZLorg/koin/core/Koin;)V", "get_koin$koin_core", "()Lorg/koin/core/Koin;", "beanRegistry", "Lorg/koin/core/registry/BeanRegistry;", "getBeanRegistry", "()Lorg/koin/core/registry/BeanRegistry;", "callbacks", "Ljava/util/ArrayList;", "Lorg/koin/core/scope/ScopeCallback;", "Lkotlin/collections/ArrayList;", "getId", "()Ljava/lang/String;", "()Z", "scopeDefinition", "Lorg/koin/core/scope/ScopeDefinition;", "getScopeDefinition", "()Lorg/koin/core/scope/ScopeDefinition;", "setScopeDefinition", "(Lorg/koin/core/scope/ScopeDefinition;)V", "bind", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "primaryType", "Lkotlin/reflect/KClass;", "secondaryType", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "P", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "close", "", "component1", "component2", "component3", "component3$koin_core", "copy", "createEagerInstances", "createEagerInstances$koin_core", "declare", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "instance", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "secondaryTypes", "", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;)V", "declareDefinitionsFromScopeSet", "declareDefinitionsFromScopeSet$koin_core", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "findDefinition", "Lorg/koin/core/definition/BeanDefinition;", "clazz", "get", "Ljava/lang/Class;", "(Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getAll", "getKoin", "getOrNull", "getProperty", "key", "(Ljava/lang/String;)Ljava/lang/Object;", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getPropertyOrNull", "getScope", "scopeID", "hashCode", "", "inject", "Lkotlin/Lazy;", "injectOrNull", "registerCallback", "callback", "resolveInstance", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "toString", "koin-core"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final /* data */ class Scope {
    private final org.koin.core.Koin _koin;
    private final org.koin.core.registry.BeanRegistry beanRegistry;
    private final java.util.ArrayList<org.koin.core.scope.ScopeCallback> callbacks;
    private final java.lang.String id;
    private final boolean isRoot;
    private org.koin.core.scope.ScopeDefinition scopeDefinition;

    public static /* synthetic */ org.koin.core.scope.Scope copy$default(org.koin.core.scope.Scope scope, java.lang.String str, boolean z, org.koin.core.Koin koin, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = scope.id;
        }
        if ((i & 2) != 0) {
            z = scope.isRoot;
        }
        if ((i & 4) != 0) {
            koin = scope._koin;
        }
        return scope.copy(str, z, koin);
    }

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

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    /* renamed from: component3$koin_core, reason: from getter */
    public final org.koin.core.Koin get_koin() {
        return this._koin;
    }

    public final org.koin.core.scope.Scope copy(java.lang.String id, boolean isRoot, org.koin.core.Koin _koin) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(id, "id");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(_koin, "_koin");
        return new org.koin.core.scope.Scope(id, isRoot, _koin);
    }

    public boolean equals(java.lang.Object other) {
        if (this != other) {
            if (other instanceof org.koin.core.scope.Scope) {
                org.koin.core.scope.Scope scope = (org.koin.core.scope.Scope) other;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.id, scope.id)) {
                    if (!(this.isRoot == scope.isRoot) || !kotlin.jvm.internal.Intrinsics.areEqual(this._koin, scope._koin)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final <T> T get(java.lang.Class<?> cls) {
        return (T) get$default(this, cls, null, null, 6, null);
    }

    public final <T> T get(java.lang.Class<?> cls, org.koin.core.qualifier.Qualifier qualifier) {
        return (T) get$default(this, cls, qualifier, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        java.lang.String str = this.id;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.isRoot;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        org.koin.core.Koin koin = this._koin;
        return i2 + (koin != null ? koin.hashCode() : 0);
    }

    public Scope(java.lang.String id, boolean z, org.koin.core.Koin _koin) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(id, "id");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(_koin, "_koin");
        this.id = id;
        this.isRoot = z;
        this._koin = _koin;
        this.beanRegistry = new org.koin.core.registry.BeanRegistry();
        this.callbacks = new java.util.ArrayList<>();
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public /* synthetic */ Scope(java.lang.String str, boolean z, org.koin.core.Koin koin, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, koin);
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    public final org.koin.core.Koin get_koin$koin_core() {
        return this._koin;
    }

    public final org.koin.core.registry.BeanRegistry getBeanRegistry() {
        return this.beanRegistry;
    }

    public final org.koin.core.scope.ScopeDefinition getScopeDefinition() {
        return this.scopeDefinition;
    }

    public final void setScopeDefinition(org.koin.core.scope.ScopeDefinition scopeDefinition) {
        this.scopeDefinition = scopeDefinition;
    }

    static /* synthetic */ kotlin.Lazy inject$default(org.koin.core.scope.Scope scope, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new org.koin.core.scope.Scope$inject$1(scope, qualifier, function0));
    }

    private final <T> kotlin.Lazy<T> inject(org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> parameters) {
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new org.koin.core.scope.Scope$inject$1(this, qualifier, parameters));
    }

    static /* synthetic */ kotlin.Lazy injectOrNull$default(org.koin.core.scope.Scope scope, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new org.koin.core.scope.Scope$injectOrNull$1(scope, qualifier, function0));
    }

    private final <T> kotlin.Lazy<T> injectOrNull(org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> parameters) {
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new org.koin.core.scope.Scope$injectOrNull$1(this, qualifier, parameters));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.lang.Object get$default(org.koin.core.scope.Scope scope, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
        return scope.get((kotlin.reflect.KClass<?>) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) function0);
    }

    private final <T> T get(org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> parameters) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
        return (T) get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier, parameters);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.lang.Object getOrNull$default(org.koin.core.scope.Scope scope, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
            return scope.get((kotlin.reflect.KClass<?>) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) function0);
        } catch (java.lang.Exception unused) {
            org.koin.core.logger.Logger logger = org.koin.core.KoinApplication.INSTANCE.getLogger();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Can't get instance for ");
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
            sb.append(org.koin.ext.KClassExtKt.getFullName(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class)));
            logger.error(sb.toString());
            return null;
        }
    }

    private final <T> T getOrNull(org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> parameters) {
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
            return (T) get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier, parameters);
        } catch (java.lang.Exception unused) {
            org.koin.core.logger.Logger logger = org.koin.core.KoinApplication.INSTANCE.getLogger();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Can't get instance for ");
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
            sb.append(org.koin.ext.KClassExtKt.getFullName(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class)));
            logger.error(sb.toString());
            return null;
        }
    }

    public final <T> T get(final kotlin.reflect.KClass<?> clazz, final org.koin.core.qualifier.Qualifier qualifier, final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> parameters) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        synchronized (this) {
            if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.DEBUG)) {
                org.koin.core.KoinApplication.INSTANCE.getLogger().debug("+- get '" + org.koin.ext.KClassExtKt.getFullName(clazz) + '\'');
                kotlin.Pair measureDuration = org.koin.core.time.MeasureKt.measureDuration(new kotlin.jvm.functions.Function0<T>() { // from class: org.koin.core.scope.Scope$get$$inlined$synchronized$lambda$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final T invoke() {
                        java.lang.Object resolveInstance;
                        resolveInstance = org.koin.core.scope.Scope.this.resolveInstance(qualifier, clazz, parameters);
                        return (T) resolveInstance;
                    }
                });
                T t = (T) measureDuration.component1();
                double doubleValue = ((java.lang.Number) measureDuration.component2()).doubleValue();
                org.koin.core.KoinApplication.INSTANCE.getLogger().debug("+- got '" + org.koin.ext.KClassExtKt.getFullName(clazz) + "' in " + doubleValue + " ms");
                return t;
            }
            return (T) resolveInstance(qualifier, clazz, parameters);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object get$default(org.koin.core.scope.Scope scope, java.lang.Class cls, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return scope.get((java.lang.Class<?>) cls, qualifier, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) function0);
    }

    public final <T> T get(final java.lang.Class<?> clazz, final org.koin.core.qualifier.Qualifier qualifier, final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> parameters) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        synchronized (this) {
            final kotlin.reflect.KClass<?> kotlinClass = kotlin.jvm.JvmClassMappingKt.getKotlinClass(clazz);
            if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.DEBUG)) {
                org.koin.core.KoinApplication.INSTANCE.getLogger().debug("+- get '" + org.koin.ext.KClassExtKt.getFullName(kotlinClass) + '\'');
                kotlin.Pair measureDuration = org.koin.core.time.MeasureKt.measureDuration(new kotlin.jvm.functions.Function0<T>() { // from class: org.koin.core.scope.Scope$get$$inlined$synchronized$lambda$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final T invoke() {
                        java.lang.Object resolveInstance;
                        resolveInstance = this.resolveInstance(qualifier, kotlin.reflect.KClass.this, parameters);
                        return (T) resolveInstance;
                    }
                });
                T t = (T) measureDuration.component1();
                double doubleValue = ((java.lang.Number) measureDuration.component2()).doubleValue();
                org.koin.core.KoinApplication.INSTANCE.getLogger().debug("+- got '" + org.koin.ext.KClassExtKt.getFullName(kotlinClass) + "' in " + doubleValue + " ms");
                return t;
            }
            return (T) resolveInstance(qualifier, kotlinClass, parameters);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T resolveInstance(org.koin.core.qualifier.Qualifier qualifier, kotlin.reflect.KClass<?> clazz, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> parameters) {
        return (T) findDefinition(qualifier, clazz).resolveInstance(new org.koin.core.instance.InstanceContext(this._koin, this, parameters));
    }

    private final org.koin.core.definition.BeanDefinition<?> findDefinition(org.koin.core.qualifier.Qualifier qualifier, kotlin.reflect.KClass<?> clazz) {
        org.koin.core.definition.BeanDefinition<?> findDefinition = this.beanRegistry.findDefinition(qualifier, clazz);
        if (findDefinition != null) {
            return findDefinition;
        }
        if (this.isRoot) {
            throw new org.koin.core.error.NoBeanDefFoundException("No definition found for '" + org.koin.ext.KClassExtKt.getFullName(clazz) + "' has been found. Check your module definitions.");
        }
        return this._koin.getRootScope().findDefinition(qualifier, clazz);
    }

    public final void createEagerInstances$koin_core() {
        if (this.isRoot) {
            java.util.Set<org.koin.core.definition.BeanDefinition<?>> findAllCreatedAtStartDefinition$koin_core = this.beanRegistry.findAllCreatedAtStartDefinition$koin_core();
            if (!findAllCreatedAtStartDefinition$koin_core.isEmpty()) {
                java.util.Iterator<T> it = findAllCreatedAtStartDefinition$koin_core.iterator();
                while (it.hasNext()) {
                    ((org.koin.core.definition.BeanDefinition) it.next()).resolveInstance(new org.koin.core.instance.InstanceContext(this._koin, this, null, 4, null));
                }
            }
        }
    }

    static /* synthetic */ void declare$default(org.koin.core.scope.Scope scope, java.lang.Object obj, org.koin.core.qualifier.Qualifier qualifier, java.util.List list, int i, java.lang.Object obj2) {
        org.koin.core.definition.BeanDefinition<?> beanDefinition;
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if (scope.isRoot()) {
            org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
            org.koin.core.scope.Scope$declare$definition$1 scope$declare$definition$1 = new org.koin.core.scope.Scope$declare$definition$1(obj);
            org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Single;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
            beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
            beanDefinition.setDefinition(scope$declare$definition$1);
            beanDefinition.setKind(kind);
        } else {
            org.koin.core.definition.DefinitionFactory definitionFactory2 = org.koin.core.definition.DefinitionFactory.INSTANCE;
            org.koin.core.scope.ScopeDefinition scopeDefinition = scope.getScopeDefinition();
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
        scope.getBeanRegistry().saveDefinition(beanDefinition);
    }

    private final <T> void declare(T instance, org.koin.core.qualifier.Qualifier qualifier, java.util.List<? extends kotlin.reflect.KClass<?>> secondaryTypes) {
        org.koin.core.definition.BeanDefinition<?> beanDefinition;
        if (isRoot()) {
            org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
            org.koin.core.scope.Scope$declare$definition$1 scope$declare$definition$1 = new org.koin.core.scope.Scope$declare$definition$1(instance);
            org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Single;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
            beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
            beanDefinition.setDefinition(scope$declare$definition$1);
            beanDefinition.setKind(kind);
        } else {
            org.koin.core.definition.DefinitionFactory definitionFactory2 = org.koin.core.definition.DefinitionFactory.INSTANCE;
            org.koin.core.scope.ScopeDefinition scopeDefinition = getScopeDefinition();
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
        getBeanRegistry().saveDefinition(beanDefinition);
    }

    public final org.koin.core.Koin getKoin() {
        return this._koin;
    }

    public final org.koin.core.scope.Scope getScope(java.lang.String scopeID) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scopeID, "scopeID");
        return getKoin().getScope(scopeID);
    }

    public final void registerCallback(org.koin.core.scope.ScopeCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(callback, "callback");
        this.callbacks.add(callback);
    }

    private final <T> java.util.List<T> getAll() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
        return getAll(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
    }

    public final <T> java.util.List<T> getAll(kotlin.reflect.KClass<?> clazz) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        java.util.List<org.koin.core.definition.BeanDefinition<?>> definitionsForClass = this.beanRegistry.getDefinitionsForClass(clazz);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(definitionsForClass, 10));
        java.util.Iterator<T> it = definitionsForClass.iterator();
        while (it.hasNext()) {
            org.koin.core.instance.DefinitionInstance<T> beanDefinition = ((org.koin.core.definition.BeanDefinition) it.next()).getInstance();
            if (beanDefinition == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            arrayList.add(beanDefinition.get(new org.koin.core.instance.InstanceContext(this._koin, this, null, 4, null)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.lang.Object bind$default(org.koin.core.scope.Scope scope, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH);
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "P");
        return scope.bind(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), orCreateKotlinClass, function0);
    }

    private final <S, P> S bind(kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> parameters) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH);
        kotlin.reflect.KClass<?> orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "P");
        return (S) bind(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), orCreateKotlinClass, parameters);
    }

    public final <S> S bind(kotlin.reflect.KClass<?> primaryType, kotlin.reflect.KClass<?> secondaryType, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> parameters) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(primaryType, "primaryType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(secondaryType, "secondaryType");
        java.util.Iterator<T> it = this.beanRegistry.getAllDefinitions().iterator();
        while (it.hasNext()) {
            org.koin.core.definition.BeanDefinition beanDefinition = (org.koin.core.definition.BeanDefinition) it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(beanDefinition.getPrimaryType(), primaryType) && beanDefinition.getSecondaryTypes().contains(secondaryType)) {
                org.koin.core.instance.DefinitionInstance beanDefinition2 = beanDefinition.getInstance();
                if (beanDefinition2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                return (S) beanDefinition2.get(new org.koin.core.instance.InstanceContext(getKoin(), this, parameters));
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final <T> T getProperty(java.lang.String key, T defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        return (T) this._koin.getProperty(key, defaultValue);
    }

    public final <T> T getPropertyOrNull(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        return (T) this._koin.getProperty(key);
    }

    public final <T> T getProperty(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        T t = (T) this._koin.getProperty(key);
        if (t != null) {
            return t;
        }
        throw new org.koin.core.error.MissingPropertyException("Property '" + key + "' not found");
    }

    public final void declareDefinitionsFromScopeSet$koin_core() {
        java.util.HashSet<org.koin.core.definition.BeanDefinition<?>> definitions;
        org.koin.core.scope.ScopeDefinition scopeDefinition = this.scopeDefinition;
        if (scopeDefinition == null || (definitions = scopeDefinition.getDefinitions()) == null) {
            return;
        }
        for (org.koin.core.definition.BeanDefinition<?> beanDefinition : definitions) {
            this.beanRegistry.saveDefinition(beanDefinition);
            beanDefinition.createInstanceHolder();
        }
    }

    public final void close() {
        synchronized (this) {
            if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.DEBUG)) {
                org.koin.core.KoinApplication.INSTANCE.getLogger().info("closing scope:'" + this.id + '\'');
            }
            java.util.Iterator<T> it = this.callbacks.iterator();
            while (it.hasNext()) {
                ((org.koin.core.scope.ScopeCallback) it.next()).onScopeClose(this);
            }
            this.callbacks.clear();
            org.koin.core.scope.ScopeDefinition scopeDefinition = this.scopeDefinition;
            if (scopeDefinition != null) {
                scopeDefinition.release$koin_core(this);
            }
            this.beanRegistry.close();
            this._koin.deleteScope(this.id);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public java.lang.String toString() {
        org.koin.core.scope.ScopeDefinition scopeDefinition = this.scopeDefinition;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(",set:'");
        sb.append(scopeDefinition != null ? scopeDefinition.getQualifier() : null);
        sb.append('\'');
        return "Scope[id:'" + this.id + '\'' + sb.toString() + ']';
    }
}
