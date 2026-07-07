package androidx.camera.core.impl;

/* loaded from: classes.dex */
final class AutoValue_SurfaceSizeDefinition extends androidx.camera.core.impl.SurfaceSizeDefinition {
    private final android.util.Size analysisSize;
    private final android.util.Size previewSize;
    private final android.util.Size recordSize;

    AutoValue_SurfaceSizeDefinition(android.util.Size analysisSize, android.util.Size previewSize, android.util.Size recordSize) {
        java.util.Objects.requireNonNull(analysisSize, "Null analysisSize");
        this.analysisSize = analysisSize;
        java.util.Objects.requireNonNull(previewSize, "Null previewSize");
        this.previewSize = previewSize;
        java.util.Objects.requireNonNull(recordSize, "Null recordSize");
        this.recordSize = recordSize;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public android.util.Size getAnalysisSize() {
        return this.analysisSize;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public android.util.Size getPreviewSize() {
        return this.previewSize;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public android.util.Size getRecordSize() {
        return this.recordSize;
    }

    public java.lang.String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.analysisSize + ", previewSize=" + this.previewSize + ", recordSize=" + this.recordSize + "}";
    }

    public boolean equals(java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof androidx.camera.core.impl.SurfaceSizeDefinition)) {
            return false;
        }
        androidx.camera.core.impl.SurfaceSizeDefinition surfaceSizeDefinition = (androidx.camera.core.impl.SurfaceSizeDefinition) o;
        return this.analysisSize.equals(surfaceSizeDefinition.getAnalysisSize()) && this.previewSize.equals(surfaceSizeDefinition.getPreviewSize()) && this.recordSize.equals(surfaceSizeDefinition.getRecordSize());
    }

    public int hashCode() {
        return ((((this.analysisSize.hashCode() ^ 1000003) * 1000003) ^ this.previewSize.hashCode()) * 1000003) ^ this.recordSize.hashCode();
    }
}
