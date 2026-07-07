package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcSyncDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity> __deletionAdapterOfSyncDataEntity;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity> __insertionAdapterOfSyncDataEntity;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity> __updateAdapterOfSyncDataEntity;

    public QcSyncDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfSyncDataEntity = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `sync_entity` (`uid`,`data_action`,`last_sync_id`) VALUES (?,?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity value) {
                stmt.bindLong(1, value.getUid());
                if (value.getAction() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getAction());
                }
                stmt.bindLong(3, value.getLastSyncTime());
            }
        };
        this.__deletionAdapterOfSyncDataEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `sync_entity` WHERE `uid` = ? AND `data_action` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity value) {
                stmt.bindLong(1, value.getUid());
                if (value.getAction() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getAction());
                }
            }
        };
        this.__updateAdapterOfSyncDataEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `sync_entity` SET `uid` = ?,`data_action` = ?,`last_sync_id` = ? WHERE `uid` = ? AND `data_action` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity value) {
                stmt.bindLong(1, value.getUid());
                if (value.getAction() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getAction());
                }
                stmt.bindLong(3, value.getLastSyncTime());
                stmt.bindLong(4, value.getUid());
                if (value.getAction() == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.getAction());
                }
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSyncDataEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSyncDataEntity.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSyncDataEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSyncDataEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSyncDataEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfSyncDataEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity queryByUidAndAction(long j, java.lang.String str) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from sync_entity where uid= ? and data_action=? ", 2);
        acquire.bindLong(1, j);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity syncDataEntity = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "uid");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "data_action");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "last_sync_id");
            if (query.moveToFirst()) {
                syncDataEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3));
            }
            return syncDataEntity;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
