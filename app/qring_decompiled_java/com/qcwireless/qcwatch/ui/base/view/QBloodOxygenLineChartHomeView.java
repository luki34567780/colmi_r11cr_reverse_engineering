package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QBloodOxygenLineChartHomeView extends android.view.View {
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartHomeView.DataBean> boList;
    private int bottomOffset;
    int[] colors;
    int[] colorsBoLine;
    int[] colorsLine;
    private android.content.Context context;
    private android.graphics.Paint dotPaint;
    private java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartHomeView.DataBean> hashData;
    private int height;
    private int leftRightOffset;
    private int lineHeight;
    private android.graphics.Paint linePaint;
    private android.graphics.Paint paint;
    private android.graphics.Paint paintFill;
    private android.graphics.Paint paintY;
    private android.graphics.Path path;
    private int[] timeArray;
    private int width;
    private android.graphics.Path yLinePath;

    public interface OnSelectedListener {
        void onSelected(com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartHomeView.DataBean bean);
    }

    public QBloodOxygenLineChartHomeView(android.content.Context context) {
        super(context);
        this.timeArray = new int[24];
        this.boList = new java.util.ArrayList();
        this.leftRightOffset = 20;
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.colorsBoLine = new int[0];
        this.bottomOffset = 50;
        this.lineHeight = 185;
        this.hashData = new androidx.collection.ArrayMap();
        init(context, null);
    }

    public QBloodOxygenLineChartHomeView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.timeArray = new int[24];
        this.boList = new java.util.ArrayList();
        this.leftRightOffset = 20;
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.colorsBoLine = new int[0];
        this.bottomOffset = 50;
        this.lineHeight = 185;
        this.hashData = new androidx.collection.ArrayMap();
        init(context, attrs);
    }

    public QBloodOxygenLineChartHomeView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.timeArray = new int[24];
        this.boList = new java.util.ArrayList();
        this.leftRightOffset = 20;
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.colorsBoLine = new int[0];
        this.bottomOffset = 50;
        this.lineHeight = 185;
        this.hashData = new androidx.collection.ArrayMap();
        init(context, attrs);
    }

    public QBloodOxygenLineChartHomeView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.timeArray = new int[24];
        this.boList = new java.util.ArrayList();
        this.leftRightOffset = 20;
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.colorsBoLine = new int[0];
        this.bottomOffset = 50;
        this.lineHeight = 185;
        this.hashData = new androidx.collection.ArrayMap();
        init(context, attrs);
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        this.context = context;
        for (int i = 0; i < 24; i++) {
            this.timeArray[i] = i * 3600;
        }
        this.colors = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_oxygen_2), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_oxygen_2), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.color_FFFFFF)};
        this.colorsBoLine = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_oxygen_3), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_oxygen_4), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_oxygen_4)};
        this.colorsLine = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_oxygen_5), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_oxygen_6), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_oxygen_5)};
        android.graphics.Paint paint = new android.graphics.Paint();
        this.paint = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.paint.setAntiAlias(true);
        this.paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.paint.setPathEffect(new android.graphics.CornerPathEffect(30.0f));
        this.paint.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_oxygen_7));
        this.paint.setStrokeWidth(com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(context, 0.5f));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.paintFill = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.paintFill.setAntiAlias(true);
        this.paintFill.setPathEffect(new android.graphics.CornerPathEffect(30.0f));
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.paintY = paint3;
        paint3.setAntiAlias(true);
        this.paintY.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_oxygen_8));
        this.paintY.setStrokeWidth(com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(context, 0.05f));
        this.paintY.setPathEffect(new android.graphics.DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
        this.paintY.setStyle(android.graphics.Paint.Style.STROKE);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.dotPaint = paint4;
        paint4.setAntiAlias(true);
        this.dotPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.dotPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.path = new android.graphics.Path();
        this.yLinePath = new android.graphics.Path();
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.linePaint = paint5;
        paint5.setAntiAlias(true);
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
        this.width = getMySize(200, widthMeasureSpec);
        if (getLayoutParams().height == -2) {
            this.height = (int) com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(this.context, 60.0f);
        } else {
            this.height = getMySize(200, heightMeasureSpec);
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
        if (this.boList.size() > 0) {
            canvas.drawPath(this.path, this.linePaint);
        }
    }

    public void setData(java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartHomeView.DataBean> data) {
        this.boList = data;
        this.hashData.clear();
        this.path.reset();
        int i = (this.lineHeight - this.bottomOffset) / 12;
        if (this.width > 0) {
            for (com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartHomeView.DataBean dataBean : data) {
                this.hashData.put(dataBean.seconds + "", dataBean);
                if (dataBean.getMinValue() > 0 && dataBean.getMaxValue() > 0 && dataBean.getMinValue() >= 51 && dataBean.getMaxValue() >= 51) {
                    dataBean.setMinValue(dataBean.getMinValue() - 50);
                    dataBean.setMaxValue(dataBean.getMaxValue() - 50);
                    android.graphics.Path path = this.path;
                    int seconds = dataBean.getSeconds();
                    int i2 = this.width;
                    int i3 = this.leftRightOffset;
                    path.moveTo(((seconds * (i2 - (i3 * 2))) / 86400) + i3, (this.lineHeight - this.bottomOffset) - (((dataBean.getMinValue() - 40) + 1) * i));
                    android.graphics.Path path2 = this.path;
                    int seconds2 = dataBean.getSeconds();
                    int i4 = this.width;
                    int i5 = this.leftRightOffset;
                    path2.lineTo(((seconds2 * (i4 - (i5 * 2))) / 86400) + i5, (this.lineHeight - this.bottomOffset) - (((dataBean.getMaxValue() - 40) + 1) * i));
                }
            }
        } else {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "width=0");
        }
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
