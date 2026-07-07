package com.yalantis.ucrop.model;

/* loaded from: classes3.dex */
public class CropParameters {
    private android.graphics.Bitmap.CompressFormat mCompressFormat;
    private int mCompressQuality;
    private android.net.Uri mContentImageInputUri;
    private android.net.Uri mContentImageOutputUri;
    private com.yalantis.ucrop.model.ExifInfo mExifInfo;
    private java.lang.String mImageInputPath;
    private java.lang.String mImageOutputPath;
    private int mMaxResultImageSizeX;
    private int mMaxResultImageSizeY;

    public CropParameters(int i, int i2, android.graphics.Bitmap.CompressFormat compressFormat, int i3, java.lang.String str, java.lang.String str2, com.yalantis.ucrop.model.ExifInfo exifInfo) {
        this.mMaxResultImageSizeX = i;
        this.mMaxResultImageSizeY = i2;
        this.mCompressFormat = compressFormat;
        this.mCompressQuality = i3;
        this.mImageInputPath = str;
        this.mImageOutputPath = str2;
        this.mExifInfo = exifInfo;
    }

    public int getMaxResultImageSizeX() {
        return this.mMaxResultImageSizeX;
    }

    public int getMaxResultImageSizeY() {
        return this.mMaxResultImageSizeY;
    }

    public android.graphics.Bitmap.CompressFormat getCompressFormat() {
        return this.mCompressFormat;
    }

    public int getCompressQuality() {
        return this.mCompressQuality;
    }

    public java.lang.String getImageInputPath() {
        return this.mImageInputPath;
    }

    public java.lang.String getImageOutputPath() {
        return this.mImageOutputPath;
    }

    public com.yalantis.ucrop.model.ExifInfo getExifInfo() {
        return this.mExifInfo;
    }

    public android.net.Uri getContentImageInputUri() {
        return this.mContentImageInputUri;
    }

    public void setContentImageInputUri(android.net.Uri uri) {
        this.mContentImageInputUri = uri;
    }

    public android.net.Uri getContentImageOutputUri() {
        return this.mContentImageOutputUri;
    }

    public void setContentImageOutputUri(android.net.Uri uri) {
        this.mContentImageOutputUri = uri;
    }
}
