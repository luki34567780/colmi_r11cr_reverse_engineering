package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcSleepDetailDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail> __deletionAdapterOfSleepDetail;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail> __insertionAdapterOfSleepDetail;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail> __updateAdapterOfSleepDetail;

    public QcSleepDetailDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfSleepDetail = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `sleep_detail` (`device_address`,`date_str`,`interval`,`index_str`,`quality`,`sync`,`last_sync_time`) VALUES (?,?,?,?,?,?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail sleepDetail) {
                if (sleepDetail.getDeviceAddress() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, sleepDetail.getDeviceAddress());
                }
                if (sleepDetail.getDateStr() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, sleepDetail.getDateStr());
                }
                supportSQLiteStatement.bindLong(3, sleepDetail.getIntervar());
                if (sleepDetail.getIndex_str() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, sleepDetail.getIndex_str());
                }
                if (sleepDetail.getQuality() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, sleepDetail.getQuality());
                }
                supportSQLiteStatement.bindLong(6, sleepDetail.getSync() ? 1L : 0L);
                supportSQLiteStatement.bindLong(7, sleepDetail.getLastSyncTime());
            }
        };
        this.__deletionAdapterOfSleepDetail = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `sleep_detail` WHERE `device_address` = ? AND `date_str` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail value) {
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
        this.__updateAdapterOfSleepDetail = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `sleep_detail` SET `device_address` = ?,`date_str` = ?,`interval` = ?,`index_str` = ?,`quality` = ?,`sync` = ?,`last_sync_time` = ? WHERE `device_address` = ? AND `date_str` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail sleepDetail) {
                if (sleepDetail.getDeviceAddress() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, sleepDetail.getDeviceAddress());
                }
                if (sleepDetail.getDateStr() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, sleepDetail.getDateStr());
                }
                supportSQLiteStatement.bindLong(3, sleepDetail.getIntervar());
                if (sleepDetail.getIndex_str() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, sleepDetail.getIndex_str());
                }
                if (sleepDetail.getQuality() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, sleepDetail.getQuality());
                }
                supportSQLiteStatement.bindLong(6, sleepDetail.getSync() ? 1L : 0L);
                supportSQLiteStatement.bindLong(7, sleepDetail.getLastSyncTime());
                if (sleepDetail.getDeviceAddress() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, sleepDetail.getDeviceAddress());
                }
                if (sleepDetail.getDateStr() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, sleepDetail.getDateStr());
                }
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSleepDetail.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSleepDetail.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSleepDetail.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSleepDetail.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSleepDetail.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfSleepDetail.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail queryLastSyncDate(java.lang.String str) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from sleep_detail where  device_address=? order by date_str desc LIMIT 1 ", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail sleepDetail = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "interval");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "index_str");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "quality");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sync");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "last_sync_time");
            if (query.moveToFirst()) {
                sleepDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6) != 0, query.getLong(columnIndexOrThrow7));
            }
            return sleepDetail;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail> queryDaysHistoryDate(final java.lang.String deviceAddress) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from sleep_detail where device_address=? order by date_str desc LIMIT 7 ", 1);
        if (deviceAddress == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, deviceAddress);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "interval");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "index_str");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "quality");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sync");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "last_sync_time");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6) != 0, query.getLong(columnIndexOrThrow7)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail queryByDate(java.lang.String str, java.lang.String str2) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from sleep_detail where date_str=? and device_address=? order by date_str desc limit 1", 2);
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
        com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail sleepDetail = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "interval");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "index_str");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "quality");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sync");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "last_sync_time");
            if (query.moveToFirst()) {
                sleepDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6) != 0, query.getLong(columnIndexOrThrow7));
            }
            return sleepDetail;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail> queryBySync() {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select `sleep_detail`.`device_address` AS `device_address`, `sleep_detail`.`date_str` AS `date_str`, `sleep_detail`.`interval` AS `interval`, `sleep_detail`.`index_str` AS `index_str`, `sleep_detail`.`quality` AS `quality`, `sleep_detail`.`sync` AS `sync`, `sleep_detail`.`last_sync_time` AS `last_sync_time` from sleep_detail where sync= 0 ", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail(query.isNull(0) ? null : query.getString(0), query.isNull(1) ? null : query.getString(1), query.getInt(2), query.isNull(3) ? null : query.getString(3), query.isNull(4) ? null : query.getString(4), query.getInt(5) != 0, query.getLong(6)));
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
