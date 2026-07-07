package com.bumptech.glide.load.engine.cache;

/* loaded from: classes.dex */
public interface MemoryCache {

    public interface ResourceRemovedListener {
        void onResourceRemoved(com.bumptech.glide.load.engine.Resource<?> resource);
    }

    void clearMemory();

    long getCurrentSize();

    long getMaxSize();

    com.bumptech.glide.load.engine.Resource<?> put(com.bumptech.glide.load.Key key, com.bumptech.glide.load.engine.Resource<?> resource);

    com.bumptech.glide.load.engine.Resource<?> remove(com.bumptech.glide.load.Key key);

    void setResourceRemovedListener(com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener resourceRemovedListener);

    void setSizeMultiplier(float f);

    void trimMemory(int i);
}
