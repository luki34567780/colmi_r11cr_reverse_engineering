package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QBloodSugarLineChartView extends com.qcwireless.qcwatch.ui.base.view.BaseChartView {
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean> boList;
    int[] colors;
    int[] colorsBoLine;
    int[] colorsLine;
    private com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean currBean;
    private android.graphics.Paint dotPaint;
    private java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean> hashData;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange> labelsList;
    private int leftRightOffset;
    private com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.OnSelectedListener listener;
    private android.graphics.Paint paint;
    private android.graphics.Paint paintFill;
    private android.graphics.Paint paintY;
    private android.graphics.Path path;
    float[] position;
    private int[] timeArray;
    private android.graphics.Path yLinePath;
    private int yMax;

    public interface OnSelectedListener {
        void onSelected(com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean bean);
    }

    public void setSelectedListener(com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.OnSelectedListener listener) {
        this.listener = listener;
    }

    public QBloodSugarLineChartView(android.content.Context context) {
        super(context);
        this.yMax = 25;
        this.timeArray = new int[24];
        this.labelsList = new java.util.ArrayList();
        this.boList = new java.util.ArrayList();
        this.leftRightOffset = 80;
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.colorsBoLine = new int[0];
        this.position = new float[]{0.2f, 0.5f, 2.0f};
        this.hashData = new androidx.collection.ArrayMap();
        init(context, null);
    }

    public QBloodSugarLineChartView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.yMax = 25;
        this.timeArray = new int[24];
        this.labelsList = new java.util.ArrayList();
        this.boList = new java.util.ArrayList();
        this.leftRightOffset = 80;
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.colorsBoLine = new int[0];
        this.position = new float[]{0.2f, 0.5f, 2.0f};
        this.hashData = new androidx.collection.ArrayMap();
        init(context, attrs);
    }

    public QBloodSugarLineChartView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.yMax = 25;
        this.timeArray = new int[24];
        this.labelsList = new java.util.ArrayList();
        this.boList = new java.util.ArrayList();
        this.leftRightOffset = 80;
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.colorsBoLine = new int[0];
        this.position = new float[]{0.2f, 0.5f, 2.0f};
        this.hashData = new androidx.collection.ArrayMap();
        init(context, attrs);
    }

    public QBloodSugarLineChartView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.yMax = 25;
        this.timeArray = new int[24];
        this.labelsList = new java.util.ArrayList();
        this.boList = new java.util.ArrayList();
        this.leftRightOffset = 80;
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.colorsBoLine = new int[0];
        this.position = new float[]{0.2f, 0.5f, 2.0f};
        this.hashData = new androidx.collection.ArrayMap();
        init(context, attrs);
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        for (int i = 0; i < 24; i++) {
            this.timeArray[i] = i * 3600;
        }
        this.colors = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_sugar_1), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_sugar_2), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_sugar_4)};
        this.colorsLine = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_sugar_4), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_sugar_1), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_sugar_4)};
        this.colorsBoLine = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_sugar_2), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_sugar_1), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_sugar_1)};
        android.graphics.Paint paint = new android.graphics.Paint();
        this.paint = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.paint.setAntiAlias(true);
        this.paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.paint.setPathEffect(new android.graphics.CornerPathEffect(30.0f));
        this.paint.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_sugar_2));
        this.paint.setStrokeWidth(dp2px(context, 0.5f));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.paintFill = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.paintFill.setAntiAlias(true);
        this.paintFill.setPathEffect(new android.graphics.CornerPathEffect(30.0f));
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.paintY = paint3;
        paint3.setAntiAlias(true);
        this.paintY.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_sugar_5));
        this.paintY.setStrokeWidth(dp2px(context, 0.05f));
        this.paintY.setPathEffect(new android.graphics.DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
        this.paintY.setStyle(android.graphics.Paint.Style.STROKE);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.dotPaint = paint4;
        paint4.setAntiAlias(true);
        this.dotPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.dotPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.path = new android.graphics.Path();
        initAttr(context, attrs);
        initPublic(context, attrs);
        this.yLinePath = new android.graphics.Path();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.width = getMySize(this.diameterDefault, widthMeasureSpec);
        if (getLayoutParams().height == -2) {
            this.height = this.diameterDefault;
        } else {
            this.height = getMySize(this.diameterDefault, heightMeasureSpec);
        }
        setMeasuredDimension(this.width, this.height);
        this.diameterDefault = (int) dp2px(this.context, 200.0f);
        this.fingerXDefault = 720.0f;
        this.fingerX = ((getNumberThree(this.timeArray, java.lang.Integer.valueOf((int) this.fingerXDefault)).intValue() * this.width) / 24) * 3600;
        initXLabels();
        setData(this.boList, true);
        postInvalidate();
    }

    private void initAttr(android.content.Context context, android.util.AttributeSet attrs) {
        if (attrs != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.qc_chart);
            this.colorBall = obtainStyledAttributes.getColor(1, -16777216);
            this.colorLine = obtainStyledAttributes.getColor(4, -16777216);
            this.textDownColor = obtainStyledAttributes.getColor(8, -16777216);
            this.colorValue = obtainStyledAttributes.getColor(5, -16777216);
            this.colorValueSelected = obtainStyledAttributes.getColor(6, -1);
            this.colorBgSelected = obtainStyledAttributes.getColor(3, -16777216);
            this.valueMin = obtainStyledAttributes.getInteger(11, this.offset);
            this.valueMax = obtainStyledAttributes.getInteger(10, 86400);
            this.valueSelected = obtainStyledAttributes.getInteger(12, 43200);
            this.lineHeight = (int) dp2px(context, obtainStyledAttributes.getInteger(7, 185));
            this.bottomOffset = (int) dp2px(context, obtainStyledAttributes.getInteger(0, 30));
            obtainStyledAttributes.recycle();
            initPublic(context, attrs);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.view.BaseChartView, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.mPaddingStart = getPaddingStart();
        this.mPaddingEnd = getPaddingEnd();
        this.mPaddingTop = getPaddingTop();
        this.mPaddingBottom = getPaddingBottom();
        this.bezierHeight = 0.0f;
    }

    @Override // com.qcwireless.qcwatch.ui.base.view.BaseChartView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        this.bezierHeight = (this.circleRadiusMax * 2.0f) + 5.0f;
        this.circleRadius = this.circleRadiusMin + (this.circleRadiusMax - this.circleRadiusMin);
        this.spaceToLine = this.circleRadiusMin * 2.0f;
        for (com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange xTextChange : this.labelsList) {
            if (this.fingerX > xTextChange.getMin() && this.fingerX <= xTextChange.getMax()) {
                canvas.drawText(xTextChange.label, xTextChange.x, this.lineHeight - this.spaceToLine, this.textDownPaint);
            } else {
                canvas.drawText(xTextChange.label, xTextChange.x, xTextChange.y, this.textDownPaint);
            }
        }
        canvas.drawPath(this.yLinePath, this.paintY);
        this.linePaint.setShader(new android.graphics.LinearGradient(this.fingerX, this.lineHeight - this.bottomOffset, this.fingerX, 90.0f, this.colorsBoLine, this.position, android.graphics.Shader.TileMode.CLAMP));
        this.linePaint.setStrokeWidth(dp2px(this.context, 5.0f));
        this.linePaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        canvas.drawPath(this.path, this.linePaint);
        this.textDownPaint.setTextSize(dp2px(this.context, 10.0f));
        canvas.drawText("0", this.leftRightOffset - getTextWidth(this.textDownPaint, "00"), (this.lineHeight - this.bottomOffset) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
        canvas.drawText("5", this.leftRightOffset - getTextWidth(this.textDownPaint, "00"), ((this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 5) / this.yMax)) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
        canvas.drawText("10", this.leftRightOffset - getTextWidth(this.textDownPaint, "000"), ((this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 10) / this.yMax)) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
        canvas.drawText("15", this.leftRightOffset - getTextWidth(this.textDownPaint, "000"), ((this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 15) / this.yMax)) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
        canvas.drawText("20", this.leftRightOffset - getTextWidth(this.textDownPaint, "000"), ((this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 20) / this.yMax)) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
        this.linePaint.setShader(new android.graphics.LinearGradient(this.fingerX, this.lineHeight - this.bottomOffset, this.fingerX, 60.0f, this.colorsLine, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        this.linePaint.setStrokeWidth(3.0f);
        canvas.drawLine(this.fingerX, this.lineHeight - this.bottomOffset, this.fingerX, 60.0f, this.linePaint);
    }

    private void initXLabels() {
        this.labelsList.clear();
        int i = (this.width - (this.leftRightOffset * 2)) / 8;
        com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange xTextChange = new com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange();
        xTextChange.setLabel("00:00");
        xTextChange.setX(this.leftRightOffset - (getTextWidth(this.textDownPaint, "00:00") / 2.0f));
        xTextChange.setY(this.lineHeight - (this.textSize / 2.0f));
        xTextChange.setMin(1);
        xTextChange.setMax(this.leftRightOffset + i);
        this.labelsList.add(xTextChange);
        com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange xTextChange2 = new com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange();
        xTextChange2.setLabel("06:00");
        xTextChange2.setX((this.leftRightOffset + (i * 2)) - (getTextWidth(this.textDownPaint, "00:00") / 2.0f));
        xTextChange2.setY(this.lineHeight - (this.textSize / 2.0f));
        xTextChange2.setMin(this.leftRightOffset + i);
        int i2 = i * 3;
        xTextChange2.setMax(this.leftRightOffset + i2);
        this.labelsList.add(xTextChange2);
        com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange xTextChange3 = new com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange();
        xTextChange3.setLabel("12:00");
        xTextChange3.setX((this.leftRightOffset + (i * 4)) - (getTextWidth(this.textDownPaint, "00:00") / 2.0f));
        xTextChange3.setY(this.lineHeight - (this.textSize / 2.0f));
        xTextChange3.setMin(this.leftRightOffset + i2);
        int i3 = i * 5;
        xTextChange3.setMax(this.leftRightOffset + i3);
        this.labelsList.add(xTextChange3);
        com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange xTextChange4 = new com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange();
        xTextChange4.setLabel("18:00");
        xTextChange4.setX((this.leftRightOffset + (i * 6)) - (getTextWidth(this.textDownPaint, "00:00") / 2.0f));
        xTextChange4.setY(this.lineHeight - (this.textSize / 2.0f));
        xTextChange4.setMin(this.leftRightOffset + i3);
        int i4 = i * 7;
        xTextChange4.setMax(this.leftRightOffset + i4);
        this.labelsList.add(xTextChange4);
        com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange xTextChange5 = new com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange();
        xTextChange5.setLabel("00:00");
        xTextChange5.setX((this.leftRightOffset + r0) - (getTextWidth(this.textDownPaint, "00:00") / 2.0f));
        xTextChange5.setY(this.lineHeight - (this.textSize / 2.0f));
        xTextChange5.setMin(this.leftRightOffset + i4);
        xTextChange5.setMax(this.leftRightOffset + (i * 8));
        this.labelsList.add(xTextChange5);
    }

    public void setData(java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean> data, boolean today) {
        this.path.reset();
        this.yLinePath.reset();
        this.boList = data;
        this.hashData.clear();
        for (com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean dataBean : data) {
            this.hashData.put(dataBean.seconds + "", dataBean);
            if (dataBean.getMinValue() != 0.0f && dataBean.getMaxValue() != 0.0f) {
                android.graphics.Path path = this.path;
                int seconds = dataBean.getSeconds();
                int i = this.width;
                int i2 = this.leftRightOffset;
                path.moveTo(((seconds * (i - (i2 * 2))) / 86400) + i2, (this.lineHeight - this.bottomOffset) - ((dataBean.getMinValue() * (this.height - this.bottomOffset)) / this.yMax));
                android.graphics.Path path2 = this.path;
                int seconds2 = dataBean.getSeconds();
                int i3 = this.width;
                int i4 = this.leftRightOffset;
                path2.lineTo(((seconds2 * (i3 - (i4 * 2))) / 86400) + i4, (this.lineHeight - this.bottomOffset) - ((dataBean.getMaxValue() * (this.height - this.bottomOffset)) / this.yMax));
            }
        }
        if (today) {
            this.fingerXDefault = new com.qcwireless.qc_utils.date.DateUtil().getHour() * 3600;
        } else {
            this.fingerXDefault = 43200.0f;
        }
        int intValue = getNumberThree(this.timeArray, java.lang.Integer.valueOf((int) this.fingerXDefault)).intValue();
        int i5 = this.width;
        int i6 = this.leftRightOffset;
        this.fingerX = (((i5 - (i6 * 2)) * intValue) / 86400) + i6;
        if (this.hashData.get(intValue + "") != null) {
            this.currBean = this.hashData.get(intValue + "");
        } else {
            if (today) {
                this.currBean = new com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean(new com.qcwireless.qc_utils.date.DateUtil().getHour() * 3600, 0.0f, 0.0f);
            } else {
                this.currBean = new com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean(43200, 0.0f, 0.0f);
            }
            this.valueSelected = 0;
        }
        com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.OnSelectedListener onSelectedListener = this.listener;
        if (onSelectedListener != null) {
            onSelectedListener.onSelected(this.currBean);
        }
        this.yLinePath.moveTo(this.leftRightOffset, this.lineHeight - this.bottomOffset);
        this.yLinePath.lineTo(this.width - this.leftRightOffset, this.lineHeight - this.bottomOffset);
        this.yLinePath.moveTo(this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 5) / this.yMax));
        this.yLinePath.lineTo(this.width - this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 5) / this.yMax));
        this.yLinePath.moveTo(this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 10) / this.yMax));
        this.yLinePath.lineTo(this.width - this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 10) / this.yMax));
        this.yLinePath.moveTo(this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 15) / this.yMax));
        this.yLinePath.lineTo(this.width - this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 15) / this.yMax));
        this.yLinePath.moveTo(this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 20) / this.yMax));
        this.yLinePath.lineTo(this.width - this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 20) / this.yMax));
        postInvalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.animatorFingerIn.start();
            this.fingerX = event.getX();
            doCalc();
            postInvalidate();
        } else if (action == 1) {
            this.animatorFingerOut.start();
        } else if (action == 2) {
            this.fingerX = event.getX();
            doCalc();
            postInvalidate();
        }
        return true;
    }

    private void doCalc() {
        this.valueSelected = (int) ((this.fingerX * 86400.0f) / this.width);
        int intValue = getNumberThree(this.timeArray, java.lang.Integer.valueOf(this.valueSelected)).intValue();
        int i = this.width;
        int i2 = this.leftRightOffset;
        this.fingerX = (((i - (i2 * 2)) * intValue) / 86400) + i2;
        com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean dataBean = this.hashData.get(intValue + "");
        this.currBean = dataBean;
        com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.OnSelectedListener onSelectedListener = this.listener;
        if (onSelectedListener != null) {
            if (dataBean == null) {
                onSelectedListener.onSelected(new com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean(intValue, 0.0f, 0.0f));
            } else {
                onSelectedListener.onSelected(dataBean);
            }
        }
    }

    public static class DataBean {
        private float maxValue;
        private float minValue;
        private int seconds;

        public DataBean(int seconds, float minValue, float maxValue) {
            this.seconds = seconds;
            this.minValue = minValue;
            this.maxValue = maxValue;
        }

        public int getSeconds() {
            return this.seconds;
        }

        public void setSeconds(int seconds) {
            this.seconds = seconds;
        }

        public float getMinValue() {
            return this.minValue;
        }

        public void setMinValue(float minValue) {
            this.minValue = minValue;
        }

        public float getMaxValue() {
            return this.maxValue;
        }

        public void setMaxValue(float maxValue) {
            this.maxValue = maxValue;
        }
    }
}
