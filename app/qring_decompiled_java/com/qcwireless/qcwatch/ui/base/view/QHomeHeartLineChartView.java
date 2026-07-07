package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QHomeHeartLineChartView extends android.view.View {
    private int bottomOffset;
    int[] colors;
    int[] colorsLine;
    private android.content.Context context;
    private android.graphics.Path fillPath;
    private com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean firstBean;
    private java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> hashData;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> heartList;
    private int height;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.QHomeHeartLineChartView.XTextChange> labelsList;
    private int leftRightOffset;
    private int lineHeight;
    private android.graphics.Paint paint;
    private android.graphics.Paint paintBottom;
    private android.graphics.Paint paintFill;
    private android.graphics.Paint paintY;
    private android.graphics.Path path;
    float[] position;
    private int range;
    private android.graphics.Paint textDownPaint;
    private int[] timeArray;
    private int width;
    private int xMax;
    private android.graphics.Path yLinePath;
    private int yMax;

    public QHomeHeartLineChartView(android.content.Context context) {
        super(context);
        this.xMax = 1440;
        this.yMax = 240;
        this.heartList = new java.util.ArrayList();
        this.leftRightOffset = 10;
        this.position = new float[]{0.01f, 0.01f, 5.0f};
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.bottomOffset = 30;
        this.lineHeight = 120;
        this.range = 5;
        this.labelsList = new java.util.ArrayList();
        this.hashData = new androidx.collection.ArrayMap();
        this.context = context;
        init(context, null);
    }

    public QHomeHeartLineChartView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.xMax = 1440;
        this.yMax = 240;
        this.heartList = new java.util.ArrayList();
        this.leftRightOffset = 10;
        this.position = new float[]{0.01f, 0.01f, 5.0f};
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.bottomOffset = 30;
        this.lineHeight = 120;
        this.range = 5;
        this.labelsList = new java.util.ArrayList();
        this.hashData = new androidx.collection.ArrayMap();
        this.context = context;
        init(context, attrs);
    }

    public QHomeHeartLineChartView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.xMax = 1440;
        this.yMax = 240;
        this.heartList = new java.util.ArrayList();
        this.leftRightOffset = 10;
        this.position = new float[]{0.01f, 0.01f, 5.0f};
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.bottomOffset = 30;
        this.lineHeight = 120;
        this.range = 5;
        this.labelsList = new java.util.ArrayList();
        this.hashData = new androidx.collection.ArrayMap();
        this.context = context;
        init(context, attrs);
    }

    public QHomeHeartLineChartView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.xMax = 1440;
        this.yMax = 240;
        this.heartList = new java.util.ArrayList();
        this.leftRightOffset = 10;
        this.position = new float[]{0.01f, 0.01f, 5.0f};
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.bottomOffset = 30;
        this.lineHeight = 120;
        this.range = 5;
        this.labelsList = new java.util.ArrayList();
        this.hashData = new androidx.collection.ArrayMap();
        this.context = context;
        init(context, attrs);
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        this.colors = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_heart_4), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_heart_5), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_heart_6)};
        this.colorsLine = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_heart_6), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_heart_4), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_heart_6)};
        android.graphics.Paint paint = new android.graphics.Paint();
        this.paint = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.paint.setAntiAlias(true);
        this.paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.paint.setPathEffect(new android.graphics.CornerPathEffect(10.0f));
        this.paint.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_heart_7));
        this.paint.setStrokeWidth(dp2px(context, 0.5f));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.paintFill = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.paintFill.setAntiAlias(true);
        this.paintFill.setPathEffect(new android.graphics.CornerPathEffect(10.0f));
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.paintY = paint3;
        paint3.setAntiAlias(true);
        this.paintY.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_heart_8));
        this.paintY.setStrokeWidth(dp2px(context, 0.05f));
        this.paintY.setPathEffect(new android.graphics.DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
        this.paintY.setStyle(android.graphics.Paint.Style.STROKE);
        this.path = new android.graphics.Path();
        this.fillPath = new android.graphics.Path();
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.textDownPaint = paint4;
        paint4.setAntiAlias(true);
        this.textDownPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.textDownPaint.setStrokeWidth(2.0f);
        this.textDownPaint.setTextSize(dp2px(context, 8.0f));
        this.textDownPaint.setColor(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.pg_home_heart_14));
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.paintBottom = paint5;
        paint5.setStyle(android.graphics.Paint.Style.FILL);
        this.paintBottom.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.paintBottom.setAntiAlias(true);
        this.paintBottom.setStrokeWidth(dp2px(context, 1.0f));
        this.paintBottom.setColor(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.pg_home_heart_14));
        initTimeStamp();
    }

    private void initXLabels() {
        this.labelsList.clear();
        int i = (this.width - (this.leftRightOffset * 2)) / 8;
        com.qcwireless.qcwatch.ui.base.view.QHomeHeartLineChartView.XTextChange xTextChange = new com.qcwireless.qcwatch.ui.base.view.QHomeHeartLineChartView.XTextChange();
        xTextChange.setLabel("00:00");
        xTextChange.setX(this.leftRightOffset);
        xTextChange.setY(dp2px(this.context, 82.0f));
        this.labelsList.add(xTextChange);
        com.qcwireless.qcwatch.ui.base.view.QHomeHeartLineChartView.XTextChange xTextChange2 = new com.qcwireless.qcwatch.ui.base.view.QHomeHeartLineChartView.XTextChange();
        xTextChange2.setLabel("24:00");
        xTextChange2.setX((this.width - getTextWidth(this.textDownPaint, "00:00")) - this.leftRightOffset);
        xTextChange2.setY(dp2px(this.context, 82.0f));
        this.labelsList.add(xTextChange2);
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

    private void initTimeStamp() {
        if (this.range <= 0) {
            this.range = 5;
        }
        this.timeArray = new int[1440 / this.range];
        int i = 0;
        while (true) {
            int i2 = this.range;
            if (i >= 1440 / i2) {
                break;
            }
            this.timeArray[i] = i2 * i;
            i++;
        }
        for (int i3 = 0; i3 < 1440 / this.range; i3++) {
            this.hashData.put(i3 + "", null);
        }
    }

    public int getMySize(int defaultSize, int measureSpec) {
        int mode = android.view.View.MeasureSpec.getMode(measureSpec);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? android.view.View.MeasureSpec.getSize(measureSpec) : defaultSize;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.width = getMySize(200, widthMeasureSpec);
        if (getLayoutParams().height == -2) {
            this.height = (int) dp2px(this.context, 60.0f);
        } else {
            this.height = getMySize(200, heightMeasureSpec);
        }
        setMeasuredDimension(this.width, this.height);
        filterData(this.heartList);
        initXLabels();
        postInvalidate();
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        for (com.qcwireless.qcwatch.ui.base.view.QHomeHeartLineChartView.XTextChange xTextChange : this.labelsList) {
            canvas.drawText(xTextChange.label, xTextChange.x, xTextChange.y, this.textDownPaint);
        }
        int i = this.width;
        this.paintFill.setShader(new android.graphics.LinearGradient(i, 0.0f, i, dp2px(this.context, 50.0f), this.colors, this.position, android.graphics.Shader.TileMode.CLAMP));
        canvas.drawPath(this.fillPath, this.paintFill);
        canvas.drawPath(this.path, this.paint);
        for (int i2 = 0; i2 < this.heartList.size(); i2++) {
            if (this.heartList.get(i2).isBegin()) {
                canvas.drawCircle(r1.x, r1.y, dp2px(this.context, 0.1f), this.paint);
            }
        }
        int i3 = this.leftRightOffset;
        int i4 = this.height;
        int i5 = this.bottomOffset;
        canvas.drawLine(i3, i4 - i5, this.width - i3, i4 - i5, this.paintBottom);
    }

    public float dp2px(android.content.Context context, float dp) {
        return (dp * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public void setData(java.util.List<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> list) {
        if (list.size() > 0) {
            this.range = list.get(0).getRange();
        }
        initXLabels();
        initTimeStamp();
        this.heartList.clear();
        if (list != null) {
            this.heartList.addAll(list);
        }
        this.path.reset();
        this.fillPath.reset();
        this.hashData.clear();
        if (this.width > 0 && list != null) {
            filterData(list);
        }
        postInvalidate();
    }

    private void filterData(java.util.List<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> list) {
        for (int i = 0; i < list.size(); i++) {
            com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean = list.get(i);
            int min = heartDataBean.getMin();
            int i2 = this.width;
            int i3 = this.leftRightOffset;
            heartDataBean.x = ((min * (i2 - (i3 * 2))) / this.xMax) + i3;
            heartDataBean.y = (this.lineHeight - this.bottomOffset) - ((heartDataBean.getValue() * (this.height - this.bottomOffset)) / this.yMax);
            if (i <= 0) {
                heartDataBean.setBegin(true);
            }
            this.hashData.put(heartDataBean.getMin() + "", heartDataBean);
        }
        for (int i4 = 0; i4 < this.heartList.size(); i4++) {
            com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean2 = this.heartList.get(i4);
            this.hashData.put(heartDataBean2.getMin() + "", heartDataBean2);
            if (heartDataBean2.isBegin()) {
                this.firstBean = heartDataBean2;
                this.path.moveTo(heartDataBean2.x, heartDataBean2.y);
                this.fillPath.moveTo(heartDataBean2.x, heartDataBean2.y);
                this.path.lineTo(heartDataBean2.x, heartDataBean2.y);
                this.fillPath.lineTo(heartDataBean2.x, heartDataBean2.y);
            } else {
                this.path.lineTo(heartDataBean2.x, heartDataBean2.y);
                this.fillPath.lineTo(heartDataBean2.x, heartDataBean2.y);
                if ((i4 < this.heartList.size() - 1 && this.heartList.get(i4 + 1).isBegin()) || i4 == this.heartList.size() - 1) {
                    this.fillPath.lineTo(heartDataBean2.x, this.height - this.bottomOffset);
                    this.fillPath.lineTo(this.firstBean.x, this.height - this.bottomOffset);
                    this.fillPath.lineTo(this.firstBean.x, heartDataBean2.y);
                    this.fillPath.close();
                }
            }
        }
        postInvalidate();
    }

    public class XTextChange {
        public java.lang.String label;
        public int max;
        public int min;
        public float x;
        public float y;

        public XTextChange() {
        }

        public int getMin() {
            return this.min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMax() {
            return this.max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public java.lang.String getLabel() {
            return this.label;
        }

        public void setLabel(java.lang.String label) {
            this.label = label;
        }

        public float getX() {
            return this.x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return this.y;
        }

        public void setY(float y) {
            this.y = y;
        }
    }
}
