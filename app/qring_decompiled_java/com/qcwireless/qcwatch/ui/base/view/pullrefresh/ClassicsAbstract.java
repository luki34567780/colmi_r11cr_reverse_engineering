package com.qcwireless.qcwatch.ui.base.view.pullrefresh;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class ClassicsAbstract<T extends com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsAbstract> extends com.scwang.smart.refresh.layout.simple.SimpleComponent implements com.scwang.smart.refresh.layout.api.RefreshComponent {
    public static final int ID_IMAGE_ARROW = 2131297301;
    public static final int ID_IMAGE_PROGRESS = 2131297302;
    public static final int ID_TEXT_TITLE = 2131297303;
    protected com.qcwireless.qcwatch.ui.base.view.pullrefresh.PaintDrawable mArrowDrawable;
    protected android.widget.ImageView mArrowView;
    protected int mBackgroundColor;
    protected int mFinishDuration;
    protected int mMinHeightOfContent;
    protected int mPaddingBottom;
    protected int mPaddingTop;
    protected com.qcwireless.qcwatch.ui.base.view.pullrefresh.PaintDrawable mProgressDrawable;
    protected android.widget.ImageView mProgressView;
    protected com.scwang.smart.refresh.layout.api.RefreshKernel mRefreshKernel;
    protected boolean mSetAccentColor;
    protected boolean mSetPrimaryColor;
    protected android.widget.TextView mTitleText;

    protected T self() {
        return this;
    }

    public ClassicsAbstract(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mFinishDuration = 500;
        this.mPaddingTop = 20;
        this.mPaddingBottom = 20;
        this.mMinHeightOfContent = 0;
        this.mSpinnerStyle = com.scwang.smart.refresh.layout.constant.SpinnerStyle.Translate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.mMinHeightOfContent == 0) {
            this.mPaddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            this.mPaddingBottom = paddingBottom;
            if (this.mPaddingTop == 0 || paddingBottom == 0) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i = this.mPaddingTop;
                if (i == 0) {
                    i = com.scwang.smart.refresh.layout.util.SmartUtil.dp2px(20.0f);
                }
                this.mPaddingTop = i;
                int i2 = this.mPaddingBottom;
                if (i2 == 0) {
                    i2 = com.scwang.smart.refresh.layout.util.SmartUtil.dp2px(20.0f);
                }
                this.mPaddingBottom = i2;
                setPadding(paddingLeft, this.mPaddingTop, paddingRight, i2);
            }
            setClipToPadding(false);
        }
        if (android.view.View.MeasureSpec.getMode(heightMeasureSpec) == 1073741824) {
            int size = android.view.View.MeasureSpec.getSize(heightMeasureSpec);
            int i3 = this.mMinHeightOfContent;
            if (size < i3) {
                int i4 = (size - i3) / 2;
                setPadding(getPaddingLeft(), i4, getPaddingRight(), i4);
            } else {
                setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
            }
        } else {
            setPadding(getPaddingLeft(), this.mPaddingTop, getPaddingRight(), this.mPaddingBottom);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.mMinHeightOfContent == 0) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                int measuredHeight = getChildAt(i5).getMeasuredHeight();
                if (this.mMinHeightOfContent < measuredHeight) {
                    this.mMinHeightOfContent = measuredHeight;
                }
            }
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.widget.ImageView imageView = this.mArrowView;
        android.widget.ImageView imageView2 = this.mProgressView;
        imageView.animate().cancel();
        imageView2.animate().cancel();
        java.lang.Object drawable = this.mProgressView.getDrawable();
        if (drawable instanceof android.graphics.drawable.Animatable) {
            android.graphics.drawable.Animatable animatable = (android.graphics.drawable.Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    public void onInitialized(com.scwang.smart.refresh.layout.api.RefreshKernel kernel, int height, int maxDragHeight) {
        this.mRefreshKernel = kernel;
        kernel.requestDrawBackgroundFor(this, this.mBackgroundColor);
    }

    public void onStartAnimator(com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout, int height, int maxDragHeight) {
        android.widget.ImageView imageView = this.mProgressView;
        if (imageView.getVisibility() != 0) {
            imageView.setVisibility(0);
            java.lang.Object drawable = this.mProgressView.getDrawable();
            if (drawable instanceof android.graphics.drawable.Animatable) {
                ((android.graphics.drawable.Animatable) drawable).start();
            } else {
                imageView.animate().rotation(36000.0f).setDuration(100000L);
            }
        }
    }

    public void onReleased(com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout, int height, int maxDragHeight) {
        onStartAnimator(refreshLayout, height, maxDragHeight);
    }

    public int onFinish(com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout, boolean success) {
        android.widget.ImageView imageView = this.mProgressView;
        java.lang.Object drawable = imageView.getDrawable();
        if (drawable instanceof android.graphics.drawable.Animatable) {
            android.graphics.drawable.Animatable animatable = (android.graphics.drawable.Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        } else {
            imageView.animate().rotation(0.0f).setDuration(0L);
        }
        imageView.setVisibility(8);
        return this.mFinishDuration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPrimaryColors(int... colors) {
        if (colors.length > 0) {
            if (!(getBackground() instanceof android.graphics.drawable.BitmapDrawable) && !this.mSetPrimaryColor) {
                setPrimaryColor(colors[0]);
                this.mSetPrimaryColor = false;
            }
            if (this.mSetAccentColor) {
                return;
            }
            if (colors.length > 1) {
                setAccentColor(colors[1]);
            }
            this.mSetAccentColor = false;
        }
    }

    public T setProgressBitmap(android.graphics.Bitmap bitmap) {
        this.mProgressDrawable = null;
        this.mProgressView.setImageBitmap(bitmap);
        return self();
    }

    public T setProgressDrawable(android.graphics.drawable.Drawable drawable) {
        this.mProgressDrawable = null;
        this.mProgressView.setImageDrawable(drawable);
        return self();
    }

    public T setProgressResource(int resId) {
        this.mProgressDrawable = null;
        this.mProgressView.setImageResource(resId);
        return self();
    }

    public T setArrowBitmap(android.graphics.Bitmap bitmap) {
        this.mArrowDrawable = null;
        this.mArrowView.setImageBitmap(bitmap);
        return self();
    }

    public T setArrowDrawable(android.graphics.drawable.Drawable drawable) {
        this.mArrowDrawable = null;
        this.mArrowView.setImageDrawable(drawable);
        return self();
    }

    public T setArrowResource(int resId) {
        this.mArrowDrawable = null;
        this.mArrowView.setImageResource(resId);
        return self();
    }

    public T setSpinnerStyle(com.scwang.smart.refresh.layout.constant.SpinnerStyle style) {
        this.mSpinnerStyle = style;
        return self();
    }

    public T setPrimaryColor(int primaryColor) {
        this.mSetPrimaryColor = true;
        this.mBackgroundColor = primaryColor;
        com.scwang.smart.refresh.layout.api.RefreshKernel refreshKernel = this.mRefreshKernel;
        if (refreshKernel != null) {
            refreshKernel.requestDrawBackgroundFor(this, primaryColor);
        }
        return self();
    }

    public T setAccentColor(int accentColor) {
        this.mSetAccentColor = true;
        this.mTitleText.setTextColor(accentColor);
        com.qcwireless.qcwatch.ui.base.view.pullrefresh.PaintDrawable paintDrawable = this.mArrowDrawable;
        if (paintDrawable != null) {
            paintDrawable.setColor(accentColor);
            this.mArrowView.invalidateDrawable(this.mArrowDrawable);
        }
        com.qcwireless.qcwatch.ui.base.view.pullrefresh.PaintDrawable paintDrawable2 = this.mProgressDrawable;
        if (paintDrawable2 != null) {
            paintDrawable2.setColor(accentColor);
            this.mProgressView.invalidateDrawable(this.mProgressDrawable);
        }
        return self();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T setPrimaryColorId(int i) {
        setPrimaryColor(androidx.core.content.ContextCompat.getColor(getContext(), i));
        return (T) self();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T setAccentColorId(int i) {
        setAccentColor(androidx.core.content.ContextCompat.getColor(getContext(), i));
        return (T) self();
    }

    public T setFinishDuration(int delay) {
        this.mFinishDuration = delay;
        return self();
    }

    public T setTextSizeTitle(float size) {
        this.mTitleText.setTextSize(size);
        com.scwang.smart.refresh.layout.api.RefreshKernel refreshKernel = this.mRefreshKernel;
        if (refreshKernel != null) {
            refreshKernel.requestRemeasureHeightFor(this);
        }
        return self();
    }

    public T setTextSizeTitle(int unit, float size) {
        this.mTitleText.setTextSize(unit, size);
        com.scwang.smart.refresh.layout.api.RefreshKernel refreshKernel = this.mRefreshKernel;
        if (refreshKernel != null) {
            refreshKernel.requestRemeasureHeightFor(this);
        }
        return self();
    }

    public T setDrawableMarginRight(float dp) {
        android.widget.ImageView imageView = this.mArrowView;
        android.widget.ImageView imageView2 = this.mProgressView;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
        int dp2px = com.scwang.smart.refresh.layout.util.SmartUtil.dp2px(dp);
        marginLayoutParams2.rightMargin = dp2px;
        marginLayoutParams.rightMargin = dp2px;
        imageView.setLayoutParams(marginLayoutParams);
        imageView2.setLayoutParams(marginLayoutParams2);
        return self();
    }

    public T setDrawableMarginRightPx(int px) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.mArrowView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) this.mProgressView.getLayoutParams();
        marginLayoutParams2.rightMargin = px;
        marginLayoutParams.rightMargin = px;
        this.mArrowView.setLayoutParams(marginLayoutParams);
        this.mProgressView.setLayoutParams(marginLayoutParams2);
        return self();
    }

    public T setDrawableSize(float dp) {
        android.widget.ImageView imageView = this.mArrowView;
        android.widget.ImageView imageView2 = this.mProgressView;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int dp2px = com.scwang.smart.refresh.layout.util.SmartUtil.dp2px(dp);
        layoutParams2.width = dp2px;
        layoutParams.width = dp2px;
        int dp2px2 = com.scwang.smart.refresh.layout.util.SmartUtil.dp2px(dp);
        layoutParams2.height = dp2px2;
        layoutParams.height = dp2px2;
        imageView.setLayoutParams(layoutParams);
        imageView2.setLayoutParams(layoutParams2);
        return self();
    }

    public T setDrawableSizePx(int px) {
        android.view.ViewGroup.LayoutParams layoutParams = this.mArrowView.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutParams2 = this.mProgressView.getLayoutParams();
        layoutParams2.width = px;
        layoutParams.width = px;
        layoutParams2.height = px;
        layoutParams.height = px;
        this.mArrowView.setLayoutParams(layoutParams);
        this.mProgressView.setLayoutParams(layoutParams2);
        return self();
    }

    public T setDrawableArrowSize(float dp) {
        android.widget.ImageView imageView = this.mArrowView;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int dp2px = com.scwang.smart.refresh.layout.util.SmartUtil.dp2px(dp);
        layoutParams.width = dp2px;
        layoutParams.height = dp2px;
        imageView.setLayoutParams(layoutParams);
        return self();
    }

    public T setDrawableArrowSizePx(int px) {
        android.view.ViewGroup.LayoutParams layoutParams = this.mArrowView.getLayoutParams();
        layoutParams.width = px;
        layoutParams.height = px;
        this.mArrowView.setLayoutParams(layoutParams);
        return self();
    }

    public T setDrawableProgressSize(float dp) {
        android.widget.ImageView imageView = this.mProgressView;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int dp2px = com.scwang.smart.refresh.layout.util.SmartUtil.dp2px(dp);
        layoutParams.width = dp2px;
        layoutParams.height = dp2px;
        imageView.setLayoutParams(layoutParams);
        return self();
    }

    public T setDrawableProgressSizePx(int px) {
        android.view.ViewGroup.LayoutParams layoutParams = this.mProgressView.getLayoutParams();
        layoutParams.width = px;
        layoutParams.height = px;
        this.mProgressView.setLayoutParams(layoutParams);
        return self();
    }
}
