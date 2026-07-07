package androidx.camera.core.impl;

/* loaded from: classes.dex */
public interface MutableConfig extends androidx.camera.core.impl.Config {
    <ValueT> void insertOption(androidx.camera.core.impl.Config.Option<ValueT> opt, androidx.camera.core.impl.Config.OptionPriority priority, ValueT value);

    <ValueT> void insertOption(androidx.camera.core.impl.Config.Option<ValueT> opt, ValueT value);

    <ValueT> ValueT removeOption(androidx.camera.core.impl.Config.Option<ValueT> opt);
}
