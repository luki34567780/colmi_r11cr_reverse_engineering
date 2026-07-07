package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcGpsDetailDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.QcGpsDetailDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail> __deletionAdapterOfGpsDetail;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail> __insertionAdapterOfGpsDetail;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail> __updateAdapterOfGpsDetail;

    public QcGpsDetailDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfGpsDetail = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcGpsDetailDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `gps_detail` (`start_time`,`duration`,`distance`,`calorie`,`locations`,`date_str`,`gps_type`) VALUES (?,?,?,?,?,?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail value) {
                stmt.bindLong(1, value.getStartTime());
                stmt.bindLong(2, value.getDuration());
                stmt.bindDouble(3, value.getDistance());
                stmt.bindDouble(4, value.getCalorie());
                if (value.getLocations() == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.getLocations());
                }
                if (value.getDateStr() == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.getDateStr());
                }
                stmt.bindLong(7, value.getGpsType());
            }
        };
        this.__deletionAdapterOfGpsDetail = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcGpsDetailDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `gps_detail` WHERE `start_time` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail value) {
                stmt.bindLong(1, value.getStartTime());
            }
        };
        this.__updateAdapterOfGpsDetail = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcGpsDetailDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `gps_detail` SET `start_time` = ?,`duration` = ?,`distance` = ?,`calorie` = ?,`locations` = ?,`date_str` = ?,`gps_type` = ? WHERE `start_time` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail value) {
                stmt.bindLong(1, value.getStartTime());
                stmt.bindLong(2, value.getDuration());
                stmt.bindDouble(3, value.getDistance());
                stmt.bindDouble(4, value.getCalorie());
                if (value.getLocations() == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.getLocations());
                }
                if (value.getDateStr() == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.getDateStr());
                }
                stmt.bindLong(7, value.getGpsType());
                stmt.bindLong(8, value.getStartTime());
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfGpsDetail.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfGpsDetail.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfGpsDetail.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfGpsDetail.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfGpsDetail.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfGpsDetail.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcGpsDetailDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail> queryListByDate(final java.lang.String date) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from gps_detail where date_str=? order by start_time desc", 1);
        if (date == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, date);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "duration");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "distance");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "calorie");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "locations");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "gps_type");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail(query.getLong(columnIndexOrThrow), query.getInt(columnIndexOrThrow2), query.getFloat(columnIndexOrThrow3), query.getFloat(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.getInt(columnIndexOrThrow7)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcGpsDetailDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail queryFirstByStartTime() {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select `gps_detail`.`start_time` AS `start_time`, `gps_detail`.`duration` AS `duration`, `gps_detail`.`distance` AS `distance`, `gps_detail`.`calorie` AS `calorie`, `gps_detail`.`locations` AS `locations`, `gps_detail`.`date_str` AS `date_str`, `gps_detail`.`gps_type` AS `gps_type` from gps_detail order by start_time desc limit 1", 0);
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail gpsDetail = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            if (query.moveToFirst()) {
                gpsDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail(query.getLong(0), query.getInt(1), query.getFloat(2), query.getFloat(3), query.isNull(4) ? null : query.getString(4), query.isNull(5) ? null : query.getString(5), query.getInt(6));
            }
            return gpsDetail;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcGpsDetailDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail> queryAll() {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select `gps_detail`.`start_time` AS `start_time`, `gps_detail`.`duration` AS `duration`, `gps_detail`.`distance` AS `distance`, `gps_detail`.`calorie` AS `calorie`, `gps_detail`.`locations` AS `locations`, `gps_detail`.`date_str` AS `date_str`, `gps_detail`.`gps_type` AS `gps_type` from gps_detail where start_time > 0 ", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail(query.getLong(0), query.getInt(1), query.getFloat(2), query.getFloat(3), query.isNull(4) ? null : query.getString(4), query.isNull(5) ? null : query.getString(5), query.getInt(6)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcGpsDetailDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail queryByStartTime(long j) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from gps_detail where start_time=? limit 1", 1);
        acquire.bindLong(1, j);
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail gpsDetail = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "duration");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "distance");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "calorie");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "locations");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "gps_type");
            if (query.moveToFirst()) {
                gpsDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail(query.getLong(columnIndexOrThrow), query.getInt(columnIndexOrThrow2), query.getFloat(columnIndexOrThrow3), query.getFloat(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.getInt(columnIndexOrThrow7));
            }
            return gpsDetail;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
