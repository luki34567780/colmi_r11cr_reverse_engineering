package com.liulishuo.okdownload.core.listener.assist;

/* loaded from: /tmp/dex/classes2.dex */
public class ListenerModelHandler<T extends com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ListenerModel> implements com.liulishuo.okdownload.core.listener.assist.ListenerAssist {
    private java.lang.Boolean alwaysRecoverModel;
    private final com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ModelCreator<T> creator;
    final android.util.SparseArray<T> modelList = new android.util.SparseArray<>();
    volatile T singleTaskModel;

    interface ListenerModel {
        int getId();

        void onInfoValid(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo);
    }

    public interface ModelCreator<T extends com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ListenerModel> {
        T create(int i);
    }

    ListenerModelHandler(com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ModelCreator<T> modelCreator) {
        this.creator = modelCreator;
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerAssist
    public boolean isAlwaysRecoverAssistModel() {
        java.lang.Boolean bool = this.alwaysRecoverModel;
        return bool != null && bool.booleanValue();
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerAssist
    public void setAlwaysRecoverAssistModel(boolean z) {
        this.alwaysRecoverModel = java.lang.Boolean.valueOf(z);
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerAssist
    public void setAlwaysRecoverAssistModelIfNotSet(boolean z) {
        if (this.alwaysRecoverModel == null) {
            this.alwaysRecoverModel = java.lang.Boolean.valueOf(z);
        }
    }

    T addAndGetModel(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        T create = this.creator.create(downloadTask.getId());
        synchronized (this) {
            if (this.singleTaskModel == null) {
                this.singleTaskModel = create;
            } else {
                this.modelList.put(downloadTask.getId(), create);
            }
            if (breakpointInfo != null) {
                create.onInfoValid(breakpointInfo);
            }
        }
        return create;
    }

    T getOrRecoverModel(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        T t;
        int id = downloadTask.getId();
        synchronized (this) {
            t = (this.singleTaskModel == null || this.singleTaskModel.getId() != id) ? null : this.singleTaskModel;
        }
        if (t == null) {
            t = this.modelList.get(id);
        }
        return (t == null && isAlwaysRecoverAssistModel()) ? addAndGetModel(downloadTask, breakpointInfo) : t;
    }

    T removeOrCreate(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        T t;
        int id = downloadTask.getId();
        synchronized (this) {
            if (this.singleTaskModel != null && this.singleTaskModel.getId() == id) {
                t = this.singleTaskModel;
                this.singleTaskModel = null;
            } else {
                t = this.modelList.get(id);
                this.modelList.remove(id);
            }
        }
        if (t == null) {
            t = this.creator.create(id);
            if (breakpointInfo != null) {
                t.onInfoValid(breakpointInfo);
            }
        }
        return t;
    }
}
