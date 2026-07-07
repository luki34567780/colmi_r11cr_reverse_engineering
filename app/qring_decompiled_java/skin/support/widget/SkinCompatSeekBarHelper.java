package skin.support.widget;

/* loaded from: classes3.dex */
public class SkinCompatSeekBarHelper extends skin.support.widget.SkinCompatProgressBarHelper {
    private int mThumbResId;
    private final android.widget.SeekBar mView;

    public SkinCompatSeekBarHelper(android.widget.SeekBar seekBar) {
        super(seekBar);
        this.mThumbResId = 0;
        this.mView = seekBar;
    }

    @Override // skin.support.widget.SkinCompatProgressBarHelper
    void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        super.loadFromAttributes(attributeSet, i);
        android.content.res.TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, skin.support.appcompat.R.styleable.AppCompatSeekBar, i, 0);
        this.mThumbResId = obtainStyledAttributes.getResourceId(skin.support.appcompat.R.styleable.AppCompatSeekBar_android_thumb, 0);
        obtainStyledAttributes.recycle();
        applySkin();
    }

    @Override // skin.support.widget.SkinCompatProgressBarHelper, skin.support.widget.SkinCompatHelper
    public void applySkin() {
        super.applySkin();
        int checkResourceId = checkResourceId(this.mThumbResId);
        this.mThumbResId = checkResourceId;
        if (checkResourceId != 0) {
            android.widget.SeekBar seekBar = this.mView;
            seekBar.setThumb(skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(seekBar.getContext(), this.mThumbResId));
        }
    }
}
