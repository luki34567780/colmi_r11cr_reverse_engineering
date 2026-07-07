package io.reactivex.android.schedulers;

/* loaded from: classes3.dex */
public final class AndroidSchedulers {
    private static final io.reactivex.Scheduler MAIN_THREAD = io.reactivex.android.plugins.RxAndroidPlugins.initMainThreadScheduler(new java.util.concurrent.Callable<io.reactivex.Scheduler>() { // from class: io.reactivex.android.schedulers.AndroidSchedulers.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public io.reactivex.Scheduler call() throws java.lang.Exception {
            return io.reactivex.android.schedulers.AndroidSchedulers.MainHolder.DEFAULT;
        }
    });

    private static final class MainHolder {
        static final io.reactivex.Scheduler DEFAULT = new io.reactivex.android.schedulers.HandlerScheduler(new android.os.Handler(android.os.Looper.getMainLooper()), false);

        private MainHolder() {
        }
    }

    public static io.reactivex.Scheduler mainThread() {
        return io.reactivex.android.plugins.RxAndroidPlugins.onMainThreadScheduler(MAIN_THREAD);
    }

    public static io.reactivex.Scheduler from(android.os.Looper looper) {
        return from(looper, false);
    }

    public static io.reactivex.Scheduler from(android.os.Looper looper, boolean z) {
        java.util.Objects.requireNonNull(looper, "looper == null");
        if (android.os.Build.VERSION.SDK_INT < 16) {
            z = false;
        } else if (z && android.os.Build.VERSION.SDK_INT < 22) {
            android.os.Message obtain = android.os.Message.obtain();
            try {
                obtain.setAsynchronous(true);
            } catch (java.lang.NoSuchMethodError unused) {
                z = false;
            }
            obtain.recycle();
        }
        return new io.reactivex.android.schedulers.HandlerScheduler(new android.os.Handler(looper), z);
    }

    private AndroidSchedulers() {
        throw new java.lang.AssertionError("No instances.");
    }
}
