package com.amap.api.maps.model;

/* loaded from: classes.dex */
public class Gradient {
    private static final int DEFAULT_COLOR_MAP_SIZE = 1000;
    private boolean isAvailable;
    private int mColorMapSize;
    private int[] mColors;
    private float[] mStartPoints;

    private static class a {
        private final int a;
        private final int b;
        private final float c;

        /* synthetic */ a(int i, int i2, float f, byte b) {
            this(i, i2, f);
        }

        private a(int i, int i2, float f) {
            this.a = i;
            this.b = i2;
            this.c = f;
        }
    }

    public Gradient(int[] iArr, float[] fArr) {
        this(iArr, fArr, (byte) 0);
    }

    private Gradient(int[] iArr, float[] fArr, byte b) {
        this.isAvailable = true;
        try {
            if (iArr == null || fArr == null) {
                throw new com.amap.api.maps.AMapException("colors and startPoints should not be null");
            }
            if (iArr.length != fArr.length) {
                throw new com.amap.api.maps.AMapException("colors and startPoints should be same length");
            }
            if (iArr.length == 0) {
                throw new com.amap.api.maps.AMapException("No colors have been defined");
            }
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] < fArr[i - 1]) {
                    throw new com.amap.api.maps.AMapException("startPoints should be in increasing order");
                }
            }
            this.mColorMapSize = 1000;
            int[] iArr2 = new int[iArr.length];
            this.mColors = iArr2;
            this.mStartPoints = new float[fArr.length];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            java.lang.System.arraycopy(fArr, 0, this.mStartPoints, 0, fArr.length);
            this.isAvailable = true;
        } catch (com.amap.api.maps.AMapException e) {
            this.isAvailable = false;
            android.util.Log.e("amap", e.getErrorMessage());
            e.printStackTrace();
        }
    }

    public int[] getColors() {
        return this.mColors;
    }

    public float[] getStartPoints() {
        return this.mStartPoints;
    }

    private java.util.HashMap<java.lang.Integer, com.amap.api.maps.model.Gradient.a> a() {
        java.util.HashMap<java.lang.Integer, com.amap.api.maps.model.Gradient.a> hashMap = new java.util.HashMap<>(32);
        byte b = 0;
        if (this.mStartPoints[0] != 0.0f) {
            hashMap.put(0, new com.amap.api.maps.model.Gradient.a(android.graphics.Color.argb(0, android.graphics.Color.red(this.mColors[0]), android.graphics.Color.green(this.mColors[0]), android.graphics.Color.blue(this.mColors[0])), this.mColors[0], this.mColorMapSize * this.mStartPoints[0], b));
        }
        for (int i = 1; i < this.mColors.length; i++) {
            int i2 = i - 1;
            java.lang.Integer valueOf = java.lang.Integer.valueOf((int) (this.mColorMapSize * this.mStartPoints[i2]));
            int[] iArr = this.mColors;
            int i3 = iArr[i2];
            int i4 = iArr[i];
            float f = this.mColorMapSize;
            float[] fArr = this.mStartPoints;
            hashMap.put(valueOf, new com.amap.api.maps.model.Gradient.a(i3, i4, f * (fArr[i] - fArr[i2]), b));
        }
        float[] fArr2 = this.mStartPoints;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf((int) (this.mColorMapSize * fArr2[length]));
            int[] iArr2 = this.mColors;
            hashMap.put(valueOf2, new com.amap.api.maps.model.Gradient.a(iArr2[length], iArr2[length], this.mColorMapSize * (1.0f - this.mStartPoints[length]), b));
        }
        return hashMap;
    }

    protected int[] generateColorMap(double d) {
        java.util.HashMap<java.lang.Integer, com.amap.api.maps.model.Gradient.a> a2 = a();
        int[] iArr = new int[this.mColorMapSize];
        com.amap.api.maps.model.Gradient.a aVar = a2.get(0);
        int i = 0;
        for (int i2 = 0; i2 < this.mColorMapSize; i2++) {
            if (a2.containsKey(java.lang.Integer.valueOf(i2))) {
                aVar = a2.get(java.lang.Integer.valueOf(i2));
                i = i2;
            }
            iArr[i2] = a(aVar.a, aVar.b, (i2 - i) / aVar.c);
        }
        if (d != 1.0d) {
            for (int i3 = 0; i3 < this.mColorMapSize; i3++) {
                int i4 = iArr[i3];
                iArr[i3] = android.graphics.Color.argb((int) (android.graphics.Color.alpha(i4) * d), android.graphics.Color.red(i4), android.graphics.Color.green(i4), android.graphics.Color.blue(i4));
            }
        }
        return iArr;
    }

    private static int a(int i, int i2, float f) {
        int alpha = (int) (((android.graphics.Color.alpha(i2) - android.graphics.Color.alpha(i)) * f) + android.graphics.Color.alpha(i));
        float[] fArr = new float[3];
        android.graphics.Color.RGBToHSV(android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i), fArr);
        float[] fArr2 = new float[3];
        android.graphics.Color.RGBToHSV(android.graphics.Color.red(i2), android.graphics.Color.green(i2), android.graphics.Color.blue(i2), fArr2);
        if (fArr[0] - fArr2[0] > 180.0f) {
            fArr2[0] = fArr2[0] + 360.0f;
        } else if (fArr2[0] - fArr[0] > 180.0f) {
            fArr[0] = fArr[0] + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i3 = 0; i3 < 3; i3++) {
            fArr3[i3] = ((fArr2[i3] - fArr[i3]) * f) + fArr[i3];
        }
        return android.graphics.Color.HSVToColor(alpha, fArr3);
    }

    protected boolean isAvailable() {
        return this.isAvailable;
    }
}
