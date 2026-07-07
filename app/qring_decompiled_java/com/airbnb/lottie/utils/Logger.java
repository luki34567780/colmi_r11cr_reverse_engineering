package com.airbnb.lottie.utils;

/* loaded from: classes.dex */
public class Logger {
    private static com.airbnb.lottie.LottieLogger INSTANCE = new com.airbnb.lottie.utils.LogcatLogger();

    public static void setInstance(com.airbnb.lottie.LottieLogger lottieLogger) {
        INSTANCE = lottieLogger;
    }

    public static void debug(java.lang.String str) {
        INSTANCE.debug(str);
    }

    public static void debug(java.lang.String str, java.lang.Throwable th) {
        INSTANCE.debug(str, th);
    }

    public static void warning(java.lang.String str) {
        INSTANCE.warning(str);
    }

    public static void warning(java.lang.String str, java.lang.Throwable th) {
        INSTANCE.warning(str, th);
    }

    public static void error(java.lang.String str, java.lang.Throwable th) {
        INSTANCE.error(str, th);
    }
}
