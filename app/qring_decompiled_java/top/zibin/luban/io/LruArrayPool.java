package top.zibin.luban.io;

/* loaded from: classes3.dex */
public final class LruArrayPool implements top.zibin.luban.io.ArrayPool {
    public static final int DEFAULT_SIZE = 4194304;
    static final int MAX_OVER_SIZE_MULTIPLE = 8;
    private static final int SINGLE_ARRAY_MAX_SIZE_DIVISOR = 2;
    private final java.util.Map<java.lang.Class<?>, top.zibin.luban.io.ArrayAdapterInterface<?>> adapters;
    private int currentSize;
    private final top.zibin.luban.io.GroupedLinkedMap<top.zibin.luban.io.LruArrayPool.Key, java.lang.Object> groupedMap;
    private final top.zibin.luban.io.LruArrayPool.KeyPool keyPool;
    private final int maxSize;
    private final java.util.Map<java.lang.Class<?>, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> sortedSizes;

    public LruArrayPool() {
        this.groupedMap = new top.zibin.luban.io.GroupedLinkedMap<>();
        this.keyPool = new top.zibin.luban.io.LruArrayPool.KeyPool();
        this.sortedSizes = new java.util.HashMap();
        this.adapters = new java.util.HashMap();
        this.maxSize = 4194304;
    }

    public LruArrayPool(int i) {
        this.groupedMap = new top.zibin.luban.io.GroupedLinkedMap<>();
        this.keyPool = new top.zibin.luban.io.LruArrayPool.KeyPool();
        this.sortedSizes = new java.util.HashMap();
        this.adapters = new java.util.HashMap();
        this.maxSize = i;
    }

    @Override // top.zibin.luban.io.ArrayPool
    @java.lang.Deprecated
    public <T> void put(T t, java.lang.Class<T> cls) {
        put(t);
    }

    @Override // top.zibin.luban.io.ArrayPool
    public synchronized <T> void put(T t) {
        java.lang.Class<?> cls = t.getClass();
        top.zibin.luban.io.ArrayAdapterInterface<T> adapterFromType = getAdapterFromType(cls);
        int arrayLength = adapterFromType.getArrayLength(t);
        int elementSizeInBytes = adapterFromType.getElementSizeInBytes() * arrayLength;
        if (isSmallEnoughForReuse(elementSizeInBytes)) {
            top.zibin.luban.io.LruArrayPool.Key key = this.keyPool.get(arrayLength, cls);
            this.groupedMap.put(key, t);
            java.util.NavigableMap<java.lang.Integer, java.lang.Integer> sizesForAdapter = getSizesForAdapter(cls);
            java.lang.Integer num = (java.lang.Integer) sizesForAdapter.get(java.lang.Integer.valueOf(key.size));
            java.lang.Integer valueOf = java.lang.Integer.valueOf(key.size);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            sizesForAdapter.put(valueOf, java.lang.Integer.valueOf(i));
            this.currentSize += elementSizeInBytes;
            evict();
        }
    }

    @Override // top.zibin.luban.io.ArrayPool
    public synchronized <T> T get(int i, java.lang.Class<T> cls) {
        top.zibin.luban.io.LruArrayPool.Key key;
        java.lang.Integer ceilingKey = getSizesForAdapter(cls).ceilingKey(java.lang.Integer.valueOf(i));
        if (mayFillRequest(i, ceilingKey)) {
            key = this.keyPool.get(ceilingKey.intValue(), cls);
        } else {
            key = this.keyPool.get(i, cls);
        }
        return (T) getForKey(key, cls);
    }

