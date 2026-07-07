package com.qcwireless.qcwatch.ui.base.repository.dao;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcDatabase_Impl extends com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase {
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao _manualBloodOxygenDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.ManualPressureDao _manualPressureDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualHeartDao _qcAppManualHeartDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao _qcAppManualSugarContinuousDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarDao _qcAppManualSugarDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodOxygenDao _qcBloodOxygenDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodPressureDao _qcBloodPressureDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodSugarDao _qcBloodSugarDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcContactsDao _qcContactsDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcCustomFaceDao _qcCustomFaceDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao _qcDeviceSettingDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcEbookDao _qcEbookDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcFeedbackDao _qcFeedbackDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcGpsDetailDao _qcGpsDetailDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcHeartRateDetailDao _qcHeartRateDetailDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcManualHeartDao _qcManualHeartDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao _qcMenstruationDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao _qcMessagePushDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao _qcMusicManagerDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao _qcMusicMenuDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcPressureDetailDao _qcPressureDetailDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao _qcSleepDetailDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao _qcSleepNewProtocolDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepTotalDao _qcSleepTotalDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao _qcSportPlusDetailDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao _qcStepDetailDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcStepTotalDao _qcStepTotalDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao _qcSyncDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcTargetDao _qcTargetDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao _qcTemperatureDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao _qcUserDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao _qcWatchFaceDao;
    private volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceIndexDao _qcWatchFaceIndexDao;

    protected androidx.sqlite.db.SupportSQLiteOpenHelper createOpenHelper(androidx.room.DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new androidx.room.RoomOpenHelper(configuration, new androidx.room.RoomOpenHelper.Delegate(29) { // from class: com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase_Impl.1
            public void onPostMigrate(androidx.sqlite.db.SupportSQLiteDatabase _db) {
            }

            public void createAllTables(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                _db.execSQL("CREATE TABLE IF NOT EXISTS `user` (`uid` INTEGER NOT NULL, `email` TEXT NOT NULL, `nick` TEXT NOT NULL, `gender` INTEGER NOT NULL, `weight` REAL NOT NULL, `weight_lbs` INTEGER NOT NULL, `height` REAL NOT NULL, `birthday` TEXT NOT NULL, `avatar_url` TEXT NOT NULL, `local_avatar_url` TEXT NOT NULL, `goal_steps` INTEGER NOT NULL, `goal_calorie` REAL NOT NULL, `goal_distance` REAL NOT NULL, `goal_sport_time` REAL NOT NULL, `goal_sleep_time` REAL NOT NULL, `register_date` TEXT NOT NULL, `update` INTEGER NOT NULL, PRIMARY KEY(`uid`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `device_setting` (`mac` TEXT NOT NULL, `setting_action` TEXT NOT NULL, `content` TEXT NOT NULL, PRIMARY KEY(`mac`, `setting_action`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `step_detail` (`device_address` TEXT NOT NULL, `date_str` TEXT NOT NULL, `interval` INTEGER NOT NULL, `total_active_time` INTEGER NOT NULL, `index_str` TEXT NOT NULL, `counts` TEXT NOT NULL, `miles` TEXT NOT NULL, `calories` TEXT NOT NULL, `sync` INTEGER NOT NULL, `last_sync_time` INTEGER NOT NULL, PRIMARY KEY(`device_address`, `date_str`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `sleep_detail` (`device_address` TEXT NOT NULL, `date_str` TEXT NOT NULL, `interval` INTEGER NOT NULL, `index_str` TEXT NOT NULL, `quality` TEXT NOT NULL, `sync` INTEGER NOT NULL, `last_sync_time` INTEGER NOT NULL, PRIMARY KEY(`device_address`, `date_str`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `step_total` (`device_address` TEXT NOT NULL, `date_str` TEXT NOT NULL, `step` INTEGER NOT NULL, `distance` INTEGER NOT NULL, `calorie` INTEGER NOT NULL, `unix_time` INTEGER NOT NULL, PRIMARY KEY(`device_address`, `date_str`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `sleep_total` (`device_address` TEXT NOT NULL, `date_str` TEXT NOT NULL, `total_sleep` INTEGER NOT NULL, `deep_sleep` INTEGER NOT NULL, `light_sleep` INTEGER NOT NULL, `awake` INTEGER NOT NULL, `start_time` INTEGER NOT NULL, `end_time` INTEGER NOT NULL, `unix_time` INTEGER NOT NULL, PRIMARY KEY(`device_address`, `date_str`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `heart_rate_detail` (`device_address` TEXT NOT NULL, `date_str` TEXT NOT NULL, `interval` INTEGER NOT NULL, `index_str` TEXT NOT NULL, `value` TEXT NOT NULL, `unix_time` INTEGER NOT NULL, `sync` INTEGER NOT NULL, `last_sync_time` INTEGER NOT NULL, PRIMARY KEY(`device_address`, `date_str`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `sport_plus_detail` (`device_address` TEXT NOT NULL, `date_str` TEXT NOT NULL, `start_time` INTEGER NOT NULL, `sport_type` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `distance` REAL NOT NULL, `calories` REAL NOT NULL, `steps` INTEGER NOT NULL, `rate_value` TEXT NOT NULL, `avg_rate` INTEGER NOT NULL, `sync` INTEGER NOT NULL, PRIMARY KEY(`device_address`, `start_time`, `sport_type`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `watch_face` (`name` TEXT NOT NULL, `hardware_version` TEXT NOT NULL, `pre_image_url` TEXT NOT NULL, `bin_url` TEXT NOT NULL, `price` REAL NOT NULL, `face_type` INTEGER NOT NULL, `face_desc` TEXT NOT NULL, `local_image_url` TEXT NOT NULL, `local_bin_url` TEXT NOT NULL, `market_version` INTEGER NOT NULL, `type_id` INTEGER NOT NULL, PRIMARY KEY(`name`, `hardware_version`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `menstruation` (`mid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `month_date` TEXT, `year` INTEGER NOT NULL, `month` INTEGER NOT NULL, `start_time` INTEGER NOT NULL, `end_time` INTEGER NOT NULL, `duration` INTEGER NOT NULL)");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `message_push` (`package_name` TEXT NOT NULL, `open` INTEGER NOT NULL, PRIMARY KEY(`package_name`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `sync_entity` (`uid` INTEGER NOT NULL, `data_action` TEXT NOT NULL, `last_sync_id` INTEGER NOT NULL, PRIMARY KEY(`uid`, `data_action`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `gps_detail` (`start_time` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `distance` REAL NOT NULL, `calorie` REAL NOT NULL, `locations` TEXT NOT NULL, `date_str` TEXT NOT NULL, `gps_type` INTEGER NOT NULL, PRIMARY KEY(`start_time`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `blood_pressure` (`device_address` TEXT NOT NULL, `unix_time` INTEGER NOT NULL, `sbp` INTEGER NOT NULL, `dbp` INTEGER NOT NULL, `sync` INTEGER NOT NULL, `last_sync_time` INTEGER NOT NULL, PRIMARY KEY(`device_address`, `unix_time`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `blood_oxygen` (`device_address` TEXT NOT NULL, `date_str` TEXT NOT NULL, `min_array` TEXT NOT NULL, `max_array` TEXT NOT NULL, `unix_time` INTEGER NOT NULL, `sync` INTEGER NOT NULL, `last_sync_time` INTEGER NOT NULL, PRIMARY KEY(`device_address`, `date_str`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `feedback` (`type_id` INTEGER NOT NULL, `feedback_id` INTEGER NOT NULL, `content` TEXT NOT NULL, PRIMARY KEY(`type_id`, `feedback_id`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `custom_face` (`address` TEXT NOT NULL, `hd_version` TEXT NOT NULL, `type` INTEGER NOT NULL, `x` INTEGER NOT NULL, `y` INTEGER NOT NULL, `image_url` TEXT NOT NULL, `local_url` TEXT NOT NULL, PRIMARY KEY(`hd_version`, `type`, `address`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `temperature_entity` (`device_address` TEXT NOT NULL, `date_str` TEXT NOT NULL, `unix_time` INTEGER NOT NULL, `temperature` REAL NOT NULL, `min` INTEGER NOT NULL, `sync` INTEGER NOT NULL, `manual_flag` INTEGER NOT NULL, `last_sync_time` INTEGER NOT NULL, PRIMARY KEY(`device_address`, `date_str`, `min`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `sleep_new_protocol` (`device_address` TEXT NOT NULL, `date_str` TEXT NOT NULL, `detail` TEXT NOT NULL, `st` INTEGER NOT NULL, `et` INTEGER NOT NULL, `sync` INTEGER NOT NULL, `last_sync_time` INTEGER NOT NULL, PRIMARY KEY(`device_address`, `date_str`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `contact_entity` (`mac` TEXT NOT NULL, `phone_number` TEXT NOT NULL, `contact_name` TEXT NOT NULL, `status` INTEGER NOT NULL, `first_name` TEXT NOT NULL, PRIMARY KEY(`mac`, `phone_number`, `contact_name`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `manual_heart_entity` (`mac` TEXT NOT NULL, `date_str` TEXT NOT NULL, `content` TEXT NOT NULL, PRIMARY KEY(`mac`, `date_str`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `pay_watch_face` (`uid` INTEGER NOT NULL, `name` TEXT NOT NULL, `hardware_version` TEXT NOT NULL, `pre_image_url` TEXT NOT NULL, `bin_url` TEXT NOT NULL, `pay_status` INTEGER NOT NULL, `order_number` TEXT NOT NULL, `google_order_id` TEXT NOT NULL, PRIMARY KEY(`uid`, `name`, `hardware_version`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `watch_face_index` (`name` TEXT NOT NULL, `hardware_version` TEXT NOT NULL, `pre_image_url` TEXT NOT NULL, `bin_url` TEXT NOT NULL, `price` REAL NOT NULL, `local_image_url` TEXT NOT NULL, `local_bin_url` TEXT NOT NULL, `type_id` INTEGER NOT NULL, `position` INTEGER NOT NULL, PRIMARY KEY(`hardware_version`, `type_id`, `position`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `music_to_device` (`device_address` TEXT NOT NULL, `music_name` TEXT NOT NULL, `singer` TEXT NOT NULL, `size` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `path` TEXT NOT NULL, `album_id` INTEGER NOT NULL, `song_menu_name` TEXT NOT NULL, `song_menu_id` INTEGER NOT NULL, PRIMARY KEY(`music_name`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `song_menu` (`device_address` TEXT NOT NULL, `menu_id` INTEGER NOT NULL, `menu_name` TEXT NOT NULL, PRIMARY KEY(`menu_id`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `ebook_entity` (`book_name` TEXT NOT NULL, `first_name` TEXT NOT NULL, `file_path` TEXT NOT NULL, PRIMARY KEY(`book_name`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `blood_sugar` (`device_address` TEXT NOT NULL, `date_str` TEXT NOT NULL, `min_array` TEXT NOT NULL, `max_array` TEXT NOT NULL, `unix_time` INTEGER NOT NULL, `sync` INTEGER NOT NULL, `last_sync_time` INTEGER NOT NULL, PRIMARY KEY(`device_address`, `date_str`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `target_entity` (`device_address` TEXT NOT NULL, `goal_steps` INTEGER NOT NULL, `goal_calorie` REAL NOT NULL, `goal_distance` REAL NOT NULL, `goal_sport_time` REAL NOT NULL, `goal_sleep_time` REAL NOT NULL, PRIMARY KEY(`device_address`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `pressure_detail` (`device_address` TEXT NOT NULL, `date_str` TEXT NOT NULL, `interval` INTEGER NOT NULL, `index_str` TEXT NOT NULL, `value` TEXT NOT NULL, `unix_time` INTEGER NOT NULL, `sync` INTEGER NOT NULL, `last_sync_time` INTEGER NOT NULL, PRIMARY KEY(`device_address`, `date_str`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `blood_oxygen_manual` (`mac` TEXT NOT NULL, `date_str` TEXT NOT NULL, `blood_oxygen` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`mac`, `timestamp`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `pressure_manual` (`mac` TEXT NOT NULL, `date_str` TEXT NOT NULL, `pressure` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`mac`, `timestamp`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `app_heart` (`mac` TEXT NOT NULL, `date_str` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `heart` INTEGER NOT NULL, PRIMARY KEY(`mac`, `timestamp`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `app_sugar` (`mac` TEXT NOT NULL, `date_str` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `sugar` INTEGER NOT NULL, PRIMARY KEY(`mac`, `timestamp`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `app_continuous_sugar` (`mac` TEXT NOT NULL, `date_str` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `min_sugar` INTEGER NOT NULL, `max_sugar` INTEGER NOT NULL, `hour` INTEGER NOT NULL, PRIMARY KEY(`mac`, `date_str`, `hour`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '38fce734638e5c1cd5b20cf14cf9683a')");
            }

            public void dropAllTables(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                _db.execSQL("DROP TABLE IF EXISTS `user`");
                _db.execSQL("DROP TABLE IF EXISTS `device_setting`");
                _db.execSQL("DROP TABLE IF EXISTS `step_detail`");
                _db.execSQL("DROP TABLE IF EXISTS `sleep_detail`");
                _db.execSQL("DROP TABLE IF EXISTS `step_total`");
                _db.execSQL("DROP TABLE IF EXISTS `sleep_total`");
                _db.execSQL("DROP TABLE IF EXISTS `heart_rate_detail`");
                _db.execSQL("DROP TABLE IF EXISTS `sport_plus_detail`");
                _db.execSQL("DROP TABLE IF EXISTS `watch_face`");
                _db.execSQL("DROP TABLE IF EXISTS `menstruation`");
                _db.execSQL("DROP TABLE IF EXISTS `message_push`");
                _db.execSQL("DROP TABLE IF EXISTS `sync_entity`");
                _db.execSQL("DROP TABLE IF EXISTS `gps_detail`");
                _db.execSQL("DROP TABLE IF EXISTS `blood_pressure`");
                _db.execSQL("DROP TABLE IF EXISTS `blood_oxygen`");
                _db.execSQL("DROP TABLE IF EXISTS `feedback`");
                _db.execSQL("DROP TABLE IF EXISTS `custom_face`");
                _db.execSQL("DROP TABLE IF EXISTS `temperature_entity`");
                _db.execSQL("DROP TABLE IF EXISTS `sleep_new_protocol`");
                _db.execSQL("DROP TABLE IF EXISTS `contact_entity`");
                _db.execSQL("DROP TABLE IF EXISTS `manual_heart_entity`");
                _db.execSQL("DROP TABLE IF EXISTS `pay_watch_face`");
                _db.execSQL("DROP TABLE IF EXISTS `watch_face_index`");
                _db.execSQL("DROP TABLE IF EXISTS `music_to_device`");
                _db.execSQL("DROP TABLE IF EXISTS `song_menu`");
                _db.execSQL("DROP TABLE IF EXISTS `ebook_entity`");
                _db.execSQL("DROP TABLE IF EXISTS `blood_sugar`");
                _db.execSQL("DROP TABLE IF EXISTS `target_entity`");
                _db.execSQL("DROP TABLE IF EXISTS `pressure_detail`");
                _db.execSQL("DROP TABLE IF EXISTS `blood_oxygen_manual`");
                _db.execSQL("DROP TABLE IF EXISTS `pressure_manual`");
                _db.execSQL("DROP TABLE IF EXISTS `app_heart`");
                _db.execSQL("DROP TABLE IF EXISTS `app_sugar`");
                _db.execSQL("DROP TABLE IF EXISTS `app_continuous_sugar`");
                if (com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase_Impl.this.mCallbacks != null) {
                    int size = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((androidx.room.RoomDatabase.Callback) com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                    }
                }
            }

            protected void onCreate(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                if (com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase_Impl.this.mCallbacks != null) {
                    int size = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((androidx.room.RoomDatabase.Callback) com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase_Impl.this.mCallbacks.get(i)).onCreate(_db);
                    }
                }
            }

            public void onOpen(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase_Impl.this.mDatabase = _db;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase_Impl.this.internalInitInvalidationTracker(_db);
                if (com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase_Impl.this.mCallbacks != null) {
                    int size = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((androidx.room.RoomDatabase.Callback) com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase_Impl.this.mCallbacks.get(i)).onOpen(_db);
                    }
                }
            }

            public void onPreMigrate(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                androidx.room.util.DBUtil.dropFtsSyncTriggers(_db);
            }

            protected androidx.room.RoomOpenHelper.ValidationResult onValidateSchema(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                java.util.HashMap hashMap = new java.util.HashMap(17);
                hashMap.put("uid", new androidx.room.util.TableInfo.Column("uid", "INTEGER", true, 1, (java.lang.String) null, 1));
                hashMap.put(com.google.android.gms.common.Scopes.EMAIL, new androidx.room.util.TableInfo.Column(com.google.android.gms.common.Scopes.EMAIL, "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap.put("nick", new androidx.room.util.TableInfo.Column("nick", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap.put("gender", new androidx.room.util.TableInfo.Column("gender", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap.put("weight", new androidx.room.util.TableInfo.Column("weight", "REAL", true, 0, (java.lang.String) null, 1));
                hashMap.put("weight_lbs", new androidx.room.util.TableInfo.Column("weight_lbs", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap.put("height", new androidx.room.util.TableInfo.Column("height", "REAL", true, 0, (java.lang.String) null, 1));
                hashMap.put("birthday", new androidx.room.util.TableInfo.Column("birthday", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap.put("avatar_url", new androidx.room.util.TableInfo.Column("avatar_url", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap.put("local_avatar_url", new androidx.room.util.TableInfo.Column("local_avatar_url", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap.put("goal_steps", new androidx.room.util.TableInfo.Column("goal_steps", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap.put("goal_calorie", new androidx.room.util.TableInfo.Column("goal_calorie", "REAL", true, 0, (java.lang.String) null, 1));
                hashMap.put("goal_distance", new androidx.room.util.TableInfo.Column("goal_distance", "REAL", true, 0, (java.lang.String) null, 1));
                hashMap.put("goal_sport_time", new androidx.room.util.TableInfo.Column("goal_sport_time", "REAL", true, 0, (java.lang.String) null, 1));
                hashMap.put("goal_sleep_time", new androidx.room.util.TableInfo.Column("goal_sleep_time", "REAL", true, 0, (java.lang.String) null, 1));
                hashMap.put("register_date", new androidx.room.util.TableInfo.Column("register_date", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap.put("update", new androidx.room.util.TableInfo.Column("update", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo = new androidx.room.util.TableInfo("user", hashMap, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read = androidx.room.util.TableInfo.read(_db, "user");
                if (!tableInfo.equals(read)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "user(com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                java.util.HashMap hashMap2 = new java.util.HashMap(3);
                hashMap2.put("mac", new androidx.room.util.TableInfo.Column("mac", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap2.put("setting_action", new androidx.room.util.TableInfo.Column("setting_action", "TEXT", true, 2, (java.lang.String) null, 1));
                hashMap2.put("content", new androidx.room.util.TableInfo.Column("content", "TEXT", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo2 = new androidx.room.util.TableInfo("device_setting", hashMap2, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read2 = androidx.room.util.TableInfo.read(_db, "device_setting");
                if (!tableInfo2.equals(read2)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "device_setting(com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
                }
                java.util.HashMap hashMap3 = new java.util.HashMap(10);
                hashMap3.put("device_address", new androidx.room.util.TableInfo.Column("device_address", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap3.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 2, (java.lang.String) null, 1));
                hashMap3.put("interval", new androidx.room.util.TableInfo.Column("interval", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap3.put("total_active_time", new androidx.room.util.TableInfo.Column("total_active_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap3.put("index_str", new androidx.room.util.TableInfo.Column("index_str", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap3.put("counts", new androidx.room.util.TableInfo.Column("counts", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap3.put("miles", new androidx.room.util.TableInfo.Column("miles", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap3.put(com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES, new androidx.room.util.TableInfo.Column(com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES, "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap3.put("sync", new androidx.room.util.TableInfo.Column("sync", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap3.put("last_sync_time", new androidx.room.util.TableInfo.Column("last_sync_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo3 = new androidx.room.util.TableInfo("step_detail", hashMap3, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read3 = androidx.room.util.TableInfo.read(_db, "step_detail");
                if (!tableInfo3.equals(read3)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "step_detail(com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
                }
                java.util.HashMap hashMap4 = new java.util.HashMap(7);
                hashMap4.put("device_address", new androidx.room.util.TableInfo.Column("device_address", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap4.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 2, (java.lang.String) null, 1));
                hashMap4.put("interval", new androidx.room.util.TableInfo.Column("interval", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap4.put("index_str", new androidx.room.util.TableInfo.Column("index_str", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap4.put("quality", new androidx.room.util.TableInfo.Column("quality", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap4.put("sync", new androidx.room.util.TableInfo.Column("sync", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap4.put("last_sync_time", new androidx.room.util.TableInfo.Column("last_sync_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo4 = new androidx.room.util.TableInfo("sleep_detail", hashMap4, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read4 = androidx.room.util.TableInfo.read(_db, "sleep_detail");
                if (!tableInfo4.equals(read4)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "sleep_detail(com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail).\n Expected:\n" + tableInfo4 + "\n Found:\n" + read4);
                }
                java.util.HashMap hashMap5 = new java.util.HashMap(6);
                hashMap5.put("device_address", new androidx.room.util.TableInfo.Column("device_address", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap5.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 2, (java.lang.String) null, 1));
                hashMap5.put("step", new androidx.room.util.TableInfo.Column("step", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap5.put("distance", new androidx.room.util.TableInfo.Column("distance", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap5.put("calorie", new androidx.room.util.TableInfo.Column("calorie", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap5.put("unix_time", new androidx.room.util.TableInfo.Column("unix_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo5 = new androidx.room.util.TableInfo("step_total", hashMap5, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read5 = androidx.room.util.TableInfo.read(_db, "step_total");
                if (!tableInfo5.equals(read5)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "step_total(com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal).\n Expected:\n" + tableInfo5 + "\n Found:\n" + read5);
                }
                java.util.HashMap hashMap6 = new java.util.HashMap(9);
                hashMap6.put("device_address", new androidx.room.util.TableInfo.Column("device_address", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap6.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 2, (java.lang.String) null, 1));
                hashMap6.put("total_sleep", new androidx.room.util.TableInfo.Column("total_sleep", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap6.put("deep_sleep", new androidx.room.util.TableInfo.Column("deep_sleep", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap6.put("light_sleep", new androidx.room.util.TableInfo.Column("light_sleep", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap6.put("awake", new androidx.room.util.TableInfo.Column("awake", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap6.put("start_time", new androidx.room.util.TableInfo.Column("start_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap6.put("end_time", new androidx.room.util.TableInfo.Column("end_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap6.put("unix_time", new androidx.room.util.TableInfo.Column("unix_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo6 = new androidx.room.util.TableInfo("sleep_total", hashMap6, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read6 = androidx.room.util.TableInfo.read(_db, "sleep_total");
                if (!tableInfo6.equals(read6)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "sleep_total(com.qcwireless.qcwatch.ui.base.repository.entity.SleepTotalHistory).\n Expected:\n" + tableInfo6 + "\n Found:\n" + read6);
                }
                java.util.HashMap hashMap7 = new java.util.HashMap(8);
                hashMap7.put("device_address", new androidx.room.util.TableInfo.Column("device_address", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap7.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 2, (java.lang.String) null, 1));
                hashMap7.put("interval", new androidx.room.util.TableInfo.Column("interval", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap7.put("index_str", new androidx.room.util.TableInfo.Column("index_str", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap7.put("value", new androidx.room.util.TableInfo.Column("value", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap7.put("unix_time", new androidx.room.util.TableInfo.Column("unix_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap7.put("sync", new androidx.room.util.TableInfo.Column("sync", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap7.put("last_sync_time", new androidx.room.util.TableInfo.Column("last_sync_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo7 = new androidx.room.util.TableInfo("heart_rate_detail", hashMap7, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read7 = androidx.room.util.TableInfo.read(_db, "heart_rate_detail");
                if (!tableInfo7.equals(read7)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "heart_rate_detail(com.qcwireless.qcwatch.ui.base.repository.entity.HeartRateDetail).\n Expected:\n" + tableInfo7 + "\n Found:\n" + read7);
                }
                java.util.HashMap hashMap8 = new java.util.HashMap(11);
                hashMap8.put("device_address", new androidx.room.util.TableInfo.Column("device_address", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap8.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap8.put("start_time", new androidx.room.util.TableInfo.Column("start_time", "INTEGER", true, 2, (java.lang.String) null, 1));
                hashMap8.put("sport_type", new androidx.room.util.TableInfo.Column("sport_type", "INTEGER", true, 3, (java.lang.String) null, 1));
                hashMap8.put("duration", new androidx.room.util.TableInfo.Column("duration", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap8.put("distance", new androidx.room.util.TableInfo.Column("distance", "REAL", true, 0, (java.lang.String) null, 1));
                hashMap8.put(com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES, new androidx.room.util.TableInfo.Column(com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES, "REAL", true, 0, (java.lang.String) null, 1));
                hashMap8.put("steps", new androidx.room.util.TableInfo.Column("steps", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap8.put("rate_value", new androidx.room.util.TableInfo.Column("rate_value", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap8.put("avg_rate", new androidx.room.util.TableInfo.Column("avg_rate", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap8.put("sync", new androidx.room.util.TableInfo.Column("sync", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo8 = new androidx.room.util.TableInfo("sport_plus_detail", hashMap8, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read8 = androidx.room.util.TableInfo.read(_db, "sport_plus_detail");
                if (!tableInfo8.equals(read8)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "sport_plus_detail(com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail).\n Expected:\n" + tableInfo8 + "\n Found:\n" + read8);
                }
                java.util.HashMap hashMap9 = new java.util.HashMap(11);
                hashMap9.put("name", new androidx.room.util.TableInfo.Column("name", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap9.put("hardware_version", new androidx.room.util.TableInfo.Column("hardware_version", "TEXT", true, 2, (java.lang.String) null, 1));
                hashMap9.put("pre_image_url", new androidx.room.util.TableInfo.Column("pre_image_url", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap9.put("bin_url", new androidx.room.util.TableInfo.Column("bin_url", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap9.put("price", new androidx.room.util.TableInfo.Column("price", "REAL", true, 0, (java.lang.String) null, 1));
                hashMap9.put("face_type", new androidx.room.util.TableInfo.Column("face_type", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap9.put("face_desc", new androidx.room.util.TableInfo.Column("face_desc", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap9.put("local_image_url", new androidx.room.util.TableInfo.Column("local_image_url", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap9.put("local_bin_url", new androidx.room.util.TableInfo.Column("local_bin_url", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap9.put("market_version", new androidx.room.util.TableInfo.Column("market_version", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap9.put("type_id", new androidx.room.util.TableInfo.Column("type_id", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo9 = new androidx.room.util.TableInfo("watch_face", hashMap9, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read9 = androidx.room.util.TableInfo.read(_db, "watch_face");
                if (!tableInfo9.equals(read9)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "watch_face(com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace).\n Expected:\n" + tableInfo9 + "\n Found:\n" + read9);
                }
                java.util.HashMap hashMap10 = new java.util.HashMap(7);
                hashMap10.put("mid", new androidx.room.util.TableInfo.Column("mid", "INTEGER", true, 1, (java.lang.String) null, 1));
                hashMap10.put("month_date", new androidx.room.util.TableInfo.Column("month_date", "TEXT", false, 0, (java.lang.String) null, 1));
                hashMap10.put("year", new androidx.room.util.TableInfo.Column("year", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap10.put("month", new androidx.room.util.TableInfo.Column("month", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap10.put("start_time", new androidx.room.util.TableInfo.Column("start_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap10.put("end_time", new androidx.room.util.TableInfo.Column("end_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap10.put("duration", new androidx.room.util.TableInfo.Column("duration", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo10 = new androidx.room.util.TableInfo("menstruation", hashMap10, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read10 = androidx.room.util.TableInfo.read(_db, "menstruation");
                if (!tableInfo10.equals(read10)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "menstruation(com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity).\n Expected:\n" + tableInfo10 + "\n Found:\n" + read10);
                }
                java.util.HashMap hashMap11 = new java.util.HashMap(2);
                hashMap11.put("package_name", new androidx.room.util.TableInfo.Column("package_name", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap11.put("open", new androidx.room.util.TableInfo.Column("open", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo11 = new androidx.room.util.TableInfo("message_push", hashMap11, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read11 = androidx.room.util.TableInfo.read(_db, "message_push");
                if (!tableInfo11.equals(read11)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "message_push(com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity).\n Expected:\n" + tableInfo11 + "\n Found:\n" + read11);
                }
                java.util.HashMap hashMap12 = new java.util.HashMap(3);
                hashMap12.put("uid", new androidx.room.util.TableInfo.Column("uid", "INTEGER", true, 1, (java.lang.String) null, 1));
                hashMap12.put("data_action", new androidx.room.util.TableInfo.Column("data_action", "TEXT", true, 2, (java.lang.String) null, 1));
                hashMap12.put("last_sync_id", new androidx.room.util.TableInfo.Column("last_sync_id", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo12 = new androidx.room.util.TableInfo("sync_entity", hashMap12, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read12 = androidx.room.util.TableInfo.read(_db, "sync_entity");
                if (!tableInfo12.equals(read12)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "sync_entity(com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity).\n Expected:\n" + tableInfo12 + "\n Found:\n" + read12);
                }
                java.util.HashMap hashMap13 = new java.util.HashMap(7);
                hashMap13.put("start_time", new androidx.room.util.TableInfo.Column("start_time", "INTEGER", true, 1, (java.lang.String) null, 1));
                hashMap13.put("duration", new androidx.room.util.TableInfo.Column("duration", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap13.put("distance", new androidx.room.util.TableInfo.Column("distance", "REAL", true, 0, (java.lang.String) null, 1));
                hashMap13.put("calorie", new androidx.room.util.TableInfo.Column("calorie", "REAL", true, 0, (java.lang.String) null, 1));
                hashMap13.put("locations", new androidx.room.util.TableInfo.Column("locations", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap13.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap13.put("gps_type", new androidx.room.util.TableInfo.Column("gps_type", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo13 = new androidx.room.util.TableInfo("gps_detail", hashMap13, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read13 = androidx.room.util.TableInfo.read(_db, "gps_detail");
                if (!tableInfo13.equals(read13)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "gps_detail(com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail).\n Expected:\n" + tableInfo13 + "\n Found:\n" + read13);
                }
                java.util.HashMap hashMap14 = new java.util.HashMap(6);
                hashMap14.put("device_address", new androidx.room.util.TableInfo.Column("device_address", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap14.put("unix_time", new androidx.room.util.TableInfo.Column("unix_time", "INTEGER", true, 2, (java.lang.String) null, 1));
                hashMap14.put("sbp", new androidx.room.util.TableInfo.Column("sbp", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap14.put("dbp", new androidx.room.util.TableInfo.Column("dbp", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap14.put("sync", new androidx.room.util.TableInfo.Column("sync", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap14.put("last_sync_time", new androidx.room.util.TableInfo.Column("last_sync_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo14 = new androidx.room.util.TableInfo("blood_pressure", hashMap14, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read14 = androidx.room.util.TableInfo.read(_db, "blood_pressure");
                if (!tableInfo14.equals(read14)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "blood_pressure(com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity).\n Expected:\n" + tableInfo14 + "\n Found:\n" + read14);
                }
                java.util.HashMap hashMap15 = new java.util.HashMap(7);
                hashMap15.put("device_address", new androidx.room.util.TableInfo.Column("device_address", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap15.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 2, (java.lang.String) null, 1));
                hashMap15.put("min_array", new androidx.room.util.TableInfo.Column("min_array", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap15.put("max_array", new androidx.room.util.TableInfo.Column("max_array", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap15.put("unix_time", new androidx.room.util.TableInfo.Column("unix_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap15.put("sync", new androidx.room.util.TableInfo.Column("sync", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap15.put("last_sync_time", new androidx.room.util.TableInfo.Column("last_sync_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo15 = new androidx.room.util.TableInfo("blood_oxygen", hashMap15, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read15 = androidx.room.util.TableInfo.read(_db, "blood_oxygen");
                if (!tableInfo15.equals(read15)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "blood_oxygen(com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenEntity).\n Expected:\n" + tableInfo15 + "\n Found:\n" + read15);
                }
                java.util.HashMap hashMap16 = new java.util.HashMap(3);
                hashMap16.put("type_id", new androidx.room.util.TableInfo.Column("type_id", "INTEGER", true, 1, (java.lang.String) null, 1));
                hashMap16.put("feedback_id", new androidx.room.util.TableInfo.Column("feedback_id", "INTEGER", true, 2, (java.lang.String) null, 1));
                hashMap16.put("content", new androidx.room.util.TableInfo.Column("content", "TEXT", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo16 = new androidx.room.util.TableInfo("feedback", hashMap16, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read16 = androidx.room.util.TableInfo.read(_db, "feedback");
                if (!tableInfo16.equals(read16)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "feedback(com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity).\n Expected:\n" + tableInfo16 + "\n Found:\n" + read16);
                }
                java.util.HashMap hashMap17 = new java.util.HashMap(7);
                hashMap17.put("address", new androidx.room.util.TableInfo.Column("address", "TEXT", true, 3, (java.lang.String) null, 1));
                hashMap17.put("hd_version", new androidx.room.util.TableInfo.Column("hd_version", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap17.put("type", new androidx.room.util.TableInfo.Column("type", "INTEGER", true, 2, (java.lang.String) null, 1));
                hashMap17.put("x", new androidx.room.util.TableInfo.Column("x", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap17.put("y", new androidx.room.util.TableInfo.Column("y", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap17.put("image_url", new androidx.room.util.TableInfo.Column("image_url", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap17.put("local_url", new androidx.room.util.TableInfo.Column("local_url", "TEXT", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo17 = new androidx.room.util.TableInfo("custom_face", hashMap17, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read17 = androidx.room.util.TableInfo.read(_db, "custom_face");
                if (!tableInfo17.equals(read17)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "custom_face(com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity).\n Expected:\n" + tableInfo17 + "\n Found:\n" + read17);
                }
                java.util.HashMap hashMap18 = new java.util.HashMap(8);
                hashMap18.put("device_address", new androidx.room.util.TableInfo.Column("device_address", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap18.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 2, (java.lang.String) null, 1));
                hashMap18.put("unix_time", new androidx.room.util.TableInfo.Column("unix_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap18.put("temperature", new androidx.room.util.TableInfo.Column("temperature", "REAL", true, 0, (java.lang.String) null, 1));
                hashMap18.put("min", new androidx.room.util.TableInfo.Column("min", "INTEGER", true, 3, (java.lang.String) null, 1));
                hashMap18.put("sync", new androidx.room.util.TableInfo.Column("sync", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap18.put("manual_flag", new androidx.room.util.TableInfo.Column("manual_flag", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap18.put("last_sync_time", new androidx.room.util.TableInfo.Column("last_sync_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo18 = new androidx.room.util.TableInfo("temperature_entity", hashMap18, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read18 = androidx.room.util.TableInfo.read(_db, "temperature_entity");
                if (!tableInfo18.equals(read18)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "temperature_entity(com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity).\n Expected:\n" + tableInfo18 + "\n Found:\n" + read18);
                }
                java.util.HashMap hashMap19 = new java.util.HashMap(7);
                hashMap19.put("device_address", new androidx.room.util.TableInfo.Column("device_address", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap19.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 2, (java.lang.String) null, 1));
                hashMap19.put("detail", new androidx.room.util.TableInfo.Column("detail", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap19.put("st", new androidx.room.util.TableInfo.Column("st", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap19.put("et", new androidx.room.util.TableInfo.Column("et", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap19.put("sync", new androidx.room.util.TableInfo.Column("sync", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap19.put("last_sync_time", new androidx.room.util.TableInfo.Column("last_sync_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo19 = new androidx.room.util.TableInfo("sleep_new_protocol", hashMap19, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read19 = androidx.room.util.TableInfo.read(_db, "sleep_new_protocol");
                if (!tableInfo19.equals(read19)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "sleep_new_protocol(com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol).\n Expected:\n" + tableInfo19 + "\n Found:\n" + read19);
                }
                java.util.HashMap hashMap20 = new java.util.HashMap(5);
                hashMap20.put("mac", new androidx.room.util.TableInfo.Column("mac", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap20.put("phone_number", new androidx.room.util.TableInfo.Column("phone_number", "TEXT", true, 2, (java.lang.String) null, 1));
                hashMap20.put("contact_name", new androidx.room.util.TableInfo.Column("contact_name", "TEXT", true, 3, (java.lang.String) null, 1));
                hashMap20.put("status", new androidx.room.util.TableInfo.Column("status", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap20.put("first_name", new androidx.room.util.TableInfo.Column("first_name", "TEXT", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo20 = new androidx.room.util.TableInfo("contact_entity", hashMap20, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read20 = androidx.room.util.TableInfo.read(_db, "contact_entity");
                if (!tableInfo20.equals(read20)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "contact_entity(com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity).\n Expected:\n" + tableInfo20 + "\n Found:\n" + read20);
                }
                java.util.HashMap hashMap21 = new java.util.HashMap(3);
                hashMap21.put("mac", new androidx.room.util.TableInfo.Column("mac", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap21.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 2, (java.lang.String) null, 1));
                hashMap21.put("content", new androidx.room.util.TableInfo.Column("content", "TEXT", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo21 = new androidx.room.util.TableInfo("manual_heart_entity", hashMap21, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read21 = androidx.room.util.TableInfo.read(_db, "manual_heart_entity");
                if (!tableInfo21.equals(read21)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "manual_heart_entity(com.qcwireless.qcwatch.ui.base.repository.entity.ManualHeartEntity).\n Expected:\n" + tableInfo21 + "\n Found:\n" + read21);
                }
                java.util.HashMap hashMap22 = new java.util.HashMap(8);
                hashMap22.put("uid", new androidx.room.util.TableInfo.Column("uid", "INTEGER", true, 1, (java.lang.String) null, 1));
                hashMap22.put("name", new androidx.room.util.TableInfo.Column("name", "TEXT", true, 2, (java.lang.String) null, 1));
                hashMap22.put("hardware_version", new androidx.room.util.TableInfo.Column("hardware_version", "TEXT", true, 3, (java.lang.String) null, 1));
                hashMap22.put("pre_image_url", new androidx.room.util.TableInfo.Column("pre_image_url", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap22.put("bin_url", new androidx.room.util.TableInfo.Column("bin_url", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap22.put("pay_status", new androidx.room.util.TableInfo.Column("pay_status", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap22.put("order_number", new androidx.room.util.TableInfo.Column("order_number", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap22.put("google_order_id", new androidx.room.util.TableInfo.Column("google_order_id", "TEXT", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo22 = new androidx.room.util.TableInfo("pay_watch_face", hashMap22, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read22 = androidx.room.util.TableInfo.read(_db, "pay_watch_face");
                if (!tableInfo22.equals(read22)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "pay_watch_face(com.qcwireless.qcwatch.ui.base.repository.entity.PayWatchFace).\n Expected:\n" + tableInfo22 + "\n Found:\n" + read22);
                }
                java.util.HashMap hashMap23 = new java.util.HashMap(9);
                hashMap23.put("name", new androidx.room.util.TableInfo.Column("name", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap23.put("hardware_version", new androidx.room.util.TableInfo.Column("hardware_version", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap23.put("pre_image_url", new androidx.room.util.TableInfo.Column("pre_image_url", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap23.put("bin_url", new androidx.room.util.TableInfo.Column("bin_url", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap23.put("price", new androidx.room.util.TableInfo.Column("price", "REAL", true, 0, (java.lang.String) null, 1));
                hashMap23.put("local_image_url", new androidx.room.util.TableInfo.Column("local_image_url", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap23.put("local_bin_url", new androidx.room.util.TableInfo.Column("local_bin_url", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap23.put("type_id", new androidx.room.util.TableInfo.Column("type_id", "INTEGER", true, 2, (java.lang.String) null, 1));
                hashMap23.put("position", new androidx.room.util.TableInfo.Column("position", "INTEGER", true, 3, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo23 = new androidx.room.util.TableInfo("watch_face_index", hashMap23, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read23 = androidx.room.util.TableInfo.read(_db, "watch_face_index");
                if (!tableInfo23.equals(read23)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "watch_face_index(com.qcwireless.qcwatch.ui.base.repository.entity.WatchFaceIndexEntity).\n Expected:\n" + tableInfo23 + "\n Found:\n" + read23);
                }
                java.util.HashMap hashMap24 = new java.util.HashMap(9);
                hashMap24.put("device_address", new androidx.room.util.TableInfo.Column("device_address", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap24.put("music_name", new androidx.room.util.TableInfo.Column("music_name", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap24.put("singer", new androidx.room.util.TableInfo.Column("singer", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap24.put("size", new androidx.room.util.TableInfo.Column("size", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap24.put("duration", new androidx.room.util.TableInfo.Column("duration", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap24.put("path", new androidx.room.util.TableInfo.Column("path", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap24.put("album_id", new androidx.room.util.TableInfo.Column("album_id", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap24.put("song_menu_name", new androidx.room.util.TableInfo.Column("song_menu_name", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap24.put("song_menu_id", new androidx.room.util.TableInfo.Column("song_menu_id", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo24 = new androidx.room.util.TableInfo("music_to_device", hashMap24, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read24 = androidx.room.util.TableInfo.read(_db, "music_to_device");
                if (!tableInfo24.equals(read24)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "music_to_device(com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity).\n Expected:\n" + tableInfo24 + "\n Found:\n" + read24);
                }
                java.util.HashMap hashMap25 = new java.util.HashMap(3);
                hashMap25.put("device_address", new androidx.room.util.TableInfo.Column("device_address", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap25.put("menu_id", new androidx.room.util.TableInfo.Column("menu_id", "INTEGER", true, 1, (java.lang.String) null, 1));
                hashMap25.put("menu_name", new androidx.room.util.TableInfo.Column("menu_name", "TEXT", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo25 = new androidx.room.util.TableInfo("song_menu", hashMap25, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read25 = androidx.room.util.TableInfo.read(_db, "song_menu");
                if (!tableInfo25.equals(read25)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "song_menu(com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity).\n Expected:\n" + tableInfo25 + "\n Found:\n" + read25);
                }
                java.util.HashMap hashMap26 = new java.util.HashMap(3);
                hashMap26.put("book_name", new androidx.room.util.TableInfo.Column("book_name", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap26.put("first_name", new androidx.room.util.TableInfo.Column("first_name", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap26.put("file_path", new androidx.room.util.TableInfo.Column("file_path", "TEXT", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo26 = new androidx.room.util.TableInfo("ebook_entity", hashMap26, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read26 = androidx.room.util.TableInfo.read(_db, "ebook_entity");
                if (!tableInfo26.equals(read26)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "ebook_entity(com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity).\n Expected:\n" + tableInfo26 + "\n Found:\n" + read26);
                }
                java.util.HashMap hashMap27 = new java.util.HashMap(7);
                hashMap27.put("device_address", new androidx.room.util.TableInfo.Column("device_address", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap27.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 2, (java.lang.String) null, 1));
                hashMap27.put("min_array", new androidx.room.util.TableInfo.Column("min_array", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap27.put("max_array", new androidx.room.util.TableInfo.Column("max_array", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap27.put("unix_time", new androidx.room.util.TableInfo.Column("unix_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap27.put("sync", new androidx.room.util.TableInfo.Column("sync", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap27.put("last_sync_time", new androidx.room.util.TableInfo.Column("last_sync_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo27 = new androidx.room.util.TableInfo("blood_sugar", hashMap27, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read27 = androidx.room.util.TableInfo.read(_db, "blood_sugar");
                if (!tableInfo27.equals(read27)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "blood_sugar(com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity).\n Expected:\n" + tableInfo27 + "\n Found:\n" + read27);
                }
                java.util.HashMap hashMap28 = new java.util.HashMap(6);
                hashMap28.put("device_address", new androidx.room.util.TableInfo.Column("device_address", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap28.put("goal_steps", new androidx.room.util.TableInfo.Column("goal_steps", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap28.put("goal_calorie", new androidx.room.util.TableInfo.Column("goal_calorie", "REAL", true, 0, (java.lang.String) null, 1));
                hashMap28.put("goal_distance", new androidx.room.util.TableInfo.Column("goal_distance", "REAL", true, 0, (java.lang.String) null, 1));
                hashMap28.put("goal_sport_time", new androidx.room.util.TableInfo.Column("goal_sport_time", "REAL", true, 0, (java.lang.String) null, 1));
                hashMap28.put("goal_sleep_time", new androidx.room.util.TableInfo.Column("goal_sleep_time", "REAL", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo28 = new androidx.room.util.TableInfo("target_entity", hashMap28, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read28 = androidx.room.util.TableInfo.read(_db, "target_entity");
                if (!tableInfo28.equals(read28)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "target_entity(com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity).\n Expected:\n" + tableInfo28 + "\n Found:\n" + read28);
                }
                java.util.HashMap hashMap29 = new java.util.HashMap(8);
                hashMap29.put("device_address", new androidx.room.util.TableInfo.Column("device_address", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap29.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 2, (java.lang.String) null, 1));
                hashMap29.put("interval", new androidx.room.util.TableInfo.Column("interval", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap29.put("index_str", new androidx.room.util.TableInfo.Column("index_str", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap29.put("value", new androidx.room.util.TableInfo.Column("value", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap29.put("unix_time", new androidx.room.util.TableInfo.Column("unix_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap29.put("sync", new androidx.room.util.TableInfo.Column("sync", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap29.put("last_sync_time", new androidx.room.util.TableInfo.Column("last_sync_time", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo29 = new androidx.room.util.TableInfo("pressure_detail", hashMap29, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read29 = androidx.room.util.TableInfo.read(_db, "pressure_detail");
                if (!tableInfo29.equals(read29)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "pressure_detail(com.qcwireless.qcwatch.ui.base.repository.entity.PressureDetail).\n Expected:\n" + tableInfo29 + "\n Found:\n" + read29);
                }
                java.util.HashMap hashMap30 = new java.util.HashMap(4);
                hashMap30.put("mac", new androidx.room.util.TableInfo.Column("mac", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap30.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap30.put("blood_oxygen", new androidx.room.util.TableInfo.Column("blood_oxygen", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap30.put("timestamp", new androidx.room.util.TableInfo.Column("timestamp", "INTEGER", true, 2, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo30 = new androidx.room.util.TableInfo("blood_oxygen_manual", hashMap30, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read30 = androidx.room.util.TableInfo.read(_db, "blood_oxygen_manual");
                if (!tableInfo30.equals(read30)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "blood_oxygen_manual(com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity).\n Expected:\n" + tableInfo30 + "\n Found:\n" + read30);
                }
                java.util.HashMap hashMap31 = new java.util.HashMap(4);
                hashMap31.put("mac", new androidx.room.util.TableInfo.Column("mac", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap31.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap31.put("pressure", new androidx.room.util.TableInfo.Column("pressure", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap31.put("timestamp", new androidx.room.util.TableInfo.Column("timestamp", "INTEGER", true, 2, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo31 = new androidx.room.util.TableInfo("pressure_manual", hashMap31, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read31 = androidx.room.util.TableInfo.read(_db, "pressure_manual");
                if (!tableInfo31.equals(read31)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "pressure_manual(com.qcwireless.qcwatch.ui.base.repository.entity.PressureManualEntity).\n Expected:\n" + tableInfo31 + "\n Found:\n" + read31);
                }
                java.util.HashMap hashMap32 = new java.util.HashMap(4);
                hashMap32.put("mac", new androidx.room.util.TableInfo.Column("mac", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap32.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap32.put("timestamp", new androidx.room.util.TableInfo.Column("timestamp", "INTEGER", true, 2, (java.lang.String) null, 1));
                hashMap32.put("heart", new androidx.room.util.TableInfo.Column("heart", "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo32 = new androidx.room.util.TableInfo("app_heart", hashMap32, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read32 = androidx.room.util.TableInfo.read(_db, "app_heart");
                if (!tableInfo32.equals(read32)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "app_heart(com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity).\n Expected:\n" + tableInfo32 + "\n Found:\n" + read32);
                }
                java.util.HashMap hashMap33 = new java.util.HashMap(4);
                hashMap33.put("mac", new androidx.room.util.TableInfo.Column("mac", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap33.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap33.put("timestamp", new androidx.room.util.TableInfo.Column("timestamp", "INTEGER", true, 2, (java.lang.String) null, 1));
                hashMap33.put(com.google.android.gms.fitness.data.Field.NUTRIENT_SUGAR, new androidx.room.util.TableInfo.Column(com.google.android.gms.fitness.data.Field.NUTRIENT_SUGAR, "INTEGER", true, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo33 = new androidx.room.util.TableInfo("app_sugar", hashMap33, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read33 = androidx.room.util.TableInfo.read(_db, "app_sugar");
                if (!tableInfo33.equals(read33)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "app_sugar(com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity).\n Expected:\n" + tableInfo33 + "\n Found:\n" + read33);
                }
                java.util.HashMap hashMap34 = new java.util.HashMap(6);
                hashMap34.put("mac", new androidx.room.util.TableInfo.Column("mac", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap34.put("date_str", new androidx.room.util.TableInfo.Column("date_str", "TEXT", true, 2, (java.lang.String) null, 1));
                hashMap34.put("timestamp", new androidx.room.util.TableInfo.Column("timestamp", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap34.put("min_sugar", new androidx.room.util.TableInfo.Column("min_sugar", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap34.put("max_sugar", new androidx.room.util.TableInfo.Column("max_sugar", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap34.put("hour", new androidx.room.util.TableInfo.Column("hour", "INTEGER", true, 3, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo34 = new androidx.room.util.TableInfo("app_continuous_sugar", hashMap34, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read34 = androidx.room.util.TableInfo.read(_db, "app_continuous_sugar");
                if (!tableInfo34.equals(read34)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "app_continuous_sugar(com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity).\n Expected:\n" + tableInfo34 + "\n Found:\n" + read34);
                }
                return new androidx.room.RoomOpenHelper.ValidationResult(true, (java.lang.String) null);
            }
        }, "38fce734638e5c1cd5b20cf14cf9683a", "5fee856e6b9275dc4575119370f22772")).build());
    }

    protected androidx.room.InvalidationTracker createInvalidationTracker() {
        return new androidx.room.InvalidationTracker(this, new java.util.HashMap(0), new java.util.HashMap(0), new java.lang.String[]{"user", "device_setting", "step_detail", "sleep_detail", "step_total", "sleep_total", "heart_rate_detail", "sport_plus_detail", "watch_face", "menstruation", "message_push", "sync_entity", "gps_detail", "blood_pressure", "blood_oxygen", "feedback", "custom_face", "temperature_entity", "sleep_new_protocol", "contact_entity", "manual_heart_entity", "pay_watch_face", "watch_face_index", "music_to_device", "song_menu", "ebook_entity", "blood_sugar", "target_entity", "pressure_detail", "blood_oxygen_manual", "pressure_manual", "app_heart", "app_sugar", "app_continuous_sugar"});
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        androidx.sqlite.db.SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `user`");
            writableDatabase.execSQL("DELETE FROM `device_setting`");
            writableDatabase.execSQL("DELETE FROM `step_detail`");
            writableDatabase.execSQL("DELETE FROM `sleep_detail`");
            writableDatabase.execSQL("DELETE FROM `step_total`");
            writableDatabase.execSQL("DELETE FROM `sleep_total`");
            writableDatabase.execSQL("DELETE FROM `heart_rate_detail`");
            writableDatabase.execSQL("DELETE FROM `sport_plus_detail`");
            writableDatabase.execSQL("DELETE FROM `watch_face`");
            writableDatabase.execSQL("DELETE FROM `menstruation`");
            writableDatabase.execSQL("DELETE FROM `message_push`");
            writableDatabase.execSQL("DELETE FROM `sync_entity`");
            writableDatabase.execSQL("DELETE FROM `gps_detail`");
            writableDatabase.execSQL("DELETE FROM `blood_pressure`");
            writableDatabase.execSQL("DELETE FROM `blood_oxygen`");
            writableDatabase.execSQL("DELETE FROM `feedback`");
            writableDatabase.execSQL("DELETE FROM `custom_face`");
            writableDatabase.execSQL("DELETE FROM `temperature_entity`");
            writableDatabase.execSQL("DELETE FROM `sleep_new_protocol`");
            writableDatabase.execSQL("DELETE FROM `contact_entity`");
            writableDatabase.execSQL("DELETE FROM `manual_heart_entity`");
            writableDatabase.execSQL("DELETE FROM `pay_watch_face`");
            writableDatabase.execSQL("DELETE FROM `watch_face_index`");
            writableDatabase.execSQL("DELETE FROM `music_to_device`");
            writableDatabase.execSQL("DELETE FROM `song_menu`");
            writableDatabase.execSQL("DELETE FROM `ebook_entity`");
            writableDatabase.execSQL("DELETE FROM `blood_sugar`");
            writableDatabase.execSQL("DELETE FROM `target_entity`");
            writableDatabase.execSQL("DELETE FROM `pressure_detail`");
            writableDatabase.execSQL("DELETE FROM `blood_oxygen_manual`");
            writableDatabase.execSQL("DELETE FROM `pressure_manual`");
            writableDatabase.execSQL("DELETE FROM `app_heart`");
            writableDatabase.execSQL("DELETE FROM `app_sugar`");
            writableDatabase.execSQL("DELETE FROM `app_continuous_sugar`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    protected java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> getRequiredTypeConverters() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcStepTotalDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcStepTotalDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepTotalDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepTotalDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcHeartRateDetailDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcHeartRateDetailDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcGpsDetailDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcGpsDetailDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodPressureDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodPressureDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodOxygenDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodOxygenDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcFeedbackDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcFeedbackDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcCustomFaceDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcCustomFaceDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcContactsDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcContactsDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcManualHeartDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcManualHeartDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceIndexDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceIndexDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcEbookDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcEbookDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodSugarDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodSugarDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcTargetDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcTargetDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcPressureDetailDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcPressureDetailDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.ManualPressureDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.ManualPressureDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualHeartDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualHeartDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarDao_Impl.getRequiredConverters());
        hashMap.put(com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao.class, com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao_Impl.getRequiredConverters());
        return hashMap;
    }

    public java.util.Set<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new java.util.HashSet();
    }

    public java.util.List<androidx.room.migration.Migration> getAutoMigrations(java.util.Map<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>, androidx.room.migration.AutoMigrationSpec> autoMigrationSpecsMap) {
        return java.util.Arrays.asList(new androidx.room.migration.Migration[0]);
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao qcUserDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao qcUserDao;
        if (this._qcUserDao != null) {
            return this._qcUserDao;
        }
        synchronized (this) {
            if (this._qcUserDao == null) {
                this._qcUserDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao_Impl(this);
            }
            qcUserDao = this._qcUserDao;
        }
        return qcUserDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao qcDeviceSettingDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao qcDeviceSettingDao;
        if (this._qcDeviceSettingDao != null) {
            return this._qcDeviceSettingDao;
        }
        synchronized (this) {
            if (this._qcDeviceSettingDao == null) {
                this._qcDeviceSettingDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao_Impl(this);
            }
            qcDeviceSettingDao = this._qcDeviceSettingDao;
        }
        return qcDeviceSettingDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao qcStepDetailDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao qcStepDetailDao;
        if (this._qcStepDetailDao != null) {
            return this._qcStepDetailDao;
        }
        synchronized (this) {
            if (this._qcStepDetailDao == null) {
                this._qcStepDetailDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao_Impl(this);
            }
            qcStepDetailDao = this._qcStepDetailDao;
        }
        return qcStepDetailDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao qcSleepDetailDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao qcSleepDetailDao;
        if (this._qcSleepDetailDao != null) {
            return this._qcSleepDetailDao;
        }
        synchronized (this) {
            if (this._qcSleepDetailDao == null) {
                this._qcSleepDetailDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao_Impl(this);
            }
            qcSleepDetailDao = this._qcSleepDetailDao;
        }
        return qcSleepDetailDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcStepTotalDao qcStepTotalDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcStepTotalDao qcStepTotalDao;
        if (this._qcStepTotalDao != null) {
            return this._qcStepTotalDao;
        }
        synchronized (this) {
            if (this._qcStepTotalDao == null) {
                this._qcStepTotalDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcStepTotalDao_Impl(this);
            }
            qcStepTotalDao = this._qcStepTotalDao;
        }
        return qcStepTotalDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepTotalDao qcSleepTotalDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepTotalDao qcSleepTotalDao;
        if (this._qcSleepTotalDao != null) {
            return this._qcSleepTotalDao;
        }
        synchronized (this) {
            if (this._qcSleepTotalDao == null) {
                this._qcSleepTotalDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepTotalDao_Impl(this);
            }
            qcSleepTotalDao = this._qcSleepTotalDao;
        }
        return qcSleepTotalDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcHeartRateDetailDao qcHeartRateDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcHeartRateDetailDao qcHeartRateDetailDao;
        if (this._qcHeartRateDetailDao != null) {
            return this._qcHeartRateDetailDao;
        }
        synchronized (this) {
            if (this._qcHeartRateDetailDao == null) {
                this._qcHeartRateDetailDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcHeartRateDetailDao_Impl(this);
            }
            qcHeartRateDetailDao = this._qcHeartRateDetailDao;
        }
        return qcHeartRateDetailDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao qcSportPlusDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao qcSportPlusDetailDao;
        if (this._qcSportPlusDetailDao != null) {
            return this._qcSportPlusDetailDao;
        }
        synchronized (this) {
            if (this._qcSportPlusDetailDao == null) {
                this._qcSportPlusDetailDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao_Impl(this);
            }
            qcSportPlusDetailDao = this._qcSportPlusDetailDao;
        }
        return qcSportPlusDetailDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao qcWatchFaceDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao qcWatchFaceDao;
        if (this._qcWatchFaceDao != null) {
            return this._qcWatchFaceDao;
        }
        synchronized (this) {
            if (this._qcWatchFaceDao == null) {
                this._qcWatchFaceDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao_Impl(this);
            }
            qcWatchFaceDao = this._qcWatchFaceDao;
        }
        return qcWatchFaceDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao qcMenstruationDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao qcMenstruationDao;
        if (this._qcMenstruationDao != null) {
            return this._qcMenstruationDao;
        }
        synchronized (this) {
            if (this._qcMenstruationDao == null) {
                this._qcMenstruationDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao_Impl(this);
            }
            qcMenstruationDao = this._qcMenstruationDao;
        }
        return qcMenstruationDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
        if (this._qcMessagePushDao != null) {
            return this._qcMessagePushDao;
        }
        synchronized (this) {
            if (this._qcMessagePushDao == null) {
                this._qcMessagePushDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao_Impl(this);
            }
            qcMessagePushDao = this._qcMessagePushDao;
        }
        return qcMessagePushDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao qcSyncDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao qcSyncDao;
        if (this._qcSyncDao != null) {
            return this._qcSyncDao;
        }
        synchronized (this) {
            if (this._qcSyncDao == null) {
                this._qcSyncDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao_Impl(this);
            }
            qcSyncDao = this._qcSyncDao;
        }
        return qcSyncDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcGpsDetailDao qcGpsDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcGpsDetailDao qcGpsDetailDao;
        if (this._qcGpsDetailDao != null) {
            return this._qcGpsDetailDao;
        }
        synchronized (this) {
            if (this._qcGpsDetailDao == null) {
                this._qcGpsDetailDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcGpsDetailDao_Impl(this);
            }
            qcGpsDetailDao = this._qcGpsDetailDao;
        }
        return qcGpsDetailDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodPressureDao qcBloodPressureDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodPressureDao qcBloodPressureDao;
        if (this._qcBloodPressureDao != null) {
            return this._qcBloodPressureDao;
        }
        synchronized (this) {
            if (this._qcBloodPressureDao == null) {
                this._qcBloodPressureDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodPressureDao_Impl(this);
            }
            qcBloodPressureDao = this._qcBloodPressureDao;
        }
        return qcBloodPressureDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodOxygenDao qcBloodOxygenDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodOxygenDao qcBloodOxygenDao;
        if (this._qcBloodOxygenDao != null) {
            return this._qcBloodOxygenDao;
        }
        synchronized (this) {
            if (this._qcBloodOxygenDao == null) {
                this._qcBloodOxygenDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodOxygenDao_Impl(this);
            }
            qcBloodOxygenDao = this._qcBloodOxygenDao;
        }
        return qcBloodOxygenDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcFeedbackDao qcFeedbackDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcFeedbackDao qcFeedbackDao;
        if (this._qcFeedbackDao != null) {
            return this._qcFeedbackDao;
        }
        synchronized (this) {
            if (this._qcFeedbackDao == null) {
                this._qcFeedbackDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcFeedbackDao_Impl(this);
            }
            qcFeedbackDao = this._qcFeedbackDao;
        }
        return qcFeedbackDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcCustomFaceDao qcCustomFaceDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcCustomFaceDao qcCustomFaceDao;
        if (this._qcCustomFaceDao != null) {
            return this._qcCustomFaceDao;
        }
        synchronized (this) {
            if (this._qcCustomFaceDao == null) {
                this._qcCustomFaceDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcCustomFaceDao_Impl(this);
            }
            qcCustomFaceDao = this._qcCustomFaceDao;
        }
        return qcCustomFaceDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao qcTemperatureDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao qcTemperatureDao;
        if (this._qcTemperatureDao != null) {
            return this._qcTemperatureDao;
        }
        synchronized (this) {
            if (this._qcTemperatureDao == null) {
                this._qcTemperatureDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao_Impl(this);
            }
            qcTemperatureDao = this._qcTemperatureDao;
        }
        return qcTemperatureDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao qcSleepNewProtocolDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao qcSleepNewProtocolDao;
        if (this._qcSleepNewProtocolDao != null) {
            return this._qcSleepNewProtocolDao;
        }
        synchronized (this) {
            if (this._qcSleepNewProtocolDao == null) {
                this._qcSleepNewProtocolDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao_Impl(this);
            }
            qcSleepNewProtocolDao = this._qcSleepNewProtocolDao;
        }
        return qcSleepNewProtocolDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcContactsDao qcContactDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcContactsDao qcContactsDao;
        if (this._qcContactsDao != null) {
            return this._qcContactsDao;
        }
        synchronized (this) {
            if (this._qcContactsDao == null) {
                this._qcContactsDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcContactsDao_Impl(this);
            }
            qcContactsDao = this._qcContactsDao;
        }
        return qcContactsDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcManualHeartDao qcManualHeartDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcManualHeartDao qcManualHeartDao;
        if (this._qcManualHeartDao != null) {
            return this._qcManualHeartDao;
        }
        synchronized (this) {
            if (this._qcManualHeartDao == null) {
                this._qcManualHeartDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcManualHeartDao_Impl(this);
            }
            qcManualHeartDao = this._qcManualHeartDao;
        }
        return qcManualHeartDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceIndexDao qcWatchFaceIndexDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceIndexDao qcWatchFaceIndexDao;
        if (this._qcWatchFaceIndexDao != null) {
            return this._qcWatchFaceIndexDao;
        }
        synchronized (this) {
            if (this._qcWatchFaceIndexDao == null) {
                this._qcWatchFaceIndexDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceIndexDao_Impl(this);
            }
            qcWatchFaceIndexDao = this._qcWatchFaceIndexDao;
        }
        return qcWatchFaceIndexDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao qcMusicManagerDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao qcMusicManagerDao;
        if (this._qcMusicManagerDao != null) {
            return this._qcMusicManagerDao;
        }
        synchronized (this) {
            if (this._qcMusicManagerDao == null) {
                this._qcMusicManagerDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao_Impl(this);
            }
            qcMusicManagerDao = this._qcMusicManagerDao;
        }
        return qcMusicManagerDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao qcMusicMenuDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao qcMusicMenuDao;
        if (this._qcMusicMenuDao != null) {
            return this._qcMusicMenuDao;
        }
        synchronized (this) {
            if (this._qcMusicMenuDao == null) {
                this._qcMusicMenuDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao_Impl(this);
            }
            qcMusicMenuDao = this._qcMusicMenuDao;
        }
        return qcMusicMenuDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcEbookDao qcEbookDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcEbookDao qcEbookDao;
        if (this._qcEbookDao != null) {
            return this._qcEbookDao;
        }
        synchronized (this) {
            if (this._qcEbookDao == null) {
                this._qcEbookDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcEbookDao_Impl(this);
            }
            qcEbookDao = this._qcEbookDao;
        }
        return qcEbookDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodSugarDao qcBloodSugar() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodSugarDao qcBloodSugarDao;
        if (this._qcBloodSugarDao != null) {
            return this._qcBloodSugarDao;
        }
        synchronized (this) {
            if (this._qcBloodSugarDao == null) {
                this._qcBloodSugarDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodSugarDao_Impl(this);
            }
            qcBloodSugarDao = this._qcBloodSugarDao;
        }
        return qcBloodSugarDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcTargetDao qcTargetDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcTargetDao qcTargetDao;
        if (this._qcTargetDao != null) {
            return this._qcTargetDao;
        }
        synchronized (this) {
            if (this._qcTargetDao == null) {
                this._qcTargetDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcTargetDao_Impl(this);
            }
            qcTargetDao = this._qcTargetDao;
        }
        return qcTargetDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcPressureDetailDao qcPressureDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcPressureDetailDao qcPressureDetailDao;
        if (this._qcPressureDetailDao != null) {
            return this._qcPressureDetailDao;
        }
        synchronized (this) {
            if (this._qcPressureDetailDao == null) {
                this._qcPressureDetailDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcPressureDetailDao_Impl(this);
            }
            qcPressureDetailDao = this._qcPressureDetailDao;
        }
        return qcPressureDetailDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao manualBloodOxygenDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao manualBloodOxygenDao;
        if (this._manualBloodOxygenDao != null) {
            return this._manualBloodOxygenDao;
        }
        synchronized (this) {
            if (this._manualBloodOxygenDao == null) {
                this._manualBloodOxygenDao = new com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao_Impl(this);
            }
            manualBloodOxygenDao = this._manualBloodOxygenDao;
        }
        return manualBloodOxygenDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.ManualPressureDao manualPressureDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.ManualPressureDao manualPressureDao;
        if (this._manualPressureDao != null) {
            return this._manualPressureDao;
        }
        synchronized (this) {
            if (this._manualPressureDao == null) {
                this._manualPressureDao = new com.qcwireless.qcwatch.ui.base.repository.dao.ManualPressureDao_Impl(this);
            }
            manualPressureDao = this._manualPressureDao;
        }
        return manualPressureDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualHeartDao qcAppManualHeartDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualHeartDao qcAppManualHeartDao;
        if (this._qcAppManualHeartDao != null) {
            return this._qcAppManualHeartDao;
        }
        synchronized (this) {
            if (this._qcAppManualHeartDao == null) {
                this._qcAppManualHeartDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualHeartDao_Impl(this);
            }
            qcAppManualHeartDao = this._qcAppManualHeartDao;
        }
        return qcAppManualHeartDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarDao qcAppManualSugarDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarDao qcAppManualSugarDao;
        if (this._qcAppManualSugarDao != null) {
            return this._qcAppManualSugarDao;
        }
        synchronized (this) {
            if (this._qcAppManualSugarDao == null) {
                this._qcAppManualSugarDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarDao_Impl(this);
            }
            qcAppManualSugarDao = this._qcAppManualSugarDao;
        }
        return qcAppManualSugarDao;
    }

    @Override // com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase
    public com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao qcAppManualSugarContinuousDao() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao qcAppManualSugarContinuousDao;
        if (this._qcAppManualSugarContinuousDao != null) {
            return this._qcAppManualSugarContinuousDao;
        }
        synchronized (this) {
            if (this._qcAppManualSugarContinuousDao == null) {
                this._qcAppManualSugarContinuousDao = new com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao_Impl(this);
            }
            qcAppManualSugarContinuousDao = this._qcAppManualSugarContinuousDao;
        }
        return qcAppManualSugarContinuousDao;
    }
}
