package androidx.savedstate;

/* loaded from: classes.dex */
public final class ViewTreeSavedStateRegistryOwner {
    private ViewTreeSavedStateRegistryOwner() {
    }

    public static void set(android.view.View view, androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner) {
        view.setTag(androidx.savedstate.R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }

    public static androidx.savedstate.SavedStateRegistryOwner get(android.view.View view) {
        androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner = (androidx.savedstate.SavedStateRegistryOwner) view.getTag(androidx.savedstate.R.id.view_tree_saved_state_registry_owner);
        if (savedStateRegistryOwner != null) {
            return savedStateRegistryOwner;
        }
        java.lang.Object parent = view.getParent();
        while (savedStateRegistryOwner == null && (parent instanceof android.view.View)) {
            android.view.View view2 = (android.view.View) parent;
            savedStateRegistryOwner = (androidx.savedstate.SavedStateRegistryOwner) view2.getTag(androidx.savedstate.R.id.view_tree_saved_state_registry_owner);
            parent = view2.getParent();
        }
        return savedStateRegistryOwner;
    }
}
