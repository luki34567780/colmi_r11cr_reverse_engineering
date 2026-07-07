package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class SPUtils {
    private static final java.util.Map<java.lang.String, com.blankj.utilcode.util.SPUtils> SP_UTILS_MAP = new java.util.HashMap();
    private android.content.SharedPreferences sp;

    public static com.blankj.utilcode.util.SPUtils getInstance() {
        return getInstance("", 0);
    }

    public static com.blankj.utilcode.util.SPUtils getInstance(int i) {
        return getInstance("", i);
    }

    public static com.blankj.utilcode.util.SPUtils getInstance(java.lang.String str) {
        return getInstance(str, 0);
    }

    public static com.blankj.utilcode.util.SPUtils getInstance(java.lang.String str, int i) {
        if (isSpace(str)) {
            str = "spUtils";
        }
        java.util.Map<java.lang.String, com.blankj.utilcode.util.SPUtils> map = SP_UTILS_MAP;
        com.blankj.utilcode.util.SPUtils sPUtils = map.get(str);
        if (sPUtils == null) {
            synchronized (com.blankj.utilcode.util.SPUtils.class) {
                sPUtils = map.get(str);
                if (sPUtils == null) {
                    sPUtils = new com.blankj.utilcode.util.SPUtils(str, i);
                    map.put(str, sPUtils);
                }
            }
        }
        return sPUtils;
    }

    private SPUtils(java.lang.String str) {
        this.sp = com.blankj.utilcode.util.Utils.getApp().getSharedPreferences(str, 0);
    }

    private SPUtils(java.lang.String str, int i) {
        this.sp = com.blankj.utilcode.util.Utils.getApp().getSharedPreferences(str, i);
    }

    public void put(java.lang.String str, java.lang.String str2) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, str2, false);
    }

    public void put(java.lang.String str, java.lang.String str2, boolean z) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        if (z) {
            this.sp.edit().putString(str, str2).commit();
        } else {
            this.sp.edit().putString(str, str2).apply();
        }
    }

    public java.lang.String getString(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getString(str, "");
    }

    public java.lang.String getString(java.lang.String str, java.lang.String str2) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return this.sp.getString(str, str2);
    }

    public void put(java.lang.String str, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, i, false);
    }

    public void put(java.lang.String str, int i, boolean z) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        if (z) {
            this.sp.edit().putInt(str, i).commit();
        } else {
            this.sp.edit().putInt(str, i).apply();
        }
    }

    public int getInt(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getInt(str, -1);
    }

    public int getInt(java.lang.String str, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return this.sp.getInt(str, i);
    }

    public void put(java.lang.String str, long j) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, j, false);
    }

    public void put(java.lang.String str, long j, boolean z) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        if (z) {
            this.sp.edit().putLong(str, j).commit();
        } else {
            this.sp.edit().putLong(str, j).apply();
        }
    }

    public long getLong(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getLong(str, -1L);
    }

    public long getLong(java.lang.String str, long j) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return this.sp.getLong(str, j);
    }

    public void put(java.lang.String str, float f) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, f, false);
    }

    public void put(java.lang.String str, float f, boolean z) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        if (z) {
            this.sp.edit().putFloat(str, f).commit();
        } else {
            this.sp.edit().putFloat(str, f).apply();
        }
    }

    public float getFloat(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getFloat(str, -1.0f);
    }

    public float getFloat(java.lang.String str, float f) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return this.sp.getFloat(str, f);
    }

    public void put(java.lang.String str, boolean z) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, z, false);
    }

    public void put(java.lang.String str, boolean z, boolean z2) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        if (z2) {
            this.sp.edit().putBoolean(str, z).commit();
        } else {
            this.sp.edit().putBoolean(str, z).apply();
        }
    }

    public boolean getBoolean(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getBoolean(str, false);
    }

    public boolean getBoolean(java.lang.String str, boolean z) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return this.sp.getBoolean(str, z);
    }

    public void put(java.lang.String str, java.util.Set<java.lang.String> set) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, set, false);
    }

    public void put(java.lang.String str, java.util.Set<java.lang.String> set, boolean z) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        if (z) {
            this.sp.edit().putStringSet(str, set).commit();
        } else {
            this.sp.edit().putStringSet(str, set).apply();
        }
    }

    public java.util.Set<java.lang.String> getStringSet(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getStringSet(str, java.util.Collections.emptySet());
    }

    public java.util.Set<java.lang.String> getStringSet(java.lang.String str, java.util.Set<java.lang.String> set) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return this.sp.getStringSet(str, set);
    }

    public java.util.Map<java.lang.String, ?> getAll() {
        return this.sp.getAll();
    }

    public boolean contains(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return this.sp.contains(str);
    }

    public void remove(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        remove(str, false);
    }

    public void remove(java.lang.String str, boolean z) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        if (z) {
            this.sp.edit().remove(str).commit();
        } else {
            this.sp.edit().remove(str).apply();
        }
    }

    public void clear() {
        clear(false);
    }

    public void clear(boolean z) {
        if (z) {
            this.sp.edit().clear().commit();
        } else {
            this.sp.edit().clear().apply();
        }
    }

    private static boolean isSpace(java.lang.String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!java.lang.Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
