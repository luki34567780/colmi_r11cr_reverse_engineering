package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcDeviceSettingDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity> __deletionAdapterOfDeviceSettingEntity;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity> __insertionAdapterOfDeviceSettingEntity;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteDataWhereMacNotNull;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity> __updateAdapterOfDeviceSettingEntity;

    public QcDeviceSettingDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfDeviceSettingEntity = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `device_setting` (`mac`,`setting_action`,`content`) VALUES (?,?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity value) {
                if (value.getMac() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getMac());
                }
                if (value.getSettingAction() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getSettingAction());
                }
                if (value.getContent() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getContent());
                }
            }
        };
        this.__deletionAdapterOfDeviceSettingEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `device_setting` WHERE `mac` = ? AND `setting_action` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity value) {
                if (value.getMac() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getMac());
                }
                if (value.getSettingAction() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getSettingAction());
                }
            }
        };
        this.__updateAdapterOfDeviceSettingEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `device_setting` SET `mac` = ?,`setting_action` = ?,`content` = ? WHERE `mac` = ? AND `setting_action` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity value) {
                if (value.getMac() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getMac());
                }
                if (value.getSettingAction() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getSettingAction());
                }
                if (value.getContent() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getContent());
                }
                if (value.getMac() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getMac());
                }
                if (value.getSettingAction() == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.getSettingAction());
                }
            }
        };
        this.__preparedStmtOfDeleteDataWhereMacNotNull = new androidx.room.SharedSQLiteStatement(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao_Impl.4
            public java.lang.String createQuery() {
                return "DELETE FROM device_setting where mac =? ";
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfDeviceSettingEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfDeviceSettingEntity.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfDeviceSettingEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfDeviceSettingEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfDeviceSettingEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfDeviceSettingEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao
    public void deleteDataWhereMacNotNull(final java.lang.String mac) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteDataWhereMacNotNull.acquire();
        if (mac == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, mac);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteDataWhereMacNotNull.release(acquire);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity queryByMacAndAction(java.lang.String str, java.lang.String str2) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * from device_setting where mac= ? and setting_action=?", 2);
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
        com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity deviceSettingEntity = null;
        java.lang.String string = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "mac");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "setting_action");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "content");
            if (query.moveToFirst()) {
                java.lang.String string2 = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                java.lang.String string3 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                if (!query.isNull(columnIndexOrThrow3)) {
                    string = query.getString(columnIndexOrThrow3);
                }
                deviceSettingEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(string2, string3, string);
            }
            return deviceSettingEntity;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
