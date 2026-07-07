package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class MyRecycleView extends androidx.recyclerview.widget.RecyclerView {
    private static final java.lang.String TAG = "MyRecycleView";
    private int INVALID_POINTER;
    private int initialTouchX;
    private int initialTouchY;
    private android.content.Context mContext;
    private int scrollPointerId;
    private int touchSlop;

    public MyRecycleView(android.content.Context context) {
        this(context, null);
    }

    public MyRecycleView(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyRecycleView(android.content.Context context, android.util.AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.INVALID_POINTER = -1;
        this.scrollPointerId = -1;
        this.touchSlop = android.view.ViewConfiguration.get(context).getScaledEdgeSlop();
        this.mContext = context;
    }

    public void setScrollingTouchSlop(int slopConstant) {
        super.setScrollingTouchSlop(slopConstant);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(this.mContext);
        if (slopConstant == 0) {
            this.touchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            if (slopConstant != 1) {
                return;
            }
            this.touchSlop = androidx.core.view.ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        }
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent e) {
        if (e == null) {
            return false;
        }
        int actionMasked = androidx.core.view.MotionEventCompat.getActionMasked(e);
        int actionIndex = androidx.core.view.MotionEventCompat.getActionIndex(e);
        if (actionMasked == 0) {
            this.scrollPointerId = androidx.core.view.MotionEventCompat.getPointerId(e, 0);
            this.initialTouchX = java.lang.Math.round(e.getX() + 0.5f);
            this.initialTouchY = java.lang.Math.round(e.getY() + 0.5f);
            return super.onInterceptTouchEvent(e);
        }
        if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.scrollPointerId = androidx.core.view.MotionEventCompat.getPointerId(e, actionIndex);
                this.initialTouchX = java.lang.Math.round(androidx.core.view.MotionEventCompat.getX(e, actionIndex) + 0.5f);
                this.initialTouchY = java.lang.Math.round(androidx.core.view.MotionEventCompat.getY(e, actionIndex) + 0.5f);
                return super.onInterceptTouchEvent(e);
            }
            return super.onInterceptTouchEvent(e);
        }
        int findPointerIndex = androidx.core.view.MotionEventCompat.findPointerIndex(e, this.scrollPointerId);
        if (findPointerIndex < 0) {
            return false;
        }
        int round = java.lang.Math.round(androidx.core.view.MotionEventCompat.getX(e, findPointerIndex) + 0.5f);
        int round2 = java.lang.Math.round(androidx.core.view.MotionEventCompat.getY(e, findPointerIndex) + 0.5f);
        if (getScrollState() != 1) {
            int i = round - this.initialTouchX;
            int i2 = round2 - this.initialTouchY;
            boolean z = getLayoutManager().canScrollHorizontally() && java.lang.Math.abs(i) > this.touchSlop && java.lang.Math.abs(i) > java.lang.Math.abs(i2);
            if (getLayoutManager().canScrollVertically() && java.lang.Math.abs(i2) > this.touchSlop && java.lang.Math.abs(i2) - java.lang.Math.abs(i) > 100) {
                z = true;
            }
            return z && super.onInterceptTouchEvent(e);
        }
        return super.onInterceptTouchEvent(e);
    }
}
