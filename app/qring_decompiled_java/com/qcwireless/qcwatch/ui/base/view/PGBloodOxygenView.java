package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class PGBloodOxygenView extends android.view.View {
    private int bloodOxygen;
    private android.content.Context context;
    private int height;
    private android.graphics.Paint paint;
    private android.graphics.Paint textDownPaint;
    private android.graphics.Paint valuePaint;
    private int width;

    public PGBloodOxygenView(android.content.Context context) {
        super(context);
        this.context = context;
        initView();
    }

    public PGBloodOxygenView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initView();
    }

    public PGBloodOxygenView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initView();
    }

    public PGBloodOxygenView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.context = context;
        initView();
    }

    private void initView() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        this.paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.paint.setStrokeWidth(dp2px(this.context, 1.5f));
        this.paint.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, com.qcwireless.qcwatch.R.color.pg_home_heart_10));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.valuePaint = paint2;
        paint2.setAntiAlias(true);
        this.valuePaint.setStyle(android.graphics.Paint.Style.FILL);
        this.valuePaint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.valuePaint.setStrokeWidth(dp2px(this.context, 1.5f));
        this.valuePaint.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, com.qcwireless.qcwatch.R.color.pg_home_heart_10));
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.textDownPaint = paint3;
        paint3.setAntiAlias(true);
        this.textDownPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.textDownPaint.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, com.qcwireless.qcwatch.R.color.pg_home_heart_10));
        this.textDownPaint.setStrokeWidth(2.0f);
        this.textDownPaint.setTextSize(dp2px(this.context, 8.0f));
    }

    public void setBloodOxygen(int value) {
        this.bloodOxygen = value;
        postInvalidate();
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRoundRect(2.5f, 2.5f, this.width - 2.5f, dp2px(this.context, 25.0f) - 2.5f, 10.0f, 10.0f, this.paint);
        int i = this.width / 4;
        canvas.drawText("80", getTextWidth(this.textDownPaint, "0"), dp2px(this.context, 36.0f), this.textDownPaint);
        canvas.drawText("85", i - (getTextWidth(this.textDownPaint, "00") / 2.0f), dp2px(this.context, 36.0f), this.textDownPaint);
        canvas.drawText("90", (i * 2) - (getTextWidth(this.textDownPaint, "00") / 2.0f), dp2px(this.context, 36.0f), this.textDownPaint);
        canvas.drawText("95", (i * 3) - (getTextWidth(this.textDownPaint, "00") / 2.0f), dp2px(this.context, 36.0f), this.textDownPaint);
        canvas.drawText("100", (i * 4) - getTextWidth(this.textDownPaint, "000"), dp2px(this.context, 36.0f), this.textDownPaint);
        if (this.bloodOxygen > 0) {
            canvas.drawRoundRect(new android.graphics.RectF(dp2px(this.context, 2.0f), dp2px(this.context, 3.0f), (int) ((((r0 - 80) * this.width) * 1.0f) / 20.0f), dp2px(this.context, 22.0f)), 10.0f, 10.0f, this.valuePaint);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.width = getMySize(200, widthMeasureSpec);
        if (getLayoutParams().height == -2) {
            this.height = (int) dp2px(this.context, 20.0f);
        } else {
            this.height = getMySize(200, heightMeasureSpec);
        }
        setMeasuredDimension(this.width, this.height);
        postInvalidate();
    }

    public float getTextWidth(android.graphics.Paint paint, java.lang.String str) {
        float f = 0.0f;
        if (str != null && str.length() > 0) {
            int length = str.length();
            paint.getTextWidths(str, new float[length]);
            for (int i = 0; i < length; i++) {
                f += (float) java.lang.Math.ceil(r2[i]);
            }
        }
        return f;
    }

    public float getTextHeight(android.graphics.Paint paint, java.lang.String str) {
        paint.getTextBounds(str, 0, str.length(), new android.graphics.Rect());
        return r0.height();
    }

    public float dp2px(android.content.Context context, float dp) {
        return (dp * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public int getMySize(int defaultSize, int measureSpec) {
        int mode = android.view.View.MeasureSpec.getMode(measureSpec);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? android.view.View.MeasureSpec.getSize(measureSpec) : defaultSize;
    }
}
