package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class CacheDoubleUtils implements com.blankj.utilcode.constant.CacheConstants {
    private static final java.util.Map<java.lang.String, com.blankj.utilcode.util.CacheDoubleUtils> CACHE_MAP = new java.util.HashMap();
    private final com.blankj.utilcode.util.CacheDiskUtils mCacheDiskUtils;
    private final com.blankj.utilcode.util.CacheMemoryUtils mCacheMemoryUtils;

    public static com.blankj.utilcode.util.CacheDoubleUtils getInstance() {
        return getInstance(com.blankj.utilcode.util.CacheMemoryUtils.getInstance(), com.blankj.utilcode.util.CacheDiskUtils.getInstance());
    }

    public static com.blankj.utilcode.util.CacheDoubleUtils getInstance(com.blankj.utilcode.util.CacheMemoryUtils cacheMemoryUtils, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        java.util.Objects.requireNonNull(cacheMemoryUtils, "Argument 'cacheMemoryUtils' of type CacheMemoryUtils (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheDiskUtils, "Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.lang.String str = cacheDiskUtils.toString() + "_" + cacheMemoryUtils.toString();
        java.util.Map<java.lang.String, com.blankj.utilcode.util.CacheDoubleUtils> map = CACHE_MAP;
        com.blankj.utilcode.util.CacheDoubleUtils cacheDoubleUtils = map.get(str);
        if (cacheDoubleUtils == null) {
            synchronized (com.blankj.utilcode.util.CacheDoubleUtils.class) {
                cacheDoubleUtils = map.get(str);
                if (cacheDoubleUtils == null) {
                    cacheDoubleUtils = new com.blankj.utilcode.util.CacheDoubleUtils(cacheMemoryUtils, cacheDiskUtils);
                    map.put(str, cacheDoubleUtils);
                }
            }
        }
        return cacheDoubleUtils;
    }

    private CacheDoubleUtils(com.blankj.utilcode.util.CacheMemoryUtils cacheMemoryUtils, com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils) {
        this.mCacheMemoryUtils = cacheMemoryUtils;
        this.mCacheDiskUtils = cacheDiskUtils;
    }

    public void put(java.lang.String str, byte[] bArr) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, bArr, -1);
    }

    public void put(java.lang.String str, byte[] bArr, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        this.mCacheMemoryUtils.put(str, bArr, i);
        this.mCacheDiskUtils.put(str, bArr, i);
    }

    public byte[] getBytes(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getBytes(str, null);
    }

    public byte[] getBytes(java.lang.String str, byte[] bArr) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        byte[] bArr2 = (byte[]) this.mCacheMemoryUtils.get(str);
        if (bArr2 != null) {
            return bArr2;
        }
        byte[] bytes = this.mCacheDiskUtils.getBytes(str);
        if (bytes == null) {
            return bArr;
        }
        this.mCacheMemoryUtils.put(str, bytes);
        return bytes;
    }

    public void put(java.lang.String str, java.lang.String str2) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, str2, -1);
    }

    public void put(java.lang.String str, java.lang.String str2, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        this.mCacheMemoryUtils.put(str, str2, i);
        this.mCacheDiskUtils.put(str, str2, i);
    }

    public java.lang.String getString(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getString(str, null);
    }

    public java.lang.String getString(java.lang.String str, java.lang.String str2) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.lang.String str3 = (java.lang.String) this.mCacheMemoryUtils.get(str);
        if (str3 != null) {
            return str3;
        }
        java.lang.String string = this.mCacheDiskUtils.getString(str);
        if (string == null) {
            return str2;
        }
        this.mCacheMemoryUtils.put(str, string);
        return string;
    }

    public void put(java.lang.String str, org.json.JSONObject jSONObject) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, jSONObject, -1);
    }

    public void put(java.lang.String str, org.json.JSONObject jSONObject, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        this.mCacheMemoryUtils.put(str, jSONObject, i);
        this.mCacheDiskUtils.put(str, jSONObject, i);
    }

    public org.json.JSONObject getJSONObject(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getJSONObject(str, null);
    }

    public org.json.JSONObject getJSONObject(java.lang.String str, org.json.JSONObject jSONObject) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        org.json.JSONObject jSONObject2 = (org.json.JSONObject) this.mCacheMemoryUtils.get(str);
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        org.json.JSONObject jSONObject3 = this.mCacheDiskUtils.getJSONObject(str);
        if (jSONObject3 == null) {
            return jSONObject;
        }
        this.mCacheMemoryUtils.put(str, jSONObject3);
        return jSONObject3;
    }

    public void put(java.lang.String str, org.json.JSONArray jSONArray) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, jSONArray, -1);
    }

    public void put(java.lang.String str, org.json.JSONArray jSONArray, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        this.mCacheMemoryUtils.put(str, jSONArray, i);
        this.mCacheDiskUtils.put(str, jSONArray, i);
    }

    public org.json.JSONArray getJSONArray(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getJSONArray(str, null);
    }

    public org.json.JSONArray getJSONArray(java.lang.String str, org.json.JSONArray jSONArray) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        org.json.JSONArray jSONArray2 = (org.json.JSONArray) this.mCacheMemoryUtils.get(str);
        if (jSONArray2 != null) {
            return jSONArray2;
        }
        org.json.JSONArray jSONArray3 = this.mCacheDiskUtils.getJSONArray(str);
        if (jSONArray3 == null) {
            return jSONArray;
        }
        this.mCacheMemoryUtils.put(str, jSONArray3);
        return jSONArray3;
    }

    public void put(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, bitmap, -1);
    }

    public void put(java.lang.String str, android.graphics.Bitmap bitmap, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        this.mCacheMemoryUtils.put(str, bitmap, i);
        this.mCacheDiskUtils.put(str, bitmap, i);
    }

    public android.graphics.Bitmap getBitmap(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getBitmap(str, null);
    }

    public android.graphics.Bitmap getBitmap(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) this.mCacheMemoryUtils.get(str);
        if (bitmap2 != null) {
            return bitmap2;
        }
        android.graphics.Bitmap bitmap3 = this.mCacheDiskUtils.getBitmap(str);
        if (bitmap3 == null) {
            return bitmap;
        }
        this.mCacheMemoryUtils.put(str, bitmap3);
        return bitmap3;
    }

    public void put(java.lang.String str, android.graphics.drawable.Drawable drawable) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, drawable, -1);
    }

    public void put(java.lang.String str, android.graphics.drawable.Drawable drawable, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        this.mCacheMemoryUtils.put(str, drawable, i);
        this.mCacheDiskUtils.put(str, drawable, i);
    }

    public android.graphics.drawable.Drawable getDrawable(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getDrawable(str, null);
    }

    public android.graphics.drawable.Drawable getDrawable(java.lang.String str, android.graphics.drawable.Drawable drawable) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        android.graphics.drawable.Drawable drawable2 = (android.graphics.drawable.Drawable) this.mCacheMemoryUtils.get(str);
        if (drawable2 != null) {
            return drawable2;
        }
        android.graphics.drawable.Drawable drawable3 = this.mCacheDiskUtils.getDrawable(str);
        if (drawable3 == null) {
            return drawable;
        }
        this.mCacheMemoryUtils.put(str, drawable3);
        return drawable3;
    }

    public void put(java.lang.String str, android.os.Parcelable parcelable) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, parcelable, -1);
    }

    public void put(java.lang.String str, android.os.Parcelable parcelable, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        this.mCacheMemoryUtils.put(str, parcelable, i);
        this.mCacheDiskUtils.put(str, parcelable, i);
    }

    public <T> T getParcelable(java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(creator, "Argument 'creator' of type Parcelable.Creator<T> (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return (T) getParcelable(str, creator, null);
    }

    public <T> T getParcelable(java.lang.String str, android.os.Parcelable.Creator<T> creator, T t) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(creator, "Argument 'creator' of type Parcelable.Creator<T> (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        T t2 = (T) this.mCacheMemoryUtils.get(str);
        if (t2 != null) {
            return t2;
        }
        T t3 = (T) this.mCacheDiskUtils.getParcelable(str, creator);
        if (t3 == null) {
            return t;
        }
        this.mCacheMemoryUtils.put(str, t3);
        return t3;
    }

    public void put(java.lang.String str, java.io.Serializable serializable) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, serializable, -1);
    }

    public void put(java.lang.String str, java.io.Serializable serializable, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        this.mCacheMemoryUtils.put(str, serializable, i);
        this.mCacheDiskUtils.put(str, serializable, i);
    }

    public java.lang.Object getSerializable(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getSerializable(str, null);
    }

    public java.lang.Object getSerializable(java.lang.String str, java.lang.Object obj) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.lang.Object obj2 = this.mCacheMemoryUtils.get(str);
        if (obj2 != null) {
            return obj2;
        }
        java.lang.Object serializable = this.mCacheDiskUtils.getSerializable(str);
        if (serializable == null) {
            return obj;
        }
        this.mCacheMemoryUtils.put(str, serializable);
        return serializable;
    }

    public long getCacheDiskSize() {
        return this.mCacheDiskUtils.getCacheSize();
    }

    public int getCacheDiskCount() {
        return this.mCacheDiskUtils.getCacheCount();
    }

    public int getCacheMemoryCount() {
        return this.mCacheMemoryUtils.getCacheCount();
    }

    public void remove(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        this.mCacheMemoryUtils.remove(str);
        this.mCacheDiskUtils.remove(str);
    }

    public void clear() {
        this.mCacheMemoryUtils.clear();
        this.mCacheDiskUtils.clear();
    }
}
