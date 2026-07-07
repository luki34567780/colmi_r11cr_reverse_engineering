package com.oudmon.ble.base.util;

/* loaded from: /tmp/dex/classes2.dex */
public class DateUtil {
    public static long Hour_S_Min = 3600;
    public static final java.lang.String dFyyyyMMdd1 = "yyyy-MM-dd";
    public static final java.lang.String yyyyMMdd_HHmm = "yyyy-MM-dd HH:mm";
    public static final java.lang.String yyyyMMdd_HHmmss = "yyyy-MM-dd HH:mm:ss";
    private java.util.Calendar c;
    public static final java.util.Locale localeObject = new java.util.Locale("en");
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> dFMMdd = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: com.oudmon.ble.base.util.DateUtil.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("MM-dd", com.oudmon.ble.base.util.DateUtil.localeObject);
        }
    };
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> dFMMdd_HHmm = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: com.oudmon.ble.base.util.DateUtil.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("MM-dd HH:mm", com.oudmon.ble.base.util.DateUtil.localeObject);
        }
    };
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> dFyyyyMM = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: com.oudmon.ble.base.util.DateUtil.3
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("yyyy-MM", com.oudmon.ble.base.util.DateUtil.localeObject);
        }
    };
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> dFyyyyMMdd = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: com.oudmon.ble.base.util.DateUtil.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("yyyy-MM-dd", com.oudmon.ble.base.util.DateUtil.localeObject);
        }
    };
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> dFyyyyMMdd_HHmm = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: com.oudmon.ble.base.util.DateUtil.5
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", com.oudmon.ble.base.util.DateUtil.localeObject);
        }
    };
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> dFyyyyMMdd_HHmmss = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: com.oudmon.ble.base.util.DateUtil.6
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", com.oudmon.ble.base.util.DateUtil.localeObject);
        }
    };
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> dFHHmm = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: com.oudmon.ble.base.util.DateUtil.7
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("HH:mm", com.oudmon.ble.base.util.DateUtil.localeObject);
        }
    };
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> dFHHmmss = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: com.oudmon.ble.base.util.DateUtil.8
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("HH:mm:ss", com.oudmon.ble.base.util.DateUtil.localeObject);
        }
    };
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> dFSyyyyMMdd = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: com.oudmon.ble.base.util.DateUtil.9
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("yyyyMMdd", com.oudmon.ble.base.util.DateUtil.localeObject);
        }
    };
    public static java.text.SimpleDateFormat yyyyMMdd_HHmmssF = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static java.text.SimpleDateFormat dFyyyyMMddF = new java.text.SimpleDateFormat("yyyy-MM-dd");
    public static java.text.SimpleDateFormat dFyyyyMMddmmF = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm");

    public enum DateFormater {
        MMdd,
        MMdd_HHmm,
        yyyyMM,
        yyyyMMdd,
        yyyyMMdd_HHmm,
        yyyyMMdd_HHmmss,
        HHmm,
        HHmmss,
        yyyyMMddHHmm,
        SyyyyMMdd,
        dFyyyyMMdd,
        dFHHmm
    }

    public long getZeroTime() {
        return new com.oudmon.ble.base.util.DateUtil(getYear(), getMonth(), getDay()).getUnixTimestamp();
    }

    public java.lang.String getZeroTimeYyyyMMdd_HHmmssDate() {
        return new com.oudmon.ble.base.util.DateUtil(getYear(), getMonth(), getDay()).getYyyyMMdd_HHmmssDate();
    }

    public long getZeroTime1() {
        return new com.oudmon.ble.base.util.DateUtil(getYear(), getMonth(), getDay()).getTimestamp();
    }

    public static long getFirstDayMonth(java.util.Date date) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, 0);
        calendar.set(5, 1);
        return calendar.getTimeInMillis();
    }

    public static long getLastDayMonth(java.util.Date date) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, 0);
        calendar.set(5, calendar.getActualMaximum(5));
        return calendar.getTimeInMillis();
    }

    public static int getDaysOfMonth(java.util.Date date) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getActualMaximum(5);
    }

    public int getTodayMin() {
        return java.lang.Math.round((this.c.getTimeInMillis() - getZeroTime1()) / 60000) + 1;
    }

    public int getTodayMinNoPlus() {
        return java.lang.Math.round((this.c.getTimeInMillis() - getZeroTime1()) / 60000);
    }

    public static boolean isSameDay(java.util.Date date, java.util.Date date2) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTime(date2);
        return ((calendar.get(1) == calendar2.get(1)) && calendar.get(2) == calendar2.get(2)) && calendar.get(5) == calendar2.get(5);
    }

    public boolean isSameDay(long j, boolean z) {
        com.oudmon.ble.base.util.DateUtil dateUtil = new com.oudmon.ble.base.util.DateUtil(j, z);
        return dateUtil.getYear() == getYear() && dateUtil.getMonth() == getMonth() && dateUtil.getDay() == getDay();
    }

    public static boolean isSameMonth(java.util.Date date, java.util.Date date2) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTime(date2);
        return (calendar.get(1) == calendar2.get(1)) && calendar.get(2) == calendar2.get(2);
    }

    public static long getPreOrNextTimeByDay(long j) {
        return java.lang.System.currentTimeMillis() - (j * 86400000);
    }

    public static long getGMTDate(long j) {
        try {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd-HH-mm");
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
            java.lang.String format = simpleDateFormat.format(new java.util.Date(1000 * j));
            return new com.oudmon.ble.base.util.DateUtil(java.lang.Integer.parseInt(format.substring(0, 4)), java.lang.Integer.parseInt(format.substring(5, 7)), java.lang.Integer.parseInt(format.substring(8, 10)), java.lang.Integer.parseInt(format.substring(11, 13)), java.lang.Integer.parseInt(format.substring(14, 16)), 0).getUnixTimestamp();
        } catch (java.lang.NumberFormatException e) {
            e.printStackTrace();
            com.oudmon.ble.base.util.DateUtil dateUtil = new com.oudmon.ble.base.util.DateUtil(j, true);
            dateUtil.setHour(0);
            dateUtil.setMinute(0);
            dateUtil.setSecond(0);
            return dateUtil.getUnixTimestamp();
        }
    }

    public static com.oudmon.ble.base.util.DateUtil valueOf(java.lang.String str) {
        java.util.regex.Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}");
        try {
            if (java.util.regex.Pattern.compile("[0-9]{2}-[0-9]{2}").matcher(str).matches()) {
                return parse(str, com.oudmon.ble.base.util.DateUtil.DateFormater.MMdd);
            }
            if (java.util.regex.Pattern.compile("[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}").matcher(str).matches()) {
                return parse(str, com.oudmon.ble.base.util.DateUtil.DateFormater.MMdd_HHmm);
            }
            if (java.util.regex.Pattern.compile("[0-9]{4}-[0-9]{2}").matcher(str).matches()) {
                return parse(str, com.oudmon.ble.base.util.DateUtil.DateFormater.yyyyMM);
            }
            if (java.util.regex.Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{2}").matcher(str).matches()) {
                return parse(str, com.oudmon.ble.base.util.DateUtil.DateFormater.yyyyMMdd);
            }
            if (java.util.regex.Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}").matcher(str).matches()) {
                return parse(str, com.oudmon.ble.base.util.DateUtil.DateFormater.yyyyMMdd_HHmm);
            }
            if (java.util.regex.Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}").matcher(str).matches()) {
                return parse(str, com.oudmon.ble.base.util.DateUtil.DateFormater.yyyyMMdd_HHmmss);
            }
            if (java.util.regex.Pattern.compile("[0-9]{2}:[0-9]{2}").matcher(str).matches()) {
                return parse(str, com.oudmon.ble.base.util.DateUtil.DateFormater.HHmm);
            }
            if (java.util.regex.Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}").matcher(str).matches()) {
                return parse(str, com.oudmon.ble.base.util.DateUtil.DateFormater.HHmmss);
            }
            return null;
        } catch (java.text.ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: com.oudmon.ble.base.util.DateUtil$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] $SwitchMap$com$oudmon$ble$base$util$DateUtil$DateFormater;

        static {
            int[] iArr = new int[com.oudmon.ble.base.util.DateUtil.DateFormater.values().length];
            $SwitchMap$com$oudmon$ble$base$util$DateUtil$DateFormater = iArr;
            try {
                iArr[com.oudmon.ble.base.util.DateUtil.DateFormater.MMdd.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$oudmon$ble$base$util$DateUtil$DateFormater[com.oudmon.ble.base.util.DateUtil.DateFormater.MMdd_HHmm.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$oudmon$ble$base$util$DateUtil$DateFormater[com.oudmon.ble.base.util.DateUtil.DateFormater.yyyyMM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$oudmon$ble$base$util$DateUtil$DateFormater[com.oudmon.ble.base.util.DateUtil.DateFormater.yyyyMMdd.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$oudmon$ble$base$util$DateUtil$DateFormater[com.oudmon.ble.base.util.DateUtil.DateFormater.dFyyyyMMdd.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$oudmon$ble$base$util$DateUtil$DateFormater[com.oudmon.ble.base.util.DateUtil.DateFormater.yyyyMMdd_HHmm.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$oudmon$ble$base$util$DateUtil$DateFormater[com.oudmon.ble.base.util.DateUtil.DateFormater.yyyyMMdd_HHmmss.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$oudmon$ble$base$util$DateUtil$DateFormater[com.oudmon.ble.base.util.DateUtil.DateFormater.HHmm.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$oudmon$ble$base$util$DateUtil$DateFormater[com.oudmon.ble.base.util.DateUtil.DateFormater.HHmmss.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$oudmon$ble$base$util$DateUtil$DateFormater[com.oudmon.ble.base.util.DateUtil.DateFormater.SyyyyMMdd.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
        }
    }

    public static com.oudmon.ble.base.util.DateUtil parse(java.lang.String str, com.oudmon.ble.base.util.DateUtil.DateFormater dateFormater) throws java.text.ParseException {
        java.util.Date parse;
        switch (com.oudmon.ble.base.util.DateUtil.AnonymousClass10.$SwitchMap$com$oudmon$ble$base$util$DateUtil$DateFormater[dateFormater.ordinal()]) {
            case 1:
                parse = dFMMdd.get().parse(str);
                break;
            case 2:
                parse = dFMMdd_HHmm.get().parse(str);
                break;
            case 3:
                parse = dFyyyyMM.get().parse(str);
                break;
            case 4:
                parse = dFSyyyyMMdd.get().parse(str);
                break;
            case 5:
                parse = dFyyyyMMdd.get().parse(str);
                break;
            case 6:
                parse = dFyyyyMMdd_HHmm.get().parse(str);
                break;
            case 7:
                parse = dFyyyyMMdd_HHmmss.get().parse(str);
                break;
            case 8:
                parse = dFHHmm.get().parse(str);
                break;
            case 9:
                parse = dFHHmmss.get().parse(str);
                break;
            default:
                parse = null;
                break;
        }
        return new com.oudmon.ble.base.util.DateUtil(parse);
    }

    public DateUtil() {
        this.c = java.util.Calendar.getInstance();
    }

    public DateUtil(long j, boolean z) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.c = calendar;
        if (z) {
            calendar.setTimeInMillis(j * 1000);
        } else {
            calendar.setTimeInMillis(j);
        }
    }

    public DateUtil(java.util.Date date) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.c = calendar;
        calendar.setTime(date);
    }

    public DateUtil(int i, int i2, int i3) {
        this(i, i2, i3, 0, 0, 0);
    }

    public DateUtil(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, 0);
    }

    public DateUtil(int i, int i2, int i3, int i4, int i5, int i6) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.c = calendar;
        calendar.set(1, i);
        this.c.set(2, i2 - 1);
        this.c.set(5, i3);
        this.c.set(11, i4);
        this.c.set(12, i5);
        this.c.set(13, i6);
    }

    public DateUtil(int i, int i2) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.c = calendar;
        calendar.set(11, i);
        this.c.set(12, i2);
    }

    public boolean isToday() {
        com.oudmon.ble.base.util.DateUtil dateUtil = new com.oudmon.ble.base.util.DateUtil();
        return getYear() == dateUtil.getYear() && getMonth() == dateUtil.getMonth() && getDay() == dateUtil.getDay();
    }

    public boolean isSameWeek(int i) {
        return i == new com.oudmon.ble.base.util.DateUtil(new java.util.Date()).getWeekOfYear();
    }

    public boolean isSameMonth(int i, int i2) {
        return i == getMonth() && getYear() == i2;
    }

    public int daysBetweenMe(com.oudmon.ble.base.util.DateUtil dateUtil) {
        return (int) (java.lang.Math.abs(getUnixTimestamp() - dateUtil.getUnixTimestamp()) / 86400);
    }

    public java.util.Date toDate() {
        return this.c.getTime();
    }

    public java.lang.String toFormatString(com.oudmon.ble.base.util.DateUtil.DateFormater dateFormater) {
        java.util.Date date = toDate();
        switch (com.oudmon.ble.base.util.DateUtil.AnonymousClass10.$SwitchMap$com$oudmon$ble$base$util$DateUtil$DateFormater[dateFormater.ordinal()]) {
            case 1:
                return dFMMdd.get().format(date);
            case 2:
                return dFMMdd_HHmm.get().format(date);
            case 3:
                return dFyyyyMM.get().format(date);
            case 4:
                return dFyyyyMMdd.get().format(date);
            case 5:
                return dFyyyyMMdd.get().format(date);
            case 6:
                return dFyyyyMMdd_HHmm.get().format(date);
            case 7:
                return dFyyyyMMdd_HHmmss.get().format(date);
            case 8:
                return dFHHmm.get().format(date);
            case 9:
                return dFHHmmss.get().format(date);
            case 10:
                return dFSyyyyMMdd.get().format(date);
            default:
                return "Unknown";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r0 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r0 == 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return com.oudmon.ble.base.util.DateUtil.dFyyyyMMddF.parse(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return com.oudmon.ble.base.util.DateUtil.dFyyyyMMddmmF.parse(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date String2Date(java.lang.String r6, java.lang.String r7) {
        /*
            r0 = -1
            r1 = 0
            int r2 = r6.hashCode()     // Catch: java.lang.Exception -> L51
            r3 = -1172057030(0xffffffffba23d43a, float:-6.249581E-4)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L2c
            r3 = -159776256(0xfffffffff67a0200, float:-1.2676902E33)
            if (r2 == r3) goto L22
            r3 = 1333195168(0x4f76f1a0, float:4.1430303E9)
            if (r2 == r3) goto L18
            goto L35
        L18:
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Exception -> L51
            if (r6 == 0) goto L35
            r0 = 0
            goto L35
        L22:
            java.lang.String r2 = "yyyy-MM-dd"
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Exception -> L51
            if (r6 == 0) goto L35
            r0 = 2
            goto L35
        L2c:
            java.lang.String r2 = "yyyy-MM-dd HH:mm"
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Exception -> L51
            if (r6 == 0) goto L35
            r0 = 1
        L35:
            if (r0 == 0) goto L4a
            if (r0 == r5) goto L43
            if (r0 == r4) goto L3c
            goto L55
        L3c:
            java.text.SimpleDateFormat r6 = com.oudmon.ble.base.util.DateUtil.dFyyyyMMddF     // Catch: java.lang.Exception -> L51
            java.util.Date r1 = r6.parse(r7)     // Catch: java.lang.Exception -> L51
            goto L55
        L43:
            java.text.SimpleDateFormat r6 = com.oudmon.ble.base.util.DateUtil.dFyyyyMMddmmF     // Catch: java.lang.Exception -> L51
            java.util.Date r1 = r6.parse(r7)     // Catch: java.lang.Exception -> L51
            goto L55
        L4a:
            java.text.SimpleDateFormat r6 = com.oudmon.ble.base.util.DateUtil.yyyyMMdd_HHmmssF     // Catch: java.lang.Exception -> L51
            java.util.Date r1 = r6.parse(r7)     // Catch: java.lang.Exception -> L51
            goto L55
        L51:
            r6 = move-exception
            r6.printStackTrace()
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oudmon.ble.base.util.DateUtil.String2Date(java.lang.String, java.lang.String):java.util.Date");
    }

    public java.lang.String getMMddDate() {
        return toFormatString(com.oudmon.ble.base.util.DateUtil.DateFormater.MMdd);
    }

    public java.lang.String getMMdd_HHmmDate() {
        return toFormatString(com.oudmon.ble.base.util.DateUtil.DateFormater.MMdd_HHmm);
    }

    public java.lang.String getY_M_D() {
        return toFormatString(com.oudmon.ble.base.util.DateUtil.DateFormater.dFyyyyMMdd);
    }

    public java.lang.String getY_M_D_H_M_S() {
        return toFormatString(com.oudmon.ble.base.util.DateUtil.DateFormater.yyyyMMdd_HHmmss);
    }

    public java.lang.String getY_M_D_H_M() {
        return toFormatString(com.oudmon.ble.base.util.DateUtil.DateFormater.yyyyMMdd_HHmm);
    }

    public java.lang.String getYyyyMMDate() {
        return toFormatString(com.oudmon.ble.base.util.DateUtil.DateFormater.yyyyMM);
    }

    public java.lang.String getYyyyMMddDate() {
        return toFormatString(com.oudmon.ble.base.util.DateUtil.DateFormater.yyyyMMdd);
    }

    public java.lang.String getYyyyMMdd_HHmmDate() {
        return toFormatString(com.oudmon.ble.base.util.DateUtil.DateFormater.yyyyMMdd_HHmm);
    }

    public java.lang.String getYyyyMMdd_HHmmssDate() {
        return toFormatString(com.oudmon.ble.base.util.DateUtil.DateFormater.yyyyMMdd_HHmmss);
    }

    public java.lang.String getHHmmDate() {
        return toFormatString(com.oudmon.ble.base.util.DateUtil.DateFormater.HHmm);
    }

    public java.lang.String getHHmmssDate() {
        return toFormatString(com.oudmon.ble.base.util.DateUtil.DateFormater.HHmmss);
    }

    public java.lang.String getSyyyyMMddDate() {
        return toFormatString(com.oudmon.ble.base.util.DateUtil.DateFormater.SyyyyMMdd);
    }

    public java.lang.String getyyyyMMddDate() {
        return toFormatString(com.oudmon.ble.base.util.DateUtil.DateFormater.yyyyMMdd);
    }

    public int getYear() {
        return this.c.get(1);
    }

    public void setYear(int i) {
        this.c.set(1, i);
    }

    public int getMonth() {
        return this.c.get(2) + 1;
    }

    public void setMonth(int i) {
        this.c.set(2, i - 1);
    }

    public int getDay() {
        return this.c.get(5);
    }

    public int getDaysOfThisMonth() {
        return this.c.get(5);
    }

    public void setDay(int i) {
        this.c.set(5, i);
    }

    public void addDay(int i) {
        this.c.add(5, i);
    }

    public void addMonth(int i) {
        this.c.add(2, i);
    }

    public int getHour() {
        return this.c.get(11);
    }

    public void setHour(int i) {
        this.c.set(11, i);
    }

    public int getMinute() {
        return this.c.get(12);
    }

    public void setMinute(int i) {
        this.c.set(12, i);
    }

    public int getSecond() {
        return this.c.get(13);
    }

    public void setSecond(int i) {
        this.c.set(13, i);
    }

    public long getTimestamp() {
        return this.c.getTimeInMillis();
    }

    public void setTimestamp(long j) {
        this.c.setTimeInMillis(j);
    }

    public long getUnixTimestamp() {
        return this.c.getTimeInMillis() / 1000;
    }

    public void setUnixTimestamp(long j) {
        this.c.setTimeInMillis(j * 1000);
    }

    public int getDayOfWeek() {
        return this.c.get(7);
    }

    public int getWeekOfYear() {
        return this.c.get(3);
    }

    public int getWeekOfMonth() {
        return this.c.get(4);
    }

    public java.lang.String getMonDate() {
        int dayOfWeek = getDayOfWeek();
        java.util.Calendar calendar = this.c;
        calendar.add(5, calendar.getFirstDayOfWeek() - dayOfWeek);
        return new java.text.SimpleDateFormat("yyyyMMdd").format(this.c.getTime());
    }

    public java.lang.String toString() {
        return getYyyyMMdd_HHmmssDate();
    }

    public static java.lang.String getTime(long j) {
        long currentTimeMillis = (java.lang.System.currentTimeMillis() - j) / 86400000;
        com.oudmon.ble.base.util.DateUtil dateUtil = new com.oudmon.ble.base.util.DateUtil(j, false);
        if (currentTimeMillis > 0) {
            return dateUtil.getYyyyMMddDate();
        }
        return dateUtil.getHHmmDate();
    }

    public static long getSunDayTimeFromWeek() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
        return calendar.getTime().getTime() - ((calendar.get(7) - 1) * 86400000);
    }

    public static java.util.Date getDateByWeekMagin(int i) {
        return new java.util.Date(getSunDayTimeFromWeek() + (i * 86400000));
    }

    public static int differentDaysByMillisecond(java.util.Date date, java.util.Date date2) {
        return (int) ((date2.getTime() - date.getTime()) / 86400000);
    }

    public static long dateStr2Stamp(java.lang.String str) {
        try {
            return java.lang.Long.parseLong(java.lang.String.valueOf(new java.text.SimpleDateFormat("yyyyMMdd").parse(str).getTime()));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public static long dateY_M_D2Stamp(java.lang.String str) {
        try {
            return java.lang.Long.parseLong(java.lang.String.valueOf(new java.text.SimpleDateFormat("yyyy-MM-dd").parse(str).getTime()));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public static java.lang.String getMarginMin(long j, long j2) {
        return ((j - j2) / 60) + "";
    }

    public static int getAgeByBirthday(java.util.Date date) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        if (calendar.before(date)) {
            throw new java.lang.IllegalArgumentException("The birthDay is before Now.It's unbelievable!");
        }
        int i = calendar.get(1);
        int i2 = calendar.get(2) + 1;
        int i3 = calendar.get(5);
        calendar.setTime(date);
        int i4 = calendar.get(1);
        int i5 = calendar.get(2) + 1;
        int i6 = i - i4;
        return i2 <= i5 ? (i2 != i5 || i3 < calendar.get(5)) ? i6 - 1 : i6 : i6;
    }
}
