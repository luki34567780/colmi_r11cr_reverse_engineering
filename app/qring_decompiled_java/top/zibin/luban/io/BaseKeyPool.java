package top.zibin.luban.io;

/* loaded from: classes3.dex */
abstract class BaseKeyPool<T extends top.zibin.luban.io.PoolAble> {
    private static final int MAX_SIZE = 20;
    private final java.util.Queue<T> keyPool = createQueue(20);

    abstract T create();

    BaseKeyPool() {
    }

    T get() {
        T poll = this.keyPool.poll();
        return poll == null ? create() : poll;
    }

    public void offer(T t) {
        if (this.keyPool.size() < 20) {
            this.keyPool.offer(t);
        }
    }

    public static <T> java.util.Queue<T> createQueue(int i) {
        return new java.util.ArrayDeque(i);
    }
}
