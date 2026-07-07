package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
final class StartActivityManager {
    private static final java.lang.String SUB_INTENT_KEY = "sub_intent_key";

    private interface IStartActivityDelegate {
        void startActivity(android.content.Intent intent);

        void startActivityForResult(android.content.Intent intent, int i);
    }

    StartActivityManager() {
    }

    static android.content.Intent getSubIntentInMainIntent(android.content.Intent intent) {
        if (com.hjq.permissions.AndroidVersion.isAndroid13()) {
            return (android.content.Intent) intent.getParcelableExtra(SUB_INTENT_KEY, android.content.Intent.class);
        }
        return (android.content.Intent) intent.getParcelableExtra(SUB_INTENT_KEY);
    }

    static android.content.Intent getDeepSubIntent(android.content.Intent intent) {
        android.content.Intent subIntentInMainIntent = getSubIntentInMainIntent(intent);
        return subIntentInMainIntent != null ? getDeepSubIntent(subIntentInMainIntent) : intent;
    }

    static android.content.Intent addSubIntentToMainIntent(android.content.Intent intent, android.content.Intent intent2) {
        if (intent == null && intent2 != null) {
            return intent2;
        }
        if (intent2 == null) {
            return intent;
        }
        getDeepSubIntent(intent).putExtra(SUB_INTENT_KEY, intent2);
        return intent;
    }

    static boolean startActivity(android.content.Context context, android.content.Intent intent) {
        return startActivity(new com.hjq.permissions.StartActivityManager.StartActivityDelegateContextImpl(context), intent);
    }

    static boolean startActivity(android.app.Activity activity, android.content.Intent intent) {
        return startActivity(new com.hjq.permissions.StartActivityManager.StartActivityDelegateActivityImpl(activity), intent);
    }

    static boolean startActivity(android.app.Fragment fragment, android.content.Intent intent) {
        return startActivity(new com.hjq.permissions.StartActivityManager.StartActivityDelegateFragmentImpl(fragment), intent);
    }

    static boolean startActivity(androidx.fragment.app.Fragment fragment, android.content.Intent intent) {
        return startActivity(new com.hjq.permissions.StartActivityManager.StartActivityDelegateSupportFragmentImpl(fragment), intent);
    }

    static boolean startActivity(com.hjq.permissions.StartActivityManager.IStartActivityDelegate iStartActivityDelegate, android.content.Intent intent) {
        try {
            iStartActivityDelegate.startActivity(intent);
            return true;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            android.content.Intent subIntentInMainIntent = getSubIntentInMainIntent(intent);
            if (subIntentInMainIntent == null) {
                return false;
            }
            return startActivity(iStartActivityDelegate, subIntentInMainIntent);
        }
    }

    static boolean startActivityForResult(android.app.Activity activity, android.content.Intent intent, int i) {
        return startActivityForResult(new com.hjq.permissions.StartActivityManager.StartActivityDelegateActivityImpl(activity), intent, i);
    }

    static boolean startActivityForResult(android.app.Fragment fragment, android.content.Intent intent, int i) {
        return startActivityForResult(new com.hjq.permissions.StartActivityManager.StartActivityDelegateFragmentImpl(fragment), intent, i);
    }

    static boolean startActivityForResult(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i) {
        return startActivityForResult(new com.hjq.permissions.StartActivityManager.StartActivityDelegateSupportFragmentImpl(fragment), intent, i);
    }

    static boolean startActivityForResult(com.hjq.permissions.StartActivityManager.IStartActivityDelegate iStartActivityDelegate, android.content.Intent intent, int i) {
        try {
            iStartActivityDelegate.startActivityForResult(intent, i);
            return true;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            android.content.Intent subIntentInMainIntent = getSubIntentInMainIntent(intent);
            if (subIntentInMainIntent == null) {
                return false;
            }
            return startActivityForResult(iStartActivityDelegate, subIntentInMainIntent, i);
        }
    }

    private static class StartActivityDelegateContextImpl implements com.hjq.permissions.StartActivityManager.IStartActivityDelegate {
        private final android.content.Context mContext;

        private StartActivityDelegateContextImpl(android.content.Context context) {
            this.mContext = context;
        }

        @Override // com.hjq.permissions.StartActivityManager.IStartActivityDelegate
        public void startActivity(android.content.Intent intent) {
            this.mContext.startActivity(intent);
        }

        @Override // com.hjq.permissions.StartActivityManager.IStartActivityDelegate
        public void startActivityForResult(android.content.Intent intent, int i) {
            android.app.Activity findActivity = com.hjq.permissions.PermissionUtils.findActivity(this.mContext);
            if (findActivity != null) {
                findActivity.startActivityForResult(intent, i);
            } else {
                startActivity(intent);
            }
        }
    }

    private static class StartActivityDelegateActivityImpl implements com.hjq.permissions.StartActivityManager.IStartActivityDelegate {
        private final android.app.Activity mActivity;

        private StartActivityDelegateActivityImpl(android.app.Activity activity) {
            this.mActivity = activity;
        }

        @Override // com.hjq.permissions.StartActivityManager.IStartActivityDelegate
        public void startActivity(android.content.Intent intent) {
            this.mActivity.startActivity(intent);
        }

        @Override // com.hjq.permissions.StartActivityManager.IStartActivityDelegate
        public void startActivityForResult(android.content.Intent intent, int i) {
            this.mActivity.startActivityForResult(intent, i);
        }
    }

    private static class StartActivityDelegateFragmentImpl implements com.hjq.permissions.StartActivityManager.IStartActivityDelegate {
        private final android.app.Fragment mFragment;

        private StartActivityDelegateFragmentImpl(android.app.Fragment fragment) {
            this.mFragment = fragment;
        }

        @Override // com.hjq.permissions.StartActivityManager.IStartActivityDelegate
        public void startActivity(android.content.Intent intent) {
            this.mFragment.startActivity(intent);
        }

        @Override // com.hjq.permissions.StartActivityManager.IStartActivityDelegate
        public void startActivityForResult(android.content.Intent intent, int i) {
            this.mFragment.startActivityForResult(intent, i);
        }
    }

    private static class StartActivityDelegateSupportFragmentImpl implements com.hjq.permissions.StartActivityManager.IStartActivityDelegate {
        private final androidx.fragment.app.Fragment mFragment;

        private StartActivityDelegateSupportFragmentImpl(androidx.fragment.app.Fragment fragment) {
            this.mFragment = fragment;
        }

        @Override // com.hjq.permissions.StartActivityManager.IStartActivityDelegate
        public void startActivity(android.content.Intent intent) {
            this.mFragment.startActivity(intent);
        }

        @Override // com.hjq.permissions.StartActivityManager.IStartActivityDelegate
        public void startActivityForResult(android.content.Intent intent, int i) {
            this.mFragment.startActivityForResult(intent, i);
        }
    }
}
