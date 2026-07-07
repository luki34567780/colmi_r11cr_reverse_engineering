package coil.memory;

/* compiled from: StrongMemoryCache.kt */
@kotlin.Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\b\b\u0000\u0018\u00002\u00020\u0001:\u0001$B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\fH\u0016J,\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0003H\u0016R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\"\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcoil/memory/RealStrongMemoryCache;", "Lcoil/memory/StrongMemoryCache;", "maxSize", "", "weakMemoryCache", "Lcoil/memory/WeakMemoryCache;", "(ILcoil/memory/WeakMemoryCache;)V", "cache", "coil/memory/RealStrongMemoryCache$cache$1", "Lcoil/memory/RealStrongMemoryCache$cache$1;", "keys", "", "Lcoil/memory/MemoryCache$Key;", "kotlin.jvm.PlatformType", "getKeys", "()Ljava/util/Set;", "getMaxSize", "()I", "size", "getSize", "clearMemory", "", "get", "Lcoil/memory/MemoryCache$Value;", "key", "remove", "", "set", "bitmap", "Landroid/graphics/Bitmap;", "extras", "", "", "", "trimMemory", "level", "InternalValue", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RealStrongMemoryCache implements coil.memory.StrongMemoryCache {
    private final coil.memory.RealStrongMemoryCache$cache$1 cache;
    private final coil.memory.WeakMemoryCache weakMemoryCache;

    /* JADX WARN: Type inference failed for: r2v1, types: [coil.memory.RealStrongMemoryCache$cache$1] */
    public RealStrongMemoryCache(final int i, coil.memory.WeakMemoryCache weakMemoryCache) {
        this.weakMemoryCache = weakMemoryCache;
        this.cache = new androidx.collection.LruCache<coil.memory.MemoryCache.Key, coil.memory.RealStrongMemoryCache.InternalValue>(i, this) { // from class: coil.memory.RealStrongMemoryCache$cache$1
            final /* synthetic */ int $maxSize;
            final /* synthetic */ coil.memory.RealStrongMemoryCache this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(i);
                this.$maxSize = i;
                this.this$0 = this;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.collection.LruCache
            public int sizeOf(coil.memory.MemoryCache.Key key, coil.memory.RealStrongMemoryCache.InternalValue value) {
                return value.getSize();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.collection.LruCache
            public void entryRemoved(boolean evicted, coil.memory.MemoryCache.Key key, coil.memory.RealStrongMemoryCache.InternalValue oldValue, coil.memory.RealStrongMemoryCache.InternalValue newValue) {
                coil.memory.WeakMemoryCache weakMemoryCache2;
                weakMemoryCache2 = this.this$0.weakMemoryCache;
                weakMemoryCache2.set(key, oldValue.getBitmap(), oldValue.getExtras(), oldValue.getSize());
            }
        };
    }

    @Override // coil.memory.StrongMemoryCache
    public int getSize() {
        return size();
    }

    @Override // coil.memory.StrongMemoryCache
    public int getMaxSize() {
        return maxSize();
    }

    @Override // coil.memory.StrongMemoryCache
    public java.util.Set<coil.memory.MemoryCache.Key> getKeys() {
        return snapshot().keySet();
    }

    @Override // coil.memory.StrongMemoryCache
    public coil.memory.MemoryCache.Value get(coil.memory.MemoryCache.Key key) {
        coil.memory.RealStrongMemoryCache.InternalValue internalValue = get(key);
        if (internalValue == null) {
            return null;
        }
        return new coil.memory.MemoryCache.Value(internalValue.getBitmap(), internalValue.getExtras());
    }

    @Override // coil.memory.StrongMemoryCache
    public void set(coil.memory.MemoryCache.Key key, android.graphics.Bitmap bitmap, java.util.Map<java.lang.String, ? extends java.lang.Object> extras) {
        int allocationByteCountCompat = coil.util.Bitmaps.getAllocationByteCountCompat(bitmap);
        if (allocationByteCountCompat <= getMaxSize()) {
            put(key, new coil.memory.RealStrongMemoryCache.InternalValue(bitmap, extras, allocationByteCountCompat));
        } else {
            remove(key);
            this.weakMemoryCache.set(key, bitmap, extras, allocationByteCountCompat);
        }
    }

    @Override // coil.memory.StrongMemoryCache
    public boolean remove(coil.memory.MemoryCache.Key key) {
        return remove(key) != null;
    }

    @Override // coil.memory.StrongMemoryCache
    public void clearMemory() {
        evictAll();
    }

    @Override // coil.memory.StrongMemoryCache
    public void trimMemory(int level) {
        if (level >= 40) {
            clearMemory();
            return;
        }
        boolean z = false;
        if (10 <= level && level < 20) {
            z = true;
        }
        if (z) {
            trimToSize(getSize() / 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StrongMemoryCache.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcoil/memory/RealStrongMemoryCache$InternalValue;", "", "bitmap", "Landroid/graphics/Bitmap;", "extras", "", "", "size", "", "(Landroid/graphics/Bitmap;Ljava/util/Map;I)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getExtras", "()Ljava/util/Map;", "getSize", "()I", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    static final class InternalValue {
        private final android.graphics.Bitmap bitmap;
        private final java.util.Map<java.lang.String, java.lang.Object> extras;
        private final int size;

        public InternalValue(android.graphics.Bitmap bitmap, java.util.Map<java.lang.String, ? extends java.lang.Object> map, int i) {
            this.bitmap = bitmap;
            this.extras = map;
            this.size = i;
        }

        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getExtras() {
            return this.extras;
        }

        public final int getSize() {
            return this.size;
        }
    }
}
