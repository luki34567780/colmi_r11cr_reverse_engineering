package skin.support.content.res;

/* loaded from: classes3.dex */
public class SkinCompatResources {
    private static volatile skin.support.content.res.SkinCompatResources sInstance;
    private android.app.Application application;
    private android.content.res.Resources mResources;
    private skin.support.SkinCompatManager.SkinLoaderStrategy mStrategy;
    private java.lang.String mSkinPkgName = "";
    private java.lang.String mSkinName = "";
    private boolean isDefaultSkin = true;
    private java.util.List<skin.support.content.res.SkinResources> mSkinResources = new java.util.ArrayList();

    public void setApplication(android.app.Application application) {
        this.application = application;
    }

    private SkinCompatResources() {
    }

    public static skin.support.content.res.SkinCompatResources getInstance() {
        if (sInstance == null) {
            synchronized (skin.support.content.res.SkinCompatResources.class) {
                if (sInstance == null) {
                    sInstance = new skin.support.content.res.SkinCompatResources();
                }
            }
        }
        return sInstance;
    }

    void addSkinResources(skin.support.content.res.SkinResources skinResources) {
        this.mSkinResources.add(skinResources);
    }

    public void reset() {
        reset(skin.support.SkinCompatManager.getInstance().getStrategies().get(-1));
    }

