package com.liulishuo.okdownload.kotlin;

/* compiled from: DownloadProgress.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0006\u0010\u001a\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/liulishuo/okdownload/kotlin/DownloadProgress;", "", "task", "Lcom/liulishuo/okdownload/DownloadTask;", "currentOffset", "", "totalOffset", "(Lcom/liulishuo/okdownload/DownloadTask;JJ)V", "getCurrentOffset", "()J", "getTask", "()Lcom/liulishuo/okdownload/DownloadTask;", "getTotalOffset", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "progress", "", "toString", "", "totalUnknown", "Companion", "kotlin_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class DownloadProgress {
    public static final float UNKNOWN_PROGRESS = 0.0f;
    private static final long UNKNOWN_TOTAL_OFFSET = -1;
    private final long currentOffset;
    private final com.liulishuo.okdownload.DownloadTask task;
    private final long totalOffset;

    public static /* synthetic */ com.liulishuo.okdownload.kotlin.DownloadProgress copy$default(com.liulishuo.okdownload.kotlin.DownloadProgress downloadProgress, com.liulishuo.okdownload.DownloadTask downloadTask, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            downloadTask = downloadProgress.task;
        }
        if ((i & 2) != 0) {
            j = downloadProgress.currentOffset;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = downloadProgress.totalOffset;
        }
        return downloadProgress.copy(downloadTask, j3, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final com.liulishuo.okdownload.DownloadTask getTask() {
        return this.task;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCurrentOffset() {
        return this.currentOffset;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTotalOffset() {
        return this.totalOffset;
    }

    public final com.liulishuo.okdownload.kotlin.DownloadProgress copy(com.liulishuo.okdownload.DownloadTask task, long currentOffset, long totalOffset) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
        return new com.liulishuo.okdownload.kotlin.DownloadProgress(task, currentOffset, totalOffset);
    }

    public boolean equals(java.lang.Object other) {
        if (this != other) {
            if (other instanceof com.liulishuo.okdownload.kotlin.DownloadProgress) {
                com.liulishuo.okdownload.kotlin.DownloadProgress downloadProgress = (com.liulishuo.okdownload.kotlin.DownloadProgress) other;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.task, downloadProgress.task)) {
                    if (this.currentOffset == downloadProgress.currentOffset) {
                        if (this.totalOffset == downloadProgress.totalOffset) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        com.liulishuo.okdownload.DownloadTask downloadTask = this.task;
        int hashCode = downloadTask != null ? downloadTask.hashCode() : 0;
        long j = this.currentOffset;
        int i = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.totalOffset;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public java.lang.String toString() {
        return "DownloadProgress(task=" + this.task + ", currentOffset=" + this.currentOffset + ", totalOffset=" + this.totalOffset + ")";
    }

    public DownloadProgress(com.liulishuo.okdownload.DownloadTask downloadTask, long j, long j2) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
        this.task = downloadTask;
        this.currentOffset = j;
        this.totalOffset = j2;
    }

    public final com.liulishuo.okdownload.DownloadTask getTask() {
        return this.task;
    }

    public final long getCurrentOffset() {
        return this.currentOffset;
    }

    public final long getTotalOffset() {
        return this.totalOffset;
    }

    public final boolean totalUnknown() {
        return this.totalOffset == -1;
    }

    public final float progress() {
        long j = this.totalOffset;
        if (j != -1) {
            if (j != 0) {
                return (this.currentOffset * 1.0f) / j;
            }
            if (this.currentOffset == 0) {
                return 1.0f;
            }
        }
        return 0.0f;
    }
}
