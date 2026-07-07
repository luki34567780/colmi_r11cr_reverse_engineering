package com.qcwireless.qcwatch.ui.home.bp.util;

/* loaded from: /tmp/dex/classes2.dex */
public class CalcBloodPressureByHeart {
    public static int AGE_DEFAULT = 25;
    public static float HR_BP_RATE = 0.45f;
    public static int HR_DEFAULT_VALUE = 80;
    public static int HR_LOWER = 65;
    public static int HR_UPPER = 85;
    public static int MAX_BP_DIFF = 43;
    public static int MAX_SBP = 120;
    public static int MIN_BP_DIFF = 37;
    public static int MIN_SBP = 100;
    public static int[] AGE = {20, 30, 40, 50, 60};
    public static int[] AGE_BP_COF = {-10, 5, 15, 20, 25, 30};
    public static int g_reserve_sbp = 0;
    public static int g_last_sbp = 0;
    public static int g_last_hr = 0;
    public static int g_reserve_age = -1;
    public static int last_sbp = 0;
    public static int last_dbp = 0;

    public static int cal_sbp(int hr, int age) {
        float f;
        int i = g_reserve_sbp;
        if (i > 0 && age == g_reserve_age) {
            int i2 = g_last_sbp;
            if (hr > g_last_hr) {
                int i3 = (int) (i2 + ((hr - r1) * HR_BP_RATE));
                g_last_sbp = ((i + i3) + i2) / 3;
                i2 = i3 - ((int) (java.lang.Math.random() * 4.0d));
            }
            g_last_hr = hr;
            return i2;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = AGE;
            if (i5 >= iArr.length) {
                break;
            }
            if (age < iArr[i5]) {
                i4 = i5;
                break;
            }
            i5++;
        }
        int random = MIN_SBP + ((int) (java.lang.Math.random() * ((MAX_SBP - MIN_SBP) + 1))) + AGE_BP_COF[i4];
        g_reserve_sbp = random;
        if (hr < HR_LOWER) {
            f = random - ((r0 - hr) * HR_BP_RATE);
        } else {
            f = random + ((hr - r0) * HR_BP_RATE);
        }
        int i6 = (random + ((int) f)) / 2;
        g_last_sbp = i6;
        g_last_hr = hr;
        g_reserve_age = age;
        return i6;
    }

    public static int cal_dbp(int sbp) {
        return (sbp - MIN_BP_DIFF) + ((int) (java.lang.Math.random() * (MAX_BP_DIFF - MIN_BP_DIFF)));
    }
}
