package com.liulishuo.okdownload.core.breakpoint;

/* loaded from: /tmp/dex/classes2.dex */
public interface DownloadStore extends com.liulishuo.okdownload.core.breakpoint.BreakpointStore {
    com.liulishuo.okdownload.core.breakpoint.BreakpointInfo getAfterCompleted(int i);

    boolean markFileClear(int i);

    boolean markFileDirty(int i);

    void onSyncToFilesystemSuccess(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, int i, long j) throws java.io.IOException;

    void onTaskEnd(int i, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc);

    void onTaskStart(int i);
}
