package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcUserDao_Impl implements com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity> __deletionAdapterOfUserEntity;
    private final androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity> __insertionAdapterOfUserEntity;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity> __updateAdapterOfUserEntity;

    public QcUserDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfUserEntity = new androidx.room.EntityInsertionAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao_Impl.1
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `user` (`uid`,`email`,`nick`,`gender`,`weight`,`weight_lbs`,`height`,`birthday`,`avatar_url`,`local_avatar_url`,`goal_steps`,`goal_calorie`,`goal_distance`,`goal_sport_time`,`goal_sleep_time`,`register_date`,`update`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity value) {
                stmt.bindLong(1, value.getTitle());
                if (value.getEmail() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getEmail());
                }
                if (value.getNickName() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getNickName());
                }
                stmt.bindLong(4, value.getGender());
                stmt.bindDouble(5, value.getWeight());
                stmt.bindLong(6, value.getWeightLbs());
                stmt.bindDouble(7, value.getHeight());
                if (value.getBirthday() == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, value.getBirthday());
                }
                if (value.getAvatarUrl() == null) {
                    stmt.bindNull(9);
                } else {
                    stmt.bindString(9, value.getAvatarUrl());
                }
                if (value.getLocalAvatarUrl() == null) {
                    stmt.bindNull(10);
                } else {
                    stmt.bindString(10, value.getLocalAvatarUrl());
                }
                stmt.bindLong(11, value.getGoalSteps());
                stmt.bindDouble(12, value.getGoalCalorie());
                stmt.bindDouble(13, value.getGoalDistance());
                stmt.bindDouble(14, value.getGoalSportTime());
                stmt.bindDouble(15, value.getGoalSleepTime());
                if (value.getRegisterDate() == null) {
                    stmt.bindNull(16);
                } else {
                    stmt.bindString(16, value.getRegisterDate());
                }
                stmt.bindLong(17, value.getUpdate());
            }
        };
        this.__deletionAdapterOfUserEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao_Impl.2
            public java.lang.String createQuery() {
                return "DELETE FROM `user` WHERE `uid` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity value) {
                stmt.bindLong(1, value.getTitle());
            }
        };
        this.__updateAdapterOfUserEntity = new androidx.room.EntityDeletionOrUpdateAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity>(__db) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao_Impl.3
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `user` SET `uid` = ?,`email` = ?,`nick` = ?,`gender` = ?,`weight` = ?,`weight_lbs` = ?,`height` = ?,`birthday` = ?,`avatar_url` = ?,`local_avatar_url` = ?,`goal_steps` = ?,`goal_calorie` = ?,`goal_distance` = ?,`goal_sport_time` = ?,`goal_sleep_time` = ?,`register_date` = ?,`update` = ? WHERE `uid` = ?";
            }

            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity value) {
                stmt.bindLong(1, value.getTitle());
                if (value.getEmail() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getEmail());
                }
                if (value.getNickName() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getNickName());
                }
                stmt.bindLong(4, value.getGender());
                stmt.bindDouble(5, value.getWeight());
                stmt.bindLong(6, value.getWeightLbs());
                stmt.bindDouble(7, value.getHeight());
                if (value.getBirthday() == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, value.getBirthday());
                }
                if (value.getAvatarUrl() == null) {
                    stmt.bindNull(9);
                } else {
                    stmt.bindString(9, value.getAvatarUrl());
                }
                if (value.getLocalAvatarUrl() == null) {
                    stmt.bindNull(10);
                } else {
                    stmt.bindString(10, value.getLocalAvatarUrl());
                }
                stmt.bindLong(11, value.getGoalSteps());
                stmt.bindDouble(12, value.getGoalCalorie());
                stmt.bindDouble(13, value.getGoalDistance());
                stmt.bindDouble(14, value.getGoalSportTime());
                stmt.bindDouble(15, value.getGoalSleepTime());
                if (value.getRegisterDate() == null) {
                    stmt.bindNull(16);
                } else {
                    stmt.bindString(16, value.getRegisterDate());
                }
                stmt.bindLong(17, value.getUpdate());
                stmt.bindLong(18, value.getTitle());
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insertAll(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfUserEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void insert(final com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfUserEntity.insert(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void delete(final com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfUserEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteList(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity> elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfUserEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void deleteSome(final com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity... elements) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfUserEntity.handleMultiple(elements);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.BaseDao
    public void update(final com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity element) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfUserEntity.handle(element);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao
    public com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity queryUserByUid(final long uid) {
        androidx.room.RoomSQLiteQuery roomSQLiteQuery;
        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity;
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from user where  uid=? ", 1);
        acquire.bindLong(1, uid);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, (android.os.CancellationSignal) null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "uid");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.google.android.gms.common.Scopes.EMAIL);
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "nick");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "gender");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "weight");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "weight_lbs");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "height");
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "birthday");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "avatar_url");
            int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "local_avatar_url");
            int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "goal_steps");
            int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "goal_calorie");
            int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "goal_distance");
            int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "goal_sport_time");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "goal_sleep_time");
                int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "register_date");
                int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "update");
                if (query.moveToFirst()) {
                    userEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getFloat(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6), query.getFloat(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9), query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10), query.getInt(columnIndexOrThrow11), query.getFloat(columnIndexOrThrow12), query.getFloat(columnIndexOrThrow13), query.getFloat(columnIndexOrThrow14), query.getFloat(columnIndexOrThrow15), query.isNull(columnIndexOrThrow16) ? null : query.getString(columnIndexOrThrow16), query.getInt(columnIndexOrThrow17));
                } else {
                    userEntity = null;
                }
                query.close();
                roomSQLiteQuery.release();
                return userEntity;
            } catch (java.lang.Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
