package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class PreferenceUtils {
    public static final java.lang.String KEY_LAST_CANCEL_ALL_TIME_MS = "last_cancel_all_time_ms";
    public static final java.lang.String KEY_RESCHEDULE_NEEDED = "reschedule_needed";
    public static final java.lang.String PREFERENCES_FILE_NAME = "androidx.work.util.preferences";
    private final androidx.work.impl.WorkDatabase mWorkDatabase;

    public PreferenceUtils(androidx.work.impl.WorkDatabase workDatabase) {
        this.mWorkDatabase = workDatabase;
    }

    public long getLastCancelAllTimeMillis() {
        java.lang.Long longValue = this.mWorkDatabase.preferenceDao().getLongValue(KEY_LAST_CANCEL_ALL_TIME_MS);
        if (longValue != null) {
            return longValue.longValue();
        }
        return 0L;
    }

    public androidx.lifecycle.LiveData<java.lang.Long> getLastCancelAllTimeMillisLiveData() {
        return androidx.lifecycle.Transformations.map(this.mWorkDatabase.preferenceDao().getObservableLongValue(KEY_LAST_CANCEL_ALL_TIME_MS), new androidx.arch.core.util.Function<java.lang.Long, java.lang.Long>() { // from class: androidx.work.impl.utils.PreferenceUtils.1
            @Override // androidx.arch.core.util.Function
            public java.lang.Long apply(java.lang.Long value) {
                return java.lang.Long.valueOf(value != null ? value.longValue() : 0L);
            }
        });
    }

    public void setLastCancelAllTimeMillis(final long timeMillis) {
        this.mWorkDatabase.preferenceDao().insertPreference(new androidx.work.impl.model.Preference(KEY_LAST_CANCEL_ALL_TIME_MS, timeMillis));
    }

    public boolean getNeedsReschedule() {
        java.lang.Long longValue = this.mWorkDatabase.preferenceDao().getLongValue(KEY_RESCHEDULE_NEEDED);
        return longValue != null && longValue.longValue() == 1;
    }

    public void setNeedsReschedule(boolean needsReschedule) {
        this.mWorkDatabase.preferenceDao().insertPreference(new androidx.work.impl.model.Preference(KEY_RESCHEDULE_NEEDED, needsReschedule));
    }

    public static void migrateLegacyPreferences(android.content.Context context, androidx.sqlite.db.SupportSQLiteDatabase sqLiteDatabase) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0);
        if (sharedPreferences.contains(KEY_RESCHEDULE_NEEDED) || sharedPreferences.contains(KEY_LAST_CANCEL_ALL_TIME_MS)) {
            long j = sharedPreferences.getLong(KEY_LAST_CANCEL_ALL_TIME_MS, 0L);
            long j2 = sharedPreferences.getBoolean(KEY_RESCHEDULE_NEEDED, false) ? 1L : 0L;
            sqLiteDatabase.beginTransaction();
            try {
                sqLiteDatabase.execSQL(androidx.work.impl.WorkDatabaseMigrations.INSERT_PREFERENCE, new java.lang.Object[]{KEY_LAST_CANCEL_ALL_TIME_MS, java.lang.Long.valueOf(j)});
                sqLiteDatabase.execSQL(androidx.work.impl.WorkDatabaseMigrations.INSERT_PREFERENCE, new java.lang.Object[]{KEY_RESCHEDULE_NEEDED, java.lang.Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.setTransactionSuccessful();
            } finally {
                sqLiteDatabase.endTransaction();
            }
        }
    }
}
