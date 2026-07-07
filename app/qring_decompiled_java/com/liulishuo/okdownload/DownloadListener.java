package com.liulishuo.okdownload;

/* loaded from: /tmp/dex/classes2.dex */
public interface DownloadListener {
    void connectEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, int i2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map);

    void connectStart(com.liulishuo.okdownload.DownloadTask downloadTask, int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map);

    void connectTrialEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map);

    void connectTrialStart(com.liulishuo.okdownload.DownloadTask downloadTask, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map);

    void downloadFromBeginning(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause);

    void downloadFromBreakpoint(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo);

    void fetchEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j);

    void fetchProgress(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j);

    void fetchStart(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j);

    void taskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc);

    void taskStart(com.liulishuo.okdownload.DownloadTask downloadTask);
}
