package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class ApiUtils {
    private static final java.lang.String TAG = "ApiUtils";
    private java.util.Map<java.lang.Class, com.blankj.utilcode.util.ApiUtils.BaseApi> mApiMap;
    private java.util.Map<java.lang.Class, java.lang.Class> mInjectApiImplMap;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface Api {
        boolean isMock() default false;
    }

    public static class BaseApi {
    }

    private void init() {
    }

    private ApiUtils() {
        this.mApiMap = new java.util.concurrent.ConcurrentHashMap();
        this.mInjectApiImplMap = new java.util.HashMap();
        init();
    }

    private void registerImpl(java.lang.Class cls) {
        this.mInjectApiImplMap.put(cls.getSuperclass(), cls);
    }

    public static <T extends com.blankj.utilcode.util.ApiUtils.BaseApi> T getApi(java.lang.Class<T> cls) {
        java.util.Objects.requireNonNull(cls, "Argument 'apiClass' of type Class<T> (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return (T) getInstance().getApiInner(cls);
    }

    public static void register(java.lang.Class<? extends com.blankj.utilcode.util.ApiUtils.BaseApi> cls) {
        if (cls == null) {
            return;
        }
        getInstance().registerImpl(cls);
    }

    public static java.lang.String toString_() {
        java.lang.String apiUtils = getInstance().toString();
        java.util.Objects.requireNonNull(apiUtils, "Detected an attempt to return null from a method com.blankj.utilcode.util.ApiUtils.toString_() marked by @androidx.annotation.NonNull");
        return apiUtils;
    }

    public java.lang.String toString() {
        return "ApiUtils: " + this.mInjectApiImplMap;
    }

    private static com.blankj.utilcode.util.ApiUtils getInstance() {
        return com.blankj.utilcode.util.ApiUtils.LazyHolder.INSTANCE;
    }

    private <Result> Result getApiInner(java.lang.Class cls) {
        Result result = (Result) ((com.blankj.utilcode.util.ApiUtils.BaseApi) this.mApiMap.get(cls));
        if (result != null) {
            return result;
        }
        synchronized (cls) {
            Result result2 = (Result) ((com.blankj.utilcode.util.ApiUtils.BaseApi) this.mApiMap.get(cls));
            if (result2 != null) {
                return result2;
            }
            java.lang.Class cls2 = this.mInjectApiImplMap.get(cls);
            if (cls2 != null) {
                try {
                    Result result3 = (Result) ((com.blankj.utilcode.util.ApiUtils.BaseApi) cls2.newInstance());
                    this.mApiMap.put(cls, result3);
                    return result3;
                } catch (java.lang.Exception unused) {
                    android.util.Log.e(TAG, "The <" + cls2 + "> has no parameterless constructor.");
                    return null;
                }
            }
            android.util.Log.e(TAG, "The <" + cls + "> doesn't implement.");
            return null;
        }
    }

    private static class LazyHolder {
        private static final com.blankj.utilcode.util.ApiUtils INSTANCE = new com.blankj.utilcode.util.ApiUtils();

        private LazyHolder() {
        }
    }
}
