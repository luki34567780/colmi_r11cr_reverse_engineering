package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class SPStaticUtils {
    private static com.blankj.utilcode.util.SPUtils sDefaultSPUtils;

    public static void setDefaultSPUtils(com.blankj.utilcode.util.SPUtils sPUtils) {
        sDefaultSPUtils = sPUtils;
    }

    public static void put(java.lang.String str, java.lang.String str2) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, str2, getDefaultSPUtils());
    }

    public static void put(java.lang.String str, java.lang.String str2, boolean z) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, str2, z, getDefaultSPUtils());
    }

    public static java.lang.String getString(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getString(str, getDefaultSPUtils());
    }

    public static java.lang.String getString(java.lang.String str, java.lang.String str2) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getString(str, str2, getDefaultSPUtils());
    }

    public static void put(java.lang.String str, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, i, getDefaultSPUtils());
    }

    public static void put(java.lang.String str, int i, boolean z) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, i, z, getDefaultSPUtils());
    }

    public static int getInt(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getInt(str, getDefaultSPUtils());
    }

    public static int getInt(java.lang.String str, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getInt(str, i, getDefaultSPUtils());
    }

    public static void put(java.lang.String str, long j) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, j, getDefaultSPUtils());
    }

    public static void put(java.lang.String str, long j, boolean z) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, j, z, getDefaultSPUtils());
    }

    public static long getLong(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getLong(str, getDefaultSPUtils());
    }

    public static long getLong(java.lang.String str, long j) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getLong(str, j, getDefaultSPUtils());
    }

    public static void put(java.lang.String str, float f) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, f, getDefaultSPUtils());
    }

    public static void put(java.lang.String str, float f, boolean z) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, f, z, getDefaultSPUtils());
    }

    public static float getFloat(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getFloat(str, getDefaultSPUtils());
    }

    public static float getFloat(java.lang.String str, float f) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getFloat(str, f, getDefaultSPUtils());
    }

    public static void put(java.lang.String str, boolean z) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, z, getDefaultSPUtils());
    }

    public static void put(java.lang.String str, boolean z, boolean z2) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, z, z2, getDefaultSPUtils());
    }

    public static boolean getBoolean(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getBoolean(str, getDefaultSPUtils());
    }

    public static boolean getBoolean(java.lang.String str, boolean z) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getBoolean(str, z, getDefaultSPUtils());
    }

    public static void put(java.lang.String str, java.util.Set<java.lang.String> set) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, set, getDefaultSPUtils());
    }

    public static void put(java.lang.String str, java.util.Set<java.lang.String> set, boolean z) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, set, z, getDefaultSPUtils());
    }

    public static java.util.Set<java.lang.String> getStringSet(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getStringSet(str, getDefaultSPUtils());
    }

    public static java.util.Set<java.lang.String> getStringSet(java.lang.String str, java.util.Set<java.lang.String> set) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getStringSet(str, set, getDefaultSPUtils());
    }

    public static java.util.Map<java.lang.String, ?> getAll() {
        return getAll(getDefaultSPUtils());
    }

    public static boolean contains(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return contains(str, getDefaultSPUtils());
    }

    public static void remove(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        remove(str, getDefaultSPUtils());
    }

    public static void remove(java.lang.String str, boolean z) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        remove(str, z, getDefaultSPUtils());
    }

    public static void clear() {
        clear(getDefaultSPUtils());
    }

    public static void clear(boolean z) {
        clear(z, getDefaultSPUtils());
    }

    public static void put(java.lang.String str, java.lang.String str2, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        sPUtils.put(str, str2);
    }

    public static void put(java.lang.String str, java.lang.String str2, boolean z, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        sPUtils.put(str, str2, z);
    }

    public static java.lang.String getString(java.lang.String str, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return sPUtils.getString(str);
    }

    public static java.lang.String getString(java.lang.String str, java.lang.String str2, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return sPUtils.getString(str, str2);
    }

    public static void put(java.lang.String str, int i, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        sPUtils.put(str, i);
    }

    public static void put(java.lang.String str, int i, boolean z, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        sPUtils.put(str, i, z);
    }

    public static int getInt(java.lang.String str, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return sPUtils.getInt(str);
    }

    public static int getInt(java.lang.String str, int i, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return sPUtils.getInt(str, i);
    }

    public static void put(java.lang.String str, long j, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        sPUtils.put(str, j);
    }

    public static void put(java.lang.String str, long j, boolean z, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        sPUtils.put(str, j, z);
    }

    public static long getLong(java.lang.String str, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return sPUtils.getLong(str);
    }

    public static long getLong(java.lang.String str, long j, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return sPUtils.getLong(str, j);
    }

    public static void put(java.lang.String str, float f, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        sPUtils.put(str, f);
    }

    public static void put(java.lang.String str, float f, boolean z, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        sPUtils.put(str, f, z);
    }

    public static float getFloat(java.lang.String str, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return sPUtils.getFloat(str);
    }

    public static float getFloat(java.lang.String str, float f, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return sPUtils.getFloat(str, f);
    }

    public static void put(java.lang.String str, boolean z, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        sPUtils.put(str, z);
    }

    public static void put(java.lang.String str, boolean z, boolean z2, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        sPUtils.put(str, z, z2);
    }

    public static boolean getBoolean(java.lang.String str, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return sPUtils.getBoolean(str);
    }

    public static boolean getBoolean(java.lang.String str, boolean z, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return sPUtils.getBoolean(str, z);
    }

    public static void put(java.lang.String str, java.util.Set<java.lang.String> set, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        sPUtils.put(str, set);
    }

    public static void put(java.lang.String str, java.util.Set<java.lang.String> set, boolean z, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        sPUtils.put(str, set, z);
    }

    public static java.util.Set<java.lang.String> getStringSet(java.lang.String str, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return sPUtils.getStringSet(str);
    }

    public static java.util.Set<java.lang.String> getStringSet(java.lang.String str, java.util.Set<java.lang.String> set, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return sPUtils.getStringSet(str, set);
    }

    public static java.util.Map<java.lang.String, ?> getAll(com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return sPUtils.getAll();
    }

    public static boolean contains(java.lang.String str, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return sPUtils.contains(str);
    }

    public static void remove(java.lang.String str, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        sPUtils.remove(str);
    }

    public static void remove(java.lang.String str, boolean z, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        sPUtils.remove(str, z);
    }

    public static void clear(com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        sPUtils.clear();
    }

    public static void clear(boolean z, com.blankj.utilcode.util.SPUtils sPUtils) {
        java.util.Objects.requireNonNull(sPUtils, "Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        sPUtils.clear(z);
    }

    private static com.blankj.utilcode.util.SPUtils getDefaultSPUtils() {
        com.blankj.utilcode.util.SPUtils sPUtils = sDefaultSPUtils;
        return sPUtils != null ? sPUtils : com.blankj.utilcode.util.SPUtils.getInstance();
    }
}
