package com.liulishuo.okdownload.core.listener;

/* loaded from: /tmp/dex/classes2.dex */
public class DownloadListenerBunch implements com.liulishuo.okdownload.DownloadListener {
    final com.liulishuo.okdownload.DownloadListener[] listenerList;

    DownloadListenerBunch(com.liulishuo.okdownload.DownloadListener[] downloadListenerArr) {
        this.listenerList = downloadListenerArr;
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void taskStart(com.liulishuo.okdownload.DownloadTask downloadTask) {
        for (com.liulishuo.okdownload.DownloadListener downloadListener : this.listenerList) {
            downloadListener.taskStart(downloadTask);
        }
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void connectTrialStart(com.liulishuo.okdownload.DownloadTask downloadTask, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        for (com.liulishuo.okdownload.DownloadListener downloadListener : this.listenerList) {
            downloadListener.connectTrialStart(downloadTask, map);
        }
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void connectTrialEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        for (com.liulishuo.okdownload.DownloadListener downloadListener : this.listenerList) {
            downloadListener.connectTrialEnd(downloadTask, i, map);
        }
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void downloadFromBeginning(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause) {
        for (com.liulishuo.okdownload.DownloadListener downloadListener : this.listenerList) {
            downloadListener.downloadFromBeginning(downloadTask, breakpointInfo, resumeFailedCause);
        }
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void downloadFromBreakpoint(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        for (com.liulishuo.okdownload.DownloadListener downloadListener : this.listenerList) {
            downloadListener.downloadFromBreakpoint(downloadTask, breakpointInfo);
        }
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void connectStart(com.liulishuo.okdownload.DownloadTask downloadTask, int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        for (com.liulishuo.okdownload.DownloadListener downloadListener : this.listenerList) {
            downloadListener.connectStart(downloadTask, i, map);
        }
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void connectEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, int i2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        for (com.liulishuo.okdownload.DownloadListener downloadListener : this.listenerList) {
            downloadListener.connectEnd(downloadTask, i, i2, map);
        }
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void fetchStart(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
        for (com.liulishuo.okdownload.DownloadListener downloadListener : this.listenerList) {
            downloadListener.fetchStart(downloadTask, i, j);
        }
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void fetchProgress(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
        for (com.liulishuo.okdownload.DownloadListener downloadListener : this.listenerList) {
            downloadListener.fetchProgress(downloadTask, i, j);
        }
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void fetchEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
        for (com.liulishuo.okdownload.DownloadListener downloadListener : this.listenerList) {
            downloadListener.fetchEnd(downloadTask, i, j);
        }
    }

    @Override // com.liulishuo.okdownload.DownloadListener
    public void taskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc) {
        for (com.liulishuo.okdownload.DownloadListener downloadListener : this.listenerList) {
            downloadListener.taskEnd(downloadTask, endCause, exc);
        }
    }

    public boolean contain(com.liulishuo.okdownload.DownloadListener downloadListener) {
        for (com.liulishuo.okdownload.DownloadListener downloadListener2 : this.listenerList) {
            if (downloadListener2 == downloadListener) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(com.liulishuo.okdownload.DownloadListener downloadListener) {
        int i = 0;
        while (true) {
            com.liulishuo.okdownload.DownloadListener[] downloadListenerArr = this.listenerList;
            if (i >= downloadListenerArr.length) {
                return -1;
            }
            if (downloadListenerArr[i] == downloadListener) {
                return i;
            }
            i++;
        }
    }

    public static class Builder {
        private java.util.List<com.liulishuo.okdownload.DownloadListener> listenerList = new java.util.ArrayList();

        public com.liulishuo.okdownload.core.listener.DownloadListenerBunch build() {
            java.util.List<com.liulishuo.okdownload.DownloadListener> list = this.listenerList;
            return new com.liulishuo.okdownload.core.listener.DownloadListenerBunch((com.liulishuo.okdownload.DownloadListener[]) list.toArray(new com.liulishuo.okdownload.DownloadListener[list.size()]));
        }

        public com.liulishuo.okdownload.core.listener.DownloadListenerBunch.Builder append(com.liulishuo.okdownload.DownloadListener downloadListener) {
            if (downloadListener != null && !this.listenerList.contains(downloadListener)) {
                this.listenerList.add(downloadListener);
            }
            return this;
        }

        public boolean remove(com.liulishuo.okdownload.DownloadListener downloadListener) {
            return this.listenerList.remove(downloadListener);
        }
    }
}
