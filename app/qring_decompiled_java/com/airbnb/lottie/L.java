package com.airbnb.lottie;

/* loaded from: classes.dex */
public class L {
    public static boolean DBG = false;
    private static final int MAX_DEPTH = 20;
    public static final java.lang.String TAG = "LOTTIE";
    private static com.airbnb.lottie.network.LottieNetworkCacheProvider cacheProvider;
    private static int depthPastMaxDepth;
    private static com.airbnb.lottie.network.LottieNetworkFetcher fetcher;
    private static volatile com.airbnb.lottie.network.NetworkCache networkCache;
    private static volatile com.airbnb.lottie.network.NetworkFetcher networkFetcher;
    private static java.lang.String[] sections;
    private static long[] startTimeNs;
    private static int traceDepth;
    private static boolean traceEnabled;

    private L() {
    }

    public static void setTraceEnabled(boolean z) {
        if (traceEnabled == z) {
            return;
        }
        traceEnabled = z;
        if (z) {
            sections = new java.lang.String[20];
            startTimeNs = new long[20];
        }
    }

    public static void beginSection(java.lang.String str) {
        if (traceEnabled) {
            int i = traceDepth;
            if (i == 20) {
                depthPastMaxDepth++;
                return;
            }
            sections[i] = str;
            startTimeNs[i] = java.lang.System.nanoTime();
            androidx.core.os.TraceCompat.beginSection(str);
            traceDepth++;
        }
    }

    public static float endSection(java.lang.String str) {
        int i = depthPastMaxDepth;
        if (i > 0) {
            depthPastMaxDepth = i - 1;
            return 0.0f;
        }
        if (!traceEnabled) {
            return 0.0f;
        }
        int i2 = traceDepth - 1;
        traceDepth = i2;
        if (i2 == -1) {
            throw new java.lang.IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(sections[i2])) {
            throw new java.lang.IllegalStateException("Unbalanced trace call " + str + ". Expected " + sections[traceDepth] + ".");
        }
        androidx.core.os.TraceCompat.endSection();
        return (java.lang.System.nanoTime() - startTimeNs[traceDepth]) / 1000000.0f;
    }

    public static void setFetcher(com.airbnb.lottie.network.LottieNetworkFetcher lottieNetworkFetcher) {
        fetcher = lottieNetworkFetcher;
    }

    public static void setCacheProvider(com.airbnb.lottie.network.LottieNetworkCacheProvider lottieNetworkCacheProvider) {
        cacheProvider = lottieNetworkCacheProvider;
    }

    public static com.airbnb.lottie.network.NetworkFetcher networkFetcher(android.content.Context context) {
        com.airbnb.lottie.network.NetworkFetcher networkFetcher2 = networkFetcher;
        if (networkFetcher2 == null) {
            synchronized (com.airbnb.lottie.network.NetworkFetcher.class) {
                networkFetcher2 = networkFetcher;
                if (networkFetcher2 == null) {
                    com.airbnb.lottie.network.NetworkCache networkCache2 = networkCache(context);
                    com.airbnb.lottie.network.LottieNetworkFetcher lottieNetworkFetcher = fetcher;
                    if (lottieNetworkFetcher == null) {
                        lottieNetworkFetcher = new com.airbnb.lottie.network.DefaultLottieNetworkFetcher();
                    }
                    networkFetcher2 = new com.airbnb.lottie.network.NetworkFetcher(networkCache2, lottieNetworkFetcher);
                    networkFetcher = networkFetcher2;
                }
            }
        }
        return networkFetcher2;
    }

    public static com.airbnb.lottie.network.NetworkCache networkCache(final android.content.Context context) {
        com.airbnb.lottie.network.NetworkCache networkCache2 = networkCache;
        if (networkCache2 == null) {
            synchronized (com.airbnb.lottie.network.NetworkCache.class) {
                networkCache2 = networkCache;
                if (networkCache2 == null) {
                    com.airbnb.lottie.network.LottieNetworkCacheProvider lottieNetworkCacheProvider = cacheProvider;
                    if (lottieNetworkCacheProvider == null) {
                        lottieNetworkCacheProvider = new com.airbnb.lottie.network.LottieNetworkCacheProvider() { // from class: com.airbnb.lottie.L.1
                            @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
                            public java.io.File getCacheDir() {
                                return new java.io.File(context.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    networkCache2 = new com.airbnb.lottie.network.NetworkCache(lottieNetworkCacheProvider);
                    networkCache = networkCache2;
                }
            }
        }
        return networkCache2;
    }
}
