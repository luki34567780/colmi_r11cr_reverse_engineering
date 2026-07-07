package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QBgRunningTextView extends androidx.constraintlayout.widget.ConstraintLayout {
    private android.widget.TextView des;
    private android.widget.TextView title;
    private android.widget.TextView toSetting;

    public QBgRunningTextView(android.content.Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QBgRunningTextView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.qcwireless.qcwatch.R.layout.qc_appbackground_text, (android.view.ViewGroup) this);
        this.title = (android.widget.TextView) inflate.findViewById(com.qcwireless.qcwatch.R.id.app_title);
        this.des = (android.widget.TextView) inflate.findViewById(com.qcwireless.qcwatch.R.id.app_des);
        this.toSetting = (android.widget.TextView) inflate.findViewById(com.qcwireless.qcwatch.R.id.btn_app_setting);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.qc_background_setting);
        java.lang.String string = obtainStyledAttributes.getString(1);
        java.lang.String string2 = obtainStyledAttributes.getString(0);
        this.title.setText(string);
        this.des.setText(string2);
        obtainStyledAttributes.recycle();
    }

    public QBgRunningTextView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setClickListener(android.view.View.OnClickListener listener) {
        this.toSetting.setOnClickListener(listener);
    }

    public void setImgBackground(android.graphics.drawable.Drawable drawable) {
        this.toSetting.setBackground(drawable);
    }

    public void setBtnText(java.lang.String text) {
        this.toSetting.setText(text);
    }

    public void setBtnTextColor(int color) {
        this.toSetting.setTextColor(color);
    }
}
