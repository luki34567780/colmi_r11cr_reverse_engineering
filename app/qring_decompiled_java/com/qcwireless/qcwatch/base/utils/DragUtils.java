package com.qcwireless.qcwatch.base.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class DragUtils {
    protected int mXDelta;
    protected int mYDelta;

    public void dragView(final android.view.View view) {
        view.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.qcwireless.qcwatch.base.utils.DragUtils.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int action = event.getAction() & 255;
                if (action == 0) {
                    com.qcwireless.qcwatch.base.utils.DragUtils.this.mXDelta = ((int) event.getRawX()) - marginLayoutParams.leftMargin;
                    com.qcwireless.qcwatch.base.utils.DragUtils.this.mYDelta = ((int) event.getRawY()) - marginLayoutParams.topMargin;
                } else if (action == 2) {
                    int[] parseMargin = com.qcwireless.qcwatch.base.utils.DragUtils.this.parseMargin(event, (android.view.ViewGroup) view.getParent(), view);
                    marginLayoutParams.leftMargin = parseMargin[0];
                    marginLayoutParams.topMargin = parseMargin[1];
                    view.setLayoutParams(marginLayoutParams);
                }
                view.bringToFront();
                return true;
            }
        });
    }

    protected int[] parseMargin(android.view.MotionEvent event, android.view.ViewGroup parent, android.view.View view) {
        int rawX = ((int) event.getRawX()) - this.mXDelta;
        int width = ((parent.getWidth() - parent.getPaddingLeft()) - parent.getPaddingRight()) - view.getWidth();
        if (rawX <= 0) {
            rawX = 0;
        } else if (rawX >= width) {
            rawX = width;
        }
        int rawY = ((int) event.getRawY()) - this.mYDelta;
        int height = ((parent.getHeight() - parent.getPaddingTop()) - parent.getPaddingBottom()) - view.getHeight();
        if (rawY <= 0) {
            rawY = 0;
        } else if (rawY >= height) {
            rawY = height;
        }
        return new int[]{rawX, rawY};
    }
}
