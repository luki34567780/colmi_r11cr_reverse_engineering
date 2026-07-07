package skin.support.widget;

/* loaded from: classes3.dex */
public class SkinCompatProgressBarHelper extends skin.support.widget.SkinCompatHelper {
    private android.graphics.Bitmap mSampleTile;
    private final android.widget.ProgressBar mView;
    private int mIndeterminateDrawableResId = 0;
    private int mProgressDrawableResId = 0;
    private int mIndeterminateTintResId = 0;

    SkinCompatProgressBarHelper(android.widget.ProgressBar progressBar) {
        this.mView = progressBar;
    }

    void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, skin.support.appcompat.R.styleable.SkinCompatProgressBar, i, 0);
        this.mIndeterminateDrawableResId = obtainStyledAttributes.getResourceId(skin.support.appcompat.R.styleable.SkinCompatProgressBar_android_indeterminateDrawable, 0);
        this.mProgressDrawableResId = obtainStyledAttributes.getResourceId(skin.support.appcompat.R.styleable.SkinCompatProgressBar_android_progressDrawable, 0);
        obtainStyledAttributes.recycle();
        if (android.os.Build.VERSION.SDK_INT > 21) {
            android.content.res.TypedArray obtainStyledAttributes2 = this.mView.getContext().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.indeterminateTint}, i, 0);
            this.mIndeterminateTintResId = obtainStyledAttributes2.getResourceId(0, 0);
            obtainStyledAttributes2.recycle();
        }
        applySkin();
    }

    private android.graphics.drawable.Drawable tileify(android.graphics.drawable.Drawable drawable, boolean z) {
        if (skin.support.utils.SkinCompatVersionUtils.isV4WrappedDrawable(drawable)) {
            android.graphics.drawable.Drawable v4WrappedDrawableWrappedDrawable = skin.support.utils.SkinCompatVersionUtils.getV4WrappedDrawableWrappedDrawable(drawable);
            if (v4WrappedDrawableWrappedDrawable != null) {
                skin.support.utils.SkinCompatVersionUtils.setV4WrappedDrawableWrappedDrawable(drawable, tileify(v4WrappedDrawableWrappedDrawable, z));
            }
        } else if (skin.support.utils.SkinCompatVersionUtils.isV4DrawableWrapper(drawable)) {
            android.graphics.drawable.Drawable v4DrawableWrapperWrappedDrawable = skin.support.utils.SkinCompatVersionUtils.getV4DrawableWrapperWrappedDrawable(drawable);
            if (v4DrawableWrapperWrappedDrawable != null) {
                skin.support.utils.SkinCompatVersionUtils.setV4DrawableWrapperWrappedDrawable(drawable, tileify(v4DrawableWrapperWrappedDrawable, z));
            }
        } else {
            if (drawable instanceof android.graphics.drawable.LayerDrawable) {
                android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = tileify(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                android.graphics.drawable.LayerDrawable layerDrawable2 = new android.graphics.drawable.LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
                android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawable;
                android.graphics.Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.mSampleTile == null) {
                    this.mSampleTile = bitmap;
                }
                android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(getDrawableShape());
                shapeDrawable.getPaint().setShader(new android.graphics.BitmapShader(bitmap, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new android.graphics.drawable.ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    private android.graphics.drawable.Drawable tileifyIndeterminate(android.graphics.drawable.Drawable drawable) {
        if (!(drawable instanceof android.graphics.drawable.AnimationDrawable)) {
            return drawable;
        }
        android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        android.graphics.drawable.AnimationDrawable animationDrawable2 = new android.graphics.drawable.AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            android.graphics.drawable.Drawable tileify = tileify(animationDrawable.getFrame(i), true);
            tileify.setLevel(10000);
            animationDrawable2.addFrame(tileify, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    private android.graphics.drawable.shapes.Shape getDrawableShape() {
        return new android.graphics.drawable.shapes.RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    @Override // skin.support.widget.SkinCompatHelper
    public void applySkin() {
        int checkResourceId = checkResourceId(this.mIndeterminateDrawableResId);
        this.mIndeterminateDrawableResId = checkResourceId;
        if (checkResourceId != 0) {
            android.graphics.drawable.Drawable drawableCompat = skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(this.mView.getContext(), this.mIndeterminateDrawableResId);
            drawableCompat.setBounds(this.mView.getIndeterminateDrawable().getBounds());
            this.mView.setIndeterminateDrawable(tileifyIndeterminate(drawableCompat));
        }
        int checkProgressDrawableResId = checkProgressDrawableResId(this.mProgressDrawableResId);
        this.mProgressDrawableResId = checkProgressDrawableResId;
        if (checkProgressDrawableResId != 0) {
            this.mView.setProgressDrawable(tileify(skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(this.mView.getContext(), this.mProgressDrawableResId), false));
        }
        if (android.os.Build.VERSION.SDK_INT > 21) {
            int checkResourceId2 = checkResourceId(this.mIndeterminateTintResId);
            this.mIndeterminateTintResId = checkResourceId2;
            if (checkResourceId2 != 0) {
                android.widget.ProgressBar progressBar = this.mView;
                progressBar.setIndeterminateTintList(skin.support.content.res.SkinCompatResources.getColorStateList(progressBar.getContext(), this.mIndeterminateTintResId));
            }
        }
    }

    private int checkProgressDrawableResId(int i) {
        return checkResourceId(i);
    }
}
