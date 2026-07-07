package androidx.camera.view.video;

/* loaded from: classes.dex */
final class AutoValue_OutputFileResults extends androidx.camera.view.video.OutputFileResults {
    private final android.net.Uri savedUri;

    AutoValue_OutputFileResults(android.net.Uri savedUri) {
        this.savedUri = savedUri;
    }

    @Override // androidx.camera.view.video.OutputFileResults
    public android.net.Uri getSavedUri() {
        return this.savedUri;
    }

    public java.lang.String toString() {
        return "OutputFileResults{savedUri=" + this.savedUri + "}";
    }

    public boolean equals(java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof androidx.camera.view.video.OutputFileResults)) {
            return false;
        }
        android.net.Uri uri = this.savedUri;
        android.net.Uri savedUri = ((androidx.camera.view.video.OutputFileResults) o).getSavedUri();
        return uri == null ? savedUri == null : uri.equals(savedUri);
    }

    public int hashCode() {
        android.net.Uri uri = this.savedUri;
        return (uri == null ? 0 : uri.hashCode()) ^ 1000003;
    }
}
