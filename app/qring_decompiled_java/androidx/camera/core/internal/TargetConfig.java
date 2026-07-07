package androidx.camera.core.internal;

/* loaded from: classes.dex */
public interface TargetConfig<T> extends androidx.camera.core.impl.ReadableConfig {
    public static final androidx.camera.core.impl.Config.Option<java.lang.String> OPTION_TARGET_NAME = androidx.camera.core.impl.Config.Option.create("camerax.core.target.name", java.lang.String.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Class<?>> OPTION_TARGET_CLASS = androidx.camera.core.impl.Config.Option.create("camerax.core.target.class", java.lang.Class.class);

    public interface Builder<T, B> {
        B setTargetClass(java.lang.Class<T> targetClass);

        B setTargetName(java.lang.String targetName);
    }

    java.lang.Class<T> getTargetClass();

    java.lang.Class<T> getTargetClass(java.lang.Class<T> valueIfMissing);

    java.lang.String getTargetName();

    java.lang.String getTargetName(java.lang.String valueIfMissing);

    @com.android.tools.r8.annotations.SynthesizedClass(kind = "$-CC")
    /* renamed from: androidx.camera.core.internal.TargetConfig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        public static java.lang.Class $default$getTargetClass(androidx.camera.core.internal.TargetConfig _this, java.lang.Class valueIfMissing) {
            return (java.lang.Class) _this.retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, valueIfMissing);
        }

        public static java.lang.Class $default$getTargetClass(androidx.camera.core.internal.TargetConfig _this) {
            return (java.lang.Class) _this.retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS);
        }

        public static java.lang.String $default$getTargetName(androidx.camera.core.internal.TargetConfig _this, java.lang.String valueIfMissing) {
            return (java.lang.String) _this.retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, valueIfMissing);
        }

        public static java.lang.String $default$getTargetName(androidx.camera.core.internal.TargetConfig _this) {
            return (java.lang.String) _this.retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME);
        }
    }
}
