package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public final class LunarCalendar {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static java.lang.String[] DAY_STR;
    private static java.lang.String[] MONTH_STR;
    private static java.lang.String[] SPECIAL_FESTIVAL_STR;
    private static java.lang.String[] TRADITION_FESTIVAL_STR;
    private static final java.util.Map<java.lang.Integer, java.lang.String[]> SPECIAL_FESTIVAL = new java.util.HashMap();
    private static java.lang.String[] SOLAR_CALENDAR = null;
    private static final java.util.Map<java.lang.Integer, java.lang.String[]> SOLAR_TERMS = new java.util.HashMap();
    private static final int[] LUNAR_INFO = {19416, 19168, 42352, 21717, 53856, 55632, 91476, 22176, 39632, 21970, 19168, 42422, 42192, 53840, 119381, 46400, 54944, 44450, 38320, 84343, 18800, 42160, 46261, 27216, 27968, 109396, 11104, 38256, 21234, 18800, 25958, 54432, 59984, 28309, 23248, 11104, 100067, 37600, 116951, 51536, 54432, 120998, 46416, 22176, 107956, 9680, 37584, 53938, 43344, 46423, 27808, 46416, 86869, 19872, 42416, 83315, 21168, 43432, 59728, 27296, 44710, 43856, 19296, 43748, 42352, 21088, 62051, 55632, 23383, 22176, 38608, 19925, 19152, 42192, 54484, 53840, 54616, 46400, 46752, 103846, 38320, 18864, 43380, 42160, 45690, 27216, 27968, 44870, 43872, 38256, 19189, 18800, 25776, 29859, 59984, 27480, 21952, 43872, 38613, 37600, 51552, 55636, 54432, 55888, 30034, 22176, 43959, 9680, 37584, 51893, 43344, 46240, 47780, 44368, 21977, 19360, 42416, 86390, 21168, 43312, 31060, 27296, 44368, 23378, 19296, 42726, 42208, 53856, 60005, 54576, 23200, 30371, 38608, 19195, 19152, 42192, 118966, 53840, 54560, 56645, 46496, 22224, 21938, 18864, 42359, 42160, 43600, 111189, 27936, 44448, 84835, 37744, 18936, 18800, 25776, 92326, 59984, 27424, 108228, 43744, 41696, 53987, 51552, 54615, 54432, 55888, 23893, 22176, 42704, 21972, 21200, 43448, 43344, 46240, 46758, 44368, 21920, 43940, 42416, 21168, 45683, 26928, 29495, 27296, 44368, 84821, 19296, 42352, 21732, 53600, 59752, 54560, 55968, 92838, 22224, 19168, 43476, 41680, 53584, 62034, 54560};

    static void init(android.content.Context context) {
        if (MONTH_STR != null) {
            return;
        }
        com.haibin.calendarview.TrunkBranchAnnals.init(context);
        com.haibin.calendarview.SolarTermUtil.init(context);
        MONTH_STR = context.getResources().getStringArray(com.haibin.calendarview.R.array.lunar_first_of_month);
        TRADITION_FESTIVAL_STR = context.getResources().getStringArray(com.haibin.calendarview.R.array.tradition_festival);
        DAY_STR = context.getResources().getStringArray(com.haibin.calendarview.R.array.lunar_str);
        SPECIAL_FESTIVAL_STR = context.getResources().getStringArray(com.haibin.calendarview.R.array.special_festivals);
        SOLAR_CALENDAR = context.getResources().getStringArray(com.haibin.calendarview.R.array.solar_festival);
    }

    private static java.lang.String getTraditionFestival(int i, int i2, int i3) {
        if (i2 == 12 && i3 == daysInLunarMonth(i, i2)) {
            return TRADITION_FESTIVAL_STR[0];
        }
        java.lang.String string = getString(i2, i3);
        for (java.lang.String str : TRADITION_FESTIVAL_STR) {
            if (str.contains(string)) {
                return str.replace(string, "");
            }
        }
        return "";
    }

    private static java.lang.String numToChineseMonth(int i, int i2) {
        if (i2 == 1) {
            return "闰" + MONTH_STR[i - 1];
        }
        return MONTH_STR[i - 1];
    }

    private static java.lang.String numToChinese(int i, int i2, int i3) {
        if (i2 == 1) {
            return numToChineseMonth(i, i3);
        }
        return DAY_STR[i2 - 1];
    }

    public static int daysInLunarMonth(int i, int i2) {
        return (LUNAR_INFO[i + (-1900)] & (com.liulishuo.okdownload.DownloadTask.Builder.DEFAULT_SYNC_BUFFER_SIZE >> i2)) == 0 ? 29 : 30;
    }

    private static java.lang.String gregorianFestival(int i, int i2) {
        java.lang.String string = getString(i, i2);
        for (java.lang.String str : SOLAR_CALENDAR) {
            if (str.contains(string)) {
                return str.replace(string, "");
            }
        }
        return "";
    }

    private static java.lang.String getString(int i, int i2) {
        java.lang.String str;
        java.lang.Object obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (i >= 10) {
            str = java.lang.String.valueOf(i);
        } else {
            str = "0" + i;
        }
        sb.append(str);
        if (i2 >= 10) {
            obj = java.lang.Integer.valueOf(i2);
        } else {
            obj = "0" + i2;
        }
        sb.append(obj);
        return sb.toString();
    }

    private static java.lang.String getSolarTerm(int i, int i2, int i3) {
        java.util.Map<java.lang.Integer, java.lang.String[]> map = SOLAR_TERMS;
        if (!map.containsKey(java.lang.Integer.valueOf(i))) {
            map.put(java.lang.Integer.valueOf(i), com.haibin.calendarview.SolarTermUtil.getSolarTerms(i));
        }
        java.lang.String[] strArr = map.get(java.lang.Integer.valueOf(i));
        java.lang.String str = i + getString(i2, i3);
        for (java.lang.String str2 : strArr) {
            if (str2.contains(str)) {
                return str2.replace(str, "");
            }
        }
        return "";
    }

    public static java.lang.String getLunarText(int i, int i2, int i3) {
        java.lang.String solarTerm = getSolarTerm(i, i2, i3);
        java.lang.String gregorianFestival = gregorianFestival(i2, i3);
        if (!android.text.TextUtils.isEmpty(gregorianFestival)) {
            return gregorianFestival;
        }
        if (!android.text.TextUtils.isEmpty(solarTerm)) {
            return solarTerm;
        }
        int[] solarToLunar = com.haibin.calendarview.LunarUtil.solarToLunar(i, i2, i3);
        java.lang.String traditionFestival = getTraditionFestival(solarToLunar[0], solarToLunar[1], solarToLunar[2]);
        return !android.text.TextUtils.isEmpty(traditionFestival) ? traditionFestival : numToChinese(solarToLunar[1], solarToLunar[2], solarToLunar[3]);
    }

    private static java.lang.String getSpecialFestival(int i, int i2, int i3) {
        java.util.Map<java.lang.Integer, java.lang.String[]> map = SPECIAL_FESTIVAL;
        if (!map.containsKey(java.lang.Integer.valueOf(i))) {
            map.put(java.lang.Integer.valueOf(i), getSpecialFestivals(i));
        }
        java.lang.String[] strArr = map.get(java.lang.Integer.valueOf(i));
        java.lang.String str = i + getString(i2, i3);
        for (java.lang.String str2 : strArr) {
            if (str2.contains(str)) {
                return str2.replace(str, "");
            }
        }
        return "";
    }

    private static java.lang.String[] getSpecialFestivals(int i) {
        java.lang.String[] strArr = new java.lang.String[3];
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i, 4, 1);
        int i2 = (7 - calendar.get(7)) + 1;
        if (i2 == 7) {
            strArr[0] = dateToString(i, 5, i2 + 1) + SPECIAL_FESTIVAL_STR[0];
        } else {
            strArr[0] = dateToString(i, 5, i2 + 7 + 1) + SPECIAL_FESTIVAL_STR[0];
        }
        calendar.set(i, 5, 1);
        int i3 = (7 - calendar.get(7)) + 1;
        if (i3 == 7) {
            strArr[1] = dateToString(i, 6, i3 + 7 + 1) + SPECIAL_FESTIVAL_STR[1];
        } else {
            strArr[1] = dateToString(i, 6, i3 + 7 + 7 + 1) + SPECIAL_FESTIVAL_STR[1];
        }
        calendar.set(i, 10, 1);
        int i4 = (7 - calendar.get(7)) + 1;
        if (i4 <= 2) {
            strArr[2] = dateToString(i, 11, i4 + 21 + 5) + SPECIAL_FESTIVAL_STR[2];
        } else {
            strArr[2] = dateToString(i, 11, i4 + 14 + 5) + SPECIAL_FESTIVAL_STR[2];
        }
        return strArr;
    }

    private static java.lang.String dateToString(int i, int i2, int i3) {
        return i + getString(i2, i3);
    }

    public static void setupLunarCalendar(com.haibin.calendarview.Calendar calendar) {
        int year = calendar.getYear();
        int month = calendar.getMonth();
        int day = calendar.getDay();
        calendar.setWeekend(com.haibin.calendarview.CalendarUtil.isWeekend(calendar));
        calendar.setWeek(com.haibin.calendarview.CalendarUtil.getWeekFormCalendar(calendar));
        com.haibin.calendarview.Calendar calendar2 = new com.haibin.calendarview.Calendar();
        calendar.setLunarCalendar(calendar2);
        int[] solarToLunar = com.haibin.calendarview.LunarUtil.solarToLunar(year, month, day);
        calendar2.setYear(solarToLunar[0]);
        calendar2.setMonth(solarToLunar[1]);
        calendar2.setDay(solarToLunar[2]);
        calendar.setLeapYear(com.haibin.calendarview.CalendarUtil.isLeapYear(year));
        if (solarToLunar[3] == 1) {
            calendar.setLeapMonth(solarToLunar[1]);
            calendar2.setLeapMonth(solarToLunar[1]);
        }
        java.lang.String solarTerm = getSolarTerm(year, month, day);
        java.lang.String gregorianFestival = gregorianFestival(month, day);
        java.lang.String traditionFestival = getTraditionFestival(solarToLunar[0], solarToLunar[1], solarToLunar[2]);
        java.lang.String numToChinese = numToChinese(solarToLunar[1], solarToLunar[2], solarToLunar[3]);
        if (android.text.TextUtils.isEmpty(gregorianFestival)) {
            gregorianFestival = getSpecialFestival(year, month, day);
        }
        calendar.setSolarTerm(solarTerm);
        calendar.setGregorianFestival(gregorianFestival);
        calendar.setTraditionFestival(traditionFestival);
        calendar2.setTraditionFestival(traditionFestival);
        calendar2.setSolarTerm(solarTerm);
        if (!android.text.TextUtils.isEmpty(solarTerm)) {
            calendar.setLunar(solarTerm);
        } else if (!android.text.TextUtils.isEmpty(gregorianFestival)) {
            calendar.setLunar(gregorianFestival);
        } else if (!android.text.TextUtils.isEmpty(traditionFestival)) {
            calendar.setLunar(traditionFestival);
        } else {
            calendar.setLunar(numToChinese);
        }
        calendar2.setLunar(numToChinese);
    }

    public static java.lang.String getLunarText(com.haibin.calendarview.Calendar calendar) {
        return getLunarText(calendar.getYear(), calendar.getMonth(), calendar.getDay());
    }
}
