package com.qcwireless.qcwatch.ui.base.repository.dao;

/* compiled from: ManualBloodOxygenDao.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH'J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0010"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/dao/ManualBloodOxygenDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/BaseDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/BloodOxygenManualEntity;", "queryByDate", "mac", "", "date", "queryByTimestamp", "", "start", "", "end", "queryDataAll", "", "queryDataLimit", "queryDataLimitLast", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public interface ManualBloodOxygenDao extends com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity> {
    com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity queryByDate(java.lang.String mac, java.lang.String date);

    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity> queryByTimestamp(java.lang.String mac, int start, int end);

    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity> queryDataAll(java.lang.String mac, java.lang.String date);

    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity> queryDataLimit(java.lang.String mac, java.lang.String date);

    com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity queryDataLimitLast(java.lang.String mac);
}
