package com.qcwireless.qcwatch.ui.base.view.healthy;

/* loaded from: /tmp/dex/classes2.dex */
public class PubuProgressCircle extends android.view.View {
    private float addCalorieCr;
    private float addDistanceCr;
    private int addStep;
    private float addStepCr;
    private int calorie;
    private android.content.Context context;
    private float drawCalorieCr;
    private float drawDistanceCr;
    private float drawStepCr;
    private int goalStep;
    private boolean isFirst;
    private int num;
    private boolean refresh;
    private int sport;
    private android.graphics.Paint sportPaint;
    private android.graphics.Paint sportPaint1;
    private android.graphics.Paint standUpPaint;
    private android.graphics.Paint standUpPaint1;
    private int step;
    private android.graphics.Paint stepPaint;
    private android.graphics.Paint stepPaint1;
    private float totalCalorieCr;
    private float totalDistanceCr;
    private int totalNum;
    private float totalStepCr;

    static /* synthetic */ int access$008(com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle pubuProgressCircle) {
        int i = pubuProgressCircle.num;
        pubuProgressCircle.num = i + 1;
        return i;
    }

    static /* synthetic */ float access$316(com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle pubuProgressCircle, float f) {
        float f2 = pubuProgressCircle.drawStepCr + f;
        pubuProgressCircle.drawStepCr = f2;
        return f2;
    }

    static /* synthetic */ float access$516(com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle pubuProgressCircle, float f) {
        float f2 = pubuProgressCircle.drawCalorieCr + f;
        pubuProgressCircle.drawCalorieCr = f2;
        return f2;
    }

    static /* synthetic */ float access$716(com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle pubuProgressCircle, float f) {
        float f2 = pubuProgressCircle.drawDistanceCr + f;
        pubuProgressCircle.drawDistanceCr = f2;
        return f2;
    }

    public boolean isRefresh() {
        return this.refresh;
    }

    public void setRefresh(boolean refresh) {
        this.refresh = refresh;
    }

    public PubuProgressCircle(android.content.Context context) {
        super(context);
        this.refresh = false;
        this.num = 0;
        this.context = context;
        initView();
    }

