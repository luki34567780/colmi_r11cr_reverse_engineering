package com.qcwireless.qcwatch.ui.base.view.ucenter;

/* loaded from: /tmp/dex/classes2.dex */
public class MoneySelectRuleView extends android.view.View {
    private final int MAX_FLING_VELOCITY;
    private final int MIN_FLING_VELOCITY;
    private final int TOUCH_SLOP;
    private float balanceGap;
    private java.lang.String balanceText;
    private float balanceTextSize;
    private int balanceValue;
    private int bgColor;
    private int currentValue;
    private int gradationColor;
    private float gradationHeight;
    private float gradationLongLen;
    private float gradationLongWidth;
    private float gradationShortLen;
    private float gradationShortWidth;
    private int gradationTextColor;
    private float gradationTextSize;
    private float gradationValueGap;
    private int indicatorColor;
    private float mCurrentDistance;
    private int mDownX;
    private int mDownY;
    private int mHalfWidth;
    private int mHeight;
    private boolean mIsMoving;
    private int mLastX;
    private int mLastY;
    private com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView.OnValueChangedListener mListener;
    private android.graphics.Paint mPaint;
    private int mRangeDistance;
    private android.widget.Scroller mScroller;
    private android.text.TextPaint mTextPaint;
    private android.view.VelocityTracker mVelocityTracker;
    private int mWidth;
    private int mWidthRangeValue;
    private int maxValue;
    private float unitGap;
    private int valuePerCount;
    private int valueUnit;

    public interface OnValueChangedListener {
        void onValueChanged(int newValue);
    }

    public MoneySelectRuleView(android.content.Context context) {
        this(context, null);
    }

    public MoneySelectRuleView(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MoneySelectRuleView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.balanceText = "";
        initAttrs(context, attrs);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.TOUCH_SLOP = viewConfiguration.getScaledTouchSlop();
        this.MIN_FLING_VELOCITY = viewConfiguration.getScaledMinimumFlingVelocity();
        this.MAX_FLING_VELOCITY = viewConfiguration.getScaledMaximumFlingVelocity();
        calculateValues();
        init(context);
        setNestedScrollingEnabled(false);
    }

    private void calculateValues() {
        float f = this.currentValue;
        int i = this.valueUnit;
        float f2 = this.unitGap;
        this.mCurrentDistance = (f / i) * f2;
        this.mRangeDistance = (int) ((this.maxValue / i) * f2);
        this.mWidthRangeValue = (int) ((this.mWidth / f2) * i);
    }

    private void init(android.content.Context context) {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mPaint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.mPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.mPaint.setColor(this.gradationColor);
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        this.mTextPaint = textPaint;
        textPaint.setTextSize(this.balanceTextSize);
        this.mTextPaint.setColor(this.gradationTextColor);
        this.mScroller = new android.widget.Scroller(context);
        this.mVelocityTracker = android.view.VelocityTracker.obtain();
    }

