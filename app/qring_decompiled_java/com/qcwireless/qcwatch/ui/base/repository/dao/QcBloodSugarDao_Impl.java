package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcBloodSugarDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodSugarDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity> __deletionAdapterOfBloodSugarEntity;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity> __insertionAdapterOfBloodSugarEntity;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity> __updateAdapterOfBloodSugarEntity;

    public QcBloodSugarDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfBloodSugarEntity = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodSugarDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `blood_sugar` (`device_address`,`date_str`,`min_array`,`max_array`,`unix_time`,`sync`,`last_sync_time`) VALUES (?,?,?,?,?,?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity bloodSugarEntity) {
                if (bloodSugarEntity.getDeviceAddress() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, bloodSugarEntity.getDeviceAddress());
                }
                if (bloodSugarEntity.getDateStr() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, bloodSugarEntity.getDateStr());
                }
                if (bloodSugarEntity.getMinArray() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, bloodSugarEntity.getMinArray());
                }
                if (bloodSugarEntity.getMaxArray() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, bloodSugarEntity.getMaxArray());
                }
                supportSQLiteStatement.bindLong(5, bloodSugarEntity.getUnixTime());
                supportSQLiteStatement.bindLong(6, bloodSugarEntity.getSync() ? 1L : 0L);
                supportSQLiteStatement.bindLong(7, bloodSugarEntity.getLastSyncTime());
            }
        };
        this.__deletionAdapterOfBloodSugarEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodSugarDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `blood_sugar` WHERE `device_address` = ? AND `date_str` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity value) {
                if (value.getDeviceAddress() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getDeviceAddress());
                }
                if (value.getDateStr() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getDateStr());
                }
            }
        };
        this.__updateAdapterOfBloodSugarEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodSugarDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `blood_sugar` SET `device_address` = ?,`date_str` = ?,`min_array` = ?,`max_array` = ?,`unix_time` = ?,`sync` = ?,`last_sync_time` = ? WHERE `device_address` = ? AND `date_str` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity bloodSugarEntity) {
                if (bloodSugarEntity.getDeviceAddress() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, bloodSugarEntity.getDeviceAddress());
                }
                if (bloodSugarEntity.getDateStr() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, bloodSugarEntity.getDateStr());
                }
                if (bloodSugarEntity.getMinArray() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, bloodSugarEntity.getMinArray());
                }
                if (bloodSugarEntity.getMaxArray() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, bloodSugarEntity.getMaxArray());
                }
                supportSQLiteStatement.bindLong(5, bloodSugarEntity.getUnixTime());
                supportSQLiteStatement.bindLong(6, bloodSugarEntity.getSync() ? 1L : 0L);
                supportSQLiteStatement.bindLong(7, bloodSugarEntity.getLastSyncTime());
                if (bloodSugarEntity.getDeviceAddress() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, bloodSugarEntity.getDeviceAddress());
                }
                if (bloodSugarEntity.getDateStr() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, bloodSugarEntity.getDateStr());
                }
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfBloodSugarEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfBloodSugarEntity.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfBloodSugarEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfBloodSugarEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfBloodSugarEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfBloodSugarEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodSugarDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity queryBloodSugarByDate(java.lang.String str, java.lang.String str2) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from blood_sugar where  device_address=?  and date_str=? limit 1", 2);
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
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity bloodSugarEntity = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "min_array");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "max_array");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "unix_time");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sync");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "last_sync_time");
            if (query.moveToFirst()) {
                bloodSugarEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6) != 0, query.getLong(columnIndexOrThrow7));
            }
            return bloodSugarEntity;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodSugarDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity queryBloodSugarByDateDesc(java.lang.String str) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from blood_sugar where  device_address=?  order by  date_str desc limit 1", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity bloodSugarEntity = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "min_array");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "max_array");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "unix_time");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sync");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "last_sync_time");
            if (query.moveToFirst()) {
                bloodSugarEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6) != 0, query.getLong(columnIndexOrThrow7));
            }
            return bloodSugarEntity;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
