package top.zibin.luban.io;

/* loaded from: classes3.dex */
public final class IntegerArrayAdapter implements top.zibin.luban.io.ArrayAdapterInterface<int[]> {
    private static final java.lang.String TAG = "IntegerArrayPool";

    @Override // top.zibin.luban.io.ArrayAdapterInterface
    public int getElementSizeInBytes() {
        return 4;
    }

    @Override // top.zibin.luban.io.ArrayAdapterInterface
    public java.lang.String getTag() {
        return TAG;
    }

    @Override // top.zibin.luban.io.ArrayAdapterInterface
    public int getArrayLength(int[] iArr) {
        return iArr.length;
    }

    @Override // top.zibin.luban.io.ArrayAdapterInterface
    public int[] newArray(int i) {
        return new int[i];
    }
}
