package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcCustomFaceDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.QcCustomFaceDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity> __deletionAdapterOfCustomFaceEntity;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity> __insertionAdapterOfCustomFaceEntity;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity> __updateAdapterOfCustomFaceEntity;

    public QcCustomFaceDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfCustomFaceEntity = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcCustomFaceDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `custom_face` (`address`,`hd_version`,`type`,`x`,`y`,`image_url`,`local_url`) VALUES (?,?,?,?,?,?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity value) {
                if (value.getAddress() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getAddress());
                }
                if (value.getHdVersion() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getHdVersion());
                }
                stmt.bindLong(3, value.getType());
                stmt.bindLong(4, value.getX());
                stmt.bindLong(5, value.getY());
                if (value.getImageUrl() == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.getImageUrl());
                }
                if (value.getLocalUrl() == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindString(7, value.getLocalUrl());
                }
            }
        };
        this.__deletionAdapterOfCustomFaceEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcCustomFaceDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `custom_face` WHERE `hd_version` = ? AND `type` = ? AND `address` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity value) {
                if (value.getHdVersion() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getHdVersion());
                }
                stmt.bindLong(2, value.getType());
                if (value.getAddress() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getAddress());
                }
            }
        };
        this.__updateAdapterOfCustomFaceEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcCustomFaceDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `custom_face` SET `address` = ?,`hd_version` = ?,`type` = ?,`x` = ?,`y` = ?,`image_url` = ?,`local_url` = ? WHERE `hd_version` = ? AND `type` = ? AND `address` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity value) {
                if (value.getAddress() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getAddress());
                }
                if (value.getHdVersion() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getHdVersion());
                }
                stmt.bindLong(3, value.getType());
                stmt.bindLong(4, value.getX());
                stmt.bindLong(5, value.getY());
                if (value.getImageUrl() == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.getImageUrl());
                }
                if (value.getLocalUrl() == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindString(7, value.getLocalUrl());
                }
                if (value.getHdVersion() == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, value.getHdVersion());
                }
                stmt.bindLong(9, value.getType());
                if (value.getAddress() == null) {
                    stmt.bindNull(10);
                } else {
                    stmt.bindString(10, value.getAddress());
                }
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfCustomFaceEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfCustomFaceEntity.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfCustomFaceEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfCustomFaceEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfCustomFaceEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfCustomFaceEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcCustomFaceDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity> queryWatchFaceList(final java.lang.String address) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from custom_face where address=?", 1);
        if (address == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, address);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "hd_version");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "type");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "x");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "y");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "image_url");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "local_url");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcCustomFaceDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity queryWatchFaceCustom(java.lang.String str) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from custom_face where hd_version=? and type =1", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity customFaceEntity = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "hd_version");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "type");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "x");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "y");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "image_url");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "local_url");
            if (query.moveToFirst()) {
                customFaceEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7));
            }
            return customFaceEntity;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
