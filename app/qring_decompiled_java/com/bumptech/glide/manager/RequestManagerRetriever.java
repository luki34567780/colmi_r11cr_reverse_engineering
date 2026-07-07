package com.bumptech.glide.manager;

/* loaded from: /tmp/dex/classes2.dex */
public class RequestManagerRetriever implements android.os.Handler.Callback {
    private static final com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory DEFAULT_FACTORY = new com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory() { // from class: com.bumptech.glide.manager.RequestManagerRetriever.1
        @Override // com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory
        public com.bumptech.glide.RequestManager build(com.bumptech.glide.Glide glide, com.bumptech.glide.manager.Lifecycle lifecycle, com.bumptech.glide.manager.RequestManagerTreeNode requestManagerTreeNode, android.content.Context context) {
            return new com.bumptech.glide.RequestManager(glide, lifecycle, requestManagerTreeNode, context);
        }
    };
    private static final java.lang.String FRAGMENT_INDEX_KEY = "key";
    static final java.lang.String FRAGMENT_TAG = "com.bumptech.glide.manager";
    private static final int ID_REMOVE_FRAGMENT_MANAGER = 1;
    private static final int ID_REMOVE_SUPPORT_FRAGMENT_MANAGER = 2;
    private static final java.lang.String TAG = "RMRetriever";
    private volatile com.bumptech.glide.RequestManager applicationManager;
    private final com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory factory;
    private final com.bumptech.glide.manager.FrameWaiter frameWaiter;
    private final android.os.Handler handler;
    final java.util.Map<android.app.FragmentManager, com.bumptech.glide.manager.RequestManagerFragment> pendingRequestManagerFragments = new java.util.HashMap();
    final java.util.Map<androidx.fragment.app.FragmentManager, com.bumptech.glide.manager.SupportRequestManagerFragment> pendingSupportRequestManagerFragments = new java.util.HashMap();
    private final androidx.collection.ArrayMap<android.view.View, androidx.fragment.app.Fragment> tempViewToSupportFragment = new androidx.collection.ArrayMap<>();
    private final androidx.collection.ArrayMap<android.view.View, android.app.Fragment> tempViewToFragment = new androidx.collection.ArrayMap<>();
    private final android.os.Bundle tempBundle = new android.os.Bundle();

    public interface RequestManagerFactory {
        com.bumptech.glide.RequestManager build(com.bumptech.glide.Glide glide, com.bumptech.glide.manager.Lifecycle lifecycle, com.bumptech.glide.manager.RequestManagerTreeNode requestManagerTreeNode, android.content.Context context);
    }

    public RequestManagerRetriever(com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory requestManagerFactory, com.bumptech.glide.GlideExperiments glideExperiments) {
        this.factory = requestManagerFactory == null ? DEFAULT_FACTORY : requestManagerFactory;
        this.handler = new android.os.Handler(android.os.Looper.getMainLooper(), this);
        this.frameWaiter = buildFrameWaiter(glideExperiments);
    }

    private static com.bumptech.glide.manager.FrameWaiter buildFrameWaiter(com.bumptech.glide.GlideExperiments glideExperiments) {
        if (!com.bumptech.glide.load.resource.bitmap.HardwareConfigState.HARDWARE_BITMAPS_SUPPORTED || !com.bumptech.glide.load.resource.bitmap.HardwareConfigState.BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED) {
            return new com.bumptech.glide.manager.DoNothingFirstFrameWaiter();
        }
        if (glideExperiments.isEnabled(com.bumptech.glide.GlideBuilder.WaitForFramesAfterTrimMemory.class)) {
            return new com.bumptech.glide.manager.FirstFrameAndAfterTrimMemoryWaiter();
        }
        return new com.bumptech.glide.manager.FirstFrameWaiter();
    }

    private com.bumptech.glide.RequestManager getApplicationManager(android.content.Context context) {
        if (this.applicationManager == null) {
            synchronized (this) {
                if (this.applicationManager == null) {
                    this.applicationManager = this.factory.build(com.bumptech.glide.Glide.get(context.getApplicationContext()), new com.bumptech.glide.manager.ApplicationLifecycle(), new com.bumptech.glide.manager.EmptyRequestManagerTreeNode(), context.getApplicationContext());
                }
            }
        }
        return this.applicationManager;
    }

