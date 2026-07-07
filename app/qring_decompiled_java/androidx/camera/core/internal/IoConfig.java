package androidx.camera.core.internal;

/* loaded from: classes.dex */
public interface IoConfig extends androidx.camera.core.impl.ReadableConfig {
    public static final androidx.camera.core.impl.Config.Option<java.util.concurrent.Executor> OPTION_IO_EXECUTOR = androidx.camera.core.impl.Config.Option.create("camerax.core.io.ioExecutor", java.util.concurrent.Executor.class);

    public interface Builder<B> {
        B setIoExecutor(java.util.concurrent.Executor executor);
    }

    java.util.concurrent.Executor getIoExecutor();

    java.util.concurrent.Executor getIoExecutor(java.util.concurrent.Executor valueIfMissing);

    /* renamed from: androidx.camera.core.internal.IoConfig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static java.util.concurrent.Executor $default$getIoExecutor(androidx.camera.core.internal.IoConfig _this, java.util.concurrent.Executor valueIfMissing) {
            return (java.util.concurrent.Executor) _this.retrieveOption(androidx.camera.core.internal.IoConfig.OPTION_IO_EXECUTOR, valueIfMissing);
        }

        public static java.util.concurrent.Executor $default$getIoExecutor(androidx.camera.core.internal.IoConfig _this) {
            return (java.util.concurrent.Executor) _this.retrieveOption(androidx.camera.core.internal.IoConfig.OPTION_IO_EXECUTOR);
        }
    }
}
