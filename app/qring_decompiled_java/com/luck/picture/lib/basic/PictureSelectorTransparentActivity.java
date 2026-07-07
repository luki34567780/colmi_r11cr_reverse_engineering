package com.luck.picture.lib.basic;

/* loaded from: /tmp/dex/classes2.dex */
public class PictureSelectorTransparentActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.luck.picture.lib.config.SelectorConfig selectorConfig;

    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initSelectorConfig();
        immersive();
        setContentView(com.luck.picture.lib.R.layout.ps_empty);
        if (!isExternalPreview()) {
            setActivitySize();
        }
        setupFragment();
    }

    private void initSelectorConfig() {
        this.selectorConfig = com.luck.picture.lib.config.SelectorProviders.getInstance().getSelectorConfig();
    }

    private boolean isExternalPreview() {
        return getIntent().getIntExtra(com.luck.picture.lib.config.PictureConfig.EXTRA_MODE_TYPE_SOURCE, 0) == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void immersive() {
        if (this.selectorConfig.selectorStyle == null) {
            com.luck.picture.lib.config.SelectorProviders.getInstance().getSelectorConfig();
        }
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
        java.lang.String str;
        androidx.fragment.app.Fragment newInstance;
        int intExtra = getIntent().getIntExtra(com.luck.picture.lib.config.PictureConfig.EXTRA_MODE_TYPE_SOURCE, 0);
        if (intExtra == 1) {
            str = com.luck.picture.lib.PictureSelectorSystemFragment.TAG;
            newInstance = com.luck.picture.lib.PictureSelectorSystemFragment.newInstance();
        } else if (intExtra == 2) {
            androidx.fragment.app.Fragment onInjectPreviewFragment = this.selectorConfig.onInjectActivityPreviewListener != null ? this.selectorConfig.onInjectActivityPreviewListener.onInjectPreviewFragment() : null;
            if (onInjectPreviewFragment != null) {
                newInstance = onInjectPreviewFragment;
                str = ((com.luck.picture.lib.PictureSelectorPreviewFragment) onInjectPreviewFragment).getFragmentTag();
            } else {
                str = com.luck.picture.lib.PictureSelectorPreviewFragment.TAG;
                newInstance = com.luck.picture.lib.PictureSelectorPreviewFragment.newInstance();
            }
            int intExtra2 = getIntent().getIntExtra(com.luck.picture.lib.config.PictureConfig.EXTRA_PREVIEW_CURRENT_POSITION, 0);
            java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList = new java.util.ArrayList<>(this.selectorConfig.selectedPreviewResult);
            ((com.luck.picture.lib.PictureSelectorPreviewFragment) newInstance).setExternalPreviewData(intExtra2, arrayList.size(), arrayList, getIntent().getBooleanExtra(com.luck.picture.lib.config.PictureConfig.EXTRA_EXTERNAL_PREVIEW_DISPLAY_DELETE, false));
        } else {
            str = com.luck.picture.lib.PictureOnlyCameraFragment.TAG;
            newInstance = com.luck.picture.lib.PictureOnlyCameraFragment.newInstance();
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(str);
        if (findFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        com.luck.picture.lib.basic.FragmentInjectManager.injectSystemRoomFragment(supportFragmentManager, str, newInstance);
    }

    private void setActivitySize() {
        android.view.Window window = getWindow();
        window.setGravity(51);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        attributes.height = 1;
        attributes.width = 1;
        window.setAttributes(attributes);
    }

    public void finish() {
        super.finish();
        if (getIntent().getIntExtra(com.luck.picture.lib.config.PictureConfig.EXTRA_MODE_TYPE_SOURCE, 0) == 2 && !this.selectorConfig.isPreviewZoomEffect) {
            overridePendingTransition(0, this.selectorConfig.selectorStyle.getWindowAnimationStyle().activityExitAnimation);
        } else {
            overridePendingTransition(0, com.luck.picture.lib.R.anim.ps_anim_fade_out);
        }
    }
}
