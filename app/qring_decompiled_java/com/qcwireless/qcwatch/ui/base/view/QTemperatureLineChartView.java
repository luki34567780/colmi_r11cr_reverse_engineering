package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QTemperatureLineChartView extends com.qcwireless.qcwatch.ui.base.view.BaseChartView {
    int[] colors;
    int[] colorsLine;
    private com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean currBean;
    private android.graphics.Paint dotPaint;
    private android.graphics.Path fillPath;
    private com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean firstBean;
    private java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean> hashData;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean> heartList;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange> labelsList;
    private int leftRightOffset;
    private com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.OnSelectedListener listener;
    private android.graphics.Paint paint;
    private android.graphics.Paint paintFill;
    private android.graphics.Paint paintY;
    private android.graphics.Path path;
    float[] position;
    private boolean temperature;
    private int[] timeArray;
    private java.util.List<java.lang.Integer> timeArrayList;
    private boolean today;
    private int xMax;
    private android.graphics.Path yLinePath;
    private int yMax;

    public interface OnSelectedListener {
        void onSelected(com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean bean);
    }

    public void setSelectedListener(com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.OnSelectedListener listener) {
        this.listener = listener;
    }

    public QTemperatureLineChartView(android.content.Context context) {
        super(context);
        this.xMax = 1440;
        this.yMax = 42;
        this.timeArray = new int[48];
        this.timeArrayList = new java.util.ArrayList();
        this.labelsList = new java.util.ArrayList();
        this.heartList = new java.util.ArrayList();
        this.leftRightOffset = 100;
        this.position = new float[]{0.1f, 0.1f, 2.0f};
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.hashData = new androidx.collection.ArrayMap();
        init(context, null);
    }

    public QTemperatureLineChartView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.xMax = 1440;
        this.yMax = 42;
        this.timeArray = new int[48];
        this.timeArrayList = new java.util.ArrayList();
        this.labelsList = new java.util.ArrayList();
        this.heartList = new java.util.ArrayList();
        this.leftRightOffset = 100;
        this.position = new float[]{0.1f, 0.1f, 2.0f};
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.hashData = new androidx.collection.ArrayMap();
        init(context, attrs);
    }

    public QTemperatureLineChartView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.xMax = 1440;
        this.yMax = 42;
        this.timeArray = new int[48];
        this.timeArrayList = new java.util.ArrayList();
        this.labelsList = new java.util.ArrayList();
        this.heartList = new java.util.ArrayList();
        this.leftRightOffset = 100;
        this.position = new float[]{0.1f, 0.1f, 2.0f};
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.hashData = new androidx.collection.ArrayMap();
        init(context, attrs);
    }

    public QTemperatureLineChartView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.xMax = 1440;
        this.yMax = 42;
        this.timeArray = new int[48];
        this.timeArrayList = new java.util.ArrayList();
        this.labelsList = new java.util.ArrayList();
        this.heartList = new java.util.ArrayList();
        this.leftRightOffset = 100;
        this.position = new float[]{0.1f, 0.1f, 2.0f};
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.hashData = new androidx.collection.ArrayMap();
        init(context, attrs);
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        this.colors = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_temperature_2), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_temperature_1), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_temperature_3)};
        this.colorsLine = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_temperature_3), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_temperature_2), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_temperature_3)};
        android.graphics.Paint paint = new android.graphics.Paint();
        this.paint = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.paint.setAntiAlias(true);
        this.paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.paint.setPathEffect(new android.graphics.CornerPathEffect(10.0f));
        this.paint.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_temperature_2));
        this.paint.setStrokeWidth(dp2px(context, 0.5f));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.paintFill = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.paintFill.setAntiAlias(true);
        this.paintFill.setPathEffect(new android.graphics.CornerPathEffect(10.0f));
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.paintY = paint3;
        paint3.setAntiAlias(true);
        this.paintY.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_temperature_4));
        this.paintY.setStrokeWidth(dp2px(context, 0.05f));
        this.paintY.setPathEffect(new android.graphics.DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
        this.paintY.setStyle(android.graphics.Paint.Style.STROKE);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.dotPaint = paint4;
        paint4.setAntiAlias(true);
        this.dotPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.dotPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.path = new android.graphics.Path();
        this.fillPath = new android.graphics.Path();
        this.yLinePath = new android.graphics.Path();
        initAttr(context, attrs);
        initPublic(context, attrs);
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
        initXLabels();
        filterData(this.heartList, this.today);
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
        this.paintFill.setShader(new android.graphics.LinearGradient(this.width, 0.0f, this.width, this.height - (this.bottomOffset * 2), this.colors, this.position, android.graphics.Shader.TileMode.CLAMP));
        if (this.heartList.size() > 1) {
            canvas.drawPath(this.fillPath, this.paintFill);
            canvas.drawPath(this.path, this.paint);
        }
        for (int i = 0; i < this.heartList.size(); i++) {
            if (this.heartList.get(i).isBegin()) {
                canvas.drawCircle(r2.x, r2.y, dp2px(this.context, 0.1f), this.paint);
            }
        }
        this.linePaint.setShader(new android.graphics.LinearGradient(this.fingerX, this.lineHeight - this.bottomOffset, this.fingerX, 60.0f, this.colorsLine, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        this.linePaint.setStrokeWidth(3.0f);
        canvas.drawPath(this.yLinePath, this.paintY);
        this.textDownPaint.setTextSize(dp2px(this.context, 10.0f));
        int i2 = (this.lineHeight - this.bottomOffset) / 50;
        if (this.temperature) {
            canvas.drawText("95", this.leftRightOffset - getTextWidth(this.textDownPaint, "000"), (i2 * 50) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
            canvas.drawText("97", this.leftRightOffset - getTextWidth(this.textDownPaint, "000"), (i2 * 40) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
            canvas.drawText("99", this.leftRightOffset - getTextWidth(this.textDownPaint, "000"), (i2 * 30) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
            canvas.drawText("101", this.leftRightOffset - getTextWidth(this.textDownPaint, "0000"), (i2 * 20) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
            canvas.drawText("103", this.leftRightOffset - getTextWidth(this.textDownPaint, "0000"), (i2 * 10) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
        } else {
            canvas.drawText("35", this.leftRightOffset - getTextWidth(this.textDownPaint, "000"), (i2 * 50) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
            canvas.drawText("36", this.leftRightOffset - getTextWidth(this.textDownPaint, "000"), (i2 * 40) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
            canvas.drawText("37", this.leftRightOffset - getTextWidth(this.textDownPaint, "000"), (i2 * 30) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
            canvas.drawText("38", this.leftRightOffset - getTextWidth(this.textDownPaint, "000"), (i2 * 20) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
            canvas.drawText("39", this.leftRightOffset - getTextWidth(this.textDownPaint, "000"), (i2 * 10) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
        }
        canvas.drawLine(this.fingerX, this.lineHeight - this.bottomOffset, this.fingerX, 60.0f, this.linePaint);
        if (this.currBean != null) {
            this.dotPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.color_FFFFFF));
            canvas.drawCircle(this.currBean.x, this.currBean.y + dp2px(this.context, 1.0f), dp2px(this.context, 4.0f), this.dotPaint);
            this.dotPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_temperature_2));
            canvas.drawCircle(this.currBean.x, this.currBean.y + dp2px(this.context, 1.0f), dp2px(this.context, 3.0f), this.dotPaint);
        }
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
        xTextChange5.setX((this.leftRightOffset + (i * 8)) - (getTextWidth(this.textDownPaint, "00:00") / 2.0f));
        xTextChange5.setY(this.lineHeight - (this.textSize / 2.0f));
        xTextChange5.setMin(this.leftRightOffset + i4);
        xTextChange5.setMax(this.leftRightOffset + (i * 9));
        this.labelsList.add(xTextChange5);
    }

    public void setData(java.util.List<com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean> list, boolean today, boolean temperature) {
        this.today = today;
        this.temperature = temperature;
        this.heartList = list;
        this.currBean = null;
        this.path.reset();
        this.timeArrayList.clear();
        this.fillPath.reset();
        this.hashData.clear();
        if (this.width > 0) {
            filterData(list, today);
        }
        postInvalidate();
    }

    private void filterData(java.util.List<com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean> list, boolean today) {
        int i = (this.lineHeight - this.bottomOffset) / 50;
        for (int i2 = 0; i2 < 48; i2++) {
            this.timeArrayList.add(java.lang.Integer.valueOf(i2 * 30));
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean temperatureDataBean = list.get(i3);
            this.timeArrayList.add(java.lang.Integer.valueOf(temperatureDataBean.getMin()));
            int min = temperatureDataBean.getMin();
            int i4 = this.width;
            int i5 = this.leftRightOffset;
            temperatureDataBean.x = ((min * (i4 - (i5 * 2))) / this.xMax) + i5;
            temperatureDataBean.y = ((int) (50.0f - ((temperatureDataBean.getValue() - 35.0f) * 10.0f))) * i;
            if (i3 > 0) {
                if (list.get(i3).getMin() - list.get(i3 - 1).getMin() > 30) {
                    temperatureDataBean.setBegin(true);
                }
            } else {
                temperatureDataBean.setBegin(true);
            }
            this.hashData.put(temperatureDataBean.getMin() + "", temperatureDataBean);
        }
        this.timeArray = new int[this.timeArrayList.size()];
        for (int i6 = 0; i6 < this.timeArrayList.size(); i6++) {
            this.timeArray[i6] = this.timeArrayList.get(i6).intValue();
        }
        for (int i7 = 0; i7 < this.heartList.size(); i7++) {
            com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean temperatureDataBean2 = this.heartList.get(i7);
            if (temperatureDataBean2.value > 35.0f && temperatureDataBean2.value < 40.0f) {
                if (temperatureDataBean2.begin) {
                    this.firstBean = temperatureDataBean2;
                    this.path.moveTo(temperatureDataBean2.x, temperatureDataBean2.y);
                    this.fillPath.moveTo(temperatureDataBean2.x, temperatureDataBean2.y);
                    this.path.lineTo(temperatureDataBean2.x, temperatureDataBean2.y);
                    this.fillPath.lineTo(temperatureDataBean2.x, temperatureDataBean2.y);
                } else {
                    this.path.lineTo(temperatureDataBean2.x, temperatureDataBean2.y);
                    this.fillPath.lineTo(temperatureDataBean2.x, temperatureDataBean2.y);
                    if ((i7 < this.heartList.size() - 1 && this.heartList.get(i7 + 1).isBegin()) || i7 == this.heartList.size() - 1) {
                        this.fillPath.lineTo(temperatureDataBean2.x, this.height - this.bottomOffset);
                        this.fillPath.lineTo(this.firstBean.x, this.height - this.bottomOffset);
                        this.fillPath.lineTo(this.firstBean.x, temperatureDataBean2.y);
                        this.fillPath.close();
                    }
                }
            }
        }
        float f = i * 50;
        this.yLinePath.moveTo(this.leftRightOffset, f);
        this.yLinePath.lineTo(this.width - this.leftRightOffset, f);
        float f2 = i * 40;
        this.yLinePath.moveTo(this.leftRightOffset, f2);
        this.yLinePath.lineTo(this.width - this.leftRightOffset, f2);
        float f3 = i * 30;
        this.yLinePath.moveTo(this.leftRightOffset, f3);
        this.yLinePath.lineTo(this.width - this.leftRightOffset, f3);
        float f4 = i * 20;
        this.yLinePath.moveTo(this.leftRightOffset, f4);
        this.yLinePath.lineTo(this.width - this.leftRightOffset, f4);
        float f5 = i * 10;
        this.yLinePath.moveTo(this.leftRightOffset, f5);
        this.yLinePath.lineTo(this.width - this.leftRightOffset, f5);
        if (this.heartList.size() > 0) {
            if (today) {
                try {
                    java.util.List<com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean> list2 = this.heartList;
                    this.fingerXDefault = list2.get(list2.size() - 1).x;
                    int[] iArr = this.timeArray;
                    java.util.List<com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean> list3 = this.heartList;
                    int intValue = getNumberThree(iArr, java.lang.Integer.valueOf(list3.get(list3.size() - 1).min)).intValue();
                    this.valueSelected = (int) ((this.fingerX * 1440.0f) / (this.width - (this.leftRightOffset * 2)));
                    int i8 = this.width;
                    int i9 = this.leftRightOffset;
                    this.fingerX = (((i8 - (i9 * 2)) * intValue) / 1440) + i9;
                    if (this.listener != null) {
                        com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean temperatureDataBean3 = this.hashData.get(intValue + "");
                        this.currBean = temperatureDataBean3;
                        this.listener.onSelected(temperatureDataBean3);
                    }
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            } else {
                this.fingerXDefault = 720.0f;
                int intValue2 = getNumberThree(this.timeArray, java.lang.Integer.valueOf((int) this.fingerXDefault)).intValue();
                if (this.listener != null) {
                    com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean temperatureDataBean4 = this.hashData.get(intValue2 + "");
                    this.currBean = temperatureDataBean4;
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, temperatureDataBean4);
                    if (this.currBean != null) {
                        this.fingerX = r12.x;
                        this.listener.onSelected(this.currBean);
                    } else {
                        com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean temperatureDataBean5 = new com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean(720, 0.0f, false);
                        this.currBean = temperatureDataBean5;
                        int i10 = this.width;
                        int i11 = this.leftRightOffset;
                        temperatureDataBean5.x = (((i10 - (i11 * 2)) * 720) / this.xMax) + i11;
                        this.currBean.y = (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 720) / this.yMax);
                        this.fingerX = this.currBean.x;
                        this.listener.onSelected(this.currBean);
                    }
                }
            }
        } else if (today) {
            if (this.listener != null) {
                int todayMinNoPlus = new com.oudmon.ble.base.util.DateUtil().getTodayMinNoPlus();
                com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean temperatureDataBean6 = new com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean(todayMinNoPlus, 0.0f, false);
                this.currBean = temperatureDataBean6;
                int i12 = this.width;
                int i13 = this.leftRightOffset;
                temperatureDataBean6.x = (((i12 - (i13 * 2)) * todayMinNoPlus) / this.xMax) + i13;
                this.currBean.y = (this.lineHeight - this.bottomOffset) - ((todayMinNoPlus * (this.height - this.bottomOffset)) / this.yMax);
                this.fingerX = this.currBean.x;
                this.listener.onSelected(this.currBean);
            }
        } else if (this.listener != null) {
            com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean temperatureDataBean7 = new com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean(720, 0.0f, false);
            this.currBean = temperatureDataBean7;
            int i14 = this.width;
            int i15 = this.leftRightOffset;
            temperatureDataBean7.x = (((i14 - (i15 * 2)) * 720) / this.xMax) + i15;
            this.currBean.y = (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 720) / this.yMax);
            this.fingerX = this.currBean.x;
            this.listener.onSelected(this.currBean);
        }
        postInvalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            this.fingerX = event.getX();
            getParent().requestDisallowInterceptTouchEvent(true);
            this.animatorFingerIn.start();
            this.valueSelected = (int) ((this.fingerX * 1440.0f) / this.width);
            int intValue = getNumberThree(this.timeArray, java.lang.Integer.valueOf(this.valueSelected)).intValue();
            int i = this.width;
            int i2 = this.leftRightOffset;
            this.fingerX = (((i - (i2 * 2)) * intValue) / 1440) + i2;
            com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean temperatureDataBean = this.hashData.get(intValue + "");
            this.currBean = temperatureDataBean;
            com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.OnSelectedListener onSelectedListener = this.listener;
            if (onSelectedListener != null) {
                if (temperatureDataBean == null) {
                    onSelectedListener.onSelected(new com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean(intValue, 0.0f, false));
                } else {
                    onSelectedListener.onSelected(temperatureDataBean);
                }
            }
            postInvalidate();
        } else if (action == 1) {
            this.animatorFingerOut.start();
        } else if (action == 2) {
            this.fingerX = event.getX();
            this.valueSelected = (int) ((this.fingerX * 1440.0f) / this.width);
            int intValue2 = getNumberThree(this.timeArray, java.lang.Integer.valueOf(this.valueSelected)).intValue();
            int i3 = this.width;
            int i4 = this.leftRightOffset;
            this.fingerX = (((i3 - (i4 * 2)) * intValue2) / 1440) + i4;
            com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean temperatureDataBean2 = this.hashData.get(intValue2 + "");
            this.currBean = temperatureDataBean2;
            com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.OnSelectedListener onSelectedListener2 = this.listener;
            if (onSelectedListener2 != null) {
                if (temperatureDataBean2 == null) {
                    onSelectedListener2.onSelected(new com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean(intValue2, 0.0f, false));
                } else {
                    onSelectedListener2.onSelected(temperatureDataBean2);
                }
            }
            postInvalidate();
        }
        return true;
    }

    public static class TemperatureDataBean {
        private boolean begin;
        private int min;
        private long unixTime;
        private float value;
        public int x;
        public int y;

        public TemperatureDataBean(int min, float value, boolean begin) {
            this.min = min;
            this.value = value;
            this.begin = begin;
        }

        public long getUnixTime() {
            return this.unixTime;
        }

        public void setUnixTime(long unixTime) {
            this.unixTime = unixTime;
        }

        public int getMin() {
            return this.min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public float getValue() {
            return this.value;
        }

        public void setValue(float value) {
            this.value = value;
        }

        public int getX() {
            return this.x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return this.y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public boolean isBegin() {
            return this.begin;
        }

        public void setBegin(boolean begin) {
            this.begin = begin;
        }
    }
}
