package com.bumptech.glide.module;

@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public final class ManifestParser {
    private static final java.lang.String GLIDE_MODULE_VALUE = "GlideModule";
    private static final java.lang.String TAG = "ManifestParser";
    private final android.content.Context context;

    public ManifestParser(android.content.Context context) {
        this.context = context;
    }

    public java.util.List<com.bumptech.glide.module.GlideModule> parse() {
        if (android.util.Log.isLoggable(TAG, 3)) {
            android.util.Log.d(TAG, "Loading Glide modules");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.content.pm.ApplicationInfo applicationInfo = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4);
            if (applicationInfo.metaData == null) {
                if (android.util.Log.isLoggable(TAG, 3)) {
                    android.util.Log.d(TAG, "Got null app info metadata");
                }
                return arrayList;
            }
            if (android.util.Log.isLoggable(TAG, 2)) {
                android.util.Log.v(TAG, "Got app info metadata: " + applicationInfo.metaData);
            }
            for (java.lang.String str : applicationInfo.metaData.keySet()) {
                if (GLIDE_MODULE_VALUE.equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(parseModule(str));
                    if (android.util.Log.isLoggable(TAG, 3)) {
                        android.util.Log.d(TAG, "Loaded Glide module: " + str);
                    }
                }
            }
            if (android.util.Log.isLoggable(TAG, 3)) {
                android.util.Log.d(TAG, "Finished loading Glide modules");
            }
            return arrayList;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            throw new java.lang.RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }

    private static com.bumptech.glide.module.GlideModule parseModule(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            java.lang.Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException e) {
                throwInstantiateGlideModuleException(cls, e);
            } catch (java.lang.InstantiationException e2) {
                throwInstantiateGlideModuleException(cls, e2);
            } catch (java.lang.NoSuchMethodException e3) {
                throwInstantiateGlideModuleException(cls, e3);
            } catch (java.lang.reflect.InvocationTargetException e4) {
                throwInstantiateGlideModuleException(cls, e4);
            }
            if (!(obj instanceof com.bumptech.glide.module.GlideModule)) {
                throw new java.lang.RuntimeException("Expected instanceof GlideModule, but found: " + obj);
            }
            return (com.bumptech.glide.module.GlideModule) obj;
        } catch (java.lang.ClassNotFoundException e5) {
            throw new java.lang.IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    private static void throwInstantiateGlideModuleException(java.lang.Class<?> cls, java.lang.Exception exc) {
        throw new java.lang.RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }
}
