package com.airbnb.lottie.model.content;

/* loaded from: classes.dex */
public class ShapeGroup implements com.airbnb.lottie.model.content.ContentModel {
    private final boolean hidden;
    private final java.util.List<com.airbnb.lottie.model.content.ContentModel> items;
    private final java.lang.String name;

    public ShapeGroup(java.lang.String str, java.util.List<com.airbnb.lottie.model.content.ContentModel> list, boolean z) {
        this.name = str;
        this.items = list;
        this.hidden = z;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.util.List<com.airbnb.lottie.model.content.ContentModel> getItems() {
        return this.items;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public com.airbnb.lottie.animation.content.Content toContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        return new com.airbnb.lottie.animation.content.ContentGroup(lottieDrawable, baseLayer, this);
    }

    public java.lang.String toString() {
        return "ShapeGroup{name='" + this.name + "' Shapes: " + java.util.Arrays.toString(this.items.toArray()) + '}';
    }
}
