package androidx.work;

/* loaded from: classes.dex */
public interface ProgressUpdater {
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> updateProgress(android.content.Context context, java.util.UUID id, androidx.work.Data data);
}
