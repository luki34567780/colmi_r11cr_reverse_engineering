package androidx.camera.core;

/* loaded from: classes.dex */
public final class FocusMeteringAction {
    static final long DEFAULT_AUTOCANCEL_DURATION = 5000;
    static final int DEFAULT_METERING_MODE = 7;
    public static final int FLAG_AE = 2;
    public static final int FLAG_AF = 1;
    public static final int FLAG_AWB = 4;
    private final long mAutoCancelDurationInMillis;
    private final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAe;
    private final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAf;
    private final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAwb;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MeteringMode {
    }

    FocusMeteringAction(androidx.camera.core.FocusMeteringAction.Builder builder) {
        this.mMeteringPointsAf = java.util.Collections.unmodifiableList(builder.mMeteringPointsAf);
        this.mMeteringPointsAe = java.util.Collections.unmodifiableList(builder.mMeteringPointsAe);
        this.mMeteringPointsAwb = java.util.Collections.unmodifiableList(builder.mMeteringPointsAwb);
        this.mAutoCancelDurationInMillis = builder.mAutoCancelDurationInMillis;
    }

    public long getAutoCancelDurationInMillis() {
        return this.mAutoCancelDurationInMillis;
    }

    public java.util.List<androidx.camera.core.MeteringPoint> getMeteringPointsAf() {
        return this.mMeteringPointsAf;
    }

    public java.util.List<androidx.camera.core.MeteringPoint> getMeteringPointsAe() {
        return this.mMeteringPointsAe;
    }

    public java.util.List<androidx.camera.core.MeteringPoint> getMeteringPointsAwb() {
        return this.mMeteringPointsAwb;
    }

    public boolean isAutoCancelEnabled() {
        return this.mAutoCancelDurationInMillis > 0;
    }

    public static class Builder {
        long mAutoCancelDurationInMillis;
        final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAe;
        final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAf;
        final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAwb;

        public Builder(androidx.camera.core.MeteringPoint point) {
            this(point, 7);
        }

        public Builder(androidx.camera.core.MeteringPoint point, int meteringMode) {
            this.mMeteringPointsAf = new java.util.ArrayList();
            this.mMeteringPointsAe = new java.util.ArrayList();
            this.mMeteringPointsAwb = new java.util.ArrayList();
            this.mAutoCancelDurationInMillis = 5000L;
            addPoint(point, meteringMode);
        }

        public androidx.camera.core.FocusMeteringAction.Builder addPoint(androidx.camera.core.MeteringPoint point) {
            return addPoint(point, 7);
        }

        public androidx.camera.core.FocusMeteringAction.Builder addPoint(androidx.camera.core.MeteringPoint point, int meteringMode) {
            boolean z = false;
            androidx.core.util.Preconditions.checkArgument(point != null, "Point cannot be null.");
            if (meteringMode >= 1 && meteringMode <= 7) {
                z = true;
            }
            androidx.core.util.Preconditions.checkArgument(z, "Invalid metering mode " + meteringMode);
            if ((meteringMode & 1) != 0) {
                this.mMeteringPointsAf.add(point);
            }
            if ((meteringMode & 2) != 0) {
                this.mMeteringPointsAe.add(point);
            }
            if ((meteringMode & 4) != 0) {
                this.mMeteringPointsAwb.add(point);
            }
            return this;
        }

        public androidx.camera.core.FocusMeteringAction.Builder setAutoCancelDuration(long duration, java.util.concurrent.TimeUnit timeUnit) {
            androidx.core.util.Preconditions.checkArgument(duration >= 1, "autoCancelDuration must be at least 1");
            this.mAutoCancelDurationInMillis = timeUnit.toMillis(duration);
            return this;
        }

        public androidx.camera.core.FocusMeteringAction.Builder disableAutoCancel() {
            this.mAutoCancelDurationInMillis = 0L;
            return this;
        }

        public androidx.camera.core.FocusMeteringAction build() {
            return new androidx.camera.core.FocusMeteringAction(this);
        }
    }
}
