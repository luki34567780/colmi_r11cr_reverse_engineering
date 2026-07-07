package com.gyf.immersionbar;

/* loaded from: /tmp/dex/classes2.dex */
final class NavigationBarObserver extends android.database.ContentObserver {
    private android.app.Application mApplication;
    private java.lang.Boolean mIsRegister;
    private java.util.ArrayList<com.gyf.immersionbar.OnNavigationBarListener> mListeners;

    static com.gyf.immersionbar.NavigationBarObserver getInstance() {
        return com.gyf.immersionbar.NavigationBarObserver.NavigationBarObserverInstance.INSTANCE;
    }

    private NavigationBarObserver() {
        super(new android.os.Handler(android.os.Looper.getMainLooper()));
        this.mIsRegister = false;
    }

    void register(android.app.Application application) {
        android.app.Application application2;
        this.mApplication = application;
        if (android.os.Build.VERSION.SDK_INT < 17 || (application2 = this.mApplication) == null || application2.getContentResolver() == null || this.mIsRegister.booleanValue()) {
            return;
        }
        android.net.Uri uri = null;
        if (com.gyf.immersionbar.OSUtils.isMIUI()) {
            uri = android.provider.Settings.Global.getUriFor("force_fsg_nav_bar");
        } else if (com.gyf.immersionbar.OSUtils.isEMUI()) {
            if (com.gyf.immersionbar.OSUtils.isEMUI3_x() || android.os.Build.VERSION.SDK_INT < 21) {
                uri = android.provider.Settings.System.getUriFor("navigationbar_is_min");
            } else {
                uri = android.provider.Settings.Global.getUriFor("navigationbar_is_min");
            }
        }
        if (uri != null) {
            this.mApplication.getContentResolver().registerContentObserver(uri, true, this);
            this.mIsRegister = true;
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        android.app.Application application;
        java.util.ArrayList<com.gyf.immersionbar.OnNavigationBarListener> arrayList;
        int i;
        super.onChange(z);
        if (android.os.Build.VERSION.SDK_INT < 17 || (application = this.mApplication) == null || application.getContentResolver() == null || (arrayList = this.mListeners) == null || arrayList.isEmpty()) {
            return;
        }
        if (com.gyf.immersionbar.OSUtils.isMIUI()) {
            i = android.provider.Settings.Global.getInt(this.mApplication.getContentResolver(), "force_fsg_nav_bar", 0);
        } else if (!com.gyf.immersionbar.OSUtils.isEMUI()) {
            i = 0;
        } else if (com.gyf.immersionbar.OSUtils.isEMUI3_x() || android.os.Build.VERSION.SDK_INT < 21) {
            i = android.provider.Settings.System.getInt(this.mApplication.getContentResolver(), "navigationbar_is_min", 0);
        } else {
            i = android.provider.Settings.Global.getInt(this.mApplication.getContentResolver(), "navigationbar_is_min", 0);
        }
        java.util.Iterator<com.gyf.immersionbar.OnNavigationBarListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            com.gyf.immersionbar.OnNavigationBarListener next = it.next();
            boolean z2 = true;
            if (i == 1) {
                z2 = false;
            }
            next.onNavigationBarChange(z2);
        }
    }

    void addOnNavigationBarListener(com.gyf.immersionbar.OnNavigationBarListener onNavigationBarListener) {
        if (onNavigationBarListener == null) {
            return;
        }
        if (this.mListeners == null) {
            this.mListeners = new java.util.ArrayList<>();
        }
        if (this.mListeners.contains(onNavigationBarListener)) {
            return;
        }
        this.mListeners.add(onNavigationBarListener);
    }

    void removeOnNavigationBarListener(com.gyf.immersionbar.OnNavigationBarListener onNavigationBarListener) {
        java.util.ArrayList<com.gyf.immersionbar.OnNavigationBarListener> arrayList;
        if (onNavigationBarListener == null || (arrayList = this.mListeners) == null) {
            return;
        }
        arrayList.remove(onNavigationBarListener);
    }

    private static class NavigationBarObserverInstance {
        private static final com.gyf.immersionbar.NavigationBarObserver INSTANCE = new com.gyf.immersionbar.NavigationBarObserver();

        private NavigationBarObserverInstance() {
        }
    }
}
