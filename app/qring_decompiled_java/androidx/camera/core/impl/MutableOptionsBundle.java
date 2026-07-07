package androidx.camera.core.impl;

/* loaded from: classes.dex */
public final class MutableOptionsBundle extends androidx.camera.core.impl.OptionsBundle implements androidx.camera.core.impl.MutableConfig {
    private static final androidx.camera.core.impl.Config.OptionPriority DEFAULT_PRIORITY = androidx.camera.core.impl.Config.OptionPriority.OPTIONAL;

    private MutableOptionsBundle(java.util.TreeMap<androidx.camera.core.impl.Config.Option<?>, java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object>> persistentOptions) {
        super(persistentOptions);
    }

    public static androidx.camera.core.impl.MutableOptionsBundle create() {
        return new androidx.camera.core.impl.MutableOptionsBundle(new java.util.TreeMap(ID_COMPARE));
    }

    public static androidx.camera.core.impl.MutableOptionsBundle from(androidx.camera.core.impl.Config otherConfig) {
        java.util.TreeMap treeMap = new java.util.TreeMap(ID_COMPARE);
        for (androidx.camera.core.impl.Config.Option<?> option : otherConfig.listOptions()) {
            java.util.Set<androidx.camera.core.impl.Config.OptionPriority> priorities = otherConfig.getPriorities(option);
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            for (androidx.camera.core.impl.Config.OptionPriority optionPriority : priorities) {
                arrayMap.put(optionPriority, otherConfig.retrieveOptionWithPriority(option, optionPriority));
            }
            treeMap.put(option, arrayMap);
        }
        return new androidx.camera.core.impl.MutableOptionsBundle(treeMap);
    }

    @Override // androidx.camera.core.impl.MutableConfig
    public <ValueT> ValueT removeOption(androidx.camera.core.impl.Config.Option<ValueT> option) {
        return (ValueT) this.mOptions.remove(option);
    }

    @Override // androidx.camera.core.impl.MutableConfig
    public <ValueT> void insertOption(androidx.camera.core.impl.Config.Option<ValueT> opt, ValueT value) {
        insertOption(opt, DEFAULT_PRIORITY, value);
    }

    @Override // androidx.camera.core.impl.MutableConfig
    public <ValueT> void insertOption(androidx.camera.core.impl.Config.Option<ValueT> opt, androidx.camera.core.impl.Config.OptionPriority priority, ValueT value) {
        java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object> map = this.mOptions.get(opt);
        if (map == null) {
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            this.mOptions.put(opt, arrayMap);
            arrayMap.put(priority, value);
            return;
        }
        androidx.camera.core.impl.Config.OptionPriority optionPriority = (androidx.camera.core.impl.Config.OptionPriority) java.util.Collections.min(map.keySet());
        if (!map.get(optionPriority).equals(value) && androidx.camera.core.impl.Config.CC.hasConflict(optionPriority, priority)) {
            throw new java.lang.IllegalArgumentException("Option values conflicts: " + opt.getId() + ", existing value (" + optionPriority + ")=" + map.get(optionPriority) + ", conflicting (" + priority + ")=" + value);
        }
        map.put(priority, value);
    }
}
