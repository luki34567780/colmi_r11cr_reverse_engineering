package com.liulishuo.okdownload.core.listener.assist;

/* loaded from: /tmp/dex/classes2.dex */
public class Listener4SpeedAssistExtend implements com.liulishuo.okdownload.core.listener.assist.Listener4Assist.AssistExtend, com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ModelCreator<com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel> {
    private com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedCallback callback;

    public interface Listener4SpeedCallback {
        void blockEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, com.liulishuo.okdownload.core.breakpoint.BlockInfo blockInfo, com.liulishuo.okdownload.SpeedCalculator speedCalculator);

        void infoReady(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, boolean z, com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel listener4SpeedModel);

        void progress(com.liulishuo.okdownload.DownloadTask downloadTask, long j, com.liulishuo.okdownload.SpeedCalculator speedCalculator);

        void progressBlock(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j, com.liulishuo.okdownload.SpeedCalculator speedCalculator);

        void taskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc, com.liulishuo.okdownload.SpeedCalculator speedCalculator);
    }

    public void setCallback(com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedCallback listener4SpeedCallback) {
        this.callback = listener4SpeedCallback;
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener4Assist.AssistExtend
    public boolean dispatchInfoReady(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, boolean z, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model listener4Model) {
        com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedCallback listener4SpeedCallback = this.callback;
        if (listener4SpeedCallback == null) {
            return true;
        }
        listener4SpeedCallback.infoReady(downloadTask, breakpointInfo, z, (com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel) listener4Model);
        return true;
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener4Assist.AssistExtend
    public boolean dispatchFetchProgress(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model listener4Model) {
        com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel listener4SpeedModel = (com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel) listener4Model;
        listener4SpeedModel.blockSpeeds.get(i).downloading(j);
        listener4SpeedModel.taskSpeed.downloading(j);
        com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedCallback listener4SpeedCallback = this.callback;
        if (listener4SpeedCallback == null) {
            return true;
        }
        listener4SpeedCallback.progressBlock(downloadTask, i, listener4Model.blockCurrentOffsetMap.get(i).longValue(), listener4SpeedModel.getBlockSpeed(i));
        this.callback.progress(downloadTask, listener4Model.currentOffset, listener4SpeedModel.taskSpeed);
        return true;
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener4Assist.AssistExtend
    public boolean dispatchBlockEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model listener4Model) {
        com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel listener4SpeedModel = (com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel) listener4Model;
        listener4SpeedModel.blockSpeeds.get(i).endTask();
        com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedCallback listener4SpeedCallback = this.callback;
        if (listener4SpeedCallback == null) {
            return true;
        }
        listener4SpeedCallback.blockEnd(downloadTask, i, listener4Model.info.getBlock(i), listener4SpeedModel.getBlockSpeed(i));
        return true;
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener4Assist.AssistExtend
    public boolean dispatchTaskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model listener4Model) {
        com.liulishuo.okdownload.SpeedCalculator speedCalculator;
        com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel listener4SpeedModel = (com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel) listener4Model;
        if (listener4SpeedModel.taskSpeed != null) {
            speedCalculator = listener4SpeedModel.taskSpeed;
            speedCalculator.endTask();
        } else {
            speedCalculator = new com.liulishuo.okdownload.SpeedCalculator();
        }
        com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedCallback listener4SpeedCallback = this.callback;
        if (listener4SpeedCallback == null) {
            return true;
        }
        listener4SpeedCallback.taskEnd(downloadTask, endCause, exc, speedCalculator);
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ModelCreator
    public com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel create(int i) {
        return new com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel(i);
    }

    public static class Listener4SpeedModel extends com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model {
        android.util.SparseArray<com.liulishuo.okdownload.SpeedCalculator> blockSpeeds;
        com.liulishuo.okdownload.SpeedCalculator taskSpeed;

        public com.liulishuo.okdownload.SpeedCalculator getTaskSpeed() {
            return this.taskSpeed;
        }

        public com.liulishuo.okdownload.SpeedCalculator getBlockSpeed(int i) {
            return this.blockSpeeds.get(i);
        }

        public Listener4SpeedModel(int i) {
            super(i);
        }

        @Override // com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model, com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ListenerModel
        public void onInfoValid(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
            super.onInfoValid(breakpointInfo);
            this.taskSpeed = new com.liulishuo.okdownload.SpeedCalculator();
            this.blockSpeeds = new android.util.SparseArray<>();
            int blockCount = breakpointInfo.getBlockCount();
            for (int i = 0; i < blockCount; i++) {
                this.blockSpeeds.put(i, new com.liulishuo.okdownload.SpeedCalculator());
            }
        }
    }
}
