package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public final class IOUtils {
    private IOUtils() {
    }

    public static void closeQuietly(@javax.annotation.Nullable android.os.ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    @java.lang.Deprecated
    public static long copyStream(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        return copyStream(inputStream, outputStream, false, com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2);
    }

    public static boolean isGzipByteBuffer(byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @java.lang.Deprecated
    public static byte[] readInputStreamFully(java.io.InputStream inputStream) throws java.io.IOException {
        return readInputStreamFully(inputStream, true);
    }

    @java.lang.Deprecated
    public static byte[] toByteArray(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(inputStream);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(byteArrayOutputStream);
        byte[] bArr = new byte[com.liulishuo.okdownload.DownloadTask.Builder.DEFAULT_READ_BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static void closeQuietly(@javax.annotation.Nullable java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    @java.lang.Deprecated
    public static long copyStream(java.io.InputStream inputStream, java.io.OutputStream outputStream, boolean z, int i) throws java.io.IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += read;
                outputStream.write(bArr, 0, read);
            } catch (java.lang.Throwable th) {
                if (z) {
                    closeQuietly(inputStream);
                    closeQuietly(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            closeQuietly(inputStream);
            closeQuietly(outputStream);
        }
        return j;
    }

    @java.lang.Deprecated
    public static byte[] readInputStreamFully(java.io.InputStream inputStream, boolean z) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream, z, com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2);
        return byteArrayOutputStream.toByteArray();
    }
}
