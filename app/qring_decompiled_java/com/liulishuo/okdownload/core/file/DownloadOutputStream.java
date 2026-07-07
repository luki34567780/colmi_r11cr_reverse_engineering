package com.liulishuo.okdownload.core.file;

/* loaded from: /tmp/dex/classes2.dex */
public interface DownloadOutputStream {

    public interface Factory {
        com.liulishuo.okdownload.core.file.DownloadOutputStream create(android.content.Context context, android.net.Uri uri, int i) throws java.io.FileNotFoundException;

        com.liulishuo.okdownload.core.file.DownloadOutputStream create(android.content.Context context, java.io.File file, int i) throws java.io.FileNotFoundException;

        boolean supportSeek();
    }

    void close() throws java.io.IOException;

    void flushAndSync() throws java.io.IOException;

    void seek(long j) throws java.io.IOException;

    void setLength(long j) throws java.io.IOException;

    void write(byte[] bArr, int i, int i2) throws java.io.IOException;
}
