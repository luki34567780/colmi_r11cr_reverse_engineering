package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class DragView extends android.view.View {
    protected int mXDelta;
    protected int mYDelta;

    public DragView(android.content.Context context) {
        this(context, null);
    }

    public DragView(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DragView(android.content.Context context, android.util.AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) getLayoutParams();
        int action = event.getAction() & 255;
        if (action == 0) {
            this.mXDelta = ((int) event.getRawX()) - marginLayoutParams.leftMargin;
            this.mYDelta = ((int) event.getRawY()) - marginLayoutParams.topMargin;
        } else if (action == 2) {
            int[] parseMargin = parseMargin(event, (android.view.ViewGroup) getParent());
            marginLayoutParams.leftMargin = parseMargin[0];
            marginLayoutParams.topMargin = parseMargin[1];
            setLayoutParams(marginLayoutParams);
        }
        bringToFront();
        return true;
    }

    protected int[] parseMargin(android.view.MotionEvent event, android.view.ViewGroup parent) {
        int rawX = ((int) event.getRawX()) - this.mXDelta;
        int width = ((parent.getWidth() - parent.getPaddingLeft()) - parent.getPaddingRight()) - getWidth();
        if (rawX <= 0) {
            rawX = 0;
        } else if (rawX >= width) {
            rawX = width;
        }
        int rawY = ((int) event.getRawY()) - this.mYDelta;
        int height = ((parent.getHeight() - parent.getPaddingTop()) - parent.getPaddingBottom()) - getHeight();
        if (rawY <= 0) {
            rawY = 0;
        } else if (rawY >= height) {
            rawY = height;
        }
        return new int[]{rawX, rawY};
    }
}
