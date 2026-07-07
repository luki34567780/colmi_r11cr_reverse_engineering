package androidx.lifecycle;

/* loaded from: classes.dex */
public class LifecycleService extends android.app.Service implements androidx.lifecycle.LifecycleOwner {
    private final androidx.lifecycle.ServiceLifecycleDispatcher mDispatcher = new androidx.lifecycle.ServiceLifecycleDispatcher(this);

    @Override // android.app.Service
    public void onCreate() {
        this.mDispatcher.onServicePreSuperOnCreate();
        super.onCreate();
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        this.mDispatcher.onServicePreSuperOnBind();
        return null;
    }

    @Override // android.app.Service
    public void onStart(android.content.Intent intent, int i) {
        this.mDispatcher.onServicePreSuperOnStart();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.mDispatcher.onServicePreSuperOnDestroy();
        super.onDestroy();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
        return this.mDispatcher.getLifecycle();
    }
}
