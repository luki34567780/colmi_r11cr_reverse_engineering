package com.airbnb.lottie.model;

/* loaded from: classes.dex */
public class Font {
    private final float ascent;
    private final java.lang.String family;
    private final java.lang.String name;
    private final java.lang.String style;

    public Font(java.lang.String str, java.lang.String str2, java.lang.String str3, float f) {
        this.family = str;
        this.name = str2;
        this.style = str3;
        this.ascent = f;
    }

    public java.lang.String getFamily() {
        return this.family;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getStyle() {
        return this.style;
    }

    float getAscent() {
        return this.ascent;
    }
}
