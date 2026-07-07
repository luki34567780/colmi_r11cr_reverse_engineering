package com.qcwireless.qcwatch.base.utils;

/* compiled from: QcDateUtil.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fR&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/qcwireless/qcwatch/base/utils/QcDateUtil;", "", "()V", "monthShorthandList", "", "", "", "getMonthShorthandList", "()Ljava/util/Map;", "setMonthShorthandList", "(Ljava/util/Map;)V", "initStringArray", "", "localDateFormat", "dateUtil", "Lcom/qcwireless/qc_utils/date/DateUtil;", "localDateFormatSport", "localDateNoDayFormat", "localDateNoYearFormat", "start", "end", "localDateYMDHMSFormat", "localDateYMDHMSFormatSport", "sportIsToday", "", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class QcDateUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.base.utils.QcDateUtil.Companion INSTANCE = new com.qcwireless.qcwatch.base.utils.QcDateUtil.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.base.utils.QcDateUtil> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.base.utils.QcDateUtil>() { // from class: com.qcwireless.qcwatch.base.utils.QcDateUtil$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.base.utils.QcDateUtil m235invoke() {
            return new com.qcwireless.qcwatch.base.utils.QcDateUtil();
        }
    });
    private java.util.Map<java.lang.Integer, java.lang.String> monthShorthandList;

    public QcDateUtil() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.monthShorthandList = linkedHashMap;
        linkedHashMap.put(1, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_435));
        this.monthShorthandList.put(2, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_436));
        this.monthShorthandList.put(3, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_437));
        this.monthShorthandList.put(4, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_438));
        this.monthShorthandList.put(5, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_439));
        this.monthShorthandList.put(6, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_440));
        this.monthShorthandList.put(7, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_441));
        this.monthShorthandList.put(8, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_442));
        this.monthShorthandList.put(9, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_443));
        this.monthShorthandList.put(10, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_444));
        this.monthShorthandList.put(11, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_445));
        this.monthShorthandList.put(12, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_446));
    }

    public final java.util.Map<java.lang.Integer, java.lang.String> getMonthShorthandList() {
        return this.monthShorthandList;
    }

    public final void setMonthShorthandList(java.util.Map<java.lang.Integer, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.monthShorthandList = map;
    }

    public final void initStringArray() {
        this.monthShorthandList.put(1, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_435));
        this.monthShorthandList.put(2, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_436));
        this.monthShorthandList.put(3, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_437));
        this.monthShorthandList.put(4, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_438));
        this.monthShorthandList.put(5, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_439));
        this.monthShorthandList.put(6, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_440));
        this.monthShorthandList.put(7, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_441));
        this.monthShorthandList.put(8, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_442));
        this.monthShorthandList.put(9, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_443));
        this.monthShorthandList.put(10, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_444));
        this.monthShorthandList.put(11, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_445));
        this.monthShorthandList.put(12, com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_446));
    }

    public final java.lang.String localDateFormat(com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
        try {
            if (com.qcwireless.qc_utils.date.LanguageUtil.changeDateFormat()) {
                java.lang.String d_m_y = dateUtil.getD_M_Y();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d_m_y, "dateUtil.d_M_Y");
                java.util.List split$default = kotlin.text.StringsKt.split$default(d_m_y, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                return ((java.lang.String) split$default.get(0)) + ',' + this.monthShorthandList.get(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) split$default.get(1)))) + ((java.lang.String) split$default.get(2));
            }
            java.lang.String y_m_d = dateUtil.getY_M_D();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "{\n                dateUtil.y_M_D\n            }");
            return y_m_d;
        } catch (java.lang.Exception unused) {
            java.lang.String y_m_d2 = dateUtil.getY_M_D();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "dateUtil.y_M_D");
            return y_m_d2;
        }
    }

    public final java.lang.String localDateNoYearFormat(com.qcwireless.qc_utils.date.DateUtil start, com.qcwireless.qc_utils.date.DateUtil end) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(end, "end");
        try {
            if (com.qcwireless.qc_utils.date.LanguageUtil.changeDateFormat()) {
                java.lang.String d_m_y = start.getD_M_Y();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d_m_y, "start.d_M_Y");
                java.util.List split$default = kotlin.text.StringsKt.split$default(d_m_y, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                java.lang.String d_m_y2 = end.getD_M_Y();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d_m_y2, "end.d_M_Y");
                java.util.List split$default2 = kotlin.text.StringsKt.split$default(d_m_y2, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                return ((java.lang.String) split$default.get(0)) + ',' + this.monthShorthandList.get(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) split$default.get(1)))) + '~' + ((java.lang.String) split$default2.get(0)) + ',' + this.monthShorthandList.get(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) split$default2.get(1))));
            }
            return start.getMMddDate() + '~' + end.getMMddDate();
        } catch (java.lang.Exception unused) {
            return start.getMMddDate() + '~' + end.getMMddDate();
        }
    }

    public final java.lang.String localDateNoDayFormat(com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
        try {
            if (com.qcwireless.qc_utils.date.LanguageUtil.changeDateFormat()) {
                java.lang.String d_m_y = dateUtil.getD_M_Y();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d_m_y, "dateUtil.d_M_Y");
                java.util.List split$default = kotlin.text.StringsKt.split$default(d_m_y, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                return this.monthShorthandList.get(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) split$default.get(1)))) + ((java.lang.String) split$default.get(2));
            }
            java.lang.String yyyyMMDate = dateUtil.getYyyyMMDate();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(yyyyMMDate, "{\n                dateUt….yyyyMMDate\n            }");
            return yyyyMMDate;
        } catch (java.lang.Exception unused) {
            java.lang.String yyyyMMDate2 = dateUtil.getYyyyMMDate();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(yyyyMMDate2, "dateUtil.yyyyMMDate");
            return yyyyMMDate2;
        }
    }

    public final java.lang.String localDateYMDHMSFormat(com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
        try {
            if (com.qcwireless.qc_utils.date.LanguageUtil.changeDateFormat()) {
                java.lang.String y_m_d = dateUtil.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "dateUtil.y_M_D");
                java.util.List split$default = kotlin.text.StringsKt.split$default(y_m_d, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                return ((java.lang.String) split$default.get(2)) + ',' + this.monthShorthandList.get(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) split$default.get(1)))) + ((java.lang.String) split$default.get(0)) + ' ' + dateUtil.getHHmmssDate();
            }
            java.lang.String y_m_d_h_m_s = dateUtil.getY_M_D_H_M_S();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d_h_m_s, "{\n                dateUt…y_M_D_H_M_S\n            }");
            return y_m_d_h_m_s;
        } catch (java.lang.Exception unused) {
            java.lang.String y_m_d_h_m_s2 = dateUtil.getY_M_D_H_M_S();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d_h_m_s2, "dateUtil.y_M_D_H_M_S");
            return y_m_d_h_m_s2;
        }
    }

    public final java.lang.String localDateYMDHMSFormatSport(com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("Asia/Shanghai"));
        try {
            if (com.qcwireless.qc_utils.date.LanguageUtil.changeDateFormat()) {
                java.lang.String format = simpleDateFormat.format(dateUtil.toDate());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "sdf.format(dateUtil.toDate())");
                java.util.List split$default = kotlin.text.StringsKt.split$default(format, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                return ((java.lang.String) split$default.get(2)) + ',' + this.monthShorthandList.get(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) split$default.get(1)))) + ((java.lang.String) split$default.get(0));
            }
            java.lang.String format2 = simpleDateFormat.format(dateUtil.toDate());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "{\n                sdf.fo…l.toDate())\n            }");
            return format2;
        } catch (java.lang.Exception unused) {
            java.lang.String format3 = simpleDateFormat.format(dateUtil.toDate());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "sdf.format(dateUtil.toDate())");
            return format3;
        }
    }

    public final java.lang.String localDateFormatSport(com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault());
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("Asia/Shanghai"));
        try {
            if (com.qcwireless.qc_utils.date.LanguageUtil.changeDateFormat()) {
                java.lang.String format = simpleDateFormat.format(new java.util.Date(dateUtil.getTimestamp()));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "sdf.format(Date(dateUtil.timestamp))");
                java.util.List split$default = kotlin.text.StringsKt.split$default(format, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                return ((java.lang.String) split$default.get(0)) + ',' + this.monthShorthandList.get(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) split$default.get(1)))) + ((java.lang.String) split$default.get(2));
            }
            java.lang.String format2 = simpleDateFormat.format(new java.util.Date(dateUtil.getTimestamp()));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "{\n                sdf.fo…timestamp))\n            }");
            return format2;
        } catch (java.lang.Exception unused) {
            java.lang.String format3 = simpleDateFormat.format(new java.util.Date(dateUtil.getTimestamp()));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "sdf.format(Date(dateUtil.timestamp))");
            return format3;
        }
    }

    public final boolean sportIsToday(com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault());
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("Asia/Shanghai"));
        return simpleDateFormat.format(new java.util.Date(dateUtil.getTimestamp())).equals(new com.qcwireless.qc_utils.date.DateUtil().getY_M_D());
    }

    /* compiled from: QcDateUtil.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/base/utils/QcDateUtil$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/base/utils/QcDateUtil;", "getGetInstance", "()Lcom/qcwireless/qcwatch/base/utils/QcDateUtil;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.base.utils.QcDateUtil getGetInstance() {
            return (com.qcwireless.qcwatch.base.utils.QcDateUtil) com.qcwireless.qcwatch.base.utils.QcDateUtil.getInstance$delegate.getValue();
        }
    }
}
