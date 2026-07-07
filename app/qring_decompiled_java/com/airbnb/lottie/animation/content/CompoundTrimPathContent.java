package com.airbnb.lottie.animation.content;

/* loaded from: classes.dex */
public class CompoundTrimPathContent {
    private java.util.List<com.airbnb.lottie.animation.content.TrimPathContent> contents = new java.util.ArrayList();

    void addTrimPath(com.airbnb.lottie.animation.content.TrimPathContent trimPathContent) {
        this.contents.add(trimPathContent);
    }

    public void apply(android.graphics.Path path) {
        for (int size = this.contents.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.utils.Utils.applyTrimPathIfNeeded(path, this.contents.get(size));
        }
    }
}
