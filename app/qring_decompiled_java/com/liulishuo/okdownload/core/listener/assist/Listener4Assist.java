package com.liulishuo.okdownload.core.listener.assist;

/* loaded from: /tmp/dex/classes2.dex */
public class Listener4Assist<T extends com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model> implements com.liulishuo.okdownload.core.listener.assist.ListenerAssist {
    private com.liulishuo.okdownload.core.listener.assist.Listener4Assist.AssistExtend assistExtend;
    com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Callback callback;
    private final com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler<T> modelHandler;

    public interface AssistExtend {
        boolean dispatchBlockEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model listener4Model);

        boolean dispatchFetchProgress(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model listener4Model);

        boolean dispatchInfoReady(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, boolean z, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model listener4Model);

        boolean dispatchTaskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model listener4Model);
    }

    public interface Listener4Callback {
        void blockEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, com.liulishuo.okdownload.core.breakpoint.BlockInfo blockInfo);

        void infoReady(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, boolean z, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model listener4Model);

        void progress(com.liulishuo.okdownload.DownloadTask downloadTask, long j);

        void progressBlock(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j);

        void taskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model listener4Model);
    }

    Listener4Assist(com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler<T> listenerModelHandler) {
        this.modelHandler = listenerModelHandler;
    }

    public Listener4Assist(com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ModelCreator<T> modelCreator) {
        this.modelHandler = new com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler<>(modelCreator);
    }

    public void setCallback(com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Callback listener4Callback) {
        this.callback = listener4Callback;
    }

    public void setAssistExtend(com.liulishuo.okdownload.core.listener.assist.Listener4Assist.AssistExtend assistExtend) {
        this.assistExtend = assistExtend;
    }

    public com.liulishuo.okdownload.core.listener.assist.Listener4Assist.AssistExtend getAssistExtend() {
        return this.assistExtend;
    }

    public void infoReady(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, boolean z) {
        com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Callback listener4Callback;
        T addAndGetModel = this.modelHandler.addAndGetModel(downloadTask, breakpointInfo);
        com.liulishuo.okdownload.core.listener.assist.Listener4Assist.AssistExtend assistExtend = this.assistExtend;
        if ((assistExtend == null || !assistExtend.dispatchInfoReady(downloadTask, breakpointInfo, z, addAndGetModel)) && (listener4Callback = this.callback) != null) {
            listener4Callback.infoReady(downloadTask, breakpointInfo, z, addAndGetModel);
        }
    }

    public void fetchProgress(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
        com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Callback listener4Callback;
        T orRecoverModel = this.modelHandler.getOrRecoverModel(downloadTask, downloadTask.getInfo());
        if (orRecoverModel == null) {
            return;
        }
        long longValue = orRecoverModel.blockCurrentOffsetMap.get(i).longValue() + j;
        orRecoverModel.blockCurrentOffsetMap.put(i, java.lang.Long.valueOf(longValue));
        orRecoverModel.currentOffset += j;
        com.liulishuo.okdownload.core.listener.assist.Listener4Assist.AssistExtend assistExtend = this.assistExtend;
        if ((assistExtend == null || !assistExtend.dispatchFetchProgress(downloadTask, i, j, orRecoverModel)) && (listener4Callback = this.callback) != null) {
            listener4Callback.progressBlock(downloadTask, i, longValue);
            this.callback.progress(downloadTask, orRecoverModel.currentOffset);
        }
    }

    public void fetchEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i) {
        com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Callback listener4Callback;
        T orRecoverModel = this.modelHandler.getOrRecoverModel(downloadTask, downloadTask.getInfo());
        if (orRecoverModel == null) {
            return;
        }
        com.liulishuo.okdownload.core.listener.assist.Listener4Assist.AssistExtend assistExtend = this.assistExtend;
        if ((assistExtend == null || !assistExtend.dispatchBlockEnd(downloadTask, i, orRecoverModel)) && (listener4Callback = this.callback) != null) {
            listener4Callback.blockEnd(downloadTask, i, orRecoverModel.info.getBlock(i));
        }
    }

    public synchronized void taskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc) {
        T removeOrCreate = this.modelHandler.removeOrCreate(downloadTask, downloadTask.getInfo());
        com.liulishuo.okdownload.core.listener.assist.Listener4Assist.AssistExtend assistExtend = this.assistExtend;
        if (assistExtend == null || !assistExtend.dispatchTaskEnd(downloadTask, endCause, exc, removeOrCreate)) {
            com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Callback listener4Callback = this.callback;
            if (listener4Callback != null) {
                listener4Callback.taskEnd(downloadTask, endCause, exc, removeOrCreate);
            }
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

    public static class Listener4Model implements com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ListenerModel {
        android.util.SparseArray<java.lang.Long> blockCurrentOffsetMap;
        long currentOffset;
        private final int id;
        com.liulishuo.okdownload.core.breakpoint.BreakpointInfo info;

        public Listener4Model(int i) {
            this.id = i;
        }

        android.util.SparseArray<java.lang.Long> getBlockCurrentOffsetMap() {
            return this.blockCurrentOffsetMap;
        }

        public long getCurrentOffset() {
            return this.currentOffset;
        }

        public long getBlockCurrentOffset(int i) {
            return this.blockCurrentOffsetMap.get(i).longValue();
        }

        public android.util.SparseArray<java.lang.Long> cloneBlockCurrentOffsetMap() {
            return this.blockCurrentOffsetMap.clone();
        }

        public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo getInfo() {
            return this.info;
        }

        @Override // com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ListenerModel
        public int getId() {
            return this.id;
        }

        @Override // com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ListenerModel
        public void onInfoValid(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
            this.info = breakpointInfo;
            this.currentOffset = breakpointInfo.getTotalOffset();
            android.util.SparseArray<java.lang.Long> sparseArray = new android.util.SparseArray<>();
            int blockCount = breakpointInfo.getBlockCount();
            for (int i = 0; i < blockCount; i++) {
                sparseArray.put(i, java.lang.Long.valueOf(breakpointInfo.getBlock(i).getCurrentOffset()));
            }
            this.blockCurrentOffsetMap = sparseArray;
        }
    }
}
