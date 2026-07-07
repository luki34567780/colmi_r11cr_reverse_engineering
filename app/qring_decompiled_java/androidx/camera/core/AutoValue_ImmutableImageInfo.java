package androidx.camera.core;

/* loaded from: classes.dex */
final class AutoValue_ImmutableImageInfo extends androidx.camera.core.ImmutableImageInfo {
    private final int rotationDegrees;
    private final androidx.camera.core.impl.TagBundle tagBundle;
    private final long timestamp;

    AutoValue_ImmutableImageInfo(androidx.camera.core.impl.TagBundle tagBundle, long timestamp, int rotationDegrees) {
        java.util.Objects.requireNonNull(tagBundle, "Null tagBundle");
        this.tagBundle = tagBundle;
        this.timestamp = timestamp;
        this.rotationDegrees = rotationDegrees;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public androidx.camera.core.impl.TagBundle getTagBundle() {
        return this.tagBundle;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public java.lang.String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.tagBundle + ", timestamp=" + this.timestamp + ", rotationDegrees=" + this.rotationDegrees + "}";
    }

    public boolean equals(java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof androidx.camera.core.ImmutableImageInfo)) {
            return false;
        }
        androidx.camera.core.ImmutableImageInfo immutableImageInfo = (androidx.camera.core.ImmutableImageInfo) o;
        return this.tagBundle.equals(immutableImageInfo.getTagBundle()) && this.timestamp == immutableImageInfo.getTimestamp() && this.rotationDegrees == immutableImageInfo.getRotationDegrees();
    }

    public int hashCode() {
        int hashCode = (this.tagBundle.hashCode() ^ 1000003) * 1000003;
        long j = this.timestamp;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.rotationDegrees;
    }
}
