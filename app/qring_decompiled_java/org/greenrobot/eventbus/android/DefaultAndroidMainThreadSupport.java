package org.greenrobot.eventbus.android;

/* loaded from: classes3.dex */
public class DefaultAndroidMainThreadSupport implements org.greenrobot.eventbus.MainThreadSupport {
    @Override // org.greenrobot.eventbus.MainThreadSupport
    public boolean isMainThread() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper();
    }

    @Override // org.greenrobot.eventbus.MainThreadSupport
    public org.greenrobot.eventbus.Poster createPoster(org.greenrobot.eventbus.EventBus eventBus) {
        return new org.greenrobot.eventbus.HandlerPoster(eventBus, android.os.Looper.getMainLooper(), 10);
    }
}
