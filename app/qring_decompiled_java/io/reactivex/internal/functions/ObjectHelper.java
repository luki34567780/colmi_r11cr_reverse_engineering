package io.reactivex.internal.functions;

/* loaded from: classes3.dex */
public final class ObjectHelper {
    static final io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> EQUALS = new io.reactivex.internal.functions.ObjectHelper.BiObjectPredicate();

    public static int compare(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int compare(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    private ObjectHelper() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> T requireNonNull(T t, java.lang.String str) {
        java.util.Objects.requireNonNull(t, str);
        return t;
    }

    public static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hashCode(java.lang.Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static <T> io.reactivex.functions.BiPredicate<T, T> equalsPredicate() {
        return (io.reactivex.functions.BiPredicate<T, T>) EQUALS;
    }

    public static int verifyPositive(int i, java.lang.String str) {
        if (i > 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException(str + " > 0 required but it was " + i);
    }

    public static long verifyPositive(long j, java.lang.String str) {
        if (j > 0) {
            return j;
        }
        throw new java.lang.IllegalArgumentException(str + " > 0 required but it was " + j);
    }

    static final class BiObjectPredicate implements io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> {
        BiObjectPredicate() {
        }

        @Override // io.reactivex.functions.BiPredicate
        public boolean test(java.lang.Object obj, java.lang.Object obj2) {
            return io.reactivex.internal.functions.ObjectHelper.equals(obj, obj2);
        }
    }

    @java.lang.Deprecated
    public static long requireNonNull(long j, java.lang.String str) {
        throw new java.lang.InternalError("Null check on a primitive: " + str);
    }
}
