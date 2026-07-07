package com.qcwireless.qcwatch.ui.mine.guide;

/* compiled from: GuideActivity.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/guide/GuideActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityGuideBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GuideActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityGuideBinding binding;

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityGuideBinding inflate = com.qcwireless.qcwatch.databinding.ActivityGuideBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        androidx.constraintlayout.widget.ConstraintLayout root = inflate.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        setContentView((android.view.View) root);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        com.qcwireless.qcwatch.databinding.ActivityGuideBinding activityGuideBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityGuideBinding activityGuideBinding2 = null;
        if (activityGuideBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGuideBinding = null;
        }
        android.webkit.WebSettings settings = activityGuideBinding.webView.getSettings();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(settings, "binding.webView.settings");
        settings.setAllowFileAccess(true);
        settings.setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setSupportMultipleWindows(false);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setDatabasePath(getDir("databases", 0).getPath());
        settings.setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        try {
            java.lang.String language = java.util.Locale.getDefault().getLanguage();
            if (kotlin.text.StringsKt.equals("de", language, true)) {
                com.qcwireless.qcwatch.databinding.ActivityGuideBinding activityGuideBinding3 = this.binding;
                if (activityGuideBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGuideBinding3 = null;
                }
                activityGuideBinding3.webView.loadUrl("file:///android_asset/dist/index.html#/home/de");
                return;
            }
            if (kotlin.text.StringsKt.equals(com.qcwireless.qcwatch.base.view.Localization.language, language, true)) {
                com.qcwireless.qcwatch.databinding.ActivityGuideBinding activityGuideBinding4 = this.binding;
                if (activityGuideBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGuideBinding4 = null;
                }
                activityGuideBinding4.webView.loadUrl("file:///android_asset/dist/index.html#/home/fr");
                return;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "language");
            if (kotlin.text.StringsKt.startsWith$default(language, "zh", false, 2, (java.lang.Object) null)) {
                com.qcwireless.qcwatch.databinding.ActivityGuideBinding activityGuideBinding5 = this.binding;
                if (activityGuideBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGuideBinding5 = null;
                }
                activityGuideBinding5.webView.loadUrl("file:///android_asset/dist/index.html#/home/zh");
                return;
            }
            if (kotlin.text.StringsKt.equals("es", language, true)) {
                com.qcwireless.qcwatch.databinding.ActivityGuideBinding activityGuideBinding6 = this.binding;
                if (activityGuideBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGuideBinding6 = null;
                }
                activityGuideBinding6.webView.loadUrl("file:///android_asset/dist/index.html#/home/es");
                return;
            }
            if (kotlin.text.StringsKt.equals("ja", language, true)) {
                com.qcwireless.qcwatch.databinding.ActivityGuideBinding activityGuideBinding7 = this.binding;
                if (activityGuideBinding7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGuideBinding7 = null;
                }
                activityGuideBinding7.webView.loadUrl("file:///android_asset/dist/index.html#/home/ja");
                return;
            }
            if (kotlin.text.StringsKt.equals("it", language, true)) {
                com.qcwireless.qcwatch.databinding.ActivityGuideBinding activityGuideBinding8 = this.binding;
                if (activityGuideBinding8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityGuideBinding8 = null;
                }
                activityGuideBinding8.webView.loadUrl("file:///android_asset/dist/index.html#/home/it");
                return;
            }
            com.qcwireless.qcwatch.databinding.ActivityGuideBinding activityGuideBinding9 = this.binding;
            if (activityGuideBinding9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityGuideBinding9 = null;
            }
            activityGuideBinding9.webView.loadUrl("file:///android_asset/dist/index.html#/home/en");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            com.qcwireless.qcwatch.databinding.ActivityGuideBinding activityGuideBinding10 = this.binding;
            if (activityGuideBinding10 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGuideBinding2 = activityGuideBinding10;
            }
            activityGuideBinding2.webView.loadUrl("file:///android_asset/dist/index.html#/home/en");
        }
    }
}
