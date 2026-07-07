package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcMusicMenuDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity> __deletionAdapterOfSongMenuEntity;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity> __insertionAdapterOfSongMenuEntity;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteMenu;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfUpdateMenuName;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity> __updateAdapterOfSongMenuEntity;

    public QcMusicMenuDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfSongMenuEntity = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `song_menu` (`device_address`,`menu_id`,`menu_name`) VALUES (?,?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity value) {
                if (value.getDeviceAddress() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getDeviceAddress());
                }
                stmt.bindLong(2, value.getMenuId());
                if (value.getMenuName() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getMenuName());
                }
            }
        };
        this.__deletionAdapterOfSongMenuEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `song_menu` WHERE `menu_id` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity value) {
                stmt.bindLong(1, value.getMenuId());
            }
        };
        this.__updateAdapterOfSongMenuEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `song_menu` SET `device_address` = ?,`menu_id` = ?,`menu_name` = ? WHERE `menu_id` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity value) {
                if (value.getDeviceAddress() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getDeviceAddress());
                }
                stmt.bindLong(2, value.getMenuId());
                if (value.getMenuName() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getMenuName());
                }
                stmt.bindLong(4, value.getMenuId());
            }
        };
        this.__preparedStmtOfUpdateMenuName = new androidx.room.SharedSQLiteStatement(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao_Impl.4
            public java.lang.String createQuery() {
                return "update  song_menu set  menu_name= ? where menu_id =  ?";
            }
        };
        this.__preparedStmtOfDeleteMenu = new androidx.room.SharedSQLiteStatement(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao_Impl.5
            public java.lang.String createQuery() {
                return "delete from  song_menu  where menu_id =  ?";
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSongMenuEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSongMenuEntity.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSongMenuEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSongMenuEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSongMenuEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfSongMenuEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao
    public void updateMenuName(final java.lang.String menuName, final long menuId) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfUpdateMenuName.acquire();
        if (menuName == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, menuName);
        }
        acquire.bindLong(2, menuId);
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateMenuName.release(acquire);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao
    public void deleteMenu(final long menuId) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteMenu.acquire();
        acquire.bindLong(1, menuId);
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteMenu.release(acquire);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity> queryMenuList(final java.lang.String address) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from song_menu where  device_address=? and menu_id >0", 1);
        if (address == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, address);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "menu_id");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "menu_name");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity queryMusicMenuByMenuName(java.lang.String str, java.lang.String str2) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from song_menu where  device_address=? and menu_name =?", 2);
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
        com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity songMenuEntity = null;
        java.lang.String string = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "menu_id");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "menu_name");
            if (query.moveToFirst()) {
                java.lang.String string2 = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                long j = query.getLong(columnIndexOrThrow2);
                if (!query.isNull(columnIndexOrThrow3)) {
                    string = query.getString(columnIndexOrThrow3);
                }
                songMenuEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity(string2, j, string);
            }
            return songMenuEntity;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity queryMusicMenuByMenuId(java.lang.String str, long j) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from song_menu where  device_address=? and menu_id =?", 2);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        acquire.bindLong(2, j);
        this.__db.assertNotSuspendingTransaction();
        com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity songMenuEntity = null;
        java.lang.String string = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "menu_id");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "menu_name");
            if (query.moveToFirst()) {
                java.lang.String string2 = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                long j2 = query.getLong(columnIndexOrThrow2);
                if (!query.isNull(columnIndexOrThrow3)) {
                    string = query.getString(columnIndexOrThrow3);
                }
                songMenuEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity(string2, j2, string);
            }
            return songMenuEntity;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity> queryMenusList(final java.lang.String address) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from song_menu where  device_address=?", 1);
        if (address == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, address);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "menu_id");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "menu_name");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3)));
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
