package skin.support.load;

/* loaded from: classes3.dex */
public abstract class SkinSDCardLoader implements skin.support.SkinCompatManager.SkinLoaderStrategy {
    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public android.content.res.ColorStateList getColor(android.content.Context context, java.lang.String str, int i) {
        return null;
    }

    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public android.content.res.ColorStateList getColorStateList(android.content.Context context, java.lang.String str, int i) {
        return null;
    }

    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public android.graphics.drawable.Drawable getDrawable(android.content.Context context, java.lang.String str, int i) {
        return null;
    }

    protected abstract java.lang.String getSkinPath(android.content.Context context, java.lang.String str);

    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public java.lang.String getTargetResourceEntryName(android.content.Context context, java.lang.String str, int i) {
        return null;
    }

    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public java.lang.String loadSkinInBackground(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.lang.String skinPath = getSkinPath(context, str);
        if (!skin.support.utils.SkinFileUtils.isFileExists(skinPath)) {
            return null;
        }
        java.lang.String skinPackageName = skin.support.SkinCompatManager.getInstance().getSkinPackageName(skinPath);
        android.content.res.Resources skinResources = skin.support.SkinCompatManager.getInstance().getSkinResources(skinPath);
        if (skinResources == null || android.text.TextUtils.isEmpty(skinPackageName)) {
            return null;
        }
        skin.support.content.res.SkinCompatResources.getInstance().setupSkin(skinResources, skinPackageName, str, this);
        return str;
    }
}
