package com.qcwireless.qcwatch.ui.base.repository.dao;

/* compiled from: QcMusicMenuDao.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\nH'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\nH'J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H'J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH'J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0010"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcMusicMenuDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/BaseDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/SongMenuEntity;", "deleteMenu", "", "menuId", "", "queryMenuList", "", "address", "", "queryMenusList", "queryMusicMenuByMenuId", "queryMusicMenuByMenuName", "menuName", "updateMenuName", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public interface QcMusicMenuDao extends com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao<com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity> {
    void deleteMenu(long menuId);

    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity> queryMenuList(java.lang.String address);

    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity> queryMenusList(java.lang.String address);

    com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity queryMusicMenuByMenuId(java.lang.String address, long menuId);

    com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity queryMusicMenuByMenuName(java.lang.String address, java.lang.String menuName);

    void updateMenuName(java.lang.String menuName, long menuId);
}
