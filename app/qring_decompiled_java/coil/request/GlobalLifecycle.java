package coil.request;

/* compiled from: GlobalLifecycle.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcoil/request/GlobalLifecycle;", "Landroidx/lifecycle/Lifecycle;", "()V", "owner", "Landroidx/lifecycle/LifecycleOwner;", "addObserver", "", "observer", "Landroidx/lifecycle/LifecycleObserver;", "getCurrentState", "Landroidx/lifecycle/Lifecycle$State;", "removeObserver", "toString", "", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GlobalLifecycle extends androidx.lifecycle.Lifecycle {
    public static final coil.request.GlobalLifecycle INSTANCE = new coil.request.GlobalLifecycle();
    private static final androidx.lifecycle.LifecycleOwner owner = new androidx.lifecycle.LifecycleOwner() { // from class: coil.request.GlobalLifecycle$$ExternalSyntheticLambda0
        @Override // androidx.lifecycle.LifecycleOwner
        public final androidx.lifecycle.Lifecycle getLifecycle() {
            androidx.lifecycle.Lifecycle m180owner$lambda0;
            m180owner$lambda0 = coil.request.GlobalLifecycle.m180owner$lambda0();
            return m180owner$lambda0;
        }
    };

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(androidx.lifecycle.LifecycleObserver observer) {
    }

    public java.lang.String toString() {
        return "coil.request.GlobalLifecycle";
    }

    private GlobalLifecycle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: owner$lambda-0, reason: not valid java name */
    public static final androidx.lifecycle.Lifecycle m180owner$lambda0() {
        return INSTANCE;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(androidx.lifecycle.LifecycleObserver observer) {
        if (!(observer instanceof androidx.lifecycle.DefaultLifecycleObserver)) {
            throw new java.lang.IllegalArgumentException((observer + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        androidx.lifecycle.DefaultLifecycleObserver defaultLifecycleObserver = (androidx.lifecycle.DefaultLifecycleObserver) observer;
        androidx.lifecycle.LifecycleOwner lifecycleOwner = owner;
        defaultLifecycleObserver.onCreate(lifecycleOwner);
        defaultLifecycleObserver.onStart(lifecycleOwner);
        defaultLifecycleObserver.onResume(lifecycleOwner);
    }

    @Override // androidx.lifecycle.Lifecycle
    public androidx.lifecycle.Lifecycle.State getCurrentState() {
        return androidx.lifecycle.Lifecycle.State.RESUMED;
    }
}
