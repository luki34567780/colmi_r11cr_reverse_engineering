package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class CacheDoubleStaticUtils {
    private static com.blankj.utilcode.util.CacheDoubleUtils sDefaultCacheDoubleUtils;

    public static void setDefaultCacheDoubleUtils(com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        sDefaultCacheDoubleUtils = cacheDoubleUtils;
    }

    public static void put(java.lang.String str, byte[] bArr) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, bArr, getDefaultCacheDoubleUtils());
    }

    public static void put(java.lang.String str, byte[] bArr, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, bArr, i, getDefaultCacheDoubleUtils());
    }

    public static byte[] getBytes(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getBytes(str, getDefaultCacheDoubleUtils());
    }

    public static byte[] getBytes(java.lang.String str, byte[] bArr) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getBytes(str, bArr, getDefaultCacheDoubleUtils());
    }

    public static void put(java.lang.String str, java.lang.String str2) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, str2, getDefaultCacheDoubleUtils());
    }

    public static void put(java.lang.String str, java.lang.String str2, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, str2, i, getDefaultCacheDoubleUtils());
    }

    public static java.lang.String getString(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getString(str, getDefaultCacheDoubleUtils());
    }

    public static java.lang.String getString(java.lang.String str, java.lang.String str2) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getString(str, str2, getDefaultCacheDoubleUtils());
    }

    public static void put(java.lang.String str, org.json.JSONObject jSONObject) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, jSONObject, getDefaultCacheDoubleUtils());
    }

    public static void put(java.lang.String str, org.json.JSONObject jSONObject, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, jSONObject, i, getDefaultCacheDoubleUtils());
    }

    public static org.json.JSONObject getJSONObject(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getJSONObject(str, getDefaultCacheDoubleUtils());
    }

    public static org.json.JSONObject getJSONObject(java.lang.String str, org.json.JSONObject jSONObject) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getJSONObject(str, jSONObject, getDefaultCacheDoubleUtils());
    }

    public static void put(java.lang.String str, org.json.JSONArray jSONArray) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, jSONArray, getDefaultCacheDoubleUtils());
    }

    public static void put(java.lang.String str, org.json.JSONArray jSONArray, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, jSONArray, i, getDefaultCacheDoubleUtils());
    }

    public static org.json.JSONArray getJSONArray(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getJSONArray(str, getDefaultCacheDoubleUtils());
    }

    public static org.json.JSONArray getJSONArray(java.lang.String str, org.json.JSONArray jSONArray) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getJSONArray(str, jSONArray, getDefaultCacheDoubleUtils());
    }

    public static void put(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, bitmap, getDefaultCacheDoubleUtils());
    }

    public static void put(java.lang.String str, android.graphics.Bitmap bitmap, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, bitmap, i, getDefaultCacheDoubleUtils());
    }

    public static android.graphics.Bitmap getBitmap(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getBitmap(str, getDefaultCacheDoubleUtils());
    }

    public static android.graphics.Bitmap getBitmap(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getBitmap(str, bitmap, getDefaultCacheDoubleUtils());
    }

    public static void put(java.lang.String str, android.graphics.drawable.Drawable drawable) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, drawable, getDefaultCacheDoubleUtils());
    }

    public static void put(java.lang.String str, android.graphics.drawable.Drawable drawable, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, drawable, i, getDefaultCacheDoubleUtils());
    }

    public static android.graphics.drawable.Drawable getDrawable(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getDrawable(str, getDefaultCacheDoubleUtils());
    }

    public static android.graphics.drawable.Drawable getDrawable(java.lang.String str, android.graphics.drawable.Drawable drawable) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getDrawable(str, drawable, getDefaultCacheDoubleUtils());
    }

    public static void put(java.lang.String str, android.os.Parcelable parcelable) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, parcelable, getDefaultCacheDoubleUtils());
    }

    public static void put(java.lang.String str, android.os.Parcelable parcelable, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, parcelable, i, getDefaultCacheDoubleUtils());
    }

    public static <T> T getParcelable(java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(creator, "Argument 'creator' of type Parcelable.Creator<T> (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return (T) getParcelable(str, (android.os.Parcelable.Creator) creator, getDefaultCacheDoubleUtils());
    }

    public static <T> T getParcelable(java.lang.String str, android.os.Parcelable.Creator<T> creator, T t) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(creator, "Argument 'creator' of type Parcelable.Creator<T> (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return (T) getParcelable(str, creator, t, getDefaultCacheDoubleUtils());
    }

    public static void put(java.lang.String str, java.io.Serializable serializable) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, serializable, getDefaultCacheDoubleUtils());
    }

    public static void put(java.lang.String str, java.io.Serializable serializable, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, serializable, i, getDefaultCacheDoubleUtils());
    }

    public static java.lang.Object getSerializable(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getSerializable(str, getDefaultCacheDoubleUtils());
    }

    public static java.lang.Object getSerializable(java.lang.String str, java.lang.Object obj) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getSerializable(str, obj, getDefaultCacheDoubleUtils());
    }

    public static long getCacheDiskSize() {
        return getCacheDiskSize(getDefaultCacheDoubleUtils());
    }

    public static int getCacheDiskCount() {
        return getCacheDiskCount(getDefaultCacheDoubleUtils());
    }

    public static int getCacheMemoryCount() {
        return getCacheMemoryCount(getDefaultCacheDoubleUtils());
    }

    public static void remove(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        remove(str, getDefaultCacheDoubleUtils());
    }

    public static void clear() {
        clear(getDefaultCacheDoubleUtils());
    }

    public static void put(java.lang.String str, byte[] bArr, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.put(str, bArr);
    }

    public static void put(java.lang.String str, byte[] bArr, int i, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.put(str, bArr, i);
    }

    public static byte[] getBytes(java.lang.String str, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDoubleUtils.getBytes(str);
    }

    public static byte[] getBytes(java.lang.String str, byte[] bArr, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDoubleUtils.getBytes(str, bArr);
    }

    public static void put(java.lang.String str, java.lang.String str2, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.put(str, str2);
    }

    public static void put(java.lang.String str, java.lang.String str2, int i, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.put(str, str2, i);
    }

    public static java.lang.String getString(java.lang.String str, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDoubleUtils.getString(str);
    }

    public static java.lang.String getString(java.lang.String str, java.lang.String str2, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDoubleUtils.getString(str, str2);
    }

    public static void put(java.lang.String str, org.json.JSONObject jSONObject, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.put(str, jSONObject);
    }

    public static void put(java.lang.String str, org.json.JSONObject jSONObject, int i, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.put(str, jSONObject, i);
    }

    public static org.json.JSONObject getJSONObject(java.lang.String str, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDoubleUtils.getJSONObject(str);
    }

    public static org.json.JSONObject getJSONObject(java.lang.String str, org.json.JSONObject jSONObject, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDoubleUtils.getJSONObject(str, jSONObject);
    }

    public static void put(java.lang.String str, org.json.JSONArray jSONArray, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.put(str, jSONArray);
    }

    public static void put(java.lang.String str, org.json.JSONArray jSONArray, int i, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.put(str, jSONArray, i);
    }

    public static org.json.JSONArray getJSONArray(java.lang.String str, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDoubleUtils.getJSONArray(str);
    }

    public static org.json.JSONArray getJSONArray(java.lang.String str, org.json.JSONArray jSONArray, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDoubleUtils.getJSONArray(str, jSONArray);
    }

    public static void put(java.lang.String str, android.graphics.Bitmap bitmap, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.put(str, bitmap);
    }

    public static void put(java.lang.String str, android.graphics.Bitmap bitmap, int i, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.put(str, bitmap, i);
    }

    public static android.graphics.Bitmap getBitmap(java.lang.String str, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDoubleUtils.getBitmap(str);
    }

    public static android.graphics.Bitmap getBitmap(java.lang.String str, android.graphics.Bitmap bitmap, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDoubleUtils.getBitmap(str, bitmap);
    }

    public static void put(java.lang.String str, android.graphics.drawable.Drawable drawable, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.put(str, drawable);
    }

    public static void put(java.lang.String str, android.graphics.drawable.Drawable drawable, int i, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.put(str, drawable, i);
    }

    public static android.graphics.drawable.Drawable getDrawable(java.lang.String str, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDoubleUtils.getDrawable(str);
    }

    public static android.graphics.drawable.Drawable getDrawable(java.lang.String str, android.graphics.drawable.Drawable drawable, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDoubleUtils.getDrawable(str, drawable);
    }

    public static void put(java.lang.String str, android.os.Parcelable parcelable, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.put(str, parcelable);
    }

    public static void put(java.lang.String str, android.os.Parcelable parcelable, int i, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.put(str, parcelable, i);
    }

    public static <T> T getParcelable(java.lang.String str, android.os.Parcelable.Creator<T> creator, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(creator, "Argument 'creator' of type Parcelable.Creator<T> (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return (T) cacheDoubleUtils.getParcelable(str, creator);
    }

    public static <T> T getParcelable(java.lang.String str, android.os.Parcelable.Creator<T> creator, T t, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(creator, "Argument 'creator' of type Parcelable.Creator<T> (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return (T) cacheDoubleUtils.getParcelable(str, creator, t);
    }

    public static void put(java.lang.String str, java.io.Serializable serializable, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.put(str, serializable);
    }

    public static void put(java.lang.String str, java.io.Serializable serializable, int i, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.put(str, serializable, i);
    }

    public static java.lang.Object getSerializable(java.lang.String str, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDoubleUtils.getSerializable(str);
    }

    public static java.lang.Object getSerializable(java.lang.String str, java.lang.Object obj, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDoubleUtils.getSerializable(str, obj);
    }

    public static long getCacheDiskSize(com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDoubleUtils.getCacheDiskSize();
    }

    public static int getCacheDiskCount(com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDoubleUtils.getCacheDiskCount();
    }

    public static int getCacheMemoryCount(com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDoubleUtils.getCacheMemoryCount();
    }

    public static void remove(java.lang.String str, com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.remove(str);
    }

    public static void clear(com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils) {
        java.util.Objects.requireNonNull(cacheDoubleUtils, "Argument 'cacheDoubleUtils' of type CacheDoubleUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDoubleUtils.clear();
    }

    private static com.blankj.utilcode.util.CacheDoubleUtils getDefaultCacheDoubleUtils() {
        com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils = sDefaultCacheDoubleUtils;
        return cacheDoubleUtils != null ? cacheDoubleUtils : com.blankj.utilcode.util.CacheDoubleUtils.getInstance();
    }
}
