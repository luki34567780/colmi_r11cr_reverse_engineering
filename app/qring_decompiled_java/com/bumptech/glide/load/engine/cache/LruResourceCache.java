package com.bumptech.glide.load.engine.cache;

/* loaded from: classes.dex */
public class LruResourceCache extends com.bumptech.glide.util.LruCache<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.Resource<?>> implements com.bumptech.glide.load.engine.cache.MemoryCache {
    private com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener listener;

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource put(com.bumptech.glide.load.Key key, com.bumptech.glide.load.engine.Resource resource) {
        return (com.bumptech.glide.load.engine.Resource) super.put((com.bumptech.glide.load.engine.cache.LruResourceCache) key, (com.bumptech.glide.load.Key) resource);
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource remove(com.bumptech.glide.load.Key key) {
        return (com.bumptech.glide.load.engine.Resource) super.remove((com.bumptech.glide.load.engine.cache.LruResourceCache) key);
    }

    public LruResourceCache(long j) {
        super(j);
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public void setResourceRemovedListener(com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener resourceRemovedListener) {
        this.listener = resourceRemovedListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.util.LruCache
    public void onItemEvicted(com.bumptech.glide.load.Key key, com.bumptech.glide.load.engine.Resource<?> resource) {
        com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener resourceRemovedListener = this.listener;
        if (resourceRemovedListener == null || resource == null) {
            return;
        }
        resourceRemovedListener.onResourceRemoved(resource);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.util.LruCache
    public int getSize(com.bumptech.glide.load.engine.Resource<?> resource) {
        if (resource == null) {
            return super.getSize((com.bumptech.glide.load.engine.cache.LruResourceCache) null);
        }
        return resource.getSize();
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public void trimMemory(int i) {
        if (i >= 40) {
            clearMemory();
        } else if (i >= 20 || i == 15) {
            trimToSize(getMaxSize() / 2);
        }
    }
}
