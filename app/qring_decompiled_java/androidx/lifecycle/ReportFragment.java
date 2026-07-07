package androidx.lifecycle;

/* loaded from: classes.dex */
public class ReportFragment extends android.app.Fragment {
    private static final java.lang.String REPORT_FRAGMENT_TAG = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    private androidx.lifecycle.ReportFragment.ActivityInitializationListener mProcessListener;

    interface ActivityInitializationListener {
        void onCreate();

        void onResume();

        void onStart();
    }

    public static void injectIfNeededIn(android.app.Activity activity) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.lifecycle.ReportFragment.LifecycleCallbacks.registerIn(activity);
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag(REPORT_FRAGMENT_TAG) == null) {
            fragmentManager.beginTransaction().add(new androidx.lifecycle.ReportFragment(), REPORT_FRAGMENT_TAG).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void dispatch(android.app.Activity activity, androidx.lifecycle.Lifecycle.Event event) {
        if (activity instanceof androidx.lifecycle.LifecycleRegistryOwner) {
            ((androidx.lifecycle.LifecycleRegistryOwner) activity).getLifecycle().handleLifecycleEvent(event);
        } else if (activity instanceof androidx.lifecycle.LifecycleOwner) {
            androidx.lifecycle.Lifecycle lifecycle = ((androidx.lifecycle.LifecycleOwner) activity).getLifecycle();
            if (lifecycle instanceof androidx.lifecycle.LifecycleRegistry) {
                ((androidx.lifecycle.LifecycleRegistry) lifecycle).handleLifecycleEvent(event);
            }
        }
    }

    static androidx.lifecycle.ReportFragment get(android.app.Activity activity) {
        return (androidx.lifecycle.ReportFragment) activity.getFragmentManager().findFragmentByTag(REPORT_FRAGMENT_TAG);
    }

    private void dispatchCreate(androidx.lifecycle.ReportFragment.ActivityInitializationListener activityInitializationListener) {
        if (activityInitializationListener != null) {
            activityInitializationListener.onCreate();
        }
    }

    private void dispatchStart(androidx.lifecycle.ReportFragment.ActivityInitializationListener activityInitializationListener) {
        if (activityInitializationListener != null) {
            activityInitializationListener.onStart();
        }
    }

    private void dispatchResume(androidx.lifecycle.ReportFragment.ActivityInitializationListener activityInitializationListener) {
        if (activityInitializationListener != null) {
            activityInitializationListener.onResume();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        dispatchCreate(this.mProcessListener);
        dispatch(androidx.lifecycle.Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        dispatchStart(this.mProcessListener);
        dispatch(androidx.lifecycle.Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        dispatchResume(this.mProcessListener);
        dispatch(androidx.lifecycle.Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        dispatch(androidx.lifecycle.Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        dispatch(androidx.lifecycle.Lifecycle.Event.ON_STOP);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        dispatch(androidx.lifecycle.Lifecycle.Event.ON_DESTROY);
        this.mProcessListener = null;
    }

    private void dispatch(androidx.lifecycle.Lifecycle.Event event) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            dispatch(getActivity(), event);
        }
    }

    void setProcessListener(androidx.lifecycle.ReportFragment.ActivityInitializationListener activityInitializationListener) {
        this.mProcessListener = activityInitializationListener;
    }

    static class LifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity activity) {
        }

        LifecycleCallbacks() {
        }

        static void registerIn(android.app.Activity activity) {
            activity.registerActivityLifecycleCallbacks(new androidx.lifecycle.ReportFragment.LifecycleCallbacks());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
            androidx.lifecycle.ReportFragment.dispatch(activity, androidx.lifecycle.Lifecycle.Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity activity) {
            androidx.lifecycle.ReportFragment.dispatch(activity, androidx.lifecycle.Lifecycle.Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity activity) {
            androidx.lifecycle.ReportFragment.dispatch(activity, androidx.lifecycle.Lifecycle.Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(android.app.Activity activity) {
            androidx.lifecycle.ReportFragment.dispatch(activity, androidx.lifecycle.Lifecycle.Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(android.app.Activity activity) {
            androidx.lifecycle.ReportFragment.dispatch(activity, androidx.lifecycle.Lifecycle.Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(android.app.Activity activity) {
            androidx.lifecycle.ReportFragment.dispatch(activity, androidx.lifecycle.Lifecycle.Event.ON_DESTROY);
        }
    }
}
