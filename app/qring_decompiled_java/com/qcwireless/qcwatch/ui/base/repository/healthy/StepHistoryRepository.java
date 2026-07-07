package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: StepHistoryRepository.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/StepHistoryRepository;", "", "()V", "stepTotalDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcStepTotalDao;", "queryMonthHistoryStepByDate", "", "Lcom/qcwireless/qcwatch/ui/base/view/QStepMonthHistoryBarChart$StepDataBean;", "start", "Lcom/qcwireless/qc_utils/date/DateUtil;", "end", "queryWeekHistoryStepByDate", "Lcom/qcwireless/qcwatch/ui/base/view/QStepWeekHistoryBarChart$StepDataBean;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class StepHistoryRepository {
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcStepTotalDao stepTotalDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcStepTotalDao();

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart.StepDataBean> queryWeekHistoryStepByDate(com.qcwireless.qc_utils.date.DateUtil start, com.qcwireless.qc_utils.date.DateUtil end) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(end, "end");
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(start.getUnixTimestamp(), true);
        dateUtil.setHour(0);
        dateUtil.setMinute(0);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal> queryByAddressAndDate = this.stepTotalDao.queryByAddressAndDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), java.lang.String.valueOf(start.getZeroTime()), java.lang.String.valueOf(end.getUnixTimestamp()));
        for (int i = 0; i < 7; i++) {
            java.lang.String y_m_d = dateUtil.getY_M_D();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "tempDate.y_M_D");
            linkedHashMap.put(y_m_d, new com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart.StepDataBean(dateUtil.getUnixTimestamp(), 0));
            dateUtil.addDay(1);
        }
        for (com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal stepTotal : queryByAddressAndDate) {
            java.lang.String dateStr = stepTotal.getDateStr();
            com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart.StepDataBean stepDataBean = (com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart.StepDataBean) linkedHashMap.get(dateStr);
            if (stepDataBean != null) {
                stepDataBean.setSteps(stepTotal.getStep());
            }
            if (stepDataBean != null) {
                stepDataBean.setDistance(stepTotal.getDistance());
            }
            if (stepDataBean != null) {
                stepDataBean.setCalorie(stepTotal.getCarolie());
            }
            if (stepDataBean != null) {
                linkedHashMap.put(dateStr, stepDataBean);
            }
        }
        return new java.util.ArrayList(linkedHashMap.values());
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QStepMonthHistoryBarChart.StepDataBean> queryMonthHistoryStepByDate(com.qcwireless.qc_utils.date.DateUtil start, com.qcwireless.qc_utils.date.DateUtil end) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(end, "end");
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(start.getUnixTimestamp(), true);
        dateUtil.setHour(0);
        dateUtil.setMinute(0);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal> queryByAddressAndDate = this.stepTotalDao.queryByAddressAndDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), java.lang.String.valueOf(start.getZeroTime()), java.lang.String.valueOf(end.getUnixTimestamp()));
        int daysOfMonth = com.qcwireless.qc_utils.date.DateUtil.getDaysOfMonth(start.toDate());
        if (1 <= daysOfMonth) {
            int i = 1;
            while (true) {
                java.lang.String y_m_d = dateUtil.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "tempDate.y_M_D");
                linkedHashMap.put(y_m_d, new com.qcwireless.qcwatch.ui.base.view.QStepMonthHistoryBarChart.StepDataBean(dateUtil.getUnixTimestamp(), 0));
                dateUtil.addDay(1);
                if (i == daysOfMonth) {
                    break;
                }
                i++;
            }
        }
        for (com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal stepTotal : queryByAddressAndDate) {
            java.lang.String dateStr = stepTotal.getDateStr();
            com.qcwireless.qcwatch.ui.base.view.QStepMonthHistoryBarChart.StepDataBean stepDataBean = (com.qcwireless.qcwatch.ui.base.view.QStepMonthHistoryBarChart.StepDataBean) linkedHashMap.get(dateStr);
            if (stepDataBean != null) {
                stepDataBean.setSteps(stepTotal.getStep());
            }
            if (stepDataBean != null) {
                stepDataBean.setDistance(stepTotal.getDistance());
            }
            if (stepDataBean != null) {
                stepDataBean.setCalorie(stepTotal.getCarolie());
            }
            if (stepDataBean != null) {
                linkedHashMap.put(dateStr, stepDataBean);
            }
        }
        return new java.util.ArrayList(linkedHashMap.values());
    }
}
