package androidx.lifecycle;

/* loaded from: classes.dex */
public class ProcessLifecycleOwner implements androidx.lifecycle.LifecycleOwner {
    static final long TIMEOUT_MS = 700;
    private static final androidx.lifecycle.ProcessLifecycleOwner sInstance = new androidx.lifecycle.ProcessLifecycleOwner();
    private android.os.Handler mHandler;
    private int mStartedCounter = 0;
    private int mResumedCounter = 0;
    private boolean mPauseSent = true;
    private boolean mStopSent = true;
    private final androidx.lifecycle.LifecycleRegistry mRegistry = new androidx.lifecycle.LifecycleRegistry(this);
    private java.lang.Runnable mDelayedPauseRunnable = new java.lang.Runnable() { // from class: androidx.lifecycle.ProcessLifecycleOwner.1
        @Override // java.lang.Runnable
        public void run() {
            androidx.lifecycle.ProcessLifecycleOwner.this.dispatchPauseIfNeeded();
            androidx.lifecycle.ProcessLifecycleOwner.this.dispatchStopIfNeeded();
        }
    };
    androidx.lifecycle.ReportFragment.ActivityInitializationListener mInitializationListener = new androidx.lifecycle.ReportFragment.ActivityInitializationListener() { // from class: androidx.lifecycle.ProcessLifecycleOwner.2
        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onCreate() {
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onStart() {
            androidx.lifecycle.ProcessLifecycleOwner.this.activityStarted();
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onResume() {
            androidx.lifecycle.ProcessLifecycleOwner.this.activityResumed();
        }
    };

    public static androidx.lifecycle.LifecycleOwner get() {
        return sInstance;
    }

    static void init(android.content.Context context) {
        sInstance.attach(context);
    }

    void activityStarted() {
        int i = this.mStartedCounter + 1;
        this.mStartedCounter = i;
        if (i == 1 && this.mStopSent) {
            this.mRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START);
            this.mStopSent = false;
        }
    }

    void activityResumed() {
        int i = this.mResumedCounter + 1;
        this.mResumedCounter = i;
        if (i == 1) {
            if (this.mPauseSent) {
                this.mRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME);
                this.mPauseSent = false;
            } else {
                this.mHandler.removeCallbacks(this.mDelayedPauseRunnable);
            }
        }
    }

    void activityPaused() {
        int i = this.mResumedCounter - 1;
        this.mResumedCounter = i;
        if (i == 0) {
            this.mHandler.postDelayed(this.mDelayedPauseRunnable, TIMEOUT_MS);
        }
    }

    void activityStopped() {
        this.mStartedCounter--;
        dispatchStopIfNeeded();
    }

    void dispatchPauseIfNeeded() {
        if (this.mResumedCounter == 0) {
            this.mPauseSent = true;
            this.mRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_PAUSE);
        }
    }

    void dispatchStopIfNeeded() {
        if (this.mStartedCounter == 0 && this.mPauseSent) {
            this.mRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP);
            this.mStopSent = true;
        }
    }

    private ProcessLifecycleOwner() {
    }

    void attach(android.content.Context context) {
        this.mHandler = new android.os.Handler();
        this.mRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE);
        ((android.app.Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new androidx.lifecycle.EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner.3
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
                activity.registerActivityLifecycleCallbacks(new androidx.lifecycle.EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner.3.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(android.app.Activity activity2) {
                        androidx.lifecycle.ProcessLifecycleOwner.this.activityStarted();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(android.app.Activity activity2) {
                        androidx.lifecycle.ProcessLifecycleOwner.this.activityResumed();
                    }
                });
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
                if (android.os.Build.VERSION.SDK_INT < 29) {
                    androidx.lifecycle.ReportFragment.get(activity).setProcessListener(androidx.lifecycle.ProcessLifecycleOwner.this.mInitializationListener);
                }
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(android.app.Activity activity) {
                androidx.lifecycle.ProcessLifecycleOwner.this.activityPaused();
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(android.app.Activity activity) {
                androidx.lifecycle.ProcessLifecycleOwner.this.activityStopped();
            }
        });
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
        return this.mRegistry;
    }
}
