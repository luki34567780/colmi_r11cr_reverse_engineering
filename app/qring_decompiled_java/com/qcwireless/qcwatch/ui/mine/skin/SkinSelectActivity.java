package com.qcwireless.qcwatch.ui.mine.skin;

/* compiled from: SkinSelectActivity.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0010H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/skin/SkinSelectActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivitySkinSelectBinding;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/qcwireless/qcwatch/ui/mine/skin/SkinSelectActivity$Listener;", "skinSelectAdapter", "Lcom/qcwireless/qcwatch/ui/mine/skin/adapter/SkinSelectAdapter;", "skinSelectViewModel", "Lcom/qcwireless/qcwatch/ui/mine/skin/SkinSelectViewModel;", "getSkinSelectViewModel", "()Lcom/qcwireless/qcwatch/ui/mine/skin/SkinSelectViewModel;", "skinSelectViewModel$delegate", "Lkotlin/Lazy;", "checkSkin", "", "type", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "Listener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class SkinSelectActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivitySkinSelectBinding binding;
    private final com.qcwireless.qcwatch.ui.mine.skin.SkinSelectActivity.Listener listener = new com.qcwireless.qcwatch.ui.mine.skin.SkinSelectActivity.Listener();
    private com.qcwireless.qcwatch.ui.mine.skin.adapter.SkinSelectAdapter skinSelectAdapter;

    /* renamed from: skinSelectViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy skinSelectViewModel;

    public SkinSelectActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.skinSelectViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.mine.skin.SkinSelectViewModel>() { // from class: com.qcwireless.qcwatch.ui.mine.skin.SkinSelectActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.mine.skin.SkinSelectViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.mine.skin.SkinSelectViewModel m1321invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.mine.skin.SkinSelectViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.mine.skin.SkinSelectViewModel getSkinSelectViewModel() {
        return (com.qcwireless.qcwatch.ui.mine.skin.SkinSelectViewModel) this.skinSelectViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivitySkinSelectBinding inflate = com.qcwireless.qcwatch.databinding.ActivitySkinSelectBinding.inflate(getLayoutInflater());
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
        getSkinSelectViewModel().initData();
        com.qcwireless.qcwatch.ui.mine.skin.adapter.SkinSelectAdapter skinSelectAdapter = new com.qcwireless.qcwatch.ui.mine.skin.adapter.SkinSelectAdapter();
        this.skinSelectAdapter = skinSelectAdapter;
        skinSelectAdapter.setData$com_github_CymChad_brvah(getSkinSelectViewModel().getSkinList());
        com.qcwireless.qcwatch.databinding.ActivitySkinSelectBinding activitySkinSelectBinding = this.binding;
        com.qcwireless.qcwatch.ui.mine.skin.adapter.SkinSelectAdapter skinSelectAdapter2 = null;
        if (activitySkinSelectBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySkinSelectBinding = null;
        }
        activitySkinSelectBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_297));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activitySkinSelectBinding.titleBar.divider);
        androidx.recyclerview.widget.RecyclerView.LayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(getActivity(), 2);
        androidx.recyclerview.widget.RecyclerView recyclerView = activitySkinSelectBinding.rcvSkin;
        com.qcwireless.qcwatch.ui.mine.skin.adapter.SkinSelectAdapter skinSelectAdapter3 = this.skinSelectAdapter;
        if (skinSelectAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("skinSelectAdapter");
            skinSelectAdapter3 = null;
        }
        recyclerView.setAdapter(skinSelectAdapter3);
        activitySkinSelectBinding.rcvSkin.setLayoutManager(gridLayoutManager);
        androidx.recyclerview.widget.SimpleItemAnimator itemAnimator = activitySkinSelectBinding.rcvSkin.getItemAnimator();
        java.util.Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        itemAnimator.setSupportsChangeAnimations(false);
        com.qcwireless.qcwatch.ui.mine.skin.adapter.SkinSelectAdapter skinSelectAdapter4 = this.skinSelectAdapter;
        if (skinSelectAdapter4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("skinSelectAdapter");
        } else {
            skinSelectAdapter2 = skinSelectAdapter4;
        }
        skinSelectAdapter2.setOnItemClickListener(new com.chad.library.adapter.base.listener.OnItemClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.skin.SkinSelectActivity$$ExternalSyntheticLambda0
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
                com.qcwireless.qcwatch.ui.mine.skin.SkinSelectActivity.m1320setupViews$lambda1(com.qcwireless.qcwatch.ui.mine.skin.SkinSelectActivity.this, baseQuickAdapter, view, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m1320setupViews$lambda1(com.qcwireless.qcwatch.ui.mine.skin.SkinSelectActivity skinSelectActivity, com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skinSelectActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "<anonymous parameter 0>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        skinSelectActivity.checkSkin(skinSelectActivity.getSkinSelectViewModel().getSkinList().get(i).getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkSkin(int type) {
        if (type == com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getSkinType()) {
            return;
        }
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setSkinType(type);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        getSkinSelectViewModel().initData();
        com.qcwireless.qcwatch.ui.mine.skin.adapter.SkinSelectAdapter skinSelectAdapter = this.skinSelectAdapter;
        if (skinSelectAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("skinSelectAdapter");
            skinSelectAdapter = null;
        }
        skinSelectAdapter.notifyDataSetChanged();
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getSkinType() == com.qcwireless.qcwatch.ui.mine.skin.util.SkinType.INSTANCE.getSkin_Black()) {
            com.gyf.immersionbar.ImmersionBar.with((android.app.Activity) this).statusBarDarkFont(false).transparentStatusBar().init();
        } else {
            com.gyf.immersionbar.ImmersionBar.with((android.app.Activity) this).statusBarDarkFont(true).transparentStatusBar().init();
        }
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.OnThemeEvent(type));
        if (type == com.qcwireless.qcwatch.ui.mine.skin.util.SkinType.INSTANCE.getSkin_Black()) {
            skin.support.SkinCompatManager.getInstance().loadSkin("night.skin", this.listener, 0);
            return;
        }
        if (type == com.qcwireless.qcwatch.ui.mine.skin.util.SkinType.INSTANCE.getSkin_Pink()) {
            skin.support.SkinCompatManager.getInstance().loadSkin("pink.skin", this.listener, 0);
        } else if (type == com.qcwireless.qcwatch.ui.mine.skin.util.SkinType.INSTANCE.getSkin_Blue()) {
            skin.support.SkinCompatManager.getInstance().loadSkin("blue.skin", this.listener, 0);
        } else if (type == com.qcwireless.qcwatch.ui.mine.skin.util.SkinType.INSTANCE.getSkin_Default()) {
            skin.support.SkinCompatManager.getInstance().restoreDefaultTheme();
        }
    }

    /* compiled from: SkinSelectActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/skin/SkinSelectActivity$Listener;", "Lskin/support/SkinCompatManager$SkinLoaderListener;", "(Lcom/qcwireless/qcwatch/ui/mine/skin/SkinSelectActivity;)V", "onFailed", "", "errMsg", "", "onStart", "onSuccess", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class Listener implements skin.support.SkinCompatManager.SkinLoaderListener {
        public void onStart() {
        }

        public Listener() {
        }

        public void onSuccess() {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "切换成功");
        }

        public void onFailed(java.lang.String errMsg) {
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "切换失败:" + errMsg);
            skin.support.SkinCompatManager.getInstance().restoreDefaultTheme();
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setSkinType(com.qcwireless.qcwatch.ui.mine.skin.util.SkinType.INSTANCE.getSkin_Default());
            com.qcwireless.qcwatch.ui.mine.skin.SkinSelectActivity.this.getSkinSelectViewModel().initData();
        }
    }
}
