package com.airbnb.lottie.model;

/* loaded from: classes.dex */
public class CubicCurveData {
    private final android.graphics.PointF controlPoint1;
    private final android.graphics.PointF controlPoint2;
    private final android.graphics.PointF vertex;

    public CubicCurveData() {
        this.controlPoint1 = new android.graphics.PointF();
        this.controlPoint2 = new android.graphics.PointF();
        this.vertex = new android.graphics.PointF();
    }

    public CubicCurveData(android.graphics.PointF pointF, android.graphics.PointF pointF2, android.graphics.PointF pointF3) {
        this.controlPoint1 = pointF;
        this.controlPoint2 = pointF2;
        this.vertex = pointF3;
    }

    public void setControlPoint1(float f, float f2) {
        this.controlPoint1.set(f, f2);
    }

    public android.graphics.PointF getControlPoint1() {
        return this.controlPoint1;
    }

    public void setControlPoint2(float f, float f2) {
        this.controlPoint2.set(f, f2);
    }

    public android.graphics.PointF getControlPoint2() {
        return this.controlPoint2;
    }

    public void setVertex(float f, float f2) {
        this.vertex.set(f, f2);
    }

    public android.graphics.PointF getVertex() {
        return this.vertex;
    }
}
