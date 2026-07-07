package com.qcwireless.qcwatch.base.dialog.bean;

/* loaded from: /tmp/dex/classes2.dex */
public class ListDataBean {
    private boolean checked;
    private java.lang.String leftText;

    public ListDataBean(java.lang.String leftText, boolean checked) {
        this.leftText = leftText;
        this.checked = checked;
    }

    public java.lang.String getLeftText() {
        return this.leftText;
    }

    public void setLeftText(java.lang.String leftText) {
        this.leftText = leftText;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
