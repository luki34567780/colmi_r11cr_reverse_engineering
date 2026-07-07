package com.scwang.smart.refresh.layout.constant;

/* loaded from: classes3.dex */
public class SpinnerStyle {
    public static final com.scwang.smart.refresh.layout.constant.SpinnerStyle FixedBehind;
    public static final com.scwang.smart.refresh.layout.constant.SpinnerStyle FixedFront;
    public static final com.scwang.smart.refresh.layout.constant.SpinnerStyle MatchLayout;

    @java.lang.Deprecated
    public static final com.scwang.smart.refresh.layout.constant.SpinnerStyle Scale;
    public static final com.scwang.smart.refresh.layout.constant.SpinnerStyle Translate;
    public static final com.scwang.smart.refresh.layout.constant.SpinnerStyle[] values;
    public final boolean front;
    public final int ordinal;
    public final boolean scale;

    static {
        com.scwang.smart.refresh.layout.constant.SpinnerStyle spinnerStyle = new com.scwang.smart.refresh.layout.constant.SpinnerStyle(0, true, false);
        Translate = spinnerStyle;
        com.scwang.smart.refresh.layout.constant.SpinnerStyle spinnerStyle2 = new com.scwang.smart.refresh.layout.constant.SpinnerStyle(1, true, true);
        Scale = spinnerStyle2;
        com.scwang.smart.refresh.layout.constant.SpinnerStyle spinnerStyle3 = new com.scwang.smart.refresh.layout.constant.SpinnerStyle(2, false, false);
        FixedBehind = spinnerStyle3;
        com.scwang.smart.refresh.layout.constant.SpinnerStyle spinnerStyle4 = new com.scwang.smart.refresh.layout.constant.SpinnerStyle(3, true, false);
        FixedFront = spinnerStyle4;
        com.scwang.smart.refresh.layout.constant.SpinnerStyle spinnerStyle5 = new com.scwang.smart.refresh.layout.constant.SpinnerStyle(4, true, false);
        MatchLayout = spinnerStyle5;
        values = new com.scwang.smart.refresh.layout.constant.SpinnerStyle[]{spinnerStyle, spinnerStyle2, spinnerStyle3, spinnerStyle4, spinnerStyle5};
    }

    protected SpinnerStyle(int i, boolean z, boolean z2) {
        this.ordinal = i;
        this.front = z;
        this.scale = z2;
    }
}
