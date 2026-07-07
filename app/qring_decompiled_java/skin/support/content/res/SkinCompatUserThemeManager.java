package skin.support.content.res;

/* loaded from: classes3.dex */
public class SkinCompatUserThemeManager {
    private static volatile skin.support.content.res.SkinCompatUserThemeManager INSTANCE = null;
    private static final java.lang.String KEY_DRAWABLE_NAME = "drawableName";
    private static final java.lang.String KEY_DRAWABLE_PATH_AND_ANGLE = "drawablePathAndAngle";
    private static final java.lang.String KEY_TYPE = "type";
    private static final java.lang.String KEY_TYPE_COLOR = "color";
    private static final java.lang.String KEY_TYPE_DRAWABLE = "drawable";
    private static final java.lang.String TAG = "SkinCompatUserThemeManager";
    private boolean mColorEmpty;
    private boolean mDrawableEmpty;
    private final java.util.HashMap<java.lang.String, skin.support.content.res.ColorState> mColorNameStateMap = new java.util.HashMap<>();
    private final java.lang.Object mColorCacheLock = new java.lang.Object();
    private final java.util.WeakHashMap<java.lang.Integer, java.lang.ref.WeakReference<android.content.res.ColorStateList>> mColorCaches = new java.util.WeakHashMap<>();
    private final java.util.HashMap<java.lang.String, java.lang.String> mDrawablePathAndAngleMap = new java.util.HashMap<>();
    private final java.lang.Object mDrawableCacheLock = new java.lang.Object();
    private final java.util.WeakHashMap<java.lang.Integer, java.lang.ref.WeakReference<android.graphics.drawable.Drawable>> mDrawableCaches = new java.util.WeakHashMap<>();

    private SkinCompatUserThemeManager() {
        try {
            startLoadFromSharedPreferences();
        } catch (org.json.JSONException e) {
            this.mColorNameStateMap.clear();
            this.mDrawablePathAndAngleMap.clear();
            if (skin.support.utils.Slog.DEBUG) {
                skin.support.utils.Slog.i(TAG, "startLoadFromSharedPreferences error: " + e);
            }
        }
    }

