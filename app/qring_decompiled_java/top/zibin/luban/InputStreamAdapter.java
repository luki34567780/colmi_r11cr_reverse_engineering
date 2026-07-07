package top.zibin.luban;

/* loaded from: classes3.dex */
public abstract class InputStreamAdapter implements top.zibin.luban.InputStreamProvider {
    public abstract java.io.InputStream openInternal() throws java.io.IOException;

    @Override // top.zibin.luban.InputStreamProvider
    public java.io.InputStream open() throws java.io.IOException {
        return openInternal();
    }

    @Override // top.zibin.luban.InputStreamProvider
    public void close() {
        top.zibin.luban.io.ArrayPoolProvide.getInstance().clearMemory();
    }
}
