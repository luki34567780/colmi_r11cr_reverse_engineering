package com.airbnb.lottie.model;

/* loaded from: classes.dex */
public class FontCharacter {
    private final char character;
    private final java.lang.String fontFamily;
    private final java.util.List<com.airbnb.lottie.model.content.ShapeGroup> shapes;
    private final double size;
    private final java.lang.String style;
    private final double width;

    public static int hashFor(char c, java.lang.String str, java.lang.String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public FontCharacter(java.util.List<com.airbnb.lottie.model.content.ShapeGroup> list, char c, double d, double d2, java.lang.String str, java.lang.String str2) {
        this.shapes = list;
        this.character = c;
        this.size = d;
        this.width = d2;
        this.style = str;
        this.fontFamily = str2;
    }

    public java.util.List<com.airbnb.lottie.model.content.ShapeGroup> getShapes() {
        return this.shapes;
    }

    double getSize() {
        return this.size;
    }

    public double getWidth() {
        return this.width;
    }

    java.lang.String getStyle() {
        return this.style;
    }

    public int hashCode() {
        return hashFor(this.character, this.fontFamily, this.style);
    }
}
