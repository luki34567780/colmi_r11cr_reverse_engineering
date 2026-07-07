package com.qcwireless.qcwatch.ui.base.view.ucenter;

/* loaded from: /tmp/dex/classes2.dex */
public class MyScrollView extends androidx.core.widget.NestedScrollView {
    private int downX;
    private int downY;
    private int mTouchSlop;
    private int moveX;
    private int moveY;

    public MyScrollView(android.content.Context context) {
        super(context);
        this.mTouchSlop = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public MyScrollView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mTouchSlop = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public MyScrollView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mTouchSlop = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent e) {
        int action = e.getAction();
        if (action == 0) {
            this.downX = (int) e.getRawX();
            this.downY = (int) e.getRawY();
        } else if (action == 2) {
            this.moveY = (int) e.getRawY();
            int rawX = (int) e.getRawX();
            this.moveX = rawX;
            if (java.lang.Math.abs(rawX - this.downX) > this.mTouchSlop) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(e);
    }
}
