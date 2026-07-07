package com.liulishuo.okdownload;

/* loaded from: /tmp/dex/classes2.dex */
public class DownloadSerialQueue extends com.liulishuo.okdownload.core.listener.DownloadListener2 implements java.lang.Runnable {
    static final int ID_INVALID = 0;
    private static final java.util.concurrent.Executor SERIAL_EXECUTOR = new java.util.concurrent.ThreadPoolExecutor(0, com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER, 30, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), com.liulishuo.okdownload.core.Util.threadFactory("OkDownload DynamicSerial", false));
    private static final java.lang.String TAG = "DownloadSerialQueue";
    com.liulishuo.okdownload.core.listener.DownloadListenerBunch listenerBunch;
    volatile boolean looping;
    volatile boolean paused;
    volatile com.liulishuo.okdownload.DownloadTask runningTask;
    volatile boolean shutedDown;
    private final java.util.ArrayList<com.liulishuo.okdownload.DownloadTask> taskList;

    public DownloadSerialQueue() {
        this(null);
    }

    DownloadSerialQueue(com.liulishuo.okdownload.DownloadListener downloadListener, java.util.ArrayList<com.liulishuo.okdownload.DownloadTask> arrayList) {
        this.shutedDown = false;
        this.looping = false;
        this.paused = false;
        this.listenerBunch = new com.liulishuo.okdownload.core.listener.DownloadListenerBunch.Builder().append(this).append(downloadListener).build();
        this.taskList = arrayList;
    }

    public DownloadSerialQueue(com.liulishuo.okdownload.DownloadListener downloadListener) {
        this(downloadListener, new java.util.ArrayList());
    }

    public void setListener(com.liulishuo.okdownload.DownloadListener downloadListener) {
        this.listenerBunch = new com.liulishuo.okdownload.core.listener.DownloadListenerBunch.Builder().append(this).append(downloadListener).build();
    }

    public synchronized void enqueue(com.liulishuo.okdownload.DownloadTask downloadTask) {
        this.taskList.add(downloadTask);
        java.util.Collections.sort(this.taskList);
        if (!this.paused && !this.looping) {
            this.looping = true;
            startNewLooper();
        }
    }

    public synchronized void pause() {
        if (this.paused) {
            com.liulishuo.okdownload.core.Util.w(TAG, "require pause this queue(remain " + this.taskList.size() + "), butit has already been paused");
            return;
        }
        this.paused = true;
        if (this.runningTask != null) {
            this.runningTask.cancel();
            this.taskList.add(0, this.runningTask);
            this.runningTask = null;
        }
    }

    public synchronized void resume() {
        if (!this.paused) {
            com.liulishuo.okdownload.core.Util.w(TAG, "require resume this queue(remain " + this.taskList.size() + "), but it is still running");
            return;
        }
        this.paused = false;
        if (!this.taskList.isEmpty() && !this.looping) {
            this.looping = true;
            startNewLooper();
        }
    }

    public int getWorkingTaskId() {
        if (this.runningTask != null) {
            return this.runningTask.getId();
        }
        return 0;
    }

    public int getWaitingTaskCount() {
        return this.taskList.size();
    }

    public synchronized com.liulishuo.okdownload.DownloadTask[] shutdown() {
        com.liulishuo.okdownload.DownloadTask[] downloadTaskArr;
        this.shutedDown = true;
        if (this.runningTask != null) {
            this.runningTask.cancel();
        }
        downloadTaskArr = new com.liulishuo.okdownload.DownloadTask[this.taskList.size()];
        this.taskList.toArray(downloadTaskArr);
        this.taskList.clear();
        return downloadTaskArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.liulishuo.okdownload.DownloadTask remove;
        while (!this.shutedDown) {
            synchronized (this) {
                if (!this.taskList.isEmpty() && !this.paused) {
                    remove = this.taskList.remove(0);
                }
                this.runningTask = null;
                this.looping = false;
                return;
            }
            remove.execute(this.listenerBunch);
        }
    }

    void startNewLooper() {
        SERIAL_EXECUTOR.execute(this);
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void taskStart(com.liulishuo.okdownload.DownloadTask downloadTask) {
        this.runningTask = downloadTask;
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public synchronized void taskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc) {
        if (endCause != com.liulishuo.okdownload.core.cause.EndCause.CANCELED && downloadTask == this.runningTask) {
            this.runningTask = null;
        }
    }
}