    public com.bumptech.glide.RequestManager get(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (com.bumptech.glide.util.Util.isOnMainThread() && !(context instanceof android.app.Application)) {
            if (context instanceof androidx.fragment.app.FragmentActivity) {
                return get((androidx.fragment.app.FragmentActivity) context);
            }
            if (context instanceof android.app.Activity) {
                return get((android.app.Activity) context);
            }
            if (context instanceof android.content.ContextWrapper) {
                android.content.ContextWrapper contextWrapper = (android.content.ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return get(contextWrapper.getBaseContext());
                }
            }
        }
        return getApplicationManager(context);
    }

    public com.bumptech.glide.RequestManager get(androidx.fragment.app.FragmentActivity fragmentActivity) {
        if (com.bumptech.glide.util.Util.isOnBackgroundThread()) {
            return get(fragmentActivity.getApplicationContext());
        }
        assertNotDestroyed(fragmentActivity);
        this.frameWaiter.registerSelf(fragmentActivity);
        return supportFragmentGet(fragmentActivity, fragmentActivity.getSupportFragmentManager(), null, isActivityVisible(fragmentActivity));
    }

    public com.bumptech.glide.RequestManager get(androidx.fragment.app.Fragment fragment) {
        com.bumptech.glide.util.Preconditions.checkNotNull(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (com.bumptech.glide.util.Util.isOnBackgroundThread()) {
            return get(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.frameWaiter.registerSelf(fragment.getActivity());
        }
        return supportFragmentGet(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    public com.bumptech.glide.RequestManager get(android.app.Activity activity) {
        if (com.bumptech.glide.util.Util.isOnBackgroundThread()) {
            return get(activity.getApplicationContext());
        }
        if (activity instanceof androidx.fragment.app.FragmentActivity) {
            return get((androidx.fragment.app.FragmentActivity) activity);
        }
        assertNotDestroyed(activity);
        this.frameWaiter.registerSelf(activity);
        return fragmentGet(activity, activity.getFragmentManager(), null, isActivityVisible(activity));
    }

    public com.bumptech.glide.RequestManager get(android.view.View view) {
        if (com.bumptech.glide.util.Util.isOnBackgroundThread()) {
            return get(view.getContext().getApplicationContext());
        }
        com.bumptech.glide.util.Preconditions.checkNotNull(view);
        com.bumptech.glide.util.Preconditions.checkNotNull(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        android.app.Activity findActivity = findActivity(view.getContext());
        if (findActivity == null) {
            return get(view.getContext().getApplicationContext());
        }
        if (findActivity instanceof androidx.fragment.app.FragmentActivity) {
            androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) findActivity;
            androidx.fragment.app.Fragment findSupportFragment = findSupportFragment(view, fragmentActivity);
            return findSupportFragment != null ? get(findSupportFragment) : get(fragmentActivity);
        }
        android.app.Fragment findFragment = findFragment(view, findActivity);
        if (findFragment == null) {
            return get(findActivity);
        }
        return get(findFragment);
    }

    private static void findAllSupportFragmentsWithViews(java.util.Collection<androidx.fragment.app.Fragment> collection, java.util.Map<android.view.View, androidx.fragment.app.Fragment> map) {
        if (collection == null) {
            return;
        }
        for (androidx.fragment.app.Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                findAllSupportFragmentsWithViews(fragment.getChildFragmentManager().getFragments(), map);
            }
        }
    }

    private androidx.fragment.app.Fragment findSupportFragment(android.view.View view, androidx.fragment.app.FragmentActivity fragmentActivity) {
        this.tempViewToSupportFragment.clear();
        findAllSupportFragmentsWithViews(fragmentActivity.getSupportFragmentManager().getFragments(), this.tempViewToSupportFragment);
        android.view.View findViewById = fragmentActivity.findViewById(android.R.id.content);
        androidx.fragment.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = (androidx.fragment.app.Fragment) this.tempViewToSupportFragment.get(view)) == null && (view.getParent() instanceof android.view.View)) {
            view = (android.view.View) view.getParent();
        }
        this.tempViewToSupportFragment.clear();
        return fragment;
    }

    @java.lang.Deprecated
    private android.app.Fragment findFragment(android.view.View view, android.app.Activity activity) {
        this.tempViewToFragment.clear();
        findAllFragmentsWithViews(activity.getFragmentManager(), this.tempViewToFragment);
        android.view.View findViewById = activity.findViewById(android.R.id.content);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = (android.app.Fragment) this.tempViewToFragment.get(view)) == null && (view.getParent() instanceof android.view.View)) {
            view = (android.view.View) view.getParent();
        }
        this.tempViewToFragment.clear();
        return fragment;
    }

    @java.lang.Deprecated
    private void findAllFragmentsWithViews(android.app.FragmentManager fragmentManager, androidx.collection.ArrayMap<android.view.View, android.app.Fragment> arrayMap) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    arrayMap.put(fragment.getView(), fragment);
                    findAllFragmentsWithViews(fragment.getChildFragmentManager(), arrayMap);
                }
            }
            return;
        }
        findAllFragmentsWithViewsPreO(fragmentManager, arrayMap);
    }

    @java.lang.Deprecated
    private void findAllFragmentsWithViewsPreO(android.app.FragmentManager fragmentManager, androidx.collection.ArrayMap<android.view.View, android.app.Fragment> arrayMap) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.tempBundle.putInt(FRAGMENT_INDEX_KEY, i);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.tempBundle, FRAGMENT_INDEX_KEY);
            } catch (java.lang.Exception unused) {
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                arrayMap.put(fragment.getView(), fragment);
                if (android.os.Build.VERSION.SDK_INT >= 17) {
                    findAllFragmentsWithViews(fragment.getChildFragmentManager(), arrayMap);
                }
            }
            i = i2;
        }
    }

    private static android.app.Activity findActivity(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (context instanceof android.content.ContextWrapper) {
            return findActivity(((android.content.ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void assertNotDestroyed(android.app.Activity activity) {
        if (android.os.Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new java.lang.IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    @java.lang.Deprecated
    public com.bumptech.glide.RequestManager get(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new java.lang.IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if (com.bumptech.glide.util.Util.isOnBackgroundThread() || android.os.Build.VERSION.SDK_INT < 17) {
            return get(fragment.getActivity().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.frameWaiter.registerSelf(fragment.getActivity());
        }
        return fragmentGet(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @java.lang.Deprecated
    com.bumptech.glide.manager.RequestManagerFragment getRequestManagerFragment(android.app.Activity activity) {
        return getRequestManagerFragment(activity.getFragmentManager(), null);
    }

    private com.bumptech.glide.manager.RequestManagerFragment getRequestManagerFragment(android.app.FragmentManager fragmentManager, android.app.Fragment fragment) {
        com.bumptech.glide.manager.RequestManagerFragment requestManagerFragment = (com.bumptech.glide.manager.RequestManagerFragment) fragmentManager.findFragmentByTag(FRAGMENT_TAG);
        if (requestManagerFragment != null) {
            return requestManagerFragment;
        }
        com.bumptech.glide.manager.RequestManagerFragment requestManagerFragment2 = this.pendingRequestManagerFragments.get(fragmentManager);
        if (requestManagerFragment2 != null) {
            return requestManagerFragment2;
        }
        com.bumptech.glide.manager.RequestManagerFragment requestManagerFragment3 = new com.bumptech.glide.manager.RequestManagerFragment();
        requestManagerFragment3.setParentFragmentHint(fragment);
        this.pendingRequestManagerFragments.put(fragmentManager, requestManagerFragment3);
        fragmentManager.beginTransaction().add(requestManagerFragment3, FRAGMENT_TAG).commitAllowingStateLoss();
        this.handler.obtainMessage(1, fragmentManager).sendToTarget();
        return requestManagerFragment3;
    }

    @java.lang.Deprecated
    private com.bumptech.glide.RequestManager fragmentGet(android.content.Context context, android.app.FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        com.bumptech.glide.manager.RequestManagerFragment requestManagerFragment = getRequestManagerFragment(fragmentManager, fragment);
        com.bumptech.glide.RequestManager requestManager = requestManagerFragment.getRequestManager();
        if (requestManager == null) {
            requestManager = this.factory.build(com.bumptech.glide.Glide.get(context), requestManagerFragment.getGlideLifecycle(), requestManagerFragment.getRequestManagerTreeNode(), context);
            if (z) {
                requestManager.onStart();
            }
            requestManagerFragment.setRequestManager(requestManager);
        }
        return requestManager;
    }

    com.bumptech.glide.manager.SupportRequestManagerFragment getSupportRequestManagerFragment(androidx.fragment.app.FragmentManager fragmentManager) {
        return getSupportRequestManagerFragment(fragmentManager, null);
    }

    private static boolean isActivityVisible(android.content.Context context) {
        android.app.Activity findActivity = findActivity(context);
        return findActivity == null || !findActivity.isFinishing();
    }

    private com.bumptech.glide.manager.SupportRequestManagerFragment getSupportRequestManagerFragment(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        com.bumptech.glide.manager.SupportRequestManagerFragment supportRequestManagerFragment = (com.bumptech.glide.manager.SupportRequestManagerFragment) fragmentManager.findFragmentByTag(FRAGMENT_TAG);
        if (supportRequestManagerFragment != null) {
            return supportRequestManagerFragment;
        }
        com.bumptech.glide.manager.SupportRequestManagerFragment supportRequestManagerFragment2 = this.pendingSupportRequestManagerFragments.get(fragmentManager);
        if (supportRequestManagerFragment2 != null) {
            return supportRequestManagerFragment2;
        }
        com.bumptech.glide.manager.SupportRequestManagerFragment supportRequestManagerFragment3 = new com.bumptech.glide.manager.SupportRequestManagerFragment();
        supportRequestManagerFragment3.setParentFragmentHint(fragment);
        this.pendingSupportRequestManagerFragments.put(fragmentManager, supportRequestManagerFragment3);
        fragmentManager.beginTransaction().add(supportRequestManagerFragment3, FRAGMENT_TAG).commitAllowingStateLoss();
        this.handler.obtainMessage(2, fragmentManager).sendToTarget();
        return supportRequestManagerFragment3;
    }

    private com.bumptech.glide.RequestManager supportFragmentGet(android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, boolean z) {
        com.bumptech.glide.manager.SupportRequestManagerFragment supportRequestManagerFragment = getSupportRequestManagerFragment(fragmentManager, fragment);
        com.bumptech.glide.RequestManager requestManager = supportRequestManagerFragment.getRequestManager();
        if (requestManager == null) {
            requestManager = this.factory.build(com.bumptech.glide.Glide.get(context), supportRequestManagerFragment.getGlideLifecycle(), supportRequestManagerFragment.getRequestManagerTreeNode(), context);
            if (z) {
                requestManager.onStart();
            }
            supportRequestManagerFragment.setRequestManager(requestManager);
        }
        return requestManager;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        androidx.fragment.app.FragmentManager fragmentManager;
        java.lang.Object remove;
        androidx.fragment.app.FragmentManager fragmentManager2;
        int i = message.what;
        java.lang.Object obj = null;
        boolean z = true;
        if (i == 1) {
            fragmentManager = (android.app.FragmentManager) message.obj;
            remove = this.pendingRequestManagerFragments.remove(fragmentManager);
        } else if (i == 2) {
            fragmentManager = (androidx.fragment.app.FragmentManager) message.obj;
            remove = this.pendingSupportRequestManagerFragments.remove(fragmentManager);
        } else {
            z = false;
            fragmentManager2 = null;
            if (z && obj == null && android.util.Log.isLoggable(TAG, 5)) {
                android.util.Log.w(TAG, "Failed to remove expected request manager fragment, manager: " + fragmentManager2);
            }
            return z;
        }
        androidx.fragment.app.FragmentManager fragmentManager3 = fragmentManager;
        obj = remove;
        fragmentManager2 = fragmentManager3;
        if (z) {
            android.util.Log.w(TAG, "Failed to remove expected request manager fragment, manager: " + fragmentManager2);
        }
        return z;
    }
}
