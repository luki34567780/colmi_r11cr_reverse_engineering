package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcMenstruationDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity> __deletionAdapterOfMenstruationEntity;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity> __insertionAdapterOfMenstruationEntity;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity> __updateAdapterOfMenstruationEntity;

    public QcMenstruationDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfMenstruationEntity = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `menstruation` (`mid`,`month_date`,`year`,`month`,`start_time`,`end_time`,`duration`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity value) {
                stmt.bindLong(1, value.getMid());
                if (value.getMonthDate() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getMonthDate());
                }
                stmt.bindLong(3, value.getYear());
                stmt.bindLong(4, value.getMonth());
                stmt.bindLong(5, value.getStartTime());
                stmt.bindLong(6, value.getEndTime());
                stmt.bindLong(7, value.getDuration());
            }
        };
        this.__deletionAdapterOfMenstruationEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `menstruation` WHERE `mid` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity value) {
                stmt.bindLong(1, value.getMid());
            }
        };
        this.__updateAdapterOfMenstruationEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `menstruation` SET `mid` = ?,`month_date` = ?,`year` = ?,`month` = ?,`start_time` = ?,`end_time` = ?,`duration` = ? WHERE `mid` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity value) {
                stmt.bindLong(1, value.getMid());
                if (value.getMonthDate() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getMonthDate());
                }
                stmt.bindLong(3, value.getYear());
                stmt.bindLong(4, value.getMonth());
                stmt.bindLong(5, value.getStartTime());
                stmt.bindLong(6, value.getEndTime());
                stmt.bindLong(7, value.getDuration());
                stmt.bindLong(8, value.getMid());
            }
        };
        this.__preparedStmtOfDeleteAll = new androidx.room.SharedSQLiteStatement(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao_Impl.4
            public java.lang.String createQuery() {
                return "delete from menstruation";
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfMenstruationEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfMenstruationEntity.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfMenstruationEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfMenstruationEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfMenstruationEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfMenstruationEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao
    public void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteAll.acquire();
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(acquire);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity> queryMenstruationByYearAndMonth(final int year, final int month) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from menstruation where year=? and month=? order by start_time  asc ", 2);
        acquire.bindLong(1, year);
        acquire.bindLong(2, month);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "mid");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "month_date");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "year");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "month");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "end_time");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "duration");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity menstruationEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity(query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5), query.getLong(columnIndexOrThrow6), query.getLong(columnIndexOrThrow7));
                menstruationEntity.setMid(query.getInt(columnIndexOrThrow));
                arrayList.add(menstruationEntity);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity> queryAll() {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select `menstruation`.`mid` AS `mid`, `menstruation`.`month_date` AS `month_date`, `menstruation`.`year` AS `year`, `menstruation`.`month` AS `month`, `menstruation`.`start_time` AS `start_time`, `menstruation`.`end_time` AS `end_time`, `menstruation`.`duration` AS `duration` from menstruation", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity menstruationEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity(query.isNull(1) ? null : query.getString(1), query.getInt(2), query.getInt(3), query.getLong(4), query.getLong(5), query.getLong(6));
                menstruationEntity.setMid(query.getInt(0));
                arrayList.add(menstruationEntity);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity queryMaxByStartTime() {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select `menstruation`.`mid` AS `mid`, `menstruation`.`month_date` AS `month_date`, `menstruation`.`year` AS `year`, `menstruation`.`month` AS `month`, `menstruation`.`start_time` AS `start_time`, `menstruation`.`end_time` AS `end_time`, `menstruation`.`duration` AS `duration` from menstruation order by start_time desc LIMIT 1 ", 0);
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity menstruationEntity = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            if (query.moveToFirst()) {
                menstruationEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity(query.isNull(1) ? null : query.getString(1), query.getInt(2), query.getInt(3), query.getLong(4), query.getLong(5), query.getLong(6));
                menstruationEntity.setMid(query.getInt(0));
            }
            return menstruationEntity;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
