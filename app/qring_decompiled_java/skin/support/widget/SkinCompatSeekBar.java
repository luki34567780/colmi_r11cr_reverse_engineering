package skin.support.widget;

/* loaded from: classes3.dex */
public class SkinCompatSeekBar extends androidx.appcompat.widget.AppCompatSeekBar implements skin.support.widget.SkinCompatSupportable {
    private skin.support.widget.SkinCompatSeekBarHelper mSkinCompatSeekBarHelper;

    public SkinCompatSeekBar(android.content.Context context) {
        this(context, null);
    }

    public SkinCompatSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, skin.support.appcompat.R.attr.seekBarStyle);
    }

    public SkinCompatSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        skin.support.widget.SkinCompatSeekBarHelper skinCompatSeekBarHelper = new skin.support.widget.SkinCompatSeekBarHelper(this);
        this.mSkinCompatSeekBarHelper = skinCompatSeekBarHelper;
        skinCompatSeekBarHelper.loadFromAttributes(attributeSet, i);
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        skin.support.widget.SkinCompatSeekBarHelper skinCompatSeekBarHelper = this.mSkinCompatSeekBarHelper;
        if (skinCompatSeekBarHelper != null) {
            skinCompatSeekBarHelper.applySkin();
        }
    }
}
