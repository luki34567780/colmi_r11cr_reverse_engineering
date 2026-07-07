package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class ObjectUtils {
    public static <T> T getOrDefault(T t, T t2) {
        return t == null ? t2 : t;
    }

    private ObjectUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean isEmpty(java.lang.Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj.getClass().isArray() && java.lang.reflect.Array.getLength(obj) == 0) {
            return true;
        }
        if ((obj instanceof java.lang.CharSequence) && obj.toString().length() == 0) {
            return true;
        }
        if ((obj instanceof java.util.Collection) && ((java.util.Collection) obj).isEmpty()) {
            return true;
        }
        if ((obj instanceof java.util.Map) && ((java.util.Map) obj).isEmpty()) {
            return true;
        }
        if ((obj instanceof androidx.collection.SimpleArrayMap) && ((androidx.collection.SimpleArrayMap) obj).isEmpty()) {
            return true;
        }
        if ((obj instanceof android.util.SparseArray) && ((android.util.SparseArray) obj).size() == 0) {
            return true;
        }
        if ((obj instanceof android.util.SparseBooleanArray) && ((android.util.SparseBooleanArray) obj).size() == 0) {
            return true;
        }
        if ((obj instanceof android.util.SparseIntArray) && ((android.util.SparseIntArray) obj).size() == 0) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT >= 18 && (obj instanceof android.util.SparseLongArray) && ((android.util.SparseLongArray) obj).size() == 0) {
            return true;
        }
        if ((obj instanceof androidx.collection.LongSparseArray) && ((androidx.collection.LongSparseArray) obj).size() == 0) {
            return true;
        }
        return android.os.Build.VERSION.SDK_INT >= 16 && (obj instanceof android.util.LongSparseArray) && ((android.util.LongSparseArray) obj).size() == 0;
    }

    public static boolean isEmpty(java.lang.CharSequence charSequence) {
        return charSequence == null || charSequence.toString().length() == 0;
    }

    public static boolean isEmpty(java.util.Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isEmpty(java.util.Map map) {
        return map == null || map.isEmpty();
    }

    public static boolean isEmpty(androidx.collection.SimpleArrayMap simpleArrayMap) {
        return simpleArrayMap == null || simpleArrayMap.isEmpty();
    }

    public static boolean isEmpty(android.util.SparseArray sparseArray) {
        return sparseArray == null || sparseArray.size() == 0;
    }

    public static boolean isEmpty(android.util.SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray == null || sparseBooleanArray.size() == 0;
    }

    public static boolean isEmpty(android.util.SparseIntArray sparseIntArray) {
        return sparseIntArray == null || sparseIntArray.size() == 0;
    }

    public static boolean isEmpty(androidx.collection.LongSparseArray longSparseArray) {
        return longSparseArray == null || longSparseArray.size() == 0;
    }

    public static boolean isEmpty(android.util.SparseLongArray sparseLongArray) {
        return sparseLongArray == null || sparseLongArray.size() == 0;
    }

    public static boolean isEmpty(android.util.LongSparseArray longSparseArray) {
        return longSparseArray == null || longSparseArray.size() == 0;
    }

    public static boolean isNotEmpty(java.lang.Object obj) {
        return !isEmpty(obj);
    }

    public static boolean isNotEmpty(java.lang.CharSequence charSequence) {
        return !isEmpty(charSequence);
    }

    public static boolean isNotEmpty(java.util.Collection collection) {
        return !isEmpty(collection);
    }

    public static boolean isNotEmpty(java.util.Map map) {
        return !isEmpty(map);
    }

    public static boolean isNotEmpty(androidx.collection.SimpleArrayMap simpleArrayMap) {
        return !isEmpty(simpleArrayMap);
    }

    public static boolean isNotEmpty(android.util.SparseArray sparseArray) {
        return !isEmpty(sparseArray);
    }

    public static boolean isNotEmpty(android.util.SparseBooleanArray sparseBooleanArray) {
        return !isEmpty(sparseBooleanArray);
    }

    public static boolean isNotEmpty(android.util.SparseIntArray sparseIntArray) {
        return !isEmpty(sparseIntArray);
    }

    public static boolean isNotEmpty(androidx.collection.LongSparseArray longSparseArray) {
        return !isEmpty(longSparseArray);
    }

    public static boolean isNotEmpty(android.util.SparseLongArray sparseLongArray) {
        return !isEmpty(sparseLongArray);
    }

    public static boolean isNotEmpty(android.util.LongSparseArray longSparseArray) {
        return !isEmpty(longSparseArray);
    }

    public static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> int compare(T t, T t2, java.util.Comparator<? super T> comparator) {
        java.util.Objects.requireNonNull(comparator, "Argument 'c' of type Comparator<? super T> (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        if (t == t2) {
            return 0;
        }
        return comparator.compare(t, t2);
    }

    public static <T> T requireNonNull(T t) {
        java.util.Objects.requireNonNull(t);
        return t;
    }

    public static <T> T requireNonNull(T t, java.lang.String str) {
        java.util.Objects.requireNonNull(t, str);
        return t;
    }

    public static void requireNonNulls(java.lang.Object... objArr) {
        java.util.Objects.requireNonNull(objArr);
        for (java.lang.Object obj : objArr) {
            java.util.Objects.requireNonNull(obj);
        }
    }

    public static java.lang.String toString(java.lang.Object obj) {
        return java.lang.String.valueOf(obj);
    }

    public static java.lang.String toString(java.lang.Object obj, java.lang.String str) {
        return obj != null ? obj.toString() : str;
    }

    public static int hashCode(java.lang.Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static int hashCodes(java.lang.Object... objArr) {
        return java.util.Arrays.hashCode(objArr);
    }
}
