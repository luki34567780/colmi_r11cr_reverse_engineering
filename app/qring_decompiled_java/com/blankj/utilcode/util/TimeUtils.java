package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class TimeUtils {
    private static final java.lang.ThreadLocal<java.util.Map<java.lang.String, java.text.SimpleDateFormat>> SDF_THREAD_LOCAL = new java.lang.ThreadLocal<java.util.Map<java.lang.String, java.text.SimpleDateFormat>>() { // from class: com.blankj.utilcode.util.TimeUtils.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.util.Map<java.lang.String, java.text.SimpleDateFormat> initialValue() {
            return new java.util.HashMap();
        }
    };
    private static final java.lang.String[] CHINESE_ZODIAC = {"猴", "鸡", "狗", "猪", "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊"};
    private static final int[] ZODIAC_FLAGS = {20, 19, 21, 21, 21, 22, 23, 23, 23, 24, 23, 22};
    private static final java.lang.String[] ZODIAC = {"水瓶座", "双鱼座", "白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "摩羯座"};

    private static long timeSpan2Millis(long j, int i) {
        return j * i;
    }

    private static java.text.SimpleDateFormat getDefaultFormat() {
        return getSafeDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public static java.text.SimpleDateFormat getSafeDateFormat(java.lang.String str) {
        java.util.Map<java.lang.String, java.text.SimpleDateFormat> map = SDF_THREAD_LOCAL.get();
        java.text.SimpleDateFormat simpleDateFormat = map.get(str);
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        java.text.SimpleDateFormat simpleDateFormat2 = new java.text.SimpleDateFormat(str);
        map.put(str, simpleDateFormat2);
        return simpleDateFormat2;
    }

    private TimeUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static java.lang.String millis2String(long j) {
        return millis2String(j, getDefaultFormat());
    }

    public static java.lang.String millis2String(long j, java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'pattern' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return millis2String(j, getSafeDateFormat(str));
    }

    public static java.lang.String millis2String(long j, java.text.DateFormat dateFormat) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return dateFormat.format(new java.util.Date(j));
    }

    public static long string2Millis(java.lang.String str) {
        return string2Millis(str, getDefaultFormat());
    }

    public static long string2Millis(java.lang.String str, java.lang.String str2) {
        java.util.Objects.requireNonNull(str2, "Argument 'pattern' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return string2Millis(str, getSafeDateFormat(str2));
    }

    public static long string2Millis(java.lang.String str, java.text.DateFormat dateFormat) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        try {
            return dateFormat.parse(str).getTime();
        } catch (java.text.ParseException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public static java.util.Date string2Date(java.lang.String str) {
        return string2Date(str, getDefaultFormat());
    }

    public static java.util.Date string2Date(java.lang.String str, java.lang.String str2) {
        java.util.Objects.requireNonNull(str2, "Argument 'pattern' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return string2Date(str, getSafeDateFormat(str2));
    }

    public static java.util.Date string2Date(java.lang.String str, java.text.DateFormat dateFormat) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        try {
            return dateFormat.parse(str);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static java.lang.String date2String(java.util.Date date) {
        return date2String(date, getDefaultFormat());
    }

    public static java.lang.String date2String(java.util.Date date, java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'pattern' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getSafeDateFormat(str).format(date);
    }

    public static java.lang.String date2String(java.util.Date date, java.text.DateFormat dateFormat) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return dateFormat.format(date);
    }

    public static long date2Millis(java.util.Date date) {
        return date.getTime();
    }

    public static java.util.Date millis2Date(long j) {
        return new java.util.Date(j);
    }

    public static long getTimeSpan(java.lang.String str, java.lang.String str2, int i) {
        return getTimeSpan(str, str2, getDefaultFormat(), i);
    }

    public static long getTimeSpan(java.lang.String str, java.lang.String str2, java.text.DateFormat dateFormat, int i) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#2 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return millis2TimeSpan(string2Millis(str, dateFormat) - string2Millis(str2, dateFormat), i);
    }

    public static long getTimeSpan(java.util.Date date, java.util.Date date2, int i) {
        return millis2TimeSpan(date2Millis(date) - date2Millis(date2), i);
    }

    public static long getTimeSpan(long j, long j2, int i) {
        return millis2TimeSpan(j - j2, i);
    }

    public static java.lang.String getFitTimeSpan(java.lang.String str, java.lang.String str2, int i) {
        return millis2FitTimeSpan(string2Millis(str, getDefaultFormat()) - string2Millis(str2, getDefaultFormat()), i);
    }

    public static java.lang.String getFitTimeSpan(java.lang.String str, java.lang.String str2, java.text.DateFormat dateFormat, int i) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#2 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return millis2FitTimeSpan(string2Millis(str, dateFormat) - string2Millis(str2, dateFormat), i);
    }

    public static java.lang.String getFitTimeSpan(java.util.Date date, java.util.Date date2, int i) {
        return millis2FitTimeSpan(date2Millis(date) - date2Millis(date2), i);
    }

    public static java.lang.String getFitTimeSpan(long j, long j2, int i) {
        return millis2FitTimeSpan(j - j2, i);
    }

    public static long getNowMills() {
        return java.lang.System.currentTimeMillis();
    }

    public static java.lang.String getNowString() {
        return millis2String(java.lang.System.currentTimeMillis(), getDefaultFormat());
    }

    public static java.lang.String getNowString(java.text.DateFormat dateFormat) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return millis2String(java.lang.System.currentTimeMillis(), dateFormat);
    }

    public static java.util.Date getNowDate() {
        return new java.util.Date();
    }

    public static long getTimeSpanByNow(java.lang.String str, int i) {
        return getTimeSpan(str, getNowString(), getDefaultFormat(), i);
    }

    public static long getTimeSpanByNow(java.lang.String str, java.text.DateFormat dateFormat, int i) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getTimeSpan(str, getNowString(dateFormat), dateFormat, i);
    }

    public static long getTimeSpanByNow(java.util.Date date, int i) {
        return getTimeSpan(date, new java.util.Date(), i);
    }

    public static long getTimeSpanByNow(long j, int i) {
        return getTimeSpan(j, java.lang.System.currentTimeMillis(), i);
    }

    public static java.lang.String getFitTimeSpanByNow(java.lang.String str, int i) {
        return getFitTimeSpan(str, getNowString(), getDefaultFormat(), i);
    }

    public static java.lang.String getFitTimeSpanByNow(java.lang.String str, java.text.DateFormat dateFormat, int i) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getFitTimeSpan(str, getNowString(dateFormat), dateFormat, i);
    }

    public static java.lang.String getFitTimeSpanByNow(java.util.Date date, int i) {
        return getFitTimeSpan(date, getNowDate(), i);
    }

    public static java.lang.String getFitTimeSpanByNow(long j, int i) {
        return getFitTimeSpan(j, java.lang.System.currentTimeMillis(), i);
    }

    public static java.lang.String getFriendlyTimeSpanByNow(java.lang.String str) {
        return getFriendlyTimeSpanByNow(str, getDefaultFormat());
    }

    public static java.lang.String getFriendlyTimeSpanByNow(java.lang.String str, java.text.DateFormat dateFormat) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getFriendlyTimeSpanByNow(string2Millis(str, dateFormat));
    }

    public static java.lang.String getFriendlyTimeSpanByNow(java.util.Date date) {
        return getFriendlyTimeSpanByNow(date.getTime());
    }

    public static java.lang.String getFriendlyTimeSpanByNow(long j) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j;
        if (currentTimeMillis < 0) {
            return java.lang.String.format("%tc", java.lang.Long.valueOf(j));
        }
        if (currentTimeMillis < 1000) {
            return "刚刚";
        }
        if (currentTimeMillis < 60000) {
            return java.lang.String.format(java.util.Locale.getDefault(), "%d秒前", java.lang.Long.valueOf(currentTimeMillis / 1000));
        }
        if (currentTimeMillis < 3600000) {
            return java.lang.String.format(java.util.Locale.getDefault(), "%d分钟前", java.lang.Long.valueOf(currentTimeMillis / 60000));
        }
        long weeOfToday = getWeeOfToday();
        return j >= weeOfToday ? java.lang.String.format("今天%tR", java.lang.Long.valueOf(j)) : j >= weeOfToday - 86400000 ? java.lang.String.format("昨天%tR", java.lang.Long.valueOf(j)) : java.lang.String.format("%tF", java.lang.Long.valueOf(j));
    }

    private static long getWeeOfToday() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long getMillis(long j, long j2, int i) {
        return j + timeSpan2Millis(j2, i);
    }

    public static long getMillis(java.lang.String str, long j, int i) {
        return getMillis(str, getDefaultFormat(), j, i);
    }

    public static long getMillis(java.lang.String str, java.text.DateFormat dateFormat, long j, int i) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return string2Millis(str, dateFormat) + timeSpan2Millis(j, i);
    }

    public static long getMillis(java.util.Date date, long j, int i) {
        return date2Millis(date) + timeSpan2Millis(j, i);
    }

    public static java.lang.String getString(long j, long j2, int i) {
        return getString(j, getDefaultFormat(), j2, i);
    }

    public static java.lang.String getString(long j, java.text.DateFormat dateFormat, long j2, int i) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return millis2String(j + timeSpan2Millis(j2, i), dateFormat);
    }

    public static java.lang.String getString(java.lang.String str, long j, int i) {
        return getString(str, getDefaultFormat(), j, i);
    }

    public static java.lang.String getString(java.lang.String str, java.text.DateFormat dateFormat, long j, int i) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return millis2String(string2Millis(str, dateFormat) + timeSpan2Millis(j, i), dateFormat);
    }

    public static java.lang.String getString(java.util.Date date, long j, int i) {
        return getString(date, getDefaultFormat(), j, i);
    }

    public static java.lang.String getString(java.util.Date date, java.text.DateFormat dateFormat, long j, int i) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return millis2String(date2Millis(date) + timeSpan2Millis(j, i), dateFormat);
    }

    public static java.util.Date getDate(long j, long j2, int i) {
        return millis2Date(j + timeSpan2Millis(j2, i));
    }

    public static java.util.Date getDate(java.lang.String str, long j, int i) {
        return getDate(str, getDefaultFormat(), j, i);
    }

    public static java.util.Date getDate(java.lang.String str, java.text.DateFormat dateFormat, long j, int i) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return millis2Date(string2Millis(str, dateFormat) + timeSpan2Millis(j, i));
    }

    public static java.util.Date getDate(java.util.Date date, long j, int i) {
        return millis2Date(date2Millis(date) + timeSpan2Millis(j, i));
    }

    public static long getMillisByNow(long j, int i) {
        return getMillis(getNowMills(), j, i);
    }

    public static java.lang.String getStringByNow(long j, int i) {
        return getStringByNow(j, getDefaultFormat(), i);
    }

    public static java.lang.String getStringByNow(long j, java.text.DateFormat dateFormat, int i) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getString(getNowMills(), dateFormat, j, i);
    }

    public static java.util.Date getDateByNow(long j, int i) {
        return getDate(getNowMills(), j, i);
    }

    public static boolean isToday(java.lang.String str) {
        return isToday(string2Millis(str, getDefaultFormat()));
    }

    public static boolean isToday(java.lang.String str, java.text.DateFormat dateFormat) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return isToday(string2Millis(str, dateFormat));
    }

    public static boolean isToday(java.util.Date date) {
        return isToday(date.getTime());
    }

    public static boolean isToday(long j) {
        long weeOfToday = getWeeOfToday();
        return j >= weeOfToday && j < weeOfToday + 86400000;
    }

    public static boolean isLeapYear(java.lang.String str) {
        return isLeapYear(string2Date(str, getDefaultFormat()));
    }

    public static boolean isLeapYear(java.lang.String str, java.text.DateFormat dateFormat) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return isLeapYear(string2Date(str, dateFormat));
    }

    public static boolean isLeapYear(java.util.Date date) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        return isLeapYear(calendar.get(1));
    }

    public static boolean isLeapYear(long j) {
        return isLeapYear(millis2Date(j));
    }

    public static boolean isLeapYear(int i) {
        return (i % 4 == 0 && i % 100 != 0) || i % com.autonavi.base.ae.gmap.glyph.FontStyle.WEIGHT_NORMAL == 0;
    }

    public static java.lang.String getChineseWeek(java.lang.String str) {
        return getChineseWeek(string2Date(str, getDefaultFormat()));
    }

    public static java.lang.String getChineseWeek(java.lang.String str, java.text.DateFormat dateFormat) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getChineseWeek(string2Date(str, dateFormat));
    }

    public static java.lang.String getChineseWeek(java.util.Date date) {
        return new java.text.SimpleDateFormat(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, java.util.Locale.CHINA).format(date);
    }

    public static java.lang.String getChineseWeek(long j) {
        return getChineseWeek(new java.util.Date(j));
    }

    public static java.lang.String getUSWeek(java.lang.String str) {
        return getUSWeek(string2Date(str, getDefaultFormat()));
    }

    public static java.lang.String getUSWeek(java.lang.String str, java.text.DateFormat dateFormat) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getUSWeek(string2Date(str, dateFormat));
    }

    public static java.lang.String getUSWeek(java.util.Date date) {
        return new java.text.SimpleDateFormat("EEEE", java.util.Locale.US).format(date);
    }

    public static java.lang.String getUSWeek(long j) {
        return getUSWeek(new java.util.Date(j));
    }

    public static boolean isAm() {
        return java.util.Calendar.getInstance().get(9) == 0;
    }

    public static boolean isAm(java.lang.String str) {
        return getValueByCalendarField(str, getDefaultFormat(), 9) == 0;
    }

    public static boolean isAm(java.lang.String str, java.text.DateFormat dateFormat) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getValueByCalendarField(str, dateFormat, 9) == 0;
    }

    public static boolean isAm(java.util.Date date) {
        return getValueByCalendarField(date, 9) == 0;
    }

    public static boolean isAm(long j) {
        return getValueByCalendarField(j, 9) == 0;
    }

    public static boolean isPm() {
        return !isAm();
    }

    public static boolean isPm(java.lang.String str) {
        return !isAm(str);
    }

    public static boolean isPm(java.lang.String str, java.text.DateFormat dateFormat) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return !isAm(str, dateFormat);
    }

    public static boolean isPm(java.util.Date date) {
        return !isAm(date);
    }

    public static boolean isPm(long j) {
        return !isAm(j);
    }

    public static int getValueByCalendarField(int i) {
        return java.util.Calendar.getInstance().get(i);
    }

    public static int getValueByCalendarField(java.lang.String str, int i) {
        return getValueByCalendarField(string2Date(str, getDefaultFormat()), i);
    }

    public static int getValueByCalendarField(java.lang.String str, java.text.DateFormat dateFormat, int i) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getValueByCalendarField(string2Date(str, dateFormat), i);
    }

    public static int getValueByCalendarField(java.util.Date date, int i) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(i);
    }

    public static int getValueByCalendarField(long j, int i) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar.get(i);
    }

    public static java.lang.String getChineseZodiac(java.lang.String str) {
        return getChineseZodiac(string2Date(str, getDefaultFormat()));
    }

    public static java.lang.String getChineseZodiac(java.lang.String str, java.text.DateFormat dateFormat) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getChineseZodiac(string2Date(str, dateFormat));
    }

    public static java.lang.String getChineseZodiac(java.util.Date date) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        return CHINESE_ZODIAC[calendar.get(1) % 12];
    }

    public static java.lang.String getChineseZodiac(long j) {
        return getChineseZodiac(millis2Date(j));
    }

    public static java.lang.String getChineseZodiac(int i) {
        return CHINESE_ZODIAC[i % 12];
    }

    public static java.lang.String getZodiac(java.lang.String str) {
        return getZodiac(string2Date(str, getDefaultFormat()));
    }

    public static java.lang.String getZodiac(java.lang.String str, java.text.DateFormat dateFormat) {
        java.util.Objects.requireNonNull(dateFormat, "Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getZodiac(string2Date(str, dateFormat));
    }

    public static java.lang.String getZodiac(java.util.Date date) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        return getZodiac(calendar.get(2) + 1, calendar.get(5));
    }

    public static java.lang.String getZodiac(long j) {
        return getZodiac(millis2Date(j));
    }

    public static java.lang.String getZodiac(int i, int i2) {
        java.lang.String[] strArr = ZODIAC;
        int i3 = i - 1;
        if (i2 < ZODIAC_FLAGS[i3]) {
            i3 = (i + 10) % 12;
        }
        return strArr[i3];
    }

    private static long millis2TimeSpan(long j, int i) {
        return j / i;
    }

    static java.lang.String millis2FitTimeSpan(long j, int i) {
        if (i <= 0) {
            return null;
        }
        int min = java.lang.Math.min(i, 5);
        java.lang.String[] strArr = {"天", "小时", "分钟", "秒", "毫秒"};
        if (j == 0) {
            return 0 + strArr[min - 1];
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (j < 0) {
            sb.append("-");
            j = -j;
        }
        int[] iArr = {com.blankj.utilcode.constant.TimeConstants.DAY, com.blankj.utilcode.constant.TimeConstants.HOUR, com.blankj.utilcode.constant.TimeConstants.MIN, 1000, 1};
        for (int i2 = 0; i2 < min; i2++) {
            if (j >= iArr[i2]) {
                long j2 = j / iArr[i2];
                j -= iArr[i2] * j2;
                sb.append(j2);
                sb.append(strArr[i2]);
            }
        }
        return sb.toString();
    }
}
