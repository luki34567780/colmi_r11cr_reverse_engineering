package com.liulishuo.okdownload.core.exception;

/* loaded from: /tmp/dex/classes2.dex */
public class FileBusyAfterRunException extends java.io.IOException {
    public static final com.liulishuo.okdownload.core.exception.FileBusyAfterRunException SIGNAL = new com.liulishuo.okdownload.core.exception.FileBusyAfterRunException() { // from class: com.liulishuo.okdownload.core.exception.FileBusyAfterRunException.1
    };

    private FileBusyAfterRunException() {
        super("File busy after run");
    }
}
