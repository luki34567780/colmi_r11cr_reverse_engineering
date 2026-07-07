package com.luck.picture.lib.obj.pool;

/* loaded from: /tmp/dex/classes2.dex */
public final class ObjectPools {

    public interface Pool<T> {
        T acquire();

        void destroy();

        boolean release(T t);
    }

    public static class SimpleObjectPool<T> implements com.luck.picture.lib.obj.pool.ObjectPools.Pool<T> {
        private final java.util.LinkedList<T> mPool = new java.util.LinkedList<>();

        @Override // com.luck.picture.lib.obj.pool.ObjectPools.Pool
        public T acquire() {
            return this.mPool.poll();
        }

        @Override // com.luck.picture.lib.obj.pool.ObjectPools.Pool
        public boolean release(T t) {
            if (isInPool(t)) {
                return false;
            }
            return this.mPool.add(t);
        }

        @Override // com.luck.picture.lib.obj.pool.ObjectPools.Pool
        public void destroy() {
            this.mPool.clear();
        }

        private boolean isInPool(T t) {
            return this.mPool.contains(t);
        }
    }

    public static class SynchronizedPool<T> extends com.luck.picture.lib.obj.pool.ObjectPools.SimpleObjectPool<T> {
        private final java.lang.Object mLock = new java.lang.Object();

        @Override // com.luck.picture.lib.obj.pool.ObjectPools.SimpleObjectPool, com.luck.picture.lib.obj.pool.ObjectPools.Pool
        public T acquire() {
            T t;
            synchronized (this.mLock) {
                t = (T) super.acquire();
            }
            return t;
        }

        @Override // com.luck.picture.lib.obj.pool.ObjectPools.SimpleObjectPool, com.luck.picture.lib.obj.pool.ObjectPools.Pool
        public boolean release(T t) {
            boolean release;
            synchronized (this.mLock) {
                release = super.release(t);
            }
            return release;
        }

        @Override // com.luck.picture.lib.obj.pool.ObjectPools.SimpleObjectPool, com.luck.picture.lib.obj.pool.ObjectPools.Pool
        public void destroy() {
            synchronized (this.mLock) {
                super.destroy();
            }
        }
    }
}
