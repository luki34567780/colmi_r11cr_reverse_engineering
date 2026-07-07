package com.airbnb.lottie.model;

/* loaded from: classes.dex */
public class KeyPath {
    public static final com.airbnb.lottie.model.KeyPath COMPOSITION = new com.airbnb.lottie.model.KeyPath("COMPOSITION");
    private final java.util.List<java.lang.String> keys;
    private com.airbnb.lottie.model.KeyPathElement resolvedElement;

    public KeyPath(java.lang.String... strArr) {
        this.keys = java.util.Arrays.asList(strArr);
    }

    private KeyPath(com.airbnb.lottie.model.KeyPath keyPath) {
        this.keys = new java.util.ArrayList(keyPath.keys);
        this.resolvedElement = keyPath.resolvedElement;
    }

    public com.airbnb.lottie.model.KeyPath addKey(java.lang.String str) {
        com.airbnb.lottie.model.KeyPath keyPath = new com.airbnb.lottie.model.KeyPath(this);
        keyPath.keys.add(str);
        return keyPath;
    }

    public com.airbnb.lottie.model.KeyPath resolve(com.airbnb.lottie.model.KeyPathElement keyPathElement) {
        com.airbnb.lottie.model.KeyPath keyPath = new com.airbnb.lottie.model.KeyPath(this);
        keyPath.resolvedElement = keyPathElement;
        return keyPath;
    }

    public com.airbnb.lottie.model.KeyPathElement getResolvedElement() {
        return this.resolvedElement;
    }

    public boolean matches(java.lang.String str, int i) {
        if (isContainer(str)) {
            return true;
        }
        if (i >= this.keys.size()) {
            return false;
        }
        return this.keys.get(i).equals(str) || this.keys.get(i).equals("**") || this.keys.get(i).equals("*");
    }

    public int incrementDepthBy(java.lang.String str, int i) {
        if (isContainer(str)) {
            return 0;
        }
        if (this.keys.get(i).equals("**")) {
            return (i != this.keys.size() - 1 && this.keys.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean fullyResolvesTo(java.lang.String str, int i) {
        if (i >= this.keys.size()) {
            return false;
        }
        boolean z = i == this.keys.size() - 1;
        java.lang.String str2 = this.keys.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.keys.size() + (-2) && endsWithGlobstar())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.keys.get(i + 1).equals(str)) {
            return i == this.keys.size() + (-2) || (i == this.keys.size() + (-3) && endsWithGlobstar());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.keys.size() - 1) {
            return false;
        }
        return this.keys.get(i2).equals(str);
    }

    public boolean propagateToChildren(java.lang.String str, int i) {
        return "__container".equals(str) || i < this.keys.size() - 1 || this.keys.get(i).equals("**");
    }

    private boolean isContainer(java.lang.String str) {
        return "__container".equals(str);
    }

    private boolean endsWithGlobstar() {
        return this.keys.get(r0.size() - 1).equals("**");
    }

    public java.lang.String keysToString() {
        return this.keys.toString();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.keys);
        sb.append(",resolved=");
        sb.append(this.resolvedElement != null);
        sb.append('}');
        return sb.toString();
    }
}
