package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QSwitchView extends android.view.View implements skin.support.widget.SkinCompatSupportable {
    private static final long commonDuration = 300;
    private static final int intrinsicHeight = 0;
    private static final int intrinsicWidth = 0;
    private int backgroundColor;
    private int bgColorId;
    private int centerX;
    private int centerY;
    private int colorStep;
    private android.content.Context context;
    private float cornerRadius;
    private boolean dirtyAnimation;
    private int foregroundColor;
    private android.view.GestureDetector gestureDetector;
    private android.view.GestureDetector.SimpleOnGestureListener gestureListener;
    private int height;
    private android.animation.ObjectAnimator innerContentAnimator;
    private android.graphics.RectF innerContentBound;
    private android.util.Property<com.qcwireless.qcwatch.ui.base.view.QSwitchView, java.lang.Float> innerContentProperty;
    private float innerContentRate;
    private float intrinsicInnerHeight;
    private float intrinsicInnerWidth;
    private float intrinsicKnobWidth;
    private boolean isAttachedToWindow;
    private boolean isChange;
    private boolean isOn;
    private android.graphics.RectF knobBound;
    private android.animation.ObjectAnimator knobExpandAnimator;
    private android.util.Property<com.qcwireless.qcwatch.ui.base.view.QSwitchView, java.lang.Float> knobExpandProperty;
    private float knobExpandRate;
    private float knobMaxExpandWidth;
    private android.animation.ObjectAnimator knobMoveAnimator;
    private android.util.Property<com.qcwireless.qcwatch.ui.base.view.QSwitchView, java.lang.Float> knobMoveProperty;
    private float knobMoveRate;
    private boolean knobState;
    private com.qcwireless.qcwatch.ui.base.view.QSwitchView.OnSwitchStateChangeListener onSwitchStateChangeListener;
    private int outerStrokeWidth;
    private android.graphics.RectF ovalForPath;
    private android.graphics.Paint paint;
    private boolean preIsOn;
    private android.graphics.Path roundRectPath;
    private android.graphics.drawable.Drawable shadowDrawable;
    private int shadowSpace;
    private android.graphics.RectF tempForRoundRect;
    private int tempTintColor;
    private int tintColor;
    private int tintColorId;
    private int width;

    public interface OnSwitchStateChangeListener {
        void onSwitchStateChange(boolean isOn);
    }

    private int RGBColorTransform(float progress, int fromColor, int toColor) {
        return ((((fromColor >> 16) & 255) + ((int) ((((toColor >> 16) & 255) - r0) * progress))) << 16) | (-16777216) | ((((fromColor >> 8) & 255) + ((int) ((((toColor >> 8) & 255) - r1) * progress))) << 8) | ((fromColor & 255) + ((int) (((toColor & 255) - r6) * progress)));
    }

    public void applySkin() {
        applyBackgroundColor();
        postInvalidate();
    }

    public QSwitchView(android.content.Context context) {
        this(context, null);
        this.context = context;
    }

    public QSwitchView(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        this.context = context;
    }

    public QSwitchView(android.content.Context context, android.util.AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.innerContentProperty = new android.util.Property<com.qcwireless.qcwatch.ui.base.view.QSwitchView, java.lang.Float>(java.lang.Float.class, "innerBound") { // from class: com.qcwireless.qcwatch.ui.base.view.QSwitchView.1
            @Override // android.util.Property
            public void set(com.qcwireless.qcwatch.ui.base.view.QSwitchView sv, java.lang.Float innerContentRate) {
                sv.setInnerContentRate(innerContentRate.floatValue());
            }

            @Override // android.util.Property
            public java.lang.Float get(com.qcwireless.qcwatch.ui.base.view.QSwitchView sv) {
                return java.lang.Float.valueOf(sv.getInnerContentRate());
            }
        };
        this.knobExpandProperty = new android.util.Property<com.qcwireless.qcwatch.ui.base.view.QSwitchView, java.lang.Float>(java.lang.Float.class, "knobExpand") { // from class: com.qcwireless.qcwatch.ui.base.view.QSwitchView.2
            @Override // android.util.Property
            public void set(com.qcwireless.qcwatch.ui.base.view.QSwitchView sv, java.lang.Float knobExpandRate) {
                sv.setKnobExpandRate(knobExpandRate.floatValue());
            }

            @Override // android.util.Property
            public java.lang.Float get(com.qcwireless.qcwatch.ui.base.view.QSwitchView sv) {
                return java.lang.Float.valueOf(sv.getKnobExpandRate());
            }
        };
        this.knobMoveProperty = new android.util.Property<com.qcwireless.qcwatch.ui.base.view.QSwitchView, java.lang.Float>(java.lang.Float.class, "knobMove") { // from class: com.qcwireless.qcwatch.ui.base.view.QSwitchView.3
            @Override // android.util.Property
            public void set(com.qcwireless.qcwatch.ui.base.view.QSwitchView sv, java.lang.Float knobMoveRate) {
                sv.setKnobMoveRate(knobMoveRate.floatValue());
            }

            @Override // android.util.Property
            public java.lang.Float get(com.qcwireless.qcwatch.ui.base.view.QSwitchView sv) {
                return java.lang.Float.valueOf(sv.getKnobMoveRate());
            }
        };
        this.gestureListener = new android.view.GestureDetector.SimpleOnGestureListener() { // from class: com.qcwireless.qcwatch.ui.base.view.QSwitchView.4
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onShowPress(android.view.MotionEvent event) {
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(android.view.MotionEvent event) {
                if (!com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.isEnabled()) {
                    return false;
                }
                com.qcwireless.qcwatch.ui.base.view.QSwitchView qSwitchView = com.qcwireless.qcwatch.ui.base.view.QSwitchView.this;
                qSwitchView.preIsOn = qSwitchView.isOn;
                com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.innerContentAnimator.setFloatValues(com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.innerContentRate, 0.0f);
                com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.innerContentAnimator.start();
                com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobExpandAnimator.setFloatValues(com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobExpandRate, 1.0f);
                com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobExpandAnimator.start();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(android.view.MotionEvent event) {
                if (!com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.isChange) {
                    if (com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.onSwitchStateChangeListener != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.onSwitchStateChangeListener.onSwitchStateChange(com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.isOn);
                    }
                } else {
                    com.qcwireless.qcwatch.ui.base.view.QSwitchView qSwitchView = com.qcwireless.qcwatch.ui.base.view.QSwitchView.this;
                    qSwitchView.isOn = qSwitchView.knobState;
                    if (com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.preIsOn == com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.isOn) {
                        com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.isOn = !r8.isOn;
                        com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobState = !r8.knobState;
                    }
                    if (com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobState) {
                        com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobMoveAnimator.setFloatValues(com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobMoveRate, 1.0f);
                        com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobMoveAnimator.start();
                        com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.innerContentAnimator.setFloatValues(com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.innerContentRate, 0.0f);
                        com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.innerContentAnimator.start();
                    } else {
                        com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobMoveAnimator.setFloatValues(com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobMoveRate, 0.0f);
                        com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobMoveAnimator.start();
                        com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.innerContentAnimator.setFloatValues(com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.innerContentRate, 1.0f);
                        com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.innerContentAnimator.start();
                    }
                    com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobExpandAnimator.setFloatValues(com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobExpandRate, 0.0f);
                    com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobExpandAnimator.start();
                    if (com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.isChange && com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.onSwitchStateChangeListener != null && com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.isOn != com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.preIsOn) {
                        com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.onSwitchStateChangeListener.onSwitchStateChange(com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.isOn);
                    }
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(android.view.MotionEvent e1, android.view.MotionEvent e2, float distanceX, float distanceY) {
                if (com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.isChange) {
                    if (e2.getX() > com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.centerX) {
                        if (!com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobState) {
                            com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobState = !r4.knobState;
                            com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobMoveAnimator.setFloatValues(com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobMoveRate, 1.0f);
                            com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobMoveAnimator.start();
                            com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.innerContentAnimator.setFloatValues(com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.innerContentRate, 0.0f);
                            com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.innerContentAnimator.start();
                        }
                    } else if (com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobState) {
                        com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobState = !r4.knobState;
                        com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobMoveAnimator.setFloatValues(com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobMoveRate, 0.0f);
                        com.qcwireless.qcwatch.ui.base.view.QSwitchView.this.knobMoveAnimator.start();
                    }
                }
                return true;
            }
        };
        this.innerContentRate = 1.0f;
        this.backgroundColor = -3355444;
        this.colorStep = -3355444;
        this.foregroundColor = -4868163;
        this.dirtyAnimation = false;
        this.isAttachedToWindow = false;
        this.bgColorId = 0;
        this.tintColorId = 0;
        this.isChange = true;
        this.context = context;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.qc_switchView);
        int color = obtainStyledAttributes.getColor(3, 1145599);
        this.tintColor = color;
        this.tempTintColor = color;
        this.backgroundColor = obtainStyledAttributes.getColor(0, 15066597);
        this.bgColorId = obtainStyledAttributes.getResourceId(0, 15066597);
        this.tintColorId = obtainStyledAttributes.getResourceId(3, 1145599);
        int applyDimension = (int) android.util.TypedValue.applyDimension(1, 1.5f, context.getResources().getDisplayMetrics());
        int applyDimension2 = (int) android.util.TypedValue.applyDimension(1, 5.0f, context.getResources().getDisplayMetrics());
        this.outerStrokeWidth = obtainStyledAttributes.getDimensionPixelOffset(1, applyDimension);
        this.shadowSpace = obtainStyledAttributes.getDimensionPixelOffset(2, applyDimension2);
        obtainStyledAttributes.recycle();
        this.knobBound = new android.graphics.RectF();
        this.innerContentBound = new android.graphics.RectF();
        this.ovalForPath = new android.graphics.RectF();
        this.tempForRoundRect = new android.graphics.RectF();
        this.paint = new android.graphics.Paint(1);
        this.roundRectPath = new android.graphics.Path();
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(context, this.gestureListener);
        this.gestureDetector = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        if (android.os.Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, null);
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, this.innerContentProperty, this.innerContentRate, 1.0f);
        this.innerContentAnimator = ofFloat;
        ofFloat.setDuration(commonDuration);
        this.innerContentAnimator.setInterpolator(new android.view.animation.DecelerateInterpolator());
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this, this.knobExpandProperty, this.knobExpandRate, 1.0f);
        this.knobExpandAnimator = ofFloat2;
        ofFloat2.setDuration(commonDuration);
        this.knobExpandAnimator.setInterpolator(new android.view.animation.DecelerateInterpolator());
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this, this.knobMoveProperty, this.knobMoveRate, 1.0f);
        this.knobMoveAnimator = ofFloat3;
        ofFloat3.setDuration(commonDuration);
        this.knobMoveAnimator.setInterpolator(new android.view.animation.DecelerateInterpolator());
        this.shadowDrawable = androidx.core.content.ContextCompat.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.shadow_ios);
        applyBackgroundColor();
    }

    private void applyBackgroundColor() {
        int checkResourceId = skin.support.widget.SkinCompatHelper.checkResourceId(this.bgColorId);
        if (checkResourceId != 0) {
            int color = skin.support.content.res.SkinCompatResources.getColor(this.context, checkResourceId);
            this.backgroundColor = color;
            this.paint.setColor(color);
        }
        int checkResourceId2 = skin.support.widget.SkinCompatHelper.checkResourceId(this.tintColorId);
        if (checkResourceId2 != 0) {
            int color2 = skin.support.content.res.SkinCompatResources.getColor(this.context, checkResourceId2);
            this.tempTintColor = color2;
            this.tintColor = color2;
            this.paint.setColor(color2);
        }
    }

    public void setOnSwitchStateChangeListener(com.qcwireless.qcwatch.ui.base.view.QSwitchView.OnSwitchStateChangeListener onSwitchStateChangeListener) {
        this.onSwitchStateChangeListener = onSwitchStateChangeListener;
    }

    public com.qcwireless.qcwatch.ui.base.view.QSwitchView.OnSwitchStateChangeListener getOnSwitchStateChangeListener() {
        return this.onSwitchStateChangeListener;
    }

    void setInnerContentRate(float rate) {
        this.innerContentRate = rate;
        invalidate();
    }

    float getInnerContentRate() {
        return this.innerContentRate;
    }

    void setKnobExpandRate(float rate) {
        this.knobExpandRate = rate;
        invalidate();
    }

    float getKnobExpandRate() {
        return this.knobExpandRate;
    }

    void setKnobMoveRate(float rate) {
        this.knobMoveRate = rate;
        invalidate();
    }

    float getKnobMoveRate() {
        return this.knobMoveRate;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        com.qcwireless.qcwatch.ui.base.view.QSwitchView.OnSwitchStateChangeListener onSwitchStateChangeListener;
        boolean z;
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        if (this.dirtyAnimation) {
            boolean z2 = this.isOn;
            this.knobState = z2;
            if (z2) {
                this.knobMoveAnimator.setFloatValues(this.knobMoveRate, 1.0f);
                this.knobMoveAnimator.start();
                this.innerContentAnimator.setFloatValues(this.innerContentRate, 0.0f);
                this.innerContentAnimator.start();
            } else {
                this.knobMoveAnimator.setFloatValues(this.knobMoveRate, 0.0f);
                this.knobMoveAnimator.start();
                this.innerContentAnimator.setFloatValues(this.innerContentRate, 1.0f);
                this.innerContentAnimator.start();
            }
            this.knobExpandAnimator.setFloatValues(this.knobExpandRate, 0.0f);
            this.knobExpandAnimator.start();
            if (this.isChange && (onSwitchStateChangeListener = this.onSwitchStateChangeListener) != null && (z = this.isOn) != this.preIsOn) {
                onSwitchStateChangeListener.onSwitchStateChange(z);
            }
            this.dirtyAnimation = false;
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.width = android.view.View.MeasureSpec.getSize(widthMeasureSpec);
        int size = android.view.View.MeasureSpec.getSize(heightMeasureSpec);
        this.height = size;
        int i = this.width;
        if (size / i < 0.33333f) {
            this.height = (int) (i * 0.33333f);
            super.setMeasuredDimension(android.view.View.MeasureSpec.makeMeasureSpec(i, android.view.View.MeasureSpec.getMode(widthMeasureSpec)), android.view.View.MeasureSpec.makeMeasureSpec(this.height, android.view.View.MeasureSpec.getMode(heightMeasureSpec)));
        }
        this.centerX = this.width / 2;
        this.centerY = this.height / 2;
        int i2 = this.shadowSpace;
        this.cornerRadius = r4 - i2;
        this.innerContentBound.left = this.outerStrokeWidth + i2;
        this.innerContentBound.top = this.outerStrokeWidth + this.shadowSpace;
        this.innerContentBound.right = (this.width - this.outerStrokeWidth) - this.shadowSpace;
        this.innerContentBound.bottom = (this.height - this.outerStrokeWidth) - this.shadowSpace;
        this.intrinsicInnerWidth = this.innerContentBound.width();
        this.intrinsicInnerHeight = this.innerContentBound.height();
        this.knobBound.left = this.outerStrokeWidth + this.shadowSpace;
        this.knobBound.top = this.outerStrokeWidth + this.shadowSpace;
        this.knobBound.right = (this.height - this.outerStrokeWidth) - this.shadowSpace;
        this.knobBound.bottom = (this.height - this.outerStrokeWidth) - this.shadowSpace;
        this.intrinsicKnobWidth = this.knobBound.height();
        float f = this.width * 0.7f;
        this.knobMaxExpandWidth = f;
        if (f > this.knobBound.width() * 1.25f) {
            this.knobMaxExpandWidth = this.knobBound.width() * 1.25f;
        }
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setOn(boolean on) {
        setOn(on, false);
    }

    public void setOff() {
        com.qcwireless.qcwatch.ui.base.view.QSwitchView.OnSwitchStateChangeListener onSwitchStateChangeListener;
        this.isOn = false;
        this.knobState = false;
        setKnobMoveRate(0.0f);
        setInnerContentRate(1.0f);
        setKnobExpandRate(0.0f);
        if (!this.isChange || (onSwitchStateChangeListener = this.onSwitchStateChangeListener) == null || this.isOn == this.preIsOn) {
            return;
        }
        onSwitchStateChangeListener.onSwitchStateChange(false);
    }

    public void setOn(boolean on, boolean animated) {
        com.qcwireless.qcwatch.ui.base.view.QSwitchView.OnSwitchStateChangeListener onSwitchStateChangeListener;
        boolean z;
        if (this.isOn == on) {
            return;
        }
        if (!this.isAttachedToWindow && animated) {
            this.dirtyAnimation = true;
            this.isOn = on;
            return;
        }
        this.isOn = on;
        this.knobState = on;
        if (!animated) {
            if (on) {
                setKnobMoveRate(1.0f);
                setInnerContentRate(0.0f);
            } else {
                setKnobMoveRate(0.0f);
                setInnerContentRate(1.0f);
            }
            setKnobExpandRate(0.0f);
        } else {
            if (on) {
                this.knobMoveAnimator.setFloatValues(this.knobMoveRate, 1.0f);
                this.knobMoveAnimator.start();
                this.innerContentAnimator.setFloatValues(this.innerContentRate, 0.0f);
                this.innerContentAnimator.start();
            } else {
                this.knobMoveAnimator.setFloatValues(this.knobMoveRate, 0.0f);
                this.knobMoveAnimator.start();
                this.innerContentAnimator.setFloatValues(this.innerContentRate, 1.0f);
                this.innerContentAnimator.start();
            }
            this.knobExpandAnimator.setFloatValues(this.knobExpandRate, 0.0f);
            this.knobExpandAnimator.start();
        }
        if (!this.isChange || (onSwitchStateChangeListener = this.onSwitchStateChangeListener) == null || (z = this.isOn) == this.preIsOn) {
            return;
        }
        onSwitchStateChangeListener.onSwitchStateChange(z);
    }

    public void setTintColor(int tintColor) {
        this.tintColor = tintColor;
        this.tempTintColor = tintColor;
    }

    public int getTintColor() {
        return this.tintColor;
    }

    public void setOnchange(boolean isChange) {
        this.isChange = isChange;
    }

    public boolean getOnchange() {
        return this.isChange;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        com.qcwireless.qcwatch.ui.base.view.QSwitchView.OnSwitchStateChangeListener onSwitchStateChangeListener;
        if (!isEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action == 1 || action == 3) {
            if (!this.knobState) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, this.innerContentProperty, this.innerContentRate, 1.0f);
                this.innerContentAnimator = ofFloat;
                ofFloat.setDuration(commonDuration);
                this.innerContentAnimator.setInterpolator(new android.view.animation.DecelerateInterpolator());
                this.innerContentAnimator.start();
            }
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this, this.knobExpandProperty, this.knobExpandRate, 0.0f);
            this.knobExpandAnimator = ofFloat2;
            ofFloat2.setDuration(commonDuration);
            this.knobExpandAnimator.setInterpolator(new android.view.animation.DecelerateInterpolator());
            this.knobExpandAnimator.start();
            boolean z = this.knobState;
            this.isOn = z;
            if (this.isChange && (onSwitchStateChangeListener = this.onSwitchStateChangeListener) != null && z != this.preIsOn) {
                onSwitchStateChangeListener.onSwitchStateChange(z);
            }
        }
        return this.gestureDetector.onTouchEvent(event);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (enabled) {
            this.tintColor = this.tempTintColor;
        } else {
            this.tintColor = RGBColorTransform(0.5f, this.tempTintColor, -4868163);
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        float f = this.intrinsicInnerWidth / 2.0f;
        float f2 = this.innerContentRate;
        float f3 = f * f2;
        float f4 = (this.intrinsicInnerHeight / 2.0f) * f2;
        this.innerContentBound.left = this.centerX - f3;
        this.innerContentBound.top = this.centerY - f4;
        this.innerContentBound.right = this.centerX + f3;
        this.innerContentBound.bottom = this.centerY + f4;
        float f5 = this.intrinsicKnobWidth;
        float f6 = f5 + ((this.knobMaxExpandWidth - f5) * this.knobExpandRate);
        if (this.knobBound.left + (this.knobBound.width() / 2.0f) > ((float) this.centerX)) {
            android.graphics.RectF rectF = this.knobBound;
            rectF.left = rectF.right - f6;
        } else {
            android.graphics.RectF rectF2 = this.knobBound;
            rectF2.right = rectF2.left + f6;
        }
        float width = this.knobBound.width();
        float f7 = this.knobMoveRate;
        this.colorStep = RGBColorTransform(f7, this.backgroundColor, this.tintColor);
        this.knobBound.left = this.shadowSpace + this.outerStrokeWidth + (((this.width - width) - ((this.shadowSpace + this.outerStrokeWidth) * 2)) * f7);
        android.graphics.RectF rectF3 = this.knobBound;
        rectF3.right = rectF3.left + width;
        this.paint.setColor(this.colorStep);
        this.paint.setStyle(android.graphics.Paint.Style.FILL);
        int i = this.shadowSpace;
        drawRoundRect(i, i, this.width - i, this.height - i, this.cornerRadius, canvas, this.paint);
        this.paint.setShadowLayer(2.0f, 0.0f, this.shadowSpace / 2, isEnabled() ? 536870912 : 268435456);
        this.paint.setColor(isEnabled() ? 536870912 : 268435456);
        drawRoundRect(this.knobBound.left, (this.shadowSpace / 2) + this.knobBound.top, this.knobBound.right, (this.shadowSpace / 2) + this.knobBound.bottom, this.cornerRadius - this.outerStrokeWidth, canvas, this.paint);
        this.paint.setColor(-1);
        android.graphics.RectF rectF4 = this.knobBound;
        float f8 = this.cornerRadius;
        int i2 = this.outerStrokeWidth;
        canvas.drawRoundRect(rectF4, f8 - i2, f8 - i2, this.paint);
        if (!this.isOn) {
            this.paint.setColor(this.backgroundColor);
            canvas.drawCircle(this.knobBound.left + ((this.knobBound.right - this.knobBound.left) / 2.0f), this.knobBound.top + ((this.knobBound.bottom - this.knobBound.top) / 2.0f), dp2px(this.context, 4.0f), this.paint);
        }
        this.paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        this.paint.setColor(this.backgroundColor);
        this.paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.paint.setStrokeWidth(1.0f);
        android.graphics.RectF rectF5 = this.knobBound;
        float f9 = this.cornerRadius;
        int i3 = this.outerStrokeWidth;
        canvas.drawRoundRect(rectF5, f9 - i3, f9 - i3, this.paint);
    }

    private void drawRoundRect(float left, float top, float right, float bottom, float radius, android.graphics.Canvas canvas, android.graphics.Paint paint) {
        this.tempForRoundRect.left = left;
        this.tempForRoundRect.top = top;
        this.tempForRoundRect.right = right;
        this.tempForRoundRect.bottom = bottom;
        canvas.drawRoundRect(this.tempForRoundRect, radius, radius, paint);
    }

    public float dp2px(android.content.Context context, float dp) {
        return (dp * context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}
