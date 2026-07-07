package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcAppManualSugarContinuousDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity> __deletionAdapterOfAppBloodSugarContinuousEntity;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity> __insertionAdapterOfAppBloodSugarContinuousEntity;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity> __updateAdapterOfAppBloodSugarContinuousEntity;

    public QcAppManualSugarContinuousDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfAppBloodSugarContinuousEntity = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `app_continuous_sugar` (`mac`,`date_str`,`timestamp`,`min_sugar`,`max_sugar`,`hour`) VALUES (?,?,?,?,?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity value) {
                if (value.getMac() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getMac());
                }
                if (value.getDateStr() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getDateStr());
                }
                stmt.bindLong(3, value.getTimestamp());
                stmt.bindLong(4, value.getMinSugar());
                stmt.bindLong(5, value.getMaxSugar());
                stmt.bindLong(6, value.getHour());
            }
        };
        this.__deletionAdapterOfAppBloodSugarContinuousEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `app_continuous_sugar` WHERE `mac` = ? AND `date_str` = ? AND `hour` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity value) {
                if (value.getMac() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getMac());
                }
                if (value.getDateStr() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getDateStr());
                }
                stmt.bindLong(3, value.getHour());
            }
        };
        this.__updateAdapterOfAppBloodSugarContinuousEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `app_continuous_sugar` SET `mac` = ?,`date_str` = ?,`timestamp` = ?,`min_sugar` = ?,`max_sugar` = ?,`hour` = ? WHERE `mac` = ? AND `date_str` = ? AND `hour` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity value) {
                if (value.getMac() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getMac());
                }
                if (value.getDateStr() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getDateStr());
                }
                stmt.bindLong(3, value.getTimestamp());
                stmt.bindLong(4, value.getMinSugar());
                stmt.bindLong(5, value.getMaxSugar());
                stmt.bindLong(6, value.getHour());
                if (value.getMac() == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindString(7, value.getMac());
                }
                if (value.getDateStr() == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, value.getDateStr());
                }
                stmt.bindLong(9, value.getHour());
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfAppBloodSugarContinuousEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfAppBloodSugarContinuousEntity.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfAppBloodSugarContinuousEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfAppBloodSugarContinuousEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfAppBloodSugarContinuousEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfAppBloodSugarContinuousEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity queryDataDate(java.lang.String str, java.lang.String str2, int i) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from app_continuous_sugar where mac=?  and date_str=? and hour=?", 3);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        if (str2 == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str2);
        }
        acquire.bindLong(3, i);
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity appBloodSugarContinuousEntity = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "mac");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "timestamp");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "min_sugar");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "max_sugar");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "hour");
            if (query.moveToFirst()) {
                appBloodSugarContinuousEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6));
            }
            return appBloodSugarContinuousEntity;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity> queryBloodSugarByDate(final java.lang.String mac, final java.lang.String dateStr) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from app_continuous_sugar where  mac=?  and date_str=?", 2);
        if (mac == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, mac);
        }
        if (dateStr == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, dateStr);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "mac");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "timestamp");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "min_sugar");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "max_sugar");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "hour");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
