package androidx.camera.core;

/* loaded from: classes.dex */
abstract class ImmutableImageInfo implements androidx.camera.core.ImageInfo {
    @Override // androidx.camera.core.ImageInfo
    public abstract int getRotationDegrees();

    @Override // androidx.camera.core.ImageInfo
    public abstract androidx.camera.core.impl.TagBundle getTagBundle();

    @Override // androidx.camera.core.ImageInfo
    public abstract long getTimestamp();

    ImmutableImageInfo() {
    }

    public static androidx.camera.core.ImageInfo create(androidx.camera.core.impl.TagBundle tag, long timestamp, int rotationDegrees) {
        return new androidx.camera.core.AutoValue_ImmutableImageInfo(tag, timestamp, rotationDegrees);
    }

    @Override // androidx.camera.core.ImageInfo
    public void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder exifBuilder) {
        exifBuilder.setOrientationDegrees(getRotationDegrees());
    }
}
