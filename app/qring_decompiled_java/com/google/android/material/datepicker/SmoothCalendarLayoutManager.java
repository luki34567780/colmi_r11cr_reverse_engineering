package com.google.android.material.datepicker;

/* loaded from: /tmp/dex/classes2.dex */
class SmoothCalendarLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    private static final float MILLISECONDS_PER_INCH = 100.0f;

    SmoothCalendarLayoutManager(android.content.Context context, int i, boolean z) {
        super(context, i, z);
    }

    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state, int i) {
        androidx.recyclerview.widget.LinearSmoothScroller linearSmoothScroller = new androidx.recyclerview.widget.LinearSmoothScroller(recyclerView.getContext()) { // from class: com.google.android.material.datepicker.SmoothCalendarLayoutManager.1
            protected float calculateSpeedPerPixel(android.util.DisplayMetrics displayMetrics) {
                return com.google.android.material.datepicker.SmoothCalendarLayoutManager.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
            }
        };
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }
}
