package androidx.camera.core.impl;

/* loaded from: classes.dex */
public abstract class SurfaceSizeDefinition {
    public abstract android.util.Size getAnalysisSize();

    public abstract android.util.Size getPreviewSize();

    public abstract android.util.Size getRecordSize();

    SurfaceSizeDefinition() {
    }

    public static androidx.camera.core.impl.SurfaceSizeDefinition create(android.util.Size analysisSize, android.util.Size previewSize, android.util.Size recordSize) {
        return new androidx.camera.core.impl.AutoValue_SurfaceSizeDefinition(analysisSize, previewSize, recordSize);
    }
}
