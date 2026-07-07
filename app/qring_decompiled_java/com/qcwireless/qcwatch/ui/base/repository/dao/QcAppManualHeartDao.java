package com.qcwireless.qcwatch.ui.base.repository.dao;

/* compiled from: QcAppManualHeartDao.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H'J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H'J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H'¨\u0006\r"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcAppManualHeartDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/BaseDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/AppHeartEntity;", "queryAllData", "", "mac", "", "queryByDate", "date", "queryDataDate", "queryDataLimit", "", "queryLastData", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public interface QcAppManualHeartDao extends com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao<com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity> {
    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity> queryAllData(java.lang.String mac);

    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity> queryByDate(java.lang.String mac, java.lang.String date);

    com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity queryDataDate(java.lang.String mac);

    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity> queryDataLimit(java.lang.String mac, java.lang.String date);

    com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity queryLastData(java.lang.String mac, java.lang.String date);
}
