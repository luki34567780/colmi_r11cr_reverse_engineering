package androidx.camera.view.video;

/* loaded from: classes.dex */
public abstract class OutputFileResults {
    public abstract android.net.Uri getSavedUri();

    OutputFileResults() {
    }

    public static androidx.camera.view.video.OutputFileResults create(android.net.Uri savedUri) {
        return new androidx.camera.view.video.AutoValue_OutputFileResults(savedUri);
    }
}
