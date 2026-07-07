package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcEbookDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.QcEbookDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity> __deletionAdapterOfEbookEntity;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity> __insertionAdapterOfEbookEntity;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteBookName;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity> __updateAdapterOfEbookEntity;

    public QcEbookDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfEbookEntity = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcEbookDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `ebook_entity` (`book_name`,`first_name`,`file_path`) VALUES (?,?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity value) {
                if (value.getBookName() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getBookName());
                }
                if (value.getFirstName() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getFirstName());
                }
                if (value.getFilePath() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getFilePath());
                }
            }
        };
        this.__deletionAdapterOfEbookEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcEbookDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `ebook_entity` WHERE `book_name` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity value) {
                if (value.getBookName() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getBookName());
                }
            }
        };
        this.__updateAdapterOfEbookEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcEbookDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `ebook_entity` SET `book_name` = ?,`first_name` = ?,`file_path` = ? WHERE `book_name` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity value) {
                if (value.getBookName() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getBookName());
                }
                if (value.getFirstName() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getFirstName());
                }
                if (value.getFilePath() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getFilePath());
                }
                if (value.getBookName() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getBookName());
                }
            }
        };
        this.__preparedStmtOfDeleteBookName = new androidx.room.SharedSQLiteStatement(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcEbookDao_Impl.4
            public java.lang.String createQuery() {
                return "delete from ebook_entity where book_name = ?";
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfEbookEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfEbookEntity.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfEbookEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfEbookEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfEbookEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfEbookEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcEbookDao
    public void deleteBookName(final java.lang.String bookName) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteBookName.acquire();
        if (bookName == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, bookName);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteBookName.release(acquire);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcEbookDao
    public java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity> queryEbooks() {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select `ebook_entity`.`book_name` AS `book_name`, `ebook_entity`.`first_name` AS `first_name`, `ebook_entity`.`file_path` AS `file_path` from ebook_entity  ", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity(query.isNull(0) ? null : query.getString(0), query.isNull(1) ? null : query.getString(1), query.isNull(2) ? null : query.getString(2)));
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
