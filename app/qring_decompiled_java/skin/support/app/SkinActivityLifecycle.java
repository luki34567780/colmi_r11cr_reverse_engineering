package skin.support.app;

/* loaded from: classes3.dex */
public class SkinActivityLifecycle implements android.app.Application.ActivityLifecycleCallbacks {
    private static final java.lang.String TAG = "SkinActivityLifecycle";
    private static volatile skin.support.app.SkinActivityLifecycle sInstance;
    private java.lang.ref.WeakReference<android.app.Activity> mCurActivityRef;
    private java.util.WeakHashMap<android.content.Context, skin.support.app.SkinCompatDelegate> mSkinDelegateMap;
    private java.util.WeakHashMap<android.content.Context, skin.support.app.SkinActivityLifecycle.LazySkinObserver> mSkinObserverMap;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }

    public static skin.support.app.SkinActivityLifecycle init(android.app.Application application) {
        if (sInstance == null) {
            synchronized (skin.support.app.SkinActivityLifecycle.class) {
                if (sInstance == null) {
                    sInstance = new skin.support.app.SkinActivityLifecycle(application);
                }
            }
        }
        return sInstance;
    }

    private SkinActivityLifecycle(android.app.Application application) {
        application.registerActivityLifecycleCallbacks(this);
        installLayoutFactory(application);
        skin.support.SkinCompatManager.getInstance().addObserver(getObserver(application));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (isContextSkinEnable(activity)) {
            installLayoutFactory(activity);
            updateWindowBackground(activity);
            if (activity instanceof skin.support.widget.SkinCompatSupportable) {
                ((skin.support.widget.SkinCompatSupportable) activity).applySkin();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        this.mCurActivityRef = new java.lang.ref.WeakReference<>(activity);
        if (isContextSkinEnable(activity)) {
            skin.support.app.SkinActivityLifecycle.LazySkinObserver observer = getObserver(activity);
            skin.support.SkinCompatManager.getInstance().addObserver(observer);
            observer.updateSkinIfNeeded();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        if (isContextSkinEnable(activity)) {
            skin.support.SkinCompatManager.getInstance().deleteObserver(getObserver(activity));
            this.mSkinObserverMap.remove(activity);
            this.mSkinDelegateMap.remove(activity);
        }
    }

    private void installLayoutFactory(android.content.Context context) {
        try {
            skin.support.view.LayoutInflaterCompat.setFactory2(android.view.LayoutInflater.from(context), getSkinDelegate(context));
        } catch (java.lang.Throwable unused) {
            skin.support.utils.Slog.i("SkinActivity", "A factory has already been set on this LayoutInflater");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public skin.support.app.SkinCompatDelegate getSkinDelegate(android.content.Context context) {
        if (this.mSkinDelegateMap == null) {
            this.mSkinDelegateMap = new java.util.WeakHashMap<>();
        }
        skin.support.app.SkinCompatDelegate skinCompatDelegate = this.mSkinDelegateMap.get(context);
        if (skinCompatDelegate != null) {
            return skinCompatDelegate;
        }
        skin.support.app.SkinCompatDelegate create = skin.support.app.SkinCompatDelegate.create(context);
        this.mSkinDelegateMap.put(context, create);
        return create;
    }

    private skin.support.app.SkinActivityLifecycle.LazySkinObserver getObserver(android.content.Context context) {
        if (this.mSkinObserverMap == null) {
            this.mSkinObserverMap = new java.util.WeakHashMap<>();
        }
        skin.support.app.SkinActivityLifecycle.LazySkinObserver lazySkinObserver = this.mSkinObserverMap.get(context);
        if (lazySkinObserver != null) {
            return lazySkinObserver;
        }
        skin.support.app.SkinActivityLifecycle.LazySkinObserver lazySkinObserver2 = new skin.support.app.SkinActivityLifecycle.LazySkinObserver(context);
        this.mSkinObserverMap.put(context, lazySkinObserver2);
        return lazySkinObserver2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateWindowBackground(android.app.Activity activity) {
        android.graphics.drawable.Drawable drawable;
        if (skin.support.SkinCompatManager.getInstance().isSkinWindowBackgroundEnable()) {
            int windowBackgroundResId = skin.support.content.res.SkinCompatThemeUtils.getWindowBackgroundResId(activity);
            if (skin.support.widget.SkinCompatHelper.checkResourceId(windowBackgroundResId) == 0 || (drawable = skin.support.content.res.SkinCompatResources.getDrawable(activity, windowBackgroundResId)) == null) {
                return;
            }
            activity.getWindow().setBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isContextSkinEnable(android.content.Context context) {
        return skin.support.SkinCompatManager.getInstance().isSkinAllActivityEnable() || context.getClass().getAnnotation(skin.support.annotation.Skinable.class) != null || (context instanceof skin.support.widget.SkinCompatSupportable);
    }

    private class LazySkinObserver implements skin.support.observe.SkinObserver {
        private final android.content.Context mContext;
        private boolean mMarkNeedUpdate = false;

        LazySkinObserver(android.content.Context context) {
            this.mContext = context;
        }

        @Override // skin.support.observe.SkinObserver
        public void updateSkin(skin.support.observe.SkinObservable skinObservable, java.lang.Object obj) {
            if (skin.support.app.SkinActivityLifecycle.this.mCurActivityRef == null || this.mContext == skin.support.app.SkinActivityLifecycle.this.mCurActivityRef.get() || !(this.mContext instanceof android.app.Activity)) {
                updateSkinForce();
            } else {
                this.mMarkNeedUpdate = true;
            }
        }

        void updateSkinIfNeeded() {
            if (this.mMarkNeedUpdate) {
                updateSkinForce();
            }
        }

        void updateSkinForce() {
            if (skin.support.utils.Slog.DEBUG) {
                skin.support.utils.Slog.i(skin.support.app.SkinActivityLifecycle.TAG, "Context: " + this.mContext + " updateSkinForce");
            }
            android.content.Context context = this.mContext;
            if (context == null) {
                return;
            }
            if ((context instanceof android.app.Activity) && skin.support.app.SkinActivityLifecycle.this.isContextSkinEnable(context)) {
                skin.support.app.SkinActivityLifecycle.this.updateWindowBackground((android.app.Activity) this.mContext);
            }
            skin.support.app.SkinActivityLifecycle.this.getSkinDelegate(this.mContext).applySkin();
            java.lang.Object obj = this.mContext;
            if (obj instanceof skin.support.widget.SkinCompatSupportable) {
                ((skin.support.widget.SkinCompatSupportable) obj).applySkin();
            }
            this.mMarkNeedUpdate = false;
        }
    }
}
