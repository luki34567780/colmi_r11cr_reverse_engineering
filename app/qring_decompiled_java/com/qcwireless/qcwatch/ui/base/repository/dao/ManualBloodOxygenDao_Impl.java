package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class ManualBloodOxygenDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity> __deletionAdapterOfBloodOxygenManualEntity;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity> __insertionAdapterOfBloodOxygenManualEntity;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity> __updateAdapterOfBloodOxygenManualEntity;

    public ManualBloodOxygenDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfBloodOxygenManualEntity = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `blood_oxygen_manual` (`mac`,`date_str`,`blood_oxygen`,`timestamp`) VALUES (?,?,?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity value) {
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
                stmt.bindLong(3, value.getBloodOxygen());
                stmt.bindLong(4, value.getTimestamp());
            }
        };
        this.__deletionAdapterOfBloodOxygenManualEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `blood_oxygen_manual` WHERE `mac` = ? AND `timestamp` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity value) {
                if (value.getMac() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getMac());
                }
                stmt.bindLong(2, value.getTimestamp());
            }
        };
        this.__updateAdapterOfBloodOxygenManualEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `blood_oxygen_manual` SET `mac` = ?,`date_str` = ?,`blood_oxygen` = ?,`timestamp` = ? WHERE `mac` = ? AND `timestamp` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity value) {
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
                stmt.bindLong(3, value.getBloodOxygen());
                stmt.bindLong(4, value.getTimestamp());
                if (value.getMac() == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.getMac());
                }
                stmt.bindLong(6, value.getTimestamp());
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfBloodOxygenManualEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfBloodOxygenManualEntity.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfBloodOxygenManualEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfBloodOxygenManualEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfBloodOxygenManualEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfBloodOxygenManualEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity> queryByTimestamp(final java.lang.String mac, final int start, final int end) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from blood_oxygen_manual where mac=? and timestamp >=? and timestamp <=?", 3);
        if (mac == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, mac);
        }
        acquire.bindLong(2, start);
        acquire.bindLong(3, end);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "mac");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "blood_oxygen");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "timestamp");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity> queryDataLimit(final java.lang.String mac, final java.lang.String date) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from blood_oxygen_manual where mac=? and date_str=? order by timestamp desc LIMIT 7 ", 2);
        if (mac == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, mac);
        }
        if (date == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, date);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "mac");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "blood_oxygen");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "timestamp");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity> queryDataAll(final java.lang.String mac, final java.lang.String date) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from blood_oxygen_manual where mac=? and date_str=? order by timestamp desc ", 2);
        if (mac == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, mac);
        }
        if (date == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, date);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "mac");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "blood_oxygen");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "timestamp");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity queryDataLimitLast(java.lang.String str) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from blood_oxygen_manual where mac=? order by timestamp desc LIMIT 1 ", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity bloodOxygenManualEntity = null;
        java.lang.String string = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "mac");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "blood_oxygen");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "timestamp");
            if (query.moveToFirst()) {
                java.lang.String string2 = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                if (!query.isNull(columnIndexOrThrow2)) {
                    string = query.getString(columnIndexOrThrow2);
                }
                bloodOxygenManualEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity(string2, string, query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4));
            }
            return bloodOxygenManualEntity;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity queryByDate(java.lang.String str, java.lang.String str2) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from blood_oxygen_manual where mac=? and date_str =? LIMIT 1", 2);
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
        com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity bloodOxygenManualEntity = null;
        java.lang.String string = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "mac");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_str");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "blood_oxygen");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "timestamp");
            if (query.moveToFirst()) {
                java.lang.String string2 = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                if (!query.isNull(columnIndexOrThrow2)) {
                    string = query.getString(columnIndexOrThrow2);
                }
                bloodOxygenManualEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity(string2, string, query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4));
            }
            return bloodOxygenManualEntity;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
