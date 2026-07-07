package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class ProgressButton extends androidx.appcompat.widget.AppCompatButton implements skin.support.widget.SkinCompatSupportable {
    private android.content.Context context;
    private int defaultButtonColorId;
    private int defaultProgressColorId;
    private skin.support.widget.SkinCompatBackgroundHelper helper;
    private float mCornerRadius;
    private android.graphics.drawable.GradientDrawable mDrawableButton;
    private android.graphics.drawable.GradientDrawable mDrawableProgress;
    private android.graphics.drawable.GradientDrawable mDrawableProgressBackground;
    private boolean mFinish;
    private int mMaxProgress;
    private int mMinProgress;
    private int mProgress;
    private float mProgressMargin;

    public ProgressButton(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mCornerRadius = 0.0f;
        this.mProgressMargin = 0.0f;
        this.mMaxProgress = 100;
        this.mMinProgress = 0;
        this.defaultButtonColorId = 0;
        this.defaultProgressColorId = 0;
        this.context = context;
        initialize(context, attrs);
    }

    public ProgressButton(android.content.Context context, android.util.AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.mCornerRadius = 0.0f;
        this.mProgressMargin = 0.0f;
        this.mMaxProgress = 100;
        this.mMinProgress = 0;
        this.defaultButtonColorId = 0;
        this.defaultProgressColorId = 0;
        this.context = context;
        initialize(context, attrs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initialize(android.content.Context context, android.util.AttributeSet attrs) {
        this.mDrawableProgressBackground = new android.graphics.drawable.GradientDrawable();
        this.mDrawableProgress = new android.graphics.drawable.GradientDrawable();
        this.mDrawableButton = new android.graphics.drawable.GradientDrawable();
        int color = androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00);
        int color2 = androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00);
        int color3 = androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.color_e3e3e3);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.ProgressButton);
        try {
            this.mProgressMargin = obtainStyledAttributes.getDimension(7, this.mProgressMargin);
            this.mCornerRadius = obtainStyledAttributes.getDimension(1, this.mCornerRadius);
            int color4 = obtainStyledAttributes.getColor(0, color);
            this.defaultButtonColorId = obtainStyledAttributes.getResourceId(0, 0);
            this.mDrawableButton.setColor(color4);
            this.mDrawableProgressBackground.setColor(obtainStyledAttributes.getColor(5, color3));
            int color5 = obtainStyledAttributes.getColor(6, color2);
            this.defaultProgressColorId = obtainStyledAttributes.getResourceId(6, 0);
            this.mDrawableProgress.setColor(color5);
            this.mProgress = obtainStyledAttributes.getInteger(4, this.mProgress);
            this.mMinProgress = obtainStyledAttributes.getInteger(3, this.mMinProgress);
            this.mMaxProgress = obtainStyledAttributes.getInteger(2, this.mMaxProgress);
            skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = new skin.support.widget.SkinCompatBackgroundHelper(this);
            this.helper = skinCompatBackgroundHelper;
            skinCompatBackgroundHelper.onSetBackgroundResource(com.qcwireless.qcwatch.R.drawable.sel_btn_user_center);
            obtainStyledAttributes.recycle();
            this.mDrawableButton.setCornerRadius(this.mCornerRadius);
            this.mDrawableProgressBackground.setCornerRadius(this.mCornerRadius);
            this.mDrawableProgress.setCornerRadius(this.mCornerRadius - this.mProgressMargin);
            setBackgroundDrawable(this.mDrawableButton);
            this.mFinish = false;
            applyTextColor();
        } catch (java.lang.Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void applyTextColor() {
        int checkResourceId = skin.support.widget.SkinCompatHelper.checkResourceId(this.defaultButtonColorId);
        if (checkResourceId != 0) {
            this.mDrawableButton.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, checkResourceId));
        }
        int checkResourceId2 = skin.support.widget.SkinCompatHelper.checkResourceId(this.defaultProgressColorId);
        if (checkResourceId2 != 0) {
            this.mDrawableProgress.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, checkResourceId2));
        }
    }

    protected void onDraw(android.graphics.Canvas canvas) {
        int i = this.mProgress;
        if (i > this.mMinProgress && i <= this.mMaxProgress && !this.mFinish) {
            float measuredWidth = getMeasuredWidth();
            int i2 = this.mProgress;
            float f = measuredWidth * (((i2 - r2) / this.mMaxProgress) - this.mMinProgress);
            float f2 = this.mCornerRadius;
            if (f < f2 * 2.0f) {
                f = f2 * 2.0f;
            }
            android.graphics.drawable.GradientDrawable gradientDrawable = this.mDrawableProgress;
            float f3 = this.mProgressMargin;
            gradientDrawable.setBounds((int) f3, (int) f3, (int) (f - f3), getMeasuredHeight() - ((int) this.mProgressMargin));
            this.mDrawableProgress.draw(canvas);
            if (this.mProgress == this.mMaxProgress) {
                setBackgroundDrawable(this.mDrawableButton);
                this.mFinish = true;
            }
        }
        super.onDraw(canvas);
    }

    public void setProgress(int progress) {
        if (this.mFinish) {
            return;
        }
        this.mProgress = progress;
        setBackgroundDrawable(this.mDrawableProgressBackground);
        invalidate();
    }

    public void setMaxProgress(int maxProgress) {
        this.mMaxProgress = maxProgress;
    }

    public void setMinProgress(int minProgress) {
        this.mMinProgress = minProgress;
    }

    public void reset() {
        this.mFinish = false;
        this.mProgress = this.mMinProgress;
    }

    public void setButtonColor(boolean mainColor) {
        if (mainColor) {
            this.mDrawableButton.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        } else {
            this.mDrawableButton.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, com.qcwireless.qcwatch.R.color.profile_btn_bg));
        }
    }

    public void applySkin() {
        applyTextColor();
        this.helper.applySkin();
    }
}
