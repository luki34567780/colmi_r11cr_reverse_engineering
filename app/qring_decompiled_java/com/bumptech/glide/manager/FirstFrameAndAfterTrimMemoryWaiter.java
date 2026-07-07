package com.bumptech.glide.manager;

/* loaded from: /tmp/dex/classes2.dex */
final class FirstFrameAndAfterTrimMemoryWaiter implements com.bumptech.glide.manager.FrameWaiter, android.content.ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }

    @Override // com.bumptech.glide.manager.FrameWaiter
    public void registerSelf(android.app.Activity activity) {
    }

    FirstFrameAndAfterTrimMemoryWaiter() {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(20);
    }
}
