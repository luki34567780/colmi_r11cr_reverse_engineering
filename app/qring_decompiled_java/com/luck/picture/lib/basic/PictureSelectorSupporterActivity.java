package com.luck.picture.lib.basic;

/* loaded from: /tmp/dex/classes2.dex */
public class PictureSelectorSupporterActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.luck.picture.lib.config.SelectorConfig selectorConfig;

    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initSelectorConfig();
        immersive();
        setContentView(com.luck.picture.lib.R.layout.ps_activity_container);
        setupFragment();
    }

    private void initSelectorConfig() {
        this.selectorConfig = com.luck.picture.lib.config.SelectorProviders.getInstance().getSelectorConfig();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void immersive() {
        com.luck.picture.lib.style.SelectMainStyle selectMainStyle = this.selectorConfig.selectorStyle.getSelectMainStyle();
        int statusBarColor = selectMainStyle.getStatusBarColor();
        int navigationBarColor = selectMainStyle.getNavigationBarColor();
        boolean isDarkStatusBarBlack = selectMainStyle.isDarkStatusBarBlack();
        if (!com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(statusBarColor)) {
            statusBarColor = androidx.core.content.ContextCompat.getColor(this, com.luck.picture.lib.R.color.ps_color_grey);
        }
        if (!com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(navigationBarColor)) {
            navigationBarColor = androidx.core.content.ContextCompat.getColor(this, com.luck.picture.lib.R.color.ps_color_grey);
        }
        com.luck.picture.lib.immersive.ImmersiveManager.immersiveAboveAPI23(this, statusBarColor, navigationBarColor, isDarkStatusBarBlack);
    }

    private void setupFragment() {
        com.luck.picture.lib.basic.FragmentInjectManager.injectFragment(this, com.luck.picture.lib.PictureSelectorFragment.TAG, com.luck.picture.lib.PictureSelectorFragment.newInstance());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initAppLanguage() {
        com.luck.picture.lib.config.SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig == null || selectorConfig.language == -2 || this.selectorConfig.isOnlyCamera) {
            return;
        }
        com.luck.picture.lib.language.PictureLanguageUtils.setAppLanguage(this, this.selectorConfig.language, this.selectorConfig.defaultLanguage);
    }

    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        initAppLanguage();
    }

    protected void attachBaseContext(android.content.Context context) {
        com.luck.picture.lib.config.SelectorConfig selectorConfig = com.luck.picture.lib.config.SelectorProviders.getInstance().getSelectorConfig();
        if (selectorConfig != null) {
            super.attachBaseContext(com.luck.picture.lib.basic.PictureContextWrapper.wrap(context, selectorConfig.language, selectorConfig.defaultLanguage));
        } else {
            super.attachBaseContext(context);
        }
    }

    public void finish() {
        super.finish();
        com.luck.picture.lib.config.SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig != null) {
            overridePendingTransition(0, selectorConfig.selectorStyle.getWindowAnimationStyle().activityExitAnimation);
        }
    }
}
