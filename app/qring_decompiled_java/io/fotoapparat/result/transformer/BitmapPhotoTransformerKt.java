package io.fotoapparat.result.transformer;

/* compiled from: BitmapPhotoTransformer.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0002\u001a\f\u0010\t\u001a\u00020\u0003*\u00020\u0007H\u0002¨\u0006\n"}, d2 = {"computeScaleFactor", "", "originalResolution", "Lio/fotoapparat/parameter/Resolution;", "desiredResolution", "decodeBitmap", "Landroid/graphics/Bitmap;", "Lio/fotoapparat/result/Photo;", "scaleFactor", "readResolution", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class BitmapPhotoTransformerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Bitmap decodeBitmap(io.fotoapparat.result.Photo photo, float f) {
        new android.graphics.BitmapFactory.Options().inSampleSize = (int) f;
        return android.graphics.BitmapFactory.decodeByteArray(photo.encodedImage, 0, photo.encodedImage.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.fotoapparat.parameter.Resolution readResolution(io.fotoapparat.result.Photo photo) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeByteArray(photo.encodedImage, 0, photo.encodedImage.length, options);
        return new io.fotoapparat.parameter.Resolution(options.outWidth, options.outHeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float computeScaleFactor(io.fotoapparat.parameter.Resolution resolution, io.fotoapparat.parameter.Resolution resolution2) {
        return java.lang.Math.min(resolution.width / resolution2.width, resolution.height / resolution2.height);
    }
}
