package skin.support.widget;

/* loaded from: classes3.dex */
public class SkinCompatBackgroundHelper extends skin.support.widget.SkinCompatHelper {
    private int mBackgroundResId = 0;
    private final android.view.View mView;

    public SkinCompatBackgroundHelper(android.view.View view) {
        this.mView = view;
    }

    public void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, skin.support.R.styleable.SkinBackgroundHelper, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(skin.support.R.styleable.SkinBackgroundHelper_android_background)) {
                this.mBackgroundResId = obtainStyledAttributes.getResourceId(skin.support.R.styleable.SkinBackgroundHelper_android_background, 0);
            }
            obtainStyledAttributes.recycle();
            applySkin();
        } catch (java.lang.Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void onSetBackgroundResource(int i) {
        this.mBackgroundResId = i;
        applySkin();
    }

    @Override // skin.support.widget.SkinCompatHelper
    public void applySkin() {
        android.graphics.drawable.Drawable drawableCompat;
        int checkResourceId = checkResourceId(this.mBackgroundResId);
        this.mBackgroundResId = checkResourceId;
        if (checkResourceId == 0 || (drawableCompat = skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(this.mView.getContext(), this.mBackgroundResId)) == null) {
            return;
        }
        int paddingLeft = this.mView.getPaddingLeft();
        int paddingTop = this.mView.getPaddingTop();
        int paddingRight = this.mView.getPaddingRight();
        int paddingBottom = this.mView.getPaddingBottom();
        androidx.core.view.ViewCompat.setBackground(this.mView, drawableCompat);
        this.mView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }
}
