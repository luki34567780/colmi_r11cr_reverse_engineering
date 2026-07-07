package com.qcwireless.qcwatch.ui.device.ebook;

/* compiled from: EbookSelectActivity.kt */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J*\u0010\u0016\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0016J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\"\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0012\u0010&\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020\u0013H\u0014J\b\u0010*\u001a\u00020\u0013H\u0014J*\u0010+\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010-\u001a\u00020\u0013H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006."}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/ebook/EbookSelectActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "Landroid/text/TextWatcher;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/device/ebook/adapter/EbookSelectListAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityEbookSelectBinding;", "mScrollState", "", "selectFlag", "", "viewModel", "Lcom/qcwireless/qcwatch/ui/device/ebook/vm/EbookSelectViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/device/ebook/vm/EbookSelectViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "matcherSearch", "", "Lcom/qcwireless/qcwatch/ui/device/ebook/bean/Ebook;", "keyword", "", "list", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "onTextChanged", "before", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class EbookSelectActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity implements android.text.TextWatcher {
    private com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookSelectListAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding binding;
    private int mScrollState = -1;
    private boolean selectFlag;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    }

    public EbookSelectActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel m734invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding inflate = com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding.inflate(getLayoutInflater());
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
        android.content.Context context = (android.content.Context) this;
        com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookSelectListAdapter ebookSelectListAdapter = new com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookSelectListAdapter(context, getViewModel().getSongList());
        this.adapter = ebookSelectListAdapter;
        ebookSelectListAdapter.setSelectMode(com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.SelectMode.SINGLE_SELECT);
        final com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding = this.binding;
        final com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding2 = null;
        if (activityEbookSelectBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookSelectBinding = null;
        }
        activityEbookSelectBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_553));
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityEbookSelectBinding.titleBar.tvRightText);
        android.widget.TextView textView = activityEbookSelectBinding.titleBar.tvRightText;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_540);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_540)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{0}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        textView.setText(format);
        activityEbookSelectBinding.recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityEbookSelectBinding.recyclerView;
        com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookSelectListAdapter ebookSelectListAdapter2 = this.adapter;
        if (ebookSelectListAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            ebookSelectListAdapter2 = null;
        }
        recyclerView.setAdapter(ebookSelectListAdapter2);
        activityEbookSelectBinding.recyclerView.setNestedScrollingEnabled(false);
        activityEbookSelectBinding.sidebar.setSideBarLayout(new com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout.OnSideBarLayoutListener() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity$$ExternalSyntheticLambda7
            @Override // com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout.OnSideBarLayoutListener
            public final void onSideBarScrollUpdateItem(java.lang.String str) {
                com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.m726setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.this, activityEbookSelectBinding, str);
            }
        });
        getViewModel().selectEbook();
        getViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity$$ExternalSyntheticLambda4
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.m727setupViews$lambda2(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.this, (com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel.EbookUi) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding3 = this.binding;
        if (activityEbookSelectBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookSelectBinding3 = null;
        }
        activityEbookSelectBinding3.edtSearch.addTextChangedListener(this);
        com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding4 = this.binding;
        if (activityEbookSelectBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookSelectBinding4 = null;
        }
        activityEbookSelectBinding4.deleteText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.m728setupViews$lambda3(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookSelectListAdapter ebookSelectListAdapter3 = this.adapter;
        if (ebookSelectListAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            ebookSelectListAdapter3 = null;
        }
        ebookSelectListAdapter3.setOnItemSingleSelectListener(new com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemSingleSelectListener() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity$$ExternalSyntheticLambda6
            @Override // com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemSingleSelectListener
            public final void onSelected(int i, boolean z) {
                com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.m729setupViews$lambda4(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.this, i, z);
            }
        });
        com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookSelectListAdapter ebookSelectListAdapter4 = this.adapter;
        if (ebookSelectListAdapter4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            ebookSelectListAdapter4 = null;
        }
        ebookSelectListAdapter4.setOnItemMultiSelectListener(new com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemMultiSelectListener() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity$$ExternalSyntheticLambda5
            @Override // com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemMultiSelectListener
            public final void onSelected(com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.Operation operation, int i, boolean z) {
                com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.m730setupViews$lambda5(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.this, operation, i, z);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding5 = this.binding;
        if (activityEbookSelectBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookSelectBinding5 = null;
        }
        activityEbookSelectBinding5.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.m731setupViews$lambda6(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding6 = this.binding;
        if (activityEbookSelectBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookSelectBinding6 = null;
        }
        activityEbookSelectBinding6.tvAddMyBook.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.m732setupViews$lambda7(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding7 = this.binding;
        if (activityEbookSelectBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookSelectBinding7 = null;
        }
        activityEbookSelectBinding7.tvBookDelete.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.m733setupViews$lambda8(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding8 = this.binding;
        if (activityEbookSelectBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityEbookSelectBinding2 = activityEbookSelectBinding8;
        }
        activityEbookSelectBinding2.recyclerView.addOnScrollListener(new androidx.recyclerview.widget.RecyclerView.OnScrollListener() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity$setupViews$9$1
            public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView2, int newState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrollStateChanged(recyclerView2, newState);
                com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.this.mScrollState = newState;
            }

            public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView2, int dx, int dy) {
                int i;
                com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel viewModel;
                int i2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrolled(recyclerView2, dx, dy);
                i = com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.this.mScrollState;
                if (i != -1) {
                    androidx.recyclerview.widget.LinearLayoutManager layoutManager = recyclerView2.getLayoutManager();
                    int findFirstVisibleItemPosition = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? layoutManager.findFirstVisibleItemPosition() : 0;
                    try {
                        com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout sideBarLayout = activityEbookSelectBinding2.sidebar;
                        viewModel = com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.this.getViewModel();
                        sideBarLayout.OnItemScrollUpdateText(viewModel.getSongList().get(findFirstVisibleItemPosition).getFirstName());
                        i2 = com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.this.mScrollState;
                        if (i2 == 0) {
                            com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.this.mScrollState = -1;
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1$lambda-0, reason: not valid java name */
    public static final void m726setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity ebookSelectActivity, com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookSelectActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityEbookSelectBinding, "$this_run");
        int size = ebookSelectActivity.getViewModel().getSongList().size();
        for (int i = 0; i < size; i++) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(ebookSelectActivity.getViewModel().getSongList().get(i).getFirstName(), str)) {
                try {
                    androidx.recyclerview.widget.LinearLayoutManager layoutManager = activityEbookSelectBinding.recyclerView.getLayoutManager();
                    if (layoutManager == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    }
                    layoutManager.scrollToPositionWithOffset(i, 0);
                    return;
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m727setupViews$lambda2(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity ebookSelectActivity, com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel.EbookUi ebookUi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookSelectActivity, "this$0");
        ebookSelectActivity.getViewModel().getSongList().clear();
        ebookSelectActivity.getViewModel().getSongListBackUp().clear();
        ebookSelectActivity.getViewModel().getSongList().addAll(ebookUi.getList());
        ebookSelectActivity.getViewModel().getSongListBackUp().addAll(ebookUi.getList());
        com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookSelectListAdapter ebookSelectListAdapter = ebookSelectActivity.adapter;
        com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookSelectListAdapter ebookSelectListAdapter2 = null;
        if (ebookSelectListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            ebookSelectListAdapter = null;
        }
        ebookSelectListAdapter.notifyDataSetChanged();
        for (com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook ebook : ebookSelectActivity.getViewModel().getSongList()) {
            if (ebook.getSelect()) {
                com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook ebook2 = new com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook();
                ebook2.setFirstName(ebook.getFirstName());
                ebook2.setName(ebook.getName());
                ebook2.setPath(ebook.getPath());
                ebook2.setSelect(ebook.getSelect());
                ebookSelectActivity.getViewModel().getAddList().add(ebook2);
            }
        }
        com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookSelectListAdapter ebookSelectListAdapter3 = ebookSelectActivity.adapter;
        if (ebookSelectListAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            ebookSelectListAdapter2 = ebookSelectListAdapter3;
        }
        ebookSelectListAdapter2.notifyDataSetChanged();
        android.content.Context context = (android.content.Context) ebookSelectActivity;
        android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.music_select_all);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.music_select_all_not);
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3, reason: not valid java name */
    public static final void m728setupViews$lambda3(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity ebookSelectActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookSelectActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding = ebookSelectActivity.binding;
        if (activityEbookSelectBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookSelectBinding = null;
        }
        activityEbookSelectBinding.edtSearch.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4, reason: not valid java name */
    public static final void m729setupViews$lambda4(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity ebookSelectActivity, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookSelectActivity, "this$0");
        int i2 = 0;
        for (com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook ebook : ebookSelectActivity.getViewModel().getSongList()) {
            int i3 = i2 + 1;
            if (i2 == i) {
                ebook.setSelect(!ebook.getSelect());
            } else {
                ebook.setSelect(false);
            }
            i2 = i3;
        }
        com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook ebook2 = ebookSelectActivity.getViewModel().getSongList().get(i);
        com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook ebook3 = new com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook();
        ebook3.setFirstName(ebook2.getFirstName());
        ebook3.setName(ebook2.getName());
        ebook3.setPath(ebook2.getPath());
        ebook3.setSelect(ebook2.getSelect());
        ebookSelectActivity.getViewModel().getAddList().clear();
        if (ebook2.getSelect()) {
            ebookSelectActivity.getViewModel().getAddList().add(ebook3);
        }
        com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookSelectListAdapter ebookSelectListAdapter = ebookSelectActivity.adapter;
        com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding = null;
        if (ebookSelectListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            ebookSelectListAdapter = null;
        }
        ebookSelectListAdapter.notifyDataSetChanged();
        com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding2 = ebookSelectActivity.binding;
        if (activityEbookSelectBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityEbookSelectBinding = activityEbookSelectBinding2;
        }
        android.widget.TextView textView = activityEbookSelectBinding.titleBar.tvRightText;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string = ebookSelectActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_540);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_540)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(ebookSelectActivity.getViewModel().getAddList().size())}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        textView.setText(format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-5, reason: not valid java name */
    public static final void m730setupViews$lambda5(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity ebookSelectActivity, com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.Operation operation, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookSelectActivity, "this$0");
        com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook ebook = ebookSelectActivity.getViewModel().getSongList().get(i);
        ebook.setSelect(!ebook.getSelect());
        com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookSelectListAdapter ebookSelectListAdapter = ebookSelectActivity.adapter;
        com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding = null;
        if (ebookSelectListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            ebookSelectListAdapter = null;
        }
        ebookSelectListAdapter.notifyDataSetChanged();
        com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook ebook2 = new com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook();
        ebook2.setFirstName(ebook.getFirstName());
        ebook2.setName(ebook.getName());
        ebook2.setPath(ebook.getPath());
        ebook2.setSelect(ebook.getSelect());
        if (ebook.getSelect()) {
            if (!ebookSelectActivity.getViewModel().getAddList().contains(ebook2)) {
                ebookSelectActivity.getViewModel().getAddList().add(ebook2);
            }
        } else {
            ebookSelectActivity.getViewModel().getAddList().remove(ebook2);
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(ebookSelectActivity.getViewModel().getAddList().size()));
        com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding2 = ebookSelectActivity.binding;
        if (activityEbookSelectBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityEbookSelectBinding = activityEbookSelectBinding2;
        }
        android.widget.TextView textView = activityEbookSelectBinding.titleBar.tvRightText;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string = ebookSelectActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_540);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_540)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(ebookSelectActivity.getViewModel().getAddList().size())}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        textView.setText(format);
        android.content.Context context = (android.content.Context) ebookSelectActivity;
        android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.music_select_all);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.music_select_all_not);
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-6, reason: not valid java name */
    public static final void m731setupViews$lambda6(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity ebookSelectActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookSelectActivity, "this$0");
        if (ebookSelectActivity.getViewModel().getAddList().size() > 0) {
            ebookSelectActivity.getViewModel().addEbooks(ebookSelectActivity.getViewModel().getAddList().get(0));
        }
        ebookSelectActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-7, reason: not valid java name */
    public static final void m732setupViews$lambda7(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity ebookSelectActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookSelectActivity, "this$0");
        android.content.Intent intent = new android.content.Intent("android.intent.action.GET_CONTENT");
        intent.setType("text/*");
        intent.addCategory("android.intent.category.OPENABLE");
        ebookSelectActivity.startActivityForResult(intent, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-8, reason: not valid java name */
    public static final void m733setupViews$lambda8(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity ebookSelectActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookSelectActivity, "this$0");
        if (ebookSelectActivity.getViewModel().getAddList().size() > 0) {
            ebookSelectActivity.getViewModel().deleteBook(ebookSelectActivity.getViewModel().getAddList().get(0).getName());
            ebookSelectActivity.getViewModel().selectEbook();
        }
        ebookSelectActivity.getViewModel().getAddList().clear();
        com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding = ebookSelectActivity.binding;
        if (activityEbookSelectBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookSelectBinding = null;
        }
        android.widget.TextView textView = activityEbookSelectBinding.titleBar.tvRightText;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string = ebookSelectActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_540);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_540)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{0}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        textView.setText(format);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s) {
        try {
            java.lang.String valueOf = java.lang.String.valueOf(s);
            com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookSelectListAdapter ebookSelectListAdapter = null;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(valueOf, "")) {
                com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding = this.binding;
                if (activityEbookSelectBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityEbookSelectBinding = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityEbookSelectBinding.deleteText);
                getViewModel().getSongList().clear();
                getViewModel().getSongList().addAll(getViewModel().getSongListBackUp());
                if (!matcherSearch(valueOf, getViewModel().getSongList()).isEmpty()) {
                    com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding2 = this.binding;
                    if (activityEbookSelectBinding2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityEbookSelectBinding2 = null;
                    }
                    activityEbookSelectBinding2.sidebar.OnItemScrollUpdateText(matcherSearch(valueOf, getViewModel().getSongList()).get(0).getFirstName());
                }
                java.util.List asMutableList = kotlin.jvm.internal.TypeIntrinsics.asMutableList(matcherSearch(valueOf, getViewModel().getSongList()));
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, getViewModel().getSongList());
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, asMutableList);
                getViewModel().getSongList().clear();
                getViewModel().getSongList().addAll(asMutableList);
                com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookSelectListAdapter ebookSelectListAdapter2 = this.adapter;
                if (ebookSelectListAdapter2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    ebookSelectListAdapter2 = null;
                }
                ebookSelectListAdapter2.setData(getViewModel().getSongList());
                com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookSelectListAdapter ebookSelectListAdapter3 = this.adapter;
                if (ebookSelectListAdapter3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    ebookSelectListAdapter = ebookSelectListAdapter3;
                }
                ebookSelectListAdapter.notifyDataSetChanged();
                return;
            }
            com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding3 = this.binding;
            if (activityEbookSelectBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityEbookSelectBinding3 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityEbookSelectBinding3.deleteText);
            getViewModel().getSongList().clear();
            getViewModel().getSongList().addAll(getViewModel().getSongListBackUp());
            com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding activityEbookSelectBinding4 = this.binding;
            if (activityEbookSelectBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityEbookSelectBinding4 = null;
            }
            activityEbookSelectBinding4.sidebar.OnItemScrollUpdateText(getViewModel().getSongList().get(0).getFirstName());
            com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookSelectListAdapter ebookSelectListAdapter4 = this.adapter;
            if (ebookSelectListAdapter4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                ebookSelectListAdapter4 = null;
            }
            ebookSelectListAdapter4.setData(getViewModel().getSongList());
            com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookSelectListAdapter ebookSelectListAdapter5 = this.adapter;
            if (ebookSelectListAdapter5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                ebookSelectListAdapter = ebookSelectListAdapter5;
            }
            ebookSelectListAdapter.notifyDataSetChanged();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            return;
        }
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        try {
            com.qcwireless.qcwatch.base.ktx.ActivityExtKt.hideKeyboard((android.app.Activity) this);
        } catch (java.lang.Exception unused) {
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1) {
            final android.net.Uri data2 = data != null ? data.getData() : null;
            try {
                if (data2 != null) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity$onActivityResult$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity ebookSelectActivity) {
                            com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel viewModel;
                            com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel viewModel2;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookSelectActivity, "$this$ktxRunOnBgSingle");
                            java.lang.String fileAbsolutePath = com.qcwireless.qcwatch.base.utils.GetFilePathFromUri.getFileAbsolutePath((android.content.Context) ebookSelectActivity, data2);
                            java.io.File file = new java.io.File(fileAbsolutePath);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileAbsolutePath, "path");
                            if (kotlin.text.StringsKt.endsWith$default(fileAbsolutePath, ".txt", false, 2, (java.lang.Object) null) && file.exists()) {
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, fileAbsolutePath + "----" + file.getName() + "---" + data2);
                                java.lang.String name = file.getName();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "file.name");
                                java.lang.String alpha = com.qcwireless.qcwatch.ui.device.contact.bean.PinYinStringHelper.getAlpha(kotlin.text.StringsKt.replace$default(name, " ", "", false, 4, (java.lang.Object) null));
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, alpha);
                                java.lang.String name2 = file.getName();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "file.name");
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(alpha, "first");
                                com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity ebookEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity(name2, alpha, fileAbsolutePath);
                                viewModel = ebookSelectActivity.getViewModel();
                                viewModel.saveBook(ebookEntity);
                                viewModel2 = ebookSelectActivity.getViewModel();
                                viewModel2.selectEbook();
                                return;
                            }
                            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(ebookSelectActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity$onActivityResult$1.1
                                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                    invoke((com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity) obj);
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity ebookSelectActivity2) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookSelectActivity2, "$this$ktxRunOnUi");
                                    java.lang.String string = ebookSelectActivity2.getString(com.qcwireless.qcwatch.R.string.qc_text_558);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_558)");
                                    com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                                }
                            });
                        }
                    });
                } else {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity$onActivityResult$2
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity ebookSelectActivity) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookSelectActivity, "$this$ktxRunOnUi");
                            java.lang.String string = ebookSelectActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_560);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_560)");
                            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                        }
                    });
                }
            } catch (java.lang.Exception unused) {
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity$onActivityResult$3
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity ebookSelectActivity) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookSelectActivity, "$this$ktxRunOnUi");
                        java.lang.String string = ebookSelectActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_558);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_558)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                    }
                });
            }
        }
    }

    private final java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> matcherSearch(java.lang.String keyword, java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String quote = java.util.regex.Pattern.quote(keyword);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quote, "quote(keyword)");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(quote, 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compile, "compile(patten, Pattern.CASE_INSENSITIVE)");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.util.regex.Matcher matcher = compile.matcher(getViewModel().getSongList().get(i).getFirstName());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(matcher, "pattern.matcher(viewModel.songList[i].firstName)");
            java.util.regex.Matcher matcher2 = compile.matcher(getViewModel().getSongList().get(i).getName());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(matcher2, "pattern.matcher(viewModel.songList[i].name)");
            if (matcher.find() || matcher2.find()) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }
}