    private <T> T getForKey(top.zibin.luban.io.LruArrayPool.Key key, java.lang.Class<T> cls) {
        top.zibin.luban.io.ArrayAdapterInterface<T> adapterFromType = getAdapterFromType(cls);
        T t = (T) getArrayForKey(key);
        if (t != null) {
            this.currentSize -= adapterFromType.getArrayLength(t) * adapterFromType.getElementSizeInBytes();
            decrementArrayOfSize(adapterFromType.getArrayLength(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (android.util.Log.isLoggable(adapterFromType.getTag(), 2)) {
            android.util.Log.v(adapterFromType.getTag(), "Allocated " + key.size + " bytes");
        }
        return adapterFromType.newArray(key.size);
    }

    private <T> T getArrayForKey(top.zibin.luban.io.LruArrayPool.Key key) {
        return (T) this.groupedMap.get(key);
    }

    private boolean isSmallEnoughForReuse(int i) {
        return i <= this.maxSize / 2;
    }

    private boolean mayFillRequest(int i, java.lang.Integer num) {
        return num != null && (isNoMoreThanHalfFull() || num.intValue() <= i * 8);
    }

    private boolean isNoMoreThanHalfFull() {
        int i = this.currentSize;
        return i == 0 || this.maxSize / i >= 2;
    }

    @Override // top.zibin.luban.io.ArrayPool
    public synchronized void clearMemory() {
        evictToSize(0);
    }

    private void evict() {
        evictToSize(this.maxSize);
    }

    private void evictToSize(int i) {
        while (this.currentSize > i) {
            java.lang.Object removeLast = this.groupedMap.removeLast();
            top.zibin.luban.io.ArrayAdapterInterface adapterFromObject = getAdapterFromObject(removeLast);
            this.currentSize -= adapterFromObject.getArrayLength(removeLast) * adapterFromObject.getElementSizeInBytes();
            decrementArrayOfSize(adapterFromObject.getArrayLength(removeLast), removeLast.getClass());
            if (android.util.Log.isLoggable(adapterFromObject.getTag(), 2)) {
                android.util.Log.v(adapterFromObject.getTag(), "evicted: " + adapterFromObject.getArrayLength(removeLast));
            }
        }
    }

    private void decrementArrayOfSize(int i, java.lang.Class<?> cls) {
        java.util.NavigableMap<java.lang.Integer, java.lang.Integer> sizesForAdapter = getSizesForAdapter(cls);
        java.lang.Integer num = (java.lang.Integer) sizesForAdapter.get(java.lang.Integer.valueOf(i));
        if (num == null) {
            throw new java.lang.NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        }
        if (num.intValue() == 1) {
            sizesForAdapter.remove(java.lang.Integer.valueOf(i));
        } else {
            sizesForAdapter.put(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(num.intValue() - 1));
        }
    }

    private java.util.NavigableMap<java.lang.Integer, java.lang.Integer> getSizesForAdapter(java.lang.Class<?> cls) {
        java.util.NavigableMap<java.lang.Integer, java.lang.Integer> navigableMap = this.sortedSizes.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap();
        this.sortedSizes.put(cls, treeMap);
        return treeMap;
    }

    private <T> top.zibin.luban.io.ArrayAdapterInterface<T> getAdapterFromObject(T t) {
        return getAdapterFromType(t.getClass());
    }

    private <T> top.zibin.luban.io.ArrayAdapterInterface<T> getAdapterFromType(java.lang.Class<T> cls) {
        top.zibin.luban.io.ArrayAdapterInterface<T> arrayAdapterInterface = (top.zibin.luban.io.ArrayAdapterInterface) this.adapters.get(cls);
        if (arrayAdapterInterface == null) {
            if (cls.equals(int[].class)) {
                arrayAdapterInterface = new top.zibin.luban.io.IntegerArrayAdapter();
            } else if (cls.equals(byte[].class)) {
                arrayAdapterInterface = new top.zibin.luban.io.ByteArrayAdapter();
            } else {
                throw new java.lang.IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.adapters.put(cls, arrayAdapterInterface);
        }
        return arrayAdapterInterface;
    }

    int getCurrentSize() {
        int i = 0;
        for (java.lang.Class<?> cls : this.sortedSizes.keySet()) {
            for (java.lang.Integer num : this.sortedSizes.get(cls).keySet()) {
                i += num.intValue() * ((java.lang.Integer) this.sortedSizes.get(cls).get(num)).intValue() * getAdapterFromType(cls).getElementSizeInBytes();
            }
        }
        return i;
    }

    private static final class KeyPool extends top.zibin.luban.io.BaseKeyPool<top.zibin.luban.io.LruArrayPool.Key> {
        KeyPool() {
        }

        top.zibin.luban.io.LruArrayPool.Key get(int i, java.lang.Class<?> cls) {
            top.zibin.luban.io.LruArrayPool.Key key = get();
            key.init(i, cls);
            return key;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // top.zibin.luban.io.BaseKeyPool
        public top.zibin.luban.io.LruArrayPool.Key create() {
            return new top.zibin.luban.io.LruArrayPool.Key(this);
        }
    }

    private static final class Key implements top.zibin.luban.io.PoolAble {
        private java.lang.Class<?> arrayClass;
        private final top.zibin.luban.io.LruArrayPool.KeyPool pool;
        int size;

        Key(top.zibin.luban.io.LruArrayPool.KeyPool keyPool) {
            this.pool = keyPool;
        }

        void init(int i, java.lang.Class<?> cls) {
            this.size = i;
            this.arrayClass = cls;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof top.zibin.luban.io.LruArrayPool.Key)) {
                return false;
            }
            top.zibin.luban.io.LruArrayPool.Key key = (top.zibin.luban.io.LruArrayPool.Key) obj;
            return this.size == key.size && this.arrayClass == key.arrayClass;
        }

        public java.lang.String toString() {
            return "Key{size=" + this.size + "array=" + this.arrayClass + '}';
        }

        @Override // top.zibin.luban.io.PoolAble
        public void offer() {
            this.pool.offer(this);
        }

        public int hashCode() {
            int i = this.size * 31;
            java.lang.Class<?> cls = this.arrayClass;
            return i + (cls != null ? cls.hashCode() : 0);
        }
    }
}
