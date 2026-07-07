package com.luck.picture.lib.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class DateUtils {
    private static final java.text.SimpleDateFormat SF = new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS");
    private static final java.text.SimpleDateFormat SDF = new java.text.SimpleDateFormat("yyyy-MM");
    private static final java.text.SimpleDateFormat SDF_YEAR = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static long getCurrentTimeMillis() {
        java.lang.String valueOf = com.luck.picture.lib.utils.ValueOf.toString(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (valueOf.length() > 10) {
            valueOf = valueOf.substring(0, 10);
        }
        return com.luck.picture.lib.utils.ValueOf.toLong(valueOf);
    }

    public static java.lang.String getDataFormat(android.content.Context context, long j) {
        if (java.lang.String.valueOf(j).length() <= 10) {
            j *= 1000;
        }
        if (isThisWeek(j)) {
            return context.getString(com.luck.picture.lib.R.string.ps_current_week);
        }
        if (isThisMonth(j)) {
            return context.getString(com.luck.picture.lib.R.string.ps_current_month);
        }
        return SDF.format(java.lang.Long.valueOf(j));
    }

    public static java.lang.String getYearDataFormat(long j) {
        if (java.lang.String.valueOf(j).length() <= 10) {
            j *= 1000;
        }
        return SDF_YEAR.format(java.lang.Long.valueOf(j));
    }

    private static boolean isThisWeek(long j) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i = calendar.get(3);
        calendar.setTime(new java.util.Date(j));
        return calendar.get(3) == i;
    }

    public static boolean isThisMonth(long j) {
        java.util.Date date = new java.util.Date(j);
        java.text.SimpleDateFormat simpleDateFormat = SDF;
        return simpleDateFormat.format(date).equals(simpleDateFormat.format(new java.util.Date()));
    }

    public static long millisecondToSecond(long j) {
        return (j / 1000) * 1000;
    }

    public static int dateDiffer(long j) {
        try {
            return (int) java.lang.Math.abs(getCurrentTimeMillis() - j);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static java.lang.String formatDurationTime(long j) {
        java.lang.String str = j < 0 ? "-" : "";
        long abs = java.lang.Math.abs(j) / 1000;
        long j2 = abs % 60;
        long j3 = (abs / 60) % 60;
        long j4 = abs / 3600;
        return j4 > 0 ? java.lang.String.format(java.util.Locale.getDefault(), "%s%d:%02d:%02d", str, java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j3), java.lang.Long.valueOf(j2)) : java.lang.String.format(java.util.Locale.getDefault(), "%s%02d:%02d", str, java.lang.Long.valueOf(j3), java.lang.Long.valueOf(j2));
    }

    public static java.lang.String getCreateFileName(java.lang.String str) {
        return str + SF.format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public static java.lang.String getCreateFileName() {
        return SF.format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public static java.lang.String cdTime(long j, long j2) {
        long j3 = j2 - j;
        if (j3 > 1000) {
            return (j3 / 1000) + "秒";
        }
        return j3 + "毫秒";
    }
}
