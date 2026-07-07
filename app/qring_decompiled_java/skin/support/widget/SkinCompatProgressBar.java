package skin.support.widget;

/* loaded from: classes3.dex */
public class SkinCompatProgressBar extends android.widget.ProgressBar implements skin.support.widget.SkinCompatSupportable {
    private skin.support.widget.SkinCompatProgressBarHelper mSkinCompatProgressBarHelper;

    public SkinCompatProgressBar(android.content.Context context) {
        this(context, null);
    }

    public SkinCompatProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.progressBarStyle);
    }

    public SkinCompatProgressBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        skin.support.widget.SkinCompatProgressBarHelper skinCompatProgressBarHelper = new skin.support.widget.SkinCompatProgressBarHelper(this);
        this.mSkinCompatProgressBarHelper = skinCompatProgressBarHelper;
        skinCompatProgressBarHelper.loadFromAttributes(attributeSet, i);
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        skin.support.widget.SkinCompatProgressBarHelper skinCompatProgressBarHelper = this.mSkinCompatProgressBarHelper;
        if (skinCompatProgressBarHelper != null) {
            skinCompatProgressBarHelper.applySkin();
        }
    }
}
