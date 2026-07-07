package androidx.fragment.app;

/* loaded from: classes.dex */
class FragmentViewLifecycleOwner implements androidx.savedstate.SavedStateRegistryOwner {
    private androidx.lifecycle.LifecycleRegistry mLifecycleRegistry = null;
    private androidx.savedstate.SavedStateRegistryController mSavedStateRegistryController = null;

    FragmentViewLifecycleOwner() {
    }

    void initialize() {
        if (this.mLifecycleRegistry == null) {
            this.mLifecycleRegistry = new androidx.lifecycle.LifecycleRegistry(this);
            this.mSavedStateRegistryController = androidx.savedstate.SavedStateRegistryController.create(this);
        }
    }

    boolean isInitialized() {
        return this.mLifecycleRegistry != null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
        initialize();
        return this.mLifecycleRegistry;
    }

    void setCurrentState(androidx.lifecycle.Lifecycle.State state) {
        this.mLifecycleRegistry.setCurrentState(state);
    }

    void handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event event) {
        this.mLifecycleRegistry.handleLifecycleEvent(event);
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    void performRestore(android.os.Bundle bundle) {
        this.mSavedStateRegistryController.performRestore(bundle);
    }

    void performSave(android.os.Bundle bundle) {
        this.mSavedStateRegistryController.performSave(bundle);
    }
}
