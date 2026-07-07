package androidx.work.impl.constraints.trackers;

/* loaded from: classes.dex */
public abstract class ConstraintTracker<T> {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("ConstraintTracker");
    protected final android.content.Context mAppContext;
    T mCurrentState;
    protected final androidx.work.impl.utils.taskexecutor.TaskExecutor mTaskExecutor;
    private final java.lang.Object mLock = new java.lang.Object();
    private final java.util.Set<androidx.work.impl.constraints.ConstraintListener<T>> mListeners = new java.util.LinkedHashSet();

    public abstract T getInitialState();

    public abstract void startTracking();

    public abstract void stopTracking();

    ConstraintTracker(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        this.mAppContext = context.getApplicationContext();
        this.mTaskExecutor = taskExecutor;
    }

    public void addListener(androidx.work.impl.constraints.ConstraintListener<T> listener) {
        synchronized (this.mLock) {
            if (this.mListeners.add(listener)) {
                if (this.mListeners.size() == 1) {
                    this.mCurrentState = getInitialState();
                    androidx.work.Logger.get().debug(TAG, java.lang.String.format("%s: initial state = %s", getClass().getSimpleName(), this.mCurrentState), new java.lang.Throwable[0]);
                    startTracking();
                }
                listener.onConstraintChanged(this.mCurrentState);
            }
        }
    }

    public void removeListener(androidx.work.impl.constraints.ConstraintListener<T> listener) {
        synchronized (this.mLock) {
            if (this.mListeners.remove(listener) && this.mListeners.isEmpty()) {
                stopTracking();
            }
        }
    }

    public void setState(T newState) {
        synchronized (this.mLock) {
            T t = this.mCurrentState;
            if (t != newState && (t == null || !t.equals(newState))) {
                this.mCurrentState = newState;
                final java.util.ArrayList arrayList = new java.util.ArrayList(this.mListeners);
                this.mTaskExecutor.getMainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.work.impl.constraints.trackers.ConstraintTracker.1
                    @Override // java.lang.Runnable
                    public void run() {
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((androidx.work.impl.constraints.ConstraintListener) it.next()).onConstraintChanged(androidx.work.impl.constraints.trackers.ConstraintTracker.this.mCurrentState);
                        }
                    }
                });
            }
        }
    }
}
