package skin.support.content.res;

/* loaded from: classes3.dex */
public class SkinCompatVectorResources implements skin.support.content.res.SkinResources {
    private static skin.support.content.res.SkinCompatVectorResources sInstance;

    private SkinCompatVectorResources() {
        skin.support.content.res.SkinCompatResources.getInstance().addSkinResources(this);
    }

    public static skin.support.content.res.SkinCompatVectorResources getInstance() {
        if (sInstance == null) {
            synchronized (skin.support.content.res.SkinCompatVectorResources.class) {
                if (sInstance == null) {
                    sInstance = new skin.support.content.res.SkinCompatVectorResources();
                }
            }
        }
        return sInstance;
    }

    @Override // skin.support.content.res.SkinResources
    public void clear() {
        skin.support.content.res.SkinCompatDrawableManager.get().clearCaches();
    }

    private android.graphics.drawable.Drawable getSkinDrawableCompat(android.content.Context context, int i) {
        int targetResId;
        android.graphics.drawable.Drawable drawable;
        android.content.res.ColorStateList colorStateList;
        android.graphics.drawable.Drawable drawable2;
        android.content.res.ColorStateList colorStateList2;
        if (androidx.appcompat.app.AppCompatDelegate.isCompatVectorFromResourcesEnabled()) {
            if (!skin.support.content.res.SkinCompatResources.getInstance().isDefaultSkin()) {
                try {
                    return skin.support.content.res.SkinCompatDrawableManager.get().getDrawable(context, i);
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
            if (!skin.support.content.res.SkinCompatUserThemeManager.get().isColorEmpty() && (colorStateList2 = skin.support.content.res.SkinCompatUserThemeManager.get().getColorStateList(i)) != null) {
                return new android.graphics.drawable.ColorDrawable(colorStateList2.getDefaultColor());
            }
            if (!skin.support.content.res.SkinCompatUserThemeManager.get().isDrawableEmpty() && (drawable2 = skin.support.content.res.SkinCompatUserThemeManager.get().getDrawable(i)) != null) {
                return drawable2;
            }
            android.graphics.drawable.Drawable strategyDrawable = skin.support.content.res.SkinCompatResources.getInstance().getStrategyDrawable(context, i);
            return strategyDrawable != null ? strategyDrawable : androidx.appcompat.content.res.AppCompatResources.getDrawable(context, i);
        }
        if (!skin.support.content.res.SkinCompatUserThemeManager.get().isColorEmpty() && (colorStateList = skin.support.content.res.SkinCompatUserThemeManager.get().getColorStateList(i)) != null) {
            return new android.graphics.drawable.ColorDrawable(colorStateList.getDefaultColor());
        }
        if (!skin.support.content.res.SkinCompatUserThemeManager.get().isDrawableEmpty() && (drawable = skin.support.content.res.SkinCompatUserThemeManager.get().getDrawable(i)) != null) {
            return drawable;
        }
        android.graphics.drawable.Drawable strategyDrawable2 = skin.support.content.res.SkinCompatResources.getInstance().getStrategyDrawable(context, i);
        if (strategyDrawable2 != null) {
            return strategyDrawable2;
        }
        if (!skin.support.content.res.SkinCompatResources.getInstance().isDefaultSkin() && (targetResId = skin.support.content.res.SkinCompatResources.getInstance().getTargetResId(context, i)) != 0) {
            return skin.support.content.res.SkinCompatResources.getInstance().getSkinResources().getDrawable(targetResId, context.getTheme());
        }
        return androidx.appcompat.content.res.AppCompatResources.getDrawable(context, i);
    }

    public static android.graphics.drawable.Drawable getDrawableCompat(android.content.Context context, int i) {
        return getInstance().getSkinDrawableCompat(context, i);
    }
}
