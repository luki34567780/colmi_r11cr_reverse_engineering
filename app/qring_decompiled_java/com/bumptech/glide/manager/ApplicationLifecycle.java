package com.bumptech.glide.manager;

/* loaded from: /tmp/dex/classes2.dex */
class ApplicationLifecycle implements com.bumptech.glide.manager.Lifecycle {
    @Override // com.bumptech.glide.manager.Lifecycle
    public void removeListener(com.bumptech.glide.manager.LifecycleListener lifecycleListener) {
    }

    ApplicationLifecycle() {
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void addListener(com.bumptech.glide.manager.LifecycleListener lifecycleListener) {
        lifecycleListener.onStart();
    }
}
