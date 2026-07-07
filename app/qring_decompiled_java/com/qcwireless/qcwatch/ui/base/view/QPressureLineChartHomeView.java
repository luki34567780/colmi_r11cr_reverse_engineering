package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QPressureLineChartHomeView extends android.view.View {
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureLineChartHomeView.DataBean> boList;
    private int bottomOffset;
    int[] colors;
    int[] colorsBoLine;
    int[] colorsLine;
    private android.content.Context context;
    private android.graphics.Paint dotPaint;
    private java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.base.view.QPressureLineChartHomeView.DataBean> hashData;
    private int height;
    private int leftRightOffset;
    private int lineHeight;
    private android.graphics.Paint linePaint;
    private int maxPressure;
    private android.graphics.Paint paint;
    private android.graphics.Paint paintFill;
    private android.graphics.Paint paintY;
    private android.graphics.Paint stepPaint;
    private android.graphics.Paint textDownPaint;
    private int[] timeArray;
    private int width;

    public interface OnSelectedListener {
        void onSelected(com.qcwireless.qcwatch.ui.base.view.QPressureLineChartHomeView.DataBean bean);
    }

    public QPressureLineChartHomeView(android.content.Context context) {
        super(context);
        this.timeArray = new int[48];
        this.boList = new java.util.ArrayList();
        this.leftRightOffset = 30;
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.colorsBoLine = new int[0];
        this.bottomOffset = 30;
        this.lineHeight = 200;
        this.maxPressure = 100;
        this.hashData = new androidx.collection.ArrayMap();
        init(context, null);
    }

    public QPressureLineChartHomeView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.timeArray = new int[48];
        this.boList = new java.util.ArrayList();
        this.leftRightOffset = 30;
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.colorsBoLine = new int[0];
        this.bottomOffset = 30;
        this.lineHeight = 200;
        this.maxPressure = 100;
        this.hashData = new androidx.collection.ArrayMap();
        init(context, attrs);
    }

    public QPressureLineChartHomeView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.timeArray = new int[48];
        this.boList = new java.util.ArrayList();
        this.leftRightOffset = 30;
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.colorsBoLine = new int[0];
        this.bottomOffset = 30;
        this.lineHeight = 200;
        this.maxPressure = 100;
        this.hashData = new androidx.collection.ArrayMap();
        init(context, attrs);
    }

    public QPressureLineChartHomeView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.timeArray = new int[48];
        this.boList = new java.util.ArrayList();
        this.leftRightOffset = 30;
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.colorsBoLine = new int[0];
        this.bottomOffset = 30;
        this.lineHeight = 200;
        this.maxPressure = 100;
        this.hashData = new androidx.collection.ArrayMap();
        init(context, attrs);
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        this.context = context;
        for (int i = 0; i < 48; i++) {
            this.timeArray[i] = i * 3600;
        }
        this.colors = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.pressure_common_1), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.pressure_common_1), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.pressure_common_1)};
        this.colorsBoLine = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.pressure_common_1), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.pressure_common_1), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.pressure_common_1)};
        this.colorsLine = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.pressure_common_1), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.pressure_common_1), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.pressure_common_1)};
        android.graphics.Paint paint = new android.graphics.Paint();
        this.paint = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.paint.setAntiAlias(true);
        this.paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.paint.setPathEffect(new android.graphics.CornerPathEffect(30.0f));
        this.paint.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_oxygen_7));
        this.paint.setStrokeWidth(com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(context, 0.5f));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.stepPaint = paint2;
        paint2.setAntiAlias(true);
        this.stepPaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.stepPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.stepPaint.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.pressure_common_1));
        this.stepPaint.setStrokeWidth(com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(context, 1.0f));
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.paintFill = paint3;
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        this.paintFill.setAntiAlias(true);
        this.paintFill.setPathEffect(new android.graphics.CornerPathEffect(30.0f));
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.paintY = paint4;
        paint4.setAntiAlias(true);
        this.paintY.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_oxygen_8));
        this.paintY.setStrokeWidth(com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(context, 0.05f));
        this.paintY.setPathEffect(new android.graphics.DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
        this.paintY.setStyle(android.graphics.Paint.Style.STROKE);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.dotPaint = paint5;
        paint5.setAntiAlias(true);
        this.dotPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.dotPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.textDownPaint = paint6;
        paint6.setAntiAlias(true);
        this.textDownPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.textDownPaint.setStrokeWidth(2.0f);
        this.textDownPaint.setTextSize(com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(context, 8.0f));
        this.textDownPaint.setColor(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.pressure_common_2));
        android.graphics.Paint paint7 = new android.graphics.Paint();
        this.linePaint = paint7;
        paint7.setAntiAlias(true);
        this.linePaint.setStyle(android.graphics.Paint.Style.FILL);
        this.linePaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.linePaint.setStrokeWidth(2.0f);
        this.lineHeight = (int) com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(context, 60.0f);
        this.bottomOffset = (int) com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(context, 10.0f);
        this.linePaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        int i2 = this.width;
        this.linePaint.setShader(new android.graphics.LinearGradient(i2, this.lineHeight - this.bottomOffset, i2, 90.0f, this.colorsBoLine, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        this.linePaint.setStrokeWidth(com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(context, 3.0f));
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.width = getMySize(160, widthMeasureSpec);
        if (getLayoutParams().height == -2) {
            this.height = (int) com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(this.context, 160.0f);
        } else {
            this.height = getMySize(160, heightMeasureSpec);
        }
        if (this.boList.size() > 0) {
            setData(this.boList);
        }
        setMeasuredDimension(this.width, this.height);
        postInvalidate();
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText("00:00", this.leftRightOffset, this.lineHeight + this.bottomOffset, this.textDownPaint);
        canvas.drawText("24:00", this.width - (getTextWidth(this.textDownPaint, "00:00") * 2.0f), this.lineHeight + this.bottomOffset, this.textDownPaint);
        if (this.boList.size() > 0) {
            if (this.width > 0) {
                for (com.qcwireless.qcwatch.ui.base.view.QPressureLineChartHomeView.DataBean dataBean : this.boList) {
                    this.hashData.put(dataBean.seconds + "", dataBean);
                    if (dataBean.getMinValue() > 0 && dataBean.getMaxValue() > 0) {
                        int seconds = dataBean.getSeconds();
                        int i = this.width;
                        int i2 = this.leftRightOffset;
                        float f = ((seconds * (i - (i2 * 2))) / 86400) + i2;
                        float f2 = this.lineHeight - this.bottomOffset;
                        int seconds2 = dataBean.getSeconds();
                        int i3 = this.width;
                        int i4 = this.leftRightOffset;
                        canvas.drawLine(f, f2, ((seconds2 * (i3 - (i4 * 2))) / 86400) + i4, (this.lineHeight - this.bottomOffset) - ((dataBean.getMaxValue() * (this.lineHeight - this.bottomOffset)) / this.maxPressure), this.stepPaint);
                    }
                }
                return;
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "width=0");
            return;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "size 0");
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

    public void setData(java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureLineChartHomeView.DataBean> data) {
        this.boList = data;
        this.hashData.clear();
        postInvalidate();
    }

    public int getMySize(int defaultSize, int measureSpec) {
        int mode = android.view.View.MeasureSpec.getMode(measureSpec);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? android.view.View.MeasureSpec.getSize(measureSpec) : defaultSize;
    }

    public static class DataBean {
        private int maxValue;
        private int minValue;
        private int seconds;
        private int unixTime;

        public DataBean(int seconds, int minValue, int maxValue) {
            this.seconds = seconds;
            this.minValue = minValue;
            this.maxValue = maxValue;
        }

        public DataBean(int seconds, int minValue, int maxValue, int unixTime) {
            this.seconds = seconds;
            this.minValue = minValue;
            this.maxValue = maxValue;
            this.unixTime = unixTime;
        }

        public int getUnixTime() {
            return this.unixTime;
        }

        public void setUnixTime(int unixTime) {
            this.unixTime = unixTime;
        }

        public int getSeconds() {
            return this.seconds;
        }

        public void setSeconds(int seconds) {
            this.seconds = seconds;
        }

        public int getMinValue() {
            return this.minValue;
        }

        public void setMinValue(int minValue) {
            this.minValue = minValue;
        }

        public int getMaxValue() {
            return this.maxValue;
        }

        public void setMaxValue(int maxValue) {
            this.maxValue = maxValue;
        }
    }
}
