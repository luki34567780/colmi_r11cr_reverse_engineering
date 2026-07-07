package com.qcwireless.qcwatch.ui.device.contact;

/* compiled from: ContactSelectActivity.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J*\u0010\u0019\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0016J$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\u0012\u0010#\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J*\u0010&\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0016J\b\u0010(\u001a\u00020\u0016H\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006)"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/contact/ContactSelectActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "Landroid/text/TextWatcher;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/device/contact/adapter/ContactsListAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityContactSelectBinding;", "mScrollState", "", "maxContacts", "modifyString", "", "selectFlag", "", "viewModel", "Lcom/qcwireless/qcwatch/ui/device/contact/vm/ContactViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/device/contact/vm/ContactViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "matcherSearch", "", "Lcom/qcwireless/qcwatch/ui/device/contact/bean/ContactBean;", "keyword", "list", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onTextChanged", "before", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ContactSelectActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity implements android.text.TextWatcher {
    private com.qcwireless.qcwatch.ui.device.contact.adapter.ContactsListAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding binding;
    private boolean selectFlag;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private int mScrollState = -1;
    private java.lang.String modifyString = "";
    private int maxContacts = 500;

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    }

    public ContactSelectActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel m681invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding inflate = com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding.inflate(getLayoutInflater());
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
        int maxContacts = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMaxContacts();
        this.maxContacts = maxContacts;
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(maxContacts));
        android.os.Bundle extras = getIntent().getExtras();
        final com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding = null;
        java.lang.String string = extras != null ? extras.getString("tempList") : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(string);
        com.squareup.moshi.JsonAdapter adapter = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity>>() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity$setupViews$$inlined$fromJson$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
        java.util.ArrayList arrayList = (java.util.List) adapter.fromJson(string);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        getViewModel().initData(arrayList);
        android.content.Context context = (android.content.Context) this;
        com.qcwireless.qcwatch.ui.device.contact.adapter.ContactsListAdapter contactsListAdapter = new com.qcwireless.qcwatch.ui.device.contact.adapter.ContactsListAdapter(context, getViewModel().getContactsList());
        this.adapter = contactsListAdapter;
        contactsListAdapter.setSelectMode(com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.SelectMode.MULTI_SELECT);
        this.mScrollState = -1;
        final com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding2 = this.binding;
        if (activityContactSelectBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactSelectBinding2 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityContactSelectBinding2.titleBar.tvRightImage);
        activityContactSelectBinding2.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_461));
        activityContactSelectBinding2.recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityContactSelectBinding2.recyclerView;
        com.qcwireless.qcwatch.ui.device.contact.adapter.ContactsListAdapter contactsListAdapter2 = this.adapter;
        if (contactsListAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            contactsListAdapter2 = null;
        }
        recyclerView.setAdapter(contactsListAdapter2);
        activityContactSelectBinding2.recyclerView.setNestedScrollingEnabled(false);
        activityContactSelectBinding2.titleBar.tvRightImage.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.m675setupViews$lambda4$lambda0(com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.this, activityContactSelectBinding2, view);
            }
        });
        activityContactSelectBinding2.selectConfirm.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.m676setupViews$lambda4$lambda1(com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.this, view);
            }
        });
        activityContactSelectBinding2.sidebar.setSideBarLayout(new com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout.OnSideBarLayoutListener() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity$$ExternalSyntheticLambda5
            @Override // com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout.OnSideBarLayoutListener
            public final void onSideBarScrollUpdateItem(java.lang.String str) {
                com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.m677setupViews$lambda4$lambda2(com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.this, activityContactSelectBinding2, str);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding3 = this.binding;
        if (activityContactSelectBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactSelectBinding3 = null;
        }
        activityContactSelectBinding3.edtSearch.addTextChangedListener(this);
        com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding4 = this.binding;
        if (activityContactSelectBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactSelectBinding4 = null;
        }
        activityContactSelectBinding4.deleteText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.m678setupViews$lambda4$lambda3(com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.this, view);
            }
        });
        activityContactSelectBinding2.recyclerView.addOnScrollListener(new androidx.recyclerview.widget.RecyclerView.OnScrollListener() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity$setupViews$1$5
            public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView2, int newState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrollStateChanged(recyclerView2, newState);
                if (newState == 1) {
                    com.qcwireless.qcwatch.base.ktx.ActivityExtKt.hideKeyboard((android.app.Activity) com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.this);
                }
            }
        });
        final com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel viewModel = getViewModel();
        viewModel.getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity$$ExternalSyntheticLambda3
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.m679setupViews$lambda6$lambda5(com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.this, viewModel, (com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.ContactUI) obj);
            }
        });
        com.qcwireless.qcwatch.ui.device.contact.adapter.ContactsListAdapter contactsListAdapter3 = this.adapter;
        if (contactsListAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            contactsListAdapter3 = null;
        }
        contactsListAdapter3.setOnItemMultiSelectListener(new com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemMultiSelectListener() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity$$ExternalSyntheticLambda4
            @Override // com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemMultiSelectListener
            public final void onSelected(com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.Operation operation, int i, boolean z) {
                com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.m680setupViews$lambda7(com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.this, operation, i, z);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding5 = this.binding;
        if (activityContactSelectBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityContactSelectBinding = activityContactSelectBinding5;
        }
        activityContactSelectBinding.recyclerView.addOnScrollListener(new androidx.recyclerview.widget.RecyclerView.OnScrollListener() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity$setupViews$4$1
            public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView2, int newState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrollStateChanged(recyclerView2, newState);
                com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.this.mScrollState = newState;
            }

            public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView2, int dx, int dy) {
                int i;
                com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel viewModel2;
                int i2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrolled(recyclerView2, dx, dy);
                i = com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.this.mScrollState;
                if (i != -1) {
                    androidx.recyclerview.widget.LinearLayoutManager layoutManager = recyclerView2.getLayoutManager();
                    int findFirstVisibleItemPosition = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? layoutManager.findFirstVisibleItemPosition() : 0;
                    try {
                        com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout sideBarLayout = activityContactSelectBinding.sidebar;
                        viewModel2 = com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.this.getViewModel();
                        sideBarLayout.OnItemScrollUpdateText(viewModel2.getContactsList().get(findFirstVisibleItemPosition).getFirstName());
                        i2 = com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.this.mScrollState;
                        if (i2 == 0) {
                            com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.this.mScrollState = -1;
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4$lambda-0, reason: not valid java name */
    public static final void m675setupViews$lambda4$lambda0(com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity contactSelectActivity, com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSelectActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContactSelectBinding, "$this_run");
        contactSelectActivity.getViewModel().getAddList().clear();
        boolean z = !contactSelectActivity.selectFlag;
        contactSelectActivity.selectFlag = z;
        if (z) {
            activityContactSelectBinding.titleBar.tvRightImage.setImageResource(com.qcwireless.qcwatch.R.mipmap.contact_all);
            int size = contactSelectActivity.getViewModel().getContactsList().size();
            int i = contactSelectActivity.maxContacts;
            if (size <= i) {
                for (com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean contactBean : contactSelectActivity.getViewModel().getContactsList()) {
                    contactBean.setSelect(true);
                    contactSelectActivity.getViewModel().getAddList().add(new com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), contactBean.getPhoneNumber(), contactBean.getContactName(), 0, contactBean.getFirstName()));
                }
            } else {
                for (int i2 = 0; i2 < i; i2++) {
                    contactSelectActivity.getViewModel().getContactsList().get(i2).setSelect(true);
                    contactSelectActivity.getViewModel().getAddList().add(new com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), contactSelectActivity.getViewModel().getContactsList().get(i2).getPhoneNumber(), contactSelectActivity.getViewModel().getContactsList().get(i2).getContactName(), 0, contactSelectActivity.getViewModel().getContactsList().get(i2).getFirstName()));
                }
            }
        } else {
            activityContactSelectBinding.titleBar.tvRightImage.setImageResource(com.qcwireless.qcwatch.R.mipmap.contact_all_not);
            java.util.Iterator<com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean> it = contactSelectActivity.getViewModel().getContactsList().iterator();
            while (it.hasNext()) {
                it.next().setSelect(false);
            }
        }
        com.qcwireless.qcwatch.ui.device.contact.adapter.ContactsListAdapter contactsListAdapter = contactSelectActivity.adapter;
        if (contactsListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            contactsListAdapter = null;
        }
        contactsListAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4$lambda-1, reason: not valid java name */
    public static final void m676setupViews$lambda4$lambda1(com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity contactSelectActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSelectActivity, "this$0");
        if (contactSelectActivity.getViewModel().getAddList().size() > contactSelectActivity.maxContacts) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string = contactSelectActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_476);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_476)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(contactSelectActivity.maxContacts)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(format, 0, 1, null);
            return;
        }
        contactSelectActivity.getViewModel().addContactDefaultStatus(contactSelectActivity.getViewModel().getAddList());
        if (kotlin.jvm.internal.Intrinsics.areEqual(contactSelectActivity.modifyString, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(contactSelectActivity.getViewModel().getAddList()))) {
            contactSelectActivity.setResult(300);
        } else {
            contactSelectActivity.setResult(500);
        }
        contactSelectActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4$lambda-2, reason: not valid java name */
    public static final void m677setupViews$lambda4$lambda2(com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity contactSelectActivity, com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSelectActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContactSelectBinding, "$this_run");
        int size = contactSelectActivity.getViewModel().getContactsList().size();
        for (int i = 0; i < size; i++) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(contactSelectActivity.getViewModel().getContactsList().get(i).getFirstName(), str)) {
                try {
                    androidx.recyclerview.widget.LinearLayoutManager layoutManager = activityContactSelectBinding.recyclerView.getLayoutManager();
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
    /* renamed from: setupViews$lambda-4$lambda-3, reason: not valid java name */
    public static final void m678setupViews$lambda4$lambda3(com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity contactSelectActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSelectActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding = contactSelectActivity.binding;
        if (activityContactSelectBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactSelectBinding = null;
        }
        activityContactSelectBinding.edtSearch.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-6$lambda-5, reason: not valid java name */
    public static final void m679setupViews$lambda6$lambda5(com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity contactSelectActivity, com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel contactViewModel, com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.ContactUI contactUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSelectActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactViewModel, "$this_run");
        contactSelectActivity.dismissLoadingDialog();
        contactViewModel.getContactsList().clear();
        contactViewModel.getContactsBackUpList().clear();
        contactViewModel.getContactsList().addAll(contactUI.getList());
        contactViewModel.getContactsBackUpList().addAll(contactUI.getList());
        for (com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean contactBean : contactSelectActivity.getViewModel().getContactsList()) {
            if (contactBean.getSelect()) {
                contactSelectActivity.getViewModel().getAddList().add(new com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), contactBean.getPhoneNumber(), contactBean.getContactName(), 0, contactBean.getFirstName()));
            }
        }
        contactSelectActivity.modifyString = com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(contactSelectActivity.getViewModel().getAddList());
        com.qcwireless.qcwatch.ui.device.contact.adapter.ContactsListAdapter contactsListAdapter = contactSelectActivity.adapter;
        com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding = null;
        if (contactsListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            contactsListAdapter = null;
        }
        contactsListAdapter.notifyDataSetChanged();
        if ((contactSelectActivity.getViewModel().getAddList().size() >= contactUI.getList().size() && contactSelectActivity.getViewModel().getAddList().size() > 0) || contactSelectActivity.getViewModel().getAddList().size() == contactSelectActivity.maxContacts) {
            com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding2 = contactSelectActivity.binding;
            if (activityContactSelectBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityContactSelectBinding = activityContactSelectBinding2;
            }
            activityContactSelectBinding.titleBar.tvRightImage.setImageResource(com.qcwireless.qcwatch.R.mipmap.contact_all);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding3 = contactSelectActivity.binding;
        if (activityContactSelectBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityContactSelectBinding = activityContactSelectBinding3;
        }
        activityContactSelectBinding.titleBar.tvRightImage.setImageResource(com.qcwireless.qcwatch.R.mipmap.contact_all_not);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-7, reason: not valid java name */
    public static final void m680setupViews$lambda7(com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity contactSelectActivity, com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.Operation operation, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSelectActivity, "this$0");
        com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean contactBean = contactSelectActivity.getViewModel().getContactsList().get(i);
        com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding = null;
        if (!contactBean.getSelect() && contactSelectActivity.getViewModel().getAddList().size() >= contactSelectActivity.maxContacts) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string = contactSelectActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_476);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_476)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(contactSelectActivity.maxContacts)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(format, 0, 1, null);
            return;
        }
        contactBean.setSelect(!contactBean.getSelect());
        com.qcwireless.qcwatch.ui.device.contact.adapter.ContactsListAdapter contactsListAdapter = contactSelectActivity.adapter;
        if (contactsListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            contactsListAdapter = null;
        }
        contactsListAdapter.notifyDataSetChanged();
        com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity contactsEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), contactBean.getPhoneNumber(), contactBean.getContactName(), 0, contactBean.getFirstName());
        if (contactBean.getSelect()) {
            if (!contactSelectActivity.getViewModel().getAddList().contains(contactsEntity)) {
                contactSelectActivity.getViewModel().getAddList().add(contactsEntity);
            }
        } else {
            contactSelectActivity.getViewModel().getAddList().remove(contactsEntity);
        }
        if (contactSelectActivity.getViewModel().getAddList().size() == contactSelectActivity.getViewModel().getContactsList().size() || contactSelectActivity.getViewModel().getAddList().size() == contactSelectActivity.maxContacts) {
            com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding2 = contactSelectActivity.binding;
            if (activityContactSelectBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityContactSelectBinding = activityContactSelectBinding2;
            }
            activityContactSelectBinding.titleBar.tvRightImage.setImageResource(com.qcwireless.qcwatch.R.mipmap.contact_all);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding3 = contactSelectActivity.binding;
        if (activityContactSelectBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityContactSelectBinding = activityContactSelectBinding3;
        }
        activityContactSelectBinding.titleBar.tvRightImage.setImageResource(com.qcwireless.qcwatch.R.mipmap.contact_all_not);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "s");
        try {
            java.lang.String obj = s.toString();
            com.qcwireless.qcwatch.ui.device.contact.adapter.ContactsListAdapter contactsListAdapter = null;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(obj, "")) {
                com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding = this.binding;
                if (activityContactSelectBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityContactSelectBinding = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityContactSelectBinding.deleteText);
                getViewModel().getContactsList().clear();
                getViewModel().getContactsList().addAll(getViewModel().getContactsBackUpList());
                if (!matcherSearch(obj, getViewModel().getContactsList()).isEmpty()) {
                    com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding2 = this.binding;
                    if (activityContactSelectBinding2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityContactSelectBinding2 = null;
                    }
                    activityContactSelectBinding2.sidebar.OnItemScrollUpdateText(matcherSearch(obj, getViewModel().getContactsList()).get(0).getFirstName());
                }
                java.util.List asMutableList = kotlin.jvm.internal.TypeIntrinsics.asMutableList(matcherSearch(obj, getViewModel().getContactsList()));
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, getViewModel().getContactsList());
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, asMutableList);
                getViewModel().getContactsList().clear();
                getViewModel().getContactsList().addAll(asMutableList);
                com.qcwireless.qcwatch.ui.device.contact.adapter.ContactsListAdapter contactsListAdapter2 = this.adapter;
                if (contactsListAdapter2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    contactsListAdapter2 = null;
                }
                contactsListAdapter2.setData(getViewModel().getContactsList());
                com.qcwireless.qcwatch.ui.device.contact.adapter.ContactsListAdapter contactsListAdapter3 = this.adapter;
                if (contactsListAdapter3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    contactsListAdapter = contactsListAdapter3;
                }
                contactsListAdapter.notifyDataSetChanged();
                return;
            }
            com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding3 = this.binding;
            if (activityContactSelectBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityContactSelectBinding3 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityContactSelectBinding3.deleteText);
            getViewModel().getContactsList().clear();
            getViewModel().getContactsList().addAll(getViewModel().getContactsBackUpList());
            com.qcwireless.qcwatch.databinding.ActivityContactSelectBinding activityContactSelectBinding4 = this.binding;
            if (activityContactSelectBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityContactSelectBinding4 = null;
            }
            activityContactSelectBinding4.sidebar.OnItemScrollUpdateText(getViewModel().getContactsList().get(0).getFirstName());
            com.qcwireless.qcwatch.ui.device.contact.adapter.ContactsListAdapter contactsListAdapter4 = this.adapter;
            if (contactsListAdapter4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                contactsListAdapter4 = null;
            }
            contactsListAdapter4.setData(getViewModel().getContactsList());
            com.qcwireless.qcwatch.ui.device.contact.adapter.ContactsListAdapter contactsListAdapter5 = this.adapter;
            if (contactsListAdapter5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                contactsListAdapter = contactsListAdapter5;
            }
            contactsListAdapter.notifyDataSetChanged();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    private final java.util.List<com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean> matcherSearch(java.lang.String keyword, java.util.List<com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String quote = java.util.regex.Pattern.quote(keyword);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quote, "quote(keyword)");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(quote, 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compile, "compile(patten, Pattern.CASE_INSENSITIVE)");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.util.regex.Matcher matcher = compile.matcher(getViewModel().getContactsList().get(i).getFirstName());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(matcher, "pattern.matcher(viewMode…ontactsList[i].firstName)");
            java.util.regex.Matcher matcher2 = compile.matcher(getViewModel().getContactsList().get(i).getContactName());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(matcher2, "pattern.matcher(viewMode…tactsList[i].contactName)");
            if (matcher.find() || matcher2.find()) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }
}
