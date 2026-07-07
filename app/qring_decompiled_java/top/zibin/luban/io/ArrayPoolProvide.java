package top.zibin.luban.io;

/* loaded from: classes3.dex */
public class ArrayPoolProvide {
    private static top.zibin.luban.io.ArrayPoolProvide mInstance;
    private final java.util.HashSet<java.lang.String> keyCache = new java.util.HashSet<>();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, top.zibin.luban.io.BufferedInputStreamWrap> bufferedLruCache = new java.util.concurrent.ConcurrentHashMap<>();
    private final top.zibin.luban.io.LruArrayPool arrayPool = new top.zibin.luban.io.LruArrayPool(4194304);

    public byte[] get(int i) {
        return (byte[]) this.arrayPool.get(i, byte[].class);
    }

    public void put(byte[] bArr) {
        this.arrayPool.put(bArr);
    }

    public java.io.InputStream openInputStream(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        try {
            try {
                top.zibin.luban.io.BufferedInputStreamWrap bufferedInputStreamWrap = this.bufferedLruCache.get(uri.toString());
                if (bufferedInputStreamWrap != null) {
                    bufferedInputStreamWrap.reset();
                } else {
                    bufferedInputStreamWrap = wrapInputStream(contentResolver, uri);
                }
                return bufferedInputStreamWrap;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return wrapInputStream(contentResolver, uri);
            }
        } catch (java.lang.Exception unused) {
            return contentResolver.openInputStream(uri);
        }
    }

    public java.io.InputStream openInputStream(java.lang.String str) {
        try {
            top.zibin.luban.io.BufferedInputStreamWrap bufferedInputStreamWrap = this.bufferedLruCache.get(str);
            if (bufferedInputStreamWrap != null) {
                bufferedInputStreamWrap.reset();
            } else {
                bufferedInputStreamWrap = wrapInputStream(str);
            }
            return bufferedInputStreamWrap;
        } catch (java.lang.Exception unused) {
            return wrapInputStream(str);
        }
    }

    private top.zibin.luban.io.BufferedInputStreamWrap wrapInputStream(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        top.zibin.luban.io.BufferedInputStreamWrap bufferedInputStreamWrap;
        top.zibin.luban.io.BufferedInputStreamWrap bufferedInputStreamWrap2 = null;
        try {
            bufferedInputStreamWrap = new top.zibin.luban.io.BufferedInputStreamWrap(contentResolver.openInputStream(uri));
        } catch (java.lang.Exception e) {
            e = e;
        }
        try {
            int available = bufferedInputStreamWrap.available();
            if (available <= 0) {
                available = 8388608;
            }
            bufferedInputStreamWrap.mark(available);
            this.bufferedLruCache.put(uri.toString(), bufferedInputStreamWrap);
            this.keyCache.add(uri.toString());
            return bufferedInputStreamWrap;
        } catch (java.lang.Exception e2) {
            e = e2;
            bufferedInputStreamWrap2 = bufferedInputStreamWrap;
            e.printStackTrace();
            return bufferedInputStreamWrap2;
        }
    }

    private top.zibin.luban.io.BufferedInputStreamWrap wrapInputStream(java.lang.String str) {
        top.zibin.luban.io.BufferedInputStreamWrap bufferedInputStreamWrap;
        top.zibin.luban.io.BufferedInputStreamWrap bufferedInputStreamWrap2 = null;
        try {
            bufferedInputStreamWrap = new top.zibin.luban.io.BufferedInputStreamWrap(new java.io.FileInputStream(str));
        } catch (java.lang.Exception e) {
            e = e;
        }
        try {
            int available = bufferedInputStreamWrap.available();
            if (available <= 0) {
                available = 8388608;
            }
            bufferedInputStreamWrap.mark(available);
            this.bufferedLruCache.put(str, bufferedInputStreamWrap);
            this.keyCache.add(str);
            return bufferedInputStreamWrap;
        } catch (java.lang.Exception e2) {
            e = e2;
            bufferedInputStreamWrap2 = bufferedInputStreamWrap;
            e.printStackTrace();
            return bufferedInputStreamWrap2;
        }
    }

    public void clearMemory() {
        java.util.Iterator<java.lang.String> it = this.keyCache.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            close(this.bufferedLruCache.get(next));
            this.bufferedLruCache.remove(next);
        }
        this.keyCache.clear();
        this.arrayPool.clearMemory();
    }

    public static top.zibin.luban.io.ArrayPoolProvide getInstance() {
        if (mInstance == null) {
            synchronized (top.zibin.luban.io.ArrayPoolProvide.class) {
                if (mInstance == null) {
                    mInstance = new top.zibin.luban.io.ArrayPoolProvide();
                }
            }
        }
        return mInstance;
    }

    public static void close(java.io.Closeable closeable) {
        if (closeable instanceof java.io.Closeable) {
            try {
                closeable.close();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
