package com.luck.picture.lib.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class ActivityCompatHelper {
    private static final int MIN_FRAGMENT_COUNT = 1;

    public static boolean isDestroy(android.app.Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    public static boolean checkFragmentNonExits(androidx.fragment.app.FragmentActivity fragmentActivity, java.lang.String str) {
        return !isDestroy(fragmentActivity) && fragmentActivity.getSupportFragmentManager().findFragmentByTag(str) == null;
    }

    public static boolean assertValidRequest(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return !isDestroy((android.app.Activity) context);
        }
        if (context instanceof android.content.ContextWrapper) {
            if (((android.content.ContextWrapper) context).getBaseContext() instanceof android.app.Activity) {
                return !isDestroy((android.app.Activity) r2.getBaseContext());
            }
        }
        return true;
    }

    public static boolean checkRootFragment(androidx.fragment.app.FragmentActivity fragmentActivity) {
        return !isDestroy(fragmentActivity) && fragmentActivity.getSupportFragmentManager().getBackStackEntryCount() == 1;
    }
}
