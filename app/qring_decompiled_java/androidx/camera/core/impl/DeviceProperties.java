package androidx.camera.core.impl;

/* loaded from: classes.dex */
public abstract class DeviceProperties {
    public abstract java.lang.String manufacturer();

    public abstract java.lang.String model();

    public abstract int sdkVersion();

    public static androidx.camera.core.impl.DeviceProperties create() {
        return create(android.os.Build.MANUFACTURER, android.os.Build.MODEL, android.os.Build.VERSION.SDK_INT);
    }

    public static androidx.camera.core.impl.DeviceProperties create(java.lang.String manufacturer, java.lang.String model, int sdkVersion) {
        return new androidx.camera.core.impl.AutoValue_DeviceProperties(manufacturer, model, sdkVersion);
    }
}
