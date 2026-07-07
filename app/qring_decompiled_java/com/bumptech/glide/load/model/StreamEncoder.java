package com.bumptech.glide.load.model;

/* loaded from: /tmp/dex/classes2.dex */
public class StreamEncoder implements com.bumptech.glide.load.Encoder<java.io.InputStream> {
    private static final java.lang.String TAG = "StreamEncoder";
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;

    public StreamEncoder(com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool) {
        this.byteArrayPool = arrayPool;
    }

    public boolean encode(java.io.InputStream inputStream, java.io.File file, com.bumptech.glide.load.Options options) {
        byte[] bArr = (byte[]) this.byteArrayPool.get(com.liulishuo.okdownload.DownloadTask.Builder.DEFAULT_SYNC_BUFFER_SIZE, byte[].class);
        boolean z = false;
        java.io.FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        } catch (java.io.IOException e) {
                            e = e;
                            fileOutputStream = fileOutputStream2;
                            if (android.util.Log.isLoggable(TAG, 3)) {
                                android.util.Log.d(TAG, "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            this.byteArrayPool.put(bArr);
                            return z;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (java.io.IOException unused) {
                                }
                            }
                            this.byteArrayPool.put(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream2.close();
                    z = true;
                    fileOutputStream2.close();
                } catch (java.io.IOException unused2) {
                }
            } catch (java.io.IOException e2) {
                e = e2;
            }
            this.byteArrayPool.put(bArr);
            return z;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
