package androidx.camera.core.impl;

/* loaded from: classes.dex */
public class OptionsBundle implements androidx.camera.core.impl.Config {
    private static final androidx.camera.core.impl.OptionsBundle EMPTY_BUNDLE;
    protected static final java.util.Comparator<androidx.camera.core.impl.Config.Option<?>> ID_COMPARE;
    protected final java.util.TreeMap<androidx.camera.core.impl.Config.Option<?>, java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object>> mOptions;

    static {
        androidx.camera.core.impl.OptionsBundle$$ExternalSyntheticLambda0 optionsBundle$$ExternalSyntheticLambda0 = new java.util.Comparator() { // from class: androidx.camera.core.impl.OptionsBundle$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int compareTo;
                compareTo = ((androidx.camera.core.impl.Config.Option) obj).getId().compareTo(((androidx.camera.core.impl.Config.Option) obj2).getId());
                return compareTo;
            }
        };
        ID_COMPARE = optionsBundle$$ExternalSyntheticLambda0;
        EMPTY_BUNDLE = new androidx.camera.core.impl.OptionsBundle(new java.util.TreeMap(optionsBundle$$ExternalSyntheticLambda0));
    }

    OptionsBundle(java.util.TreeMap<androidx.camera.core.impl.Config.Option<?>, java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object>> options) {
        this.mOptions = options;
    }

    public static androidx.camera.core.impl.OptionsBundle from(androidx.camera.core.impl.Config otherConfig) {
        if (androidx.camera.core.impl.OptionsBundle.class.equals(otherConfig.getClass())) {
            return (androidx.camera.core.impl.OptionsBundle) otherConfig;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap(ID_COMPARE);
        for (androidx.camera.core.impl.Config.Option<?> option : otherConfig.listOptions()) {
            java.util.Set<androidx.camera.core.impl.Config.OptionPriority> priorities = otherConfig.getPriorities(option);
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            for (androidx.camera.core.impl.Config.OptionPriority optionPriority : priorities) {
                arrayMap.put(optionPriority, otherConfig.retrieveOptionWithPriority(option, optionPriority));
            }
            treeMap.put(option, arrayMap);
        }
        return new androidx.camera.core.impl.OptionsBundle(treeMap);
    }

    public static androidx.camera.core.impl.OptionsBundle emptyBundle() {
        return EMPTY_BUNDLE;
    }

    @Override // androidx.camera.core.impl.Config
    public java.util.Set<androidx.camera.core.impl.Config.Option<?>> listOptions() {
        return java.util.Collections.unmodifiableSet(this.mOptions.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public boolean containsOption(androidx.camera.core.impl.Config.Option<?> id) {
        return this.mOptions.containsKey(id);
    }

    @Override // androidx.camera.core.impl.Config
    public <ValueT> ValueT retrieveOption(androidx.camera.core.impl.Config.Option<ValueT> option) {
        java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object> map = this.mOptions.get(option);
        if (map == null) {
            throw new java.lang.IllegalArgumentException("Option does not exist: " + option);
        }
        return (ValueT) map.get((androidx.camera.core.impl.Config.OptionPriority) java.util.Collections.min(map.keySet()));
    }

    @Override // androidx.camera.core.impl.Config
    public <ValueT> ValueT retrieveOption(androidx.camera.core.impl.Config.Option<ValueT> option, ValueT valuet) {
        try {
            return (ValueT) retrieveOption(option);
        } catch (java.lang.IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // androidx.camera.core.impl.Config
    public <ValueT> ValueT retrieveOptionWithPriority(androidx.camera.core.impl.Config.Option<ValueT> option, androidx.camera.core.impl.Config.OptionPriority optionPriority) {
        java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object> map = this.mOptions.get(option);
        if (map == null) {
            throw new java.lang.IllegalArgumentException("Option does not exist: " + option);
        }
        if (!map.containsKey(optionPriority)) {
            throw new java.lang.IllegalArgumentException("Option does not exist: " + option + " with priority=" + optionPriority);
        }
        return (ValueT) map.get(optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    public androidx.camera.core.impl.Config.OptionPriority getOptionPriority(androidx.camera.core.impl.Config.Option<?> opt) {
        java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object> map = this.mOptions.get(opt);
        if (map == null) {
            throw new java.lang.IllegalArgumentException("Option does not exist: " + opt);
        }
        return (androidx.camera.core.impl.Config.OptionPriority) java.util.Collections.min(map.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public void findOptions(java.lang.String idStem, androidx.camera.core.impl.Config.OptionMatcher matcher) {
        for (java.util.Map.Entry<androidx.camera.core.impl.Config.Option<?>, java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object>> entry : this.mOptions.tailMap(androidx.camera.core.impl.Config.Option.create(idStem, java.lang.Void.class)).entrySet()) {
            if (!entry.getKey().getId().startsWith(idStem) || !matcher.onOptionMatched(entry.getKey())) {
                return;
            }
        }
    }

    @Override // androidx.camera.core.impl.Config
    public java.util.Set<androidx.camera.core.impl.Config.OptionPriority> getPriorities(androidx.camera.core.impl.Config.Option<?> opt) {
        java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object> map = this.mOptions.get(opt);
        if (map == null) {
            return java.util.Collections.emptySet();
        }
        return java.util.Collections.unmodifiableSet(map.keySet());
    }
}
