package com.qcwireless.qcwatch.ui.plate.bean;

/* loaded from: /tmp/dex/classes2.dex */
public class WatchFaceTag {
    private boolean check;
    private java.lang.String tag;

    public WatchFaceTag(java.lang.String tag, boolean check) {
        this.tag = tag;
        this.check = check;
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    public void setTag(java.lang.String tag) {
        this.tag = tag;
    }

    public boolean isCheck() {
        return this.check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
