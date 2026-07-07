package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcMusicManagerDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity> __deletionAdapterOfMusicToDeviceEntity;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity> __insertionAdapterOfMusicToDeviceEntity;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteByMusicName;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteMusics;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfUpdateMenuName;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfUpdateMusicMenu;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity> __updateAdapterOfMusicToDeviceEntity;

    public QcMusicManagerDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfMusicToDeviceEntity = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `music_to_device` (`device_address`,`music_name`,`singer`,`size`,`duration`,`path`,`album_id`,`song_menu_name`,`song_menu_id`) VALUES (?,?,?,?,?,?,?,?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity value) {
                if (value.getDeviceAddress() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getDeviceAddress());
                }
                if (value.getMusicName() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getMusicName());
                }
                if (value.getSinger() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getSinger());
                }
                stmt.bindLong(4, value.getSize());
                stmt.bindLong(5, value.getDuration());
                if (value.getPath() == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.getPath());
                }
                stmt.bindLong(7, value.getAlbumId());
                if (value.getSongMenuName() == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, value.getSongMenuName());
                }
                stmt.bindLong(9, value.getSongMenuId());
            }
        };
        this.__deletionAdapterOfMusicToDeviceEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `music_to_device` WHERE `music_name` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity value) {
                if (value.getMusicName() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getMusicName());
                }
            }
        };
        this.__updateAdapterOfMusicToDeviceEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `music_to_device` SET `device_address` = ?,`music_name` = ?,`singer` = ?,`size` = ?,`duration` = ?,`path` = ?,`album_id` = ?,`song_menu_name` = ?,`song_menu_id` = ? WHERE `music_name` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity value) {
                if (value.getDeviceAddress() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getDeviceAddress());
                }
                if (value.getMusicName() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getMusicName());
                }
                if (value.getSinger() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getSinger());
                }
                stmt.bindLong(4, value.getSize());
                stmt.bindLong(5, value.getDuration());
                if (value.getPath() == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.getPath());
                }
                stmt.bindLong(7, value.getAlbumId());
                if (value.getSongMenuName() == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, value.getSongMenuName());
                }
                stmt.bindLong(9, value.getSongMenuId());
                if (value.getMusicName() == null) {
                    stmt.bindNull(10);
                } else {
                    stmt.bindString(10, value.getMusicName());
                }
            }
        };
        this.__preparedStmtOfUpdateMenuName = new androidx.room.SharedSQLiteStatement(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao_Impl.4
            public java.lang.String createQuery() {
                return "update  music_to_device set  song_menu_name= ? where song_menu_id = ? and device_address=?";
            }
        };
        this.__preparedStmtOfUpdateMusicMenu = new androidx.room.SharedSQLiteStatement(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao_Impl.5
            public java.lang.String createQuery() {
                return "update  music_to_device set  song_menu_id=0 ,song_menu_name=? where music_name = ? and device_address=?";
            }
        };
        this.__preparedStmtOfDeleteMusics = new androidx.room.SharedSQLiteStatement(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao_Impl.6
            public java.lang.String createQuery() {
                return "delete from  music_to_device  where device_address =?";
            }
        };
        this.__preparedStmtOfDeleteByMusicName = new androidx.room.SharedSQLiteStatement(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao_Impl.7
            public java.lang.String createQuery() {
                return "delete from music_to_device where music_name=?";
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfMusicToDeviceEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfMusicToDeviceEntity.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfMusicToDeviceEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfMusicToDeviceEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfMusicToDeviceEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfMusicToDeviceEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao
    public void updateMenuName(final java.lang.String address, final java.lang.String menuName, final long menuId) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfUpdateMenuName.acquire();
        if (menuName == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, menuName);
        }
        acquire.bindLong(2, menuId);
        if (address == null) {
            acquire.bindNull(3);
        } else {
            acquire.bindString(3, address);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateMenuName.release(acquire);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao
    public void updateMusicMenu(final java.lang.String address, final java.lang.String musicName, final java.lang.String menuName) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfUpdateMusicMenu.acquire();
        if (menuName == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, menuName);
        }
        if (musicName == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, musicName);
        }
        if (address == null) {
            acquire.bindNull(3);
        } else {
            acquire.bindString(3, address);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateMusicMenu.release(acquire);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao
    public void deleteMusics(final java.lang.String address) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteMusics.acquire();
        if (address == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, address);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteMusics.release(acquire);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao
    public void deleteByMusicName(final java.lang.String musicName) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteByMusicName.acquire();
        if (musicName == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, musicName);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteByMusicName.release(acquire);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity> queryMusicNoSongList(final java.lang.String address) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from music_to_device where  device_address=? and song_menu_id >0", 1);
        if (address == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, address);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "music_name");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "singer");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "size");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "duration");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "path");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "album_id");
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "song_menu_name");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "song_menu_id");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.getLong(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getLong(columnIndexOrThrow9)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity> queryMusicsByMenuId(final java.lang.String address, final long menuId) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from music_to_device where device_address=? and  song_menu_id =?", 2);
        if (address == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, address);
        }
        acquire.bindLong(2, menuId);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "music_name");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "singer");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "size");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "duration");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "path");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "album_id");
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "song_menu_name");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "song_menu_id");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.getLong(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getLong(columnIndexOrThrow9)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity> queryAllMusicNoMenuId(final java.lang.String address) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from music_to_device where device_address=? and song_menu_id<=0", 1);
        if (address == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, address);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "music_name");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "singer");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "size");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "duration");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "path");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "album_id");
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "song_menu_name");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "song_menu_id");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.getLong(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getLong(columnIndexOrThrow9)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity> queryAll(final java.lang.String address) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from music_to_device where device_address=?", 1);
        if (address == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, address);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "music_name");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "singer");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "size");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "duration");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "path");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "album_id");
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "song_menu_name");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "song_menu_id");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.getLong(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getLong(columnIndexOrThrow9)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity queryMusicByName(java.lang.String str, java.lang.String str2) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from music_to_device where music_name=? and device_address=?", 2);
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
        com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity musicToDeviceEntity = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "device_address");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "music_name");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "singer");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "size");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "duration");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "path");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "album_id");
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "song_menu_name");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "song_menu_id");
            if (query.moveToFirst()) {
                musicToDeviceEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.getLong(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getLong(columnIndexOrThrow9));
            }
            return musicToDeviceEntity;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
