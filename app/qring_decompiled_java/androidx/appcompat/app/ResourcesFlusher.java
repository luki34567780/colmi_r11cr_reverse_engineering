package androidx.appcompat.app;

/* loaded from: classes.dex */
class ResourcesFlusher {
    private static final java.lang.String TAG = "ResourcesFlusher";
    private static java.lang.reflect.Field sDrawableCacheField;
    private static boolean sDrawableCacheFieldFetched;
    private static java.lang.reflect.Field sResourcesImplField;
    private static boolean sResourcesImplFieldFetched;
    private static java.lang.Class<?> sThemedResourceCacheClazz;
    private static boolean sThemedResourceCacheClazzFetched;
    private static java.lang.reflect.Field sThemedResourceCache_mUnthemedEntriesField;
    private static boolean sThemedResourceCache_mUnthemedEntriesFieldFetched;

    static void flush(android.content.res.Resources resources) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            flushNougats(resources);
        } else if (android.os.Build.VERSION.SDK_INT >= 23) {
            flushMarshmallows(resources);
        } else if (android.os.Build.VERSION.SDK_INT >= 21) {
            flushLollipops(resources);
        }
    }

    private static void flushLollipops(android.content.res.Resources resources) {
        if (!sDrawableCacheFieldFetched) {
            try {
                java.lang.reflect.Field declaredField = android.content.res.Resources.class.getDeclaredField("mDrawableCache");
                sDrawableCacheField = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e) {
                android.util.Log.e(TAG, "Could not retrieve Resources#mDrawableCache field", e);
            }
            sDrawableCacheFieldFetched = true;
        }
        java.lang.reflect.Field field = sDrawableCacheField;
        if (field != null) {
            java.util.Map map = null;
            try {
                map = (java.util.Map) field.get(resources);
            } catch (java.lang.IllegalAccessException e2) {
                android.util.Log.e(TAG, "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    private static void flushMarshmallows(android.content.res.Resources resources) {
        if (!sDrawableCacheFieldFetched) {
            try {
                java.lang.reflect.Field declaredField = android.content.res.Resources.class.getDeclaredField("mDrawableCache");
                sDrawableCacheField = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e) {
                android.util.Log.e(TAG, "Could not retrieve Resources#mDrawableCache field", e);
            }
            sDrawableCacheFieldFetched = true;
        }
        java.lang.Object obj = null;
        java.lang.reflect.Field field = sDrawableCacheField;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (java.lang.IllegalAccessException e2) {
                android.util.Log.e(TAG, "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj == null) {
            return;
        }
        flushThemedResourcesCache(obj);
    }

    private static void flushNougats(android.content.res.Resources resources) {
        java.lang.Object obj;
        if (!sResourcesImplFieldFetched) {
            try {
                java.lang.reflect.Field declaredField = android.content.res.Resources.class.getDeclaredField("mResourcesImpl");
                sResourcesImplField = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e) {
                android.util.Log.e(TAG, "Could not retrieve Resources#mResourcesImpl field", e);
            }
            sResourcesImplFieldFetched = true;
        }
        java.lang.reflect.Field field = sResourcesImplField;
        if (field == null) {
            return;
        }
        java.lang.Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (java.lang.IllegalAccessException e2) {
            android.util.Log.e(TAG, "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!sDrawableCacheFieldFetched) {
            try {
                java.lang.reflect.Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                sDrawableCacheField = declaredField2;
                declaredField2.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e3) {
                android.util.Log.e(TAG, "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            sDrawableCacheFieldFetched = true;
        }
        java.lang.reflect.Field field2 = sDrawableCacheField;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (java.lang.IllegalAccessException e4) {
                android.util.Log.e(TAG, "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
            }
        }
        if (obj2 != null) {
            flushThemedResourcesCache(obj2);
        }
    }

    private static void flushThemedResourcesCache(java.lang.Object obj) {
        if (!sThemedResourceCacheClazzFetched) {
            try {
                sThemedResourceCacheClazz = java.lang.Class.forName("android.content.res.ThemedResourceCache");
            } catch (java.lang.ClassNotFoundException e) {
                android.util.Log.e(TAG, "Could not find ThemedResourceCache class", e);
            }
            sThemedResourceCacheClazzFetched = true;
        }
        java.lang.Class<?> cls = sThemedResourceCacheClazz;
        if (cls == null) {
            return;
        }
        if (!sThemedResourceCache_mUnthemedEntriesFieldFetched) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                sThemedResourceCache_mUnthemedEntriesField = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e2) {
                android.util.Log.e(TAG, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            sThemedResourceCache_mUnthemedEntriesFieldFetched = true;
        }
        java.lang.reflect.Field field = sThemedResourceCache_mUnthemedEntriesField;
        if (field == null) {
            return;
        }
        android.util.LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (android.util.LongSparseArray) field.get(obj);
        } catch (java.lang.IllegalAccessException e3) {
            android.util.Log.e(TAG, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    private ResourcesFlusher() {
    }
}
