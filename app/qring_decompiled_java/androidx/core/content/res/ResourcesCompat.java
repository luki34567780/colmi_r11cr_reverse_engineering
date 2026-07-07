package androidx.core.content.res;

/* loaded from: classes.dex */
public final class ResourcesCompat {
    public static final int ID_NULL = 0;
    private static final java.lang.String TAG = "ResourcesCompat";
    private static final java.lang.ThreadLocal<android.util.TypedValue> sTempTypedValue = new java.lang.ThreadLocal<>();
    private static final java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry>> sColorStateCaches = new java.util.WeakHashMap<>(0);
    private static final java.lang.Object sColorStateCacheLock = new java.lang.Object();

    public static android.graphics.drawable.Drawable getDrawable(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    public static android.graphics.drawable.Drawable getDrawableForDensity(android.content.res.Resources resources, int i, int i2, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
        if (android.os.Build.VERSION.SDK_INT >= 15) {
            return resources.getDrawableForDensity(i, i2);
        }
        return resources.getDrawable(i);
    }

    public static int getColor(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey colorStateListCacheKey = new androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey(resources, theme);
        android.content.res.ColorStateList cachedColorStateList = getCachedColorStateList(colorStateListCacheKey, i);
        if (cachedColorStateList != null) {
            return cachedColorStateList;
        }
        android.content.res.ColorStateList inflateColorStateList = inflateColorStateList(resources, i, theme);
        if (inflateColorStateList != null) {
            addColorStateListToCache(colorStateListCacheKey, i, inflateColorStateList);
            return inflateColorStateList;
        }
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return androidx.core.content.res.ResourcesCompat.Api23Impl.getColorStateList(resources, i, theme);
        }
        return resources.getColorStateList(i);
    }

    private static android.content.res.ColorStateList inflateColorStateList(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
        if (isColorInt(resources, i)) {
            return null;
        }
        try {
            return androidx.core.content.res.ColorStateListInflaterCompat.createFromXml(resources, resources.getXml(i), theme);
        } catch (java.lang.Exception e) {
            android.util.Log.w(TAG, "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    private static android.content.res.ColorStateList getCachedColorStateList(androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey colorStateListCacheKey, int i) {
        androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry colorStateListCacheEntry;
        synchronized (sColorStateCacheLock) {
            android.util.SparseArray<androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry> sparseArray = sColorStateCaches.get(colorStateListCacheKey);
            if (sparseArray != null && sparseArray.size() > 0 && (colorStateListCacheEntry = sparseArray.get(i)) != null) {
                if (colorStateListCacheEntry.mConfiguration.equals(colorStateListCacheKey.mResources.getConfiguration())) {
                    return colorStateListCacheEntry.mValue;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    private static void addColorStateListToCache(androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey colorStateListCacheKey, int i, android.content.res.ColorStateList colorStateList) {
        synchronized (sColorStateCacheLock) {
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry>> weakHashMap = sColorStateCaches;
            android.util.SparseArray<androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry> sparseArray = weakHashMap.get(colorStateListCacheKey);
            if (sparseArray == null) {
                sparseArray = new android.util.SparseArray<>();
                weakHashMap.put(colorStateListCacheKey, sparseArray);
            }
            sparseArray.append(i, new androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry(colorStateList, colorStateListCacheKey.mResources.getConfiguration()));
        }
    }

    private static boolean isColorInt(android.content.res.Resources resources, int i) {
        android.util.TypedValue typedValue = getTypedValue();
        resources.getValue(i, typedValue, true);
        return typedValue.type >= 28 && typedValue.type <= 31;
    }

    private static android.util.TypedValue getTypedValue() {
        java.lang.ThreadLocal<android.util.TypedValue> threadLocal = sTempTypedValue;
        android.util.TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static final class ColorStateListCacheKey {
        final android.content.res.Resources mResources;
        final android.content.res.Resources.Theme mTheme;

        ColorStateListCacheKey(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
            this.mResources = resources;
            this.mTheme = theme;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey colorStateListCacheKey = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey) obj;
            return this.mResources.equals(colorStateListCacheKey.mResources) && androidx.core.util.ObjectsCompat.equals(this.mTheme, colorStateListCacheKey.mTheme);
        }

        public int hashCode() {
            return androidx.core.util.ObjectsCompat.hash(this.mResources, this.mTheme);
        }
    }

    private static class ColorStateListCacheEntry {
        final android.content.res.Configuration mConfiguration;
        final android.content.res.ColorStateList mValue;

        ColorStateListCacheEntry(android.content.res.ColorStateList colorStateList, android.content.res.Configuration configuration) {
            this.mValue = colorStateList;
            this.mConfiguration = configuration;
        }
    }

    public static float getFloat(android.content.res.Resources resources, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.content.res.ResourcesCompat.ImplApi29.getFloat(resources, i);
        }
        android.util.TypedValue typedValue = getTypedValue();
        resources.getValue(i, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new android.content.res.Resources.NotFoundException("Resource ID #0x" + java.lang.Integer.toHexString(i) + " type #0x" + java.lang.Integer.toHexString(typedValue.type) + " is not valid");
    }

    public static android.graphics.Typeface getFont(android.content.Context context, int i) throws android.content.res.Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new android.util.TypedValue(), 0, null, null, false, false);
    }

    public static android.graphics.Typeface getCachedFont(android.content.Context context, int i) throws android.content.res.Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new android.util.TypedValue(), 0, null, null, false, true);
    }

    public static abstract class FontCallback {
        public abstract void onFontRetrievalFailed(int i);

        public abstract void onFontRetrieved(android.graphics.Typeface typeface);

        public final void callbackSuccessAsync(final android.graphics.Typeface typeface, android.os.Handler handler) {
            getHandler(handler).post(new java.lang.Runnable() { // from class: androidx.core.content.res.ResourcesCompat.FontCallback.1
                @Override // java.lang.Runnable
                public void run() {
                    androidx.core.content.res.ResourcesCompat.FontCallback.this.onFontRetrieved(typeface);
                }
            });
        }

        public final void callbackFailAsync(final int i, android.os.Handler handler) {
            getHandler(handler).post(new java.lang.Runnable() { // from class: androidx.core.content.res.ResourcesCompat.FontCallback.2
                @Override // java.lang.Runnable
                public void run() {
                    androidx.core.content.res.ResourcesCompat.FontCallback.this.onFontRetrievalFailed(i);
                }
            });
        }

        public static android.os.Handler getHandler(android.os.Handler handler) {
            return handler == null ? new android.os.Handler(android.os.Looper.getMainLooper()) : handler;
        }
    }

    public static void getFont(android.content.Context context, int i, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler) throws android.content.res.Resources.NotFoundException {
        androidx.core.util.Preconditions.checkNotNull(fontCallback);
        if (context.isRestricted()) {
            fontCallback.callbackFailAsync(-4, handler);
        } else {
            loadFont(context, i, new android.util.TypedValue(), 0, fontCallback, handler, false, false);
        }
    }

    public static android.graphics.Typeface getFont(android.content.Context context, int i, android.util.TypedValue typedValue, int i2, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback) throws android.content.res.Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, typedValue, i2, fontCallback, null, true, false);
    }

