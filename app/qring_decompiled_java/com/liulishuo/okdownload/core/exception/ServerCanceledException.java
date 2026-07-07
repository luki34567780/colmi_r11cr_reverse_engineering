package com.liulishuo.okdownload.core.exception;

/* loaded from: /tmp/dex/classes2.dex */
public class ServerCanceledException extends java.io.IOException {
    private final int responseCode;

    public ServerCanceledException(int i, long j) {
        super("Response code can't handled on internal " + i + " with current offset " + j);
        this.responseCode = i;
    }

    public int getResponseCode() {
        return this.responseCode;
    }
}
