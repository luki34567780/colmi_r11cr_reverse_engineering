package org.koin.core;

/* compiled from: KoinApplication.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\rJ\r\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000fJ\u0016\u0010\u0010\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0013J\u0012\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007J\u001a\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00002\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u001e\"\u00020\u0013¢\u0006\u0002\u0010\u001fJ\u0014\u0010\u001d\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006!"}, d2 = {"Lorg/koin/core/KoinApplication;", "", "()V", "koin", "Lorg/koin/core/Koin;", "getKoin", "()Lorg/koin/core/Koin;", "close", "", "createEagerInstances", "environmentProperties", "fileProperties", "fileName", "", "loadDefaults", "loadDefaults$koin_core", "loadModulesAndScopes", "modules", "", "Lorg/koin/core/module/Module;", "logger", "Lorg/koin/core/logger/Logger;", "", "printLogger", "level", "Lorg/koin/core/logger/Level;", "properties", "values", "", "unloadModules", "", "([Lorg/koin/core/module/Module;)Lorg/koin/core/KoinApplication;", "Companion", "koin-core"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class KoinApplication {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final org.koin.core.KoinApplication.Companion INSTANCE = new org.koin.core.KoinApplication.Companion(null);
    private static org.koin.core.logger.Logger logger = new org.koin.core.logger.EmptyLogger();
    private final org.koin.core.Koin koin;

    @kotlin.jvm.JvmStatic
    public static final org.koin.core.KoinApplication create() {
        return INSTANCE.create();
    }

    public final org.koin.core.KoinApplication printLogger() {
        return printLogger$default(this, null, 1, null);
    }

    private KoinApplication() {
        this.koin = new org.koin.core.Koin();
    }

    public /* synthetic */ KoinApplication(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final org.koin.core.Koin getKoin() {
        return this.koin;
    }

    public final void loadDefaults$koin_core() {
        this.koin.getScopeRegistry().loadDefaultScopes(this.koin);
    }

    public final org.koin.core.KoinApplication modules(org.koin.core.module.Module modules) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(modules, "modules");
        return modules(kotlin.collections.CollectionsKt.listOf(modules));
    }

    public final org.koin.core.KoinApplication modules(final java.util.List<org.koin.core.module.Module> modules) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(modules, "modules");
        if (logger.isAt(org.koin.core.logger.Level.INFO)) {
            double measureDurationOnly = org.koin.core.time.MeasureKt.measureDurationOnly(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: org.koin.core.KoinApplication$modules$duration$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    org.koin.core.KoinApplication.this.loadModulesAndScopes(modules);
                }
            });
            int size = this.koin.getRootScope().getBeanRegistry().getAllDefinitions().size();
            java.util.Collection<org.koin.core.scope.ScopeDefinition> scopeSets = this.koin.getScopeRegistry().getScopeSets();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(scopeSets, 10));
            java.util.Iterator<T> it = scopeSets.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(((org.koin.core.scope.ScopeDefinition) it.next()).getDefinitions().size()));
            }
            int sumOfInt = size + kotlin.collections.CollectionsKt.sumOfInt(arrayList);
            logger.info("total " + sumOfInt + " registered definitions");
            logger.info("load modules in " + measureDurationOnly + " ms");
        } else {
            loadModulesAndScopes(modules);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadModulesAndScopes(java.lang.Iterable<org.koin.core.module.Module> modules) {
        this.koin.getRootScope().getBeanRegistry().loadModules(modules);
        this.koin.getScopeRegistry().loadScopes$koin_core(modules);
    }

    public final org.koin.core.KoinApplication properties(java.util.Map<java.lang.String, ? extends java.lang.Object> values) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(values, "values");
        this.koin.getPropertyRegistry().saveProperties(values);
        return this;
    }

    public static /* synthetic */ org.koin.core.KoinApplication fileProperties$default(org.koin.core.KoinApplication koinApplication, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "/koin.properties";
        }
        return koinApplication.fileProperties(str);
    }

    public final org.koin.core.KoinApplication fileProperties(java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fileName, "fileName");
        this.koin.getPropertyRegistry().loadPropertiesFromFile(fileName);
        return this;
    }

    public final org.koin.core.KoinApplication environmentProperties() {
        this.koin.getPropertyRegistry().loadEnvironmentProperties();
        return this;
    }

    public final org.koin.core.KoinApplication logger(org.koin.core.logger.Logger logger2) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(logger2, "logger");
        logger = logger2;
        return this;
    }

    public static /* synthetic */ org.koin.core.KoinApplication printLogger$default(org.koin.core.KoinApplication koinApplication, org.koin.core.logger.Level level, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            level = org.koin.core.logger.Level.INFO;
        }
        return koinApplication.printLogger(level);
    }

    public final org.koin.core.KoinApplication printLogger(org.koin.core.logger.Level level) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(level, "level");
        return logger(new org.koin.core.logger.PrintLogger(level));
    }

    public final org.koin.core.KoinApplication createEagerInstances() {
        if (logger.isAt(org.koin.core.logger.Level.DEBUG)) {
            double measureDurationOnly = org.koin.core.time.MeasureKt.measureDurationOnly(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: org.koin.core.KoinApplication$createEagerInstances$duration$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    org.koin.core.KoinApplication.this.getKoin().createEagerInstances$koin_core();
                }
            });
            logger.debug("instances started in " + measureDurationOnly + " ms");
        } else {
            this.koin.createEagerInstances$koin_core();
        }
        return this;
    }

    public final void close() {
        synchronized (this) {
            this.koin.close();
            if (logger.isAt(org.koin.core.logger.Level.INFO)) {
                logger.info("stopped");
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final org.koin.core.KoinApplication unloadModules(org.koin.core.module.Module... modules) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(modules, "modules");
        return unloadModules(kotlin.collections.ArraysKt.toList(modules));
    }

    public final org.koin.core.KoinApplication unloadModules(java.util.List<org.koin.core.module.Module> modules) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(modules, "modules");
        java.util.List<org.koin.core.module.Module> list = modules;
        this.koin.getRootScope().getBeanRegistry().unloadModules$koin_core(list);
        this.koin.getScopeRegistry().unloadScopedDefinitions$koin_core(list);
        return this;
    }

    /* compiled from: KoinApplication.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lorg/koin/core/KoinApplication$Companion;", "", "()V", "logger", "Lorg/koin/core/logger/Logger;", "getLogger", "()Lorg/koin/core/logger/Logger;", "setLogger", "(Lorg/koin/core/logger/Logger;)V", "create", "Lorg/koin/core/KoinApplication;", "koin-core"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final org.koin.core.logger.Logger getLogger() {
            return org.koin.core.KoinApplication.logger;
        }

        public final void setLogger(org.koin.core.logger.Logger logger) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(logger, "<set-?>");
            org.koin.core.KoinApplication.logger = logger;
        }

        @kotlin.jvm.JvmStatic
        public final org.koin.core.KoinApplication create() {
            org.koin.core.KoinApplication koinApplication = new org.koin.core.KoinApplication(null);
            koinApplication.loadDefaults$koin_core();
            return koinApplication;
        }
    }
}
