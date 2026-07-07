package org.koin.core.context;

/* compiled from: GlobalContext.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0007J\n\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\fH\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lorg/koin/core/context/GlobalContext;", "", "()V", "app", "Lorg/koin/core/KoinApplication;", "getApp$koin_core", "()Lorg/koin/core/KoinApplication;", "setApp$koin_core", "(Lorg/koin/core/KoinApplication;)V", "get", "getOrNull", "start", "", "koinApplication", "stop", "koin-core"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class GlobalContext {
    public static final org.koin.core.context.GlobalContext INSTANCE = new org.koin.core.context.GlobalContext();
    private static org.koin.core.KoinApplication app;

    private GlobalContext() {
    }

    public final org.koin.core.KoinApplication getApp$koin_core() {
        return app;
    }

    public final void setApp$koin_core(org.koin.core.KoinApplication koinApplication) {
        app = koinApplication;
    }

    @kotlin.jvm.JvmStatic
    public static final org.koin.core.KoinApplication get() {
        org.koin.core.KoinApplication koinApplication = app;
        if (koinApplication != null) {
            return koinApplication;
        }
        throw new java.lang.IllegalStateException("KoinApplication has not been started".toString());
    }

    @kotlin.jvm.JvmStatic
    public static final org.koin.core.KoinApplication getOrNull() {
        return app;
    }

    @kotlin.jvm.JvmStatic
    public static final void start(org.koin.core.KoinApplication koinApplication) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(koinApplication, "koinApplication");
        if (app != null) {
            throw new org.koin.core.error.KoinAppAlreadyStartedException("A Koin Application has already been started");
        }
        app = koinApplication;
    }

    @kotlin.jvm.JvmStatic
    public static final void stop() {
        synchronized (INSTANCE) {
            org.koin.core.KoinApplication koinApplication = app;
            if (koinApplication != null) {
                koinApplication.close();
            }
            app = null;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