    public void reset(skin.support.SkinCompatManager.SkinLoaderStrategy skinLoaderStrategy) {
        this.mResources = this.application.getResources();
        this.mSkinPkgName = "";
        this.mSkinName = "";
        this.mStrategy = skinLoaderStrategy;
        this.isDefaultSkin = true;
        skin.support.content.res.SkinCompatUserThemeManager.get().clearCaches();
        java.util.Iterator<skin.support.content.res.SkinResources> it = this.mSkinResources.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    public void setupSkin(android.content.res.Resources resources, java.lang.String str, java.lang.String str2, skin.support.SkinCompatManager.SkinLoaderStrategy skinLoaderStrategy) {
        if (resources == null || android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            reset(skinLoaderStrategy);
            return;
        }
        this.mResources = resources;
        this.mSkinPkgName = str;
        this.mSkinName = str2;
        this.mStrategy = skinLoaderStrategy;
        this.isDefaultSkin = false;
        skin.support.content.res.SkinCompatUserThemeManager.get().clearCaches();
        java.util.Iterator<skin.support.content.res.SkinResources> it = this.mSkinResources.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    public android.content.res.Resources getSkinResources() {
        return this.mResources;
    }

    public java.lang.String getSkinPkgName() {
        return this.mSkinPkgName;
    }

    public skin.support.SkinCompatManager.SkinLoaderStrategy getStrategy() {
        return this.mStrategy;
    }

    public boolean isDefaultSkin() {
        return this.isDefaultSkin;
    }

    @java.lang.Deprecated
    public int getColor(int i) {
        return getColor(this.application, i);
    }

    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getDrawable(int i) {
        return getDrawable(this.application, i);
    }

    @java.lang.Deprecated
    public android.content.res.ColorStateList getColorStateList(int i) {
        return getColorStateList(this.application, i);
    }

    public int getTargetResId(android.content.Context context, int i) {
        try {
            skin.support.SkinCompatManager.SkinLoaderStrategy skinLoaderStrategy = this.mStrategy;
            java.lang.String targetResourceEntryName = skinLoaderStrategy != null ? skinLoaderStrategy.getTargetResourceEntryName(context, this.mSkinName, i) : null;
            if (android.text.TextUtils.isEmpty(targetResourceEntryName)) {
                targetResourceEntryName = context.getResources().getResourceEntryName(i);
            }
            return this.mResources.getIdentifier(targetResourceEntryName, context.getResources().getResourceTypeName(i), this.mSkinPkgName);
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    private int getSkinColor(android.content.Context context, int i) {
        int targetResId;
        android.content.res.ColorStateList color;
        android.content.res.ColorStateList colorStateList;
        if (!skin.support.content.res.SkinCompatUserThemeManager.get().isColorEmpty() && (colorStateList = skin.support.content.res.SkinCompatUserThemeManager.get().getColorStateList(i)) != null) {
            return colorStateList.getDefaultColor();
        }
        skin.support.SkinCompatManager.SkinLoaderStrategy skinLoaderStrategy = this.mStrategy;
        if (skinLoaderStrategy != null && (color = skinLoaderStrategy.getColor(context, this.mSkinName, i)) != null) {
            return color.getDefaultColor();
        }
        if (!this.isDefaultSkin && (targetResId = getTargetResId(context, i)) != 0) {
            return this.mResources.getColor(targetResId);
        }
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return context.getResources().getColor(i, context.getTheme());
        }
        return context.getResources().getColor(i);
    }

    private android.content.res.ColorStateList getSkinColorStateList(android.content.Context context, int i) {
        int targetResId;
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2;
        if (!skin.support.content.res.SkinCompatUserThemeManager.get().isColorEmpty() && (colorStateList2 = skin.support.content.res.SkinCompatUserThemeManager.get().getColorStateList(i)) != null) {
            return colorStateList2;
        }
        skin.support.SkinCompatManager.SkinLoaderStrategy skinLoaderStrategy = this.mStrategy;
        if (skinLoaderStrategy != null && (colorStateList = skinLoaderStrategy.getColorStateList(context, this.mSkinName, i)) != null) {
            return colorStateList;
        }
        if (!this.isDefaultSkin && (targetResId = getTargetResId(context, i)) != 0) {
            return this.mResources.getColorStateList(targetResId);
        }
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return context.getResources().getColorStateList(i, context.getTheme());
        }
        return context.getResources().getColorStateList(i);
    }

    private android.graphics.drawable.Drawable getSkinDrawable(android.content.Context context, int i) {
        int targetResId;
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        android.content.res.ColorStateList colorStateList;
        if (!skin.support.content.res.SkinCompatUserThemeManager.get().isColorEmpty() && (colorStateList = skin.support.content.res.SkinCompatUserThemeManager.get().getColorStateList(i)) != null) {
            return new android.graphics.drawable.ColorDrawable(colorStateList.getDefaultColor());
        }
        if (!skin.support.content.res.SkinCompatUserThemeManager.get().isDrawableEmpty() && (drawable2 = skin.support.content.res.SkinCompatUserThemeManager.get().getDrawable(i)) != null) {
            return drawable2;
        }
        skin.support.SkinCompatManager.SkinLoaderStrategy skinLoaderStrategy = this.mStrategy;
        if (skinLoaderStrategy != null && (drawable = skinLoaderStrategy.getDrawable(context, this.mSkinName, i)) != null) {
            return drawable;
        }
        try {
            if (!this.isDefaultSkin && (targetResId = getTargetResId(context, i)) != 0) {
                return this.mResources.getDrawable(targetResId);
            }
            return context.getResources().getDrawable(i, context.getTheme());
        } catch (android.content.res.Resources.NotFoundException unused) {
            return context.getResources().getDrawable(i, context.getTheme());
        }
    }

    android.graphics.drawable.Drawable getStrategyDrawable(android.content.Context context, int i) {
        skin.support.SkinCompatManager.SkinLoaderStrategy skinLoaderStrategy = this.mStrategy;
        if (skinLoaderStrategy != null) {
            return skinLoaderStrategy.getDrawable(context, this.mSkinName, i);
        }
        return null;
    }

    private android.content.res.XmlResourceParser getSkinXml(android.content.Context context, int i) {
        int targetResId;
        if (!this.isDefaultSkin && (targetResId = getTargetResId(context, i)) != 0) {
            return this.mResources.getXml(targetResId);
        }
        return context.getResources().getXml(i);
    }

    private void getSkinValue(android.content.Context context, int i, android.util.TypedValue typedValue, boolean z) {
        int targetResId;
        if (!this.isDefaultSkin && (targetResId = getTargetResId(context, i)) != 0) {
            this.mResources.getValue(targetResId, typedValue, z);
        } else {
            context.getResources().getValue(i, typedValue, z);
        }
    }

    public static int getColor(android.content.Context context, int i) {
        return getInstance().getSkinColor(context, i);
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context context, int i) {
        return getInstance().getSkinColorStateList(context, i);
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context context, int i) {
        return getInstance().getSkinDrawable(context, i);
    }

    public static android.content.res.XmlResourceParser getXml(android.content.Context context, int i) {
        return getInstance().getSkinXml(context, i);
    }

    public static void getValue(android.content.Context context, int i, android.util.TypedValue typedValue, boolean z) {
        getInstance().getSkinValue(context, i, typedValue, z);
    }
}
