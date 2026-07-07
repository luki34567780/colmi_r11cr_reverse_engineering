package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class IdGenerator {
    public static final int INITIAL_ID = 0;
    public static final java.lang.String NEXT_ALARM_MANAGER_ID_KEY = "next_alarm_manager_id";
    public static final java.lang.String NEXT_JOB_SCHEDULER_ID_KEY = "next_job_scheduler_id";
    public static final java.lang.String PREFERENCE_FILE_KEY = "androidx.work.util.id";
    private final androidx.work.impl.WorkDatabase mWorkDatabase;

    public IdGenerator(androidx.work.impl.WorkDatabase workDatabase) {
        this.mWorkDatabase = workDatabase;
    }

    public int nextJobSchedulerIdWithRange(int minInclusive, int maxInclusive) {
        synchronized (androidx.work.impl.utils.IdGenerator.class) {
            int nextId = nextId(NEXT_JOB_SCHEDULER_ID_KEY);
            if (nextId >= minInclusive && nextId <= maxInclusive) {
                minInclusive = nextId;
            }
            update(NEXT_JOB_SCHEDULER_ID_KEY, minInclusive + 1);
        }
        return minInclusive;
    }

    public int nextAlarmManagerId() {
        int nextId;
        synchronized (androidx.work.impl.utils.IdGenerator.class) {
            nextId = nextId(NEXT_ALARM_MANAGER_ID_KEY);
        }
        return nextId;
    }

    private int nextId(java.lang.String key) {
        this.mWorkDatabase.beginTransaction();
        try {
            java.lang.Long longValue = this.mWorkDatabase.preferenceDao().getLongValue(key);
            int i = 0;
            int intValue = longValue != null ? longValue.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            update(key, i);
            this.mWorkDatabase.setTransactionSuccessful();
            return intValue;
        } finally {
            this.mWorkDatabase.endTransaction();
        }
    }

    private void update(java.lang.String key, int value) {
        this.mWorkDatabase.preferenceDao().insertPreference(new androidx.work.impl.model.Preference(key, value));
    }

    public static void migrateLegacyIdGenerator(android.content.Context context, androidx.sqlite.db.SupportSQLiteDatabase sqLiteDatabase) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCE_FILE_KEY, 0);
        if (sharedPreferences.contains(NEXT_JOB_SCHEDULER_ID_KEY) || sharedPreferences.contains(NEXT_JOB_SCHEDULER_ID_KEY)) {
            int i = sharedPreferences.getInt(NEXT_JOB_SCHEDULER_ID_KEY, 0);
            int i2 = sharedPreferences.getInt(NEXT_ALARM_MANAGER_ID_KEY, 0);
            sqLiteDatabase.beginTransaction();
            try {
                sqLiteDatabase.execSQL(androidx.work.impl.WorkDatabaseMigrations.INSERT_PREFERENCE, new java.lang.Object[]{NEXT_JOB_SCHEDULER_ID_KEY, java.lang.Integer.valueOf(i)});
                sqLiteDatabase.execSQL(androidx.work.impl.WorkDatabaseMigrations.INSERT_PREFERENCE, new java.lang.Object[]{NEXT_ALARM_MANAGER_ID_KEY, java.lang.Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.setTransactionSuccessful();
            } finally {
                sqLiteDatabase.endTransaction();
            }
        }
    }
}
