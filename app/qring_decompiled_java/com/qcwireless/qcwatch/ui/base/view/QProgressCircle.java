package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QProgressCircle extends android.view.View {
    private android.content.Context context;
    private int height;
    private android.graphics.Paint mCompletedPaint;
    private android.graphics.Paint mUncompletedPaint;
    private int percentage;
    private int radius;
    private int width;

    public QProgressCircle(android.content.Context context) {
        this(context, null);
        this.context = context;
    }

    public QProgressCircle(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        this.context = context;
    }

    public QProgressCircle(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        init();
    }

    private void init() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.mUncompletedPaint = paint;
        paint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_progress_bar));
        this.mUncompletedPaint.setAntiAlias(true);
        this.mUncompletedPaint.setStrokeWidth(dp2px(this.context, 14.0f));
        this.mUncompletedPaint.setStyle(android.graphics.Paint.Style.STROKE);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.mCompletedPaint = paint2;
        paint2.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        this.mCompletedPaint.setAntiAlias(true);
        this.mCompletedPaint.setStrokeWidth(dp2px(this.context, 14.0f));
        this.mCompletedPaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.mCompletedPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.percentage = 0;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.width = getMySize(200, widthMeasureSpec);
        if (getLayoutParams().height == -2) {
            this.height = 200;
        } else {
            this.height = getMySize(200, heightMeasureSpec);
        }
        setMeasuredDimension(this.width, this.height);
        this.radius = ((java.lang.Math.max(this.width, this.height) - 40) - ((int) dp2px(this.context, 14.0f))) / 2;
        postInvalidate();
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.RectF rectF = new android.graphics.RectF();
        float f = (this.percentage * 360) / 100;
        rectF.set(dp2px(this.context, 14.0f) * 2.0f, dp2px(this.context, 14.0f) * 2.0f, (this.radius * 2) + dp2px(this.context, 14.0f), (this.radius * 2) + dp2px(this.context, 14.0f));
        canvas.drawArc(rectF, -90.0f, 360.0f, false, this.mUncompletedPaint);
        canvas.drawArc(rectF, -90.0f, f, false, this.mCompletedPaint);
    }

    public int getPercentage() {
        return this.percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
        postInvalidate();
    }

    public int getMySize(int defaultSize, int measureSpec) {
        int mode = android.view.View.MeasureSpec.getMode(measureSpec);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? android.view.View.MeasureSpec.getSize(measureSpec) : defaultSize;
    }

    public float dp2px(android.content.Context context, float dp) {
        return (dp * context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}
