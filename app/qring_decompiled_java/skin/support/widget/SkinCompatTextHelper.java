package skin.support.widget;

/* loaded from: classes3.dex */
public class SkinCompatTextHelper extends skin.support.widget.SkinCompatHelper {
    private static final java.lang.String TAG = "SkinCompatTextHelper";
    final android.widget.TextView mView;
    private int mTextColorResId = 0;
    private int mTextColorHintResId = 0;
    protected int mDrawableBottomResId = 0;
    protected int mDrawableLeftResId = 0;
    protected int mDrawableRightResId = 0;
    protected int mDrawableTopResId = 0;

    public static skin.support.widget.SkinCompatTextHelper create(android.widget.TextView textView) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return new skin.support.widget.SkinCompatTextHelperV17(textView);
        }
        return new skin.support.widget.SkinCompatTextHelper(textView);
    }

    public SkinCompatTextHelper(android.widget.TextView textView) {
        this.mView = textView;
    }

    public void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        android.content.Context context = this.mView.getContext();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, skin.support.R.styleable.SkinCompatTextHelper, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(skin.support.R.styleable.SkinCompatTextHelper_android_textAppearance, 0);
        if (obtainStyledAttributes.hasValue(skin.support.R.styleable.SkinCompatTextHelper_android_drawableLeft)) {
            this.mDrawableLeftResId = obtainStyledAttributes.getResourceId(skin.support.R.styleable.SkinCompatTextHelper_android_drawableLeft, 0);
        }
        if (obtainStyledAttributes.hasValue(skin.support.R.styleable.SkinCompatTextHelper_android_drawableTop)) {
            this.mDrawableTopResId = obtainStyledAttributes.getResourceId(skin.support.R.styleable.SkinCompatTextHelper_android_drawableTop, 0);
        }
        if (obtainStyledAttributes.hasValue(skin.support.R.styleable.SkinCompatTextHelper_android_drawableRight)) {
            this.mDrawableRightResId = obtainStyledAttributes.getResourceId(skin.support.R.styleable.SkinCompatTextHelper_android_drawableRight, 0);
        }
        if (obtainStyledAttributes.hasValue(skin.support.R.styleable.SkinCompatTextHelper_android_drawableBottom)) {
            this.mDrawableBottomResId = obtainStyledAttributes.getResourceId(skin.support.R.styleable.SkinCompatTextHelper_android_drawableBottom, 0);
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, skin.support.R.styleable.SkinTextAppearance);
            if (obtainStyledAttributes2.hasValue(skin.support.R.styleable.SkinTextAppearance_android_textColor)) {
                this.mTextColorResId = obtainStyledAttributes2.getResourceId(skin.support.R.styleable.SkinTextAppearance_android_textColor, 0);
            }
            if (obtainStyledAttributes2.hasValue(skin.support.R.styleable.SkinTextAppearance_android_textColorHint)) {
                this.mTextColorHintResId = obtainStyledAttributes2.getResourceId(skin.support.R.styleable.SkinTextAppearance_android_textColorHint, 0);
            }
            obtainStyledAttributes2.recycle();
        }
        android.content.res.TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, skin.support.R.styleable.SkinTextAppearance, i, 0);
        if (obtainStyledAttributes3.hasValue(skin.support.R.styleable.SkinTextAppearance_android_textColor)) {
            this.mTextColorResId = obtainStyledAttributes3.getResourceId(skin.support.R.styleable.SkinTextAppearance_android_textColor, 0);
        }
        if (obtainStyledAttributes3.hasValue(skin.support.R.styleable.SkinTextAppearance_android_textColorHint)) {
            this.mTextColorHintResId = obtainStyledAttributes3.getResourceId(skin.support.R.styleable.SkinTextAppearance_android_textColorHint, 0);
        }
        obtainStyledAttributes3.recycle();
        applySkin();
    }

    public void onSetTextAppearance(android.content.Context context, int i) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, skin.support.R.styleable.SkinTextAppearance);
        if (obtainStyledAttributes.hasValue(skin.support.R.styleable.SkinTextAppearance_android_textColor)) {
            this.mTextColorResId = obtainStyledAttributes.getResourceId(skin.support.R.styleable.SkinTextAppearance_android_textColor, 0);
        }
        if (obtainStyledAttributes.hasValue(skin.support.R.styleable.SkinTextAppearance_android_textColorHint)) {
            this.mTextColorHintResId = obtainStyledAttributes.getResourceId(skin.support.R.styleable.SkinTextAppearance_android_textColorHint, 0);
        }
        obtainStyledAttributes.recycle();
        applyTextColorResource();
        applyTextColorHintResource();
    }

    private void applyTextColorHintResource() {
        int checkResourceId = checkResourceId(this.mTextColorHintResId);
        this.mTextColorHintResId = checkResourceId;
        if (checkResourceId != 0) {
            try {
                this.mView.setHintTextColor(skin.support.content.res.SkinCompatResources.getColorStateList(this.mView.getContext(), this.mTextColorHintResId));
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private void applyTextColorResource() {
        int checkResourceId = checkResourceId(this.mTextColorResId);
        this.mTextColorResId = checkResourceId;
        if (checkResourceId != 0) {
            try {
                this.mView.setTextColor(skin.support.content.res.SkinCompatResources.getColorStateList(this.mView.getContext(), this.mTextColorResId));
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public void onSetCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        this.mDrawableLeftResId = i;
        this.mDrawableTopResId = i2;
        this.mDrawableRightResId = i3;
        this.mDrawableBottomResId = i4;
        applyCompoundDrawablesRelativeResource();
    }

    public void onSetCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        this.mDrawableLeftResId = i;
        this.mDrawableTopResId = i2;
        this.mDrawableRightResId = i3;
        this.mDrawableBottomResId = i4;
        applyCompoundDrawablesResource();
    }

    protected void applyCompoundDrawablesRelativeResource() {
        applyCompoundDrawablesResource();
    }

    protected void applyCompoundDrawablesResource() {
        int checkResourceId = checkResourceId(this.mDrawableLeftResId);
        this.mDrawableLeftResId = checkResourceId;
        android.graphics.drawable.Drawable drawableCompat = checkResourceId != 0 ? skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(this.mView.getContext(), this.mDrawableLeftResId) : null;
        int checkResourceId2 = checkResourceId(this.mDrawableTopResId);
        this.mDrawableTopResId = checkResourceId2;
        android.graphics.drawable.Drawable drawableCompat2 = checkResourceId2 != 0 ? skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(this.mView.getContext(), this.mDrawableTopResId) : null;
        int checkResourceId3 = checkResourceId(this.mDrawableRightResId);
        this.mDrawableRightResId = checkResourceId3;
        android.graphics.drawable.Drawable drawableCompat3 = checkResourceId3 != 0 ? skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(this.mView.getContext(), this.mDrawableRightResId) : null;
        int checkResourceId4 = checkResourceId(this.mDrawableBottomResId);
        this.mDrawableBottomResId = checkResourceId4;
        android.graphics.drawable.Drawable drawableCompat4 = checkResourceId4 != 0 ? skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(this.mView.getContext(), this.mDrawableBottomResId) : null;
        if (this.mDrawableLeftResId == 0 && this.mDrawableTopResId == 0 && this.mDrawableRightResId == 0 && this.mDrawableBottomResId == 0) {
            return;
        }
        this.mView.setCompoundDrawablesWithIntrinsicBounds(drawableCompat, drawableCompat2, drawableCompat3, drawableCompat4);
    }

    public int getTextColorResId() {
        return this.mTextColorResId;
    }

    @Override // skin.support.widget.SkinCompatHelper
    public void applySkin() {
        applyCompoundDrawablesRelativeResource();
        applyTextColorResource();
        applyTextColorHintResource();
    }
}
