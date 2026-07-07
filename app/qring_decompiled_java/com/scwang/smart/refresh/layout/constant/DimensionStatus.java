package com.scwang.smart.refresh.layout.constant;

/* loaded from: classes3.dex */
public class DimensionStatus {
    public static final com.scwang.smart.refresh.layout.constant.DimensionStatus CodeExact;
    public static final com.scwang.smart.refresh.layout.constant.DimensionStatus CodeExactUnNotify;
    public static final com.scwang.smart.refresh.layout.constant.DimensionStatus DeadLock;
    public static final com.scwang.smart.refresh.layout.constant.DimensionStatus DeadLockUnNotify;
    public static final com.scwang.smart.refresh.layout.constant.DimensionStatus Default;
    public static final com.scwang.smart.refresh.layout.constant.DimensionStatus DefaultUnNotify;
    public static final com.scwang.smart.refresh.layout.constant.DimensionStatus XmlExact;
    public static final com.scwang.smart.refresh.layout.constant.DimensionStatus XmlExactUnNotify;
    public static final com.scwang.smart.refresh.layout.constant.DimensionStatus XmlLayout;
    public static final com.scwang.smart.refresh.layout.constant.DimensionStatus XmlLayoutUnNotify;
    public static final com.scwang.smart.refresh.layout.constant.DimensionStatus XmlWrap;
    public static final com.scwang.smart.refresh.layout.constant.DimensionStatus XmlWrapUnNotify;
    public static final com.scwang.smart.refresh.layout.constant.DimensionStatus[] values;
    public final boolean notified;
    public final int ordinal;

    static {
        com.scwang.smart.refresh.layout.constant.DimensionStatus dimensionStatus = new com.scwang.smart.refresh.layout.constant.DimensionStatus(0, false);
        DefaultUnNotify = dimensionStatus;
        com.scwang.smart.refresh.layout.constant.DimensionStatus dimensionStatus2 = new com.scwang.smart.refresh.layout.constant.DimensionStatus(1, true);
        Default = dimensionStatus2;
        com.scwang.smart.refresh.layout.constant.DimensionStatus dimensionStatus3 = new com.scwang.smart.refresh.layout.constant.DimensionStatus(2, false);
        XmlWrapUnNotify = dimensionStatus3;
        com.scwang.smart.refresh.layout.constant.DimensionStatus dimensionStatus4 = new com.scwang.smart.refresh.layout.constant.DimensionStatus(3, true);
        XmlWrap = dimensionStatus4;
        com.scwang.smart.refresh.layout.constant.DimensionStatus dimensionStatus5 = new com.scwang.smart.refresh.layout.constant.DimensionStatus(4, false);
        XmlExactUnNotify = dimensionStatus5;
        com.scwang.smart.refresh.layout.constant.DimensionStatus dimensionStatus6 = new com.scwang.smart.refresh.layout.constant.DimensionStatus(5, true);
        XmlExact = dimensionStatus6;
        com.scwang.smart.refresh.layout.constant.DimensionStatus dimensionStatus7 = new com.scwang.smart.refresh.layout.constant.DimensionStatus(6, false);
        XmlLayoutUnNotify = dimensionStatus7;
        com.scwang.smart.refresh.layout.constant.DimensionStatus dimensionStatus8 = new com.scwang.smart.refresh.layout.constant.DimensionStatus(7, true);
        XmlLayout = dimensionStatus8;
        com.scwang.smart.refresh.layout.constant.DimensionStatus dimensionStatus9 = new com.scwang.smart.refresh.layout.constant.DimensionStatus(8, false);
        CodeExactUnNotify = dimensionStatus9;
        com.scwang.smart.refresh.layout.constant.DimensionStatus dimensionStatus10 = new com.scwang.smart.refresh.layout.constant.DimensionStatus(9, true);
        CodeExact = dimensionStatus10;
        com.scwang.smart.refresh.layout.constant.DimensionStatus dimensionStatus11 = new com.scwang.smart.refresh.layout.constant.DimensionStatus(10, false);
        DeadLockUnNotify = dimensionStatus11;
        com.scwang.smart.refresh.layout.constant.DimensionStatus dimensionStatus12 = new com.scwang.smart.refresh.layout.constant.DimensionStatus(10, true);
        DeadLock = dimensionStatus12;
        values = new com.scwang.smart.refresh.layout.constant.DimensionStatus[]{dimensionStatus, dimensionStatus2, dimensionStatus3, dimensionStatus4, dimensionStatus5, dimensionStatus6, dimensionStatus7, dimensionStatus8, dimensionStatus9, dimensionStatus10, dimensionStatus11, dimensionStatus12};
    }

    private DimensionStatus(int i, boolean z) {
        this.ordinal = i;
        this.notified = z;
    }

    public com.scwang.smart.refresh.layout.constant.DimensionStatus unNotify() {
        if (!this.notified) {
            return this;
        }
        com.scwang.smart.refresh.layout.constant.DimensionStatus dimensionStatus = values[this.ordinal - 1];
        return !dimensionStatus.notified ? dimensionStatus : DefaultUnNotify;
    }

    public com.scwang.smart.refresh.layout.constant.DimensionStatus notified() {
        return !this.notified ? values[this.ordinal + 1] : this;
    }

    public boolean canReplaceWith(com.scwang.smart.refresh.layout.constant.DimensionStatus dimensionStatus) {
        int i = this.ordinal;
        int i2 = dimensionStatus.ordinal;
        return i < i2 || ((!this.notified || CodeExact == this) && i == i2);
    }
}