    private void initAttrs(android.content.Context context, android.util.AttributeSet attrs) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.MoneySelectRuleView);
        this.bgColor = obtainStyledAttributes.getColor(16, skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.color_F9F9F9));
        this.gradationColor = obtainStyledAttributes.getColor(17, skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.q_view_temperature_5));
        this.gradationHeight = obtainStyledAttributes.getDimension(5, dp2px(20.0f));
        float dimension = obtainStyledAttributes.getDimension(8, dp2px(15.0f));
        this.gradationShortLen = dimension;
        this.gradationLongLen = obtainStyledAttributes.getDimension(6, dimension * 2.0f);
        float dimension2 = obtainStyledAttributes.getDimension(9, dp2px(1.2f));
        this.gradationShortWidth = dimension2;
        this.gradationLongWidth = obtainStyledAttributes.getDimension(7, dimension2);
        this.gradationValueGap = obtainStyledAttributes.getDimension(11, dp2px(10.0f));
        this.gradationTextSize = obtainStyledAttributes.getDimension(10, sp2px(12.0f));
        this.gradationTextColor = obtainStyledAttributes.getColor(19, -7829368);
        this.indicatorColor = obtainStyledAttributes.getColor(18, skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        this.balanceTextSize = obtainStyledAttributes.getDimension(2, sp2px(10.0f));
        this.unitGap = obtainStyledAttributes.getDimension(13, dp2px(6.0f));
        this.balanceText = obtainStyledAttributes.getString(1);
        this.balanceGap = obtainStyledAttributes.getDimension(0, dp2px(4.0f));
        this.maxValue = obtainStyledAttributes.getInt(12, 50000);
        this.currentValue = obtainStyledAttributes.getInt(4, 0);
        this.balanceValue = obtainStyledAttributes.getInt(3, 0);
        this.valueUnit = obtainStyledAttributes.getInt(15, 100);
        this.valuePerCount = obtainStyledAttributes.getInt(14, 10);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = android.view.View.MeasureSpec.getSize(widthMeasureSpec);
        this.mWidth = size;
        this.mHalfWidth = size >> 1;
        int mode = android.view.View.MeasureSpec.getMode(heightMeasureSpec);
        this.mHeight = android.view.View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            this.mHeight = dp2px(80.0f);
            this.gradationHeight = dp2px(60.0f);
        }
        int i = this.mWidth;
        this.mWidthRangeValue = (int) ((i / this.unitGap) * this.valueUnit);
        setMeasuredDimension(i, this.mHeight);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        int action = event.getAction();
        int x = (int) event.getX();
        int y = (int) event.getY();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = android.view.VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(event);
        logD("onTouchEvent: action=%d", java.lang.Integer.valueOf(action));
        if (action == 0) {
            this.mIsMoving = false;
            this.mDownX = x;
            this.mDownY = y;
            if (!this.mScroller.isFinished()) {
                this.mScroller.forceFinished(true);
            }
        } else if (action != 1) {
            if (action == 2) {
                int i = x - this.mLastX;
                if (!this.mIsMoving) {
                    int i2 = y - this.mLastY;
                    if (java.lang.Math.abs(x - this.mDownX) > this.TOUCH_SLOP && java.lang.Math.abs(i) >= java.lang.Math.abs(i2)) {
                        this.mIsMoving = true;
                    }
                }
                this.mCurrentDistance -= i;
                computeValue();
            } else if (action == 3 && !this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
            }
        } else if (this.mIsMoving) {
            this.mVelocityTracker.computeCurrentVelocity(1000, this.MAX_FLING_VELOCITY);
            int xVelocity = (int) this.mVelocityTracker.getXVelocity();
            logD("up: xVelocity=%d", java.lang.Integer.valueOf(xVelocity));
            if (java.lang.Math.abs(xVelocity) < this.MIN_FLING_VELOCITY) {
                scrollToGradation();
            } else {
                this.mScroller.fling((int) this.mCurrentDistance, 0, -xVelocity, 0, 0, this.mRangeDistance, 0, 0);
                invalidate();
            }
        }
        this.mLastX = x;
        this.mLastY = y;
        return true;
    }

    private void scrollToGradation() {
        int round = java.lang.Math.round(this.mCurrentDistance / this.unitGap) * this.valueUnit;
        this.currentValue = round;
        int min = java.lang.Math.min(this.maxValue, java.lang.Math.max(0, round));
        this.currentValue = min;
        this.mCurrentDistance = (min / this.valueUnit) * this.unitGap;
        logD("scrollToGradation: currentValue=%d, mCurrentDistance=%f", java.lang.Integer.valueOf(min), java.lang.Float.valueOf(this.mCurrentDistance));
        com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView.OnValueChangedListener onValueChangedListener = this.mListener;
        if (onValueChangedListener != null) {
            onValueChangedListener.onValueChanged(this.currentValue);
        }
        invalidate();
    }

    private void computeValue() {
        logD("computeValue: mRangeDistance=%d, mCurrentDistance=%f", java.lang.Integer.valueOf(this.mRangeDistance), java.lang.Float.valueOf(this.mCurrentDistance));
        float min = java.lang.Math.min(this.mRangeDistance, java.lang.Math.max(0.0f, this.mCurrentDistance));
        this.mCurrentDistance = min;
        int i = ((int) (min / this.unitGap)) * this.valueUnit;
        this.currentValue = i;
        com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView.OnValueChangedListener onValueChangedListener = this.mListener;
        if (onValueChangedListener != null) {
            onValueChangedListener.onValueChanged(i);
        }
        postInvalidate();
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        canvas.drawColor(this.bgColor);
        drawRule(canvas);
        drawIndicator(canvas);
    }

    private void drawRule(android.graphics.Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, this.gradationHeight);
        int i = this.valueUnit;
        int i2 = i * 3;
        int max = java.lang.Math.max(0, (((int) ((this.mCurrentDistance - this.mHalfWidth) / this.unitGap)) * i) - i2);
        int min = java.lang.Math.min(this.maxValue, max + i2 + this.mWidthRangeValue + i2);
        float f = this.mHalfWidth;
        float f2 = this.mCurrentDistance;
        int i3 = this.valueUnit;
        float f3 = f - (f2 - ((max / i3) * this.unitGap));
        int i4 = this.valuePerCount * i3;
        int i5 = this.balanceValue / i3;
        logD("drawRule: mCurrentDistance=%f, start=%d, end=%d, startOffset=%f, perCount=%d", java.lang.Float.valueOf(f2), java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(min), java.lang.Float.valueOf(f3), java.lang.Integer.valueOf(i4));
        while (max <= min) {
            if (max % i4 == 0) {
                this.mPaint.setStrokeWidth(this.gradationLongWidth);
                canvas.drawLine(f3, 0.0f, f3, -this.gradationLongLen, this.mPaint);
                this.mTextPaint.setTextSize(this.gradationTextSize);
                this.mTextPaint.setColor(this.gradationTextColor);
                java.lang.String num = java.lang.Integer.toString(max);
                canvas.drawText(num, f3 - (this.mTextPaint.measureText(num) * 0.5f), -(this.gradationLongLen + this.gradationValueGap), this.mTextPaint);
            } else {
                this.mPaint.setStrokeWidth(this.gradationShortWidth);
                canvas.drawLine(f3, 0.0f, f3, -this.gradationShortLen, this.mPaint);
            }
            max += this.valueUnit;
            f3 += this.unitGap;
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mScroller.computeScrollOffset()) {
            if (this.mScroller.getCurrX() == this.mScroller.getFinalX()) {
                scrollToGradation();
            } else {
                this.mCurrentDistance = this.mScroller.getCurrX();
                computeValue();
            }
        }
    }

    private void drawIndicator(android.graphics.Canvas canvas) {
        this.mPaint.setColor(this.indicatorColor);
        this.mPaint.setStrokeWidth(dp2px(2.0f));
        canvas.drawLine(this.mHalfWidth, dp2px(30.0f), this.mHalfWidth, this.gradationHeight + dp2px(10.0f), this.mPaint);
        canvas.drawCircle(this.mHalfWidth, (this.gradationHeight + dp2px(10.0f)) - dp2px(1.5f), dp2px(3.0f), this.mPaint);
        this.mPaint.setColor(this.gradationColor);
    }

    private int dp2px(float dp) {
        return (int) android.util.TypedValue.applyDimension(1, dp, getResources().getDisplayMetrics());
    }

    private int sp2px(float sp) {
        return (int) android.util.TypedValue.applyDimension(2, sp, getResources().getDisplayMetrics());
    }

    private void logD(java.lang.String format, java.lang.Object... args) {
        android.util.Log.d("MoneySelectRuleView", java.lang.String.format("zjun@" + format, args));
    }

    public int getValue() {
        return this.currentValue;
    }

    public void setValue(float value) {
        int i = this.valueUnit;
        int i2 = (((int) value) / i) * i;
        this.currentValue = i2;
        this.currentValue = java.lang.Math.min(this.maxValue, java.lang.Math.max(0, i2));
        if (!this.mScroller.isFinished()) {
            this.mScroller.forceFinished(true);
        }
        com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView.OnValueChangedListener onValueChangedListener = this.mListener;
        if (onValueChangedListener != null) {
            onValueChangedListener.onValueChanged(this.currentValue);
        }
        calculateValues();
        postInvalidate();
    }

    public int getBalance() {
        return this.balanceValue;
    }

    public void setBalance(float balance) {
        int i = this.valueUnit;
        this.balanceValue = (((int) balance) / i) * i;
        postInvalidate();
    }

    public void setOnValueChangedListener(com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView.OnValueChangedListener listener) {
        this.mListener = listener;
    }
}
