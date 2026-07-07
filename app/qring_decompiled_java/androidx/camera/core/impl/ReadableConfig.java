package androidx.camera.core.impl;

/* loaded from: classes.dex */
public interface ReadableConfig extends androidx.camera.core.impl.Config {
    @Override // androidx.camera.core.impl.Config
    boolean containsOption(androidx.camera.core.impl.Config.Option<?> id);

    @Override // androidx.camera.core.impl.Config
    void findOptions(java.lang.String idSearchString, androidx.camera.core.impl.Config.OptionMatcher matcher);

    androidx.camera.core.impl.Config getConfig();

    @Override // androidx.camera.core.impl.Config
    androidx.camera.core.impl.Config.OptionPriority getOptionPriority(androidx.camera.core.impl.Config.Option<?> opt);

    @Override // androidx.camera.core.impl.Config
    java.util.Set<androidx.camera.core.impl.Config.OptionPriority> getPriorities(androidx.camera.core.impl.Config.Option<?> option);

    @Override // androidx.camera.core.impl.Config
    java.util.Set<androidx.camera.core.impl.Config.Option<?>> listOptions();

    @Override // androidx.camera.core.impl.Config
    <ValueT> ValueT retrieveOption(androidx.camera.core.impl.Config.Option<ValueT> id);

    @Override // androidx.camera.core.impl.Config
    <ValueT> ValueT retrieveOption(androidx.camera.core.impl.Config.Option<ValueT> id, ValueT valueIfMissing);

    @Override // androidx.camera.core.impl.Config
    <ValueT> ValueT retrieveOptionWithPriority(androidx.camera.core.impl.Config.Option<ValueT> id, androidx.camera.core.impl.Config.OptionPriority priority);

    /* renamed from: androidx.camera.core.impl.ReadableConfig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
