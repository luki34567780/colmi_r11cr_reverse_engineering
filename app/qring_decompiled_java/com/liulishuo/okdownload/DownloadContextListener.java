package com.liulishuo.okdownload;

/* loaded from: /tmp/dex/classes2.dex */
public interface DownloadContextListener {
    void queueEnd(com.liulishuo.okdownload.DownloadContext downloadContext);

    void taskEnd(com.liulishuo.okdownload.DownloadContext downloadContext, com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc, int i);
}
