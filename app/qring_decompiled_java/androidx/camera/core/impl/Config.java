package androidx.camera.core.impl;

/* loaded from: classes.dex */
public interface Config {

    public interface OptionMatcher {
        boolean onOptionMatched(androidx.camera.core.impl.Config.Option<?> option);
    }

    public enum OptionPriority {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    boolean containsOption(androidx.camera.core.impl.Config.Option<?> id);

    void findOptions(java.lang.String idSearchString, androidx.camera.core.impl.Config.OptionMatcher matcher);

    androidx.camera.core.impl.Config.OptionPriority getOptionPriority(androidx.camera.core.impl.Config.Option<?> opt);

    java.util.Set<androidx.camera.core.impl.Config.OptionPriority> getPriorities(androidx.camera.core.impl.Config.Option<?> option);

    java.util.Set<androidx.camera.core.impl.Config.Option<?>> listOptions();

    <ValueT> ValueT retrieveOption(androidx.camera.core.impl.Config.Option<ValueT> id);

    <ValueT> ValueT retrieveOption(androidx.camera.core.impl.Config.Option<ValueT> id, ValueT valueIfMissing);

    <ValueT> ValueT retrieveOptionWithPriority(androidx.camera.core.impl.Config.Option<ValueT> id, androidx.camera.core.impl.Config.OptionPriority priority);

    public static abstract class Option<T> {
        public abstract java.lang.String getId();

        public abstract java.lang.Object getToken();

        public abstract java.lang.Class<T> getValueClass();

        Option() {
        }

        public static <T> androidx.camera.core.impl.Config.Option<T> create(java.lang.String id, java.lang.Class<?> valueClass) {
            return create(id, valueClass, null);
        }

        public static <T> androidx.camera.core.impl.Config.Option<T> create(java.lang.String id, java.lang.Class<?> valueClass, java.lang.Object token) {
            return new androidx.camera.core.impl.AutoValue_Config_Option(id, valueClass, token);
        }
    }

    /* renamed from: androidx.camera.core.impl.Config$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean hasConflict(androidx.camera.core.impl.Config.OptionPriority priority1, androidx.camera.core.impl.Config.OptionPriority priority2) {
            if (priority1 == androidx.camera.core.impl.Config.OptionPriority.ALWAYS_OVERRIDE && priority2 == androidx.camera.core.impl.Config.OptionPriority.ALWAYS_OVERRIDE) {
                return true;
            }
            return priority1 == androidx.camera.core.impl.Config.OptionPriority.REQUIRED && priority2 == androidx.camera.core.impl.Config.OptionPriority.REQUIRED;
        }

        public static androidx.camera.core.impl.Config mergeConfigs(androidx.camera.core.impl.Config extendedConfig, androidx.camera.core.impl.Config baseConfig) {
            androidx.camera.core.impl.MutableOptionsBundle create;
            if (extendedConfig == null && baseConfig == null) {
                return androidx.camera.core.impl.OptionsBundle.emptyBundle();
            }
            if (baseConfig != null) {
                create = androidx.camera.core.impl.MutableOptionsBundle.from(baseConfig);
            } else {
                create = androidx.camera.core.impl.MutableOptionsBundle.create();
            }
            if (extendedConfig != null) {
                for (androidx.camera.core.impl.Config.Option<?> option : extendedConfig.listOptions()) {
                    create.insertOption(option, extendedConfig.getOptionPriority(option), extendedConfig.retrieveOption(option));
                }
            }
            return androidx.camera.core.impl.OptionsBundle.from(create);
        }
    }
}
