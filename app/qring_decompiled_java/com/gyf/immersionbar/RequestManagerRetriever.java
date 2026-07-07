package com.gyf.immersionbar;

/* loaded from: /tmp/dex/classes2.dex */
class RequestManagerRetriever implements android.os.Handler.Callback {
    private static final int ID_REMOVE_FRAGMENT_MANAGER = 1;
    private static final int ID_REMOVE_SUPPORT_FRAGMENT_MANAGER = 2;
    private android.os.Handler mHandler;
    private final java.util.Map<android.app.FragmentManager, com.gyf.immersionbar.RequestManagerFragment> mPendingFragments;
    private final java.util.Map<androidx.fragment.app.FragmentManager, com.gyf.immersionbar.SupportRequestManagerFragment> mPendingSupportFragments;
    private java.lang.String mTag;

    private static class Holder {
        private static final com.gyf.immersionbar.RequestManagerRetriever INSTANCE = new com.gyf.immersionbar.RequestManagerRetriever();

        private Holder() {
        }
    }

    static com.gyf.immersionbar.RequestManagerRetriever getInstance() {
        return com.gyf.immersionbar.RequestManagerRetriever.Holder.INSTANCE;
    }

    private RequestManagerRetriever() {
        this.mTag = com.gyf.immersionbar.ImmersionBar.class.getName();
        this.mPendingFragments = new java.util.HashMap();
        this.mPendingSupportFragments = new java.util.HashMap();
        this.mHandler = new android.os.Handler(android.os.Looper.getMainLooper(), this);
    }

    public com.gyf.immersionbar.ImmersionBar get(android.app.Activity activity) {
        checkNotNull(activity, "activity is null");
        java.lang.String str = this.mTag + java.lang.System.identityHashCode(activity);
        if (activity instanceof androidx.fragment.app.FragmentActivity) {
            return getSupportFragment(((androidx.fragment.app.FragmentActivity) activity).getSupportFragmentManager(), str).get(activity);
        }
        return getFragment(activity.getFragmentManager(), str).get(activity);
    }

    public com.gyf.immersionbar.ImmersionBar get(androidx.fragment.app.Fragment fragment, boolean z) {
        java.lang.String str;
        checkNotNull(fragment, "fragment is null");
        checkNotNull(fragment.getActivity(), "fragment.getActivity() is null");
        if (fragment instanceof androidx.fragment.app.DialogFragment) {
            checkNotNull(((androidx.fragment.app.DialogFragment) fragment).getDialog(), "fragment.getDialog() is null");
        }
        java.lang.String str2 = this.mTag;
        if (z) {
            str = str2 + fragment.getClass().getName();
        } else {
            str = str2 + java.lang.System.identityHashCode(fragment);
        }
        return getSupportFragment(fragment.getChildFragmentManager(), str).get(fragment);
    }

    public com.gyf.immersionbar.ImmersionBar get(android.app.Fragment fragment, boolean z) {
        java.lang.String str;
        checkNotNull(fragment, "fragment is null");
        checkNotNull(fragment.getActivity(), "fragment.getActivity() is null");
        if (fragment instanceof android.app.DialogFragment) {
            checkNotNull(((android.app.DialogFragment) fragment).getDialog(), "fragment.getDialog() is null");
        }
        java.lang.String str2 = this.mTag;
        if (z) {
            str = str2 + fragment.getClass().getName();
        } else {
            str = str2 + java.lang.System.identityHashCode(fragment);
        }
        return getFragment(fragment.getChildFragmentManager(), str).get(fragment);
    }

    public com.gyf.immersionbar.ImmersionBar get(android.app.Activity activity, android.app.Dialog dialog) {
        checkNotNull(activity, "activity is null");
        checkNotNull(dialog, "dialog is null");
        java.lang.String str = this.mTag + java.lang.System.identityHashCode(dialog);
        if (activity instanceof androidx.fragment.app.FragmentActivity) {
            return getSupportFragment(((androidx.fragment.app.FragmentActivity) activity).getSupportFragmentManager(), str).get(activity, dialog);
        }
        return getFragment(activity.getFragmentManager(), str).get(activity, dialog);
    }

