package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QBloodPressureChartHomeView extends android.view.View {
    private int bottomOffset;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean> bpList;
    int[] colorsLine;
    private android.content.Context context;
    private com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean currBean;
    private android.graphics.Paint dotPaint;
    private java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean> hashData;
    private int height;
    private int leftRightOffset;
    private int lineHeight;
    private com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.OnSelectedListener listener;
    private android.graphics.Paint paint;
    private android.graphics.Paint paintFill;
    private android.graphics.Paint paintY;
    private android.graphics.Path path;
    private android.graphics.Path path1;
    private int[] timeArray;
    private int width;
    private int xMax;
    private android.graphics.Path yLinePath;
    private int yMax;

    public interface OnSelectedListener {
        void onSelected(com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean bean);
    }

    public void setSelectedListener(com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.OnSelectedListener listener) {
        this.listener = listener;
    }

    public QBloodPressureChartHomeView(android.content.Context context) {
        super(context);
        this.xMax = 1440;
        this.yMax = 200;
        this.timeArray = new int[1440];
        this.bpList = new java.util.ArrayList();
        this.leftRightOffset = 20;
        this.colorsLine = new int[0];
        this.hashData = new androidx.collection.ArrayMap();
        this.bottomOffset = 30;
        this.lineHeight = 120;
        init(context, null);
    }

    public QBloodPressureChartHomeView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.xMax = 1440;
        this.yMax = 200;
        this.timeArray = new int[1440];
        this.bpList = new java.util.ArrayList();
        this.leftRightOffset = 20;
        this.colorsLine = new int[0];
        this.hashData = new androidx.collection.ArrayMap();
        this.bottomOffset = 30;
        this.lineHeight = 120;
        init(context, attrs);
    }

    public QBloodPressureChartHomeView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.xMax = 1440;
        this.yMax = 200;
        this.timeArray = new int[1440];
        this.bpList = new java.util.ArrayList();
        this.leftRightOffset = 20;
        this.colorsLine = new int[0];
        this.hashData = new androidx.collection.ArrayMap();
        this.bottomOffset = 30;
        this.lineHeight = 120;
        init(context, attrs);
    }

    public QBloodPressureChartHomeView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.xMax = 1440;
        this.yMax = 200;
        this.timeArray = new int[1440];
        this.bpList = new java.util.ArrayList();
        this.leftRightOffset = 20;
        this.colorsLine = new int[0];
        this.hashData = new androidx.collection.ArrayMap();
        this.bottomOffset = 30;
        this.lineHeight = 120;
        init(context, attrs);
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        this.context = context;
        this.colorsLine = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_pressure_3), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_pressure_2), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_pressure_3)};
        android.graphics.Paint paint = new android.graphics.Paint();
        this.paint = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.paint.setAntiAlias(true);
        this.paint.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_pressure_2));
        this.paint.setStrokeWidth(com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(context, 0.5f));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.paintFill = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.paintFill.setAntiAlias(true);
        this.paintFill.setStrokeWidth(com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(context, 0.5f));
        this.paintFill.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_pressure_4));
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.paintY = paint3;
        paint3.setAntiAlias(true);
        this.paintY.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_blood_pressure_5));
        this.paintY.setStrokeWidth(com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(context, 0.05f));
        this.paintY.setPathEffect(new android.graphics.DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
        this.paintY.setStyle(android.graphics.Paint.Style.STROKE);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.dotPaint = paint4;
        paint4.setAntiAlias(true);
        this.dotPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.dotPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.path = new android.graphics.Path();
        this.path1 = new android.graphics.Path();
        this.yLinePath = new android.graphics.Path();
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
        setMeasuredDimension(this.width, this.height);
        if (this.bpList.size() > 0) {
            setData(this.bpList);
        }
        postInvalidate();
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.bpList.size() > 1) {
            canvas.drawPath(this.path1, this.paintFill);
            canvas.drawPath(this.path, this.paint);
        }
        for (com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean bpDataBean : this.bpList) {
            this.dotPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.color_FFFFFF));
            canvas.drawCircle(bpDataBean.sbpX, bpDataBean.sbpY, com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(this.context, 1.5f), this.dotPaint);
            this.dotPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_blood_pressure_2));
            canvas.drawCircle(bpDataBean.sbpX, bpDataBean.sbpY, com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(this.context, 1.0f), this.dotPaint);
            this.dotPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.color_FFFFFF));
            canvas.drawCircle(bpDataBean.dbpX, bpDataBean.dbpY, com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(this.context, 1.5f), this.dotPaint);
            this.dotPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_blood_pressure_4));
            canvas.drawCircle(bpDataBean.dbpX, bpDataBean.dbpY, com.qcwireless.qcwatch.ui.base.view.DpUtils.dp2px(this.context, 1.0f), this.dotPaint);
        }
    }

    public void setData(java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean> list) {
        this.bpList = list;
        this.path.reset();
        this.hashData.clear();
        if (this.width > 0) {
            filterData(list);
        } else {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "width=0");
        }
        postInvalidate();
    }

    private void filterData(java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean> list) {
        for (int i = 0; i < list.size(); i++) {
            com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean bpDataBean = list.get(i);
            bpDataBean.sbp -= 50;
            bpDataBean.dbp -= 50;
            int min = bpDataBean.getMin();
            int i2 = this.width;
            int i3 = this.leftRightOffset;
            bpDataBean.dbpX = ((min * (i2 - (i3 * 2))) / this.xMax) + i3;
            bpDataBean.dbpY = (this.lineHeight - this.bottomOffset) - ((bpDataBean.getDbp() * (this.height - this.bottomOffset)) / this.yMax);
            int min2 = bpDataBean.getMin();
            int i4 = this.width;
            int i5 = this.leftRightOffset;
            bpDataBean.sbpX = ((min2 * (i4 - (i5 * 2))) / this.xMax) + i5;
            bpDataBean.sbpY = (this.lineHeight - this.bottomOffset) - ((bpDataBean.getSbp() * (this.height - this.bottomOffset)) / this.yMax);
        }
        this.bpList = list;
        this.path.reset();
        this.path1.reset();
        this.hashData.clear();
        int i6 = com.hjq.permissions.XXPermissions.REQUEST_CODE;
        int i7 = 0;
        for (int i8 = 0; i8 < this.bpList.size(); i8++) {
            com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean bpDataBean2 = this.bpList.get(i8);
            if (bpDataBean2.getMin() < i6) {
                i6 = bpDataBean2.getMin();
            }
            if (bpDataBean2.getMin() > i7) {
                i7 = bpDataBean2.getMin();
            }
        }
        if (this.bpList.size() > 0) {
            this.timeArray = new int[this.bpList.size()];
        } else {
            this.timeArray = new int[1440];
            for (int i9 = 0; i9 < 1440; i9++) {
                this.timeArray[i9] = i9;
            }
        }
        for (int i10 = 0; i10 < this.bpList.size(); i10++) {
            com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean bpDataBean3 = this.bpList.get(i10);
            this.timeArray[i10] = bpDataBean3.getMin();
            this.hashData.put(bpDataBean3.getMin() + "", bpDataBean3);
            if (i10 == 0) {
                this.path.moveTo(bpDataBean3.sbpX, bpDataBean3.sbpY);
                this.path.lineTo(bpDataBean3.sbpX, bpDataBean3.sbpY);
                this.path1.moveTo(bpDataBean3.dbpX, bpDataBean3.dbpY);
            } else {
                this.path.lineTo(bpDataBean3.sbpX, bpDataBean3.sbpY);
            }
            this.path1.lineTo(bpDataBean3.dbpX, bpDataBean3.dbpY);
        }
        postInvalidate();
    }

    public int getMySize(int defaultSize, int measureSpec) {
        int mode = android.view.View.MeasureSpec.getMode(measureSpec);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? android.view.View.MeasureSpec.getSize(measureSpec) : defaultSize;
    }

    public static class BpDataBean {
        private int dbp;
        public int dbpX;
        public int dbpY;
        private int min;
        private int sbp;
        public int sbpX;
        public int sbpY;
        private long unixTime;

        public BpDataBean(int min, int sbp, int dbp) {
            this.min = min;
            this.sbp = sbp;
            this.dbp = dbp;
        }

        public BpDataBean(int min, int sbp, int dbp, long unixTime) {
            this.min = min;
            this.sbp = sbp;
            this.dbp = dbp;
            this.unixTime = unixTime;
        }

        public int getMin() {
            return this.min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getSbp() {
            return this.sbp;
        }

        public void setSbp(int sbp) {
            this.sbp = sbp;
        }

        public int getDbp() {
            return this.dbp;
        }

        public void setDbp(int dbp) {
            this.dbp = dbp;
        }

        public int getSbpX() {
            return this.sbpX;
        }

        public void setSbpX(int sbpX) {
            this.sbpX = sbpX;
        }

        public int getSbpY() {
            return this.sbpY;
        }

        public void setSbpY(int sbpY) {
            this.sbpY = sbpY;
        }

        public int getDbpX() {
            return this.dbpX;
        }

        public void setDbpX(int dbpX) {
            this.dbpX = dbpX;
        }

        public int getDbpY() {
            return this.dbpY;
        }

        public void setDbpY(int dbpY) {
            this.dbpY = dbpY;
        }

        public long getUnixTime() {
            return this.unixTime;
        }

        public void setUnixTime(long unixTime) {
            this.unixTime = unixTime;
        }
    }
}
