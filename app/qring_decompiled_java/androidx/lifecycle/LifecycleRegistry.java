package androidx.lifecycle;

/* loaded from: classes.dex */
public class LifecycleRegistry extends androidx.lifecycle.Lifecycle {
    private int mAddingObserverCounter;
    private final boolean mEnforceMainThread;
    private boolean mHandlingEvent;
    private final java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> mLifecycleOwner;
    private boolean mNewEventOccurred;
    private androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> mObserverMap;
    private java.util.ArrayList<androidx.lifecycle.Lifecycle.State> mParentStates;
    private androidx.lifecycle.Lifecycle.State mState;

    public LifecycleRegistry(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        this(lifecycleOwner, true);
    }

    private LifecycleRegistry(androidx.lifecycle.LifecycleOwner lifecycleOwner, boolean z) {
        this.mObserverMap = new androidx.arch.core.internal.FastSafeIterableMap<>();
        this.mAddingObserverCounter = 0;
        this.mHandlingEvent = false;
        this.mNewEventOccurred = false;
        this.mParentStates = new java.util.ArrayList<>();
        this.mLifecycleOwner = new java.lang.ref.WeakReference<>(lifecycleOwner);
        this.mState = androidx.lifecycle.Lifecycle.State.INITIALIZED;
        this.mEnforceMainThread = z;
    }

    @java.lang.Deprecated
    public void markState(androidx.lifecycle.Lifecycle.State state) {
        enforceMainThreadIfNeeded("markState");
        setCurrentState(state);
    }

    public void setCurrentState(androidx.lifecycle.Lifecycle.State state) {
        enforceMainThreadIfNeeded("setCurrentState");
        moveToState(state);
    }

