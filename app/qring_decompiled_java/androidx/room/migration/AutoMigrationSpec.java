package androidx.room.migration;

/* loaded from: classes.dex */
public interface AutoMigrationSpec {

    /* renamed from: androidx.room.migration.AutoMigrationSpec$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onPostMigrate(androidx.room.migration.AutoMigrationSpec _this, androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        }
    }

    void onPostMigrate(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase);
}
