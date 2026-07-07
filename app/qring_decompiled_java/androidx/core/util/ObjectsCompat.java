package androidx.core.util;

/* loaded from: classes.dex */
public class ObjectsCompat {
    private ObjectsCompat() {
    }

    public static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return java.util.Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hashCode(java.lang.Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static int hash(java.lang.Object... objArr) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return java.util.Objects.hash(objArr);
        }
        return java.util.Arrays.hashCode(objArr);
    }

    public static java.lang.String toString(java.lang.Object obj, java.lang.String str) {
        return obj != null ? obj.toString() : str;
    }

    public static <T> T requireNonNull(T t) {
        java.util.Objects.requireNonNull(t);
        return t;
    }

    public static <T> T requireNonNull(T t, java.lang.String str) {
        java.util.Objects.requireNonNull(t, str);
        return t;
    }
}
