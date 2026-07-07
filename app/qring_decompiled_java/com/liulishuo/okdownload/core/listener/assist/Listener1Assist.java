package com.liulishuo.okdownload.core.listener.assist;

/* loaded from: /tmp/dex/classes2.dex */
public class Listener1Assist implements com.liulishuo.okdownload.core.listener.assist.ListenerAssist, com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ModelCreator<com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model> {
    private com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback callback;
    private final com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler<com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model> modelHandler;

    public interface Listener1Callback {
        void connected(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j, long j2);

        void progress(com.liulishuo.okdownload.DownloadTask downloadTask, long j, long j2);

        void retry(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause);

        void taskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model listener1Model);

        void taskStart(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model listener1Model);
    }

    public Listener1Assist() {
        this.modelHandler = new com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler<>(this);
    }

    Listener1Assist(com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler<com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model> listenerModelHandler) {
        this.modelHandler = listenerModelHandler;
    }

    public void setCallback(com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback listener1Callback) {
        this.callback = listener1Callback;
    }

    public void taskStart(com.liulishuo.okdownload.DownloadTask downloadTask) {
        com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model addAndGetModel = this.modelHandler.addAndGetModel(downloadTask, null);
        com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback listener1Callback = this.callback;
        if (listener1Callback != null) {
            listener1Callback.taskStart(downloadTask, addAndGetModel);
        }
    }

    public void taskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc) {
        com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model removeOrCreate = this.modelHandler.removeOrCreate(downloadTask, downloadTask.getInfo());
        com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback listener1Callback = this.callback;
        if (listener1Callback != null) {
            listener1Callback.taskEnd(downloadTask, endCause, exc, removeOrCreate);
        }
    }

    public void downloadFromBeginning(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause) {
        com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback listener1Callback;
        com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model orRecoverModel = this.modelHandler.getOrRecoverModel(downloadTask, breakpointInfo);
        if (orRecoverModel == null) {
            return;
        }
        orRecoverModel.onInfoValid(breakpointInfo);
        if (orRecoverModel.isStarted.booleanValue() && (listener1Callback = this.callback) != null) {
            listener1Callback.retry(downloadTask, resumeFailedCause);
        }
        orRecoverModel.isStarted = true;
        orRecoverModel.isFromResumed = false;
        orRecoverModel.isFirstConnect = true;
    }

    public void downloadFromBreakpoint(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model orRecoverModel = this.modelHandler.getOrRecoverModel(downloadTask, breakpointInfo);
        if (orRecoverModel == null) {
            return;
        }
        orRecoverModel.onInfoValid(breakpointInfo);
        orRecoverModel.isStarted = true;
        orRecoverModel.isFromResumed = true;
        orRecoverModel.isFirstConnect = true;
    }

    public void connectEnd(com.liulishuo.okdownload.DownloadTask downloadTask) {
        com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model orRecoverModel = this.modelHandler.getOrRecoverModel(downloadTask, downloadTask.getInfo());
        if (orRecoverModel == null) {
            return;
        }
        if (orRecoverModel.isFromResumed.booleanValue() && orRecoverModel.isFirstConnect.booleanValue()) {
            orRecoverModel.isFirstConnect = false;
        }
        com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback listener1Callback = this.callback;
        if (listener1Callback != null) {
            listener1Callback.connected(downloadTask, orRecoverModel.blockCount, orRecoverModel.currentOffset.get(), orRecoverModel.totalLength);
        }
    }

    public void fetchProgress(com.liulishuo.okdownload.DownloadTask downloadTask, long j) {
        com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model orRecoverModel = this.modelHandler.getOrRecoverModel(downloadTask, downloadTask.getInfo());
        if (orRecoverModel == null) {
            return;
        }
        orRecoverModel.currentOffset.addAndGet(j);
        com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback listener1Callback = this.callback;
        if (listener1Callback != null) {
            listener1Callback.progress(downloadTask, orRecoverModel.currentOffset.get(), orRecoverModel.totalLength);
        }
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerAssist
    public boolean isAlwaysRecoverAssistModel() {
        return this.modelHandler.isAlwaysRecoverAssistModel();
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerAssist
    public void setAlwaysRecoverAssistModel(boolean z) {
        this.modelHandler.setAlwaysRecoverAssistModel(z);
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerAssist
    public void setAlwaysRecoverAssistModelIfNotSet(boolean z) {
        this.modelHandler.setAlwaysRecoverAssistModelIfNotSet(z);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ModelCreator
    public com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model create(int i) {
        return new com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model(i);
    }

    public static class Listener1Model implements com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ListenerModel {
        int blockCount;
        final java.util.concurrent.atomic.AtomicLong currentOffset = new java.util.concurrent.atomic.AtomicLong();
        final int id;
        volatile java.lang.Boolean isFirstConnect;
        java.lang.Boolean isFromResumed;
        java.lang.Boolean isStarted;
        long totalLength;

        Listener1Model(int i) {
            this.id = i;
        }

        public long getTotalLength() {
            return this.totalLength;
        }

        @Override // com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ListenerModel
        public int getId() {
            return this.id;
        }

        @Override // com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ListenerModel
        public void onInfoValid(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
            this.blockCount = breakpointInfo.getBlockCount();
            this.totalLength = breakpointInfo.getTotalLength();
            this.currentOffset.set(breakpointInfo.getTotalOffset());
            if (this.isStarted == null) {
                this.isStarted = false;
            }
            if (this.isFromResumed == null) {
                this.isFromResumed = java.lang.Boolean.valueOf(this.currentOffset.get() > 0);
            }
            if (this.isFirstConnect == null) {
                this.isFirstConnect = true;
            }
        }
    }
}
