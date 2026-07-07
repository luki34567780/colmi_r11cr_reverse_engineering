package com.amap.api.services.route;

/* loaded from: classes.dex */
public class Cost {
    private float a;
    private float b;
    private java.lang.String c;
    private float d;
    private int e;

    public float getDuration() {
        return this.a;
    }

    public void setDuration(float f) {
        this.a = f;
    }

    public float getTollDistance() {
        return this.b;
    }

    public void setTollDistance(float f) {
        this.b = f;
    }

    public java.lang.String getTollRoad() {
        return this.c;
    }

    public void setTollRoad(java.lang.String str) {
        this.c = str;
    }

    public float getTolls() {
        return this.d;
    }

    public void setTolls(float f) {
        this.d = f;
    }

    public int getTrafficLights() {
        return this.e;
    }

    public void setTrafficLights(int i) {
        this.e = i;
    }
}
