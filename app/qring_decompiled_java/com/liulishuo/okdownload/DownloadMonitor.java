package com.liulishuo.okdownload;

/* loaded from: /tmp/dex/classes2.dex */
public interface DownloadMonitor {
    void taskDownloadFromBeginning(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause);

    void taskDownloadFromBreakpoint(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo);

    void taskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc);

    void taskStart(com.liulishuo.okdownload.DownloadTask downloadTask);
}
