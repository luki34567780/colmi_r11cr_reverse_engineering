package com.liulishuo.okdownload.core.file;

/* loaded from: /tmp/dex/classes2.dex */
public class DownloadUriOutputStream implements com.liulishuo.okdownload.core.file.DownloadOutputStream {
    private final java.nio.channels.FileChannel channel;
    final java.io.FileOutputStream fos;
    final java.io.BufferedOutputStream out;
    final android.os.ParcelFileDescriptor pdf;

    public DownloadUriOutputStream(android.content.Context context, android.net.Uri uri, int i) throws java.io.FileNotFoundException {
        android.os.ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
        if (openFileDescriptor == null) {
            throw new java.io.FileNotFoundException("result of " + uri + " is null!");
        }
        this.pdf = openFileDescriptor;
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(openFileDescriptor.getFileDescriptor());
        this.fos = fileOutputStream;
        this.channel = fileOutputStream.getChannel();
        this.out = new java.io.BufferedOutputStream(fileOutputStream, i);
    }

    DownloadUriOutputStream(java.nio.channels.FileChannel fileChannel, android.os.ParcelFileDescriptor parcelFileDescriptor, java.io.FileOutputStream fileOutputStream, java.io.BufferedOutputStream bufferedOutputStream) {
        this.channel = fileChannel;
        this.pdf = parcelFileDescriptor;
        this.fos = fileOutputStream;
        this.out = bufferedOutputStream;
    }

    @Override // com.liulishuo.okdownload.core.file.DownloadOutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.out.write(bArr, i, i2);
    }

    @Override // com.liulishuo.okdownload.core.file.DownloadOutputStream
    public void close() throws java.io.IOException {
        this.out.close();
        this.fos.close();
        this.pdf.close();
    }

    @Override // com.liulishuo.okdownload.core.file.DownloadOutputStream
    public void flushAndSync() throws java.io.IOException {
        this.out.flush();
        this.pdf.getFileDescriptor().sync();
    }

    @Override // com.liulishuo.okdownload.core.file.DownloadOutputStream
    public void seek(long j) throws java.io.IOException {
        this.channel.position(j);
    }

    @Override // com.liulishuo.okdownload.core.file.DownloadOutputStream
    public void setLength(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            try {
                android.system.Os.posix_fallocate(this.pdf.getFileDescriptor(), 0L, j);
                return;
            } catch (java.lang.Throwable th) {
                if (th instanceof android.system.ErrnoException) {
                    android.system.ErrnoException errnoException = th;
                    if (errnoException.errno == android.system.OsConstants.ENOSYS || errnoException.errno == android.system.OsConstants.ENOTSUP) {
                        com.liulishuo.okdownload.core.Util.w("DownloadUriOutputStream", "fallocate() not supported; falling back to ftruncate()");
                        try {
                            android.system.Os.ftruncate(this.pdf.getFileDescriptor(), j);
                            return;
                        } catch (java.lang.Throwable th2) {
                            com.liulishuo.okdownload.core.Util.w("DownloadUriOutputStream", "It can't pre-allocate length(" + j + ") on the sdk version(" + android.os.Build.VERSION.SDK_INT + "), because of " + th2);
                            return;
                        }
                    }
                    return;
                }
                com.liulishuo.okdownload.core.Util.w("DownloadUriOutputStream", "It can't pre-allocate length(" + j + ") on the sdk version(" + android.os.Build.VERSION.SDK_INT + "), because of " + th);
                return;
            }
        }
        com.liulishuo.okdownload.core.Util.w("DownloadUriOutputStream", "It can't pre-allocate length(" + j + ") on the sdk version(" + android.os.Build.VERSION.SDK_INT + ")");
    }

    public static class Factory implements com.liulishuo.okdownload.core.file.DownloadOutputStream.Factory {
        @Override // com.liulishuo.okdownload.core.file.DownloadOutputStream.Factory
        public boolean supportSeek() {
            return true;
        }

        @Override // com.liulishuo.okdownload.core.file.DownloadOutputStream.Factory
        public com.liulishuo.okdownload.core.file.DownloadOutputStream create(android.content.Context context, java.io.File file, int i) throws java.io.FileNotFoundException {
            return new com.liulishuo.okdownload.core.file.DownloadUriOutputStream(context, android.net.Uri.fromFile(file), i);
        }

        @Override // com.liulishuo.okdownload.core.file.DownloadOutputStream.Factory
        public com.liulishuo.okdownload.core.file.DownloadOutputStream create(android.content.Context context, android.net.Uri uri, int i) throws java.io.FileNotFoundException {
            return new com.liulishuo.okdownload.core.file.DownloadUriOutputStream(context, uri, i);
        }
    }
}
