package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
final class Month implements java.io.Serializable {
    private int count;
    private int diff;
    private int month;
    private int year;

    Month() {
    }

    int getDiff() {
        return this.diff;
    }

    void setDiff(int i) {
        this.diff = i;
    }

    int getCount() {
        return this.count;
    }

    void setCount(int i) {
        this.count = i;
    }

    int getMonth() {
        return this.month;
    }

    void setMonth(int i) {
        this.month = i;
    }

    int getYear() {
        return this.year;
    }

    void setYear(int i) {
        this.year = i;
    }
}
