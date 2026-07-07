package com.airbnb.lottie;

/* loaded from: classes.dex */
public class LottieConfig {
    final com.airbnb.lottie.network.LottieNetworkCacheProvider cacheProvider;
    final boolean enableSystraceMarkers;
    final com.airbnb.lottie.network.LottieNetworkFetcher networkFetcher;

    private LottieConfig(com.airbnb.lottie.network.LottieNetworkFetcher lottieNetworkFetcher, com.airbnb.lottie.network.LottieNetworkCacheProvider lottieNetworkCacheProvider, boolean z) {
        this.networkFetcher = lottieNetworkFetcher;
        this.cacheProvider = lottieNetworkCacheProvider;
        this.enableSystraceMarkers = z;
    }

    public static final class Builder {
        private com.airbnb.lottie.network.LottieNetworkCacheProvider cacheProvider;
        private boolean enableSystraceMarkers = false;
        private com.airbnb.lottie.network.LottieNetworkFetcher networkFetcher;

        public com.airbnb.lottie.LottieConfig.Builder setNetworkFetcher(com.airbnb.lottie.network.LottieNetworkFetcher lottieNetworkFetcher) {
            this.networkFetcher = lottieNetworkFetcher;
            return this;
        }

        public com.airbnb.lottie.LottieConfig.Builder setNetworkCacheDir(final java.io.File file) {
            if (this.cacheProvider != null) {
                throw new java.lang.IllegalStateException("There is already a cache provider!");
            }
            this.cacheProvider = new com.airbnb.lottie.network.LottieNetworkCacheProvider() { // from class: com.airbnb.lottie.LottieConfig.Builder.1
                @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
                public java.io.File getCacheDir() {
                    if (!file.isDirectory()) {
                        throw new java.lang.IllegalArgumentException("cache file must be a directory");
                    }
                    return file;
                }
            };
            return this;
        }

        public com.airbnb.lottie.LottieConfig.Builder setNetworkCacheProvider(final com.airbnb.lottie.network.LottieNetworkCacheProvider lottieNetworkCacheProvider) {
            if (this.cacheProvider != null) {
                throw new java.lang.IllegalStateException("There is already a cache provider!");
            }
            this.cacheProvider = new com.airbnb.lottie.network.LottieNetworkCacheProvider() { // from class: com.airbnb.lottie.LottieConfig.Builder.2
                @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
                public java.io.File getCacheDir() {
                    java.io.File cacheDir = lottieNetworkCacheProvider.getCacheDir();
                    if (cacheDir.isDirectory()) {
                        return cacheDir;
                    }
                    throw new java.lang.IllegalArgumentException("cache file must be a directory");
                }
            };
            return this;
        }

        public com.airbnb.lottie.LottieConfig.Builder setEnableSystraceMarkers(boolean z) {
            this.enableSystraceMarkers = z;
            return this;
        }

        public com.airbnb.lottie.LottieConfig build() {
            return new com.airbnb.lottie.LottieConfig(this.networkFetcher, this.cacheProvider, this.enableSystraceMarkers);
        }
    }
}
