package androidx.work.impl.foreground;

/* loaded from: classes.dex */
public interface ForegroundProcessor {
    void startForeground(java.lang.String workSpecId, androidx.work.ForegroundInfo foregroundInfo);

    void stopForeground(java.lang.String workSpecId);
}
