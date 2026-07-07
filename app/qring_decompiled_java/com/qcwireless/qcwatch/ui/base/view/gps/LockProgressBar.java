package com.qcwireless.qcwatch.ui.base.view.gps;

/* loaded from: /tmp/dex/classes2.dex */
public class LockProgressBar extends android.view.View {
    private com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.onAnimEnd animListener;
    private boolean isCut;
    private boolean isRunning;
    private int mColor;
    private android.graphics.Paint mPaint;
    private float pregss;
    private android.graphics.RectF rectF;
    private int roundColor;
    private android.graphics.Paint roundPaint;
    private java.lang.Thread thread;

    public interface onAnimEnd {
        void animEndListener(boolean isLock);
    }

    static /* synthetic */ float access$216(com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar lockProgressBar, float f) {
        float f2 = lockProgressBar.pregss + f;
        lockProgressBar.pregss = f2;
        return f2;
    }

    static /* synthetic */ float access$224(com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar lockProgressBar, float f) {
        float f2 = lockProgressBar.pregss - f;
        lockProgressBar.pregss = f2;
        return f2;
    }

    public LockProgressBar(android.content.Context context) {
        super(context);
        this.isRunning = false;
        initPaint();
    }

    public LockProgressBar(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.isRunning = false;
        initPaint();
    }

    public LockProgressBar(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.isRunning = false;
        initPaint();
    }

    public LockProgressBar(android.content.Context context, int color, int color2) {
        super(context);
        this.isRunning = false;
        this.mColor = color;
        this.roundColor = color2;
        initPaint();
    }

    private void initPaint() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.mPaint.setColor(this.mColor);
        this.mPaint.setStrokeWidth(10.0f);
        this.mPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.roundPaint = paint2;
        paint2.setAntiAlias(true);
        this.roundPaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.roundPaint.setColor(this.roundColor);
        this.roundPaint.setStrokeWidth(7.0f);
        this.roundPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.rectF = new android.graphics.RectF();
        this.pregss = 0.0f;
        this.isCut = false;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        android.graphics.RectF rectF = this.rectF;
        if (rectF != null) {
            rectF.left = 10.0f;
            this.rectF.top = 10.0f;
            this.rectF.right = getMeasuredWidth() - 10;
            this.rectF.bottom = getMeasuredHeight() - 10;
        }
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.RectF rectF = this.rectF;
        if (rectF == null || rectF.right <= 0.0f) {
            return;
        }
        canvas.drawArc(this.rectF, 360.0f, 360.0f, false, this.roundPaint);
        canvas.drawArc(this.rectF, -90.0f, this.pregss, false, this.mPaint);
    }

    public void startAnim() {
        setVisibility(0);
        this.isRunning = true;
        this.isCut = false;
        this.pregss = 0.0f;
        java.lang.Thread thread = this.thread;
        if (thread == null || !thread.isAlive()) {
            java.lang.Thread thread2 = new java.lang.Thread(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.1
                @Override // java.lang.Runnable
                public void run() {
                    while (com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.this.isRunning) {
                        try {
                            if (com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.this.isCut) {
                                com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.access$224(com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.this, 10.8f);
                            } else {
                                com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.access$216(com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.this, 10.8f);
                            }
                            if (com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.this.pregss <= 0.0f) {
                                com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.this.isCut = false;
                                com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.this.pregss = 0.0f;
                                com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.this.isRunning = false;
                                com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.this.animListener.animEndListener(false);
                            }
                            if (com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.this.pregss >= 360.0f) {
                                com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.this.isCut = true;
                                com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.this.pregss = 360.0f;
                                com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.this.isRunning = false;
                                com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.this.animListener.animEndListener(true);
                            }
                            com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.this.postInvalidate();
                            java.lang.Thread.sleep(30L);
                        } catch (java.lang.Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                }
            });
            this.thread = thread2;
            thread2.start();
        }
    }

    public void setCut(boolean isCut) {
        this.isCut = isCut;
    }

    public void setAnimListener(com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.onAnimEnd animListener) {
        this.animListener = animListener;
    }

    public void setPaintColor(int color1, int color2) {
        this.mColor = color1;
        this.roundColor = color2;
        android.graphics.Paint paint = this.mPaint;
        if (paint != null) {
            paint.setColor(color1);
            this.roundPaint.setColor(this.roundColor);
        }
    }
}
