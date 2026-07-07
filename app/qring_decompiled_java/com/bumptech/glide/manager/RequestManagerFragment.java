package com.bumptech.glide.manager;

@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public class RequestManagerFragment extends android.app.Fragment {
    private static final java.lang.String TAG = "RMFragment";
    private final java.util.Set<com.bumptech.glide.manager.RequestManagerFragment> childRequestManagerFragments;
    private final com.bumptech.glide.manager.ActivityFragmentLifecycle lifecycle;
    private android.app.Fragment parentFragmentHint;
    private com.bumptech.glide.RequestManager requestManager;
    private final com.bumptech.glide.manager.RequestManagerTreeNode requestManagerTreeNode;
    private com.bumptech.glide.manager.RequestManagerFragment rootRequestManagerFragment;

    public RequestManagerFragment() {
        this(new com.bumptech.glide.manager.ActivityFragmentLifecycle());
    }

    RequestManagerFragment(com.bumptech.glide.manager.ActivityFragmentLifecycle activityFragmentLifecycle) {
        this.requestManagerTreeNode = new com.bumptech.glide.manager.RequestManagerFragment.FragmentRequestManagerTreeNode();
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

    private void addChildRequestManagerFragment(com.bumptech.glide.manager.RequestManagerFragment requestManagerFragment) {
        this.childRequestManagerFragments.add(requestManagerFragment);
    }

    private void removeChildRequestManagerFragment(com.bumptech.glide.manager.RequestManagerFragment requestManagerFragment) {
        this.childRequestManagerFragments.remove(requestManagerFragment);
    }

    java.util.Set<com.bumptech.glide.manager.RequestManagerFragment> getDescendantRequestManagerFragments() {
        if (equals(this.rootRequestManagerFragment)) {
            return java.util.Collections.unmodifiableSet(this.childRequestManagerFragments);
        }
        if (this.rootRequestManagerFragment == null || android.os.Build.VERSION.SDK_INT < 17) {
            return java.util.Collections.emptySet();
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (com.bumptech.glide.manager.RequestManagerFragment requestManagerFragment : this.rootRequestManagerFragment.getDescendantRequestManagerFragments()) {
            if (isDescendant(requestManagerFragment.getParentFragment())) {
                hashSet.add(requestManagerFragment);
            }
        }
        return java.util.Collections.unmodifiableSet(hashSet);
    }

    void setParentFragmentHint(android.app.Fragment fragment) {
        this.parentFragmentHint = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        registerFragmentWithRoot(fragment.getActivity());
    }

    private android.app.Fragment getParentFragmentUsingHint() {
        android.app.Fragment parentFragment = android.os.Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.parentFragmentHint;
    }

    private boolean isDescendant(android.app.Fragment fragment) {
        android.app.Fragment parentFragment = getParentFragment();
        while (true) {
            android.app.Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void registerFragmentWithRoot(android.app.Activity activity) {
        unregisterFragmentWithRoot();
        com.bumptech.glide.manager.RequestManagerFragment requestManagerFragment = com.bumptech.glide.Glide.get(activity).getRequestManagerRetriever().getRequestManagerFragment(activity);
        this.rootRequestManagerFragment = requestManagerFragment;
        if (equals(requestManagerFragment)) {
            return;
        }
        this.rootRequestManagerFragment.addChildRequestManagerFragment(this);
    }

    private void unregisterFragmentWithRoot() {
        com.bumptech.glide.manager.RequestManagerFragment requestManagerFragment = this.rootRequestManagerFragment;
        if (requestManagerFragment != null) {
            requestManagerFragment.removeChildRequestManagerFragment(this);
            this.rootRequestManagerFragment = null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        try {
            registerFragmentWithRoot(activity);
        } catch (java.lang.IllegalStateException e) {
            if (android.util.Log.isLoggable(TAG, 5)) {
                android.util.Log.w(TAG, "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        unregisterFragmentWithRoot();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.lifecycle.onStart();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.lifecycle.onStop();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.lifecycle.onDestroy();
        unregisterFragmentWithRoot();
    }

    @Override // android.app.Fragment
    public java.lang.String toString() {
        return super.toString() + "{parent=" + getParentFragmentUsingHint() + "}";
    }

    private class FragmentRequestManagerTreeNode implements com.bumptech.glide.manager.RequestManagerTreeNode {
        FragmentRequestManagerTreeNode() {
        }

        @Override // com.bumptech.glide.manager.RequestManagerTreeNode
        public java.util.Set<com.bumptech.glide.RequestManager> getDescendants() {
            java.util.Set<com.bumptech.glide.manager.RequestManagerFragment> descendantRequestManagerFragments = com.bumptech.glide.manager.RequestManagerFragment.this.getDescendantRequestManagerFragments();
            java.util.HashSet hashSet = new java.util.HashSet(descendantRequestManagerFragments.size());
            for (com.bumptech.glide.manager.RequestManagerFragment requestManagerFragment : descendantRequestManagerFragments) {
                if (requestManagerFragment.getRequestManager() != null) {
                    hashSet.add(requestManagerFragment.getRequestManager());
                }
            }
            return hashSet;
        }

        public java.lang.String toString() {
            return super.toString() + "{fragment=" + com.bumptech.glide.manager.RequestManagerFragment.this + "}";
        }
    }
}
