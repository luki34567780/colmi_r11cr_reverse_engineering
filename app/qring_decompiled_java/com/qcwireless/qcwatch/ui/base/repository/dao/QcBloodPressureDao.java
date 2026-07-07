package com.qcwireless.qcwatch.ui.base.repository.dao;

/* compiled from: QcBloodPressureDao.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH'J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H'J \u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH'¨\u0006\r"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcBloodPressureDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/BaseDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/BloodPressureEntity;", "queryBloodPressureList", "", "mac", "", "queryByUnixTime", "startTime", "", "endTime", "queryLastBpValue", "queryUploadToServer", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public interface QcBloodPressureDao extends com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao<com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity> {
    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity> queryBloodPressureList(java.lang.String mac);

    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity> queryByUnixTime(java.lang.String mac, long startTime, long endTime);

    com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity queryLastBpValue(java.lang.String mac);

    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity> queryUploadToServer(java.lang.String mac, long startTime);
}
