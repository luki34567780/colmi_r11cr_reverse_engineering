package com.qcwireless.qcwatch.ui.mine.question;

/* compiled from: FQuestionActivity.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/question/FQuestionActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityWebBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class FQuestionActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityWebBinding binding;

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityWebBinding inflate = com.qcwireless.qcwatch.databinding.ActivityWebBinding.inflate(getLayoutInflater());
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
        super.setupViews();
        com.qcwireless.qcwatch.databinding.ActivityWebBinding activityWebBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityWebBinding activityWebBinding2 = null;
        if (activityWebBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityWebBinding = null;
        }
        activityWebBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_102));
        android.os.Bundle extras = getIntent().getExtras();
        java.lang.String string = extras != null ? extras.getString("url") : null;
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, string);
        com.qcwireless.qcwatch.databinding.ActivityWebBinding activityWebBinding3 = this.binding;
        if (activityWebBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityWebBinding3 = null;
        }
        android.webkit.WebSettings settings = activityWebBinding3.webView.getSettings();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(settings, "binding.webView.settings");
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(false);
        settings.setSupportZoom(false);
        settings.setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setCacheMode(-1);
        if (string != null) {
            com.qcwireless.qcwatch.databinding.ActivityWebBinding activityWebBinding4 = this.binding;
            if (activityWebBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityWebBinding4 = null;
            }
            activityWebBinding4.webView.loadUrl(string);
        }
        com.qcwireless.qcwatch.databinding.ActivityWebBinding activityWebBinding5 = this.binding;
        if (activityWebBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityWebBinding2 = activityWebBinding5;
        }
        activityWebBinding2.webView.setWebChromeClient(new android.webkit.WebChromeClient() { // from class: com.qcwireless.qcwatch.ui.mine.question.FQuestionActivity$setupViews$1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(android.webkit.WebView view, int newProgress) {
                android.app.Activity activity;
                android.app.Activity activity2;
                try {
                    if (newProgress == 100) {
                        activity2 = com.qcwireless.qcwatch.ui.mine.question.FQuestionActivity.this.getActivity();
                        if (activity2 != null) {
                            com.qcwireless.qcwatch.ui.mine.question.FQuestionActivity.this.dismissLoadingDialog();
                        }
                    } else {
                        activity = com.qcwireless.qcwatch.ui.mine.question.FQuestionActivity.this.getActivity();
                        if (activity != null) {
                            com.qcwireless.qcwatch.ui.mine.question.FQuestionActivity.this.showLoadingDialog();
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
            }
        });
    }
}
