package androidx.camera.core;

/* loaded from: classes.dex */
public interface ExposureState {
    int getExposureCompensationIndex();

    android.util.Range<java.lang.Integer> getExposureCompensationRange();

    android.util.Rational getExposureCompensationStep();

    boolean isExposureCompensationSupported();
}
