package com.qcwireless.qcwatch.ui.base.view.gps;

/* loaded from: /tmp/dex/classes2.dex */
public class LockBaseView extends android.widget.FrameLayout implements com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.onAnimEnd {
    android.os.Handler handler;
    android.widget.ImageView imageView;
    boolean isLock;
    com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar progressBar;

    public LockBaseView(android.content.Context context) {
        super(context);
        this.isLock = false;
        this.handler = new android.os.Handler() { // from class: com.qcwireless.qcwatch.ui.base.view.gps.LockBaseView.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                super.handleMessage(msg);
                com.qcwireless.qcwatch.ui.base.view.gps.LockBaseView.this.animBack();
            }
        };
        initView(context);
    }

    public LockBaseView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.isLock = false;
        this.handler = new android.os.Handler() { // from class: com.qcwireless.qcwatch.ui.base.view.gps.LockBaseView.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                super.handleMessage(msg);
                com.qcwireless.qcwatch.ui.base.view.gps.LockBaseView.this.animBack();
            }
        };
        initView(context);
    }

    protected void initView(android.content.Context context) {
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.imageView = imageView;
        imageView.setPadding(22, 22, 22, 22);
        this.imageView.setImageResource(com.qcwireless.qcwatch.R.mipmap.gps_end);
        com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar lockProgressBar = new com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar(context, androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.gps_run_lock_1), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.gps_run_lock_2));
        this.progressBar = lockProgressBar;
        lockProgressBar.setAnimListener(this);
        addView(this.imageView);
        addView(this.progressBar);
        this.progressBar.setVisibility(4);
    }

    public void setImageBg(int bg1, int color1, int color2) {
        this.imageView.setImageResource(bg1);
        this.progressBar.setPaintColor(color1, color2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            this.progressBar.startAnim();
        } else if (action == 1) {
            this.progressBar.setCut(true);
        }
        return true;
    }

    @Override // com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.onAnimEnd
    public void animEndListener(boolean isLock) {
        this.isLock = isLock;
        this.handler.sendEmptyMessage(1);
    }

    protected void animBack() {
        this.progressBar.setVisibility(4);
    }
}
