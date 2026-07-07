package com.king.zxing;

/* loaded from: /tmp/dex/classes2.dex */
public class DecodeConfig {
    public static final float DEFAULT_AREA_RECT_RATIO = 0.8f;
    private android.graphics.Rect analyzeAreaRect;
    private int areaRectHorizontalOffset;
    private int areaRectVerticalOffset;
    private boolean isSupportLuminanceInvert;
    private boolean isSupportLuminanceInvertMultiDecode;
    private boolean isSupportVerticalCode;
    private boolean isSupportVerticalCodeMultiDecode;
    private java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> hints = com.king.zxing.DecodeFormatManager.DEFAULT_HINTS;
    private boolean isMultiDecode = true;
    private boolean isFullAreaScan = false;
    private float areaRectRatio = 0.8f;

    public java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> getHints() {
        return this.hints;
    }

    public com.king.zxing.DecodeConfig setHints(java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> map) {
        this.hints = map;
        return this;
    }

    public boolean isSupportLuminanceInvert() {
        return this.isSupportLuminanceInvert;
    }

    public com.king.zxing.DecodeConfig setSupportLuminanceInvert(boolean z) {
        this.isSupportLuminanceInvert = z;
        return this;
    }

    public boolean isSupportVerticalCode() {
        return this.isSupportVerticalCode;
    }

    public com.king.zxing.DecodeConfig setSupportVerticalCode(boolean z) {
        this.isSupportVerticalCode = z;
        return this;
    }

    public boolean isMultiDecode() {
        return this.isMultiDecode;
    }

    public com.king.zxing.DecodeConfig setMultiDecode(boolean z) {
        this.isMultiDecode = z;
        return this;
    }

    public boolean isSupportLuminanceInvertMultiDecode() {
        return this.isSupportLuminanceInvertMultiDecode;
    }

    public com.king.zxing.DecodeConfig setSupportLuminanceInvertMultiDecode(boolean z) {
        this.isSupportLuminanceInvertMultiDecode = z;
        return this;
    }

    public boolean isSupportVerticalCodeMultiDecode() {
        return this.isSupportVerticalCodeMultiDecode;
    }

    public com.king.zxing.DecodeConfig setSupportVerticalCodeMultiDecode(boolean z) {
        this.isSupportVerticalCodeMultiDecode = z;
        return this;
    }

    public android.graphics.Rect getAnalyzeAreaRect() {
        return this.analyzeAreaRect;
    }

    public com.king.zxing.DecodeConfig setAnalyzeAreaRect(android.graphics.Rect rect) {
        this.analyzeAreaRect = rect;
        return this;
    }

    public boolean isFullAreaScan() {
        return this.isFullAreaScan;
    }

    public com.king.zxing.DecodeConfig setFullAreaScan(boolean z) {
        this.isFullAreaScan = z;
        return this;
    }

    public float getAreaRectRatio() {
        return this.areaRectRatio;
    }

    public com.king.zxing.DecodeConfig setAreaRectRatio(float f) {
        this.areaRectRatio = f;
        return this;
    }

    public int getAreaRectVerticalOffset() {
        return this.areaRectVerticalOffset;
    }

    public com.king.zxing.DecodeConfig setAreaRectVerticalOffset(int i) {
        this.areaRectVerticalOffset = i;
        return this;
    }

    public int getAreaRectHorizontalOffset() {
        return this.areaRectHorizontalOffset;
    }

    public com.king.zxing.DecodeConfig setAreaRectHorizontalOffset(int i) {
        this.areaRectHorizontalOffset = i;
        return this;
    }

    public java.lang.String toString() {
        return "DecodeConfig{hints=" + this.hints + ", isMultiDecode=" + this.isMultiDecode + ", isSupportLuminanceInvert=" + this.isSupportLuminanceInvert + ", isSupportLuminanceInvertMultiDecode=" + this.isSupportLuminanceInvertMultiDecode + ", isSupportVerticalCode=" + this.isSupportVerticalCode + ", isSupportVerticalCodeMultiDecode=" + this.isSupportVerticalCodeMultiDecode + ", analyzeAreaRect=" + this.analyzeAreaRect + ", isFullAreaScan=" + this.isFullAreaScan + ", areaRectRatio=" + this.areaRectRatio + ", areaRectVerticalOffset=" + this.areaRectVerticalOffset + ", areaRectHorizontalOffset=" + this.areaRectHorizontalOffset + '}';
    }
}
