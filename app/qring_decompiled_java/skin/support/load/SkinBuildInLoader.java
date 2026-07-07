package skin.support.load;

/* loaded from: classes3.dex */
public class SkinBuildInLoader implements skin.support.SkinCompatManager.SkinLoaderStrategy {
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

    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public int getType() {
        return 1;
    }

    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public java.lang.String loadSkinInBackground(android.content.Context context, java.lang.String str) {
        skin.support.content.res.SkinCompatResources.getInstance().setupSkin(context.getResources(), context.getPackageName(), str, this);
        return str;
    }

    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public java.lang.String getTargetResourceEntryName(android.content.Context context, java.lang.String str, int i) {
        return context.getResources().getResourceEntryName(i) + "_" + str;
    }
}
