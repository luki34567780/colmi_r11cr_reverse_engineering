package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcContactsDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.QcContactsDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> __deletionAdapterOfContactsEntity;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> __insertionAdapterOfContactsEntity;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> __updateAdapterOfContactsEntity;

    public QcContactsDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfContactsEntity = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcContactsDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `contact_entity` (`mac`,`phone_number`,`contact_name`,`status`,`first_name`) VALUES (?,?,?,?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity value) {
                if (value.getMac() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getMac());
                }
                if (value.getPhoneNumber() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getPhoneNumber());
                }
                if (value.getContactName() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getContactName());
                }
                stmt.bindLong(4, value.getStatus());
                if (value.getFirstName() == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.getFirstName());
                }
            }
        };
        this.__deletionAdapterOfContactsEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcContactsDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `contact_entity` WHERE `mac` = ? AND `phone_number` = ? AND `contact_name` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity value) {
                if (value.getMac() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getMac());
                }
                if (value.getPhoneNumber() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getPhoneNumber());
                }
                if (value.getContactName() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getContactName());
                }
            }
        };
        this.__updateAdapterOfContactsEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcContactsDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `contact_entity` SET `mac` = ?,`phone_number` = ?,`contact_name` = ?,`status` = ?,`first_name` = ? WHERE `mac` = ? AND `phone_number` = ? AND `contact_name` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity value) {
                if (value.getMac() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getMac());
                }
                if (value.getPhoneNumber() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getPhoneNumber());
                }
                if (value.getContactName() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getContactName());
                }
                stmt.bindLong(4, value.getStatus());
                if (value.getFirstName() == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.getFirstName());
                }
                if (value.getMac() == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.getMac());
                }
                if (value.getPhoneNumber() == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindString(7, value.getPhoneNumber());
                }
                if (value.getContactName() == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, value.getContactName());
                }
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfContactsEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfContactsEntity.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfContactsEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfContactsEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfContactsEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfContactsEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcContactsDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> queryAll(final java.lang.String mac) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from contact_entity where mac=?", 1);
        if (mac == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, mac);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "mac");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "phone_number");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "contact_name");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "status");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "first_name");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5)));
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
