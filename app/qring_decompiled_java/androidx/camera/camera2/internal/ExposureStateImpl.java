package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
class ExposureStateImpl implements androidx.camera.core.ExposureState {
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristics;
    private int mExposureCompensation;
    private final java.lang.Object mLock = new java.lang.Object();

    ExposureStateImpl(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat characteristics, int exposureCompensation) {
        this.mCameraCharacteristics = characteristics;
        this.mExposureCompensation = exposureCompensation;
    }

    @Override // androidx.camera.core.ExposureState
    public int getExposureCompensationIndex() {
        int i;
        synchronized (this.mLock) {
            i = this.mExposureCompensation;
        }
        return i;
    }

    void setExposureCompensationIndex(int value) {
        synchronized (this.mLock) {
            this.mExposureCompensation = value;
        }
    }

    @Override // androidx.camera.core.ExposureState
    public android.util.Range<java.lang.Integer> getExposureCompensationRange() {
        return (android.util.Range) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    @Override // androidx.camera.core.ExposureState
    public android.util.Rational getExposureCompensationStep() {
        if (!isExposureCompensationSupported()) {
            return android.util.Rational.ZERO;
        }
        return (android.util.Rational) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }

    @Override // androidx.camera.core.ExposureState
    public boolean isExposureCompensationSupported() {
        android.util.Range range = (android.util.Range) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        return (range == null || ((java.lang.Integer) range.getLower()).intValue() == 0 || ((java.lang.Integer) range.getUpper()).intValue() == 0) ? false : true;
    }
}
