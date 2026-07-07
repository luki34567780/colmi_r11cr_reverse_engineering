package skin.support.widget;

/* loaded from: classes3.dex */
public class SkinCompatCheckBox extends androidx.appcompat.widget.AppCompatCheckBox implements skin.support.widget.SkinCompatSupportable {
    private skin.support.widget.SkinCompatBackgroundHelper mBackgroundTintHelper;
    private skin.support.widget.SkinCompatCompoundButtonHelper mCompoundButtonHelper;
    private skin.support.widget.SkinCompatTextHelper mTextHelper;

    public SkinCompatCheckBox(android.content.Context context) {
        this(context, null);
    }

    public SkinCompatCheckBox(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, skin.support.appcompat.R.attr.checkboxStyle);
    }

    public SkinCompatCheckBox(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        skin.support.widget.SkinCompatCompoundButtonHelper skinCompatCompoundButtonHelper = new skin.support.widget.SkinCompatCompoundButtonHelper(this);
        this.mCompoundButtonHelper = skinCompatCompoundButtonHelper;
        skinCompatCompoundButtonHelper.loadFromAttributes(attributeSet, i);
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = new skin.support.widget.SkinCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = skinCompatBackgroundHelper;
        skinCompatBackgroundHelper.loadFromAttributes(attributeSet, i);
        skin.support.widget.SkinCompatTextHelper create = skin.support.widget.SkinCompatTextHelper.create(this);
        this.mTextHelper = create;
        create.loadFromAttributes(attributeSet, i);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        super.setButtonDrawable(i);
        skin.support.widget.SkinCompatCompoundButtonHelper skinCompatCompoundButtonHelper = this.mCompoundButtonHelper;
        if (skinCompatCompoundButtonHelper != null) {
            skinCompatCompoundButtonHelper.setButtonDrawable(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.onSetBackgroundResource(i);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        setTextAppearance(getContext(), i);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        skin.support.widget.SkinCompatTextHelper skinCompatTextHelper = this.mTextHelper;
        if (skinCompatTextHelper != null) {
            skinCompatTextHelper.onSetTextAppearance(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        skin.support.widget.SkinCompatTextHelper skinCompatTextHelper = this.mTextHelper;
        if (skinCompatTextHelper != null) {
            skinCompatTextHelper.onSetCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        skin.support.widget.SkinCompatTextHelper skinCompatTextHelper = this.mTextHelper;
        if (skinCompatTextHelper != null) {
            skinCompatTextHelper.onSetCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        }
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        skin.support.widget.SkinCompatCompoundButtonHelper skinCompatCompoundButtonHelper = this.mCompoundButtonHelper;
        if (skinCompatCompoundButtonHelper != null) {
            skinCompatCompoundButtonHelper.applySkin();
        }
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.applySkin();
        }
        skin.support.widget.SkinCompatTextHelper skinCompatTextHelper = this.mTextHelper;
        if (skinCompatTextHelper != null) {
            skinCompatTextHelper.applySkin();
        }
    }
}
