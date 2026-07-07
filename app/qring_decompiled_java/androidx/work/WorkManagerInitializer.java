package androidx.work;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements androidx.startup.Initializer<androidx.work.WorkManager> {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("WrkMgrInitializer");

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public androidx.work.WorkManager create(android.content.Context context) {
        androidx.work.Logger.get().debug(TAG, "Initializing WorkManager with default configuration.", new java.lang.Throwable[0]);
        androidx.work.WorkManager.initialize(context, new androidx.work.Configuration.Builder().build());
        return androidx.work.WorkManager.getInstance(context);
    }

    @Override // androidx.startup.Initializer
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return java.util.Collections.emptyList();
    }
}
