package com.qcwireless.qcwatch.ui.base.repository.dao;

/* compiled from: QcDeviceSettingDao.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H'¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcDeviceSettingDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/BaseDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/DeviceSettingEntity;", "deleteDataWhereMacNotNull", "", "mac", "", "queryByMacAndAction", "action", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public interface QcDeviceSettingDao extends com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao<com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity> {
    void deleteDataWhereMacNotNull(java.lang.String mac);

    com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity queryByMacAndAction(java.lang.String mac, java.lang.String action);
}
