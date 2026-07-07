package com.qcwireless.qcwatch.base.dialog.bean;

/* loaded from: /tmp/dex/classes2.dex */
public class WeekRepeat {
    private boolean check;
    private java.lang.String day;
    private int repeat;

    public WeekRepeat(java.lang.String day, boolean check) {
        this.day = day;
        this.check = check;
    }

    public WeekRepeat(java.lang.String day, boolean check, int repeat) {
        this.day = day;
        this.check = check;
        this.repeat = repeat;
    }

    public int getRepeat() {
        return this.repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public java.lang.String getDay() {
        return this.day;
    }

    public void setDay(java.lang.String day) {
        this.day = day;
    }

    public boolean isCheck() {
        return this.check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
