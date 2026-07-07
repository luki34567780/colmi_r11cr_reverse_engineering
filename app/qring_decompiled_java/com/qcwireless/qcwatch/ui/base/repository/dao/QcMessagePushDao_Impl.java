package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcMessagePushDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity> __deletionAdapterOfMessagePushEntity;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity> __insertionAdapterOfMessagePushEntity;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteByPackageName;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity> __updateAdapterOfMessagePushEntity;

    public QcMessagePushDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfMessagePushEntity = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `message_push` (`package_name`,`open`) VALUES (?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity value) {
                if (value.getPackageName() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getPackageName());
                }
                stmt.bindLong(2, value.getOpen());
            }
        };
        this.__deletionAdapterOfMessagePushEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `message_push` WHERE `package_name` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity value) {
                if (value.getPackageName() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getPackageName());
                }
            }
        };
        this.__updateAdapterOfMessagePushEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `message_push` SET `package_name` = ?,`open` = ? WHERE `package_name` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity value) {
                if (value.getPackageName() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getPackageName());
                }
                stmt.bindLong(2, value.getOpen());
                if (value.getPackageName() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getPackageName());
                }
            }
        };
        this.__preparedStmtOfDeleteByPackageName = new androidx.room.SharedSQLiteStatement(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao_Impl.4
            public java.lang.String createQuery() {
                return "delete from message_push where package_name=?";
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfMessagePushEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfMessagePushEntity.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfMessagePushEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfMessagePushEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfMessagePushEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfMessagePushEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao
    public void deleteByPackageName(final java.lang.String name) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteByPackageName.acquire();
        if (name == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, name);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteByPackageName.release(acquire);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName(java.lang.String str) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from message_push where  package_name=? ", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity messagePushEntity = null;
        java.lang.String string = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "package_name");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "open");
            if (query.moveToFirst()) {
                if (!query.isNull(columnIndexOrThrow)) {
                    string = query.getString(columnIndexOrThrow);
                }
                messagePushEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(string, query.getInt(columnIndexOrThrow2));
            }
            return messagePushEntity;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByNameAndOpen(java.lang.String str, int i) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from message_push where  package_name=? and open<?", 2);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        acquire.bindLong(2, i);
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity messagePushEntity = null;
        java.lang.String string = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "package_name");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "open");
            if (query.moveToFirst()) {
                if (!query.isNull(columnIndexOrThrow)) {
                    string = query.getString(columnIndexOrThrow);
                }
                messagePushEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(string, query.getInt(columnIndexOrThrow2));
            }
            return messagePushEntity;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity> queryByOpen(final int open) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from message_push where open<?", 1);
        acquire.bindLong(1, open);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "package_name");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "open");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.getInt(columnIndexOrThrow2)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity> queryByStatus() {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select `message_push`.`package_name` AS `package_name`, `message_push`.`open` AS `open` from message_push where open =1 ", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(query.isNull(0) ? null : query.getString(0), query.getInt(1)));
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
