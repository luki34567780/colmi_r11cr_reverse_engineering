package com.liulishuo.okdownload.core.listener;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class DownloadListener2 implements com.liulishuo.okdownload.DownloadListener {
    @Override // com.liulishuo.okdownload.DownloadListener
    public void connectEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, int i2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void connectStart(com.liulishuo.okdownload.DownloadTask downloadTask, int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void connectTrialEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void connectTrialStart(com.liulishuo.okdownload.DownloadTask downloadTask, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void downloadFromBeginning(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause) {
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void downloadFromBreakpoint(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void fetchEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void fetchProgress(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void fetchStart(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
    }
}
