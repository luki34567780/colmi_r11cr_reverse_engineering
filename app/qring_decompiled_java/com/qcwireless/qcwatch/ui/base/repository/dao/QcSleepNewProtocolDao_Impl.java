package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcSleepNewProtocolDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol> __deletionAdapterOfSleepNewProtocol;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol> __insertionAdapterOfSleepNewProtocol;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol> __updateAdapterOfSleepNewProtocol;

    public QcSleepNewProtocolDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfSleepNewProtocol = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `sleep_new_protocol` (`device_address`,`date_str`,`detail`,`st`,`et`,`sync`,`last_sync_time`) VALUES (?,?,?,?,?,?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol sleepNewProtocol) {
                if (sleepNewProtocol.getDeviceAddress() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, sleepNewProtocol.getDeviceAddress());
                }
                if (sleepNewProtocol.getDateStr() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, sleepNewProtocol.getDateStr());
                }
                if (sleepNewProtocol.getDetail() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, sleepNewProtocol.getDetail());
                }
                supportSQLiteStatement.bindLong(4, sleepNewProtocol.getSt());
                supportSQLiteStatement.bindLong(5, sleepNewProtocol.getEt());
                supportSQLiteStatement.bindLong(6, sleepNewProtocol.getSync() ? 1L : 0L);
                supportSQLiteStatement.bindLong(7, sleepNewProtocol.getLastSyncTime());
            }
        };
        this.__deletionAdapterOfSleepNewProtocol = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `sleep_new_protocol` WHERE `device_address` = ? AND `date_str` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol value) {
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
        this.__updateAdapterOfSleepNewProtocol = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `sleep_new_protocol` SET `device_address` = ?,`date_str` = ?,`detail` = ?,`st` = ?,`et` = ?,`sync` = ?,`last_sync_time` = ? WHERE `device_address` = ? AND `date_str` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol sleepNewProtocol) {
                if (sleepNewProtocol.getDeviceAddress() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, sleepNewProtocol.getDeviceAddress());
                }
                if (sleepNewProtocol.getDateStr() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, sleepNewProtocol.getDateStr());
                }
                if (sleepNewProtocol.getDetail() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, sleepNewProtocol.getDetail());
                }
                supportSQLiteStatement.bindLong(4, sleepNewProtocol.getSt());
                supportSQLiteStatement.bindLong(5, sleepNewProtocol.getEt());
                supportSQLiteStatement.bindLong(6, sleepNewProtocol.getSync() ? 1L : 0L);
                supportSQLiteStatement.bindLong(7, sleepNewProtocol.getLastSyncTime());
                if (sleepNewProtocol.getDeviceAddress() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, sleepNewProtocol.getDeviceAddress());
                }
                if (sleepNewProtocol.getDateStr() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, sleepNewProtocol.getDateStr());
                }
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSleepNewProtocol.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSleepNewProtocol.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSleepNewProtocol.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSleepNewProtocol.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSleepNewProtocol.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfSleepNewProtocol.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol queryByDate(java.lang.String str, java.lang.String str2) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from sleep_new_protocol where date_str=? and device_address=? order by date_str desc limit 1", 2);
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
        com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol sleepNewProtocol = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "detail");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "st");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "et");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sync");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "last_sync_time");
            if (query.moveToFirst()) {
                sleepNewProtocol = new com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6) != 0, query.getLong(columnIndexOrThrow7));
            }
            return sleepNewProtocol;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol queryLastSyncDate(java.lang.String str) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from sleep_new_protocol where  device_address=? order by date_str desc LIMIT 1 ", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol sleepNewProtocol = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "detail");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "st");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "et");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sync");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "last_sync_time");
            if (query.moveToFirst()) {
                sleepNewProtocol = new com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6) != 0, query.getLong(columnIndexOrThrow7));
            }
            return sleepNewProtocol;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol> queryBySync() {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select `sleep_new_protocol`.`device_address` AS `device_address`, `sleep_new_protocol`.`date_str` AS `date_str`, `sleep_new_protocol`.`detail` AS `detail`, `sleep_new_protocol`.`st` AS `st`, `sleep_new_protocol`.`et` AS `et`, `sleep_new_protocol`.`sync` AS `sync`, `sleep_new_protocol`.`last_sync_time` AS `last_sync_time` from sleep_new_protocol where sync= 0 ", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol(query.isNull(0) ? null : query.getString(0), query.isNull(1) ? null : query.getString(1), query.isNull(2) ? null : query.getString(2), query.getInt(3), query.getInt(4), query.getInt(5) != 0, query.getLong(6)));
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
