package com.bumptech.glide.load.model;

/* loaded from: /tmp/dex/classes2.dex */
public class ModelCache<A, B> {
    private static final int DEFAULT_SIZE = 250;
    private final com.bumptech.glide.util.LruCache<com.bumptech.glide.load.model.ModelCache.ModelKey<A>, B> cache;

    public ModelCache() {
        this(250L);
    }

    public ModelCache(long j) {
        this.cache = new com.bumptech.glide.util.LruCache<com.bumptech.glide.load.model.ModelCache.ModelKey<A>, B>(j) { // from class: com.bumptech.glide.load.model.ModelCache.1
            @Override // com.bumptech.glide.util.LruCache
            protected /* bridge */ /* synthetic */ void onItemEvicted(java.lang.Object obj, java.lang.Object obj2) {
                onItemEvicted((com.bumptech.glide.load.model.ModelCache.ModelKey) obj, (com.bumptech.glide.load.model.ModelCache.ModelKey<A>) obj2);
            }

            protected void onItemEvicted(com.bumptech.glide.load.model.ModelCache.ModelKey<A> modelKey, B b) {
                modelKey.release();
            }
        };
    }

    public B get(A a, int i, int i2) {
        com.bumptech.glide.load.model.ModelCache.ModelKey<A> modelKey = com.bumptech.glide.load.model.ModelCache.ModelKey.get(a, i, i2);
        B b = this.cache.get(modelKey);
        modelKey.release();
        return b;
    }

    public void put(A a, int i, int i2, B b) {
        this.cache.put(com.bumptech.glide.load.model.ModelCache.ModelKey.get(a, i, i2), b);
    }

    public void clear() {
        this.cache.clearMemory();
    }

    static final class ModelKey<A> {
        private static final java.util.Queue<com.bumptech.glide.load.model.ModelCache.ModelKey<?>> KEY_QUEUE = com.bumptech.glide.util.Util.createQueue(0);
        private int height;
        private A model;
        private int width;

        static <A> com.bumptech.glide.load.model.ModelCache.ModelKey<A> get(A a, int i, int i2) {
            com.bumptech.glide.load.model.ModelCache.ModelKey<A> modelKey;
            java.util.Queue<com.bumptech.glide.load.model.ModelCache.ModelKey<?>> queue = KEY_QUEUE;
            synchronized (queue) {
                modelKey = (com.bumptech.glide.load.model.ModelCache.ModelKey) queue.poll();
            }
            if (modelKey == null) {
                modelKey = new com.bumptech.glide.load.model.ModelCache.ModelKey<>();
            }
            modelKey.init(a, i, i2);
            return modelKey;
        }

        private ModelKey() {
        }

        private void init(A a, int i, int i2) {
            this.model = a;
            this.width = i;
            this.height = i2;
        }

        public void release() {
            java.util.Queue<com.bumptech.glide.load.model.ModelCache.ModelKey<?>> queue = KEY_QUEUE;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.bumptech.glide.load.model.ModelCache.ModelKey)) {
                return false;
            }
            com.bumptech.glide.load.model.ModelCache.ModelKey modelKey = (com.bumptech.glide.load.model.ModelCache.ModelKey) obj;
            return this.width == modelKey.width && this.height == modelKey.height && this.model.equals(modelKey.model);
        }

        public int hashCode() {
            return (((this.height * 31) + this.width) * 31) + this.model.hashCode();
        }
    }
}
