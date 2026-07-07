package androidx.room.util;

/* loaded from: classes.dex */
public class SneakyThrow {
    public static void reThrow(java.lang.Exception exc) {
        sneakyThrow(exc);
    }

    private static <E extends java.lang.Throwable> void sneakyThrow(java.lang.Throwable th) throws java.lang.Throwable {
        throw th;
    }

    private SneakyThrow() {
    }
}
