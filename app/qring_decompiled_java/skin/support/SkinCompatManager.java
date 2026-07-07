package skin.support;

/* loaded from: classes3.dex */
public class SkinCompatManager extends skin.support.observe.SkinObservable {
    public static final int SKIN_LOADER_STRATEGY_ASSETS = 0;
    public static final int SKIN_LOADER_STRATEGY_BUILD_IN = 1;
    public static final int SKIN_LOADER_STRATEGY_NONE = -1;
    public static final int SKIN_LOADER_STRATEGY_PREFIX_BUILD_IN = 2;
    private static volatile skin.support.SkinCompatManager sInstance;
    private final android.content.Context mAppContext;
    private final java.lang.Object mLock = new java.lang.Object();
    private boolean mLoading = false;
    private java.util.List<skin.support.app.SkinWrapper> mWrappers = new java.util.ArrayList();
    private java.util.List<skin.support.app.SkinLayoutInflater> mInflaters = new java.util.ArrayList();
    private java.util.List<skin.support.app.SkinLayoutInflater> mHookInflaters = new java.util.ArrayList();
    private android.util.SparseArray<skin.support.SkinCompatManager.SkinLoaderStrategy> mStrategyMap = new android.util.SparseArray<>();
    private boolean mSkinAllActivityEnable = true;
    private boolean mSkinStatusBarColorEnable = false;
    private boolean mSkinWindowBackgroundColorEnable = true;

    public interface SkinLoaderListener {
        void onFailed(java.lang.String str);

        void onStart();

        void onSuccess();
    }

    public interface SkinLoaderStrategy {
        android.content.res.ColorStateList getColor(android.content.Context context, java.lang.String str, int i);

        android.content.res.ColorStateList getColorStateList(android.content.Context context, java.lang.String str, int i);

        android.graphics.drawable.Drawable getDrawable(android.content.Context context, java.lang.String str, int i);

        java.lang.String getTargetResourceEntryName(android.content.Context context, java.lang.String str, int i);

        int getType();

        java.lang.String loadSkinInBackground(android.content.Context context, java.lang.String str);
    }

    public static skin.support.SkinCompatManager init(android.content.Context context) {
        if (sInstance == null) {
            synchronized (skin.support.SkinCompatManager.class) {
                if (sInstance == null) {
                    sInstance = new skin.support.SkinCompatManager(context);
                }
            }
        }
        skin.support.utils.SkinPreference.init(context);
        return sInstance;
    }

    public static skin.support.SkinCompatManager getInstance() {
        return sInstance;
    }

    public static skin.support.SkinCompatManager withoutActivity(android.app.Application application) {
        init(application);
        skin.support.app.SkinActivityLifecycle.init(application);
        return sInstance;
    }

    private SkinCompatManager(android.content.Context context) {
        this.mAppContext = context.getApplicationContext();
        initLoaderStrategy();
    }

    private void initLoaderStrategy() {
        this.mStrategyMap.put(-1, new skin.support.load.SkinNoneLoader());
        this.mStrategyMap.put(0, new skin.support.load.SkinAssetsLoader());
        this.mStrategyMap.put(1, new skin.support.load.SkinBuildInLoader());
        this.mStrategyMap.put(2, new skin.support.load.SkinPrefixBuildInLoader());
    }

    public android.content.Context getContext() {
        return this.mAppContext;
    }

    public skin.support.SkinCompatManager addStrategy(skin.support.SkinCompatManager.SkinLoaderStrategy skinLoaderStrategy) {
        this.mStrategyMap.put(skinLoaderStrategy.getType(), skinLoaderStrategy);
        return this;
    }

    public android.util.SparseArray<skin.support.SkinCompatManager.SkinLoaderStrategy> getStrategies() {
        return this.mStrategyMap;
    }

    public skin.support.SkinCompatManager addInflater(skin.support.app.SkinLayoutInflater skinLayoutInflater) {
        if (skinLayoutInflater instanceof skin.support.app.SkinWrapper) {
            this.mWrappers.add((skin.support.app.SkinWrapper) skinLayoutInflater);
        }
        this.mInflaters.add(skinLayoutInflater);
        return this;
    }

    public java.util.List<skin.support.app.SkinWrapper> getWrappers() {
        return this.mWrappers;
    }

    public java.util.List<skin.support.app.SkinLayoutInflater> getInflaters() {
        return this.mInflaters;
    }

    @java.lang.Deprecated
    public skin.support.SkinCompatManager addHookInflater(skin.support.app.SkinLayoutInflater skinLayoutInflater) {
        this.mHookInflaters.add(skinLayoutInflater);
        return this;
    }

    @java.lang.Deprecated
    public java.util.List<skin.support.app.SkinLayoutInflater> getHookInflaters() {
        return this.mHookInflaters;
    }

    @java.lang.Deprecated
    public java.lang.String getCurSkinName() {
        return skin.support.utils.SkinPreference.getInstance().getSkinName();
    }

    public void restoreDefaultTheme() {
        loadSkin("", -1);
    }

    public skin.support.SkinCompatManager setSkinAllActivityEnable(boolean z) {
        this.mSkinAllActivityEnable = z;
        return this;
    }

    public boolean isSkinAllActivityEnable() {
        return this.mSkinAllActivityEnable;
    }

    @java.lang.Deprecated
    public skin.support.SkinCompatManager setSkinStatusBarColorEnable(boolean z) {
        this.mSkinStatusBarColorEnable = z;
        return this;
    }

    @java.lang.Deprecated
    public boolean isSkinStatusBarColorEnable() {
        return this.mSkinStatusBarColorEnable;
    }

