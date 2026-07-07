package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class Utils {
    private static android.app.Application sApp;

    public interface Consumer<T> {
        void accept(T t);
    }

    public interface Func1<Ret, Par> {
        Ret call(Par par);
    }

    public interface OnAppStatusChangedListener {
        void onBackground(android.app.Activity activity);

        void onForeground(android.app.Activity activity);
    }

    public interface Supplier<T> {
        T get();
    }

    private Utils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static void init(android.app.Application application) {
        if (application == null) {
            android.util.Log.e("Utils", "app is null.");
            return;
        }
        android.app.Application application2 = sApp;
        if (application2 == null) {
            sApp = application;
            com.blankj.utilcode.util.UtilsBridge.init(application);
            com.blankj.utilcode.util.UtilsBridge.preLoad();
        } else {
            if (application2.equals(application)) {
                return;
            }
            com.blankj.utilcode.util.UtilsBridge.unInit(sApp);
            sApp = application;
            com.blankj.utilcode.util.UtilsBridge.init(application);
        }
    }

    public static android.app.Application getApp() {
        android.app.Application application = sApp;
        if (application != null) {
            return application;
        }
        init(com.blankj.utilcode.util.UtilsBridge.getApplicationByReflect());
        java.util.Objects.requireNonNull(sApp, "reflect failed.");
        android.util.Log.i("Utils", com.blankj.utilcode.util.UtilsBridge.getCurrentProcessName() + " reflect app success.");
        return sApp;
    }

    public static abstract class Task<Result> extends com.blankj.utilcode.util.ThreadUtils.SimpleTask<Result> {
        private com.blankj.utilcode.util.Utils.Consumer<Result> mConsumer;

        public Task(com.blankj.utilcode.util.Utils.Consumer<Result> consumer) {
            this.mConsumer = consumer;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Result result) {
            com.blankj.utilcode.util.Utils.Consumer<Result> consumer = this.mConsumer;
            if (consumer != null) {
                consumer.accept(result);
            }
        }
    }

    public static class ActivityLifecycleCallbacks {
        public void onActivityCreated(android.app.Activity activity) {
            java.util.Objects.requireNonNull(activity, "Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public void onActivityStarted(android.app.Activity activity) {
            java.util.Objects.requireNonNull(activity, "Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public void onActivityResumed(android.app.Activity activity) {
            java.util.Objects.requireNonNull(activity, "Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public void onActivityPaused(android.app.Activity activity) {
            java.util.Objects.requireNonNull(activity, "Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public void onActivityStopped(android.app.Activity activity) {
            java.util.Objects.requireNonNull(activity, "Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public void onActivityDestroyed(android.app.Activity activity) {
            java.util.Objects.requireNonNull(activity, "Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public void onLifecycleChanged(android.app.Activity activity, androidx.lifecycle.Lifecycle.Event event) {
            java.util.Objects.requireNonNull(activity, "Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
    }
}
