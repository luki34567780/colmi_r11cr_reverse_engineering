package com.gyf.immersionbar;

/* loaded from: /tmp/dex/classes2.dex */
public final class SupportRequestManagerFragment extends androidx.fragment.app.Fragment {
    private com.gyf.immersionbar.ImmersionDelegate mDelegate;

    public com.gyf.immersionbar.ImmersionBar get(java.lang.Object obj) {
        if (this.mDelegate == null) {
            this.mDelegate = new com.gyf.immersionbar.ImmersionDelegate(obj);
        }
        return this.mDelegate.get();
    }

    public com.gyf.immersionbar.ImmersionBar get(android.app.Activity activity, android.app.Dialog dialog) {
        if (this.mDelegate == null) {
            this.mDelegate = new com.gyf.immersionbar.ImmersionDelegate(activity, dialog);
        }
        return this.mDelegate.get();
    }

    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        com.gyf.immersionbar.ImmersionDelegate immersionDelegate = this.mDelegate;
        if (immersionDelegate != null) {
            immersionDelegate.onActivityCreated(getResources().getConfiguration());
        }
    }

    public void onResume() {
        super.onResume();
        com.gyf.immersionbar.ImmersionDelegate immersionDelegate = this.mDelegate;
        if (immersionDelegate != null) {
            immersionDelegate.onResume();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        com.gyf.immersionbar.ImmersionDelegate immersionDelegate = this.mDelegate;
        if (immersionDelegate != null) {
            immersionDelegate.onDestroy();
            this.mDelegate = null;
        }
    }

    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.gyf.immersionbar.ImmersionDelegate immersionDelegate = this.mDelegate;
        if (immersionDelegate != null) {
            immersionDelegate.onConfigurationChanged(configuration);
        }
    }
}
