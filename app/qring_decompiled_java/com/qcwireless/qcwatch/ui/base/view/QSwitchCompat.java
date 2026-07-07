package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QSwitchCompat extends androidx.appcompat.widget.SwitchCompat implements skin.support.widget.SkinCompatSupportable {
    private android.content.Context context;
    private int drawableId1;
    private int drawableId2;

    public QSwitchCompat(android.content.Context context) {
        super(context);
        this.context = context;
        initView(context, null);
    }

    public QSwitchCompat(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initView(context, attrs);
    }

    public QSwitchCompat(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initView(context, attrs);
    }

    private void initView(android.content.Context context, android.util.AttributeSet attrs) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.SwitchCompat);
        this.drawableId1 = obtainStyledAttributes.getResourceId(2, 0);
        this.drawableId2 = obtainStyledAttributes.getResourceId(11, 0);
        obtainStyledAttributes.recycle();
        switchSkin();
    }

    private void switchSkin() {
        int checkResourceId = skin.support.widget.SkinCompatHelper.checkResourceId(this.drawableId1);
        if (checkResourceId != 0) {
            setThumbDrawable(skin.support.content.res.SkinCompatResources.getDrawable(this.context, checkResourceId));
        }
        int checkResourceId2 = skin.support.widget.SkinCompatHelper.checkResourceId(this.drawableId2);
        if (checkResourceId2 != 0) {
            setTrackDrawable(skin.support.content.res.SkinCompatResources.getDrawable(this.context, checkResourceId2));
        }
    }

    public void applySkin() {
        switchSkin();
    }
}
