package com.airbnb.lottie.utils;

/* loaded from: classes.dex */
public class LogcatLogger implements com.airbnb.lottie.LottieLogger {
    private static final java.util.Set<java.lang.String> loggedMessages = new java.util.HashSet();

    @Override // com.airbnb.lottie.LottieLogger
    public void debug(java.lang.String str) {
        debug(str, null);
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void debug(java.lang.String str, java.lang.Throwable th) {
        if (com.airbnb.lottie.L.DBG) {
            android.util.Log.d(com.airbnb.lottie.L.TAG, str, th);
        }
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void warning(java.lang.String str) {
        warning(str, null);
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void warning(java.lang.String str, java.lang.Throwable th) {
        java.util.Set<java.lang.String> set = loggedMessages;
        if (set.contains(str)) {
            return;
        }
        android.util.Log.w(com.airbnb.lottie.L.TAG, str, th);
        set.add(str);
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void error(java.lang.String str, java.lang.Throwable th) {
        if (com.airbnb.lottie.L.DBG) {
            android.util.Log.d(com.airbnb.lottie.L.TAG, str, th);
        }
    }
}
