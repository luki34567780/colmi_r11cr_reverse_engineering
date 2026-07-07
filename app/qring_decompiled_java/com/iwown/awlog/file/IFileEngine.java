package com.iwown.awlog.file;

/* loaded from: /tmp/dex/classes2.dex */
public interface IFileEngine {
    void flushAsync();

    void release();

    void writeToFile(java.io.File file, java.lang.String str);
}
