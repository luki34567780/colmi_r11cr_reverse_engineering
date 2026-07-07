package com.liulishuo.okdownload.core.breakpoint;

/* loaded from: /tmp/dex/classes2.dex */
public interface BreakpointStore {
    com.liulishuo.okdownload.core.breakpoint.BreakpointInfo createAndInsert(com.liulishuo.okdownload.DownloadTask downloadTask) throws java.io.IOException;

    com.liulishuo.okdownload.core.breakpoint.BreakpointInfo findAnotherInfoFromCompare(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo);

    int findOrCreateId(com.liulishuo.okdownload.DownloadTask downloadTask);

    com.liulishuo.okdownload.core.breakpoint.BreakpointInfo get(int i);

    java.lang.String getResponseFilename(java.lang.String str);

    boolean isFileDirty(int i);

    boolean isOnlyMemoryCache();

    void remove(int i);

    boolean update(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) throws java.io.IOException;
}
