package androidx.camera.core;

/* loaded from: classes.dex */
public final class ViewPort {
    public static final int FILL_CENTER = 1;
    public static final int FILL_END = 2;
    public static final int FILL_START = 0;
    public static final int FIT = 3;
    private android.util.Rational mAspectRatio;
    private int mLayoutDirection;
    private int mRotation;
    private int mScaleType;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LayoutDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ScaleType {
    }

    ViewPort(int scaleType, android.util.Rational aspectRatio, int rotation, int layoutDirection) {
        this.mScaleType = scaleType;
        this.mAspectRatio = aspectRatio;
        this.mRotation = rotation;
        this.mLayoutDirection = layoutDirection;
    }

    public android.util.Rational getAspectRatio() {
        return this.mAspectRatio;
    }

    public int getRotation() {
        return this.mRotation;
    }

    public int getScaleType() {
        return this.mScaleType;
    }

    public int getLayoutDirection() {
        return this.mLayoutDirection;
    }

    public static final class Builder {
        private static final int DEFAULT_LAYOUT_DIRECTION = 0;
        private static final int DEFAULT_SCALE_TYPE = 1;
        private final android.util.Rational mAspectRatio;
        private final int mRotation;
        private int mScaleType = 1;
        private int mLayoutDirection = 0;

        public Builder(android.util.Rational aspectRatio, int rotation) {
            this.mAspectRatio = aspectRatio;
            this.mRotation = rotation;
        }

        public androidx.camera.core.ViewPort.Builder setScaleType(int scaleType) {
            this.mScaleType = scaleType;
            return this;
        }

        public androidx.camera.core.ViewPort.Builder setLayoutDirection(int layoutDirection) {
            this.mLayoutDirection = layoutDirection;
            return this;
        }

        public androidx.camera.core.ViewPort build() {
            androidx.core.util.Preconditions.checkNotNull(this.mAspectRatio, "The crop aspect ratio must be set.");
            return new androidx.camera.core.ViewPort(this.mScaleType, this.mAspectRatio, this.mRotation, this.mLayoutDirection);
        }
    }
}
