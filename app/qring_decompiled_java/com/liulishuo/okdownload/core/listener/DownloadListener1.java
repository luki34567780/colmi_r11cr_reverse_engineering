package com.liulishuo.okdownload.core.listener;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class DownloadListener1 implements com.liulishuo.okdownload.DownloadListener, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback, com.liulishuo.okdownload.core.listener.assist.ListenerAssist {
    final com.liulishuo.okdownload.core.listener.assist.Listener1Assist assist;

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
    public void fetchEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void fetchStart(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
    }

    DownloadListener1(com.liulishuo.okdownload.core.listener.assist.Listener1Assist listener1Assist) {
        this.assist = listener1Assist;
        listener1Assist.setCallback(this);
    }

    public DownloadListener1() {
        this(new com.liulishuo.okdownload.core.listener.assist.Listener1Assist());
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerAssist
    public boolean isAlwaysRecoverAssistModel() {
        return this.assist.isAlwaysRecoverAssistModel();
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerAssist
    public void setAlwaysRecoverAssistModel(boolean z) {
        this.assist.setAlwaysRecoverAssistModel(z);
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerAssist
    public void setAlwaysRecoverAssistModelIfNotSet(boolean z) {
        this.assist.setAlwaysRecoverAssistModelIfNotSet(z);
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public final void taskStart(com.liulishuo.okdownload.DownloadTask downloadTask) {
        this.assist.taskStart(downloadTask);
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void downloadFromBeginning(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause) {
        this.assist.downloadFromBeginning(downloadTask, breakpointInfo, resumeFailedCause);
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void downloadFromBreakpoint(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        this.assist.downloadFromBreakpoint(downloadTask, breakpointInfo);
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void connectEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, int i2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        this.assist.connectEnd(downloadTask);
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void fetchProgress(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
        this.assist.fetchProgress(downloadTask, j);
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public final void taskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc) {
        this.assist.taskEnd(downloadTask, endCause, exc);
    }
}