    public PubuProgressCircle(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.refresh = false;
        this.num = 0;
        this.context = context;
        initView();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    private void initView() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.stepPaint = paint;
        paint.setStrokeWidth(dip2px(getContext(), 14.0f));
        this.stepPaint.setAntiAlias(true);
        this.stepPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.healthy_circle_bar_step));
        this.stepPaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.stepPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.stepPaint1 = paint2;
        paint2.setStrokeWidth(dip2px(getContext(), 14.0f));
        this.stepPaint1.setAntiAlias(true);
        this.stepPaint1.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.healthy_circle_bar_step_1));
        this.stepPaint1.setStyle(android.graphics.Paint.Style.STROKE);
        this.stepPaint1.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.standUpPaint = paint3;
        paint3.setStrokeWidth(dip2px(getContext(), 14.0f));
        this.standUpPaint.setAntiAlias(true);
        this.standUpPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.healthy_circle_bar_distance));
        this.standUpPaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.standUpPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.standUpPaint1 = paint4;
        paint4.setStrokeWidth(dip2px(getContext(), 14.0f));
        this.standUpPaint1.setAntiAlias(true);
        this.standUpPaint1.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.healthy_circle_bar_distance_1));
        this.standUpPaint1.setStyle(android.graphics.Paint.Style.STROKE);
        this.standUpPaint1.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.sportPaint = paint5;
        paint5.setStrokeWidth(dip2px(getContext(), 14.0f));
        this.sportPaint.setAntiAlias(true);
        this.sportPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.healthy_circle_bar_calorie));
        this.sportPaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.sportPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.sportPaint1 = paint6;
        paint6.setStrokeWidth(dip2px(getContext(), 14.0f));
        this.sportPaint1.setAntiAlias(true);
        this.sportPaint1.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.healthy_circle_bar_calorie_1));
        this.sportPaint1.setStyle(android.graphics.Paint.Style.STROKE);
        this.sportPaint1.setStrokeCap(android.graphics.Paint.Cap.ROUND);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int dip2px = (int) dip2px(this.context, 230.0f);
        dip2px(getContext(), 20.0f);
        int dip2px2 = (int) dip2px(getContext(), 10.0f);
        android.graphics.RectF rectF = new android.graphics.RectF();
        rectF.left = dip2px / 6;
        rectF.top = dip2px2;
        rectF.right = (dip2px * 5) / 6;
        rectF.bottom = ((dip2px * 4) / 6) + dip2px2;
        canvas.drawArc(rectF, 130.0f, 280.0f, false, this.stepPaint);
        canvas.drawArc(rectF, 130.0f, this.drawCalorieCr, false, this.stepPaint1);
    }

    public void refreshView(int calorie, int distance, int step, int goalCalorie, int goalDistance, int goalStep) {
        int i;
        if (calorie > 0 && step > 0 && step == this.step && calorie == this.calorie && !this.refresh && goalStep == this.goalStep) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "返回");
            return;
        }
        if (step > 0 && (i = this.step) > 0 && step - i < 50 && goalStep == this.goalStep) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "返回1");
            return;
        }
        this.refresh = false;
        this.goalStep = goalStep;
        this.step = step;
        this.calorie = calorie;
        this.sport = distance;
        this.addStep = 160;
        int i2 = step / 160;
        this.totalNum = i2;
        if (i2 <= 1) {
            this.totalNum = 1;
        }
        this.num = 0;
        float f = (step * 280) / goalStep;
        this.totalStepCr = f;
        this.totalCalorieCr = (calorie * 280) / goalCalorie;
        float f2 = (distance * 280) / goalDistance;
        this.totalDistanceCr = f2;
        int i3 = this.totalNum;
        this.addStepCr = f / i3;
        this.addCalorieCr = f / i3;
        this.addDistanceCr = f2 / i3;
        this.drawStepCr = 0.0f;
        this.drawCalorieCr = 0.0f;
        this.drawDistanceCr = 0.0f;
        refreshDraw();
    }

    private void refreshDraw() {
        this.isFirst = true;
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.1
            @Override // java.lang.Runnable
            public void run() {
                while (com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.num <= com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.totalNum) {
                    try {
                        if (com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.isFirst) {
                            java.lang.Thread.sleep(600L);
                        } else {
                            java.lang.Thread.sleep(40L);
                        }
                        com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.access$008(com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this);
                        com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle pubuProgressCircle = com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this;
                        com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.access$316(pubuProgressCircle, pubuProgressCircle.addStepCr);
                        com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle pubuProgressCircle2 = com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this;
                        com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.access$516(pubuProgressCircle2, pubuProgressCircle2.addCalorieCr);
                        com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle pubuProgressCircle3 = com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this;
                        com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.access$716(pubuProgressCircle3, pubuProgressCircle3.addDistanceCr);
                        if (com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.drawStepCr > 0.0f && com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.drawCalorieCr == 0.0f) {
                            com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.drawCalorieCr = 1.0f;
                        }
                        if (com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.drawStepCr >= 280.0f) {
                            com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.drawStepCr = 280.0f;
                        }
                        if (com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.drawCalorieCr >= 280.0f) {
                            com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.drawCalorieCr = 280.0f;
                        }
                        if (com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.drawDistanceCr >= 280.0f) {
                            com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.drawDistanceCr = 280.0f;
                        }
                        com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.postInvalidate();
                        com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.isFirst = false;
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle pubuProgressCircle4 = com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this;
                pubuProgressCircle4.drawStepCr = pubuProgressCircle4.totalStepCr;
                com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle pubuProgressCircle5 = com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this;
                pubuProgressCircle5.drawCalorieCr = pubuProgressCircle5.totalCalorieCr;
                com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle pubuProgressCircle6 = com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this;
                pubuProgressCircle6.drawDistanceCr = pubuProgressCircle6.totalDistanceCr;
                if (com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.drawStepCr >= 280.0f) {
                    com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.drawStepCr = 280.0f;
                }
                if (com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.drawCalorieCr >= 280.0f) {
                    com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.drawCalorieCr = 280.0f;
                }
                if (com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.drawDistanceCr >= 280.0f) {
                    com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.drawDistanceCr = 280.0f;
                }
                com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle.this.postInvalidate();
            }
        }).start();
    }

    public float dip2px(android.content.Context context, float dp) {
        return (dp * context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}
