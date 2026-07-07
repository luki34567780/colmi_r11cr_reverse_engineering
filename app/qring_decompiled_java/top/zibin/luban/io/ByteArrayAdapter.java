package top.zibin.luban.io;

/* loaded from: classes3.dex */
public final class ByteArrayAdapter implements top.zibin.luban.io.ArrayAdapterInterface<byte[]> {
    private static final java.lang.String TAG = "ByteArrayPool";

    @Override // top.zibin.luban.io.ArrayAdapterInterface
    public int getElementSizeInBytes() {
        return 1;
    }

    @Override // top.zibin.luban.io.ArrayAdapterInterface
    public java.lang.String getTag() {
        return TAG;
    }

    @Override // top.zibin.luban.io.ArrayAdapterInterface
    public int getArrayLength(byte[] bArr) {
        return bArr.length;
    }

    @Override // top.zibin.luban.io.ArrayAdapterInterface
    public byte[] newArray(int i) {
        return new byte[i];
    }
}
