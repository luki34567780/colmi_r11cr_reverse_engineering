package com.bumptech.glide.manager;

/* loaded from: /tmp/dex/classes2.dex */
class ActivityFragmentLifecycle implements com.bumptech.glide.manager.Lifecycle {
    private boolean isDestroyed;
    private boolean isStarted;
    private final java.util.Set<com.bumptech.glide.manager.LifecycleListener> lifecycleListeners = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    ActivityFragmentLifecycle() {
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void addListener(com.bumptech.glide.manager.LifecycleListener lifecycleListener) {
        this.lifecycleListeners.add(lifecycleListener);
        if (this.isDestroyed) {
            lifecycleListener.onDestroy();
        } else if (this.isStarted) {
            lifecycleListener.onStart();
        } else {
            lifecycleListener.onStop();
        }
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void removeListener(com.bumptech.glide.manager.LifecycleListener lifecycleListener) {
        this.lifecycleListeners.remove(lifecycleListener);
    }

    void onStart() {
        this.isStarted = true;
        java.util.Iterator it = com.bumptech.glide.util.Util.getSnapshot(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.manager.LifecycleListener) it.next()).onStart();
        }
    }

    void onStop() {
        this.isStarted = false;
        java.util.Iterator it = com.bumptech.glide.util.Util.getSnapshot(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.manager.LifecycleListener) it.next()).onStop();
        }
    }

    void onDestroy() {
        this.isDestroyed = true;
        java.util.Iterator it = com.bumptech.glide.util.Util.getSnapshot(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.manager.LifecycleListener) it.next()).onDestroy();
        }
    }
}
