package com.liulishuo.okdownload.core.listener;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class DownloadListener4WithSpeed extends com.liulishuo.okdownload.core.listener.DownloadListener4 implements com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedCallback {
    @Override // com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Callback
    public final void blockEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, com.liulishuo.okdownload.core.breakpoint.BlockInfo blockInfo) {
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Callback
    public final void infoReady(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, boolean z, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model listener4Model) {
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Callback
    public final void progress(com.liulishuo.okdownload.DownloadTask downloadTask, long j) {
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Callback
    public final void progressBlock(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Callback
    public final void taskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model listener4Model) {
    }

    private DownloadListener4WithSpeed(com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend listener4SpeedAssistExtend) {
        super(new com.liulishuo.okdownload.core.listener.assist.Listener4Assist(new com.liulishuo.okdownload.core.listener.DownloadListener4WithSpeed.Listener4WithSpeedModelCreator()));
        listener4SpeedAssistExtend.setCallback(this);
        setAssistExtend(listener4SpeedAssistExtend);
    }

    public DownloadListener4WithSpeed() {
        this(new com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend());
    }

    private static class Listener4WithSpeedModelCreator implements com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ModelCreator<com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel> {
        private Listener4WithSpeedModelCreator() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ModelCreator
        public com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel create(int i) {
            return new com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel(i);
        }
    }
}
