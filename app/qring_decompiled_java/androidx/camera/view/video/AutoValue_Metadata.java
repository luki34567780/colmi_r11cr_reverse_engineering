package androidx.camera.view.video;

/* loaded from: classes.dex */
final class AutoValue_Metadata extends androidx.camera.view.video.Metadata {
    private final android.location.Location location;

    private AutoValue_Metadata(android.location.Location location) {
        this.location = location;
    }

    @Override // androidx.camera.view.video.Metadata
    public android.location.Location getLocation() {
        return this.location;
    }

    public java.lang.String toString() {
        return "Metadata{location=" + this.location + "}";
    }

    public boolean equals(java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof androidx.camera.view.video.Metadata)) {
            return false;
        }
        android.location.Location location = this.location;
        android.location.Location location2 = ((androidx.camera.view.video.Metadata) o).getLocation();
        return location == null ? location2 == null : location.equals(location2);
    }

    public int hashCode() {
        android.location.Location location = this.location;
        return (location == null ? 0 : location.hashCode()) ^ 1000003;
    }

    static final class Builder extends androidx.camera.view.video.Metadata.Builder {
        private android.location.Location location;

        Builder() {
        }

        @Override // androidx.camera.view.video.Metadata.Builder
        public androidx.camera.view.video.Metadata.Builder setLocation(android.location.Location location) {
            this.location = location;
            return this;
        }

        @Override // androidx.camera.view.video.Metadata.Builder
        public androidx.camera.view.video.Metadata build() {
            return new androidx.camera.view.video.AutoValue_Metadata(this.location);
        }
    }
}
