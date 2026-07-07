package com.liulishuo.okdownload.core.file;

/* loaded from: /tmp/dex/classes2.dex */
public class CustomProcessFileStrategy extends com.liulishuo.okdownload.core.file.ProcessFileStrategy {
    @Override // com.liulishuo.okdownload.core.file.ProcessFileStrategy
    public com.liulishuo.okdownload.core.file.MultiPointOutputStream createProcessStream(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo info, com.liulishuo.okdownload.core.breakpoint.DownloadStore store) {
        return new com.liulishuo.okdownload.core.file.CustomMultiPointOutputStream(task, info, store);
    }
}
