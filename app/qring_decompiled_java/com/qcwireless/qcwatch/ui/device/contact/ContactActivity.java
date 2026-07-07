package com.qcwireless.qcwatch.ui.device.contact;

/* compiled from: ContactActivity.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001-B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\"\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0012\u0010 \u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u001bH\u0014J\u0016\u0010$\u001a\u00020\u001b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016J\u0012\u0010(\u001a\u00020\u001b2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u001bH\u0014J\b\u0010,\u001a\u00020\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006."}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/contact/ContactActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "Lcom/qcwireless/qcwatch/ui/device/contact/helper/OnStartDragListener;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/device/contact/helper/DragRecyclerViewAdapter;", "baseGuideUrl", "", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityContactBinding;", "handler", "Landroid/os/Handler;", "mItemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "maxContacts", "", "type", "viewModel", "Lcom/qcwireless/qcwatch/ui/device/contact/vm/ContactViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/device/contact/vm/ContactViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getWholeText", "text", "byteCount", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEndDrag", "list", "", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/ContactsEntity;", "onStartDrag", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "setupViews", "showContactDialog", "CallPermissionCallback", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ContactActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity implements com.qcwireless.qcwatch.ui.device.contact.helper.OnStartDragListener {
    private com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityContactBinding binding;
    private final android.os.Handler handler;
    private androidx.recyclerview.widget.ItemTouchHelper mItemTouchHelper;
    private int type;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private int maxContacts = 500;
    private final java.lang.String baseGuideUrl = "https://qcwx.oss-us-west-1.aliyuncs.com/guide/";

    public ContactActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel m669invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.class), qualifier, qualifier);
            }
        });
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactActivity$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityContactBinding inflate = com.qcwireless.qcwatch.databinding.ActivityContactBinding.inflate(getLayoutInflater());
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
        this.maxContacts = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMaxContacts();
        getViewModel().queryDeviceContact();
        android.os.Bundle extras = getIntent().getExtras();
        com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter dragRecyclerViewAdapter = null;
        java.lang.Integer valueOf = extras != null ? java.lang.Integer.valueOf(extras.getInt("type")) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf);
        this.type = valueOf.intValue();
        this.adapter = new com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter(getViewModel().getLocalList(), this);
        android.content.Context context = (android.content.Context) this;
        android.widget.TextView textView = (android.widget.TextView) android.view.LayoutInflater.from(context).inflate(com.qcwireless.qcwatch.R.layout.layout_contact_footer, (android.view.ViewGroup) null).findViewById(com.qcwireless.qcwatch.R.id.tv_total_contacts);
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_467);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_467)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(getViewModel().getLocalList().size())}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        textView.setText(format);
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding = this.binding;
        if (activityContactBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding = null;
        }
        activityContactBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_464));
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityContactBinding.titleBar.tvRightText);
        activityContactBinding.titleBar.tvRightText.setBackgroundResource(com.qcwireless.qcwatch.R.mipmap.contact_add);
        activityContactBinding.rcvContact.setLayoutManager((androidx.recyclerview.widget.RecyclerView.LayoutManager) new androidx.recyclerview.widget.LinearLayoutManager(context));
        com.qcwireless.qcwatch.ui.base.view.MyRecycleView myRecycleView = activityContactBinding.rcvContact;
        com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter dragRecyclerViewAdapter2 = this.adapter;
        if (dragRecyclerViewAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            dragRecyclerViewAdapter2 = null;
        }
        myRecycleView.setAdapter(dragRecyclerViewAdapter2);
        activityContactBinding.rcvContact.addOnItemTouchListener(new com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.OnSwipeItemTouchListener(context));
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding2 = this.binding;
        if (activityContactBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding2 = null;
        }
        android.widget.TextView textView2 = activityContactBinding2.tvTotalContacts;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_467);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_467)");
        java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(getViewModel().getLocalList().size())}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
        textView2.setText(format2);
        android.widget.TextView textView3 = activityContactBinding.tvDesc;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string3 = getString(com.qcwireless.qcwatch.R.string.qc_text_4523);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_4523)");
        java.lang.String format3 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(this.maxContacts)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "format(format, *args)");
        textView3.setText(format3);
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding3 = this.binding;
        if (activityContactBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding3 = null;
        }
        activityContactBinding3.btnToDevice.setEnabled(true);
        android.view.View[] viewArr = new android.view.View[4];
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding4 = this.binding;
        if (activityContactBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding4 = null;
        }
        viewArr[0] = activityContactBinding4.btnAddContact;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding5 = this.binding;
        if (activityContactBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding5 = null;
        }
        viewArr[1] = activityContactBinding5.titleBar.tvRightText;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding6 = this.binding;
        if (activityContactBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding6 = null;
        }
        viewArr[2] = (android.view.View) activityContactBinding6.btnToDevice;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding7 = this.binding;
        if (activityContactBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding7 = null;
        }
        viewArr[3] = activityContactBinding7.tvTitle;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new com.qcwireless.qcwatch.ui.device.contact.ContactActivity$setupViews$2(this));
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getTextStatus().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactActivity$$ExternalSyntheticLambda2
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.contact.ContactActivity.m666setupViews$lambda1(com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this, (java.lang.Boolean) obj);
            }
        });
        getViewModel().getLocalUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactActivity$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.contact.ContactActivity.m667setupViews$lambda2(com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this, (com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.LocalContactUI) obj);
            }
        });
        com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter dragRecyclerViewAdapter3 = this.adapter;
        if (dragRecyclerViewAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            dragRecyclerViewAdapter3 = null;
        }
        androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = new androidx.recyclerview.widget.ItemTouchHelper(new com.qcwireless.qcwatch.ui.device.contact.helper.MyItemTouchHelperCallback(dragRecyclerViewAdapter3));
        this.mItemTouchHelper = itemTouchHelper;
        kotlin.jvm.internal.Intrinsics.checkNotNull(itemTouchHelper);
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding8 = this.binding;
        if (activityContactBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding8 = null;
        }
        itemTouchHelper.attachToRecyclerView(activityContactBinding8.rcvContact);
        com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter dragRecyclerViewAdapter4 = this.adapter;
        if (dragRecyclerViewAdapter4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            dragRecyclerViewAdapter = dragRecyclerViewAdapter4;
        }
        dragRecyclerViewAdapter.setOnClickSwitchListener(new com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter.OnClickSwitchListener() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactActivity$setupViews$5
            @Override // com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter.OnClickSwitchListener
            public void onDeleteItem(int position) {
                com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding9;
                com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding10;
                com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding11;
                com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter dragRecyclerViewAdapter5;
                com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding12;
                int i;
                com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding13;
                com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding14;
                com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding15;
                com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.type = 2;
                activityContactBinding9 = com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.binding;
                com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding16 = null;
                if (activityContactBinding9 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityContactBinding9 = null;
                }
                activityContactBinding9.btnToDevice.setEnabled(true);
                activityContactBinding10 = com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.binding;
                if (activityContactBinding10 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityContactBinding10 = null;
                }
                activityContactBinding10.btnToDevice.setButtonColor(true);
                activityContactBinding11 = com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.binding;
                if (activityContactBinding11 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityContactBinding11 = null;
                }
                activityContactBinding11.btnToDevice.setText(com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_375));
                com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.getViewModel().getLocalList().remove(position);
                dragRecyclerViewAdapter5 = com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.adapter;
                if (dragRecyclerViewAdapter5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    dragRecyclerViewAdapter5 = null;
                }
                dragRecyclerViewAdapter5.notifyDataSetChanged();
                activityContactBinding12 = com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.binding;
                if (activityContactBinding12 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityContactBinding12 = null;
                }
                android.widget.TextView textView4 = activityContactBinding12.tvTotalContacts;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject4 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string4 = com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_467);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_467)");
                java.lang.String format4 = java.lang.String.format(string4, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.getViewModel().getLocalList().size())}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format4, "format(format, *args)");
                textView4.setText(format4);
                if (com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.getViewModel().getLocalList().size() <= 0) {
                    i = com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.type;
                    if (i == 1) {
                        activityContactBinding13 = com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.binding;
                        if (activityContactBinding13 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityContactBinding13 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityContactBinding13.group1);
                        activityContactBinding14 = com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.binding;
                        if (activityContactBinding14 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityContactBinding14 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) activityContactBinding14.rcvContact);
                        activityContactBinding15 = com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.binding;
                        if (activityContactBinding15 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityContactBinding16 = activityContactBinding15;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityContactBinding16.cslToDevice);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m666setupViews$lambda1(com.qcwireless.qcwatch.ui.device.contact.ContactActivity contactActivity, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding = contactActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding2 = null;
        if (activityContactBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding = null;
        }
        activityContactBinding.btnToDevice.setEnabled(false);
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding3 = contactActivity.binding;
        if (activityContactBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding3 = null;
        }
        activityContactBinding3.btnToDevice.setButtonColor(false);
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding4 = contactActivity.binding;
        if (activityContactBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityContactBinding2 = activityContactBinding4;
        }
        activityContactBinding2.btnToDevice.setText(contactActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_465));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m667setupViews$lambda2(com.qcwireless.qcwatch.ui.device.contact.ContactActivity contactActivity, com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.LocalContactUI localContactUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactActivity, "this$0");
        contactActivity.getViewModel().getLocalList().clear();
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding = null;
        if ((localContactUI.getList().size() <= 0 && contactActivity.type == 1) || (contactActivity.getViewModel().getDeviceContacts().size() == 0 && localContactUI.getList().size() == 0)) {
            com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding2 = contactActivity.binding;
            if (activityContactBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityContactBinding2 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityContactBinding2.group1);
            com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding3 = contactActivity.binding;
            if (activityContactBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityContactBinding3 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) activityContactBinding3.rcvContact);
            com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding4 = contactActivity.binding;
            if (activityContactBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityContactBinding4 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityContactBinding4.cslToDevice);
        } else {
            com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding5 = contactActivity.binding;
            if (activityContactBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityContactBinding5 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityContactBinding5.group1);
            com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding6 = contactActivity.binding;
            if (activityContactBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityContactBinding6 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible((android.view.View) activityContactBinding6.rcvContact);
            com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding7 = contactActivity.binding;
            if (activityContactBinding7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityContactBinding7 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityContactBinding7.cslToDevice);
            contactActivity.getViewModel().getLocalList().addAll(localContactUI.getList());
            contactActivity.getViewModel().getTempList().clear();
            for (com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity contactsEntity : localContactUI.getList()) {
                contactsEntity.setStatus(1);
                contactActivity.getViewModel().getTempList().add(contactsEntity);
            }
            if (com.blankj.utilcode.util.CollectionUtils.isEqualCollection(contactActivity.getViewModel().getDeviceContacts(), contactActivity.getViewModel().getTempList()) && contactActivity.type != 1) {
                com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding8 = contactActivity.binding;
                if (activityContactBinding8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityContactBinding8 = null;
                }
                activityContactBinding8.btnToDevice.setEnabled(false);
                com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding9 = contactActivity.binding;
                if (activityContactBinding9 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityContactBinding9 = null;
                }
                activityContactBinding9.btnToDevice.setButtonColor(false);
                com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding10 = contactActivity.binding;
                if (activityContactBinding10 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityContactBinding10 = null;
                }
                activityContactBinding10.btnToDevice.setText(contactActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_465));
            } else {
                com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding11 = contactActivity.binding;
                if (activityContactBinding11 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityContactBinding11 = null;
                }
                activityContactBinding11.btnToDevice.setEnabled(true);
                com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding12 = contactActivity.binding;
                if (activityContactBinding12 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityContactBinding12 = null;
                }
                activityContactBinding12.btnToDevice.setButtonColor(true);
                com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding13 = contactActivity.binding;
                if (activityContactBinding13 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityContactBinding13 = null;
                }
                activityContactBinding13.btnToDevice.setText(contactActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_375));
            }
        }
        com.qcwireless.qcwatch.ui.device.contact.helper.DragRecyclerViewAdapter dragRecyclerViewAdapter = contactActivity.adapter;
        if (dragRecyclerViewAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            dragRecyclerViewAdapter = null;
        }
        dragRecyclerViewAdapter.notifyDataSetChanged();
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding14 = contactActivity.binding;
        if (activityContactBinding14 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityContactBinding = activityContactBinding14;
        }
        android.widget.TextView textView = activityContactBinding.tvTotalContacts;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string = contactActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_467);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_467)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(contactActivity.getViewModel().getLocalList().size())}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        textView.setText(format);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        getViewModel().deleteLocalContact();
    }

    @Override // com.qcwireless.qcwatch.ui.device.contact.helper.OnStartDragListener
    public void onStartDrag(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = this.mItemTouchHelper;
        kotlin.jvm.internal.Intrinsics.checkNotNull(itemTouchHelper);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewHolder);
        itemTouchHelper.startDrag(viewHolder);
    }

    @Override // com.qcwireless.qcwatch.ui.device.contact.helper.OnStartDragListener
    public void onEndDrag(java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding2 = null;
        if (activityContactBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding = null;
        }
        activityContactBinding.btnToDevice.setEnabled(true);
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding3 = this.binding;
        if (activityContactBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding3 = null;
        }
        activityContactBinding3.btnToDevice.setButtonColor(true);
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding4 = this.binding;
        if (activityContactBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityContactBinding2 = activityContactBinding4;
        }
        activityContactBinding2.btnToDevice.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_375));
    }

    /* compiled from: ContactActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/contact/ContactActivity$CallPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/device/contact/ContactActivity;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class CallPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public CallPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            if (all) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("tempList", com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.getViewModel().getLocalList()));
                android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this;
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.contact.ContactSelectActivity.class);
                intent.setFlags(0);
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
                activity.startActivityForResult(intent, 300);
                return;
            }
            java.lang.String string = com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            if (never) {
                java.lang.String string = com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                com.hjq.permissions.XXPermissions.startPermissionActivity((android.app.Activity) com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this, permissions);
            }
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        this.type = 2;
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(resultCode));
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding = null;
        if (resultCode == 300) {
            com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding2 = this.binding;
            if (activityContactBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityContactBinding2 = null;
            }
            activityContactBinding2.btnToDevice.setEnabled(false);
            com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding3 = this.binding;
            if (activityContactBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityContactBinding3 = null;
            }
            activityContactBinding3.btnToDevice.setButtonColor(false);
            com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding4 = this.binding;
            if (activityContactBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityContactBinding = activityContactBinding4;
            }
            activityContactBinding.btnToDevice.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_465));
            getViewModel().queryLocalContactList();
            return;
        }
        if (resultCode != 500) {
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding5 = this.binding;
        if (activityContactBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding5 = null;
        }
        activityContactBinding5.btnToDevice.setEnabled(true);
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding6 = this.binding;
        if (activityContactBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding6 = null;
        }
        activityContactBinding6.btnToDevice.setButtonColor(true);
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding7 = this.binding;
        if (activityContactBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityContactBinding = activityContactBinding7;
        }
        activityContactBinding.btnToDevice.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_375));
        getViewModel().queryLocalContactList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String getWholeText(java.lang.String text, int byteCount) {
        try {
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName("utf-8");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "forName(charsetName)");
            byte[] bytes = text.getBytes(forName);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            if (bytes.length > byteCount) {
                char[] charArray = text.toCharArray();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
                int length = charArray.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i >= length) {
                        i = 0;
                        break;
                    }
                    char c = charArray[i];
                    int i3 = 1;
                    if (!(c >= 0 && c < 128)) {
                        if (128 > c || c >= 2048) {
                            i3 = 0;
                        }
                        i3 = i3 != 0 ? 2 : 3;
                    }
                    i2 += i3;
                    if (i2 > byteCount) {
                        break;
                    }
                    i++;
                }
                return new java.lang.String(charArray, 0, i);
            }
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        return text;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showContactDialog() {
        com.qcwireless.qcwatch.base.dialog.CenterDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.CenterDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_contact);
        final com.qcwireless.qcwatch.base.dialog.CenterDialog create = builder.create();
        create.show();
        android.view.View contentView = create.getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_confirm);
        final android.widget.ImageView imageView = (android.widget.ImageView) contentView.findViewById(com.qcwireless.qcwatch.R.id.image_notification);
        if (kotlin.text.StringsKt.contains$default(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion(), "A91", false, 2, (java.lang.Object) null)) {
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.contact.ContactActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactActivity$showContactDialog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.device.contact.ContactActivity) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.device.contact.ContactActivity contactActivity) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactActivity, "$this$ktxRunOnUi");
                    com.bumptech.glide.Glide.with(com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this).asGif().load(java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.drawable.a91)).diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.RESOURCE).into(imageView);
                }
            });
        } else {
            kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.device.contact.ContactActivity$showContactDialog$2(this, imageView, null), 3, (java.lang.Object) null);
        }
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.base.dialog.CenterDialog.this.dismiss();
            }
        });
    }
}
