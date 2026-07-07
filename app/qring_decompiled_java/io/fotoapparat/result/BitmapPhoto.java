package io.fotoapparat.result;

/* compiled from: BitmapPhoto.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/fotoapparat/result/BitmapPhoto;", "", "bitmap", "Landroid/graphics/Bitmap;", "rotationDegrees", "", "(Landroid/graphics/Bitmap;I)V", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final /* data */ class BitmapPhoto {
    public final android.graphics.Bitmap bitmap;
    public final int rotationDegrees;

    public static /* synthetic */ io.fotoapparat.result.BitmapPhoto copy$default(io.fotoapparat.result.BitmapPhoto bitmapPhoto, android.graphics.Bitmap bitmap, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            bitmap = bitmapPhoto.bitmap;
        }
        if ((i2 & 2) != 0) {
            i = bitmapPhoto.rotationDegrees;
        }
        return bitmapPhoto.copy(bitmap, i);
    }

    /* renamed from: component1, reason: from getter */
    public final android.graphics.Bitmap getBitmap() {
        return this.bitmap;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public final io.fotoapparat.result.BitmapPhoto copy(android.graphics.Bitmap bitmap, int rotationDegrees) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        return new io.fotoapparat.result.BitmapPhoto(bitmap, rotationDegrees);
    }

    public boolean equals(java.lang.Object other) {
        if (this != other) {
            if (other instanceof io.fotoapparat.result.BitmapPhoto) {
                io.fotoapparat.result.BitmapPhoto bitmapPhoto = (io.fotoapparat.result.BitmapPhoto) other;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.bitmap, bitmapPhoto.bitmap)) {
                    if (this.rotationDegrees == bitmapPhoto.rotationDegrees) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        android.graphics.Bitmap bitmap = this.bitmap;
        return ((bitmap != null ? bitmap.hashCode() : 0) * 31) + this.rotationDegrees;
    }

    public java.lang.String toString() {
        return "BitmapPhoto(bitmap=" + this.bitmap + ", rotationDegrees=" + this.rotationDegrees + ")";
    }

    public BitmapPhoto(android.graphics.Bitmap bitmap, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        this.bitmap = bitmap;
        this.rotationDegrees = i;
    }
}
