package skin.support.widget;

/* loaded from: classes3.dex */
public class SkinCompatAutoCompleteTextView extends androidx.appcompat.widget.AppCompatAutoCompleteTextView implements skin.support.widget.SkinCompatSupportable {
    private static final int[] TINT_ATTRS = {android.R.attr.popupBackground};
    private skin.support.widget.SkinCompatBackgroundHelper mBackgroundTintHelper;
    private int mDropDownBackgroundResId;
    private skin.support.widget.SkinCompatTextHelper mTextHelper;

    public SkinCompatAutoCompleteTextView(android.content.Context context) {
        this(context, null);
    }

    public SkinCompatAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, skin.support.appcompat.R.attr.autoCompleteTextViewStyle);
    }

    public SkinCompatAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDropDownBackgroundResId = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TINT_ATTRS, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.mDropDownBackgroundResId = obtainStyledAttributes.getResourceId(0, 0);
        }
        obtainStyledAttributes.recycle();
        applyDropDownBackgroundResource();
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = new skin.support.widget.SkinCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = skinCompatBackgroundHelper;
        skinCompatBackgroundHelper.loadFromAttributes(attributeSet, i);
        skin.support.widget.SkinCompatTextHelper create = skin.support.widget.SkinCompatTextHelper.create(this);
        this.mTextHelper = create;
        create.loadFromAttributes(attributeSet, i);
    }

    @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        super.setDropDownBackgroundResource(i);
        this.mDropDownBackgroundResId = i;
        applyDropDownBackgroundResource();
    }

    private void applyDropDownBackgroundResource() {
        android.graphics.drawable.Drawable drawableCompat;
        int checkResourceId = skin.support.widget.SkinCompatHelper.checkResourceId(this.mDropDownBackgroundResId);
        this.mDropDownBackgroundResId = checkResourceId;
        if (checkResourceId == 0 || (drawableCompat = skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(getContext(), this.mDropDownBackgroundResId)) == null) {
            return;
        }
        setDropDownBackgroundDrawable(drawableCompat);
    }

    @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.view.View
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

    @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView
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
        applyDropDownBackgroundResource();
    }
}
