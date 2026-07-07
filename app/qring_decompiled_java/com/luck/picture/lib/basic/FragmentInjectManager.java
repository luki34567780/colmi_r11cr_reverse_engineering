package com.luck.picture.lib.basic;

/* loaded from: /tmp/dex/classes2.dex */
public class FragmentInjectManager {
    public static void injectFragment(androidx.fragment.app.FragmentActivity fragmentActivity, java.lang.String str, androidx.fragment.app.Fragment fragment) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.checkFragmentNonExits(fragmentActivity, str)) {
            fragmentActivity.getSupportFragmentManager().beginTransaction().add(com.luck.picture.lib.R.id.fragment_container, fragment, str).addToBackStack(str).commitAllowingStateLoss();
        }
    }

    public static void injectSystemRoomFragment(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, androidx.fragment.app.Fragment fragment) {
        fragmentManager.beginTransaction().add(android.R.id.content, fragment, str).addToBackStack(str).commitAllowingStateLoss();
    }
}
