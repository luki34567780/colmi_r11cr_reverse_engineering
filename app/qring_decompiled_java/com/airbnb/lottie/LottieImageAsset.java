package com.airbnb.lottie;

/* loaded from: classes.dex */
public class LottieImageAsset {
    private android.graphics.Bitmap bitmap;
    private final java.lang.String dirName;
    private final java.lang.String fileName;
    private final int height;
    private final java.lang.String id;
    private final int width;

    public LottieImageAsset(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.width = i;
        this.height = i2;
        this.id = str;
        this.fileName = str2;
        this.dirName = str3;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public java.lang.String getFileName() {
        return this.fileName;
    }

    public java.lang.String getDirName() {
        return this.dirName;
    }

    public android.graphics.Bitmap getBitmap() {
        return this.bitmap;
    }

    public void setBitmap(android.graphics.Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public boolean hasBitmap() {
        return this.bitmap != null || (this.fileName.startsWith("data:") && this.fileName.indexOf("base64,") > 0);
    }
}
