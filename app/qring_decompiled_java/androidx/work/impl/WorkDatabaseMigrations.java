package androidx.work.impl;

/* loaded from: classes.dex */
public class WorkDatabaseMigrations {
    private static final java.lang.String CREATE_INDEX_PERIOD_START_TIME = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)";
    private static final java.lang.String CREATE_OUT_OF_QUOTA_POLICY = "ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0";
    private static final java.lang.String CREATE_PREFERENCE = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))";
    private static final java.lang.String CREATE_RUN_IN_FOREGROUND = "ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0";
    private static final java.lang.String CREATE_SYSTEM_ID_INFO = "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";
    private static final java.lang.String CREATE_WORK_PROGRESS = "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";
    public static final java.lang.String INSERT_PREFERENCE = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";
    private static final java.lang.String MIGRATE_ALARM_INFO_TO_SYSTEM_ID_INFO = "INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo";
    public static androidx.room.migration.Migration MIGRATION_3_4 = null;
    public static androidx.room.migration.Migration MIGRATION_4_5 = null;
    public static androidx.room.migration.Migration MIGRATION_6_7 = null;
    public static androidx.room.migration.Migration MIGRATION_7_8 = null;
    public static androidx.room.migration.Migration MIGRATION_8_9 = null;
    private static final java.lang.String PERIODIC_WORK_SET_SCHEDULE_REQUESTED_AT = "UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0";
    private static final java.lang.String REMOVE_ALARM_INFO = "DROP TABLE IF EXISTS alarmInfo";
    public static final int VERSION_1 = 1;
    public static final int VERSION_10 = 10;
    public static final int VERSION_11 = 11;
    public static final int VERSION_12 = 12;
    public static final int VERSION_2 = 2;
    public static final int VERSION_3 = 3;
    public static final int VERSION_4 = 4;
    public static final int VERSION_5 = 5;
    public static final int VERSION_6 = 6;
    public static final int VERSION_7 = 7;
    public static final int VERSION_8 = 8;
    public static final int VERSION_9 = 9;
    private static final java.lang.String WORKSPEC_ADD_TRIGGER_MAX_CONTENT_DELAY = "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1";
    private static final java.lang.String WORKSPEC_ADD_TRIGGER_UPDATE_DELAY = "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1";
    public static androidx.room.migration.Migration MIGRATION_1_2 = new androidx.room.migration.Migration(1, 2) { // from class: androidx.work.impl.WorkDatabaseMigrations.1
        @Override // androidx.room.migration.Migration
        public void migrate(androidx.sqlite.db.SupportSQLiteDatabase database) {
            database.execSQL(androidx.work.impl.WorkDatabaseMigrations.CREATE_SYSTEM_ID_INFO);
            database.execSQL(androidx.work.impl.WorkDatabaseMigrations.MIGRATE_ALARM_INFO_TO_SYSTEM_ID_INFO);
            database.execSQL(androidx.work.impl.WorkDatabaseMigrations.REMOVE_ALARM_INFO);
            database.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    };
    public static androidx.room.migration.Migration MIGRATION_11_12 = new androidx.room.migration.Migration(11, 12) { // from class: androidx.work.impl.WorkDatabaseMigrations.7
        @Override // androidx.room.migration.Migration
        public void migrate(androidx.sqlite.db.SupportSQLiteDatabase database) {
            database.execSQL(androidx.work.impl.WorkDatabaseMigrations.CREATE_OUT_OF_QUOTA_POLICY);
        }
    };

    private WorkDatabaseMigrations() {
    }

    static {
        int i = 4;
        MIGRATION_3_4 = new androidx.room.migration.Migration(3, i) { // from class: androidx.work.impl.WorkDatabaseMigrations.2
            @Override // androidx.room.migration.Migration
            public void migrate(androidx.sqlite.db.SupportSQLiteDatabase database) {
                if (android.os.Build.VERSION.SDK_INT >= 23) {
                    database.execSQL(androidx.work.impl.WorkDatabaseMigrations.PERIODIC_WORK_SET_SCHEDULE_REQUESTED_AT);
                }
            }
        };
        MIGRATION_4_5 = new androidx.room.migration.Migration(i, 5) { // from class: androidx.work.impl.WorkDatabaseMigrations.3
            @Override // androidx.room.migration.Migration
            public void migrate(androidx.sqlite.db.SupportSQLiteDatabase database) {
                database.execSQL(androidx.work.impl.WorkDatabaseMigrations.WORKSPEC_ADD_TRIGGER_UPDATE_DELAY);
                database.execSQL(androidx.work.impl.WorkDatabaseMigrations.WORKSPEC_ADD_TRIGGER_MAX_CONTENT_DELAY);
            }
        };
        int i2 = 7;
        MIGRATION_6_7 = new androidx.room.migration.Migration(6, i2) { // from class: androidx.work.impl.WorkDatabaseMigrations.4
            @Override // androidx.room.migration.Migration
            public void migrate(androidx.sqlite.db.SupportSQLiteDatabase database) {
                database.execSQL(androidx.work.impl.WorkDatabaseMigrations.CREATE_WORK_PROGRESS);
            }
        };
        int i3 = 8;
        MIGRATION_7_8 = new androidx.room.migration.Migration(i2, i3) { // from class: androidx.work.impl.WorkDatabaseMigrations.5
            @Override // androidx.room.migration.Migration
            public void migrate(androidx.sqlite.db.SupportSQLiteDatabase database) {
                database.execSQL(androidx.work.impl.WorkDatabaseMigrations.CREATE_INDEX_PERIOD_START_TIME);
            }
        };
        MIGRATION_8_9 = new androidx.room.migration.Migration(i3, 9) { // from class: androidx.work.impl.WorkDatabaseMigrations.6
            @Override // androidx.room.migration.Migration
            public void migrate(androidx.sqlite.db.SupportSQLiteDatabase database) {
                database.execSQL(androidx.work.impl.WorkDatabaseMigrations.CREATE_RUN_IN_FOREGROUND);
            }
        };
    }

    public static class RescheduleMigration extends androidx.room.migration.Migration {
        final android.content.Context mContext;

        public RescheduleMigration(android.content.Context context, int startVersion, int endVersion) {
            super(startVersion, endVersion);
            this.mContext = context;
        }

        @Override // androidx.room.migration.Migration
        public void migrate(androidx.sqlite.db.SupportSQLiteDatabase database) {
            if (this.endVersion >= 10) {
                database.execSQL(androidx.work.impl.WorkDatabaseMigrations.INSERT_PREFERENCE, new java.lang.Object[]{androidx.work.impl.utils.PreferenceUtils.KEY_RESCHEDULE_NEEDED, 1});
            } else {
                this.mContext.getSharedPreferences(androidx.work.impl.utils.PreferenceUtils.PREFERENCES_FILE_NAME, 0).edit().putBoolean(androidx.work.impl.utils.PreferenceUtils.KEY_RESCHEDULE_NEEDED, true).apply();
            }
        }
    }

    public static class WorkMigration9To10 extends androidx.room.migration.Migration {
        final android.content.Context mContext;

        public WorkMigration9To10(android.content.Context context) {
            super(9, 10);
            this.mContext = context;
        }

        @Override // androidx.room.migration.Migration
        public void migrate(androidx.sqlite.db.SupportSQLiteDatabase database) {
            database.execSQL(androidx.work.impl.WorkDatabaseMigrations.CREATE_PREFERENCE);
            androidx.work.impl.utils.PreferenceUtils.migrateLegacyPreferences(this.mContext, database);
            androidx.work.impl.utils.IdGenerator.migrateLegacyIdGenerator(this.mContext, database);
        }
    }
}
