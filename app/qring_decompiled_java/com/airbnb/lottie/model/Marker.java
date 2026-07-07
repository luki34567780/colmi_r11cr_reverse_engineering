package com.airbnb.lottie.model;

/* loaded from: classes.dex */
public class Marker {
    private static java.lang.String CARRIAGE_RETURN = "\r";
    public final float durationFrames;
    private final java.lang.String name;
    public final float startFrame;

    public Marker(java.lang.String str, float f, float f2) {
        this.name = str;
        this.durationFrames = f2;
        this.startFrame = f;
    }

    public boolean matchesName(java.lang.String str) {
        if (this.name.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.name.endsWith(CARRIAGE_RETURN)) {
            java.lang.String str2 = this.name;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
