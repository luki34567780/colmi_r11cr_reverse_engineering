package androidx.camera.view.video;

/* loaded from: classes.dex */
public abstract class Metadata {
    public abstract android.location.Location getLocation();

    public static androidx.camera.view.video.Metadata.Builder builder() {
        return new androidx.camera.view.video.AutoValue_Metadata.Builder();
    }

    Metadata() {
    }

    public static abstract class Builder {
        public abstract androidx.camera.view.video.Metadata build();

        public abstract androidx.camera.view.video.Metadata.Builder setLocation(android.location.Location location);

        Builder() {
        }
    }
}
