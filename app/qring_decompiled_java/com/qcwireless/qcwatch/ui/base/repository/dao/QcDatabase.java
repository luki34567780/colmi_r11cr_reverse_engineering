package com.qcwireless.qcwatch.ui.base.repository.dao;

/* compiled from: QcDatabase.kt */
@kotlin.Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 E2\u00020\u0001:\u0001EB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020\"H&J\b\u0010#\u001a\u00020$H&J\b\u0010%\u001a\u00020&H&J\b\u0010'\u001a\u00020(H&J\b\u0010)\u001a\u00020*H&J\b\u0010+\u001a\u00020,H&J\b\u0010-\u001a\u00020.H&J\b\u0010/\u001a\u000200H&J\b\u00101\u001a\u000202H&J\b\u00103\u001a\u000204H&J\b\u00105\u001a\u000206H&J\b\u00107\u001a\u000208H&J\b\u00109\u001a\u00020:H&J\b\u0010;\u001a\u00020<H&J\b\u0010=\u001a\u00020>H&J\b\u0010?\u001a\u00020@H&J\b\u0010A\u001a\u00020BH&J\b\u0010C\u001a\u00020DH&¨\u0006F"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcDatabase;", "Landroidx/room/RoomDatabase;", "()V", "manualBloodOxygenDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/ManualBloodOxygenDao;", "manualPressureDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/ManualPressureDao;", "qcAppManualHeartDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcAppManualHeartDao;", "qcAppManualSugarContinuousDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcAppManualSugarContinuousDao;", "qcAppManualSugarDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcAppManualSugarDao;", "qcBloodOxygenDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcBloodOxygenDao;", "qcBloodPressureDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcBloodPressureDao;", "qcBloodSugar", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcBloodSugarDao;", "qcContactDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcContactsDao;", "qcCustomFaceDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcCustomFaceDao;", "qcDeviceSettingDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcDeviceSettingDao;", "qcEbookDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcEbookDao;", "qcFeedbackDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcFeedbackDao;", "qcGpsDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcGpsDetailDao;", "qcHeartRateDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcHeartRateDetailDao;", "qcManualHeartDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcManualHeartDao;", "qcMenstruationDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcMenstruationDao;", "qcMessagePushDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcMessagePushDao;", "qcMusicManagerDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcMusicManagerDao;", "qcMusicMenuDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcMusicMenuDao;", "qcPressureDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcPressureDetailDao;", "qcSleepDetailDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcSleepDetailDao;", "qcSleepNewProtocolDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcSleepNewProtocolDao;", "qcSleepTotalDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcSleepTotalDao;", "qcSportPlusDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcSportPlusDetailDao;", "qcStepDetailDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcStepDetailDao;", "qcStepTotalDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcStepTotalDao;", "qcSyncDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcSyncDao;", "qcTargetDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcTargetDao;", "qcTemperatureDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcTemperatureDao;", "qcUserDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcUserDao;", "qcWatchFaceDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcWatchFaceDao;", "qcWatchFaceIndexDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcWatchFaceIndexDao;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public abstract class QcDatabase extends androidx.room.RoomDatabase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.Companion(null);
    private static volatile com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase INSTANCE;

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao manualBloodOxygenDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.ManualPressureDao manualPressureDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualHeartDao qcAppManualHeartDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao qcAppManualSugarContinuousDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarDao qcAppManualSugarDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodOxygenDao qcBloodOxygenDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodPressureDao qcBloodPressureDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodSugarDao qcBloodSugar();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcContactsDao qcContactDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcCustomFaceDao qcCustomFaceDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao qcDeviceSettingDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcEbookDao qcEbookDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcFeedbackDao qcFeedbackDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcGpsDetailDao qcGpsDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcHeartRateDetailDao qcHeartRateDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcManualHeartDao qcManualHeartDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao qcMenstruationDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao qcMusicManagerDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao qcMusicMenuDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcPressureDetailDao qcPressureDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao qcSleepDetailDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao qcSleepNewProtocolDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepTotalDao qcSleepTotalDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao qcSportPlusDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao qcStepDetailDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcStepTotalDao qcStepTotalDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao qcSyncDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcTargetDao qcTargetDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao qcTemperatureDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao qcUserDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao qcWatchFaceDao();

    public abstract com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceIndexDao qcWatchFaceIndexDao();

    /* compiled from: QcDatabase.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase getDatabase(android.content.Context context) {
            com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase qcDatabase;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase qcDatabase2 = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE;
            if (qcDatabase2 != null) {
                return qcDatabase2;
            }
            synchronized (this) {
                androidx.room.RoomDatabase build = androidx.room.Room.databaseBuilder(context.getApplicationContext(), com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.class, "qc_database.db").fallbackToDestructiveMigration().build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "databaseBuilder(\n       …                 .build()");
                qcDatabase = (com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase) build;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.Companion companion = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE = qcDatabase;
            }
            return qcDatabase;
        }
    }
}
