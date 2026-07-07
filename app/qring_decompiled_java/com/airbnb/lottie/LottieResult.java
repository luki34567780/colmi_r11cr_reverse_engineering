package com.airbnb.lottie;

/* loaded from: classes.dex */
public final class LottieResult<V> {
    private final java.lang.Throwable exception;
    private final V value;

    public LottieResult(V v) {
        this.value = v;
        this.exception = null;
    }

    public LottieResult(java.lang.Throwable th) {
        this.exception = th;
        this.value = null;
    }

    public V getValue() {
        return this.value;
    }

    public java.lang.Throwable getException() {
        return this.exception;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.airbnb.lottie.LottieResult)) {
            return false;
        }
        com.airbnb.lottie.LottieResult lottieResult = (com.airbnb.lottie.LottieResult) obj;
        if (getValue() != null && getValue().equals(lottieResult.getValue())) {
            return true;
        }
        if (getException() == null || lottieResult.getException() == null) {
            return false;
        }
        return getException().toString().equals(getException().toString());
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{getValue(), getException()});
    }
}
