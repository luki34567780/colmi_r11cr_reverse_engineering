package androidx.activity;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private final java.lang.Runnable mFallbackOnBackPressed;
    final java.util.ArrayDeque<androidx.activity.OnBackPressedCallback> mOnBackPressedCallbacks;

    public OnBackPressedDispatcher() {
        this(null);
    }

    public OnBackPressedDispatcher(java.lang.Runnable fallbackOnBackPressed) {
        this.mOnBackPressedCallbacks = new java.util.ArrayDeque<>();
        this.mFallbackOnBackPressed = fallbackOnBackPressed;
    }

    public void addCallback(androidx.activity.OnBackPressedCallback onBackPressedCallback) {
        addCancellableCallback(onBackPressedCallback);
    }

    androidx.activity.Cancellable addCancellableCallback(androidx.activity.OnBackPressedCallback onBackPressedCallback) {
        this.mOnBackPressedCallbacks.add(onBackPressedCallback);
        androidx.activity.OnBackPressedDispatcher.OnBackPressedCancellable onBackPressedCancellable = new androidx.activity.OnBackPressedDispatcher.OnBackPressedCancellable(onBackPressedCallback);
        onBackPressedCallback.addCancellable(onBackPressedCancellable);
        return onBackPressedCancellable;
    }

    public void addCallback(androidx.lifecycle.LifecycleOwner owner, androidx.activity.OnBackPressedCallback onBackPressedCallback) {
        androidx.lifecycle.Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.getCurrentState() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new androidx.activity.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable(lifecycle, onBackPressedCallback));
    }

    public boolean hasEnabledCallbacks() {
        java.util.Iterator<androidx.activity.OnBackPressedCallback> descendingIterator = this.mOnBackPressedCallbacks.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().isEnabled()) {
                return true;
            }
        }
        return false;
    }

    public void onBackPressed() {
        java.util.Iterator<androidx.activity.OnBackPressedCallback> descendingIterator = this.mOnBackPressedCallbacks.descendingIterator();
        while (descendingIterator.hasNext()) {
            androidx.activity.OnBackPressedCallback next = descendingIterator.next();
            if (next.isEnabled()) {
                next.handleOnBackPressed();
                return;
            }
        }
        java.lang.Runnable runnable = this.mFallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    private class OnBackPressedCancellable implements androidx.activity.Cancellable {
        private final androidx.activity.OnBackPressedCallback mOnBackPressedCallback;

        OnBackPressedCancellable(androidx.activity.OnBackPressedCallback onBackPressedCallback) {
            this.mOnBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            androidx.activity.OnBackPressedDispatcher.this.mOnBackPressedCallbacks.remove(this.mOnBackPressedCallback);
            this.mOnBackPressedCallback.removeCancellable(this);
        }
    }

    private class LifecycleOnBackPressedCancellable implements androidx.lifecycle.LifecycleEventObserver, androidx.activity.Cancellable {
        private androidx.activity.Cancellable mCurrentCancellable;
        private final androidx.lifecycle.Lifecycle mLifecycle;
        private final androidx.activity.OnBackPressedCallback mOnBackPressedCallback;

        LifecycleOnBackPressedCancellable(androidx.lifecycle.Lifecycle lifecycle, androidx.activity.OnBackPressedCallback onBackPressedCallback) {
            this.mLifecycle = lifecycle;
            this.mOnBackPressedCallback = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(androidx.lifecycle.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
            if (event == androidx.lifecycle.Lifecycle.Event.ON_START) {
                this.mCurrentCancellable = androidx.activity.OnBackPressedDispatcher.this.addCancellableCallback(this.mOnBackPressedCallback);
                return;
            }
            if (event == androidx.lifecycle.Lifecycle.Event.ON_STOP) {
                androidx.activity.Cancellable cancellable = this.mCurrentCancellable;
                if (cancellable != null) {
                    cancellable.cancel();
                    return;
                }
                return;
            }
            if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.mLifecycle.removeObserver(this);
            this.mOnBackPressedCallback.removeCancellable(this);
            androidx.activity.Cancellable cancellable = this.mCurrentCancellable;
            if (cancellable != null) {
                cancellable.cancel();
                this.mCurrentCancellable = null;
            }
        }
    }
}
