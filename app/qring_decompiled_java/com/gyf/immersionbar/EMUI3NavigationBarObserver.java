package com.gyf.immersionbar;

/* loaded from: /tmp/dex/classes2.dex */
final class EMUI3NavigationBarObserver extends android.database.ContentObserver {
    private android.app.Application mApplication;
    private java.util.ArrayList<com.gyf.immersionbar.ImmersionCallback> mCallbacks;
    private java.lang.Boolean mIsRegister;

    static com.gyf.immersionbar.EMUI3NavigationBarObserver getInstance() {
        return com.gyf.immersionbar.EMUI3NavigationBarObserver.NavigationBarObserverInstance.INSTANCE;
    }

    private EMUI3NavigationBarObserver() {
        super(new android.os.Handler(android.os.Looper.getMainLooper()));
        this.mIsRegister = false;
    }

    void register(android.app.Application application) {
        android.app.Application application2;
        android.net.Uri uriFor;
        this.mApplication = application;
        if (android.os.Build.VERSION.SDK_INT < 17 || (application2 = this.mApplication) == null || application2.getContentResolver() == null || this.mIsRegister.booleanValue() || (uriFor = android.provider.Settings.System.getUriFor("navigationbar_is_min")) == null) {
            return;
        }
        this.mApplication.getContentResolver().registerContentObserver(uriFor, true, this);
        this.mIsRegister = true;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        android.app.Application application;
        java.util.ArrayList<com.gyf.immersionbar.ImmersionCallback> arrayList;
        super.onChange(z);
        if (android.os.Build.VERSION.SDK_INT < 17 || (application = this.mApplication) == null || application.getContentResolver() == null || (arrayList = this.mCallbacks) == null || arrayList.isEmpty()) {
            return;
        }
        int i = android.provider.Settings.System.getInt(this.mApplication.getContentResolver(), "navigationbar_is_min", 0);
        java.util.Iterator<com.gyf.immersionbar.ImmersionCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            com.gyf.immersionbar.ImmersionCallback next = it.next();
            boolean z2 = true;
            if (i == 1) {
                z2 = false;
            }
            next.onNavigationBarChange(z2);
        }
    }

    void addOnNavigationBarListener(com.gyf.immersionbar.ImmersionCallback immersionCallback) {
        if (immersionCallback == null) {
            return;
        }
        if (this.mCallbacks == null) {
            this.mCallbacks = new java.util.ArrayList<>();
        }
        if (this.mCallbacks.contains(immersionCallback)) {
            return;
        }
        this.mCallbacks.add(immersionCallback);
    }

    void removeOnNavigationBarListener(com.gyf.immersionbar.ImmersionCallback immersionCallback) {
        java.util.ArrayList<com.gyf.immersionbar.ImmersionCallback> arrayList;
        if (immersionCallback == null || (arrayList = this.mCallbacks) == null) {
            return;
        }
        arrayList.remove(immersionCallback);
    }

    private static class NavigationBarObserverInstance {
        private static final com.gyf.immersionbar.EMUI3NavigationBarObserver INSTANCE = new com.gyf.immersionbar.EMUI3NavigationBarObserver();

        private NavigationBarObserverInstance() {
        }
    }
}
