package com.bumptech.glide.util;

/* loaded from: /tmp/dex/classes2.dex */
public class LruCache<T, Y> {
    private final java.util.Map<T, com.bumptech.glide.util.LruCache.Entry<Y>> cache = new java.util.LinkedHashMap(100, 0.75f, true);
    private long currentSize;
    private final long initialMaxSize;
    private long maxSize;

    protected int getSize(Y y) {
        return 1;
    }

    protected void onItemEvicted(T t, Y y) {
    }

    public LruCache(long j) {
        this.initialMaxSize = j;
        this.maxSize = j;
    }

    public synchronized void setSizeMultiplier(float f) {
        if (f < 0.0f) {
            throw new java.lang.IllegalArgumentException("Multiplier must be >= 0");
        }
        this.maxSize = java.lang.Math.round(this.initialMaxSize * f);
        evict();
    }

    protected synchronized int getCount() {
        return this.cache.size();
    }

    public synchronized long getMaxSize() {
        return this.maxSize;
    }

    public synchronized long getCurrentSize() {
        return this.currentSize;
    }

    public synchronized boolean contains(T t) {
        return this.cache.containsKey(t);
    }

    public synchronized Y get(T t) {
        com.bumptech.glide.util.LruCache.Entry<Y> entry;
        entry = this.cache.get(t);
        return entry != null ? entry.value : null;
    }

    public synchronized Y put(T t, Y y) {
        int size = getSize(y);
        long j = size;
        if (j >= this.maxSize) {
            onItemEvicted(t, y);
            return null;
        }
        if (y != null) {
            this.currentSize += j;
        }
        com.bumptech.glide.util.LruCache.Entry<Y> put = this.cache.put(t, y == null ? null : new com.bumptech.glide.util.LruCache.Entry<>(y, size));
        if (put != null) {
            this.currentSize -= put.size;
            if (!put.value.equals(y)) {
                onItemEvicted(t, put.value);
            }
        }
        evict();
        return put != null ? put.value : null;
    }

    public synchronized Y remove(T t) {
        com.bumptech.glide.util.LruCache.Entry<Y> remove = this.cache.remove(t);
        if (remove == null) {
            return null;
        }
        this.currentSize -= remove.size;
        return remove.value;
    }

    public void clearMemory() {
        trimToSize(0L);
    }

    protected synchronized void trimToSize(long j) {
        while (this.currentSize > j) {
            java.util.Iterator<java.util.Map.Entry<T, com.bumptech.glide.util.LruCache.Entry<Y>>> it = this.cache.entrySet().iterator();
            java.util.Map.Entry<T, com.bumptech.glide.util.LruCache.Entry<Y>> next = it.next();
            com.bumptech.glide.util.LruCache.Entry<Y> value = next.getValue();
            this.currentSize -= value.size;
            T key = next.getKey();
            it.remove();
            onItemEvicted(key, value.value);
        }
    }

    private void evict() {
        trimToSize(this.maxSize);
    }

    static final class Entry<Y> {
        final int size;
        final Y value;

        Entry(Y y, int i) {
            this.value = y;
            this.size = i;
        }
    }
}
