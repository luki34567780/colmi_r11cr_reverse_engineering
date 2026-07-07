package androidx.lifecycle;

/* loaded from: classes.dex */
public interface DefaultLifecycleObserver extends androidx.lifecycle.FullLifecycleObserver {

    /* renamed from: androidx.lifecycle.DefaultLifecycleObserver$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onCreate(androidx.lifecycle.DefaultLifecycleObserver _this, androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        }

        public static void $default$onDestroy(androidx.lifecycle.DefaultLifecycleObserver _this, androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        }

        public static void $default$onPause(androidx.lifecycle.DefaultLifecycleObserver _this, androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        }

        public static void $default$onResume(androidx.lifecycle.DefaultLifecycleObserver _this, androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        }

        public static void $default$onStart(androidx.lifecycle.DefaultLifecycleObserver _this, androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        }

        public static void $default$onStop(androidx.lifecycle.DefaultLifecycleObserver _this, androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        }
    }

    @Override // androidx.lifecycle.FullLifecycleObserver
    void onCreate(androidx.lifecycle.LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.FullLifecycleObserver
    void onDestroy(androidx.lifecycle.LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.FullLifecycleObserver
    void onPause(androidx.lifecycle.LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.FullLifecycleObserver
    void onResume(androidx.lifecycle.LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.FullLifecycleObserver
    void onStart(androidx.lifecycle.LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.FullLifecycleObserver
    void onStop(androidx.lifecycle.LifecycleOwner lifecycleOwner);
}
