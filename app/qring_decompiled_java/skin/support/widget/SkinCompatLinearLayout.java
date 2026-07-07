package skin.support.widget;

/* loaded from: classes3.dex */
public class SkinCompatLinearLayout extends android.widget.LinearLayout implements skin.support.widget.SkinCompatSupportable {
    private skin.support.widget.SkinCompatBackgroundHelper mBackgroundTintHelper;

    public SkinCompatLinearLayout(android.content.Context context) {
        this(context, null);
    }

    public SkinCompatLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkinCompatLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = new skin.support.widget.SkinCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = skinCompatBackgroundHelper;
        skinCompatBackgroundHelper.loadFromAttributes(attributeSet, i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.onSetBackgroundResource(i);
        }
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.applySkin();
        }
    }
}