    public skin.support.SkinCompatManager setSkinWindowBackgroundEnable(boolean z) {
        this.mSkinWindowBackgroundColorEnable = z;
        return this;
    }

    public boolean isSkinWindowBackgroundEnable() {
        return this.mSkinWindowBackgroundColorEnable;
    }

    public android.os.AsyncTask loadSkin() {
        java.lang.String skinName = skin.support.utils.SkinPreference.getInstance().getSkinName();
        int skinStrategy = skin.support.utils.SkinPreference.getInstance().getSkinStrategy();
        if (android.text.TextUtils.isEmpty(skinName) || skinStrategy == -1) {
            return null;
        }
        return loadSkin(skinName, null, skinStrategy);
    }

    public android.os.AsyncTask loadSkin(skin.support.SkinCompatManager.SkinLoaderListener skinLoaderListener) {
        java.lang.String skinName = skin.support.utils.SkinPreference.getInstance().getSkinName();
        int skinStrategy = skin.support.utils.SkinPreference.getInstance().getSkinStrategy();
        if (android.text.TextUtils.isEmpty(skinName) || skinStrategy == -1) {
            return null;
        }
        return loadSkin(skinName, skinLoaderListener, skinStrategy);
    }

    @java.lang.Deprecated
    public android.os.AsyncTask loadSkin(java.lang.String str) {
        return loadSkin(str, (skin.support.SkinCompatManager.SkinLoaderListener) null);
    }

    @java.lang.Deprecated
    public android.os.AsyncTask loadSkin(java.lang.String str, skin.support.SkinCompatManager.SkinLoaderListener skinLoaderListener) {
        return loadSkin(str, skinLoaderListener, 0);
    }

    public android.os.AsyncTask loadSkin(java.lang.String str, int i) {
        return loadSkin(str, null, i);
    }

    public android.os.AsyncTask loadSkin(java.lang.String str, skin.support.SkinCompatManager.SkinLoaderListener skinLoaderListener, int i) {
        skin.support.SkinCompatManager.SkinLoaderStrategy skinLoaderStrategy = this.mStrategyMap.get(i);
        if (skinLoaderStrategy == null) {
            return null;
        }
        return new skin.support.SkinCompatManager.SkinLoadTask(skinLoaderListener, skinLoaderStrategy).executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, str);
    }

    private class SkinLoadTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.String> {
        private final skin.support.SkinCompatManager.SkinLoaderListener mListener;
        private final skin.support.SkinCompatManager.SkinLoaderStrategy mStrategy;

        SkinLoadTask(skin.support.SkinCompatManager.SkinLoaderListener skinLoaderListener, skin.support.SkinCompatManager.SkinLoaderStrategy skinLoaderStrategy) {
            this.mListener = skinLoaderListener;
            this.mStrategy = skinLoaderStrategy;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            skin.support.SkinCompatManager.SkinLoaderListener skinLoaderListener = this.mListener;
            if (skinLoaderListener != null) {
                skinLoaderListener.onStart();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public java.lang.String doInBackground(java.lang.String... strArr) {
            synchronized (skin.support.SkinCompatManager.this.mLock) {
                while (skin.support.SkinCompatManager.this.mLoading) {
                    try {
                        skin.support.SkinCompatManager.this.mLock.wait();
                    } catch (java.lang.InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                skin.support.SkinCompatManager.this.mLoading = true;
            }
            try {
                if (strArr.length == 1) {
                    if (android.text.TextUtils.isEmpty(this.mStrategy.loadSkinInBackground(skin.support.SkinCompatManager.this.mAppContext, strArr[0]))) {
                        skin.support.content.res.SkinCompatResources.getInstance().reset(this.mStrategy);
                        return "";
                    }
                    return strArr[0];
                }
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
            }
            skin.support.content.res.SkinCompatResources.getInstance().reset();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(java.lang.String str) {
            synchronized (skin.support.SkinCompatManager.this.mLock) {
                if (str != null) {
                    skin.support.utils.SkinPreference.getInstance().setSkinName(str).setSkinStrategy(this.mStrategy.getType()).commitEditor();
                    skin.support.SkinCompatManager.this.notifyUpdateSkin();
                    skin.support.SkinCompatManager.SkinLoaderListener skinLoaderListener = this.mListener;
                    if (skinLoaderListener != null) {
                        skinLoaderListener.onSuccess();
                    }
                } else {
                    skin.support.utils.SkinPreference.getInstance().setSkinName("").setSkinStrategy(-1).commitEditor();
                    skin.support.SkinCompatManager.SkinLoaderListener skinLoaderListener2 = this.mListener;
                    if (skinLoaderListener2 != null) {
                        skinLoaderListener2.onFailed("皮肤资源获取失败");
                    }
                }
                skin.support.SkinCompatManager.this.mLoading = false;
                skin.support.SkinCompatManager.this.mLock.notifyAll();
            }
        }
    }

    public java.lang.String getSkinPackageName(java.lang.String str) {
        return this.mAppContext.getPackageManager().getPackageArchiveInfo(str, 1).packageName;
    }

    public android.content.res.Resources getSkinResources(java.lang.String str) {
        try {
            android.content.pm.PackageInfo packageArchiveInfo = this.mAppContext.getPackageManager().getPackageArchiveInfo(str, 0);
            packageArchiveInfo.applicationInfo.sourceDir = str;
            packageArchiveInfo.applicationInfo.publicSourceDir = str;
            android.content.res.Resources resourcesForApplication = this.mAppContext.getPackageManager().getResourcesForApplication(packageArchiveInfo.applicationInfo);
            android.content.res.Resources resources = this.mAppContext.getResources();
            return new android.content.res.Resources(resourcesForApplication.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