    public void handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event event) {
        enforceMainThreadIfNeeded("handleLifecycleEvent");
        moveToState(event.getTargetState());
    }

    private void moveToState(androidx.lifecycle.Lifecycle.State state) {
        if (this.mState == state) {
            return;
        }
        this.mState = state;
        if (this.mHandlingEvent || this.mAddingObserverCounter != 0) {
            this.mNewEventOccurred = true;
            return;
        }
        this.mHandlingEvent = true;
        sync();
        this.mHandlingEvent = false;
    }

    private boolean isSynced() {
        if (this.mObserverMap.size() == 0) {
            return true;
        }
        androidx.lifecycle.Lifecycle.State state = this.mObserverMap.eldest().getValue().mState;
        androidx.lifecycle.Lifecycle.State state2 = this.mObserverMap.newest().getValue().mState;
        return state == state2 && this.mState == state2;
    }

    private androidx.lifecycle.Lifecycle.State calculateTargetState(androidx.lifecycle.LifecycleObserver lifecycleObserver) {
        java.util.Map.Entry<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> ceil = this.mObserverMap.ceil(lifecycleObserver);
        androidx.lifecycle.Lifecycle.State state = null;
        androidx.lifecycle.Lifecycle.State state2 = ceil != null ? ceil.getValue().mState : null;
        if (!this.mParentStates.isEmpty()) {
            state = this.mParentStates.get(r0.size() - 1);
        }
        return min(min(this.mState, state2), state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(androidx.lifecycle.LifecycleObserver lifecycleObserver) {
        androidx.lifecycle.LifecycleOwner lifecycleOwner;
        enforceMainThreadIfNeeded("addObserver");
        androidx.lifecycle.LifecycleRegistry.ObserverWithState observerWithState = new androidx.lifecycle.LifecycleRegistry.ObserverWithState(lifecycleObserver, this.mState == androidx.lifecycle.Lifecycle.State.DESTROYED ? androidx.lifecycle.Lifecycle.State.DESTROYED : androidx.lifecycle.Lifecycle.State.INITIALIZED);
        if (this.mObserverMap.putIfAbsent(lifecycleObserver, observerWithState) == null && (lifecycleOwner = this.mLifecycleOwner.get()) != null) {
            boolean z = this.mAddingObserverCounter != 0 || this.mHandlingEvent;
            androidx.lifecycle.Lifecycle.State calculateTargetState = calculateTargetState(lifecycleObserver);
            this.mAddingObserverCounter++;
            while (observerWithState.mState.compareTo(calculateTargetState) < 0 && this.mObserverMap.contains(lifecycleObserver)) {
                pushParentState(observerWithState.mState);
                androidx.lifecycle.Lifecycle.Event upFrom = androidx.lifecycle.Lifecycle.Event.upFrom(observerWithState.mState);
                if (upFrom == null) {
                    throw new java.lang.IllegalStateException("no event up from " + observerWithState.mState);
                }
                observerWithState.dispatchEvent(lifecycleOwner, upFrom);
                popParentState();
                calculateTargetState = calculateTargetState(lifecycleObserver);
            }
            if (!z) {
                sync();
            }
            this.mAddingObserverCounter--;
        }
    }

    private void popParentState() {
        this.mParentStates.remove(r0.size() - 1);
    }

    private void pushParentState(androidx.lifecycle.Lifecycle.State state) {
        this.mParentStates.add(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(androidx.lifecycle.LifecycleObserver lifecycleObserver) {
        enforceMainThreadIfNeeded("removeObserver");
        this.mObserverMap.remove(lifecycleObserver);
    }

    public int getObserverCount() {
        enforceMainThreadIfNeeded("getObserverCount");
        return this.mObserverMap.size();
    }

    @Override // androidx.lifecycle.Lifecycle
    public androidx.lifecycle.Lifecycle.State getCurrentState() {
        return this.mState;
    }

    private void forwardPass(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState>.IteratorWithAdditions iteratorWithAdditions = this.mObserverMap.iteratorWithAdditions();
        while (iteratorWithAdditions.hasNext() && !this.mNewEventOccurred) {
            java.util.Map.Entry next = iteratorWithAdditions.next();
            androidx.lifecycle.LifecycleRegistry.ObserverWithState observerWithState = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) next.getValue();
            while (observerWithState.mState.compareTo(this.mState) < 0 && !this.mNewEventOccurred && this.mObserverMap.contains((androidx.lifecycle.LifecycleObserver) next.getKey())) {
                pushParentState(observerWithState.mState);
                androidx.lifecycle.Lifecycle.Event upFrom = androidx.lifecycle.Lifecycle.Event.upFrom(observerWithState.mState);
                if (upFrom == null) {
                    throw new java.lang.IllegalStateException("no event up from " + observerWithState.mState);
                }
                observerWithState.dispatchEvent(lifecycleOwner, upFrom);
                popParentState();
            }
        }
    }

    private void backwardPass(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        java.util.Iterator<java.util.Map.Entry<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState>> descendingIterator = this.mObserverMap.descendingIterator();
        while (descendingIterator.hasNext() && !this.mNewEventOccurred) {
            java.util.Map.Entry<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> next = descendingIterator.next();
            androidx.lifecycle.LifecycleRegistry.ObserverWithState value = next.getValue();
            while (value.mState.compareTo(this.mState) > 0 && !this.mNewEventOccurred && this.mObserverMap.contains(next.getKey())) {
                androidx.lifecycle.Lifecycle.Event downFrom = androidx.lifecycle.Lifecycle.Event.downFrom(value.mState);
                if (downFrom == null) {
                    throw new java.lang.IllegalStateException("no event down from " + value.mState);
                }
                pushParentState(downFrom.getTargetState());
                value.dispatchEvent(lifecycleOwner, downFrom);
                popParentState();
            }
        }
    }

    private void sync() {
        androidx.lifecycle.LifecycleOwner lifecycleOwner = this.mLifecycleOwner.get();
        if (lifecycleOwner == null) {
            throw new java.lang.IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (!isSynced()) {
            this.mNewEventOccurred = false;
            if (this.mState.compareTo(this.mObserverMap.eldest().getValue().mState) < 0) {
                backwardPass(lifecycleOwner);
            }
            java.util.Map.Entry<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> newest = this.mObserverMap.newest();
            if (!this.mNewEventOccurred && newest != null && this.mState.compareTo(newest.getValue().mState) > 0) {
                forwardPass(lifecycleOwner);
            }
        }
        this.mNewEventOccurred = false;
    }

    private void enforceMainThreadIfNeeded(java.lang.String str) {
        if (!this.mEnforceMainThread || androidx.arch.core.executor.ArchTaskExecutor.getInstance().isMainThread()) {
            return;
        }
        throw new java.lang.IllegalStateException("Method " + str + " must be called on the main thread");
    }

    public static androidx.lifecycle.LifecycleRegistry createUnsafe(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        return new androidx.lifecycle.LifecycleRegistry(lifecycleOwner, false);
    }

    static androidx.lifecycle.Lifecycle.State min(androidx.lifecycle.Lifecycle.State state, androidx.lifecycle.Lifecycle.State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    static class ObserverWithState {
        androidx.lifecycle.LifecycleEventObserver mLifecycleObserver;
        androidx.lifecycle.Lifecycle.State mState;

        ObserverWithState(androidx.lifecycle.LifecycleObserver lifecycleObserver, androidx.lifecycle.Lifecycle.State state) {
            this.mLifecycleObserver = androidx.lifecycle.Lifecycling.lifecycleEventObserver(lifecycleObserver);
            this.mState = state;
        }

        void dispatchEvent(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
            androidx.lifecycle.Lifecycle.State targetState = event.getTargetState();
            this.mState = androidx.lifecycle.LifecycleRegistry.min(this.mState, targetState);
            this.mLifecycleObserver.onStateChanged(lifecycleOwner, event);
            this.mState = targetState;
        }
    }
}
