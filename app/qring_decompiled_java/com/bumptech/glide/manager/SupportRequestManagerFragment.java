package com.bumptech.glide.manager;

/* loaded from: /tmp/dex/classes2.dex */
public class SupportRequestManagerFragment extends androidx.fragment.app.Fragment {
    private static final java.lang.String TAG = "SupportRMFragment";
    private final java.util.Set<com.bumptech.glide.manager.SupportRequestManagerFragment> childRequestManagerFragments;
    private final com.bumptech.glide.manager.ActivityFragmentLifecycle lifecycle;
    private androidx.fragment.app.Fragment parentFragmentHint;
    private com.bumptech.glide.RequestManager requestManager;
    private final com.bumptech.glide.manager.RequestManagerTreeNode requestManagerTreeNode;
    private com.bumptech.glide.manager.SupportRequestManagerFragment rootRequestManagerFragment;

    public SupportRequestManagerFragment() {
        this(new com.bumptech.glide.manager.ActivityFragmentLifecycle());
    }

    public SupportRequestManagerFragment(com.bumptech.glide.manager.ActivityFragmentLifecycle activityFragmentLifecycle) {
        this.requestManagerTreeNode = new com.bumptech.glide.manager.SupportRequestManagerFragment.SupportFragmentRequestManagerTreeNode();
        this.childRequestManagerFragments = new java.util.HashSet();
        this.lifecycle = activityFragmentLifecycle;
    }

    public void setRequestManager(com.bumptech.glide.RequestManager requestManager) {
        this.requestManager = requestManager;
    }

    com.bumptech.glide.manager.ActivityFragmentLifecycle getGlideLifecycle() {
        return this.lifecycle;
    }

    public com.bumptech.glide.RequestManager getRequestManager() {
        return this.requestManager;
    }

    public com.bumptech.glide.manager.RequestManagerTreeNode getRequestManagerTreeNode() {
        return this.requestManagerTreeNode;
    }

    private void addChildRequestManagerFragment(com.bumptech.glide.manager.SupportRequestManagerFragment supportRequestManagerFragment) {
        this.childRequestManagerFragments.add(supportRequestManagerFragment);
    }

    private void removeChildRequestManagerFragment(com.bumptech.glide.manager.SupportRequestManagerFragment supportRequestManagerFragment) {
        this.childRequestManagerFragments.remove(supportRequestManagerFragment);
    }

    java.util.Set<com.bumptech.glide.manager.SupportRequestManagerFragment> getDescendantRequestManagerFragments() {
        com.bumptech.glide.manager.SupportRequestManagerFragment supportRequestManagerFragment = this.rootRequestManagerFragment;
        if (supportRequestManagerFragment == null) {
            return java.util.Collections.emptySet();
        }
        if (equals(supportRequestManagerFragment)) {
            return java.util.Collections.unmodifiableSet(this.childRequestManagerFragments);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (com.bumptech.glide.manager.SupportRequestManagerFragment supportRequestManagerFragment2 : this.rootRequestManagerFragment.getDescendantRequestManagerFragments()) {
            if (isDescendant(supportRequestManagerFragment2.getParentFragmentUsingHint())) {
                hashSet.add(supportRequestManagerFragment2);
            }
        }
        return java.util.Collections.unmodifiableSet(hashSet);
    }

    void setParentFragmentHint(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.FragmentManager rootFragmentManager;
        this.parentFragmentHint = fragment;
        if (fragment == null || fragment.getContext() == null || (rootFragmentManager = getRootFragmentManager(fragment)) == null) {
            return;
        }
        registerFragmentWithRoot(fragment.getContext(), rootFragmentManager);
    }

    private static androidx.fragment.app.FragmentManager getRootFragmentManager(androidx.fragment.app.Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    private androidx.fragment.app.Fragment getParentFragmentUsingHint() {
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.parentFragmentHint;
    }

    private boolean isDescendant(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.Fragment parentFragmentUsingHint = getParentFragmentUsingHint();
        while (true) {
            androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(parentFragmentUsingHint)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void registerFragmentWithRoot(android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        unregisterFragmentWithRoot();
        com.bumptech.glide.manager.SupportRequestManagerFragment supportRequestManagerFragment = com.bumptech.glide.Glide.get(context).getRequestManagerRetriever().getSupportRequestManagerFragment(fragmentManager);
        this.rootRequestManagerFragment = supportRequestManagerFragment;
        if (equals(supportRequestManagerFragment)) {
            return;
        }
        this.rootRequestManagerFragment.addChildRequestManagerFragment(this);
    }

    private void unregisterFragmentWithRoot() {
        com.bumptech.glide.manager.SupportRequestManagerFragment supportRequestManagerFragment = this.rootRequestManagerFragment;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.removeChildRequestManagerFragment(this);
            this.rootRequestManagerFragment = null;
        }
    }

    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        androidx.fragment.app.FragmentManager rootFragmentManager = getRootFragmentManager(this);
        if (rootFragmentManager == null) {
            if (android.util.Log.isLoggable(TAG, 5)) {
                android.util.Log.w(TAG, "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                registerFragmentWithRoot(getContext(), rootFragmentManager);
            } catch (java.lang.IllegalStateException e) {
                if (android.util.Log.isLoggable(TAG, 5)) {
                    android.util.Log.w(TAG, "Unable to register fragment with root", e);
                }
            }
        }
    }

    public void onDetach() {
        super.onDetach();
        this.parentFragmentHint = null;
        unregisterFragmentWithRoot();
    }

    public void onStart() {
        super.onStart();
        this.lifecycle.onStart();
    }

    public void onStop() {
        super.onStop();
        this.lifecycle.onStop();
    }

    public void onDestroy() {
        super.onDestroy();
        this.lifecycle.onDestroy();
        unregisterFragmentWithRoot();
    }

    public java.lang.String toString() {
        return super.toString() + "{parent=" + getParentFragmentUsingHint() + "}";
    }

    private class SupportFragmentRequestManagerTreeNode implements com.bumptech.glide.manager.RequestManagerTreeNode {
        SupportFragmentRequestManagerTreeNode() {
        }

        @Override // com.bumptech.glide.manager.RequestManagerTreeNode
        public java.util.Set<com.bumptech.glide.RequestManager> getDescendants() {
            java.util.Set<com.bumptech.glide.manager.SupportRequestManagerFragment> descendantRequestManagerFragments = com.bumptech.glide.manager.SupportRequestManagerFragment.this.getDescendantRequestManagerFragments();
            java.util.HashSet hashSet = new java.util.HashSet(descendantRequestManagerFragments.size());
            for (com.bumptech.glide.manager.SupportRequestManagerFragment supportRequestManagerFragment : descendantRequestManagerFragments) {
                if (supportRequestManagerFragment.getRequestManager() != null) {
                    hashSet.add(supportRequestManagerFragment.getRequestManager());
                }
            }
            return hashSet;
        }

        public java.lang.String toString() {
            return super.toString() + "{fragment=" + com.bumptech.glide.manager.SupportRequestManagerFragment.this + "}";
        }
    }
}
