package androidx.camera.core.internal;

/* loaded from: classes.dex */
public interface ThreadConfig extends androidx.camera.core.impl.ReadableConfig {
    public static final androidx.camera.core.impl.Config.Option<java.util.concurrent.Executor> OPTION_BACKGROUND_EXECUTOR = androidx.camera.core.impl.Config.Option.create("camerax.core.thread.backgroundExecutor", java.util.concurrent.Executor.class);

    public interface Builder<B> {
        B setBackgroundExecutor(java.util.concurrent.Executor executor);
    }

    java.util.concurrent.Executor getBackgroundExecutor();

    java.util.concurrent.Executor getBackgroundExecutor(java.util.concurrent.Executor valueIfMissing);

    /* renamed from: androidx.camera.core.internal.ThreadConfig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static java.util.concurrent.Executor $default$getBackgroundExecutor(androidx.camera.core.internal.ThreadConfig _this, java.util.concurrent.Executor valueIfMissing) {
            return (java.util.concurrent.Executor) _this.retrieveOption(androidx.camera.core.internal.ThreadConfig.OPTION_BACKGROUND_EXECUTOR, valueIfMissing);
        }

        public static java.util.concurrent.Executor $default$getBackgroundExecutor(androidx.camera.core.internal.ThreadConfig _this) {
            return (java.util.concurrent.Executor) _this.retrieveOption(androidx.camera.core.internal.ThreadConfig.OPTION_BACKGROUND_EXECUTOR);
        }
    }
}
