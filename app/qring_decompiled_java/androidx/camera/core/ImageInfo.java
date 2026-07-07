package androidx.camera.core;

/* loaded from: classes.dex */
public interface ImageInfo {
    int getRotationDegrees();

    androidx.camera.core.impl.TagBundle getTagBundle();

    long getTimestamp();

    void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder exifBuilder);
}
