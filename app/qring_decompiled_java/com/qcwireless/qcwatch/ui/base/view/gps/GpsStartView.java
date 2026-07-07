package com.qcwireless.qcwatch.ui.base.view.gps;

/* loaded from: /tmp/dex/classes2.dex */
public class GpsStartView extends android.widget.FrameLayout {
    android.widget.ImageView imageView;

    public GpsStartView(android.content.Context context) {
        super(context);
        initView(context);
    }

    public GpsStartView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    protected void initView(android.content.Context context) {
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.imageView = imageView;
        imageView.setPadding(22, 22, 22, 22);
        this.imageView.setImageResource(com.qcwireless.qcwatch.R.mipmap.gps_start);
        addView(this.imageView);
    }
}
