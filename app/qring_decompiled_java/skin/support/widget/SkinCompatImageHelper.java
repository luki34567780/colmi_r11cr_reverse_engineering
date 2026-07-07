package skin.support.widget;

/* loaded from: classes3.dex */
public class SkinCompatImageHelper extends skin.support.widget.SkinCompatHelper {
    private static final java.lang.String TAG = "SkinCompatImageHelper";
    private final android.widget.ImageView mView;
    private int mSrcResId = 0;
    private int mSrcCompatResId = 0;
    private int mSrcTintResId = 0;

    public SkinCompatImageHelper(android.widget.ImageView imageView) {
        this.mView = imageView;
    }

    public void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray typedArray = null;
        try {
            typedArray = this.mView.getContext().obtainStyledAttributes(attributeSet, skin.support.R.styleable.SkinCompatImageView, i, 0);
            this.mSrcResId = typedArray.getResourceId(skin.support.R.styleable.SkinCompatImageView_android_src, 0);
            this.mSrcCompatResId = typedArray.getResourceId(skin.support.R.styleable.SkinCompatImageView_srcCompat, 0);
            int resourceId = typedArray.getResourceId(skin.support.R.styleable.SkinCompatImageView_tint, 0);
            this.mSrcTintResId = resourceId;
            if (resourceId == 0) {
                this.mSrcTintResId = typedArray.getResourceId(skin.support.R.styleable.SkinCompatImageView_android_tint, 0);
            }
            applySkin();
        } finally {
            if (typedArray != null) {
                typedArray.recycle();
            }
        }
    }

    public void setImageResource(int i) {
        this.mSrcResId = i;
        this.mSrcCompatResId = 0;
        applySkin();
    }

    @Override // skin.support.widget.SkinCompatHelper
    public void applySkin() {
        android.graphics.drawable.Drawable drawableCompat;
        int checkResourceId = checkResourceId(this.mSrcCompatResId);
        this.mSrcCompatResId = checkResourceId;
        if (checkResourceId != 0) {
            android.graphics.drawable.Drawable drawableCompat2 = skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(this.mView.getContext(), this.mSrcCompatResId);
            if (drawableCompat2 != null) {
                this.mView.setImageDrawable(drawableCompat2);
            }
        } else {
            int checkResourceId2 = checkResourceId(this.mSrcResId);
            this.mSrcResId = checkResourceId2;
            if (checkResourceId2 != 0 && (drawableCompat = skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(this.mView.getContext(), this.mSrcResId)) != null) {
                this.mView.setImageDrawable(drawableCompat);
            }
        }
        int checkResourceId3 = checkResourceId(this.mSrcTintResId);
        this.mSrcTintResId = checkResourceId3;
        if (checkResourceId3 != 0) {
            androidx.core.widget.ImageViewCompat.setImageTintList(this.mView, skin.support.content.res.SkinCompatResources.getColorStateList(this.mView.getContext(), this.mSrcTintResId));
        }
    }
}
