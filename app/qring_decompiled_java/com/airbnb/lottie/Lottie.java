package com.airbnb.lottie;

/* loaded from: classes.dex */
public class Lottie {
    private Lottie() {
    }

    public static void initialize(com.airbnb.lottie.LottieConfig lottieConfig) {
        com.airbnb.lottie.L.setFetcher(lottieConfig.networkFetcher);
        com.airbnb.lottie.L.setCacheProvider(lottieConfig.cacheProvider);
        com.airbnb.lottie.L.setTraceEnabled(lottieConfig.enableSystraceMarkers);
    }
}
