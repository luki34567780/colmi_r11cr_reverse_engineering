package com.liulishuo.okdownload.core.listener;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class DownloadListener4 implements com.liulishuo.okdownload.DownloadListener, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Callback, com.liulishuo.okdownload.core.listener.assist.ListenerAssist {
    final com.liulishuo.okdownload.core.listener.assist.Listener4Assist assist;

    @Override // com.liulishuo.okdownload.DownloadListener
    public void connectTrialEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void connectTrialStart(com.liulishuo.okdownload.DownloadTask downloadTask, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void fetchStart(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
    }

    DownloadListener4(com.liulishuo.okdownload.core.listener.assist.Listener4Assist listener4Assist) {
        this.assist = listener4Assist;
        listener4Assist.setCallback(this);
    }

    public DownloadListener4() {
        this(new com.liulishuo.okdownload.core.listener.assist.Listener4Assist(new com.liulishuo.okdownload.core.listener.DownloadListener4.Listener4ModelCreator()));
    }

    public void setAssistExtend(com.liulishuo.okdownload.core.listener.assist.Listener4Assist.AssistExtend assistExtend) {
        this.assist.setAssistExtend(assistExtend);
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
    public final void downloadFromBeginning(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause) {
        this.assist.infoReady(downloadTask, breakpointInfo, false);
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public final void downloadFromBreakpoint(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        this.assist.infoReady(downloadTask, breakpointInfo, true);
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public final void fetchProgress(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
        this.assist.fetchProgress(downloadTask, i, j);
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void fetchEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
        this.assist.fetchEnd(downloadTask, i);
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public final void taskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc) {
        this.assist.taskEnd(downloadTask, endCause, exc);
    }

    static class Listener4ModelCreator implements com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ModelCreator<com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model> {
        Listener4ModelCreator() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ModelCreator
        public com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model create(int i) {
            return new com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model(i);
        }
    }
}
