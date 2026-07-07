package com.qcwireless.qcwatch.ui.base.view.gps;

/* loaded from: /tmp/dex/classes2.dex */
public class LockView extends android.widget.FrameLayout implements com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.onAnimEnd {
    private com.qcwireless.qcwatch.ui.base.view.gps.LockView.EndListener endListener;
    android.os.Handler handler;
    private android.widget.ImageView imageView;
    private boolean isLock;
    private android.view.View.OnClickListener listener;
    private android.widget.ImageView lockImage;
    private com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar progressBar;

    public interface EndListener {
        void onEnd();
    }

    public boolean isLock() {
        return this.isLock;
    }

    public void setLock(boolean lock) {
        this.isLock = lock;
    }

    public LockView(android.content.Context context) {
        super(context);
        this.isLock = false;
        this.handler = new android.os.Handler() { // from class: com.qcwireless.qcwatch.ui.base.view.gps.LockView.2
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                super.handleMessage(msg);
                com.qcwireless.qcwatch.ui.base.view.gps.LockView.this.progressBar.setVisibility(4);
                if (com.qcwireless.qcwatch.ui.base.view.gps.LockView.this.isLock) {
                    com.qcwireless.qcwatch.ui.base.view.gps.LockView.this.flipAnimator(2);
                }
            }
        };
        initView(context);
    }

    public LockView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.isLock = false;
        this.handler = new android.os.Handler() { // from class: com.qcwireless.qcwatch.ui.base.view.gps.LockView.2
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                super.handleMessage(msg);
                com.qcwireless.qcwatch.ui.base.view.gps.LockView.this.progressBar.setVisibility(4);
                if (com.qcwireless.qcwatch.ui.base.view.gps.LockView.this.isLock) {
                    com.qcwireless.qcwatch.ui.base.view.gps.LockView.this.flipAnimator(2);
                }
            }
        };
        initView(context);
    }

    public com.qcwireless.qcwatch.ui.base.view.gps.LockView.EndListener getEndListener() {
        return this.endListener;
    }

    public void setEndListener(com.qcwireless.qcwatch.ui.base.view.gps.LockView.EndListener endListener) {
        this.endListener = endListener;
    }

    public android.view.View.OnClickListener getListener() {
        return this.listener;
    }

    public void setListener(android.view.View.OnClickListener listener) {
        this.listener = listener;
        android.widget.ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    private void initView(android.content.Context context) {
        this.imageView = new android.widget.ImageView(context);
        this.lockImage = new android.widget.ImageView(context);
        this.imageView.setPadding(22, 22, 22, 22);
        this.lockImage.setPadding(22, 22, 22, 22);
        this.imageView.setImageResource(com.qcwireless.qcwatch.R.mipmap.gps_pause);
        this.lockImage.setImageResource(com.qcwireless.qcwatch.R.mipmap.gps_lock);
        com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar lockProgressBar = new com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar(context);
        this.progressBar = lockProgressBar;
        lockProgressBar.setAnimListener(this);
        addView(this.lockImage);
        addView(this.imageView);
        addView(this.progressBar);
        this.lockImage.setVisibility(8);
        this.progressBar.setVisibility(4);
        setImageBg(com.qcwireless.qcwatch.R.mipmap.gps_pause, com.qcwireless.qcwatch.R.mipmap.gps_lock, androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.gps_run_lock_1), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.gps_run_lock_2));
    }

    public void setImageBg(int bg1, int bg2, int color1, int color2) {
        this.imageView.setImageResource(bg1);
        this.lockImage.setImageResource(bg2);
        this.progressBar.setPaintColor(color1, color2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            android.util.Log.i("----testEvent", "LockView is Down");
            this.progressBar.startAnim();
        } else if (action == 1) {
            this.progressBar.setCut(true);
        }
        return true;
    }

    public void flipAnimator(final int type) {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        if (type == 1) {
            imageView = this.imageView;
            imageView2 = this.lockImage;
        } else {
            imageView = this.lockImage;
            imageView2 = this.imageView;
        }
        final android.widget.ImageView imageView3 = imageView;
        final android.widget.ImageView imageView4 = imageView2;
        imageView3.setVisibility(0);
        imageView4.setVisibility(8);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView3, "rotationY", 0.0f, 90.0f);
        final android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(imageView4, "rotationY", -90.0f, 0.0f);
        ofFloat2.setInterpolator(new android.view.animation.OvershootInterpolator(2.0f));
        ofFloat.setDuration(200L).start();
        ofFloat.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.qcwireless.qcwatch.ui.base.view.gps.LockView.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animation) {
                imageView3.setVisibility(8);
                imageView4.setVisibility(0);
                ofFloat2.setDuration(200L).start();
                if (type != 2 || com.qcwireless.qcwatch.ui.base.view.gps.LockView.this.endListener == null) {
                    return;
                }
                com.qcwireless.qcwatch.ui.base.view.gps.LockView.this.endListener.onEnd();
            }
        });
    }

    @Override // com.qcwireless.qcwatch.ui.base.view.gps.LockProgressBar.onAnimEnd
    public void animEndListener(boolean isLock) {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(isLock));
        this.isLock = isLock;
        this.handler.sendEmptyMessage(1);
    }
}
