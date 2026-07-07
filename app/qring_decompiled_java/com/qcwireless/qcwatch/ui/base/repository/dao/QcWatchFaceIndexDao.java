package com.qcwireless.qcwatch.ui.base.repository.dao;

/* compiled from: QcWatchFaceIndexDao.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0006H'J\"\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bH'J \u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H'¨\u0006\u000f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcWatchFaceIndexDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/BaseDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/WatchFaceIndexEntity;", "queryAllByHardVersion", "", "hdName", "", "queryWatchFaceByName", "name", "queryWatchFaceIndexByPosition", "typeId", "", "hdVersion", "position", "queryWatchFaceIndexOrderByPosition", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public interface QcWatchFaceIndexDao extends com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao<com.qcwireless.qcwatch.ui.base.repository.entity.WatchFaceIndexEntity> {
    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.WatchFaceIndexEntity> queryAllByHardVersion(java.lang.String hdName);

    com.qcwireless.qcwatch.ui.base.repository.entity.WatchFaceIndexEntity queryWatchFaceByName(java.lang.String name);

    com.qcwireless.qcwatch.ui.base.repository.entity.WatchFaceIndexEntity queryWatchFaceIndexByPosition(int typeId, java.lang.String hdVersion, int position);

    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.WatchFaceIndexEntity> queryWatchFaceIndexOrderByPosition(int typeId, java.lang.String hdVersion);
}
