package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcSportPlusDetailDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail> __deletionAdapterOfSportPlusDetail;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail> __insertionAdapterOfSportPlusDetail;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail> __updateAdapterOfSportPlusDetail;

    public QcSportPlusDetailDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfSportPlusDetail = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `sport_plus_detail` (`device_address`,`date_str`,`start_time`,`sport_type`,`duration`,`distance`,`calories`,`steps`,`rate_value`,`avg_rate`,`sync`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail sportPlusDetail) {
                if (sportPlusDetail.getDeviceAddress() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, sportPlusDetail.getDeviceAddress());
                }
                if (sportPlusDetail.getDateStr() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, sportPlusDetail.getDateStr());
                }
                supportSQLiteStatement.bindLong(3, sportPlusDetail.getStartTime());
                supportSQLiteStatement.bindLong(4, sportPlusDetail.getSportType());
                supportSQLiteStatement.bindLong(5, sportPlusDetail.getDuration());
                supportSQLiteStatement.bindDouble(6, sportPlusDetail.getDistance());
                supportSQLiteStatement.bindDouble(7, sportPlusDetail.getCalories());
                supportSQLiteStatement.bindLong(8, sportPlusDetail.getSteps());
                if (sportPlusDetail.getRateValue() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, sportPlusDetail.getRateValue());
                }
                supportSQLiteStatement.bindLong(10, sportPlusDetail.getAvgRate());
                supportSQLiteStatement.bindLong(11, sportPlusDetail.getSync() ? 1L : 0L);
            }
        };
        this.__deletionAdapterOfSportPlusDetail = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `sport_plus_detail` WHERE `device_address` = ? AND `start_time` = ? AND `sport_type` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail value) {
                if (value.getDeviceAddress() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getDeviceAddress());
                }
                stmt.bindLong(2, value.getStartTime());
                stmt.bindLong(3, value.getSportType());
            }
        };
        this.__updateAdapterOfSportPlusDetail = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `sport_plus_detail` SET `device_address` = ?,`date_str` = ?,`start_time` = ?,`sport_type` = ?,`duration` = ?,`distance` = ?,`calories` = ?,`steps` = ?,`rate_value` = ?,`avg_rate` = ?,`sync` = ? WHERE `device_address` = ? AND `start_time` = ? AND `sport_type` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail sportPlusDetail) {
                if (sportPlusDetail.getDeviceAddress() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, sportPlusDetail.getDeviceAddress());
                }
                if (sportPlusDetail.getDateStr() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, sportPlusDetail.getDateStr());
                }
                supportSQLiteStatement.bindLong(3, sportPlusDetail.getStartTime());
                supportSQLiteStatement.bindLong(4, sportPlusDetail.getSportType());
                supportSQLiteStatement.bindLong(5, sportPlusDetail.getDuration());
                supportSQLiteStatement.bindDouble(6, sportPlusDetail.getDistance());
                supportSQLiteStatement.bindDouble(7, sportPlusDetail.getCalories());
                supportSQLiteStatement.bindLong(8, sportPlusDetail.getSteps());
                if (sportPlusDetail.getRateValue() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, sportPlusDetail.getRateValue());
                }
                supportSQLiteStatement.bindLong(10, sportPlusDetail.getAvgRate());
                supportSQLiteStatement.bindLong(11, sportPlusDetail.getSync() ? 1L : 0L);
                if (sportPlusDetail.getDeviceAddress() == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindString(12, sportPlusDetail.getDeviceAddress());
                }
                supportSQLiteStatement.bindLong(13, sportPlusDetail.getStartTime());
                supportSQLiteStatement.bindLong(14, sportPlusDetail.getSportType());
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSportPlusDetail.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSportPlusDetail.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSportPlusDetail.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSportPlusDetail.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSportPlusDetail.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfSportPlusDetail.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail> queryByDate(final java.lang.String dateStr, final java.lang.String deviceAddress) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from sport_plus_detail where date_str=? and device_address=? ", 2);
        if (dateStr == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, dateStr);
        }
        if (deviceAddress == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, deviceAddress);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sport_type");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "duration");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "distance");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES);
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "steps");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "rate_value");
            int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "avg_rate");
            int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sync");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getFloat(columnIndexOrThrow6), query.getFloat(columnIndexOrThrow7), query.getInt(columnIndexOrThrow8), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9), query.getInt(columnIndexOrThrow10), query.getInt(columnIndexOrThrow11) != 0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail> querySportPlusByStartTime(final java.lang.String device, final long start, final long end) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from sport_plus_detail where device_address=? and start_time>=? and start_time <=? order by start_time desc", 3);
        if (device == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, device);
        }
        acquire.bindLong(2, start);
        acquire.bindLong(3, end);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sport_type");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "duration");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "distance");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES);
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "steps");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "rate_value");
            int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "avg_rate");
            int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sync");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getFloat(columnIndexOrThrow6), query.getFloat(columnIndexOrThrow7), query.getInt(columnIndexOrThrow8), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9), query.getInt(columnIndexOrThrow10), query.getInt(columnIndexOrThrow11) != 0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail queryLastSyncDate(java.lang.String str) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from sport_plus_detail where device_address=? order by date_str desc LIMIT 1 ", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail sportPlusDetail = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sport_type");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "duration");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "distance");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES);
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "steps");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "rate_value");
            int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "avg_rate");
            int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sync");
            if (query.moveToFirst()) {
                sportPlusDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getFloat(columnIndexOrThrow6), query.getFloat(columnIndexOrThrow7), query.getInt(columnIndexOrThrow8), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9), query.getInt(columnIndexOrThrow10), query.getInt(columnIndexOrThrow11) != 0);
            }
            return sportPlusDetail;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail> queryBySync() {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select `sport_plus_detail`.`device_address` AS `device_address`, `sport_plus_detail`.`date_str` AS `date_str`, `sport_plus_detail`.`start_time` AS `start_time`, `sport_plus_detail`.`sport_type` AS `sport_type`, `sport_plus_detail`.`duration` AS `duration`, `sport_plus_detail`.`distance` AS `distance`, `sport_plus_detail`.`calories` AS `calories`, `sport_plus_detail`.`steps` AS `steps`, `sport_plus_detail`.`rate_value` AS `rate_value`, `sport_plus_detail`.`avg_rate` AS `avg_rate`, `sport_plus_detail`.`sync` AS `sync` from sport_plus_detail where sync= 0 ", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail(query.isNull(0) ? null : query.getString(0), query.isNull(1) ? null : query.getString(1), query.getLong(2), query.getInt(3), query.getInt(4), query.getFloat(5), query.getFloat(6), query.getInt(7), query.isNull(8) ? null : query.getString(8), query.getInt(9), query.getInt(10) != 0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail querySportByStartTimeAndType(java.lang.String str, int i, long j) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from sport_plus_detail where device_address=? and sport_type=? and start_time=?  LIMIT 1 ", 3);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        acquire.bindLong(2, i);
        acquire.bindLong(3, j);
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail sportPlusDetail = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sport_type");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "duration");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "distance");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES);
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "steps");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "rate_value");
            int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "avg_rate");
            int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sync");
            if (query.moveToFirst()) {
                sportPlusDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getFloat(columnIndexOrThrow6), query.getFloat(columnIndexOrThrow7), query.getInt(columnIndexOrThrow8), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9), query.getInt(columnIndexOrThrow10), query.getInt(columnIndexOrThrow11) != 0);
            }
            return sportPlusDetail;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail queryByAddressOrderByStartTime(java.lang.String str) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from sport_plus_detail where device_address=? order by start_time desc LIMIT 1 ", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail sportPlusDetail = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sport_type");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "duration");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "distance");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES);
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "steps");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "rate_value");
            int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "avg_rate");
            int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sync");
            if (query.moveToFirst()) {
                sportPlusDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getFloat(columnIndexOrThrow6), query.getFloat(columnIndexOrThrow7), query.getInt(columnIndexOrThrow8), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9), query.getInt(columnIndexOrThrow10), query.getInt(columnIndexOrThrow11) != 0);
            }
            return sportPlusDetail;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
