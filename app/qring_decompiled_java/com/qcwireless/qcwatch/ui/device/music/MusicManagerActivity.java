package com.qcwireless.qcwatch.ui.device.music;

/* compiled from: MusicManagerActivity.kt */
@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003<=>B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020&H\u0002J\u0012\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020&H\u0014J\u0010\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020.H\u0017J\b\u0010/\u001a\u00020&H\u0014J\b\u00100\u001a\u00020&H\u0014J\b\u00101\u001a\u00020&H\u0002J\u0010\u00102\u001a\u00020&2\u0006\u00103\u001a\u000204H\u0002J\u0018\u00105\u001a\u00020&2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\bH\u0002J\u0010\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020;H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00060\u0019R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00060\u001dR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006?"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/MusicManagerActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityMusicManagerBinding;", "connectCallback", "Lcom/qcwireless/qcwatch/ui/device/music/MusicManagerActivity$ConnectCallback;", "currIndex", "", "currMusicFile", "Ljava/io/File;", "deviceMusicAdapter", "Lcom/qcwireless/qcwatch/ui/device/music/adapter/MusicManagerListAdapter;", "editFlag", "", "handler", "Landroid/os/Handler;", "mBufferCheckSize", "mCurrentGetFile", "mCurrentGetFileType", "mSendPacketSize", "mSupportFormats", "musicMenuAdapter", "Lcom/qcwireless/qcwatch/ui/device/music/adapter/MusicMenuListAdapter;", "progressbarCallback", "Lcom/qcwireless/qcwatch/ui/device/music/MusicManagerActivity$ProgressBarCallback;", "selectFlag", "syncToDevice", "timeoutRunnable", "Lcom/qcwireless/qcwatch/ui/device/music/MusicManagerActivity$TimeoutRunnable;", "totalIndex", "viewModel", "Lcom/qcwireless/qcwatch/ui/device/music/vm/MusicManagerViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/device/music/vm/MusicManagerViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "connectDevice", "", "getFileList", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "setupViews", "showMenusListDialog", "showMyMusicNameDialog", "text", "", "showPopWindow", "view", "Landroid/view/View;", "pos", "showSingleMusicToMenusListDialog", "song", "Lcom/qcwireless/qcwatch/ui/device/music/bean/Song;", "ConnectCallback", "ProgressBarCallback", "TimeoutRunnable", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MusicManagerActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding binding;
    private java.io.File currMusicFile;
    private com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter deviceMusicAdapter;
    private boolean editFlag;
    private final android.os.Handler handler;
    private int mBufferCheckSize;
    private java.io.File mCurrentGetFile;
    private int mCurrentGetFileType;
    private int mSendPacketSize;
    private int mSupportFormats;
    private com.qcwireless.qcwatch.ui.device.music.adapter.MusicMenuListAdapter musicMenuAdapter;
    private boolean selectFlag;
    private boolean syncToDevice;
    private int totalIndex;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private final com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.ProgressBarCallback progressbarCallback = new com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.ProgressBarCallback();
    private int currIndex = 1;
    private final com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.TimeoutRunnable timeoutRunnable = new com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.TimeoutRunnable();
    private final com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.ConnectCallback connectCallback = new com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.ConnectCallback();

    public MusicManagerActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel m812invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel.class), qualifier, qualifier);
            }
        });
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding inflate = com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding.inflate(getLayoutInflater());
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
        this.musicMenuAdapter = new com.qcwireless.qcwatch.ui.device.music.adapter.MusicMenuListAdapter(context);
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter = new com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter(context, getViewModel().getDeviceMusicList());
        this.deviceMusicAdapter = musicManagerListAdapter;
        musicManagerListAdapter.setSelectMode(com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.SelectMode.MULTI_SELECT);
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicMenuListAdapter musicMenuListAdapter = this.musicMenuAdapter;
        if (musicMenuListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("musicMenuAdapter");
            musicMenuListAdapter = null;
        }
        musicMenuListAdapter.setData$com_github_CymChad_brvah(getViewModel().getMenusList());
        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding = this.binding;
        if (activityMusicManagerBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicManagerBinding = null;
        }
        activityMusicManagerBinding.rcvMyMusicList.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityMusicManagerBinding.rcvMyMusicList;
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicMenuListAdapter musicMenuListAdapter2 = this.musicMenuAdapter;
        if (musicMenuListAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("musicMenuAdapter");
            musicMenuListAdapter2 = null;
        }
        recyclerView.setAdapter(musicMenuListAdapter2);
        activityMusicManagerBinding.rcvDeviceMusicList.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = activityMusicManagerBinding.rcvDeviceMusicList;
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter2 = this.deviceMusicAdapter;
        if (musicManagerListAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceMusicAdapter");
            musicManagerListAdapter2 = null;
        }
        recyclerView2.setAdapter(musicManagerListAdapter2);
        activityMusicManagerBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_530));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMusicManagerBinding.titleBar.tvRightText);
        activityMusicManagerBinding.titleBar.tvRightText.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_542));
        android.view.View[] viewArr = new android.view.View[7];
        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding2 = this.binding;
        if (activityMusicManagerBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicManagerBinding2 = null;
        }
        viewArr[0] = activityMusicManagerBinding2.tvMusicLyrics;
        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding3 = this.binding;
        if (activityMusicManagerBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicManagerBinding3 = null;
        }
        viewArr[1] = activityMusicManagerBinding3.tvAddMusic;
        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding4 = this.binding;
        if (activityMusicManagerBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicManagerBinding4 = null;
        }
        viewArr[2] = activityMusicManagerBinding4.titleBar.tvRightText;
        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding5 = this.binding;
        if (activityMusicManagerBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicManagerBinding5 = null;
        }
        viewArr[3] = activityMusicManagerBinding5.tvMusicAll;
        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding6 = this.binding;
        if (activityMusicManagerBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicManagerBinding6 = null;
        }
        viewArr[4] = activityMusicManagerBinding6.tvAddMyMusic;
        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding7 = this.binding;
        if (activityMusicManagerBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicManagerBinding7 = null;
        }
        viewArr[5] = activityMusicManagerBinding7.tvMusicDelete;
        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding8 = this.binding;
        if (activityMusicManagerBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicManagerBinding8 = null;
        }
        viewArr[6] = activityMusicManagerBinding8.btnAddMusic;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding9;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding10;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding11;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding12;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding13;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding14;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding15;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel2;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel3;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding16;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel4;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel5;
                boolean z;
                boolean z2;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding17;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel6;
                com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter3;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding18;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel7;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel8;
                boolean z3;
                boolean z4;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding19;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding20;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding21;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel9;
                com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter4;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding22;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding23;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding24;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel10;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityMusicManagerBinding9 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding25 = null;
                com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter5 = null;
                com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter6 = null;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding26 = null;
                if (activityMusicManagerBinding9 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityMusicManagerBinding9 = null;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityMusicManagerBinding9.tvMusicLyrics)) {
                    activityMusicManagerBinding10 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                    if (activityMusicManagerBinding10 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityMusicManagerBinding10 = null;
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityMusicManagerBinding10.tvAddMusic)) {
                        activityMusicManagerBinding11 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                        if (activityMusicManagerBinding11 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityMusicManagerBinding11 = null;
                        }
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityMusicManagerBinding11.titleBar.tvRightText)) {
                            activityMusicManagerBinding12 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding12 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding12 = null;
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityMusicManagerBinding12.tvMusicAll)) {
                                viewModel5 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                                viewModel5.getAddList().clear();
                                com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this;
                                z = musicManagerActivity.selectFlag;
                                musicManagerActivity.selectFlag = !z;
                                android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable((android.content.Context) com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this, com.qcwireless.qcwatch.R.mipmap.music_select_all);
                                if (drawable != null) {
                                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                }
                                android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable((android.content.Context) com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this, com.qcwireless.qcwatch.R.mipmap.music_select_all_not);
                                if (drawable2 != null) {
                                    drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
                                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                }
                                z2 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.selectFlag;
                                if (z2) {
                                    activityMusicManagerBinding18 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                                    if (activityMusicManagerBinding18 == null) {
                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                        activityMusicManagerBinding18 = null;
                                    }
                                    activityMusicManagerBinding18.tvMusicAll.setCompoundDrawables(null, drawable, null, null);
                                    viewModel7 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                                    for (com.qcwireless.qcwatch.ui.device.music.bean.Song song : viewModel7.getDeviceMusicList()) {
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
                                        viewModel8 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                                        viewModel8.getAddList().add(song2);
                                    }
                                } else {
                                    activityMusicManagerBinding17 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                                    if (activityMusicManagerBinding17 == null) {
                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                        activityMusicManagerBinding17 = null;
                                    }
                                    activityMusicManagerBinding17.tvMusicAll.setCompoundDrawables(null, drawable2, null, null);
                                    viewModel6 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                                    java.util.Iterator<com.qcwireless.qcwatch.ui.device.music.bean.Song> it = viewModel6.getDeviceMusicList().iterator();
                                    while (it.hasNext()) {
                                        it.next().setSelect(false);
                                    }
                                }
                                musicManagerListAdapter3 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.deviceMusicAdapter;
                                if (musicManagerListAdapter3 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceMusicAdapter");
                                } else {
                                    musicManagerListAdapter6 = musicManagerListAdapter3;
                                }
                                musicManagerListAdapter6.notifyDataSetChanged();
                                return;
                            }
                            activityMusicManagerBinding13 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding13 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding13 = null;
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityMusicManagerBinding13.tvAddMyMusic)) {
                                viewModel4 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                                if (viewModel4.getAddList().size() != 0) {
                                    com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.showMenusListDialog();
                                    return;
                                }
                                java.lang.String string = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_544);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_544)");
                                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                                return;
                            }
                            activityMusicManagerBinding14 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding14 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding14 = null;
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityMusicManagerBinding14.tvMusicDelete)) {
                                viewModel = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                                if (viewModel.getAddList().size() != 0) {
                                    viewModel2 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                                    viewModel3 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                                    viewModel2.deleteMusic(viewModel3.getAddList());
                                    activityMusicManagerBinding16 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                                    if (activityMusicManagerBinding16 == null) {
                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    } else {
                                        activityMusicManagerBinding26 = activityMusicManagerBinding16;
                                    }
                                    activityMusicManagerBinding26.titleBar.tvRightText.performClick();
                                    return;
                                }
                                java.lang.String string2 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_544);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_544)");
                                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
                                return;
                            }
                            activityMusicManagerBinding15 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding15 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMusicManagerBinding25 = activityMusicManagerBinding15;
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityMusicManagerBinding25.btnAddMusic)) {
                                android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this;
                                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.class);
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
                                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                        }
                                    }
                                }
                                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                                activity.startActivity(intent);
                                return;
                            }
                            return;
                        }
                        com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity2 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this;
                        z3 = musicManagerActivity2.editFlag;
                        musicManagerActivity2.editFlag = !z3;
                        z4 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.editFlag;
                        if (z4) {
                            activityMusicManagerBinding22 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding22 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding22 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding22.cs4);
                            activityMusicManagerBinding23 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding23 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding23 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.invisible(activityMusicManagerBinding23.cs3);
                            activityMusicManagerBinding24 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding24 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding24 = null;
                            }
                            activityMusicManagerBinding24.titleBar.tvRightText.setText(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_543));
                            viewModel10 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                            for (com.qcwireless.qcwatch.ui.device.music.bean.Song song3 : viewModel10.getDeviceMusicList()) {
                                song3.setSelect(false);
                                song3.setEditMusic(true);
                            }
                        } else {
                            activityMusicManagerBinding19 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding19 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding19 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMusicManagerBinding19.cs4);
                            activityMusicManagerBinding20 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding20 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding20 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding20.cs3);
                            activityMusicManagerBinding21 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding21 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding21 = null;
                            }
                            activityMusicManagerBinding21.titleBar.tvRightText.setText(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_542));
                            viewModel9 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                            java.util.Iterator<com.qcwireless.qcwatch.ui.device.music.bean.Song> it2 = viewModel9.getDeviceMusicList().iterator();
                            while (it2.hasNext()) {
                                it2.next().setEditMusic(false);
                            }
                        }
                        musicManagerListAdapter4 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.deviceMusicAdapter;
                        if (musicManagerListAdapter4 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceMusicAdapter");
                        } else {
                            musicManagerListAdapter5 = musicManagerListAdapter4;
                        }
                        musicManagerListAdapter5.notifyDataSetChanged();
                        return;
                    }
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("activityType", 2);
                    kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                    android.app.Activity activity2 = (android.app.Activity) com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this;
                    java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
                    android.content.Intent intent2 = new android.content.Intent(activity2, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.music.MusicSelectActivity.class);
                    intent2.setFlags(2);
                    intent2.putExtras(bundle);
                    for (kotlin.Pair pair2 : arrayList2) {
                        if (pair2 != null) {
                            java.lang.String str2 = (java.lang.String) pair2.getFirst();
                            java.lang.Object second2 = pair2.getSecond();
                            if (second2 instanceof java.lang.Integer) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).intValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Byte) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).byteValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Character) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Character) second2).charValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Short) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).shortValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Boolean) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Boolean) second2).booleanValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Long) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).longValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Float) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).floatValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Double) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).doubleValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.String) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.lang.String) second2), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.CharSequence) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.lang.CharSequence) second2), "putExtra(name, value)");
                            } else if (second2 instanceof android.os.Parcelable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Parcelable) second2), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Object[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                            } else if (second2 instanceof java.util.ArrayList) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                            } else if (second2 instanceof java.io.Serializable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                            } else if (second2 instanceof boolean[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (boolean[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof byte[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (byte[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof short[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (short[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof char[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (char[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof int[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (int[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof long[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (long[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof float[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (float[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof double[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (double[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof android.os.Bundle) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Bundle) second2), "putExtra(name, value)");
                            } else if (second2 instanceof android.content.Intent) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Parcelable) second2), "putExtra(name, value)");
                            } else {
                                kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                    activity2.startActivity(intent2);
                    return;
                }
                android.content.Intent intent3 = new android.content.Intent("android.intent.action.GET_CONTENT");
                intent3.setType("*/*");
                intent3.addCategory("android.intent.category.OPENABLE");
                com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.startActivityForResult(intent3, 0);
            }
        });
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicMenuListAdapter musicMenuListAdapter3 = this.musicMenuAdapter;
        if (musicMenuListAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("musicMenuAdapter");
            musicMenuListAdapter3 = null;
        }
        musicMenuListAdapter3.setOnItemClickListener(new com.chad.library.adapter.base.listener.OnItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$$ExternalSyntheticLambda5
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
                com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.m802setupViews$lambda2(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this, baseQuickAdapter, view, i);
            }
        });
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter3 = this.deviceMusicAdapter;
        if (musicManagerListAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceMusicAdapter");
            musicManagerListAdapter3 = null;
        }
        musicManagerListAdapter3.setOnItemMultiSelectListener(new com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemMultiSelectListener() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$$ExternalSyntheticLambda9
            @Override // com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemMultiSelectListener
            public final void onSelected(com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.Operation operation, int i, boolean z) {
                com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.m803setupViews$lambda3(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this, operation, i, z);
            }
        });
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getAddMusicState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.m804setupViews$lambda4(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this, (java.lang.Boolean) obj);
            }
        });
        getViewModel().getUiRefresh().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$$ExternalSyntheticLambda3
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.m805setupViews$lambda5(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this, (java.util.List) obj);
            }
        });
        getViewModel().getUiMusicRefresh().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$$ExternalSyntheticLambda4
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.m806setupViews$lambda6(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this, (java.util.List) obj);
            }
        });
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter4 = this.deviceMusicAdapter;
        if (musicManagerListAdapter4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceMusicAdapter");
            musicManagerListAdapter4 = null;
        }
        musicManagerListAdapter4.getItemState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.m807setupViews$lambda8(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this, (com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.PopWindowUI) obj);
            }
        });
        getViewModel().getUiAddToDeviceRefresh().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$$ExternalSyntheticLambda2
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.m808setupViews$lambda9(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this, (java.lang.Integer) obj);
            }
        });
        com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance().initLocalPlaybackModelClient(com.qcwireless.qcwatch.QCApplication.INSTANCE.getApplication());
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().registerSppCallback(this.connectCallback);
        com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance().registerMyMusicCallback(new com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackModelCallback() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10
            @Override // com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackModelCallback
            public void onGetFileHeaderReport(int fileCrc, long fileTotalLength) {
                int i;
                int i2;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel;
                if (fileTotalLength == 0) {
                    viewModel = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                    viewModel.deleteMusicsByAddress();
                    org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.FinishMusicAddFirstEvent());
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "No song information");
                    return;
                }
                java.lang.String cacheDirPath = com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance().getCacheDirPath();
                java.lang.String str = cacheDirPath;
                if (str == null || str.length() == 0) {
                    cacheDirPath = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getAppRootFile(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).getAbsolutePath();
                    com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance().setCacheDirPath(cacheDirPath);
                }
                i = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.mCurrentGetFileType;
                if (i != com.oudmon.ble.base.bluetooth.spp.RtkSppConstants.FILE_TYPE_HEADER_BIN) {
                    i2 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.mCurrentGetFileType;
                    if (i2 == com.oudmon.ble.base.bluetooth.spp.RtkSppConstants.FILE_TYPE_NAME_BIN) {
                        java.io.File createNewNameFile = com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance().createNewNameFile(cacheDirPath);
                        if (createNewNameFile != null) {
                            com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.mCurrentGetFile = createNewNameFile;
                            return;
                        } else {
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "create [name.bin] failed");
                            return;
                        }
                    }
                    return;
                }
                java.io.File createNewHeaderFile = com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance().createNewHeaderFile(cacheDirPath);
                if (createNewHeaderFile != null) {
                    com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.mCurrentGetFile = createNewHeaderFile;
                } else {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "create [header.bin] failed");
                }
            }

            @Override // com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackModelCallback
            public void onGetFileContentReport(int length, final byte[] content) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "2");
                final com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10$onGetFileContentReport$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10 musicManagerActivity$setupViews$10) {
                        java.io.File file;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity$setupViews$10, "$this$ktxRunOnBgSingle");
                        com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp rtkMusicSpp = com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance();
                        file = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.mCurrentGetFile;
                        rtkMusicSpp.writeContentToFile(file, content);
                    }
                });
            }

            @Override // com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackModelCallback
            public void onGetFileFooterReport(int var1, final byte[] content) {
                int i;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel;
                final com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10$onGetFileFooterReport$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10 musicManagerActivity$setupViews$10) {
                        java.io.File file;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity$setupViews$10, "$this$ktxRunOnBgSingle");
                        com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp rtkMusicSpp = com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance();
                        file = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.mCurrentGetFile;
                        rtkMusicSpp.writeContentToFile(file, content);
                    }
                });
                i = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.mCurrentGetFileType;
                if (i == com.oudmon.ble.base.bluetooth.spp.RtkSppConstants.FILE_TYPE_HEADER_BIN) {
                    com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.mCurrentGetFileType = com.oudmon.ble.base.bluetooth.spp.RtkSppConstants.FILE_TYPE_NAME_BIN;
                    java.lang.Integer fileListData = com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance().getFileListData(com.oudmon.ble.base.bluetooth.spp.RtkSppConstants.FILE_TYPE_NAME_BIN);
                    if (fileListData != null && fileListData.intValue() == 0) {
                        return;
                    }
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "get file list <name.bin> failed");
                    return;
                }
                java.lang.String cacheDirPath = com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance().getCacheDirPath();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cacheDirPath, "getInstance().cacheDirPath");
                java.util.List<com.oudmon.ble.base.bluetooth.spp.bean.MySongInfo> songInfoList = com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance().getSongInfoList(new java.io.File(cacheDirPath, "header.bin"), new java.io.File(cacheDirPath, "name.bin"));
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "设备歌曲数:" + songInfoList.size());
                if (songInfoList.size() > 0) {
                    final com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity2 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10$onGetFileFooterReport$2
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10 musicManagerActivity$setupViews$10) {
                            com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding9;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity$setupViews$10, "$this$ktxRunOnUi");
                            activityMusicManagerBinding9 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding9 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding9 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMusicManagerBinding9.noMusic);
                        }
                    });
                } else {
                    final com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity3 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10$onGetFileFooterReport$3
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10 musicManagerActivity$setupViews$10) {
                            com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding9;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity$setupViews$10, "$this$ktxRunOnUi");
                            activityMusicManagerBinding9 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding9 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding9 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding9.noMusic);
                        }
                    });
                }
                viewModel = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(songInfoList, "list");
                viewModel.addMusics(songInfoList);
            }

            @Override // com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackModelCallback
            public void onAddOrDeleteSongToPlaylistReport(int resultCode) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "4");
            }

            @Override // com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackModelCallback
            public void onDeleteSingleSongReport(int resultCode) {
                if (resultCode == com.oudmon.ble.base.bluetooth.spp.RtkSppConstants.RESULT_SUCCESS) {
                    com.oudmon.ble.base.bluetooth.spp.LocalPlaybackDataPool.getInstance().setWhetherNeedToUpdatePlaylist(true);
                }
            }

            @Override // com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackModelCallback
            public void onDeleteAllSongReport(int resultCode) {
                if (resultCode == com.oudmon.ble.base.bluetooth.spp.RtkSppConstants.RESULT_SUCCESS) {
                    com.oudmon.ble.base.bluetooth.spp.LocalPlaybackDataPool.getInstance().clear();
                    com.oudmon.ble.base.bluetooth.spp.LocalPlaybackDataPool.getInstance().setWhetherNeedToUpdatePlaylist(true);
                }
            }

            @Override // com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackModelCallback
            public void onGetDeviceInfoReport(android.os.Bundle bundle) {
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel2;
                java.io.File file;
                kotlin.jvm.internal.Intrinsics.checkNotNull(bundle);
                int i = bundle.getInt("com.realsil.android.extra.SEND_PACKET_SIZE");
                int i2 = bundle.getInt("com.realsil.android.extra.BUFFER_CHECK_SIZE");
                int i3 = bundle.getInt("com.realsil.android.extra.PROTOCOL_VERSION");
                int i4 = bundle.getInt("com.realsil.android.extra.RWS_STATUS");
                int i5 = bundle.getInt("com.realsil.android.extra.SUPPORT_FORMATS");
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String format = java.lang.String.format(java.util.Locale.getDefault(), "sendPacketSize: %d, bufferCheckSize: %d, protocolVersion: %d, rwsStatus: %d, supportFormats: %d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i5)}, 5));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, format + "----" + i4);
                if (i4 == 0) {
                    com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.mSendPacketSize = i;
                    com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.mBufferCheckSize = i2;
                    com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.mSupportFormats = i5;
                }
                viewModel = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                if (viewModel.getBlockingQueue().size() > 0) {
                    viewModel2 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                    com.qcwireless.qcwatch.ui.device.music.bean.MusicToDeviceBean musicToDeviceBean = viewModel2.getBlockingQueue().get(0);
                    com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.currMusicFile = new java.io.File(musicToDeviceBean.getFilePath());
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, musicToDeviceBean);
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, musicToDeviceBean.getFilePath() + "----------");
                    com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp rtkMusicSpp = com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance();
                    file = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.currMusicFile;
                    rtkMusicSpp.enterTransferMode(file);
                }
            }

            @Override // com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackModelCallback
            public void onEnterSongTransferModeReport(boolean enterResult) {
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel;
                int i;
                int i2;
                java.io.File file;
                com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.ProgressBarCallback progressBarCallback;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append('8');
                sb.append(enterResult);
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, sb.toString());
                viewModel = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                viewModel.getBlockingQueue().clear();
                if (enterResult) {
                    com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp rtkMusicSpp = com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance();
                    i = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.mSendPacketSize;
                    i2 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.mBufferCheckSize;
                    rtkMusicSpp.startTransferInit(i, i2);
                    com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp rtkMusicSpp2 = com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance();
                    file = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.currMusicFile;
                    progressBarCallback = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.progressbarCallback;
                    rtkMusicSpp2.startTransfer(file, progressBarCallback);
                }
            }

            @Override // com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackModelCallback
            public void onExitSongTransferModeReport(boolean var1) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "9");
            }

            @Override // com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackModelCallback
            public void onCancelTransferReport(boolean var1) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "10");
                com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance().exitSongTransferMode();
            }

            @Override // com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackModelCallback
            public void onWriteSuccessReport(int bufferFlag) {
                com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance().updateTransferState(bufferFlag);
            }

            @Override // com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackModelCallback
            public void onWriteFailedReport() {
                final com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10$onWriteFailedReport$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$setupViews$10 musicManagerActivity$setupViews$10) {
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding9;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding10;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity$setupViews$10, "$this$ktxRunOnUi");
                        com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.dismissLoadingDialog();
                        activityMusicManagerBinding9 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                        if (activityMusicManagerBinding9 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityMusicManagerBinding9 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMusicManagerBinding9.ctlProgress);
                        activityMusicManagerBinding10 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                        if (activityMusicManagerBinding10 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityMusicManagerBinding10 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding10.tvTitle1);
                        java.lang.String string = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_548);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_548)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                        com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.dismissLoadingDialog();
                        com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.syncToDevice = false;
                    }
                });
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onWriteFailedReport");
            }

            @Override // com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackModelCallback
            public void onTransferWasValidReport(int var1) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "13");
                com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.syncToDevice = false;
                com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance().exitSongTransferMode();
                com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getFileList();
            }
        });
        if (com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance().getConnectState()) {
            getFileList();
            return;
        }
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_549);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_549)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        connectDevice();
        showLoadingDialogTimeoutNotCancel(com.google.android.gms.fitness.FitnessStatusCodes.NEEDS_OAUTH_PERMISSIONS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m802setupViews$lambda2(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity, com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "<anonymous parameter 0>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean menuSongBean = musicManagerActivity.getViewModel().getMenusList().get(i);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("menuId", menuSongBean.getMenuId());
        bundle.putString("menuName", menuSongBean.getMenuName());
        android.app.Activity activity = (android.app.Activity) musicManagerActivity;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.music.MyMenuMusicActivity.class);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-3, reason: not valid java name */
    public static final void m803setupViews$lambda3(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity, com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.Operation operation, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity, "this$0");
        com.qcwireless.qcwatch.ui.device.music.bean.Song song = musicManagerActivity.getViewModel().getDeviceMusicList().get(i);
        song.setSelect(!song.getSelect());
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter = musicManagerActivity.deviceMusicAdapter;
        if (musicManagerListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceMusicAdapter");
            musicManagerListAdapter = null;
        }
        musicManagerListAdapter.notifyDataSetChanged();
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
            if (!musicManagerActivity.getViewModel().getAddList().contains(song2)) {
                musicManagerActivity.getViewModel().getAddList().add(song2);
            }
        } else {
            musicManagerActivity.getViewModel().getAddList().remove(song2);
        }
        android.content.Context context = (android.content.Context) musicManagerActivity;
        android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.music_select_all);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.music_select_all_not);
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        }
        if (musicManagerActivity.getViewModel().getAddList().size() >= musicManagerActivity.getViewModel().getDeviceMusicList().size()) {
            com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding = musicManagerActivity.binding;
            if (activityMusicManagerBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMusicManagerBinding = null;
            }
            activityMusicManagerBinding.tvMusicAll.setCompoundDrawables(null, drawable, null, null);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding2 = musicManagerActivity.binding;
        if (activityMusicManagerBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicManagerBinding2 = null;
        }
        activityMusicManagerBinding2.tvMusicAll.setCompoundDrawables(null, drawable2, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4, reason: not valid java name */
    public static final void m804setupViews$lambda4(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity, "this$0");
        musicManagerActivity.getViewModel().queryAllMenus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-5, reason: not valid java name */
    public static final void m805setupViews$lambda5(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity, "this$0");
        musicManagerActivity.getViewModel().getMenusList().clear();
        java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean> menusList = musicManagerActivity.getViewModel().getMenusList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "it");
        menusList.addAll(list);
        musicManagerActivity.getViewModel().getMenusDialogList().clear();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            musicManagerActivity.getViewModel().getMenusDialogList().add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(((com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean) it.next()).getMenuName(), false));
        }
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicMenuListAdapter musicMenuListAdapter = musicManagerActivity.musicMenuAdapter;
        if (musicMenuListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("musicMenuAdapter");
            musicMenuListAdapter = null;
        }
        musicMenuListAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-6, reason: not valid java name */
    public static final void m806setupViews$lambda6(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity, "this$0");
        musicManagerActivity.getViewModel().getDeviceMusicList().clear();
        java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> deviceMusicList = musicManagerActivity.getViewModel().getDeviceMusicList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "it");
        deviceMusicList.addAll(list);
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter = musicManagerActivity.deviceMusicAdapter;
        if (musicManagerListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceMusicAdapter");
            musicManagerListAdapter = null;
        }
        musicManagerListAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-8, reason: not valid java name */
    public static final void m807setupViews$lambda8(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity, com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.PopWindowUI popWindowUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity, "this$0");
        android.view.View view = popWindowUI.getView();
        if (view != null) {
            musicManagerActivity.showPopWindow(view, popWindowUI.getPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-9, reason: not valid java name */
    public static final void m808setupViews$lambda9(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity, "this$0");
        musicManagerActivity.showLoadingDialogTimeoutNotCancel(180000);
        com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance().queryDeviceInfo();
        musicManagerActivity.totalIndex = musicManagerActivity.getViewModel().getBlockingQueue().size();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "歌曲总数:" + musicManagerActivity.getViewModel().getBlockingQueue().size());
        musicManagerActivity.handler.postDelayed(musicManagerActivity.timeoutRunnable, 10000L);
        musicManagerActivity.syncToDevice = true;
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            finish();
        }
        getViewModel().queryAllMenus();
        getViewModel().queryAllMusicNoMenus();
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$onResume$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity) {
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity, "$this$ktxRunOnBgSingle");
                viewModel = musicManagerActivity.getViewModel();
                if (viewModel.existsMusic() > 0) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(musicManagerActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$onResume$1.1
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity2) {
                            com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity2, "$this$ktxRunOnUi");
                            activityMusicManagerBinding = musicManagerActivity2.binding;
                            if (activityMusicManagerBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMusicManagerBinding.noMusic);
                        }
                    });
                } else {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(musicManagerActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$onResume$1.2
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity2) {
                            com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity2, "$this$ktxRunOnUi");
                            activityMusicManagerBinding = musicManagerActivity2.binding;
                            if (activityMusicManagerBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding.noMusic);
                        }
                    });
                }
            }
        });
    }

    private final void connectDevice() {
        android.bluetooth.BluetoothDevice macSystemBond = com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().getMacSystemBond(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getClassicBluetoothMac());
        if (macSystemBond != null) {
            try {
                com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().connectRtkSPP(macSystemBond);
                return;
            } catch (java.lang.Exception unused) {
                com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().connectRtkSPP(macSystemBond);
                return;
            }
        }
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().classicBluetoothStartScan();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r0.intValue() != r1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getFileList() {
        /*
            r4 = this;
            int r0 = com.oudmon.ble.base.bluetooth.spp.RtkSppConstants.FILE_TYPE_HEADER_BIN
            r4.mCurrentGetFileType = r0
            com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp r0 = com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance()     // Catch: java.lang.Exception -> L55
            int r1 = com.oudmon.ble.base.bluetooth.spp.RtkSppConstants.FILE_TYPE_HEADER_BIN     // Catch: java.lang.Exception -> L55
            java.lang.Integer r0 = r0.getFileListData(r1)     // Catch: java.lang.Exception -> L55
            java.lang.String r1 = "HeZhiYuan"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L55
            r2.<init>()     // Catch: java.lang.Exception -> L55
            java.lang.String r3 = "error---------"
            r2.append(r3)     // Catch: java.lang.Exception -> L55
            r2.append(r0)     // Catch: java.lang.Exception -> L55
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L55
            com.iwown.awlog.AwLog.i(r1, r2)     // Catch: java.lang.Exception -> L55
            int r1 = com.oudmon.ble.base.bluetooth.spp.RtkSppConstants.ERR_DEVICE_DISCONNECTED     // Catch: java.lang.Exception -> L55
            if (r0 != 0) goto L29
            goto L2f
        L29:
            int r2 = r0.intValue()     // Catch: java.lang.Exception -> L55
            if (r2 == r1) goto L39
        L2f:
            r1 = -1
            if (r0 != 0) goto L33
            goto L59
        L33:
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L55
            if (r0 != r1) goto L59
        L39:
            r0 = 2131821427(0x7f110373, float:1.9275597E38)
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L55
            java.lang.String r1 = "getString(R.string.qc_text_549)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L55
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.lang.Exception -> L55
            r1 = 0
            r2 = 1
            r3 = 0
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L55
            com.oudmon.ble.base.bluetooth.BleOperateManager r0 = com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance()     // Catch: java.lang.Exception -> L55
            r0.classicBluetoothStartScan()     // Catch: java.lang.Exception -> L55
            goto L59
        L55:
            r0 = move-exception
            r0.printStackTrace()
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.getFileList():void");
    }

    /* compiled from: MusicManagerActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¨\u0006\u0014"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/MusicManagerActivity$ConnectCallback;", "Lcom/oudmon/ble/base/bluetooth/spp/MyBumblebeeCallback;", "(Lcom/qcwireless/qcwatch/ui/device/music/MusicManagerActivity;)V", "onAckReceived", "", "var1", "", "var2", "", "onConnectionStateChanged", "Landroid/bluetooth/BluetoothDevice;", "var3", "onDeviceInfoChanged", "Lcom/oudmon/ble/base/bluetooth/spp/bean/MyDeviceInfo;", "onEventReported", "", "onServiceConnectionStateChanged", "", "onStateChanged", "state", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class ConnectCallback implements com.oudmon.ble.base.bluetooth.spp.MyBumblebeeCallback {
        @Override // com.oudmon.ble.base.bluetooth.spp.MyBumblebeeCallback
        public void onAckReceived(int var1, byte var2) {
        }

        @Override // com.oudmon.ble.base.bluetooth.spp.MyBumblebeeCallback
        public void onConnectionStateChanged(android.bluetooth.BluetoothDevice var1, int var2, int var3) {
        }

        @Override // com.oudmon.ble.base.bluetooth.spp.MyBumblebeeCallback
        public void onDeviceInfoChanged(com.oudmon.ble.base.bluetooth.spp.bean.MyDeviceInfo var1, int var2) {
        }

        @Override // com.oudmon.ble.base.bluetooth.spp.MyBumblebeeCallback
        public void onEventReported(int var1, byte[] var2) {
        }

        public ConnectCallback() {
        }

        @Override // com.oudmon.ble.base.bluetooth.spp.MyBumblebeeCallback
        public void onStateChanged(int state) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(state));
            if (state == 260) {
                final com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.ConnectCallback, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$ConnectCallback$onStateChanged$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.ConnectCallback) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.ConnectCallback connectCallback) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectCallback, "$this$ktxRunOnUi");
                        com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.finish();
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default("直接断连退出", 0, 1, null);
                    }
                });
            } else {
                if (state != 264) {
                    return;
                }
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "------------STATE_DEVICE_CONNECTED");
            }
        }

        @Override // com.oudmon.ble.base.bluetooth.spp.MyBumblebeeCallback
        public void onServiceConnectionStateChanged(boolean var1) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(var1));
        }
    }

    /* compiled from: MusicManagerActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/MusicManagerActivity$ProgressBarCallback;", "Lcom/oudmon/ble/base/bluetooth/spp/MyLocalPlaybackTransferEngineCallback;", "(Lcom/qcwireless/qcwatch/ui/device/music/MusicManagerActivity;)V", "onTransferProgressChanged", "", "progress", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class ProgressBarCallback implements com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackTransferEngineCallback {
        public ProgressBarCallback() {
        }

        @Override // com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackTransferEngineCallback
        public void onTransferProgressChanged(final int progress) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "progress:" + progress);
            final com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this;
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.ProgressBarCallback, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$ProgressBarCallback$onTransferProgressChanged$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.ProgressBarCallback) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.ProgressBarCallback progressBarCallback) {
                    android.os.Handler handler;
                    com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.TimeoutRunnable timeoutRunnable;
                    com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding;
                    com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding2;
                    com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel;
                    com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding3;
                    com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding4;
                    com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding5;
                    com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding6;
                    int i;
                    int i2;
                    com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding7;
                    com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding8;
                    com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding9;
                    com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding10;
                    int i3;
                    int i4;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressBarCallback, "$this$ktxRunOnUi");
                    handler = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.handler;
                    timeoutRunnable = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.timeoutRunnable;
                    handler.removeCallbacks(timeoutRunnable);
                    com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding11 = null;
                    if (progress > 0) {
                        com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.syncToDevice = true;
                        if (!com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.isDialogShowing() && progress <= 99) {
                            com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.showLoadingDialogTimeoutNotCancel(180000);
                        }
                        activityMusicManagerBinding7 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                        if (activityMusicManagerBinding7 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityMusicManagerBinding7 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding7.ctlProgress);
                        activityMusicManagerBinding8 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                        if (activityMusicManagerBinding8 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityMusicManagerBinding8 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.invisible(activityMusicManagerBinding8.tvTitle1);
                        activityMusicManagerBinding9 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                        if (activityMusicManagerBinding9 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityMusicManagerBinding9 = null;
                        }
                        android.widget.TextView textView = activityMusicManagerBinding9.tvTextProgress;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(progress);
                        sb.append('%');
                        textView.setText(sb.toString());
                        activityMusicManagerBinding10 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                        if (activityMusicManagerBinding10 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityMusicManagerBinding10 = null;
                        }
                        android.widget.TextView textView2 = activityMusicManagerBinding10.tvTextIndex;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        i3 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.currIndex;
                        sb2.append(i3);
                        sb2.append('/');
                        i4 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.totalIndex;
                        sb2.append(i4);
                        textView2.setText(sb2.toString());
                    } else {
                        activityMusicManagerBinding = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                        if (activityMusicManagerBinding == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityMusicManagerBinding = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMusicManagerBinding.ctlProgress);
                        activityMusicManagerBinding2 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                        if (activityMusicManagerBinding2 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityMusicManagerBinding2 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding2.tvTitle1);
                    }
                    if (progress >= 100) {
                        viewModel = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                        if (viewModel.getBlockingQueue().size() > 0) {
                            activityMusicManagerBinding3 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding3 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding3 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding3.ctlProgress);
                            activityMusicManagerBinding4 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding4 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding4 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.invisible(activityMusicManagerBinding4.tvTitle1);
                            activityMusicManagerBinding5 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding5 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding5 = null;
                            }
                            android.widget.TextView textView3 = activityMusicManagerBinding5.tvTextProgress;
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            sb3.append(progress);
                            sb3.append('%');
                            textView3.setText(sb3.toString());
                            activityMusicManagerBinding6 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding6 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMusicManagerBinding11 = activityMusicManagerBinding6;
                            }
                            android.widget.TextView textView4 = activityMusicManagerBinding11.tvTextIndex;
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                            i = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.currIndex;
                            sb4.append(i);
                            sb4.append('/');
                            i2 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.totalIndex;
                            sb4.append(i2);
                            textView4.setText(sb4.toString());
                            return;
                        }
                        com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.dismissLoadingDialog();
                        final com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity2 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this;
                        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(progressBarCallback, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.ProgressBarCallback, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$ProgressBarCallback$onTransferProgressChanged$1.1
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                invoke((com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.ProgressBarCallback) obj);
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.ProgressBarCallback progressBarCallback2) {
                                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding12;
                                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding13;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressBarCallback2, "$this$ktxRunOnUi");
                                activityMusicManagerBinding12 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding14 = null;
                                if (activityMusicManagerBinding12 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    activityMusicManagerBinding12 = null;
                                }
                                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMusicManagerBinding12.ctlProgress);
                                activityMusicManagerBinding13 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.binding;
                                if (activityMusicManagerBinding13 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    activityMusicManagerBinding14 = activityMusicManagerBinding13;
                                }
                                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding14.tvTitle1);
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showPopWindow(android.view.View view, final int pos) {
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_534);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_534)");
        android.content.Context context = (android.content.Context) this;
        new com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder((android.app.Activity) this).setData(kotlin.collections.CollectionsKt.mutableListOf(new com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel[]{new com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel(string, 0, 2, null)})).setCancelable(true).setPopupOrientation(com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder.VERTICAL).setDividerColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.music_common_1)).setPopupBgColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.music_common_1)).setOnItemClickListener(new com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder.OnItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$showPopWindow$pop$1
            @Override // com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder.OnItemClickListener
            public void onItemClick(android.view.View view2, int position) {
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "view");
                viewModel = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                com.qcwireless.qcwatch.ui.device.music.bean.Song song = viewModel.getDeviceMusicList().get(pos);
                if (position != 0) {
                    return;
                }
                viewModel2 = com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.getViewModel();
                viewModel2.deleteSingleMusic(song);
            }
        }).create().showAtView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showMyMusicNameDialog(java.lang.String text) {
        com.qcwireless.qcwatch.base.dialog.MusicEditDialog musicEditDialog = new com.qcwireless.qcwatch.base.dialog.MusicEditDialog((android.content.Context) this, text);
        musicEditDialog.setOnTextConfirmListener(new com.qcwireless.qcwatch.base.dialog.MusicEditDialog.OnTextConfirmListener() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$$ExternalSyntheticLambda8
            @Override // com.qcwireless.qcwatch.base.dialog.MusicEditDialog.OnTextConfirmListener
            public final void OnConfirm(java.lang.String str) {
                com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.m810showMyMusicNameDialog$lambda10(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this, str);
            }
        });
        musicEditDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showMyMusicNameDialog$lambda-10, reason: not valid java name */
    public static final void m810showMyMusicNameDialog$lambda10(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "it");
        if (str.length() > 0) {
            musicManagerActivity.getViewModel().addSongMenu(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMenusListDialog() {
        getViewModel().queryAllMenus();
        com.qcwireless.qcwatch.base.dialog.BottomListDialog create = new com.qcwireless.qcwatch.base.dialog.BottomListDialog.Builder(getActivity()).create();
        create.show();
        create.initView();
        create.setSubTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_532));
        create.setData(getViewModel().getMenusDialogList());
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$$ExternalSyntheticLambda6
            @Override // com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener
            public final void onSelected(int i) {
                com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.m809showMenusListDialog$lambda11(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showMenusListDialog$lambda-11, reason: not valid java name */
    public static final void m809showMenusListDialog$lambda11(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity, "this$0");
        com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean menuSongBean = musicManagerActivity.getViewModel().getMenusList().get(i);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, menuSongBean);
        musicManagerActivity.getViewModel().addMusicToMenus(musicManagerActivity.getViewModel().getAddList(), menuSongBean.getMenuName(), menuSongBean.getMenuId());
        musicManagerActivity.getViewModel().queryAllMenus();
        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding = musicManagerActivity.binding;
        if (activityMusicManagerBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicManagerBinding = null;
        }
        activityMusicManagerBinding.titleBar.tvRightText.performClick();
    }

    private final void showSingleMusicToMenusListDialog(final com.qcwireless.qcwatch.ui.device.music.bean.Song song) {
        getViewModel().queryAllMenus();
        com.qcwireless.qcwatch.base.dialog.BottomListDialog create = new com.qcwireless.qcwatch.base.dialog.BottomListDialog.Builder(getActivity()).create();
        create.show();
        create.initView();
        create.setSubTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_532));
        create.setData(getViewModel().getMenusDialogList());
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity$$ExternalSyntheticLambda7
            @Override // com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener
            public final void onSelected(int i) {
                com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.m811showSingleMusicToMenusListDialog$lambda12(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this, song, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showSingleMusicToMenusListDialog$lambda-12, reason: not valid java name */
    public static final void m811showSingleMusicToMenusListDialog$lambda12(com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity musicManagerActivity, com.qcwireless.qcwatch.ui.device.music.bean.Song song, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(song, "$song");
        com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean menuSongBean = musicManagerActivity.getViewModel().getMenusList().get(i);
        musicManagerActivity.getViewModel().addSingleMusicToMenus(song, menuSongBean.getMenuName(), menuSongBean.getMenuId());
        musicManagerActivity.getViewModel().queryAllMenus();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.FinishMusicAddFirstEvent) {
            getViewModel().queryAllMenus();
            getViewModel().queryAllMusicNoMenus();
        } else {
            if (messageEvent instanceof com.qcwireless.qcwatch.base.event.MusicToDeviceEvent) {
                getViewModel().queryAddToDevice();
                return;
            }
            if (!(messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) || ((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect()) {
                return;
            }
            java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            finish();
        }
    }

    /* compiled from: MusicManagerActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/MusicManagerActivity$TimeoutRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/device/music/MusicManagerActivity;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class TimeoutRunnable implements java.lang.Runnable {
        public TimeoutRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.this.dismissLoadingDialog();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().removeSppCallback();
    }
}
