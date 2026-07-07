package com.qcwireless.qcwatch.ui.base.repository.dao;

/* compiled from: QcEbookDao.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bH'¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcEbookDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/BaseDao;", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/EbookEntity;", "deleteBookName", "", "bookName", "", "queryEbooks", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public interface QcEbookDao extends com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao<com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity> {
    void deleteBookName(java.lang.String bookName);

    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity> queryEbooks();
}
