package skin.support.widget;

/* loaded from: classes3.dex */
public class SkinCompatCompoundButtonHelper extends skin.support.widget.SkinCompatHelper {
    private int mButtonResourceId = 0;
    private int mButtonTintResId = 0;
    private final android.widget.CompoundButton mView;

    public SkinCompatCompoundButtonHelper(android.widget.CompoundButton compoundButton) {
        this.mView = compoundButton;
    }

    void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, skin.support.appcompat.R.styleable.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(skin.support.appcompat.R.styleable.CompoundButton_android_button)) {
                this.mButtonResourceId = obtainStyledAttributes.getResourceId(skin.support.appcompat.R.styleable.CompoundButton_android_button, 0);
            }
            if (obtainStyledAttributes.hasValue(skin.support.appcompat.R.styleable.CompoundButton_buttonTint)) {
                this.mButtonTintResId = obtainStyledAttributes.getResourceId(skin.support.appcompat.R.styleable.CompoundButton_buttonTint, 0);
            }
            obtainStyledAttributes.recycle();
            applySkin();
        } catch (java.lang.Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setButtonDrawable(int i) {
        this.mButtonResourceId = i;
        applySkin();
    }

    @Override // skin.support.widget.SkinCompatHelper
    public void applySkin() {
        int checkResourceId = skin.support.widget.SkinCompatHelper.checkResourceId(this.mButtonResourceId);
        this.mButtonResourceId = checkResourceId;
        if (checkResourceId != 0) {
            android.widget.CompoundButton compoundButton = this.mView;
            compoundButton.setButtonDrawable(skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(compoundButton.getContext(), this.mButtonResourceId));
        }
        int checkResourceId2 = skin.support.widget.SkinCompatHelper.checkResourceId(this.mButtonTintResId);
        this.mButtonTintResId = checkResourceId2;
        if (checkResourceId2 != 0) {
            android.widget.CompoundButton compoundButton2 = this.mView;
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(compoundButton2, skin.support.content.res.SkinCompatResources.getColorStateList(compoundButton2.getContext(), this.mButtonTintResId));
        }
    }
}
