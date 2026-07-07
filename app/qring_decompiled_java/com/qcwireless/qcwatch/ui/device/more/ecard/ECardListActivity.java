package com.qcwireless.qcwatch.ui.device.more.ecard;

/* compiled from: ECardListActivity.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\rH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/more/ecard/ECardListActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/device/more/ecard/adapter/ECardSoftwareAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityEcardListBinding;", "data", "", "Lcom/qcwireless/qcwatch/ui/device/more/ecard/bean/SoftwareCard;", "getData", "()Ljava/util/List;", "initData", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ECardListActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.device.more.ecard.adapter.ECardSoftwareAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityEcardListBinding binding;
    private final java.util.List<com.qcwireless.qcwatch.ui.device.more.ecard.bean.SoftwareCard> data = new java.util.ArrayList();

    public final java.util.List<com.qcwireless.qcwatch.ui.device.more.ecard.bean.SoftwareCard> getData() {
        return this.data;
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityEcardListBinding inflate = com.qcwireless.qcwatch.databinding.ActivityEcardListBinding.inflate(getLayoutInflater());
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
        initData();
        android.content.Context context = (android.content.Context) this;
        this.adapter = new com.qcwireless.qcwatch.ui.device.more.ecard.adapter.ECardSoftwareAdapter(context, this.data);
        com.qcwireless.qcwatch.databinding.ActivityEcardListBinding activityEcardListBinding = this.binding;
        com.qcwireless.qcwatch.ui.device.more.ecard.adapter.ECardSoftwareAdapter eCardSoftwareAdapter = null;
        if (activityEcardListBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEcardListBinding = null;
        }
        com.qcwireless.qcwatch.databinding.ActivityEcardListBinding activityEcardListBinding2 = this.binding;
        if (activityEcardListBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEcardListBinding2 = null;
        }
        activityEcardListBinding2.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_4496));
        activityEcardListBinding.eCardRev.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityEcardListBinding.eCardRev;
        com.qcwireless.qcwatch.ui.device.more.ecard.adapter.ECardSoftwareAdapter eCardSoftwareAdapter2 = this.adapter;
        if (eCardSoftwareAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            eCardSoftwareAdapter2 = null;
        }
        recyclerView.setAdapter(eCardSoftwareAdapter2);
        com.qcwireless.qcwatch.ui.device.more.ecard.adapter.ECardSoftwareAdapter eCardSoftwareAdapter3 = this.adapter;
        if (eCardSoftwareAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            eCardSoftwareAdapter = eCardSoftwareAdapter3;
        }
        eCardSoftwareAdapter.setOnItemClickListener(new com.chad.library.adapter.base.listener.OnItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.more.ecard.ECardListActivity$$ExternalSyntheticLambda0
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
                com.qcwireless.qcwatch.ui.device.more.ecard.ECardListActivity.m764setupViews$lambda2(com.qcwireless.qcwatch.ui.device.more.ecard.ECardListActivity.this, baseQuickAdapter, view, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m764setupViews$lambda2(com.qcwireless.qcwatch.ui.device.more.ecard.ECardListActivity eCardListActivity, com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eCardListActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "<anonymous parameter 0>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("type", eCardListActivity.data.get(i).getType());
        bundle.putString("name", eCardListActivity.data.get(i).getName());
        android.app.Activity activity = (android.app.Activity) eCardListActivity;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.class);
        intent.setFlags(1);
        intent.putExtras(bundle);
        for (kotlin.Pair pair : arrayList) {
            if (pair != null) {
                java.lang.String str = (java.lang.String) pair.getFirst();
                java.lang.Object second = pair.getSecond();
                if (second instanceof java.lang.Integer) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Byte) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Character) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Short) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Boolean) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Long) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Float) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Double) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.String) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                } else if (second instanceof java.lang.CharSequence) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                } else if (second instanceof android.os.Parcelable) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                } else if (second instanceof java.lang.Object[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                } else if (second instanceof java.util.ArrayList) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                } else if (second instanceof java.io.Serializable) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                } else if (second instanceof boolean[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                } else if (second instanceof byte[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                } else if (second instanceof short[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                } else if (second instanceof char[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                } else if (second instanceof int[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                } else if (second instanceof long[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                } else if (second instanceof float[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                } else if (second instanceof double[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                } else if (second instanceof android.os.Bundle) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                } else if (second instanceof android.content.Intent) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                } else {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        }
        activity.startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        this.data.clear();
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getWechatSupport()) {
            java.util.List<com.qcwireless.qcwatch.ui.device.more.ecard.bean.SoftwareCard> list = this.data;
            java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_434);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_434)");
            android.content.Context context = (android.content.Context) this;
            android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.wechat);
            kotlin.jvm.internal.Intrinsics.checkNotNull(drawable);
            list.add(new com.qcwireless.qcwatch.ui.device.more.ecard.bean.SoftwareCard(0, string, drawable));
            java.util.List<com.qcwireless.qcwatch.ui.device.more.ecard.bean.SoftwareCard> list2 = this.data;
            java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_433);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_433)");
            android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.qq);
            kotlin.jvm.internal.Intrinsics.checkNotNull(drawable2);
            list2.add(new com.qcwireless.qcwatch.ui.device.more.ecard.bean.SoftwareCard(1, string2, drawable2));
        }
        java.util.List<com.qcwireless.qcwatch.ui.device.more.ecard.bean.SoftwareCard> list3 = this.data;
        java.lang.String string3 = getString(com.qcwireless.qcwatch.R.string.qc_text_421);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_421)");
        android.content.Context context2 = (android.content.Context) this;
        android.graphics.drawable.Drawable drawable3 = androidx.core.content.ContextCompat.getDrawable(context2, com.qcwireless.qcwatch.R.mipmap.facebook);
        kotlin.jvm.internal.Intrinsics.checkNotNull(drawable3);
        list3.add(new com.qcwireless.qcwatch.ui.device.more.ecard.bean.SoftwareCard(2, string3, drawable3));
        java.util.List<com.qcwireless.qcwatch.ui.device.more.ecard.bean.SoftwareCard> list4 = this.data;
        java.lang.String string4 = getString(com.qcwireless.qcwatch.R.string.qc_text_419);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_419)");
        android.graphics.drawable.Drawable drawable4 = androidx.core.content.ContextCompat.getDrawable(context2, com.qcwireless.qcwatch.R.mipmap.whatsap);
        kotlin.jvm.internal.Intrinsics.checkNotNull(drawable4);
        list4.add(new com.qcwireless.qcwatch.ui.device.more.ecard.bean.SoftwareCard(4, string4, drawable4));
        java.util.List<com.qcwireless.qcwatch.ui.device.more.ecard.bean.SoftwareCard> list5 = this.data;
        java.lang.String string5 = getString(com.qcwireless.qcwatch.R.string.qc_text_424);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.qc_text_424)");
        android.graphics.drawable.Drawable drawable5 = androidx.core.content.ContextCompat.getDrawable(context2, com.qcwireless.qcwatch.R.mipmap.twitter);
        kotlin.jvm.internal.Intrinsics.checkNotNull(drawable5);
        list5.add(new com.qcwireless.qcwatch.ui.device.more.ecard.bean.SoftwareCard(3, string5, drawable5));
        java.util.List<com.qcwireless.qcwatch.ui.device.more.ecard.bean.SoftwareCard> list6 = this.data;
        java.lang.String string6 = getString(com.qcwireless.qcwatch.R.string.qc_text_422);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.qc_text_422)");
        android.graphics.drawable.Drawable drawable6 = androidx.core.content.ContextCompat.getDrawable(context2, com.qcwireless.qcwatch.R.mipmap.instagram);
        kotlin.jvm.internal.Intrinsics.checkNotNull(drawable6);
        list6.add(new com.qcwireless.qcwatch.ui.device.more.ecard.bean.SoftwareCard(5, string6, drawable6));
    }
}
