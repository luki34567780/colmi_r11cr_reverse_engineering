package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public final class TrunkBranchAnnals {
    private static java.lang.String[] BRANCH_STR;
    private static java.lang.String[] TRUNK_STR;

    public static void init(android.content.Context context) {
        if (TRUNK_STR != null) {
            return;
        }
        TRUNK_STR = context.getResources().getStringArray(com.haibin.calendarview.R.array.trunk_string_array);
        BRANCH_STR = context.getResources().getStringArray(com.haibin.calendarview.R.array.branch_string_array);
    }

    public static java.lang.String getTrunkString(int i) {
        return TRUNK_STR[getTrunkInt(i)];
    }

    public static int getTrunkInt(int i) {
        int i2 = i % 10;
        if (i2 == 0) {
            return 9;
        }
        return i2 - 1;
    }

    public static java.lang.String getBranchString(int i) {
        return BRANCH_STR[getBranchInt(i)];
    }

    public static int getBranchInt(int i) {
        int i2 = i % 12;
        if (i2 == 0) {
            return 11;
        }
        return i2 - 1;
    }

    public static java.lang.String getTrunkBranchYear(int i) {
        return java.lang.String.format("%s%s", getTrunkString(i), getBranchString(i));
    }
}
