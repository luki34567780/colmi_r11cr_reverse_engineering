package com.qcwireless.qcwatch.ui.device.music;

/* compiled from: MyMenuMusicActivity.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0014J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0002J\u0018\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/MyMenuMusicActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/device/music/adapter/MyMenuMusicListAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityMyMenuMusicBinding;", "menuId", "", "menuName", "", "viewModel", "Lcom/qcwireless/qcwatch/ui/device/music/vm/MyMusicListViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/device/music/vm/MyMusicListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "showEditPopWindow", "view", "Landroid/view/View;", "showMyMusicNameDialog", "text", "showPopWindow", "pos", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MyMenuMusicActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.device.music.adapter.MyMenuMusicListAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityMyMenuMusicBinding binding;
    private int menuId;
    private java.lang.String menuName = "";

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public MyMenuMusicActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel m829invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityMyMenuMusicBinding inflate = com.qcwireless.qcwatch.databinding.ActivityMyMenuMusicBinding.inflate(getLayoutInflater());
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
        this.menuId = getIntent().getIntExtra("menuId", 0);
        this.menuName = java.lang.String.valueOf(getIntent().getStringExtra("menuName"));
        android.content.Context context = (android.content.Context) this;
        this.adapter = new com.qcwireless.qcwatch.ui.device.music.adapter.MyMenuMusicListAdapter(context, getViewModel().getMenuMusicList());
        com.qcwireless.qcwatch.databinding.ActivityMyMenuMusicBinding activityMyMenuMusicBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityMyMenuMusicBinding activityMyMenuMusicBinding2 = null;
        if (activityMyMenuMusicBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMyMenuMusicBinding = null;
        }
        activityMyMenuMusicBinding.titleBar.tvTitle.setText(this.menuName);
        activityMyMenuMusicBinding.titleBar.tvRightText.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_542));
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMyMenuMusicBinding.titleBar.tvRightText);
        activityMyMenuMusicBinding.rcvMyMusicList.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityMyMenuMusicBinding.rcvMyMusicList;
        com.qcwireless.qcwatch.ui.device.music.adapter.MyMenuMusicListAdapter myMenuMusicListAdapter = this.adapter;
        if (myMenuMusicListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            myMenuMusicListAdapter = null;
        }
        recyclerView.setAdapter(myMenuMusicListAdapter);
        getViewModel().queryMusicsByMenuId(this.menuId);
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getUiMusicRefresh().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity$$ExternalSyntheticLambda2
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity.m825setupViews$lambda1(com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity.this, (java.util.List) obj);
            }
        });
        com.qcwireless.qcwatch.ui.device.music.adapter.MyMenuMusicListAdapter myMenuMusicListAdapter2 = this.adapter;
        if (myMenuMusicListAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            myMenuMusicListAdapter2 = null;
        }
        myMenuMusicListAdapter2.getItemState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity.m826setupViews$lambda3(com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity.this, (com.qcwireless.qcwatch.ui.device.music.adapter.MyMenuMusicListAdapter.PopWindowUI) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityMyMenuMusicBinding activityMyMenuMusicBinding3 = this.binding;
        if (activityMyMenuMusicBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMyMenuMusicBinding2 = activityMyMenuMusicBinding3;
        }
        activityMyMenuMusicBinding2.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity.m827setupViews$lambda4(com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m825setupViews$lambda1(com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity myMenuMusicActivity, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myMenuMusicActivity, "this$0");
        myMenuMusicActivity.getViewModel().getMenuMusicList().clear();
        java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> menuMusicList = myMenuMusicActivity.getViewModel().getMenuMusicList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "it");
        menuMusicList.addAll(list);
        com.qcwireless.qcwatch.ui.device.music.adapter.MyMenuMusicListAdapter myMenuMusicListAdapter = myMenuMusicActivity.adapter;
        if (myMenuMusicListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            myMenuMusicListAdapter = null;
        }
        myMenuMusicListAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3, reason: not valid java name */
    public static final void m826setupViews$lambda3(com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity myMenuMusicActivity, com.qcwireless.qcwatch.ui.device.music.adapter.MyMenuMusicListAdapter.PopWindowUI popWindowUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myMenuMusicActivity, "this$0");
        android.view.View view = popWindowUI.getView();
        if (view != null) {
            myMenuMusicActivity.showPopWindow(view, popWindowUI.getPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4, reason: not valid java name */
    public static final void m827setupViews$lambda4(com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity myMenuMusicActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myMenuMusicActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityMyMenuMusicBinding activityMyMenuMusicBinding = myMenuMusicActivity.binding;
        if (activityMyMenuMusicBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMyMenuMusicBinding = null;
        }
        android.widget.TextView textView = activityMyMenuMusicBinding.titleBar.tvRightText;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "binding.titleBar.tvRightText");
        myMenuMusicActivity.showEditPopWindow(textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showPopWindow(android.view.View view, final int pos) {
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_545);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_545)");
        android.content.Context context = (android.content.Context) this;
        new com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder((android.app.Activity) this).setData(kotlin.collections.CollectionsKt.mutableListOf(new com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel[]{new com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel(string, 0, 2, null)})).setCancelable(true).setPopupOrientation(com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder.VERTICAL).setDividerColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.music_common_1)).setPopupBgColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.music_common_1)).setOnItemClickListener(new com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder.OnItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity$showPopWindow$pop$1
            @Override // com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder.OnItemClickListener
            public void onItemClick(android.view.View view2, int position) {
                com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel viewModel;
                com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel viewModel2;
                int i;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "view");
                viewModel = com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity.this.getViewModel();
                com.qcwireless.qcwatch.ui.device.music.bean.Song song = viewModel.getMenuMusicList().get(pos);
                viewModel2 = com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity.this.getViewModel();
                i = com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity.this.menuId;
                viewModel2.deleteFromMenu(song, i);
            }
        }).create().showAtView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showEditPopWindow(android.view.View view) {
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_546);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_546)");
        java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_537);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_537)");
        android.content.Context context = (android.content.Context) this;
        new com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder((android.app.Activity) this).setData(kotlin.collections.CollectionsKt.mutableListOf(new com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel[]{new com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel(string, 0, 2, null), new com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel(string2, 0, 2, null)})).setCancelable(true).setPopupOrientation(com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder.VERTICAL).setDividerColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.music_common_1)).setPopupBgColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.music_common_1)).setOnItemClickListener(new com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder.OnItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity$showEditPopWindow$pop$1
            @Override // com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder.OnItemClickListener
            public void onItemClick(android.view.View view2, int position) {
                java.lang.String str;
                com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel viewModel;
                int i;
                com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel viewModel2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "view");
                if (position == 0) {
                    com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity myMenuMusicActivity = com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity.this;
                    str = myMenuMusicActivity.menuName;
                    myMenuMusicActivity.showMyMusicNameDialog(str);
                } else {
                    if (position != 1) {
                        return;
                    }
                    viewModel = com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity.this.getViewModel();
                    i = com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity.this.menuId;
                    long j = i;
                    viewModel2 = com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity.this.getViewModel();
                    viewModel.removeMenu(j, viewModel2.getMenuMusicList());
                    com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity.this.finish();
                }
            }
        }).create().showAtView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showMyMusicNameDialog(java.lang.String text) {
        com.qcwireless.qcwatch.base.dialog.MusicEditDialog musicEditDialog = new com.qcwireless.qcwatch.base.dialog.MusicEditDialog((android.content.Context) this, text);
        musicEditDialog.setOnTextConfirmListener(new com.qcwireless.qcwatch.base.dialog.MusicEditDialog.OnTextConfirmListener() { // from class: com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity$$ExternalSyntheticLambda3
            @Override // com.qcwireless.qcwatch.base.dialog.MusicEditDialog.OnTextConfirmListener
            public final void OnConfirm(java.lang.String str) {
                com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity.m828showMyMusicNameDialog$lambda5(com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity.this, str);
            }
        });
        musicEditDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showMyMusicNameDialog$lambda-5, reason: not valid java name */
    public static final void m828showMyMusicNameDialog$lambda5(com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity myMenuMusicActivity, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myMenuMusicActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "it");
        java.lang.String str2 = str;
        if (str2.length() > 0) {
            com.qcwireless.qcwatch.databinding.ActivityMyMenuMusicBinding activityMyMenuMusicBinding = myMenuMusicActivity.binding;
            if (activityMyMenuMusicBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMyMenuMusicBinding = null;
            }
            activityMyMenuMusicBinding.titleBar.tvTitle.setText(str2);
            myMenuMusicActivity.getViewModel().updateMenuName(str, myMenuMusicActivity.menuId);
        }
    }
}
