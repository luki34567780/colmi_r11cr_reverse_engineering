package com.qcwireless.qcwatch.ui.base.repository.gps;

/* compiled from: GpsRepository.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/gps/GpsRepository;", "", "()V", "gpsDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcGpsDetailDao;", "queryGpsDetailByDate", "", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/GpsDetail;", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "queryGpsDetailByStartTime", "start", "", "queryLastGpsDetail", "Lcom/qcwireless/qcwatch/ui/home/gps/bean/HomeGpsDetail;", "queryTotalDistance", "", "saveGpsDetail", "", "entity", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GpsRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository m539invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcGpsDetailDao gpsDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcGpsDao();

    public final void saveGpsDetail(com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "entity");
        this.gpsDao.insert(entity);
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail> queryGpsDetailByDate(com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.ui.base.repository.dao.QcGpsDetailDao qcGpsDetailDao = this.gpsDao;
        java.lang.String y_m_d = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        return qcGpsDetailDao.queryListByDate(y_m_d);
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail queryGpsDetailByStartTime(long start) {
        return this.gpsDao.queryByStartTime(start);
    }

    public final com.qcwireless.qcwatch.ui.home.gps.bean.HomeGpsDetail queryLastGpsDetail() {
        com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail queryFirstByStartTime = this.gpsDao.queryFirstByStartTime();
        if (queryFirstByStartTime != null) {
            java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.00", new java.text.DecimalFormatSymbols(java.util.Locale.US));
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
                java.lang.String format = decimalFormat.format(java.lang.Float.valueOf(queryFirstByStartTime.getDistance() / 1000));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "df.format(detail.distance / 1000)");
                return new com.qcwireless.qcwatch.ui.home.gps.bean.HomeGpsDetail(format, queryFirstByStartTime.getStartTime());
            }
            java.lang.String format2 = decimalFormat.format(java.lang.Float.valueOf(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kmToIn(queryFirstByStartTime.getDistance() / 1000)));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "df.format(kmToIn(detail.distance / 1000))");
            return new com.qcwireless.qcwatch.ui.home.gps.bean.HomeGpsDetail(format2, queryFirstByStartTime.getStartTime());
        }
        return new com.qcwireless.qcwatch.ui.home.gps.bean.HomeGpsDetail("--", 0L);
    }

    public final java.lang.String queryTotalDistance() {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.00", new java.text.DecimalFormatSymbols(java.util.Locale.US));
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail> queryAll = this.gpsDao.queryAll();
        float f = 0.0f;
        if (queryAll != null) {
            java.util.Iterator<T> it = queryAll.iterator();
            while (it.hasNext()) {
                java.lang.String format = decimalFormat.format(java.lang.Float.valueOf(((com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail) it.next()).getDistance() / 1000));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "df.format(it.distance/1000)");
                f += java.lang.Float.parseFloat(format);
            }
        }
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
            java.lang.String format2 = decimalFormat.format(java.lang.Float.valueOf(f));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "{\n            df.format(distance)\n        }");
            return format2;
        }
        java.lang.String format3 = decimalFormat.format(java.lang.Float.valueOf(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kmToIn(f)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "{\n            df.format(…ToIn(distance))\n        }");
        return format3;
    }

    /* compiled from: GpsRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/gps/GpsRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/gps/GpsRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/gps/GpsRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository) com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository.getInstance$delegate.getValue();
        }
    }
}
