package com.qcwireless.qcwatch.ui.base.repository.dao;

/* compiled from: QcSleepDetailDao.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bH'J\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H'¨\u0006\u000b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcSleepDetailDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/BaseDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/SleepDetail;", "queryByDate", "dateStr", "", "deviceAddress", "queryBySync", "", "queryDaysHistoryDate", "queryLastSyncDate", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public interface QcSleepDetailDao extends com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao<com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail> {
    com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail queryByDate(java.lang.String dateStr, java.lang.String deviceAddress);

    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail> queryBySync();

    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail> queryDaysHistoryDate(java.lang.String deviceAddress);

    com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail queryLastSyncDate(java.lang.String deviceAddress);
}
