package io.fotoapparat.exif;

/* compiled from: ExifWriter.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lio/fotoapparat/exif/ExifWriter;", "Lio/fotoapparat/exif/ExifOrientationWriter;", "()V", "toExifOrientation", "", "rotationDegrees", "writeExifOrientation", "", "file", "Ljava/io/File;", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class ExifWriter implements io.fotoapparat.exif.ExifOrientationWriter {
    public static final io.fotoapparat.exif.ExifWriter INSTANCE = new io.fotoapparat.exif.ExifWriter();

    private ExifWriter() {
    }

    @Override // io.fotoapparat.exif.ExifOrientationWriter
    public void writeExifOrientation(java.io.File file, int rotationDegrees) throws io.fotoapparat.exception.FileSaveException {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(file, "file");
        try {
            androidx.exifinterface.media.ExifInterface exifInterface = new androidx.exifinterface.media.ExifInterface(file.getPath());
            exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(INSTANCE.toExifOrientation(rotationDegrees)));
            exifInterface.saveAttributes();
        } catch (java.io.IOException e) {
            throw new io.fotoapparat.exception.FileSaveException(e);
        }
    }

    private final int toExifOrientation(int rotationDegrees) {
        int i = (360 - rotationDegrees) % com.amap.api.maps.utils.SpatialRelationUtil.A_CIRCLE_DEGREE;
        if (i == 90) {
            return 6;
        }
        if (i != 180) {
            return i != 270 ? 1 : 8;
        }
        return 3;
    }
}
