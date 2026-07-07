package androidx.lifecycle;

/* loaded from: classes.dex */
final class SavedStateHandleController implements androidx.lifecycle.LifecycleEventObserver {
    static final java.lang.String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";
    private final androidx.lifecycle.SavedStateHandle mHandle;
    private boolean mIsAttached = false;
    private final java.lang.String mKey;

    SavedStateHandleController(java.lang.String key, androidx.lifecycle.SavedStateHandle handle) {
        this.mKey = key;
        this.mHandle = handle;
    }

    boolean isAttached() {
        return this.mIsAttached;
    }

    void attachToLifecycle(androidx.savedstate.SavedStateRegistry registry, androidx.lifecycle.Lifecycle lifecycle) {
        if (this.mIsAttached) {
            throw new java.lang.IllegalStateException("Already attached to lifecycleOwner");
        }
        this.mIsAttached = true;
        lifecycle.addObserver(this);
        registry.registerSavedStateProvider(this.mKey, this.mHandle.savedStateProvider());
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
        if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
            this.mIsAttached = false;
            source.getLifecycle().removeObserver(this);
        }
    }

    androidx.lifecycle.SavedStateHandle getHandle() {
        return this.mHandle;
    }

    static androidx.lifecycle.SavedStateHandleController create(androidx.savedstate.SavedStateRegistry registry, androidx.lifecycle.Lifecycle lifecycle, java.lang.String key, android.os.Bundle defaultArgs) {
        androidx.lifecycle.SavedStateHandleController savedStateHandleController = new androidx.lifecycle.SavedStateHandleController(key, androidx.lifecycle.SavedStateHandle.createHandle(registry.consumeRestoredStateForKey(key), defaultArgs));
        savedStateHandleController.attachToLifecycle(registry, lifecycle);
        tryToAddRecreator(registry, lifecycle);
        return savedStateHandleController;
    }

    static final class OnRecreation implements androidx.savedstate.SavedStateRegistry.AutoRecreated {
        OnRecreation() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        public void onRecreated(androidx.savedstate.SavedStateRegistryOwner owner) {
            if (!(owner instanceof androidx.lifecycle.ViewModelStoreOwner)) {
                throw new java.lang.IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            androidx.lifecycle.ViewModelStore viewModelStore = ((androidx.lifecycle.ViewModelStoreOwner) owner).getViewModelStore();
            androidx.savedstate.SavedStateRegistry savedStateRegistry = owner.getSavedStateRegistry();
            java.util.Iterator<java.lang.String> it = viewModelStore.keys().iterator();
            while (it.hasNext()) {
                androidx.lifecycle.SavedStateHandleController.attachHandleIfNeeded(viewModelStore.get(it.next()), savedStateRegistry, owner.getLifecycle());
            }
            if (viewModelStore.keys().isEmpty()) {
                return;
            }
            savedStateRegistry.runOnNextRecreation(androidx.lifecycle.SavedStateHandleController.OnRecreation.class);
        }
    }

    static void attachHandleIfNeeded(androidx.lifecycle.ViewModel viewModel, androidx.savedstate.SavedStateRegistry registry, androidx.lifecycle.Lifecycle lifecycle) {
        androidx.lifecycle.SavedStateHandleController savedStateHandleController = (androidx.lifecycle.SavedStateHandleController) viewModel.getTag(TAG_SAVED_STATE_HANDLE_CONTROLLER);
        if (savedStateHandleController == null || savedStateHandleController.isAttached()) {
            return;
        }
        savedStateHandleController.attachToLifecycle(registry, lifecycle);
        tryToAddRecreator(registry, lifecycle);
    }

    private static void tryToAddRecreator(final androidx.savedstate.SavedStateRegistry registry, final androidx.lifecycle.Lifecycle lifecycle) {
        androidx.lifecycle.Lifecycle.State currentState = lifecycle.getCurrentState();
        if (currentState == androidx.lifecycle.Lifecycle.State.INITIALIZED || currentState.isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
            registry.runOnNextRecreation(androidx.lifecycle.SavedStateHandleController.OnRecreation.class);
        } else {
            lifecycle.addObserver(new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(androidx.lifecycle.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
                    if (event == androidx.lifecycle.Lifecycle.Event.ON_START) {
                        androidx.lifecycle.Lifecycle.this.removeObserver(this);
                        registry.runOnNextRecreation(androidx.lifecycle.SavedStateHandleController.OnRecreation.class);
                    }
                }
            });
        }
    }
}