    private void startLoadFromSharedPreferences() throws org.json.JSONException {
        java.lang.String userTheme = skin.support.utils.SkinPreference.getInstance().getUserTheme();
        if (!android.text.TextUtils.isEmpty(userTheme)) {
            org.json.JSONArray jSONArray = new org.json.JSONArray(userTheme);
            if (skin.support.utils.Slog.DEBUG) {
                skin.support.utils.Slog.i(TAG, "startLoadFromSharedPreferences: " + jSONArray.toString());
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.has(KEY_TYPE)) {
                    java.lang.String string = jSONObject.getString(KEY_TYPE);
                    if ("color".equals(string)) {
                        skin.support.content.res.ColorState fromJSONObject = skin.support.content.res.ColorState.fromJSONObject(jSONObject);
                        if (fromJSONObject != null) {
                            this.mColorNameStateMap.put(fromJSONObject.colorName, fromJSONObject);
                        }
                    } else if (KEY_TYPE_DRAWABLE.equals(string)) {
                        java.lang.String string2 = jSONObject.getString(KEY_DRAWABLE_NAME);
                        java.lang.String string3 = jSONObject.getString(KEY_DRAWABLE_PATH_AND_ANGLE);
                        if (!android.text.TextUtils.isEmpty(string2) && !android.text.TextUtils.isEmpty(string3)) {
                            this.mDrawablePathAndAngleMap.put(string2, string3);
                        }
                    }
                }
            }
        }
        this.mColorEmpty = this.mColorNameStateMap.isEmpty();
        this.mDrawableEmpty = this.mDrawablePathAndAngleMap.isEmpty();
    }

    public void apply() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<java.lang.String> it = this.mColorNameStateMap.keySet().iterator();
        while (it.hasNext()) {
            skin.support.content.res.ColorState colorState = this.mColorNameStateMap.get(it.next());
            if (colorState != null) {
                try {
                    jSONArray.put(skin.support.content.res.ColorState.toJSONObject(colorState).putOpt(KEY_TYPE, "color"));
                } catch (org.json.JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        for (java.lang.String str : this.mDrawablePathAndAngleMap.keySet()) {
            try {
                jSONArray.put(new org.json.JSONObject().putOpt(KEY_TYPE, KEY_TYPE_DRAWABLE).putOpt(KEY_DRAWABLE_NAME, str).putOpt(KEY_DRAWABLE_PATH_AND_ANGLE, this.mDrawablePathAndAngleMap.get(str)));
            } catch (org.json.JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (skin.support.utils.Slog.DEBUG) {
            skin.support.utils.Slog.i(TAG, "Apply user theme: " + jSONArray.toString());
        }
        skin.support.utils.SkinPreference.getInstance().setUserTheme(jSONArray.toString()).commitEditor();
        skin.support.SkinCompatManager.getInstance().notifyUpdateSkin();
    }

    public static skin.support.content.res.SkinCompatUserThemeManager get() {
        if (INSTANCE == null) {
            synchronized (skin.support.content.res.SkinCompatUserThemeManager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new skin.support.content.res.SkinCompatUserThemeManager();
                }
            }
        }
        return INSTANCE;
    }

    public void addColorState(int i, skin.support.content.res.ColorState colorState) {
        java.lang.String entryName = getEntryName(i, "color");
        if (android.text.TextUtils.isEmpty(entryName) || colorState == null) {
            return;
        }
        colorState.colorName = entryName;
        this.mColorNameStateMap.put(entryName, colorState);
        removeColorInCache(i);
        this.mColorEmpty = false;
    }

    public void addColorState(int i, java.lang.String str) {
        if (skin.support.content.res.ColorState.checkColorValid("colorDefault", str)) {
            java.lang.String entryName = getEntryName(i, "color");
            if (android.text.TextUtils.isEmpty(entryName)) {
                return;
            }
            this.mColorNameStateMap.put(entryName, new skin.support.content.res.ColorState(entryName, str));
            removeColorInCache(i);
            this.mColorEmpty = false;
        }
    }

    public void removeColorState(int i) {
        java.lang.String entryName = getEntryName(i, "color");
        if (android.text.TextUtils.isEmpty(entryName)) {
            return;
        }
        this.mColorNameStateMap.remove(entryName);
        removeColorInCache(i);
        this.mColorEmpty = this.mColorNameStateMap.isEmpty();
    }

    void removeColorState(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.mColorNameStateMap.remove(str);
        this.mColorEmpty = this.mColorNameStateMap.isEmpty();
    }

    public skin.support.content.res.ColorState getColorState(java.lang.String str) {
        return this.mColorNameStateMap.get(str);
    }

    public skin.support.content.res.ColorState getColorState(int i) {
        java.lang.String entryName = getEntryName(i, "color");
        if (android.text.TextUtils.isEmpty(entryName)) {
            return null;
        }
        return this.mColorNameStateMap.get(entryName);
    }

    public android.content.res.ColorStateList getColorStateList(int i) {
        skin.support.content.res.ColorState colorState;
        android.content.res.ColorStateList cachedColor = getCachedColor(i);
        if (cachedColor == null) {
            java.lang.String entryName = getEntryName(i, "color");
            if (!android.text.TextUtils.isEmpty(entryName) && (colorState = this.mColorNameStateMap.get(entryName)) != null && (cachedColor = colorState.parse()) != null) {
                addColorToCache(i, cachedColor);
            }
        }
        return cachedColor;
    }

    public void addDrawablePath(int i, java.lang.String str) {
        if (checkPathValid(str)) {
            java.lang.String entryName = getEntryName(i, KEY_TYPE_DRAWABLE);
            if (android.text.TextUtils.isEmpty(entryName)) {
                return;
            }
            this.mDrawablePathAndAngleMap.put(entryName, str + ":" + java.lang.String.valueOf(skin.support.utils.ImageUtils.getImageRotateAngle(str)));
            removeDrawableInCache(i);
            this.mDrawableEmpty = false;
        }
    }

    public void addDrawablePath(int i, java.lang.String str, int i2) {
        if (checkPathValid(str)) {
            java.lang.String entryName = getEntryName(i, KEY_TYPE_DRAWABLE);
            if (android.text.TextUtils.isEmpty(entryName)) {
                return;
            }
            this.mDrawablePathAndAngleMap.put(entryName, str + ":" + java.lang.String.valueOf(i2));
            removeDrawableInCache(i);
            this.mDrawableEmpty = false;
        }
    }

    public void removeDrawablePath(int i) {
        java.lang.String entryName = getEntryName(i, KEY_TYPE_DRAWABLE);
        if (android.text.TextUtils.isEmpty(entryName)) {
            return;
        }
        this.mDrawablePathAndAngleMap.remove(entryName);
        removeDrawableInCache(i);
        this.mDrawableEmpty = this.mDrawablePathAndAngleMap.isEmpty();
    }

    public java.lang.String getDrawablePath(java.lang.String str) {
        java.lang.String str2 = this.mDrawablePathAndAngleMap.get(str);
        return !android.text.TextUtils.isEmpty(str2) ? str2.split(":")[0] : "";
    }

    public int getDrawableAngle(java.lang.String str) {
        java.lang.String str2 = this.mDrawablePathAndAngleMap.get(str);
        if (android.text.TextUtils.isEmpty(str2)) {
            return 0;
        }
        java.lang.String[] split = str2.split(":");
        if (split.length == 2) {
            return java.lang.Integer.valueOf(split[1]).intValue();
        }
        return 0;
    }

    public android.graphics.drawable.Drawable getDrawable(int i) {
        android.graphics.drawable.Drawable cachedDrawable = getCachedDrawable(i);
        if (cachedDrawable == null) {
            java.lang.String entryName = getEntryName(i, KEY_TYPE_DRAWABLE);
            if (!android.text.TextUtils.isEmpty(entryName)) {
                java.lang.String str = this.mDrawablePathAndAngleMap.get(entryName);
                if (!android.text.TextUtils.isEmpty(str)) {
                    java.lang.String[] split = str.split(":");
                    java.lang.String str2 = split[0];
                    int intValue = split.length == 2 ? java.lang.Integer.valueOf(split[1]).intValue() : 0;
                    if (checkPathValid(str2)) {
                        if (intValue == 0) {
                            cachedDrawable = android.graphics.drawable.Drawable.createFromPath(str2);
                        } else {
                            android.graphics.Matrix matrix = new android.graphics.Matrix();
                            matrix.postRotate(intValue);
                            android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile(str2);
                            cachedDrawable = new android.graphics.drawable.BitmapDrawable((android.content.res.Resources) null, android.graphics.Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true));
                        }
                        if (cachedDrawable != null) {
                            addDrawableToCache(i, cachedDrawable);
                        }
                    }
                }
            }
        }
        return cachedDrawable;
    }

    public void clearColors() {
        this.mColorNameStateMap.clear();
        clearColorCaches();
        this.mColorEmpty = true;
        apply();
    }

    public void clearDrawables() {
        this.mDrawablePathAndAngleMap.clear();
        clearDrawableCaches();
        this.mDrawableEmpty = true;
        apply();
    }

    boolean isColorEmpty() {
        return this.mColorEmpty;
    }

    boolean isDrawableEmpty() {
        return this.mDrawableEmpty;
    }

    void clearCaches() {
        clearColorCaches();
        clearDrawableCaches();
    }

    private void clearColorCaches() {
        synchronized (this.mColorCacheLock) {
            this.mColorCaches.clear();
        }
    }

    private void clearDrawableCaches() {
        synchronized (this.mDrawableCacheLock) {
            this.mDrawableCaches.clear();
        }
    }

    private android.content.res.ColorStateList getCachedColor(int i) {
        synchronized (this.mColorCacheLock) {
            java.lang.ref.WeakReference<android.content.res.ColorStateList> weakReference = this.mColorCaches.get(java.lang.Integer.valueOf(i));
            if (weakReference != null) {
                android.content.res.ColorStateList colorStateList = weakReference.get();
                if (colorStateList != null) {
                    return colorStateList;
                }
                this.mColorCaches.remove(java.lang.Integer.valueOf(i));
            }
            return null;
        }
    }

    private void addColorToCache(int i, android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            synchronized (this.mColorCacheLock) {
                this.mColorCaches.put(java.lang.Integer.valueOf(i), new java.lang.ref.WeakReference<>(colorStateList));
            }
        }
    }

    private void removeColorInCache(int i) {
        synchronized (this.mColorCacheLock) {
            this.mColorCaches.remove(java.lang.Integer.valueOf(i));
        }
    }

    private android.graphics.drawable.Drawable getCachedDrawable(int i) {
        synchronized (this.mDrawableCacheLock) {
            java.lang.ref.WeakReference<android.graphics.drawable.Drawable> weakReference = this.mDrawableCaches.get(java.lang.Integer.valueOf(i));
            if (weakReference != null) {
                android.graphics.drawable.Drawable drawable = weakReference.get();
                if (drawable != null) {
                    return drawable;
                }
                this.mDrawableCaches.remove(java.lang.Integer.valueOf(i));
            }
            return null;
        }
    }

    private void addDrawableToCache(int i, android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            synchronized (this.mDrawableCacheLock) {
                this.mDrawableCaches.put(java.lang.Integer.valueOf(i), new java.lang.ref.WeakReference<>(drawable));
            }
        }
    }

    private void removeDrawableInCache(int i) {
        synchronized (this.mDrawableCacheLock) {
            this.mDrawableCaches.remove(java.lang.Integer.valueOf(i));
        }
    }

    private java.lang.String getEntryName(int i, java.lang.String str) {
        android.content.Context context = skin.support.SkinCompatManager.getInstance().getContext();
        if (str.equalsIgnoreCase(context.getResources().getResourceTypeName(i))) {
            return context.getResources().getResourceEntryName(i);
        }
        return null;
    }

    private static boolean checkPathValid(java.lang.String str) {
        boolean z = !android.text.TextUtils.isEmpty(str) && new java.io.File(str).exists();
        if (skin.support.utils.Slog.DEBUG && !z) {
            skin.support.utils.Slog.i(TAG, "Invalid drawable path : " + str);
        }
        return z;
    }
}
