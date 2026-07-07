package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcStepDetailDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail> __deletionAdapterOfStepDetail;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail> __insertionAdapterOfStepDetail;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail> __updateAdapterOfStepDetail;

    public QcStepDetailDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfStepDetail = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `step_detail` (`device_address`,`date_str`,`interval`,`total_active_time`,`index_str`,`counts`,`miles`,`calories`,`sync`,`last_sync_time`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail stepDetail) {
                if (stepDetail.getDeviceAddress() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, stepDetail.getDeviceAddress());
                }
                if (stepDetail.getDateStr() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, stepDetail.getDateStr());
                }
                supportSQLiteStatement.bindLong(3, stepDetail.getIntervar());
                supportSQLiteStatement.bindLong(4, stepDetail.getTotalActiveTime());
                if (stepDetail.getIndex_str() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, stepDetail.getIndex_str());
                }
                if (stepDetail.getCounts() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, stepDetail.getCounts());
                }
                if (stepDetail.getMiles() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, stepDetail.getMiles());
                }
                if (stepDetail.getCalories() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, stepDetail.getCalories());
                }
                supportSQLiteStatement.bindLong(9, stepDetail.getSync() ? 1L : 0L);
                supportSQLiteStatement.bindLong(10, stepDetail.getLastSyncTime());
            }
        };
        this.__deletionAdapterOfStepDetail = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `step_detail` WHERE `device_address` = ? AND `date_str` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail value) {
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
        this.__updateAdapterOfStepDetail = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `step_detail` SET `device_address` = ?,`date_str` = ?,`interval` = ?,`total_active_time` = ?,`index_str` = ?,`counts` = ?,`miles` = ?,`calories` = ?,`sync` = ?,`last_sync_time` = ? WHERE `device_address` = ? AND `date_str` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail stepDetail) {
                if (stepDetail.getDeviceAddress() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, stepDetail.getDeviceAddress());
                }
                if (stepDetail.getDateStr() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, stepDetail.getDateStr());
                }
                supportSQLiteStatement.bindLong(3, stepDetail.getIntervar());
                supportSQLiteStatement.bindLong(4, stepDetail.getTotalActiveTime());
                if (stepDetail.getIndex_str() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, stepDetail.getIndex_str());
                }
                if (stepDetail.getCounts() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, stepDetail.getCounts());
                }
                if (stepDetail.getMiles() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, stepDetail.getMiles());
                }
                if (stepDetail.getCalories() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, stepDetail.getCalories());
                }
                supportSQLiteStatement.bindLong(9, stepDetail.getSync() ? 1L : 0L);
                supportSQLiteStatement.bindLong(10, stepDetail.getLastSyncTime());
                if (stepDetail.getDeviceAddress() == null) {
                    supportSQLiteStatement.bindNull(11);
                } else {
                    supportSQLiteStatement.bindString(11, stepDetail.getDeviceAddress());
                }
                if (stepDetail.getDateStr() == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindString(12, stepDetail.getDateStr());
                }
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfStepDetail.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfStepDetail.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfStepDetail.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfStepDetail.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfStepDetail.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfStepDetail.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail> queryLastSyncDate(final java.lang.String deviceAddress) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from step_detail where  device_address=? order by date_str desc LIMIT 7 ", 1);
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
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "total_active_time");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "index_str");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "counts");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "miles");
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES);
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sync");
            int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "last_sync_time");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getInt(columnIndexOrThrow9) != 0, query.getLong(columnIndexOrThrow10)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail queryByDate(java.lang.String str, java.lang.String str2) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from step_detail where device_address=? and date_str=? order by date_str desc limit 1", 2);
        if (str2 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str2);
        }
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail stepDetail = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "interval");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "total_active_time");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "index_str");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "counts");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "miles");
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES);
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sync");
            int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "last_sync_time");
            if (query.moveToFirst()) {
                stepDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getInt(columnIndexOrThrow9) != 0, query.getLong(columnIndexOrThrow10));
            }
            return stepDetail;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail> queryBySync() {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select `step_detail`.`device_address` AS `device_address`, `step_detail`.`date_str` AS `date_str`, `step_detail`.`interval` AS `interval`, `step_detail`.`total_active_time` AS `total_active_time`, `step_detail`.`index_str` AS `index_str`, `step_detail`.`counts` AS `counts`, `step_detail`.`miles` AS `miles`, `step_detail`.`calories` AS `calories`, `step_detail`.`sync` AS `sync`, `step_detail`.`last_sync_time` AS `last_sync_time` from step_detail where sync= 0 ", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail(query.isNull(0) ? null : query.getString(0), query.isNull(1) ? null : query.getString(1), query.getInt(2), query.getInt(3), query.isNull(4) ? null : query.getString(4), query.isNull(5) ? null : query.getString(5), query.isNull(6) ? null : query.getString(6), query.isNull(7) ? null : query.getString(7), query.getInt(8) != 0, query.getLong(9)));
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
