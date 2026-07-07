package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public final class Calendar implements java.io.Serializable, java.lang.Comparable<com.haibin.calendarview.Calendar> {
    private static final long serialVersionUID = 141315161718191143L;
    private int day;
    private java.lang.String gregorianFestival;
    private boolean isCurrentDay;
    private boolean isCurrentMonth;
    private boolean isLeapYear;
    private boolean isWeekend;
    private int leapMonth;
    private java.lang.String lunar;
    private com.haibin.calendarview.Calendar lunarCalendar;
    private int month;
    private java.lang.String scheme;
    private int schemeColor;
    private java.util.List<com.haibin.calendarview.Calendar.Scheme> schemes;
    private java.lang.String solarTerm;
    private java.lang.String traditionFestival;
    private int week;
    private int year;

    public int getYear() {
        return this.year;
    }

    public void setYear(int i) {
        this.year = i;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int i) {
        this.month = i;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int i) {
        this.day = i;
    }

    public boolean isCurrentMonth() {
        return this.isCurrentMonth;
    }

    public void setCurrentMonth(boolean z) {
        this.isCurrentMonth = z;
    }

    public boolean isCurrentDay() {
        return this.isCurrentDay;
    }

    public void setCurrentDay(boolean z) {
        this.isCurrentDay = z;
    }

    public java.lang.String getLunar() {
        return this.lunar;
    }

    public void setLunar(java.lang.String str) {
        this.lunar = str;
    }

    public java.lang.String getScheme() {
        return this.scheme;
    }

    public void setScheme(java.lang.String str) {
        this.scheme = str;
    }

    public int getSchemeColor() {
        return this.schemeColor;
    }

    public void setSchemeColor(int i) {
        this.schemeColor = i;
    }

    public java.util.List<com.haibin.calendarview.Calendar.Scheme> getSchemes() {
        return this.schemes;
    }

    public void setSchemes(java.util.List<com.haibin.calendarview.Calendar.Scheme> list) {
        this.schemes = list;
    }

    public void addScheme(com.haibin.calendarview.Calendar.Scheme scheme) {
        if (this.schemes == null) {
            this.schemes = new java.util.ArrayList();
        }
        this.schemes.add(scheme);
    }

    public void addScheme(int i, java.lang.String str) {
        if (this.schemes == null) {
            this.schemes = new java.util.ArrayList();
        }
        this.schemes.add(new com.haibin.calendarview.Calendar.Scheme(i, str));
    }

    public void addScheme(int i, int i2, java.lang.String str) {
        if (this.schemes == null) {
            this.schemes = new java.util.ArrayList();
        }
        this.schemes.add(new com.haibin.calendarview.Calendar.Scheme(i, i2, str));
    }

    public void addScheme(int i, int i2, java.lang.String str, java.lang.String str2) {
        if (this.schemes == null) {
            this.schemes = new java.util.ArrayList();
        }
        this.schemes.add(new com.haibin.calendarview.Calendar.Scheme(i, i2, str, str2));
    }

    public void addScheme(int i, java.lang.String str, java.lang.String str2) {
        if (this.schemes == null) {
            this.schemes = new java.util.ArrayList();
        }
        this.schemes.add(new com.haibin.calendarview.Calendar.Scheme(i, str, str2));
    }

    public boolean isWeekend() {
        return this.isWeekend;
    }

    public void setWeekend(boolean z) {
        this.isWeekend = z;
    }

    public int getWeek() {
        return this.week;
    }

    public void setWeek(int i) {
        this.week = i;
    }

    public com.haibin.calendarview.Calendar getLunarCalendar() {
        return this.lunarCalendar;
    }

    public void setLunarCalendar(com.haibin.calendarview.Calendar calendar) {
        this.lunarCalendar = calendar;
    }

    public java.lang.String getSolarTerm() {
        return this.solarTerm;
    }

    public void setSolarTerm(java.lang.String str) {
        this.solarTerm = str;
    }

    public java.lang.String getGregorianFestival() {
        return this.gregorianFestival;
    }

    public void setGregorianFestival(java.lang.String str) {
        this.gregorianFestival = str;
    }

    public int getLeapMonth() {
        return this.leapMonth;
    }

    public void setLeapMonth(int i) {
        this.leapMonth = i;
    }

    public boolean isLeapYear() {
        return this.isLeapYear;
    }

    public void setLeapYear(boolean z) {
        this.isLeapYear = z;
    }

    public java.lang.String getTraditionFestival() {
        return this.traditionFestival;
    }

    public void setTraditionFestival(java.lang.String str) {
        this.traditionFestival = str;
    }

    public boolean hasScheme() {
        java.util.List<com.haibin.calendarview.Calendar.Scheme> list = this.schemes;
        return ((list == null || list.size() == 0) && android.text.TextUtils.isEmpty(this.scheme)) ? false : true;
    }

    public boolean isSameMonth(com.haibin.calendarview.Calendar calendar) {
        return this.year == calendar.getYear() && this.month == calendar.getMonth();
    }

    @Override // java.lang.Comparable
    public int compareTo(com.haibin.calendarview.Calendar calendar) {
        if (calendar == null) {
            return 1;
        }
        return toString().compareTo(calendar.toString());
    }

    public final int differ(com.haibin.calendarview.Calendar calendar) {
        return com.haibin.calendarview.CalendarUtil.differ(this, calendar);
    }

    public boolean isAvailable() {
        int i = this.year;
        boolean z = i > 0;
        int i2 = this.month;
        boolean z2 = z & (i2 > 0);
        int i3 = this.day;
        return z2 & (i3 > 0) & (i3 <= 31) & (i2 <= 12) & (i >= 1900) & (i <= 2099);
    }

    public long getTimeInMillis() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(1, this.year);
        calendar.set(2, this.month - 1);
        calendar.set(5, this.day);
        return calendar.getTimeInMillis();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.haibin.calendarview.Calendar)) {
            com.haibin.calendarview.Calendar calendar = (com.haibin.calendarview.Calendar) obj;
            if (calendar.getYear() == this.year && calendar.getMonth() == this.month && calendar.getDay() == this.day) {
                return true;
            }
        }
        return super.equals(obj);
    }

    public java.lang.String toString() {
        java.lang.Object valueOf;
        java.lang.Object valueOf2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.year);
        sb.append("");
        int i = this.month;
        if (i < 10) {
            valueOf = "0" + this.month;
        } else {
            valueOf = java.lang.Integer.valueOf(i);
        }
        sb.append(valueOf);
        sb.append("");
        int i2 = this.day;
        if (i2 < 10) {
            valueOf2 = "0" + this.day;
        } else {
            valueOf2 = java.lang.Integer.valueOf(i2);
        }
        sb.append(valueOf2);
        return sb.toString();
    }

    final void mergeScheme(com.haibin.calendarview.Calendar calendar, java.lang.String str) {
        if (calendar == null) {
            return;
        }
        if (!android.text.TextUtils.isEmpty(calendar.getScheme())) {
            str = calendar.getScheme();
        }
        setScheme(str);
        setSchemeColor(calendar.getSchemeColor());
        setSchemes(calendar.getSchemes());
    }

    final void clearScheme() {
        setScheme("");
        setSchemeColor(0);
        setSchemes(null);
    }

    public static final class Scheme implements java.io.Serializable {
        private java.lang.Object obj;
        private java.lang.String other;
        private java.lang.String scheme;
        private int shcemeColor;
        private int type;

        public Scheme() {
        }

        public Scheme(int i, int i2, java.lang.String str, java.lang.String str2) {
            this.type = i;
            this.shcemeColor = i2;
            this.scheme = str;
            this.other = str2;
        }

        public Scheme(int i, int i2, java.lang.String str) {
            this.type = i;
            this.shcemeColor = i2;
            this.scheme = str;
        }

        public Scheme(int i, java.lang.String str) {
            this.shcemeColor = i;
            this.scheme = str;
        }

        public Scheme(int i, java.lang.String str, java.lang.String str2) {
            this.shcemeColor = i;
            this.scheme = str;
            this.other = str2;
        }

        public int getShcemeColor() {
            return this.shcemeColor;
        }

        public void setShcemeColor(int i) {
            this.shcemeColor = i;
        }

        public java.lang.String getScheme() {
            return this.scheme;
        }

        public void setScheme(java.lang.String str) {
            this.scheme = str;
        }

        public java.lang.String getOther() {
            return this.other;
        }

        public void setOther(java.lang.String str) {
            this.other = str;
        }

        public int getType() {
            return this.type;
        }

        public void setType(int i) {
            this.type = i;
        }

        public java.lang.Object getObj() {
            return this.obj;
        }

        public void setObj(java.lang.Object obj) {
            this.obj = obj;
        }
    }
}
