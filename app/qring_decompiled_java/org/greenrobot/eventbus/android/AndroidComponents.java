package org.greenrobot.eventbus.android;

/* loaded from: classes3.dex */
public abstract class AndroidComponents {
    private static final org.greenrobot.eventbus.android.AndroidComponents implementation;
    public final org.greenrobot.eventbus.MainThreadSupport defaultMainThreadSupport;
    public final org.greenrobot.eventbus.Logger logger;

    static {
        implementation = org.greenrobot.eventbus.android.AndroidDependenciesDetector.isAndroidSDKAvailable() ? org.greenrobot.eventbus.android.AndroidDependenciesDetector.instantiateAndroidComponents() : null;
    }

    public static boolean areAvailable() {
        return implementation != null;
    }

    public static org.greenrobot.eventbus.android.AndroidComponents get() {
        return implementation;
    }

    public AndroidComponents(org.greenrobot.eventbus.Logger logger, org.greenrobot.eventbus.MainThreadSupport mainThreadSupport) {
        this.logger = logger;
        this.defaultMainThreadSupport = mainThreadSupport;
    }
}
