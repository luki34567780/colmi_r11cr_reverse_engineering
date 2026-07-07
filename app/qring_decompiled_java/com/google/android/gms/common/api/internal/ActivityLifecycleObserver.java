package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class ActivityLifecycleObserver {
    public static final com.google.android.gms.common.api.internal.ActivityLifecycleObserver of(android.app.Activity activity) {
        return new com.google.android.gms.common.api.internal.zab(com.google.android.gms.common.api.internal.zaa.zaa(activity));
    }

    public abstract com.google.android.gms.common.api.internal.ActivityLifecycleObserver onStopCallOnce(java.lang.Runnable runnable);
}
