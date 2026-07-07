package skin.support.widget;

/* loaded from: classes3.dex */
public class SkinCompatTextHelperV17 extends skin.support.widget.SkinCompatTextHelper {
    private int mDrawableEndResId;
    private int mDrawableStartResId;

    public SkinCompatTextHelperV17(android.widget.TextView textView) {
        super(textView);
        this.mDrawableStartResId = 0;
        this.mDrawableEndResId = 0;
    }

    @Override // skin.support.widget.SkinCompatTextHelper
    public void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, skin.support.R.styleable.SkinCompatTextHelper, i, 0);
        if (obtainStyledAttributes.hasValue(skin.support.R.styleable.SkinCompatTextHelper_android_drawableStart)) {
            int resourceId = obtainStyledAttributes.getResourceId(skin.support.R.styleable.SkinCompatTextHelper_android_drawableStart, 0);
            this.mDrawableStartResId = resourceId;
            this.mDrawableStartResId = skin.support.widget.SkinCompatHelper.checkResourceId(resourceId);
        }
        if (obtainStyledAttributes.hasValue(skin.support.R.styleable.SkinCompatTextHelper_android_drawableEnd)) {
            int resourceId2 = obtainStyledAttributes.getResourceId(skin.support.R.styleable.SkinCompatTextHelper_android_drawableEnd, 0);
            this.mDrawableEndResId = resourceId2;
            this.mDrawableEndResId = skin.support.widget.SkinCompatHelper.checkResourceId(resourceId2);
        }
        obtainStyledAttributes.recycle();
        super.loadFromAttributes(attributeSet, i);
    }

    @Override // skin.support.widget.SkinCompatTextHelper
    public void onSetCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        this.mDrawableStartResId = i;
        this.mDrawableTopResId = i2;
        this.mDrawableEndResId = i3;
        this.mDrawableBottomResId = i4;
        applyCompoundDrawablesRelativeResource();
    }

    @Override // skin.support.widget.SkinCompatTextHelper
    protected void applyCompoundDrawablesRelativeResource() {
        this.mDrawableLeftResId = checkResourceId(this.mDrawableLeftResId);
        android.graphics.drawable.Drawable drawableCompat = this.mDrawableLeftResId != 0 ? skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(this.mView.getContext(), this.mDrawableLeftResId) : null;
        this.mDrawableTopResId = checkResourceId(this.mDrawableTopResId);
        android.graphics.drawable.Drawable drawableCompat2 = this.mDrawableTopResId != 0 ? skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(this.mView.getContext(), this.mDrawableTopResId) : null;
        this.mDrawableRightResId = checkResourceId(this.mDrawableRightResId);
        android.graphics.drawable.Drawable drawableCompat3 = this.mDrawableRightResId != 0 ? skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(this.mView.getContext(), this.mDrawableRightResId) : null;
        this.mDrawableBottomResId = checkResourceId(this.mDrawableBottomResId);
        android.graphics.drawable.Drawable drawableCompat4 = this.mDrawableBottomResId != 0 ? skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(this.mView.getContext(), this.mDrawableBottomResId) : null;
        android.graphics.drawable.Drawable drawableCompat5 = this.mDrawableStartResId != 0 ? skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(this.mView.getContext(), this.mDrawableStartResId) : null;
        if (drawableCompat5 != null) {
            drawableCompat = drawableCompat5;
        }
        android.graphics.drawable.Drawable drawableCompat6 = this.mDrawableEndResId != 0 ? skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(this.mView.getContext(), this.mDrawableEndResId) : null;
        if (drawableCompat6 != null) {
            drawableCompat3 = drawableCompat6;
        }
        if (this.mDrawableLeftResId == 0 && this.mDrawableTopResId == 0 && this.mDrawableRightResId == 0 && this.mDrawableBottomResId == 0 && this.mDrawableStartResId == 0 && this.mDrawableEndResId == 0) {
            return;
        }
        this.mView.setCompoundDrawablesWithIntrinsicBounds(drawableCompat, drawableCompat2, drawableCompat3, drawableCompat4);
    }
}
