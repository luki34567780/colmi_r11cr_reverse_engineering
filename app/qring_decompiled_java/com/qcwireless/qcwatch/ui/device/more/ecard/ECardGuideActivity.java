package com.qcwireless.qcwatch.ui.device.more.ecard;

/* compiled from: ECardGuideActivity.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\fH\u0014J\b\u0010\u0013\u001a\u00020\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/more/ecard/ECardGuideActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/device/more/ecard/adapter/ECardGuideAdapter;", "baseUrl", "", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityEcardGuideBinding;", "data", "", "initData", "", "type", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ECardGuideActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.device.more.ecard.adapter.ECardGuideAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityEcardGuideBinding binding;
    private java.util.List<java.lang.String> data = new java.util.ArrayList();
    private final java.lang.String baseUrl = "https://qcwx.oss-us-west-1.aliyuncs.com/qrcode/";

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityEcardGuideBinding inflate = com.qcwireless.qcwatch.databinding.ActivityEcardGuideBinding.inflate(getLayoutInflater());
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        android.os.Bundle extras = getIntent().getExtras();
        com.qcwireless.qcwatch.ui.device.more.ecard.adapter.ECardGuideAdapter eCardGuideAdapter = null;
        java.lang.Integer valueOf = extras != null ? java.lang.Integer.valueOf(extras.getInt("type", 0)) : null;
        android.content.Context context = (android.content.Context) this;
        this.adapter = new com.qcwireless.qcwatch.ui.device.more.ecard.adapter.ECardGuideAdapter(context, this.data);
        if (valueOf != null) {
            initData(valueOf.intValue());
        }
        com.qcwireless.qcwatch.databinding.ActivityEcardGuideBinding activityEcardGuideBinding = this.binding;
        if (activityEcardGuideBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEcardGuideBinding = null;
        }
        com.qcwireless.qcwatch.databinding.ActivityEcardGuideBinding activityEcardGuideBinding2 = this.binding;
        if (activityEcardGuideBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEcardGuideBinding2 = null;
        }
        activityEcardGuideBinding2.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_4507));
        activityEcardGuideBinding.rcvGuide.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityEcardGuideBinding.rcvGuide;
        com.qcwireless.qcwatch.ui.device.more.ecard.adapter.ECardGuideAdapter eCardGuideAdapter2 = this.adapter;
        if (eCardGuideAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            eCardGuideAdapter = eCardGuideAdapter2;
        }
        recyclerView.setAdapter(eCardGuideAdapter);
    }

    public final void initData(int type) {
        this.data.clear();
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        com.qcwireless.qcwatch.ui.device.more.ecard.adapter.ECardGuideAdapter eCardGuideAdapter = null;
        if (type == 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "language");
            if (kotlin.text.StringsKt.contains$default(language, "zh", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "wechat_cn_1.png");
                this.data.add(this.baseUrl + "wechat_cn_2.png");
                this.data.add(this.baseUrl + "wechat_cn_3.png");
            } else {
                this.data.add(this.baseUrl + "wechat_en_1.png");
                this.data.add(this.baseUrl + "wechat_en_2.png");
                this.data.add(this.baseUrl + "wechat_en_3.png");
            }
        } else if (type == 1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "language");
            if (kotlin.text.StringsKt.contains$default(language, "zh", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "qq_cn_1.png");
                this.data.add(this.baseUrl + "qq_cn_2.png");
                this.data.add(this.baseUrl + "qq_cn_3.png");
            }
        } else if (type == 2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "language");
            java.lang.String str = language;
            if (kotlin.text.StringsKt.contains$default(str, "zh", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "facebook_cn_1.png");
                this.data.add(this.baseUrl + "facebook_cn_2.png");
                this.data.add(this.baseUrl + "facebook_cn_3.png");
                this.data.add(this.baseUrl + "facebook_cn_4.png");
            } else if (kotlin.text.StringsKt.contains$default(str, com.qcwireless.qcwatch.base.view.Localization.language, false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "facebook_fr_1.png");
                this.data.add(this.baseUrl + "facebook_fr_2.png");
                this.data.add(this.baseUrl + "facebook_fr_3.png");
                this.data.add(this.baseUrl + "facebook_fr_4.png");
            } else if (kotlin.text.StringsKt.contains$default(str, "de", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "facebook_de_1.png");
                this.data.add(this.baseUrl + "facebook_de_2.png");
                this.data.add(this.baseUrl + "facebook_de_3.png");
                this.data.add(this.baseUrl + "facebook_de_4.png");
            } else if (kotlin.text.StringsKt.contains$default(str, "ja", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "facebook_ja_1.png");
                this.data.add(this.baseUrl + "facebook_ja_2.png");
                this.data.add(this.baseUrl + "facebook_ja_3.png");
                this.data.add(this.baseUrl + "facebook_ja_4.png");
            } else if (kotlin.text.StringsKt.contains$default(str, "it", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "facebook_it_1.png");
                this.data.add(this.baseUrl + "facebook_it_2.png");
                this.data.add(this.baseUrl + "facebook_it_3.png");
                this.data.add(this.baseUrl + "facebook_it_4.png");
            } else if (kotlin.text.StringsKt.contains$default(str, "es", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "facebook_es_1.png");
                this.data.add(this.baseUrl + "facebook_es_2.png");
                this.data.add(this.baseUrl + "facebook_es_3.png");
                this.data.add(this.baseUrl + "facebook_es_4.png");
            } else {
                this.data.add(this.baseUrl + "facebook_en_1.png");
                this.data.add(this.baseUrl + "facebook_en_2.png");
                this.data.add(this.baseUrl + "facebook_en_3.png");
                this.data.add(this.baseUrl + "facebook_en_4.png");
            }
        } else if (type == 3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "language");
            java.lang.String str2 = language;
            if (kotlin.text.StringsKt.contains$default(str2, "zh", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "twitter_cn_1.png");
                this.data.add(this.baseUrl + "twitter_cn_2.png");
                this.data.add(this.baseUrl + "twitter_cn_3.png");
            } else if (kotlin.text.StringsKt.contains$default(str2, com.qcwireless.qcwatch.base.view.Localization.language, false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "twitter_fr_1.png");
                this.data.add(this.baseUrl + "twitter_fr_2.png");
                this.data.add(this.baseUrl + "twitter_fr_3.png");
            } else if (kotlin.text.StringsKt.contains$default(str2, "de", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "twitter_de_1.png");
                this.data.add(this.baseUrl + "twitter_de_2.png");
                this.data.add(this.baseUrl + "twitter_de_3.png");
            } else if (kotlin.text.StringsKt.contains$default(str2, "ja", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "twitter_ja_1.png");
                this.data.add(this.baseUrl + "twitter_ja_2.png");
                this.data.add(this.baseUrl + "twitter_ja_3.png");
            } else if (kotlin.text.StringsKt.contains$default(str2, "it", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "twitter_it_1.png");
                this.data.add(this.baseUrl + "twitter_it_2.png");
                this.data.add(this.baseUrl + "twitter_it_3.png");
            } else if (kotlin.text.StringsKt.contains$default(str2, "es", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "twitter_es_1.png");
                this.data.add(this.baseUrl + "twitter_es_2.png");
                this.data.add(this.baseUrl + "twitter_es_3.png");
            } else {
                this.data.add(this.baseUrl + "twitter_en_1.png");
                this.data.add(this.baseUrl + "twitter_en_2.png");
                this.data.add(this.baseUrl + "twitter_en_3.png");
            }
        } else if (type == 4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "language");
            java.lang.String str3 = language;
            if (kotlin.text.StringsKt.contains$default(str3, "zh", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "whatsapp_cn_1.png");
                this.data.add(this.baseUrl + "whatsapp_cn_2.png");
            } else if (kotlin.text.StringsKt.contains$default(str3, com.qcwireless.qcwatch.base.view.Localization.language, false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "whatsapp_fr_1.png");
                this.data.add(this.baseUrl + "whatsapp_fr_2.png");
            } else if (kotlin.text.StringsKt.contains$default(str3, "de", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "whatsapp_de_1.png");
                this.data.add(this.baseUrl + "whatsapp_de_2.png");
            } else if (kotlin.text.StringsKt.contains$default(str3, "ja", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "whatsapp_ja_1.png");
                this.data.add(this.baseUrl + "whatsapp_ja_2.png");
            } else {
                this.data.add(this.baseUrl + "whatsapp_en_1.png");
                this.data.add(this.baseUrl + "whatsapp_en_2.png");
            }
        } else if (type == 5) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "language");
            java.lang.String str4 = language;
            if (kotlin.text.StringsKt.contains$default(str4, "zh", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "instagram_cn_1.png");
                this.data.add(this.baseUrl + "instagram_cn_2.png");
                this.data.add(this.baseUrl + "instagram_cn_3.png");
                this.data.add(this.baseUrl + "instagram_cn_4.png");
            } else if (kotlin.text.StringsKt.contains$default(str4, com.qcwireless.qcwatch.base.view.Localization.language, false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "instagram_fr_1.png");
                this.data.add(this.baseUrl + "instagram_fr_2.png");
                this.data.add(this.baseUrl + "instagram_fr_3.png");
                this.data.add(this.baseUrl + "instagram_fr_4.png");
            } else if (kotlin.text.StringsKt.contains$default(str4, "de", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "instagram_de_1.png");
                this.data.add(this.baseUrl + "instagram_de_2.png");
                this.data.add(this.baseUrl + "instagram_de_3.png");
                this.data.add(this.baseUrl + "instagram_de_4.png");
            } else if (kotlin.text.StringsKt.contains$default(str4, "ja", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "instagram_ja_1.png");
                this.data.add(this.baseUrl + "instagram_ja_2.png");
                this.data.add(this.baseUrl + "instagram_ja_3.png");
                this.data.add(this.baseUrl + "instagram_ja_4.png");
            } else if (kotlin.text.StringsKt.contains$default(str4, "it", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "instagram_it_1.png");
                this.data.add(this.baseUrl + "instagram_it_2.png");
                this.data.add(this.baseUrl + "instagram_it_3.png");
                this.data.add(this.baseUrl + "instagram_it_4.png");
            } else if (kotlin.text.StringsKt.contains$default(str4, "es", false, 2, (java.lang.Object) null)) {
                this.data.add(this.baseUrl + "instagram_es_1.png");
                this.data.add(this.baseUrl + "instagram_es_2.png");
                this.data.add(this.baseUrl + "instagram_es_3.png");
                this.data.add(this.baseUrl + "instagram_es_4.png");
            } else {
                this.data.add(this.baseUrl + "instagram_en_1.png");
                this.data.add(this.baseUrl + "instagram_en_2.png");
                this.data.add(this.baseUrl + "instagram_en_3.png");
                this.data.add(this.baseUrl + "instagram_en_4.png");
            }
        }
        com.qcwireless.qcwatch.ui.device.more.ecard.adapter.ECardGuideAdapter eCardGuideAdapter2 = this.adapter;
        if (eCardGuideAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            eCardGuideAdapter = eCardGuideAdapter2;
        }
        eCardGuideAdapter.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        if (com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isNetworkAvailable((android.content.Context) this)) {
            return;
        }
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_223);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_223)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        finish();
    }
}
