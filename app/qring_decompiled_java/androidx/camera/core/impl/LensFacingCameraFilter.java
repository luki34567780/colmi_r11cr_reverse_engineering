package androidx.camera.core.impl;

/* loaded from: classes.dex */
public class LensFacingCameraFilter implements androidx.camera.core.CameraFilter {
    private int mLensFacing;

    public LensFacingCameraFilter(int lensFacing) {
        this.mLensFacing = lensFacing;
    }

    @Override // androidx.camera.core.CameraFilter
    public java.util.List<androidx.camera.core.CameraInfo> filter(java.util.List<androidx.camera.core.CameraInfo> cameraInfos) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.core.CameraInfo cameraInfo : cameraInfos) {
            androidx.core.util.Preconditions.checkArgument(cameraInfo instanceof androidx.camera.core.impl.CameraInfoInternal, "The camera info doesn't contain internal implementation.");
            java.lang.Integer lensFacing = ((androidx.camera.core.impl.CameraInfoInternal) cameraInfo).getLensFacing();
            if (lensFacing != null && lensFacing.intValue() == this.mLensFacing) {
                arrayList.add(cameraInfo);
            }
        }
        return arrayList;
    }

    public int getLensFacing() {
        return this.mLensFacing;
    }
}
