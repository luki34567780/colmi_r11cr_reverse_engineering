package com.bumptech.glide.load.engine.bitmap_recycle;

/* loaded from: classes.dex */
public class SizeConfigStrategy implements com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy {
    private static final android.graphics.Bitmap.Config[] ALPHA_8_IN_CONFIGS;
    private static final android.graphics.Bitmap.Config[] ARGB_4444_IN_CONFIGS;
    private static final android.graphics.Bitmap.Config[] ARGB_8888_IN_CONFIGS;
    private static final int MAX_SIZE_MULTIPLE = 8;
    private static final android.graphics.Bitmap.Config[] RGBA_F16_IN_CONFIGS;
    private static final android.graphics.Bitmap.Config[] RGB_565_IN_CONFIGS;
    private final com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.KeyPool keyPool = new com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.KeyPool();
    private final com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key, android.graphics.Bitmap> groupedMap = new com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<>();
    private final java.util.Map<android.graphics.Bitmap.Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> sortedSizes = new java.util.HashMap();

    static {
        android.graphics.Bitmap.Config[] configArr = {android.graphics.Bitmap.Config.ARGB_8888, null};
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            configArr = (android.graphics.Bitmap.Config[]) java.util.Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = android.graphics.Bitmap.Config.RGBA_F16;
        }
        ARGB_8888_IN_CONFIGS = configArr;
        RGBA_F16_IN_CONFIGS = configArr;
        RGB_565_IN_CONFIGS = new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.RGB_565};
        ARGB_4444_IN_CONFIGS = new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.ARGB_4444};
        ALPHA_8_IN_CONFIGS = new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.ALPHA_8};
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public void put(android.graphics.Bitmap bitmap) {
        com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key key = this.keyPool.get(com.bumptech.glide.util.Util.getBitmapByteSize(bitmap), bitmap.getConfig());
        this.groupedMap.put(key, bitmap);
        java.util.NavigableMap<java.lang.Integer, java.lang.Integer> sizesForConfig = getSizesForConfig(bitmap.getConfig());
        java.lang.Integer num = (java.lang.Integer) sizesForConfig.get(java.lang.Integer.valueOf(key.size));
        sizesForConfig.put(java.lang.Integer.valueOf(key.size), java.lang.Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public android.graphics.Bitmap get(int i, int i2, android.graphics.Bitmap.Config config) {
        com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key findBestKey = findBestKey(com.bumptech.glide.util.Util.getBitmapByteSize(i, i2, config), config);
        android.graphics.Bitmap bitmap = this.groupedMap.get(findBestKey);
        if (bitmap != null) {
            decrementBitmapOfSize(java.lang.Integer.valueOf(findBestKey.size), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    private com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key findBestKey(int i, android.graphics.Bitmap.Config config) {
        com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key key = this.keyPool.get(i, config);
        for (android.graphics.Bitmap.Config config2 : getInConfigs(config)) {
            java.lang.Integer ceilingKey = getSizesForConfig(config2).ceilingKey(java.lang.Integer.valueOf(i));
            if (ceilingKey != null && ceilingKey.intValue() <= i * 8) {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return key;
                        }
                    } else if (config2.equals(config)) {
                        return key;
                    }
                }
                this.keyPool.offer(key);
                return this.keyPool.get(ceilingKey.intValue(), config2);
            }
        }
        return key;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public android.graphics.Bitmap removeLast() {
        android.graphics.Bitmap removeLast = this.groupedMap.removeLast();
        if (removeLast != null) {
            decrementBitmapOfSize(java.lang.Integer.valueOf(com.bumptech.glide.util.Util.getBitmapByteSize(removeLast)), removeLast);
        }
        return removeLast;
    }

    private void decrementBitmapOfSize(java.lang.Integer num, android.graphics.Bitmap bitmap) {
        java.util.NavigableMap<java.lang.Integer, java.lang.Integer> sizesForConfig = getSizesForConfig(bitmap.getConfig());
        java.lang.Integer num2 = (java.lang.Integer) sizesForConfig.get(num);
        if (num2 == null) {
            throw new java.lang.NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + logBitmap(bitmap) + ", this: " + this);
        }
        if (num2.intValue() == 1) {
            sizesForConfig.remove(num);
        } else {
            sizesForConfig.put(num, java.lang.Integer.valueOf(num2.intValue() - 1));
        }
    }

    private java.util.NavigableMap<java.lang.Integer, java.lang.Integer> getSizesForConfig(android.graphics.Bitmap.Config config) {
        java.util.NavigableMap<java.lang.Integer, java.lang.Integer> navigableMap = this.sortedSizes.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap();
        this.sortedSizes.put(config, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public java.lang.String logBitmap(android.graphics.Bitmap bitmap) {
        return getBitmapString(com.bumptech.glide.util.Util.getBitmapByteSize(bitmap), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public java.lang.String logBitmap(int i, int i2, android.graphics.Bitmap.Config config) {
        return getBitmapString(com.bumptech.glide.util.Util.getBitmapByteSize(i, i2, config), config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public int getSize(android.graphics.Bitmap bitmap) {
        return com.bumptech.glide.util.Util.getBitmapByteSize(bitmap);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.groupedMap);
        sb.append(", sortedSizes=(");
        for (java.util.Map.Entry<android.graphics.Bitmap.Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> entry : this.sortedSizes.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.sortedSizes.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    static class KeyPool extends com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool<com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key> {
        KeyPool() {
        }

        public com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key get(int i, android.graphics.Bitmap.Config config) {
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key key = get();
            key.init(i, config);
            return key;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool
        public com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key create() {
            return new com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key(this);
        }
    }

    static final class Key implements com.bumptech.glide.load.engine.bitmap_recycle.Poolable {
        private android.graphics.Bitmap.Config config;
        private final com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.KeyPool pool;
        int size;

        public Key(com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.KeyPool keyPool) {
            this.pool = keyPool;
        }

        Key(com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.KeyPool keyPool, int i, android.graphics.Bitmap.Config config) {
            this(keyPool);
            init(i, config);
        }

        public void init(int i, android.graphics.Bitmap.Config config) {
            this.size = i;
            this.config = config;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        public void offer() {
            this.pool.offer(this);
        }

        public java.lang.String toString() {
            return com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.getBitmapString(this.size, this.config);
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key)) {
                return false;
            }
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key key = (com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key) obj;
            return this.size == key.size && com.bumptech.glide.util.Util.bothNullOrEqual(this.config, key.config);
        }

        public int hashCode() {
            int i = this.size * 31;
            android.graphics.Bitmap.Config config = this.config;
            return i + (config != null ? config.hashCode() : 0);
        }
    }

    static java.lang.String getBitmapString(int i, android.graphics.Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    private static android.graphics.Bitmap.Config[] getInConfigs(android.graphics.Bitmap.Config config) {
        if (android.os.Build.VERSION.SDK_INT >= 26 && android.graphics.Bitmap.Config.RGBA_F16.equals(config)) {
            return RGBA_F16_IN_CONFIGS;
        }
        int i = com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config[config.ordinal()];
        if (i == 1) {
            return ARGB_8888_IN_CONFIGS;
        }
        if (i == 2) {
            return RGB_565_IN_CONFIGS;
        }
        if (i != 3) {
            return i != 4 ? new android.graphics.Bitmap.Config[]{config} : ALPHA_8_IN_CONFIGS;
        }
        return ARGB_4444_IN_CONFIGS;
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        static {
            int[] iArr = new int[android.graphics.Bitmap.Config.values().length];
            $SwitchMap$android$graphics$Bitmap$Config = iArr;
            try {
                iArr[android.graphics.Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }
}
