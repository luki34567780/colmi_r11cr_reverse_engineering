package com.qcwireless.qcwatch.ui.base.repository.dao;

/* compiled from: QcTemperatureDao.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H'J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H'J \u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H'J(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH'J \u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H'J \u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H'¨\u0006\u0011"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcTemperatureDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/BaseDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/BodyTemperatureEntity;", "queryTemperatureLast", "mac", "", "queryTemperatureLastByDate", "date", "queryTemperatureList", "", "queryTemperatureListByFlag", "flag", "", "queryTemperatureListDesc", "queryUploadToServer", "startTime", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public interface QcTemperatureDao extends com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao<com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity> {
    com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity queryTemperatureLast(java.lang.String mac);

    com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity queryTemperatureLastByDate(java.lang.String mac, java.lang.String date);

    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity> queryTemperatureList(java.lang.String mac, java.lang.String date);

    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity> queryTemperatureListByFlag(java.lang.String mac, java.lang.String date, int flag);

    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity> queryTemperatureListDesc(java.lang.String mac, java.lang.String date);

    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity> queryUploadToServer(java.lang.String mac, long startTime);
}
