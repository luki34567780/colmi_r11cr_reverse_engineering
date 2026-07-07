package androidx.work.impl.model;

/* loaded from: classes.dex */
public class WorkProgress {
    public final androidx.work.Data mProgress;
    public final java.lang.String mWorkSpecId;

    public WorkProgress(java.lang.String workSpecId, androidx.work.Data progress) {
        this.mWorkSpecId = workSpecId;
        this.mProgress = progress;
    }
}
