package com.airbnb.lottie.model;

/* loaded from: classes.dex */
public class LottieCompositionCache {
    private static final com.airbnb.lottie.model.LottieCompositionCache INSTANCE = new com.airbnb.lottie.model.LottieCompositionCache();
    private final androidx.collection.LruCache<java.lang.String, com.airbnb.lottie.LottieComposition> cache = new androidx.collection.LruCache<>(20);

    public static com.airbnb.lottie.model.LottieCompositionCache getInstance() {
        return INSTANCE;
    }

    LottieCompositionCache() {
    }

    public com.airbnb.lottie.LottieComposition get(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return this.cache.get(str);
    }

    public void put(java.lang.String str, com.airbnb.lottie.LottieComposition lottieComposition) {
        if (str == null) {
            return;
        }
        this.cache.put(str, lottieComposition);
    }

    public void clear() {
        this.cache.evictAll();
    }

    public void resize(int i) {
        this.cache.resize(i);
    }
}
