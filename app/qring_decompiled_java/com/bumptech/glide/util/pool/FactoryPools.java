package com.bumptech.glide.util.pool;

/* loaded from: /tmp/dex/classes2.dex */
public final class FactoryPools {
    private static final int DEFAULT_POOL_SIZE = 20;
    private static final com.bumptech.glide.util.pool.FactoryPools.Resetter<java.lang.Object> EMPTY_RESETTER = new com.bumptech.glide.util.pool.FactoryPools.Resetter<java.lang.Object>() { // from class: com.bumptech.glide.util.pool.FactoryPools.1
        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        public void reset(java.lang.Object obj) {
        }
    };
    private static final java.lang.String TAG = "FactoryPools";

    public interface Factory<T> {
        T create();
    }

    public interface Poolable {
        com.bumptech.glide.util.pool.StateVerifier getVerifier();
    }

    public interface Resetter<T> {
        void reset(T t);
    }

    private FactoryPools() {
    }

    public static <T extends com.bumptech.glide.util.pool.FactoryPools.Poolable> androidx.core.util.Pools.Pool<T> simple(int i, com.bumptech.glide.util.pool.FactoryPools.Factory<T> factory) {
        return build(new androidx.core.util.Pools.SimplePool(i), factory);
    }

    public static <T extends com.bumptech.glide.util.pool.FactoryPools.Poolable> androidx.core.util.Pools.Pool<T> threadSafe(int i, com.bumptech.glide.util.pool.FactoryPools.Factory<T> factory) {
        return build(new androidx.core.util.Pools.SynchronizedPool(i), factory);
    }

    public static <T> androidx.core.util.Pools.Pool<java.util.List<T>> threadSafeList() {
        return threadSafeList(20);
    }

    public static <T> androidx.core.util.Pools.Pool<java.util.List<T>> threadSafeList(int i) {
        return build(new androidx.core.util.Pools.SynchronizedPool(i), new com.bumptech.glide.util.pool.FactoryPools.Factory<java.util.List<T>>() { // from class: com.bumptech.glide.util.pool.FactoryPools.2
            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            public java.util.List<T> create() {
                return new java.util.ArrayList();
            }
        }, new com.bumptech.glide.util.pool.FactoryPools.Resetter<java.util.List<T>>() { // from class: com.bumptech.glide.util.pool.FactoryPools.3
            @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
            public void reset(java.util.List<T> list) {
                list.clear();
            }
        });
    }

    private static <T extends com.bumptech.glide.util.pool.FactoryPools.Poolable> androidx.core.util.Pools.Pool<T> build(androidx.core.util.Pools.Pool<T> pool, com.bumptech.glide.util.pool.FactoryPools.Factory<T> factory) {
        return build(pool, factory, emptyResetter());
    }

    private static <T> androidx.core.util.Pools.Pool<T> build(androidx.core.util.Pools.Pool<T> pool, com.bumptech.glide.util.pool.FactoryPools.Factory<T> factory, com.bumptech.glide.util.pool.FactoryPools.Resetter<T> resetter) {
        return new com.bumptech.glide.util.pool.FactoryPools.FactoryPool(pool, factory, resetter);
    }

    private static <T> com.bumptech.glide.util.pool.FactoryPools.Resetter<T> emptyResetter() {
        return (com.bumptech.glide.util.pool.FactoryPools.Resetter<T>) EMPTY_RESETTER;
    }

    private static final class FactoryPool<T> implements androidx.core.util.Pools.Pool<T> {
        private final com.bumptech.glide.util.pool.FactoryPools.Factory<T> factory;
        private final androidx.core.util.Pools.Pool<T> pool;
        private final com.bumptech.glide.util.pool.FactoryPools.Resetter<T> resetter;

        FactoryPool(androidx.core.util.Pools.Pool<T> pool, com.bumptech.glide.util.pool.FactoryPools.Factory<T> factory, com.bumptech.glide.util.pool.FactoryPools.Resetter<T> resetter) {
            this.pool = pool;
            this.factory = factory;
            this.resetter = resetter;
        }

        public T acquire() {
            T t = (T) this.pool.acquire();
            if (t == null) {
                t = this.factory.create();
                if (android.util.Log.isLoggable(com.bumptech.glide.util.pool.FactoryPools.TAG, 2)) {
                    android.util.Log.v(com.bumptech.glide.util.pool.FactoryPools.TAG, "Created new " + t.getClass());
                }
            }
            if (t instanceof com.bumptech.glide.util.pool.FactoryPools.Poolable) {
                t.getVerifier().setRecycled(false);
            }
            return (T) t;
        }

        public boolean release(T t) {
            if (t instanceof com.bumptech.glide.util.pool.FactoryPools.Poolable) {
                ((com.bumptech.glide.util.pool.FactoryPools.Poolable) t).getVerifier().setRecycled(true);
            }
            this.resetter.reset(t);
            return this.pool.release(t);
        }
    }
}
