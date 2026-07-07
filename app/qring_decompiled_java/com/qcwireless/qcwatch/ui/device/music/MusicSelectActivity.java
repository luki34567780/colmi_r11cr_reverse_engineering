package com.qcwireless.qcwatch.ui.device.music;

/* compiled from: MusicSelectActivity.kt */
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J*\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rH\u0016J$\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110$2\u0006\u0010%\u001a\u00020\u00132\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110$H\u0002J\u0012\u0010'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020\u001bH\u0014J\b\u0010+\u001a\u00020\u001bH\u0014J*\u0010,\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH\u0016J\u0016\u0010.\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010/\u001a\u00020\rJ\b\u00100\u001a\u00020\u001bH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u00061"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/MusicSelectActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "Landroid/text/TextWatcher;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/device/music/adapter/MusicSelectListAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityMusicSelectBinding;", "ffmpegHandler", "Lcom/frank/ffmpeg/FFmpegHandler;", "handler", "Landroid/os/Handler;", "mScrollState", "", "selectFlag", "", "selectSong", "Lcom/qcwireless/qcwatch/ui/device/music/bean/Song;", "sourcePath", "", "viewModel", "Lcom/qcwireless/qcwatch/ui/device/music/vm/MusicSelectViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/device/music/vm/MusicSelectViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "matcherSearch", "", "keyword", "list", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "onTextChanged", "before", "rand", "end", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MusicSelectActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity implements android.text.TextWatcher {
    private com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding binding;
    private com.frank.ffmpeg.FFmpegHandler ffmpegHandler;
    private final android.os.Handler handler;
    private boolean selectFlag;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private int mScrollState = -1;
    private com.qcwireless.qcwatch.ui.device.music.bean.Song selectSong = new com.qcwireless.qcwatch.ui.device.music.bean.Song();
    private java.lang.String sourcePath = "";

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    }

    public MusicSelectActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel m821invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel.class), qualifier, qualifier);
            }
        });
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel viewModel;
                com.qcwireless.qcwatch.ui.device.music.bean.Song song;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel viewModel2;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel viewModel3;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel viewModel4;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
                int i = msg.what;
                if (i == 1002) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "---" + msg.arg1);
                    if (com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this.isDialogShowing()) {
                        return;
                    }
                    com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this.showLoadingDialogTimeoutNotCancel(60000);
                    return;
                }
                if (i != 1112) {
                    if (i != 9012) {
                        return;
                    }
                    com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this.showLoadingDialogTimeoutNotCancel(60000);
                    return;
                }
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(msg.arg1));
                viewModel = com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this.getViewModel();
                java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> addList = viewModel.getAddList();
                song = com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this.selectSong;
                addList.add(song);
                viewModel2 = com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this.getViewModel();
                viewModel3 = com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this.getViewModel();
                viewModel2.addMusics(viewModel3.getAddList());
                com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this.dismissLoadingDialog();
                org.greenrobot.eventbus.EventBus eventBus = org.greenrobot.eventbus.EventBus.getDefault();
                viewModel4 = com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this.getViewModel();
                eventBus.post(new com.qcwireless.qcwatch.base.event.MusicToDeviceEvent(viewModel4.getAddList().size()));
                com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this.finish();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding inflate = com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding.inflate(getLayoutInflater());
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
        this.ffmpegHandler = new com.frank.ffmpeg.FFmpegHandler(this.handler);
        android.content.Context context = (android.content.Context) this;
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter musicSelectListAdapter = new com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter(context, getViewModel().getSongList());
        this.adapter = musicSelectListAdapter;
        musicSelectListAdapter.setSelectMode(com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.SelectMode.SINGLE_SELECT);
        final com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding = this.binding;
        final com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding2 = null;
        if (activityMusicSelectBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicSelectBinding = null;
        }
        activityMusicSelectBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_539));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMusicSelectBinding.titleBar.tvRightText);
        android.widget.TextView textView = activityMusicSelectBinding.titleBar.tvRightText;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_540);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_540)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{0}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        textView.setText(format);
        activityMusicSelectBinding.recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityMusicSelectBinding.recyclerView;
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter musicSelectListAdapter2 = this.adapter;
        if (musicSelectListAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            musicSelectListAdapter2 = null;
        }
        recyclerView.setAdapter(musicSelectListAdapter2);
        activityMusicSelectBinding.recyclerView.setNestedScrollingEnabled(false);
        activityMusicSelectBinding.sidebar.setSideBarLayout(new com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout.OnSideBarLayoutListener() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity$$ExternalSyntheticLambda6
            @Override // com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout.OnSideBarLayoutListener
            public final void onSideBarScrollUpdateItem(java.lang.String str) {
                com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.m814setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this, activityMusicSelectBinding, str);
            }
        });
        getViewModel().selectMusic();
        showLoadingDialogTimeoutNotCancel(20000);
        getViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity$$ExternalSyntheticLambda3
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.m815setupViews$lambda2(com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this, (com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel.MusicUi) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding3 = this.binding;
        if (activityMusicSelectBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicSelectBinding3 = null;
        }
        activityMusicSelectBinding3.edtSearch.addTextChangedListener(this);
        com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding4 = this.binding;
        if (activityMusicSelectBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicSelectBinding4 = null;
        }
        activityMusicSelectBinding4.deleteText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.m816setupViews$lambda3(com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter musicSelectListAdapter3 = this.adapter;
        if (musicSelectListAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            musicSelectListAdapter3 = null;
        }
        musicSelectListAdapter3.setOnItemSingleSelectListener(new com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemSingleSelectListener() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity$$ExternalSyntheticLambda5
            @Override // com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemSingleSelectListener
            public final void onSelected(int i, boolean z) {
                com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.m817setupViews$lambda4(com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this, i, z);
            }
        });
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter musicSelectListAdapter4 = this.adapter;
        if (musicSelectListAdapter4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            musicSelectListAdapter4 = null;
        }
        musicSelectListAdapter4.setOnItemMultiSelectListener(new com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemMultiSelectListener() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity$$ExternalSyntheticLambda4
            @Override // com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemMultiSelectListener
            public final void onSelected(com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.Operation operation, int i, boolean z) {
                com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.m818setupViews$lambda5(com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this, operation, i, z);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding5 = this.binding;
        if (activityMusicSelectBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicSelectBinding5 = null;
        }
        activityMusicSelectBinding5.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.m819setupViews$lambda6(com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding6 = this.binding;
        if (activityMusicSelectBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicSelectBinding6 = null;
        }
        activityMusicSelectBinding6.selectConfirm.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.m820setupViews$lambda7(com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding7 = this.binding;
        if (activityMusicSelectBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMusicSelectBinding2 = activityMusicSelectBinding7;
        }
        activityMusicSelectBinding2.recyclerView.addOnScrollListener(new androidx.recyclerview.widget.RecyclerView.OnScrollListener() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity$setupViews$8$1
            public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView2, int newState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrollStateChanged(recyclerView2, newState);
                com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this.mScrollState = newState;
            }

            public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView2, int dx, int dy) {
                int i;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel viewModel;
                int i2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrolled(recyclerView2, dx, dy);
                i = com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this.mScrollState;
                if (i != -1) {
                    androidx.recyclerview.widget.LinearLayoutManager layoutManager = recyclerView2.getLayoutManager();
                    int findFirstVisibleItemPosition = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? layoutManager.findFirstVisibleItemPosition() : 0;
                    try {
                        com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout sideBarLayout = activityMusicSelectBinding2.sidebar;
                        viewModel = com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this.getViewModel();
                        sideBarLayout.OnItemScrollUpdateText(viewModel.getSongList().get(findFirstVisibleItemPosition).getFirstName());
                        i2 = com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this.mScrollState;
                        if (i2 == 0) {
                            com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.this.mScrollState = -1;
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1$lambda-0, reason: not valid java name */
    public static final void m814setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity musicSelectActivity, com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicSelectActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityMusicSelectBinding, "$this_run");
        int size = musicSelectActivity.getViewModel().getSongList().size();
        for (int i = 0; i < size; i++) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(musicSelectActivity.getViewModel().getSongList().get(i).getFirstName(), str)) {
                try {
                    androidx.recyclerview.widget.LinearLayoutManager layoutManager = activityMusicSelectBinding.recyclerView.getLayoutManager();
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
    public static final void m815setupViews$lambda2(com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity musicSelectActivity, com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel.MusicUi musicUi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicSelectActivity, "this$0");
        musicSelectActivity.dismissLoadingDialog();
        musicSelectActivity.getViewModel().getSongList().clear();
        musicSelectActivity.getViewModel().getSongListBackUp().clear();
        musicSelectActivity.getViewModel().getSongList().addAll(musicUi.getList());
        musicSelectActivity.getViewModel().getSongListBackUp().addAll(musicUi.getList());
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter musicSelectListAdapter = musicSelectActivity.adapter;
        if (musicSelectListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            musicSelectListAdapter = null;
        }
        musicSelectListAdapter.notifyDataSetChanged();
        for (com.qcwireless.qcwatch.ui.device.music.bean.Song song : musicSelectActivity.getViewModel().getSongList()) {
            if (song.getSelect()) {
                com.qcwireless.qcwatch.ui.device.music.bean.Song song2 = new com.qcwireless.qcwatch.ui.device.music.bean.Song();
                song2.setAlbumId(song.getAlbumId());
                song2.setDuration(song.getDuration());
                song2.setFirstName(song.getFirstName());
                song2.setName(song.getName());
                song2.setPath(song.getPath());
                song2.setSelect(song.getSelect());
                song2.setSinger(song.getSinger());
                song2.setSize(song.getSize());
                musicSelectActivity.getViewModel().getAddList().add(song2);
            }
        }
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter musicSelectListAdapter2 = musicSelectActivity.adapter;
        if (musicSelectListAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            musicSelectListAdapter2 = null;
        }
        musicSelectListAdapter2.notifyDataSetChanged();
        android.content.Context context = (android.content.Context) musicSelectActivity;
        android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.music_select_all);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.music_select_all_not);
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        }
        if (musicSelectActivity.getViewModel().getAddList().size() >= musicUi.getList().size()) {
            com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding = musicSelectActivity.binding;
            if (activityMusicSelectBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMusicSelectBinding = null;
            }
            activityMusicSelectBinding.selectConfirm.setCompoundDrawables(null, drawable, null, null);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding2 = musicSelectActivity.binding;
        if (activityMusicSelectBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicSelectBinding2 = null;
        }
        activityMusicSelectBinding2.selectConfirm.setCompoundDrawables(null, drawable2, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3, reason: not valid java name */
    public static final void m816setupViews$lambda3(com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity musicSelectActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicSelectActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding = musicSelectActivity.binding;
        if (activityMusicSelectBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicSelectBinding = null;
        }
        activityMusicSelectBinding.edtSearch.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-4, reason: not valid java name */
    public static final void m817setupViews$lambda4(com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity musicSelectActivity, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicSelectActivity, "this$0");
        final com.qcwireless.qcwatch.ui.device.music.bean.Song song = musicSelectActivity.getViewModel().getSongList().get(i);
        com.qcwireless.qcwatch.ui.device.music.bean.Song song2 = new com.qcwireless.qcwatch.ui.device.music.bean.Song();
        musicSelectActivity.selectSong = song2;
        song2.setAlbumId(song.getAlbumId());
        musicSelectActivity.selectSong.setDuration(song.getDuration());
        musicSelectActivity.selectSong.setFirstName(song.getFirstName());
        musicSelectActivity.selectSong.setName(song.getName());
        musicSelectActivity.selectSong.setSelect(song.getSelect());
        musicSelectActivity.selectSong.setSinger(song.getSinger());
        musicSelectActivity.selectSong.setSize(song.getSize());
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, song.getPath());
        musicSelectActivity.sourcePath = song.getPath();
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(musicSelectActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity$setupViews$4$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity musicSelectActivity2) {
                com.frank.ffmpeg.FFmpegHandler fFmpegHandler;
                com.qcwireless.qcwatch.ui.device.music.bean.Song song3;
                com.frank.ffmpeg.FFmpegHandler fFmpegHandler2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicSelectActivity2, "$this$ktxRunOnBgSingle");
                java.lang.String name = new java.io.File(com.qcwireless.qcwatch.ui.device.music.bean.Song.this.getPath()).getName();
                com.qcwireless.qcwatch.base.utils.FileUtils fileUtils = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE;
                java.lang.String absolutePath = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getMusicDirFile().getAbsolutePath();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "FileUtils.getMusicDirFile().absolutePath");
                fileUtils.createDirs(absolutePath);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "fileName");
                java.lang.String replace$default = kotlin.text.StringsKt.replace$default(name, " ", "", false, 4, (java.lang.Object) null);
                java.lang.String[] transformAudio = com.frank.ffmpeg.FFmpegUtil.transformAudio(com.qcwireless.qcwatch.ui.device.music.bean.Song.this.getPath(), com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getMusicDirFile().getAbsolutePath() + '/' + replace$default);
                fFmpegHandler = musicSelectActivity2.ffmpegHandler;
                if (fFmpegHandler != null && transformAudio != null) {
                    fFmpegHandler2 = musicSelectActivity2.ffmpegHandler;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(fFmpegHandler2);
                    fFmpegHandler2.executeFFmpegCmd(transformAudio);
                }
                song3 = musicSelectActivity2.selectSong;
                song3.setPath(com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getMusicDirFile().getAbsolutePath() + '/' + replace$default);
            }
        });
        com.qcwireless.qcwatch.base.ktx.ActivityExtKt.hideKeyboard((android.app.Activity) musicSelectActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-5, reason: not valid java name */
    public static final void m818setupViews$lambda5(com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity musicSelectActivity, com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.Operation operation, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicSelectActivity, "this$0");
        com.qcwireless.qcwatch.ui.device.music.bean.Song song = musicSelectActivity.getViewModel().getSongList().get(i);
        song.setSelect(!song.getSelect());
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter musicSelectListAdapter = musicSelectActivity.adapter;
        if (musicSelectListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            musicSelectListAdapter = null;
        }
        musicSelectListAdapter.notifyDataSetChanged();
        com.qcwireless.qcwatch.ui.device.music.bean.Song song2 = new com.qcwireless.qcwatch.ui.device.music.bean.Song();
        song2.setAlbumId(song.getAlbumId());
        song2.setDuration(song.getDuration());
        song2.setFirstName(song.getFirstName());
        song2.setName(song.getName());
        song2.setPath(song.getPath());
        song2.setSelect(song.getSelect());
        song2.setSinger(song.getSinger());
        song2.setSize(song.getSize());
        if (song.getSelect()) {
            if (!musicSelectActivity.getViewModel().getAddList().contains(song2)) {
                musicSelectActivity.getViewModel().getAddList().add(song2);
            }
        } else {
            musicSelectActivity.getViewModel().getAddList().remove(song2);
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(musicSelectActivity.getViewModel().getAddList().size()));
        com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding = musicSelectActivity.binding;
        if (activityMusicSelectBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicSelectBinding = null;
        }
        android.widget.TextView textView = activityMusicSelectBinding.titleBar.tvRightText;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string = musicSelectActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_540);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_540)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(musicSelectActivity.getViewModel().getAddList().size())}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        textView.setText(format);
        android.content.Context context = (android.content.Context) musicSelectActivity;
        android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.music_select_all);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.music_select_all_not);
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        }
        if (musicSelectActivity.getViewModel().getAddList().size() >= musicSelectActivity.getViewModel().getSongList().size()) {
            com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding2 = musicSelectActivity.binding;
            if (activityMusicSelectBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMusicSelectBinding2 = null;
            }
            activityMusicSelectBinding2.selectConfirm.setCompoundDrawables(null, drawable, null, null);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding3 = musicSelectActivity.binding;
        if (activityMusicSelectBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicSelectBinding3 = null;
        }
        activityMusicSelectBinding3.selectConfirm.setCompoundDrawables(null, drawable2, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-6, reason: not valid java name */
    public static final void m819setupViews$lambda6(com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity musicSelectActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicSelectActivity, "this$0");
        musicSelectActivity.getViewModel().addMusics(musicSelectActivity.getViewModel().getAddList());
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.MusicToDeviceEvent(musicSelectActivity.getViewModel().getAddList().size()));
        musicSelectActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-7, reason: not valid java name */
    public static final void m820setupViews$lambda7(com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity musicSelectActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicSelectActivity, "this$0");
        musicSelectActivity.getViewModel().getAddList().clear();
        musicSelectActivity.selectFlag = !musicSelectActivity.selectFlag;
        android.content.Context context = (android.content.Context) musicSelectActivity;
        android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.music_select_all);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.music_select_all_not);
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        }
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter musicSelectListAdapter = null;
        if (musicSelectActivity.selectFlag) {
            com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding = musicSelectActivity.binding;
            if (activityMusicSelectBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMusicSelectBinding = null;
            }
            activityMusicSelectBinding.selectConfirm.setCompoundDrawables(null, drawable, null, null);
            for (com.qcwireless.qcwatch.ui.device.music.bean.Song song : musicSelectActivity.getViewModel().getSongList()) {
                song.setSelect(true);
                com.qcwireless.qcwatch.ui.device.music.bean.Song song2 = new com.qcwireless.qcwatch.ui.device.music.bean.Song();
                song2.setAlbumId(song.getAlbumId());
                song2.setDuration(song.getDuration());
                song2.setFirstName(song.getFirstName());
                song2.setName(song.getName());
                song2.setPath(song.getPath());
                song2.setSelect(song.getSelect());
                song2.setSinger(song.getSinger());
                song2.setSize(song.getSize());
                musicSelectActivity.getViewModel().getAddList().add(song2);
            }
        } else {
            com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding2 = musicSelectActivity.binding;
            if (activityMusicSelectBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMusicSelectBinding2 = null;
            }
            activityMusicSelectBinding2.selectConfirm.setCompoundDrawables(null, drawable2, null, null);
            java.util.Iterator<com.qcwireless.qcwatch.ui.device.music.bean.Song> it = musicSelectActivity.getViewModel().getSongList().iterator();
            while (it.hasNext()) {
                it.next().setSelect(false);
            }
        }
        com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding3 = musicSelectActivity.binding;
        if (activityMusicSelectBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicSelectBinding3 = null;
        }
        android.widget.TextView textView = activityMusicSelectBinding3.titleBar.tvRightText;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string = musicSelectActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_540);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_540)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(musicSelectActivity.getViewModel().getAddList().size())}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        textView.setText(format);
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter musicSelectListAdapter2 = musicSelectActivity.adapter;
        if (musicSelectListAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            musicSelectListAdapter = musicSelectListAdapter2;
        }
        musicSelectListAdapter.notifyDataSetChanged();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s) {
        try {
            java.lang.String valueOf = java.lang.String.valueOf(s);
            com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter musicSelectListAdapter = null;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(valueOf, "")) {
                com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding = this.binding;
                if (activityMusicSelectBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityMusicSelectBinding = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicSelectBinding.deleteText);
                getViewModel().getSongList().clear();
                getViewModel().getSongList().addAll(getViewModel().getSongListBackUp());
                if (!matcherSearch(valueOf, getViewModel().getSongList()).isEmpty()) {
                    com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding2 = this.binding;
                    if (activityMusicSelectBinding2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityMusicSelectBinding2 = null;
                    }
                    activityMusicSelectBinding2.sidebar.OnItemScrollUpdateText(matcherSearch(valueOf, getViewModel().getSongList()).get(0).getFirstName());
                }
                java.util.List asMutableList = kotlin.jvm.internal.TypeIntrinsics.asMutableList(matcherSearch(valueOf, getViewModel().getSongList()));
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, getViewModel().getSongList());
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, asMutableList);
                getViewModel().getSongList().clear();
                getViewModel().getSongList().addAll(asMutableList);
                com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter musicSelectListAdapter2 = this.adapter;
                if (musicSelectListAdapter2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    musicSelectListAdapter2 = null;
                }
                musicSelectListAdapter2.setData(getViewModel().getSongList());
                com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter musicSelectListAdapter3 = this.adapter;
                if (musicSelectListAdapter3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    musicSelectListAdapter = musicSelectListAdapter3;
                }
                musicSelectListAdapter.notifyDataSetChanged();
                return;
            }
            com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding3 = this.binding;
            if (activityMusicSelectBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMusicSelectBinding3 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMusicSelectBinding3.deleteText);
            getViewModel().getSongList().clear();
            getViewModel().getSongList().addAll(getViewModel().getSongListBackUp());
            com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding activityMusicSelectBinding4 = this.binding;
            if (activityMusicSelectBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMusicSelectBinding4 = null;
            }
            activityMusicSelectBinding4.sidebar.OnItemScrollUpdateText(getViewModel().getSongList().get(0).getFirstName());
            com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter musicSelectListAdapter4 = this.adapter;
            if (musicSelectListAdapter4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                musicSelectListAdapter4 = null;
            }
            musicSelectListAdapter4.setData(getViewModel().getSongList());
            com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter musicSelectListAdapter5 = this.adapter;
            if (musicSelectListAdapter5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                musicSelectListAdapter = musicSelectListAdapter5;
            }
            musicSelectListAdapter.notifyDataSetChanged();
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

    public final int rand(int start, int end) {
        if (!(start <= end)) {
            throw new java.lang.IllegalArgumentException("Illegal Argument".toString());
        }
        return kotlin.random.RandomKt.Random(java.lang.System.nanoTime()).nextInt(start, end + 1);
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

    private final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> matcherSearch(java.lang.String keyword, java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> list) {
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
