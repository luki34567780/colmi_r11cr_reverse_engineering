package com.qcwireless.qcwatch.ui.base.view.ucenter;

/* loaded from: /tmp/dex/classes2.dex */
public class NoScrollViewPager extends androidx.viewpager.widget.ViewPager {
    private boolean isScroll;

    public NoScrollViewPager(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
    }

    public NoScrollViewPager(android.content.Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(android.view.MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
        if (this.isScroll) {
            return super.onInterceptTouchEvent(ev);
        }
        return false;
    }

    public boolean onTouchEvent(android.view.MotionEvent ev) {
        if (this.isScroll) {
            return super.onTouchEvent(ev);
        }
        return true;
    }

    public void setScroll(boolean scroll) {
        this.isScroll = scroll;
    }
}