    public void destroy(androidx.fragment.app.Fragment fragment, boolean z) {
        java.lang.String str;
        if (fragment == null) {
            return;
        }
        java.lang.String str2 = this.mTag;
        if (z) {
            str = str2 + fragment.getClass().getName();
        } else {
            str = str2 + java.lang.System.identityHashCode(fragment);
        }
        getSupportFragment(fragment.getChildFragmentManager(), str, true);
    }

    public void destroy(android.app.Activity activity, android.app.Dialog dialog) {
        if (activity == null || dialog == null) {
            return;
        }
        java.lang.String str = this.mTag + java.lang.System.identityHashCode(dialog);
        if (activity instanceof androidx.fragment.app.FragmentActivity) {
            com.gyf.immersionbar.SupportRequestManagerFragment supportFragment = getSupportFragment(((androidx.fragment.app.FragmentActivity) activity).getSupportFragmentManager(), str, true);
            if (supportFragment != null) {
                supportFragment.get(activity, dialog).onDestroy();
                return;
            }
            return;
        }
        com.gyf.immersionbar.RequestManagerFragment fragment = getFragment(activity.getFragmentManager(), str, true);
        if (fragment != null) {
            fragment.get(activity, dialog).onDestroy();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            this.mPendingFragments.remove((android.app.FragmentManager) message.obj);
            return true;
        }
        if (i != 2) {
            return false;
        }
        this.mPendingSupportFragments.remove((androidx.fragment.app.FragmentManager) message.obj);
        return true;
    }

    private com.gyf.immersionbar.RequestManagerFragment getFragment(android.app.FragmentManager fragmentManager, java.lang.String str) {
        return getFragment(fragmentManager, str, false);
    }

    private com.gyf.immersionbar.RequestManagerFragment getFragment(android.app.FragmentManager fragmentManager, java.lang.String str, boolean z) {
        com.gyf.immersionbar.RequestManagerFragment requestManagerFragment = (com.gyf.immersionbar.RequestManagerFragment) fragmentManager.findFragmentByTag(str);
        if (requestManagerFragment == null && (requestManagerFragment = this.mPendingFragments.get(fragmentManager)) == null) {
            if (z) {
                return null;
            }
            requestManagerFragment = new com.gyf.immersionbar.RequestManagerFragment();
            this.mPendingFragments.put(fragmentManager, requestManagerFragment);
            fragmentManager.beginTransaction().add(requestManagerFragment, str).commitAllowingStateLoss();
            this.mHandler.obtainMessage(1, fragmentManager).sendToTarget();
        }
        if (!z) {
            return requestManagerFragment;
        }
        fragmentManager.beginTransaction().remove(requestManagerFragment).commitAllowingStateLoss();
        return null;
    }

    private com.gyf.immersionbar.SupportRequestManagerFragment getSupportFragment(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        return getSupportFragment(fragmentManager, str, false);
    }

    private com.gyf.immersionbar.SupportRequestManagerFragment getSupportFragment(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, boolean z) {
        com.gyf.immersionbar.SupportRequestManagerFragment supportRequestManagerFragment = (com.gyf.immersionbar.SupportRequestManagerFragment) fragmentManager.findFragmentByTag(str);
        if (supportRequestManagerFragment == null && (supportRequestManagerFragment = this.mPendingSupportFragments.get(fragmentManager)) == null) {
            if (z) {
                return null;
            }
            supportRequestManagerFragment = new com.gyf.immersionbar.SupportRequestManagerFragment();
            this.mPendingSupportFragments.put(fragmentManager, supportRequestManagerFragment);
            fragmentManager.beginTransaction().add(supportRequestManagerFragment, str).commitAllowingStateLoss();
            this.mHandler.obtainMessage(2, fragmentManager).sendToTarget();
        }
        if (!z) {
            return supportRequestManagerFragment;
        }
        fragmentManager.beginTransaction().remove(supportRequestManagerFragment).commitAllowingStateLoss();
        return null;
    }

    private static <T> void checkNotNull(T t, java.lang.String str) {
        java.util.Objects.requireNonNull(t, str);
    }
}
