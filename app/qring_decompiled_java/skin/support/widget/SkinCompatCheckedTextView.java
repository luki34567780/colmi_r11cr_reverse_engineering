package skin.support.widget;

/* loaded from: classes3.dex */
public class SkinCompatCheckedTextView extends androidx.appcompat.widget.AppCompatCheckedTextView implements skin.support.widget.SkinCompatSupportable {
    private static final int[] TINT_ATTRS = {android.R.attr.checkMark};
    private skin.support.widget.SkinCompatBackgroundHelper mBackgroundTintHelper;
    private int mCheckMarkResId;
    private skin.support.widget.SkinCompatTextHelper mTextHelper;

    public SkinCompatCheckedTextView(android.content.Context context) {
        this(context, null);
    }

    public SkinCompatCheckedTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, skin.support.appcompat.R.attr.checkedTextViewStyle);
    }

    public SkinCompatCheckedTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCheckMarkResId = 0;
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = new skin.support.widget.SkinCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = skinCompatBackgroundHelper;
        skinCompatBackgroundHelper.loadFromAttributes(attributeSet, i);
        skin.support.widget.SkinCompatTextHelper create = skin.support.widget.SkinCompatTextHelper.create(this);
        this.mTextHelper = create;
        create.loadFromAttributes(attributeSet, i);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TINT_ATTRS, i, 0);
        this.mCheckMarkResId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        applyCheckMark();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckedTextView, android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        this.mCheckMarkResId = i;
        applyCheckMark();
    }

    @Override // android.view.View
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

    @Override // androidx.appcompat.widget.AppCompatCheckedTextView, android.widget.TextView
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
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.applySkin();
        }
        skin.support.widget.SkinCompatTextHelper skinCompatTextHelper = this.mTextHelper;
        if (skinCompatTextHelper != null) {
            skinCompatTextHelper.applySkin();
        }
        applyCheckMark();
    }

    private void applyCheckMark() {
        int checkResourceId = skin.support.widget.SkinCompatHelper.checkResourceId(this.mCheckMarkResId);
        this.mCheckMarkResId = checkResourceId;
        if (checkResourceId != 0) {
            setCheckMarkDrawable(skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(getContext(), this.mCheckMarkResId));
        }
    }
}
