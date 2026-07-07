package skin.support.design.widget;

/* loaded from: classes3.dex */
public class SkinMaterialCoordinatorLayout extends androidx.coordinatorlayout.widget.CoordinatorLayout implements skin.support.widget.SkinCompatSupportable {
    private skin.support.widget.SkinCompatBackgroundHelper mBackgroundTintHelper;

    public SkinMaterialCoordinatorLayout(android.content.Context context) {
        this(context, null);
    }

    public SkinMaterialCoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkinMaterialCoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
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
