package com.oudmon.ble.base.communication;

/* loaded from: /tmp/dex/classes2.dex */
public class CompressUtils {
    private static final java.lang.String TAG = "Jxr35";

    public static byte[] compress(byte[] bArr) {
        try {
            byte[] bArr2 = new byte[bArr.length + (bArr.length / 16) + 64 + 3];
            int[] iArr = new int[com.liulishuo.okdownload.DownloadTask.Builder.DEFAULT_SYNC_BUFFER_SIZE];
            org.jvcompress.util.MInt mInt = new org.jvcompress.util.MInt();
            org.jvcompress.lzo.MiniLZO.lzo1x_1_compress(bArr, bArr.length, bArr2, mInt, iArr);
            return java.util.Arrays.copyOfRange(bArr2, 0, mInt.v);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            android.util.Log.i(TAG, "compress.. FileNotFoundException");
            return new byte[0];
        }
    }
}
