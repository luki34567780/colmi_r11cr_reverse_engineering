package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public class DebouncingUtils {
    private static final int CACHE_SIZE = 64;
    private static final long DEBOUNCING_DEFAULT_VALUE = 1000;
    private static final java.util.Map<java.lang.String, java.lang.Long> KEY_MILLIS_MAP = new java.util.concurrent.ConcurrentHashMap(64);

    private DebouncingUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean isValid(android.view.View view) {
        java.util.Objects.requireNonNull(view, "Argument 'view' of type View (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return isValid(view, 1000L);
    }

    public static boolean isValid(android.view.View view, long j) {
        java.util.Objects.requireNonNull(view, "Argument 'view' of type View (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return isValid(java.lang.String.valueOf(view.hashCode()), j);
    }

    public static boolean isValid(java.lang.String str, long j) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("The key is null.");
        }
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("The duration is less than 0.");
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        clearIfNecessary(elapsedRealtime);
        java.util.Map<java.lang.String, java.lang.Long> map = KEY_MILLIS_MAP;
        java.lang.Long l = map.get(str);
        if (l != null && elapsedRealtime < l.longValue()) {
            return false;
        }
        map.put(str, java.lang.Long.valueOf(elapsedRealtime + j));
        return true;
    }

    private static void clearIfNecessary(long j) {
        java.util.Map<java.lang.String, java.lang.Long> map = KEY_MILLIS_MAP;
        if (map.size() < 64) {
            return;
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Long>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (j >= it.next().getValue().longValue()) {
                it.remove();
            }
        }
    }
}
