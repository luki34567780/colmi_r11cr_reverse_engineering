package androidx.work;

/* loaded from: classes.dex */
public interface ForegroundUpdater {
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setForegroundAsync(android.content.Context context, java.util.UUID id, androidx.work.ForegroundInfo foregroundInfo);
}
