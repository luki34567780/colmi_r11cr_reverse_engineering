package skin.support.design.widget;

/* loaded from: classes3.dex */
public class SkinMaterialAppBarLayout extends com.google.android.material.appbar.AppBarLayout implements skin.support.widget.SkinCompatSupportable {
    private skin.support.widget.SkinCompatBackgroundHelper mBackgroundTintHelper;

    public SkinMaterialAppBarLayout(android.content.Context context) {
        this(context, null);
    }

    public SkinMaterialAppBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = new skin.support.widget.SkinCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = skinCompatBackgroundHelper;
        skinCompatBackgroundHelper.loadFromAttributes(attributeSet, 0);
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.applySkin();
        }
    }
}
