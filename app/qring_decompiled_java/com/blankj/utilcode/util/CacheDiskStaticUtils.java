package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class CacheDiskStaticUtils {
    private static com.blankj.utilcode.util.CacheDiskUtils sDefaultCacheDiskUtils;

    public static void setDefaultCacheDiskUtils(com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        sDefaultCacheDiskUtils = cacheDiskUtils;
    }

    public static void put(java.lang.String str, byte[] bArr) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, bArr, getDefaultCacheDiskUtils());
    }

    public static void put(java.lang.String str, byte[] bArr, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, bArr, i, getDefaultCacheDiskUtils());
    }

    public static byte[] getBytes(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getBytes(str, getDefaultCacheDiskUtils());
    }

    public static byte[] getBytes(java.lang.String str, byte[] bArr) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getBytes(str, bArr, getDefaultCacheDiskUtils());
    }

    public static void put(java.lang.String str, java.lang.String str2) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, str2, getDefaultCacheDiskUtils());
    }

    public static void put(java.lang.String str, java.lang.String str2, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, str2, i, getDefaultCacheDiskUtils());
    }

    public static java.lang.String getString(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getString(str, getDefaultCacheDiskUtils());
    }

    public static java.lang.String getString(java.lang.String str, java.lang.String str2) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getString(str, str2, getDefaultCacheDiskUtils());
    }

    public static void put(java.lang.String str, org.json.JSONObject jSONObject) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, jSONObject, getDefaultCacheDiskUtils());
    }

    public static void put(java.lang.String str, org.json.JSONObject jSONObject, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, jSONObject, i, getDefaultCacheDiskUtils());
    }

    public static org.json.JSONObject getJSONObject(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getJSONObject(str, getDefaultCacheDiskUtils());
    }

    public static org.json.JSONObject getJSONObject(java.lang.String str, org.json.JSONObject jSONObject) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getJSONObject(str, jSONObject, getDefaultCacheDiskUtils());
    }

    public static void put(java.lang.String str, org.json.JSONArray jSONArray) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, jSONArray, getDefaultCacheDiskUtils());
    }

    public static void put(java.lang.String str, org.json.JSONArray jSONArray, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, jSONArray, i, getDefaultCacheDiskUtils());
    }

    public static org.json.JSONArray getJSONArray(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getJSONArray(str, getDefaultCacheDiskUtils());
    }

    public static org.json.JSONArray getJSONArray(java.lang.String str, org.json.JSONArray jSONArray) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getJSONArray(str, jSONArray, getDefaultCacheDiskUtils());
    }

    public static void put(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, bitmap, getDefaultCacheDiskUtils());
    }

    public static void put(java.lang.String str, android.graphics.Bitmap bitmap, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, bitmap, i, getDefaultCacheDiskUtils());
    }

    public static android.graphics.Bitmap getBitmap(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getBitmap(str, getDefaultCacheDiskUtils());
    }

    public static android.graphics.Bitmap getBitmap(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getBitmap(str, bitmap, getDefaultCacheDiskUtils());
    }

    public static void put(java.lang.String str, android.graphics.drawable.Drawable drawable) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, drawable, getDefaultCacheDiskUtils());
    }

    public static void put(java.lang.String str, android.graphics.drawable.Drawable drawable, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, drawable, i, getDefaultCacheDiskUtils());
    }

    public static android.graphics.drawable.Drawable getDrawable(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getDrawable(str, getDefaultCacheDiskUtils());
    }

    public static android.graphics.drawable.Drawable getDrawable(java.lang.String str, android.graphics.drawable.Drawable drawable) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getDrawable(str, drawable, getDefaultCacheDiskUtils());
    }

    public static void put(java.lang.String str, android.os.Parcelable parcelable) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, parcelable, getDefaultCacheDiskUtils());
    }

    public static void put(java.lang.String str, android.os.Parcelable parcelable, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, parcelable, i, getDefaultCacheDiskUtils());
    }

    public static <T> T getParcelable(java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(creator, "Argument 'creator' of type Parcelable.Creator<T> (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return (T) getParcelable(str, (android.os.Parcelable.Creator) creator, getDefaultCacheDiskUtils());
    }

    public static <T> T getParcelable(java.lang.String str, android.os.Parcelable.Creator<T> creator, T t) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(creator, "Argument 'creator' of type Parcelable.Creator<T> (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return (T) getParcelable(str, creator, t, getDefaultCacheDiskUtils());
    }

    public static void put(java.lang.String str, java.io.Serializable serializable) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, serializable, getDefaultCacheDiskUtils());
    }

    public static void put(java.lang.String str, java.io.Serializable serializable, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, serializable, i, getDefaultCacheDiskUtils());
    }

    public static java.lang.Object getSerializable(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getSerializable(str, getDefaultCacheDiskUtils());
    }

    public static java.lang.Object getSerializable(java.lang.String str, java.lang.Object obj) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getSerializable(str, obj, getDefaultCacheDiskUtils());
    }

    public static long getCacheSize() {
        return getCacheSize(getDefaultCacheDiskUtils());
    }

    public static int getCacheCount() {
        return getCacheCount(getDefaultCacheDiskUtils());
    }

    public static boolean remove(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return remove(str, getDefaultCacheDiskUtils());
    }

    public static boolean clear() {
        return clear(getDefaultCacheDiskUtils());
    }

    public static void put(java.lang.String str, byte[] bArr, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDiskUtils.put(str, bArr);
    }

    public static void put(java.lang.String str, byte[] bArr, int i, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDiskUtils.put(str, bArr, i);
    }

    public static byte[] getBytes(java.lang.String str, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.getBytes(str);
    }

    public static byte[] getBytes(java.lang.String str, byte[] bArr, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.getBytes(str, bArr);
    }

    public static void put(java.lang.String str, java.lang.String str2, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDiskUtils.put(str, str2);
    }

    public static void put(java.lang.String str, java.lang.String str2, int i, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDiskUtils.put(str, str2, i);
    }

    public static java.lang.String getString(java.lang.String str, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.getString(str);
    }

    public static java.lang.String getString(java.lang.String str, java.lang.String str2, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.getString(str, str2);
    }

    public static void put(java.lang.String str, org.json.JSONObject jSONObject, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDiskUtils.put(str, jSONObject);
    }

    public static void put(java.lang.String str, org.json.JSONObject jSONObject, int i, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDiskUtils.put(str, jSONObject, i);
    }

    public static org.json.JSONObject getJSONObject(java.lang.String str, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.getJSONObject(str);
    }

    public static org.json.JSONObject getJSONObject(java.lang.String str, org.json.JSONObject jSONObject, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.getJSONObject(str, jSONObject);
    }

    public static void put(java.lang.String str, org.json.JSONArray jSONArray, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDiskUtils.put(str, jSONArray);
    }

    public static void put(java.lang.String str, org.json.JSONArray jSONArray, int i, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDiskUtils.put(str, jSONArray, i);
    }

    public static org.json.JSONArray getJSONArray(java.lang.String str, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.getJSONArray(str);
    }

    public static org.json.JSONArray getJSONArray(java.lang.String str, org.json.JSONArray jSONArray, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.getJSONArray(str, jSONArray);
    }

    public static void put(java.lang.String str, android.graphics.Bitmap bitmap, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDiskUtils.put(str, bitmap);
    }

    public static void put(java.lang.String str, android.graphics.Bitmap bitmap, int i, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDiskUtils.put(str, bitmap, i);
    }

    public static android.graphics.Bitmap getBitmap(java.lang.String str, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.getBitmap(str);
    }

    public static android.graphics.Bitmap getBitmap(java.lang.String str, android.graphics.Bitmap bitmap, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.getBitmap(str, bitmap);
    }

    public static void put(java.lang.String str, android.graphics.drawable.Drawable drawable, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDiskUtils.put(str, drawable);
    }

    public static void put(java.lang.String str, android.graphics.drawable.Drawable drawable, int i, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDiskUtils.put(str, drawable, i);
    }

    public static android.graphics.drawable.Drawable getDrawable(java.lang.String str, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.getDrawable(str);
    }

    public static android.graphics.drawable.Drawable getDrawable(java.lang.String str, android.graphics.drawable.Drawable drawable, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.getDrawable(str, drawable);
    }

    public static void put(java.lang.String str, android.os.Parcelable parcelable, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDiskUtils.put(str, parcelable);
    }

    public static void put(java.lang.String str, android.os.Parcelable parcelable, int i, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDiskUtils.put(str, parcelable, i);
    }

    public static <T> T getParcelable(java.lang.String str, android.os.Parcelable.Creator<T> creator, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(creator, "Argument 'creator' of type Parcelable.Creator<T> (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return (T) cacheDiskUtils.getParcelable(str, creator);
    }

    public static <T> T getParcelable(java.lang.String str, android.os.Parcelable.Creator<T> creator, T t, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(creator, "Argument 'creator' of type Parcelable.Creator<T> (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return (T) cacheDiskUtils.getParcelable(str, creator, t);
    }

    public static void put(java.lang.String str, java.io.Serializable serializable, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDiskUtils.put(str, serializable);
    }

    public static void put(java.lang.String str, java.io.Serializable serializable, int i, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheDiskUtils.put(str, serializable, i);
    }

    public static java.lang.Object getSerializable(java.lang.String str, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.getSerializable(str);
    }

    public static java.lang.Object getSerializable(java.lang.String str, java.lang.Object obj, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.getSerializable(str, obj);
    }

    public static long getCacheSize(com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.getCacheSize();
    }

    public static int getCacheCount(com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.getCacheCount();
    }

    public static boolean remove(java.lang.String str, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.remove(str);
    }

    public static boolean clear(com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheDiskUtils.clear();
    }

    private static com.blankj.utilcode.util.CacheDiskUtils getDefaultCacheDiskUtils() {
        com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils = sDefaultCacheDiskUtils;
        if (cacheDiskUtils == null) {
            cacheDiskUtils = com.blankj.utilcode.util.CacheDiskUtils.getInstance();
        }
        java.util.Objects.requireNonNull(cacheDiskUtils, "Detected an attempt to return null from a method com.blankj.utilcode.util.CacheDiskStaticUtils.getDefaultCacheDiskUtils() marked by @androidx.annotation.NonNull");
        return cacheDiskUtils;
    }
}