    private static android.graphics.Typeface loadFont(android.content.Context context, int i, android.util.TypedValue typedValue, int i2, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler, boolean z, boolean z2) {
        android.content.res.Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        android.graphics.Typeface loadFont = loadFont(context, resources, typedValue, i, i2, fontCallback, handler, z, z2);
        if (loadFont != null || fontCallback != null || z2) {
            return loadFont;
        }
        throw new android.content.res.Resources.NotFoundException("Font resource ID #0x" + java.lang.Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface loadFont(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.res.ResourcesCompat.FontCallback r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Lac
            java.lang.CharSequence r1 = r1.string
            java.lang.String r12 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L28
            if (r9 == 0) goto L27
            r9.callbackFailAsync(r13, r10)
        L27:
            return r14
        L28:
            android.graphics.Typeface r1 = androidx.core.graphics.TypefaceCompat.findFromCache(r0, r4, r5)
            if (r1 == 0) goto L34
            if (r9 == 0) goto L33
            r9.callbackSuccessAsync(r1, r10)
        L33:
            return r1
        L34:
            if (r23 == 0) goto L37
            return r14
        L37:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L91
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L91
            if (r1 == 0) goto L6a
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L91
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r2 = androidx.core.content.res.FontResourcesParserCompat.parse(r1, r0)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L91
            if (r2 != 0) goto L58
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L91
            if (r9 == 0) goto L57
            r9.callbackFailAsync(r13, r10)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L91
        L57:
            return r14
        L58:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFamilyXml(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L91
            return r0
        L6a:
            r1 = r15
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(r15, r0, r4, r12, r5)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L91
            if (r9 == 0) goto L7a
            if (r0 == 0) goto L77
            r9.callbackSuccessAsync(r0, r10)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L91
            goto L7a
        L77:
            r9.callbackFailAsync(r13, r10)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L91
        L7a:
            return r0
        L7b:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto La6
        L91:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        La6:
            if (r9 == 0) goto Lab
            r9.callbackFailAsync(r13, r10)
        Lab:
            return r14
        Lac:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.loadFont(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.ResourcesCompat$FontCallback, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }

    static class ImplApi29 {
        private ImplApi29() {
        }

        static float getFloat(android.content.res.Resources resources, int i) {
            return resources.getFloat(i);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static android.content.res.ColorStateList getColorStateList(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    private ResourcesCompat() {
    }

    public static final class ThemeCompat {
        private ThemeCompat() {
        }

        public static void rebase(android.content.res.Resources.Theme theme) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                androidx.core.content.res.ResourcesCompat.ThemeCompat.ImplApi29.rebase(theme);
            } else if (android.os.Build.VERSION.SDK_INT >= 23) {
                androidx.core.content.res.ResourcesCompat.ThemeCompat.ImplApi23.rebase(theme);
            }
        }

        static class ImplApi29 {
            private ImplApi29() {
            }

            static void rebase(android.content.res.Resources.Theme theme) {
                theme.rebase();
            }
        }

        static class ImplApi23 {
            private static java.lang.reflect.Method sRebaseMethod;
            private static boolean sRebaseMethodFetched;
            private static final java.lang.Object sRebaseMethodLock = new java.lang.Object();

            private ImplApi23() {
            }

            static void rebase(android.content.res.Resources.Theme theme) {
                synchronized (sRebaseMethodLock) {
                    if (!sRebaseMethodFetched) {
                        try {
                            java.lang.reflect.Method declaredMethod = android.content.res.Resources.Theme.class.getDeclaredMethod("rebase", new java.lang.Class[0]);
                            sRebaseMethod = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (java.lang.NoSuchMethodException e) {
                            android.util.Log.i(androidx.core.content.res.ResourcesCompat.TAG, "Failed to retrieve rebase() method", e);
                        }
                        sRebaseMethodFetched = true;
                    }
                    java.lang.reflect.Method method = sRebaseMethod;
                    if (method != null) {
                        try {
                            method.invoke(theme, new java.lang.Object[0]);
                        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
                            android.util.Log.i(androidx.core.content.res.ResourcesCompat.TAG, "Failed to invoke rebase() method via reflection", e2);
                            sRebaseMethod = null;
                        }
                    }
                }
            }
        }
    }
}
