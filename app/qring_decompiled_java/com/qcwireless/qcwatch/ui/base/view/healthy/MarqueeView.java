package com.qcwireless.qcwatch.ui.base.view.healthy;

/* loaded from: /tmp/dex/classes2.dex */
public class MarqueeView extends android.widget.ViewFlipper implements skin.support.widget.SkinCompatSupportable {
    private static final int TEXT_GRAVITY_CENTER = 1;
    private static final int TEXT_GRAVITY_LEFT = 0;
    private static final int TEXT_GRAVITY_RIGHT = 2;
    private int animDuration;
    private int gravity;
    private int interval;
    private boolean isSetAnimDuration;
    private android.content.Context mContext;
    private java.util.List<? extends java.lang.CharSequence> notices;
    private com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView.OnItemClickListener onItemClickListener;
    private boolean singleLine;
    private int textColor;
    private int textColorId;
    private int textSize;

    public interface OnItemClickListener {
        void onItemClick(int position, android.widget.TextView textView);
    }

    public MarqueeView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.isSetAnimDuration = false;
        this.interval = 2000;
        this.animDuration = 500;
        this.textSize = 14;
        this.textColor = -1;
        this.singleLine = false;
        this.gravity = 19;
        init(context, attrs, 0);
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        this.mContext = context;
        if (this.notices == null) {
            this.notices = new java.util.ArrayList();
        }
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.MarqueeViewStyle, defStyleAttr, 0);
        this.interval = obtainStyledAttributes.getInteger(2, this.interval);
        this.isSetAnimDuration = obtainStyledAttributes.hasValue(0);
        this.singleLine = obtainStyledAttributes.getBoolean(3, false);
        this.animDuration = obtainStyledAttributes.getInteger(0, this.animDuration);
        if (obtainStyledAttributes.hasValue(5)) {
            int dimension = (int) obtainStyledAttributes.getDimension(5, this.textSize);
            this.textSize = dimension;
            this.textSize = px2sp(this.mContext, dimension);
        }
        this.textColor = obtainStyledAttributes.getColor(4, this.textColor);
        this.textColorId = obtainStyledAttributes.getResourceId(4, 0);
        int i = obtainStyledAttributes.getInt(1, 0);
        if (i == 1) {
            this.gravity = 17;
        } else if (i == 2) {
            this.gravity = 21;
        }
        obtainStyledAttributes.recycle();
        setFlipInterval(this.interval);
        switchSkin();
    }

    private void switchSkin() {
        try {
            int checkResourceId = skin.support.widget.SkinCompatHelper.checkResourceId(this.textColorId);
            if (checkResourceId != 0) {
                this.textColor = skin.support.content.res.SkinCompatResources.getColor(getContext(), checkResourceId);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void startWithText(final java.lang.String notice) {
        if (android.text.TextUtils.isEmpty(notice)) {
            return;
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView marqueeView = com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView.this;
                marqueeView.startWithFixedWidth(notice, marqueeView.getWidth());
            }
        });
    }

    public int px2sp(android.content.Context context, float pxValue) {
        return (int) ((pxValue / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public int px2dip(android.content.Context context, float pxValue) {
        return (int) ((pxValue / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static float dp2px(android.content.Context context, float dp) {
        return (dp * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public void startWithList(java.util.List<? extends java.lang.CharSequence> notices) {
        setNotices(notices);
        start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startWithFixedWidth(java.lang.String notice, int width) {
        int length = notice.length();
        int px2dip = px2dip(this.mContext, width);
        int i = px2dip / this.textSize;
        if (px2dip == 0) {
            throw new java.lang.RuntimeException("Please set MarqueeView width !");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (length <= i) {
            arrayList.add(notice);
        } else {
            int i2 = 0;
            int i3 = (length / i) + (length % i != 0 ? 1 : 0);
            while (i2 < i3) {
                int i4 = i2 * i;
                i2++;
                int i5 = i2 * i;
                if (i5 >= length) {
                    i5 = length;
                }
                arrayList.add(notice.substring(i4, i5));
            }
        }
        this.notices.addAll(arrayList);
        start();
    }

    public boolean start() {
        java.util.List<? extends java.lang.CharSequence> list = this.notices;
        boolean z = false;
        z = false;
        if (list != null && list.size() != 0) {
            removeAllViews();
            resetAnimation();
            for (final int i = 0; i < this.notices.size(); i++) {
                final android.widget.TextView createTextView = createTextView(this.notices.get(i), i);
                createTextView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View v) {
                        if (com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView.this.onItemClickListener != null) {
                            com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView.this.onItemClickListener.onItemClick(i, createTextView);
                        }
                    }
                });
                addView(createTextView);
            }
            z = true;
            z = true;
            if (this.notices.size() > 1) {
                startFlipping();
            } else {
                stopFlipping();
            }
        }
        return z;
    }

    private void resetAnimation() {
        clearAnimation();
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.mContext, com.qcwireless.qcwatch.R.anim.anim_marquee_in);
        if (this.isSetAnimDuration) {
            loadAnimation.setDuration(this.animDuration);
        }
        setInAnimation(loadAnimation);
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(this.mContext, com.qcwireless.qcwatch.R.anim.anim_marquee_out);
        if (this.isSetAnimDuration) {
            loadAnimation2.setDuration(this.animDuration);
        }
        setOutAnimation(loadAnimation2);
    }

    private android.widget.TextView createTextView(java.lang.CharSequence text, int position) {
        android.widget.TextView textView = new android.widget.TextView(this.mContext);
        textView.setMaxWidth((int) dp2px(this.mContext, 250.0f));
        textView.setMinWidth((int) dp2px(this.mContext, 220.0f));
        textView.setGravity(this.gravity);
        textView.setText(text);
        textView.setTextColor(this.textColor);
        textView.setTextSize(this.textSize);
        textView.setSingleLine(this.singleLine);
        textView.setTag(java.lang.Integer.valueOf(position));
        return textView;
    }

    public int getPosition() {
        return ((java.lang.Integer) getCurrentView().getTag()).intValue();
    }

    public java.util.List<? extends java.lang.CharSequence> getNotices() {
        return this.notices;
    }

    public void setNotices(java.util.List<? extends java.lang.CharSequence> notices) {
        this.notices = notices;
    }

    public void setOnItemClickListener(com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void applySkin() {
        switchSkin();
    }
}
