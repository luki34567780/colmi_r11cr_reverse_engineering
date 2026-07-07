package com.qcwireless.qcwatch.ui.device.music;

/* compiled from: JieLiBleMusicManagerActivity.kt */
@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001EB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020)H\u0002J\"\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u00020)H\u0016J\u0012\u00101\u001a\u00020)2\b\u00102\u001a\u0004\u0018\u000103H\u0014J\b\u00104\u001a\u00020)H\u0014J\u0010\u00105\u001a\u00020)2\u0006\u00106\u001a\u000207H\u0017J\b\u00108\u001a\u00020)H\u0014J\b\u00109\u001a\u00020)H\u0002J\b\u0010:\u001a\u00020)H\u0015J\b\u0010;\u001a\u00020)H\u0002J\u0010\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020\u0019H\u0002J\u0018\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\bH\u0002J\u0010\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020DH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00060\u001dR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\b\u0018\u00010&R\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/JieLiBleMusicManagerActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "FLAG_HOMEKEY_DISPATCHED", "", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityMusicManagerBinding;", "currIndex", "", "currMusicFile", "Ljava/io/File;", "deviceMusicAdapter", "Lcom/qcwireless/qcwatch/ui/device/music/adapter/MusicManagerListAdapter;", "editFlag", "", "handler", "Landroid/os/Handler;", "mBufferCheckSize", "mCurrentGetFile", "mCurrentGetFileType", "mSendPacketSize", "mSupportFormats", "musicMenuAdapter", "Lcom/qcwireless/qcwatch/ui/device/music/adapter/MusicMenuListAdapter;", "musicName", "", "selectFlag", "syncToDevice", "timeoutRunnable", "Lcom/qcwireless/qcwatch/ui/device/music/JieLiBleMusicManagerActivity$TimeoutRunnable;", "totalIndex", "viewModel", "Lcom/qcwireless/qcwatch/ui/device/music/vm/MusicManagerViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/device/music/vm/MusicManagerViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "connectDevice", "", "getFileList", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAttachedToWindow", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "sendMusic", "setupViews", "showMenusListDialog", "showMyMusicNameDialog", "text", "showPopWindow", "view", "Landroid/view/View;", "pos", "showSingleMusicToMenusListDialog", "song", "Lcom/qcwireless/qcwatch/ui/device/music/bean/Song;", "TimeoutRunnable", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class JieLiBleMusicManagerActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
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
    private android.os.PowerManager.WakeLock wakeLock;
    private final long FLAG_HOMEKEY_DISPATCHED = 2147483648L;
    private int currIndex = 1;
    private final com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.TimeoutRunnable timeoutRunnable = new com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.TimeoutRunnable();
    private java.lang.String musicName = "";

    private final void connectDevice() {
    }

    public JieLiBleMusicManagerActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel m782invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel.class), qualifier, qualifier);
            }
        });
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$handler$1
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
        getWindow().addFlags(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4);
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
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter2 = null;
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
        if (com.qcwireless.qcwatch.base.ktx.SystemServiceExtKt.getPowerManager(context) != null) {
            android.os.PowerManager powerManager = com.qcwireless.qcwatch.base.ktx.SystemServiceExtKt.getPowerManager(context);
            kotlin.jvm.internal.Intrinsics.checkNotNull(powerManager);
            android.os.PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(536870913, "DeviceFirmwareUpdateActivity");
            this.wakeLock = newWakeLock;
            if (newWakeLock != null) {
                newWakeLock.acquire(600000L);
            }
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
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter3 = this.deviceMusicAdapter;
        if (musicManagerListAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceMusicAdapter");
            musicManagerListAdapter3 = null;
        }
        recyclerView2.setAdapter(musicManagerListAdapter3);
        activityMusicManagerBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_530));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMusicManagerBinding.titleBar.tvRightText);
        activityMusicManagerBinding.titleBar.tvRightText.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_542));
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getUiMusicRefresh().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$$ExternalSyntheticLambda6
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.m771setupViews$lambda1(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this, (java.util.List) obj);
            }
        });
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
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$3
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
                com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter4;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding18;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel7;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel8;
                boolean z3;
                boolean z4;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding19;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding20;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding21;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel9;
                com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter5;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding22;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding23;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding24;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel10;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityMusicManagerBinding9 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding25 = null;
                com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter6 = null;
                com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter7 = null;
                com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding26 = null;
                if (activityMusicManagerBinding9 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityMusicManagerBinding9 = null;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityMusicManagerBinding9.tvMusicLyrics)) {
                    activityMusicManagerBinding10 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                    if (activityMusicManagerBinding10 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityMusicManagerBinding10 = null;
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityMusicManagerBinding10.tvAddMusic)) {
                        activityMusicManagerBinding11 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                        if (activityMusicManagerBinding11 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityMusicManagerBinding11 = null;
                        }
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityMusicManagerBinding11.titleBar.tvRightText)) {
                            activityMusicManagerBinding12 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding12 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding12 = null;
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityMusicManagerBinding12.tvMusicAll)) {
                                viewModel5 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getViewModel();
                                viewModel5.getAddList().clear();
                                com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this;
                                z = jieLiBleMusicManagerActivity.selectFlag;
                                jieLiBleMusicManagerActivity.selectFlag = !z;
                                android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable((android.content.Context) com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this, com.qcwireless.qcwatch.R.mipmap.music_select_all);
                                if (drawable != null) {
                                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                }
                                android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable((android.content.Context) com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this, com.qcwireless.qcwatch.R.mipmap.music_select_all_not);
                                if (drawable2 != null) {
                                    drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
                                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                }
                                z2 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.selectFlag;
                                if (z2) {
                                    activityMusicManagerBinding18 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                                    if (activityMusicManagerBinding18 == null) {
                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                        activityMusicManagerBinding18 = null;
                                    }
                                    activityMusicManagerBinding18.tvMusicAll.setCompoundDrawables(null, drawable, null, null);
                                    viewModel7 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getViewModel();
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
                                        viewModel8 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getViewModel();
                                        viewModel8.getAddList().add(song2);
                                    }
                                } else {
                                    activityMusicManagerBinding17 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                                    if (activityMusicManagerBinding17 == null) {
                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                        activityMusicManagerBinding17 = null;
                                    }
                                    activityMusicManagerBinding17.tvMusicAll.setCompoundDrawables(null, drawable2, null, null);
                                    viewModel6 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getViewModel();
                                    java.util.Iterator<com.qcwireless.qcwatch.ui.device.music.bean.Song> it = viewModel6.getDeviceMusicList().iterator();
                                    while (it.hasNext()) {
                                        it.next().setSelect(false);
                                    }
                                }
                                musicManagerListAdapter4 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.deviceMusicAdapter;
                                if (musicManagerListAdapter4 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceMusicAdapter");
                                } else {
                                    musicManagerListAdapter7 = musicManagerListAdapter4;
                                }
                                musicManagerListAdapter7.notifyDataSetChanged();
                                return;
                            }
                            activityMusicManagerBinding13 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding13 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding13 = null;
                            }
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityMusicManagerBinding13.tvAddMyMusic)) {
                                activityMusicManagerBinding14 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                                if (activityMusicManagerBinding14 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    activityMusicManagerBinding14 = null;
                                }
                                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityMusicManagerBinding14.tvMusicDelete)) {
                                    viewModel = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getViewModel();
                                    if (viewModel.getAddList().size() != 0) {
                                        viewModel2 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getViewModel();
                                        viewModel3 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getViewModel();
                                        viewModel2.deleteMusic(viewModel3.getAddList());
                                        activityMusicManagerBinding16 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                                        if (activityMusicManagerBinding16 == null) {
                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                        } else {
                                            activityMusicManagerBinding26 = activityMusicManagerBinding16;
                                        }
                                        activityMusicManagerBinding26.titleBar.tvRightText.performClick();
                                        return;
                                    }
                                    java.lang.String string = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_544);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_544)");
                                    com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                                    return;
                                }
                                activityMusicManagerBinding15 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                                if (activityMusicManagerBinding15 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    activityMusicManagerBinding25 = activityMusicManagerBinding15;
                                }
                                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityMusicManagerBinding25.btnAddMusic)) {
                                    android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this;
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
                            com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.getInstance().registerMusicBleCallback();
                            viewModel4 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getViewModel();
                            if (viewModel4.getAddList().size() != 0) {
                                com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.showMenusListDialog();
                                return;
                            }
                            java.lang.String string2 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_544);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_544)");
                            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
                            return;
                        }
                        com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity2 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this;
                        z3 = jieLiBleMusicManagerActivity2.editFlag;
                        jieLiBleMusicManagerActivity2.editFlag = !z3;
                        z4 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.editFlag;
                        if (z4) {
                            activityMusicManagerBinding22 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding22 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding22 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding22.cs4);
                            activityMusicManagerBinding23 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding23 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding23 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.invisible(activityMusicManagerBinding23.cs3);
                            activityMusicManagerBinding24 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding24 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding24 = null;
                            }
                            activityMusicManagerBinding24.titleBar.tvRightText.setText(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_543));
                            viewModel10 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getViewModel();
                            for (com.qcwireless.qcwatch.ui.device.music.bean.Song song3 : viewModel10.getDeviceMusicList()) {
                                song3.setSelect(false);
                                song3.setEditMusic(true);
                            }
                        } else {
                            activityMusicManagerBinding19 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding19 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding19 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMusicManagerBinding19.cs4);
                            activityMusicManagerBinding20 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding20 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding20 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding20.cs3);
                            activityMusicManagerBinding21 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding21 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding21 = null;
                            }
                            activityMusicManagerBinding21.titleBar.tvRightText.setText(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_542));
                            viewModel9 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getViewModel();
                            java.util.Iterator<com.qcwireless.qcwatch.ui.device.music.bean.Song> it2 = viewModel9.getDeviceMusicList().iterator();
                            while (it2.hasNext()) {
                                it2.next().setEditMusic(false);
                            }
                        }
                        musicManagerListAdapter5 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.deviceMusicAdapter;
                        if (musicManagerListAdapter5 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceMusicAdapter");
                        } else {
                            musicManagerListAdapter6 = musicManagerListAdapter5;
                        }
                        musicManagerListAdapter6.notifyDataSetChanged();
                        return;
                    }
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("activityType", 2);
                    kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                    android.app.Activity activity2 = (android.app.Activity) com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this;
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
                com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.startActivityForResult(intent3, 0);
            }
        });
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicMenuListAdapter musicMenuListAdapter3 = this.musicMenuAdapter;
        if (musicMenuListAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("musicMenuAdapter");
            musicMenuListAdapter3 = null;
        }
        musicMenuListAdapter3.setOnItemClickListener(new com.chad.library.adapter.base.listener.OnItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$$ExternalSyntheticLambda7
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
                com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.m773setupViews$lambda3(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this, baseQuickAdapter, view, i);
            }
        });
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter4 = this.deviceMusicAdapter;
        if (musicManagerListAdapter4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceMusicAdapter");
            musicManagerListAdapter4 = null;
        }
        musicManagerListAdapter4.setOnItemMultiSelectListener(new com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemMultiSelectListener() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$$ExternalSyntheticLambda1
            @Override // com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemMultiSelectListener
            public final void onSelected(com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.Operation operation, int i, boolean z) {
                com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.m774setupViews$lambda4(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this, operation, i, z);
            }
        });
        getViewModel().getAddMusicState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$$ExternalSyntheticLambda3
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.m775setupViews$lambda5(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this, (java.lang.Boolean) obj);
            }
        });
        getViewModel().getUiRefresh().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$$ExternalSyntheticLambda5
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.m776setupViews$lambda6(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this, (java.util.List) obj);
            }
        });
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter5 = this.deviceMusicAdapter;
        if (musicManagerListAdapter5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceMusicAdapter");
            musicManagerListAdapter5 = null;
        }
        musicManagerListAdapter5.getItemState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$$ExternalSyntheticLambda2
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.m777setupViews$lambda8(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this, (com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.PopWindowUI) obj);
            }
        });
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter6 = this.deviceMusicAdapter;
        if (musicManagerListAdapter6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceMusicAdapter");
        } else {
            musicManagerListAdapter2 = musicManagerListAdapter6;
        }
        musicManagerListAdapter2.getMusic().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.m778setupViews$lambda9(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this, (com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.MusicUI) obj);
            }
        });
        getViewModel().getUiAddToDeviceRefresh().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$$ExternalSyntheticLambda4
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.m772setupViews$lambda10(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this, (java.lang.Integer) obj);
            }
        });
        com.oudmon.ble.base.communication.file.EbookHandle.getInstance().clearCallback();
        com.oudmon.ble.base.communication.file.EbookHandle.getInstance().registerCallback(new com.oudmon.ble.base.communication.file.IEbookCallback() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$11
            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onActionResult(int errCode) {
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onDeleteSuccess(int code) {
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onFileNames(java.util.ArrayList<java.lang.String> fileNames) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileNames, "fileNames");
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, fileNames);
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onProgress(final float percent) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Float.valueOf(percent));
                final com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$11, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$11$onProgress$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$11) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$11 jieLiBleMusicManagerActivity$setupViews$11) {
                        android.os.Handler handler;
                        com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.TimeoutRunnable timeoutRunnable;
                        android.os.Handler handler2;
                        com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.TimeoutRunnable timeoutRunnable2;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding9;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding10;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding11;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity$setupViews$11, "$this$ktxRunOnUi");
                        if (percent >= 0.0f) {
                            if (!jieLiBleMusicManagerActivity.isDialogShowing()) {
                                jieLiBleMusicManagerActivity.showLoadingDialogTimeoutNotCancel(80000);
                            }
                            handler = jieLiBleMusicManagerActivity.handler;
                            timeoutRunnable = jieLiBleMusicManagerActivity.timeoutRunnable;
                            handler.removeCallbacks(timeoutRunnable);
                            handler2 = jieLiBleMusicManagerActivity.handler;
                            timeoutRunnable2 = jieLiBleMusicManagerActivity.timeoutRunnable;
                            handler2.postDelayed(timeoutRunnable2, 10000L);
                            activityMusicManagerBinding9 = jieLiBleMusicManagerActivity.binding;
                            com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding12 = null;
                            if (activityMusicManagerBinding9 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding9 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding9.ctlProgress);
                            activityMusicManagerBinding10 = jieLiBleMusicManagerActivity.binding;
                            if (activityMusicManagerBinding10 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding10 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.invisible(activityMusicManagerBinding10.tvTitle2);
                            activityMusicManagerBinding11 = jieLiBleMusicManagerActivity.binding;
                            if (activityMusicManagerBinding11 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityMusicManagerBinding12 = activityMusicManagerBinding11;
                            }
                            android.widget.TextView textView = activityMusicManagerBinding12.tvTextProgress;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(percent);
                            sb.append('%');
                            textView.setText(sb.toString());
                            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(4);
                        }
                    }
                });
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onComplete() {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onComplete");
                final com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$11, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$11$onComplete$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$11) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$11 jieLiBleMusicManagerActivity$setupViews$11) {
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding9;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding10;
                        android.os.Handler handler;
                        com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.TimeoutRunnable timeoutRunnable;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity$setupViews$11, "$this$ktxRunOnUi");
                        com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.dismissLoadingDialog();
                        activityMusicManagerBinding9 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding11 = null;
                        if (activityMusicManagerBinding9 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityMusicManagerBinding9 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMusicManagerBinding9.ctlProgress);
                        activityMusicManagerBinding10 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                        if (activityMusicManagerBinding10 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityMusicManagerBinding11 = activityMusicManagerBinding10;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding11.tvTitle2);
                        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
                        handler = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.handler;
                        timeoutRunnable = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.timeoutRunnable;
                        handler.removeCallbacks(timeoutRunnable);
                    }
                });
            }
        });
        com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.getInstance().setOutSerialListener(new com.oudmon.ble.base.bluetooth.spp.SerialListener() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$12
            @Override // com.oudmon.ble.base.bluetooth.spp.SerialListener
            public void onSerialRead(java.util.ArrayDeque<byte[]> datas) {
            }

            @Override // com.oudmon.ble.base.bluetooth.spp.SerialListener
            public void onSerialRead(byte[] data) {
            }

            @Override // com.oudmon.ble.base.bluetooth.spp.SerialListener
            public void onSerialConnect() {
                final com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$12, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$12$onSerialConnect$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$12) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$12 jieLiBleMusicManagerActivity$setupViews$12) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity$setupViews$12, "$this$ktxRunOnUi");
                        com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.dismissLoadingDialog();
                    }
                });
                com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getFileList();
            }

            @Override // com.oudmon.ble.base.bluetooth.spp.SerialListener
            public void onSerialConnectError(java.lang.Exception e) {
                final com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$12, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$12$onSerialConnectError$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$12) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$12 jieLiBleMusicManagerActivity$setupViews$12) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity$setupViews$12, "$this$ktxRunOnUi");
                        java.lang.String string = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_549);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_549)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                        com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.finish();
                    }
                });
            }

            @Override // com.oudmon.ble.base.bluetooth.spp.SerialListener
            public void onSerialIoError(java.lang.Exception e) {
                final com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$12, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$12$onSerialIoError$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$12) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$12 jieLiBleMusicManagerActivity$setupViews$12) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity$setupViews$12, "$this$ktxRunOnUi");
                        java.lang.String string = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_549);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_549)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                    }
                });
            }
        });
        com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.getInstance().clearCallback();
        com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.getInstance().initRegister();
        com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.getInstance().registerCallback(new com.oudmon.ble.base.communication.file.IEbookCallback() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13
            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onFileNames(final java.util.ArrayList<java.lang.String> fileNames) {
                if (fileNames != null) {
                    final com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13$onFileNames$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13 jieLiBleMusicManagerActivity$setupViews$13) {
                            com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity$setupViews$13, "$this$ktxRunOnUi");
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository.INSTANCE.getSongName().clear();
                            for (java.lang.String str : fileNames) {
                                com.oudmon.ble.base.bluetooth.spp.bean.MySongInfo mySongInfo = new com.oudmon.ble.base.bluetooth.spp.bean.MySongInfo();
                                java.lang.String substring = str.substring(0, str.length() - 4);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                mySongInfo.songNameWithoutSuffix = str;
                                mySongInfo.songName = str;
                                byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                                mySongInfo.songNameBuffer = bytes;
                                arrayList.add(mySongInfo);
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, substring);
                                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository.INSTANCE.getSongName().add(substring);
                            }
                            viewModel = jieLiBleMusicManagerActivity.getViewModel();
                            viewModel.addMusics(arrayList);
                        }
                    });
                }
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onProgress(final float progress) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "progress:" + progress);
                final com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13$onProgress$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13 jieLiBleMusicManagerActivity$setupViews$13) {
                        android.os.Handler handler;
                        com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.TimeoutRunnable timeoutRunnable;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding9;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding10;
                        com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding11;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding12;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding13;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding14;
                        int i;
                        int i2;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding15;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding16;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding17;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding18;
                        int i3;
                        int i4;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity$setupViews$13, "$this$ktxRunOnUi");
                        handler = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.handler;
                        timeoutRunnable = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.timeoutRunnable;
                        handler.removeCallbacks(timeoutRunnable);
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding19 = null;
                        if (progress > 0.0f) {
                            com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.syncToDevice = true;
                            if (!com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.isDialogShowing() && progress <= 99.0f) {
                                com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.showLoadingDialogTimeoutNotCancel(180000);
                            }
                            activityMusicManagerBinding15 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding15 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding15 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding15.ctlProgress);
                            activityMusicManagerBinding16 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding16 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding16 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.invisible(activityMusicManagerBinding16.tvTitle1);
                            activityMusicManagerBinding17 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding17 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding17 = null;
                            }
                            android.widget.TextView textView = activityMusicManagerBinding17.tvTextProgress;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(progress);
                            sb.append('%');
                            textView.setText(sb.toString());
                            activityMusicManagerBinding18 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding18 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding18 = null;
                            }
                            android.widget.TextView textView2 = activityMusicManagerBinding18.tvTextIndex;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            i3 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.currIndex;
                            sb2.append(i3);
                            sb2.append('/');
                            i4 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.totalIndex;
                            sb2.append(i4);
                            textView2.setText(sb2.toString());
                        } else {
                            activityMusicManagerBinding9 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding9 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding9 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMusicManagerBinding9.ctlProgress);
                            activityMusicManagerBinding10 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                            if (activityMusicManagerBinding10 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding10 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding10.tvTitle1);
                        }
                        if (progress >= 100.0f) {
                            viewModel = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getViewModel();
                            if (viewModel.getBlockingQueue().size() > 0) {
                                activityMusicManagerBinding11 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                                if (activityMusicManagerBinding11 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    activityMusicManagerBinding11 = null;
                                }
                                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding11.ctlProgress);
                                activityMusicManagerBinding12 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                                if (activityMusicManagerBinding12 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    activityMusicManagerBinding12 = null;
                                }
                                com.qcwireless.qcwatch.base.view.ViewKt.invisible(activityMusicManagerBinding12.tvTitle1);
                                activityMusicManagerBinding13 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                                if (activityMusicManagerBinding13 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    activityMusicManagerBinding13 = null;
                                }
                                android.widget.TextView textView3 = activityMusicManagerBinding13.tvTextProgress;
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                sb3.append(progress);
                                sb3.append('%');
                                textView3.setText(sb3.toString());
                                activityMusicManagerBinding14 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                                if (activityMusicManagerBinding14 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    activityMusicManagerBinding19 = activityMusicManagerBinding14;
                                }
                                android.widget.TextView textView4 = activityMusicManagerBinding19.tvTextIndex;
                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                i = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.currIndex;
                                sb4.append(i);
                                sb4.append('/');
                                i2 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.totalIndex;
                                sb4.append(i2);
                                textView4.setText(sb4.toString());
                                return;
                            }
                            com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.dismissLoadingDialog();
                            final com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity2 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this;
                            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(jieLiBleMusicManagerActivity$setupViews$13, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13$onProgress$1.1
                                {
                                    super(1);
                                }

                                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                    invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13) obj);
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13 jieLiBleMusicManagerActivity$setupViews$132) {
                                    com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding20;
                                    com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding21;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity$setupViews$132, "$this$ktxRunOnUi");
                                    activityMusicManagerBinding20 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                                    com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding22 = null;
                                    if (activityMusicManagerBinding20 == null) {
                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                        activityMusicManagerBinding20 = null;
                                    }
                                    com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMusicManagerBinding20.ctlProgress);
                                    activityMusicManagerBinding21 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                                    if (activityMusicManagerBinding21 == null) {
                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    } else {
                                        activityMusicManagerBinding22 = activityMusicManagerBinding21;
                                    }
                                    com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding22.tvTitle1);
                                }
                            });
                        }
                    }
                });
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onComplete() {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onComplete");
                final com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13$onComplete$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13 jieLiBleMusicManagerActivity$setupViews$13) {
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding9;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding10;
                        android.os.Handler handler;
                        com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.TimeoutRunnable timeoutRunnable;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity$setupViews$13, "$this$ktxRunOnUi");
                        com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.dismissLoadingDialog();
                        activityMusicManagerBinding9 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding11 = null;
                        if (activityMusicManagerBinding9 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityMusicManagerBinding9 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMusicManagerBinding9.ctlProgress);
                        activityMusicManagerBinding10 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.binding;
                        if (activityMusicManagerBinding10 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityMusicManagerBinding11 = activityMusicManagerBinding10;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding11.tvTitle2);
                        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
                        handler = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.handler;
                        timeoutRunnable = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.timeoutRunnable;
                        handler.removeCallbacks(timeoutRunnable);
                        com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.getInstance().start(0);
                    }
                });
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onDeleteSuccess(int code) {
                if (code == 0) {
                    com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.getInstance().start(0);
                } else {
                    final com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13$onDeleteSuccess$1
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13 jieLiBleMusicManagerActivity$setupViews$13) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity$setupViews$13, "$this$ktxRunOnUi");
                            java.lang.String string = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_589);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_589)");
                            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                        }
                    });
                }
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onActionResult(int errCode) {
                if (errCode > 0) {
                    final com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13$onActionResult$1
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$setupViews$13 jieLiBleMusicManagerActivity$setupViews$13) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity$setupViews$13, "$this$ktxRunOnUi");
                            java.lang.String string = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_592);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_592)");
                            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                        }
                    });
                }
            }
        });
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            getFileList();
            return;
        }
        connectDevice();
        showLoadingDialogTimeoutNotCancel(com.google.android.gms.fitness.FitnessStatusCodes.NEEDS_OAUTH_PERMISSIONS);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m771setupViews$lambda1(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity, "this$0");
        jieLiBleMusicManagerActivity.getViewModel().getDeviceMusicList().clear();
        java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> deviceMusicList = jieLiBleMusicManagerActivity.getViewModel().getDeviceMusicList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "it");
        deviceMusicList.addAll(list);
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter = null;
        if (list.size() > 0) {
            com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding = jieLiBleMusicManagerActivity.binding;
            if (activityMusicManagerBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMusicManagerBinding = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMusicManagerBinding.noMusic);
        } else {
            com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding2 = jieLiBleMusicManagerActivity.binding;
            if (activityMusicManagerBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMusicManagerBinding2 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMusicManagerBinding2.noMusic);
        }
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter2 = jieLiBleMusicManagerActivity.deviceMusicAdapter;
        if (musicManagerListAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceMusicAdapter");
        } else {
            musicManagerListAdapter = musicManagerListAdapter2;
        }
        musicManagerListAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-3, reason: not valid java name */
    public static final void m773setupViews$lambda3(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity, com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "<anonymous parameter 0>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean menuSongBean = jieLiBleMusicManagerActivity.getViewModel().getMenusList().get(i);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("menuId", menuSongBean.getMenuId());
        bundle.putString("menuName", menuSongBean.getMenuName());
        android.app.Activity activity = (android.app.Activity) jieLiBleMusicManagerActivity;
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
    /* renamed from: setupViews$lambda-4, reason: not valid java name */
    public static final void m774setupViews$lambda4(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity, com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.Operation operation, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity, "this$0");
        com.qcwireless.qcwatch.ui.device.music.bean.Song song = jieLiBleMusicManagerActivity.getViewModel().getDeviceMusicList().get(i);
        song.setSelect(!song.getSelect());
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter = jieLiBleMusicManagerActivity.deviceMusicAdapter;
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
            if (!jieLiBleMusicManagerActivity.getViewModel().getAddList().contains(song2)) {
                jieLiBleMusicManagerActivity.getViewModel().getAddList().add(song2);
            }
        } else {
            jieLiBleMusicManagerActivity.getViewModel().getAddList().remove(song2);
        }
        android.content.Context context = (android.content.Context) jieLiBleMusicManagerActivity;
        android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.music_select_all);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.music_select_all_not);
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        }
        if (jieLiBleMusicManagerActivity.getViewModel().getAddList().size() >= jieLiBleMusicManagerActivity.getViewModel().getDeviceMusicList().size()) {
            com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding = jieLiBleMusicManagerActivity.binding;
            if (activityMusicManagerBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMusicManagerBinding = null;
            }
            activityMusicManagerBinding.tvMusicAll.setCompoundDrawables(null, drawable, null, null);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding2 = jieLiBleMusicManagerActivity.binding;
        if (activityMusicManagerBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMusicManagerBinding2 = null;
        }
        activityMusicManagerBinding2.tvMusicAll.setCompoundDrawables(null, drawable2, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-5, reason: not valid java name */
    public static final void m775setupViews$lambda5(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity, "this$0");
        jieLiBleMusicManagerActivity.getViewModel().queryAllMenus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-6, reason: not valid java name */
    public static final void m776setupViews$lambda6(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity, "this$0");
        jieLiBleMusicManagerActivity.getViewModel().getMenusList().clear();
        java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean> menusList = jieLiBleMusicManagerActivity.getViewModel().getMenusList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "it");
        menusList.addAll(list);
        jieLiBleMusicManagerActivity.getViewModel().getMenusDialogList().clear();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            jieLiBleMusicManagerActivity.getViewModel().getMenusDialogList().add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(((com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean) it.next()).getMenuName(), false));
        }
        com.qcwireless.qcwatch.ui.device.music.adapter.MusicMenuListAdapter musicMenuListAdapter = jieLiBleMusicManagerActivity.musicMenuAdapter;
        if (musicMenuListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("musicMenuAdapter");
            musicMenuListAdapter = null;
        }
        musicMenuListAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-8, reason: not valid java name */
    public static final void m777setupViews$lambda8(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity, com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.PopWindowUI popWindowUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity, "this$0");
        android.view.View view = popWindowUI.getView();
        if (view != null) {
            jieLiBleMusicManagerActivity.showPopWindow(view, popWindowUI.getPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-9, reason: not valid java name */
    public static final void m778setupViews$lambda9(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity, com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.MusicUI musicUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity, "this$0");
        try {
            jieLiBleMusicManagerActivity.musicName = (java.lang.String) kotlin.text.StringsKt.split$default(musicUI.getMusicName(), new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null).get(0);
            android.content.Intent intent = new android.content.Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            intent.addCategory("android.intent.category.OPENABLE");
            jieLiBleMusicManagerActivity.startActivityForResult(intent, 0);
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-10, reason: not valid java name */
    public static final void m772setupViews$lambda10(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity, "this$0");
        jieLiBleMusicManagerActivity.showLoadingDialogTimeoutNotCancel(180000);
        jieLiBleMusicManagerActivity.sendMusic();
        jieLiBleMusicManagerActivity.totalIndex = jieLiBleMusicManagerActivity.getViewModel().getBlockingQueue().size();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "歌曲总数:" + jieLiBleMusicManagerActivity.getViewModel().getBlockingQueue().size());
        jieLiBleMusicManagerActivity.handler.postDelayed(jieLiBleMusicManagerActivity.timeoutRunnable, 10000L);
        jieLiBleMusicManagerActivity.syncToDevice = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getFileList() {
        com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.getInstance().start(0);
    }

    private final void sendMusic() {
        if (getViewModel().getBlockingQueue().size() > 0) {
            final com.qcwireless.qcwatch.ui.device.music.bean.MusicToDeviceBean musicToDeviceBean = getViewModel().getBlockingQueue().get(0);
            this.currMusicFile = new java.io.File(musicToDeviceBean.getFilePath());
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, musicToDeviceBean);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, musicToDeviceBean.getFilePath() + "----------");
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$sendMusic$1
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity) {
                    java.io.File file;
                    java.io.File file2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity, "$this$ktxRunOnBgSingle");
                    com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.getInstance().setCurrFileType(com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.FileTypeMuSic);
                    boolean executeFilePrepare = com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.getInstance().executeFilePrepare(com.qcwireless.qcwatch.ui.device.music.bean.MusicToDeviceBean.this.getFilePath());
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.String.valueOf(executeFilePrepare));
                    if (executeFilePrepare) {
                        file = jieLiBleMusicManagerActivity.currMusicFile;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(file);
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, file.getName());
                        file2 = jieLiBleMusicManagerActivity.currMusicFile;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(file2);
                        java.lang.String name = file2.getName();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "fileName");
                        java.lang.String substring = name.substring(0, name.length() - 4);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        if (substring.length() > 15) {
                            substring = name.substring(0, 15);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, substring + com.luck.picture.lib.config.PictureMimeType.MP3);
                        if (kotlin.text.StringsKt.endsWith$default(substring, com.luck.picture.lib.config.PictureMimeType.MP3, false, 2, (java.lang.Object) null)) {
                            com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.getInstance().cmdFileInit(substring);
                            return;
                        }
                        com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.getInstance().cmdFileInit(substring + com.luck.picture.lib.config.PictureMimeType.MP3);
                        return;
                    }
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(jieLiBleMusicManagerActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$sendMusic$1.1
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity2, "$this$ktxRunOnUi");
                            java.lang.String string = jieLiBleMusicManagerActivity2.getString(com.qcwireless.qcwatch.R.string.qc_text_594);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_594)");
                            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                        }
                    });
                }
            });
        }
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
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$onResume$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity) {
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity, "$this$ktxRunOnBgSingle");
                viewModel = jieLiBleMusicManagerActivity.getViewModel();
                if (viewModel.existsMusic() > 0) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(jieLiBleMusicManagerActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$onResume$1.1
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity2) {
                            com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity2, "$this$ktxRunOnUi");
                            activityMusicManagerBinding = jieLiBleMusicManagerActivity2.binding;
                            if (activityMusicManagerBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMusicManagerBinding = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMusicManagerBinding.noMusic);
                        }
                    });
                } else {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(jieLiBleMusicManagerActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$onResume$1.2
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity2) {
                            com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity2, "$this$ktxRunOnUi");
                            activityMusicManagerBinding = jieLiBleMusicManagerActivity2.binding;
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

    /* JADX WARN: Multi-variable type inference failed */
    private final void showPopWindow(android.view.View view, final int pos) {
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_534);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_534)");
        android.content.Context context = (android.content.Context) this;
        new com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder((android.app.Activity) this).setData(kotlin.collections.CollectionsKt.mutableListOf(new com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel[]{new com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel(string, 0, 2, null)})).setCancelable(true).setPopupOrientation(com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder.VERTICAL).setDividerColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.music_common_1)).setPopupBgColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.music_common_1)).setOnItemClickListener(new com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder.OnItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$showPopWindow$pop$1
            @Override // com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder.OnItemClickListener
            public void onItemClick(android.view.View view2, int position) {
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel;
                com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel viewModel2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "view");
                viewModel = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getViewModel();
                com.qcwireless.qcwatch.ui.device.music.bean.Song song = viewModel.getDeviceMusicList().get(pos);
                if (position != 0) {
                    return;
                }
                viewModel2 = com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.getViewModel();
                viewModel2.deleteSingMusicJieLiBle(song, pos);
            }
        }).create().showAtView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showMyMusicNameDialog(java.lang.String text) {
        com.qcwireless.qcwatch.base.dialog.MusicEditDialog musicEditDialog = new com.qcwireless.qcwatch.base.dialog.MusicEditDialog((android.content.Context) this, text);
        musicEditDialog.setOnTextConfirmListener(new com.qcwireless.qcwatch.base.dialog.MusicEditDialog.OnTextConfirmListener() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$$ExternalSyntheticLambda10
            @Override // com.qcwireless.qcwatch.base.dialog.MusicEditDialog.OnTextConfirmListener
            public final void OnConfirm(java.lang.String str) {
                com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.m780showMyMusicNameDialog$lambda11(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this, str);
            }
        });
        musicEditDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showMyMusicNameDialog$lambda-11, reason: not valid java name */
    public static final void m780showMyMusicNameDialog$lambda11(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "it");
        if (str.length() > 0) {
            jieLiBleMusicManagerActivity.getViewModel().addSongMenu(str);
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
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$$ExternalSyntheticLambda8
            @Override // com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener
            public final void onSelected(int i) {
                com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.m779showMenusListDialog$lambda12(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showMenusListDialog$lambda-12, reason: not valid java name */
    public static final void m779showMenusListDialog$lambda12(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity, "this$0");
        com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean menuSongBean = jieLiBleMusicManagerActivity.getViewModel().getMenusList().get(i);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, menuSongBean);
        jieLiBleMusicManagerActivity.getViewModel().addMusicToMenus(jieLiBleMusicManagerActivity.getViewModel().getAddList(), menuSongBean.getMenuName(), menuSongBean.getMenuId());
        jieLiBleMusicManagerActivity.getViewModel().queryAllMenus();
        com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding activityMusicManagerBinding = jieLiBleMusicManagerActivity.binding;
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
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$$ExternalSyntheticLambda9
            @Override // com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener
            public final void onSelected(int i) {
                com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.m781showSingleMusicToMenusListDialog$lambda13(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this, song, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showSingleMusicToMenusListDialog$lambda-13, reason: not valid java name */
    public static final void m781showSingleMusicToMenusListDialog$lambda13(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity, com.qcwireless.qcwatch.ui.device.music.bean.Song song, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(song, "$song");
        com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean menuSongBean = jieLiBleMusicManagerActivity.getViewModel().getMenusList().get(i);
        jieLiBleMusicManagerActivity.getViewModel().addSingleMusicToMenus(song, menuSongBean.getMenuName(), menuSongBean.getMenuId());
        jieLiBleMusicManagerActivity.getViewModel().queryAllMenus();
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

    protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1) {
            final android.net.Uri data2 = data != null ? data.getData() : null;
            try {
                if (data2 != null) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$onActivityResult$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity) {
                            java.lang.String str;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity, "$this$ktxRunOnBgSingle");
                            java.lang.String fileAbsolutePath = com.qcwireless.qcwatch.base.utils.GetFilePathFromUri.getFileAbsolutePath((android.content.Context) jieLiBleMusicManagerActivity, data2);
                            java.io.File file = new java.io.File(fileAbsolutePath);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileAbsolutePath, "path");
                            if (kotlin.text.StringsKt.endsWith$default(fileAbsolutePath, ".lrc", false, 2, (java.lang.Object) null) && file.exists()) {
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, fileAbsolutePath + "----" + file.getName() + "---" + data2);
                                str = jieLiBleMusicManagerActivity.musicName;
                                if (!kotlin.text.StringsKt.contains$default(fileAbsolutePath, str, false, 2, (java.lang.Object) null)) {
                                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(jieLiBleMusicManagerActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$onActivityResult$1.1
                                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                            invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity) obj);
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity2) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity2, "$this$ktxRunOnUi");
                                            java.lang.String string = jieLiBleMusicManagerActivity2.getString(com.qcwireless.qcwatch.R.string.qc_text_591);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_591)");
                                            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                                        }
                                    });
                                    return;
                                }
                                com.oudmon.ble.base.communication.file.EbookHandle.getInstance().setCurrFileType(6);
                                boolean executeFilePrepare = com.oudmon.ble.base.communication.file.EbookHandle.getInstance().executeFilePrepare(fileAbsolutePath);
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, fileAbsolutePath + "-----" + fileAbsolutePath + executeFilePrepare);
                                if (executeFilePrepare) {
                                    com.oudmon.ble.base.communication.file.EbookHandle.getInstance().cmdFileInit(file.getName());
                                    return;
                                } else {
                                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件不存在");
                                    return;
                                }
                            }
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件不存在");
                        }
                    });
                } else {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity$onActivityResult$2
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity jieLiBleMusicManagerActivity) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jieLiBleMusicManagerActivity, "$this$ktxRunOnUi");
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "格式不支持");
                        }
                    });
                }
            } catch (java.lang.Exception unused) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件不存在");
            }
        }
    }

    /* compiled from: JieLiBleMusicManagerActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/JieLiBleMusicManagerActivity$TimeoutRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/device/music/JieLiBleMusicManagerActivity;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class TimeoutRunnable implements java.lang.Runnable {
        public TimeoutRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qcwireless.qcwatch.ui.device.music.JieLiBleMusicManagerActivity.this.dismissLoadingDialog();
        }
    }

    public void onAttachedToWindow() {
        getWindow().addFlags((int) this.FLAG_HOMEKEY_DISPATCHED);
        super.onAttachedToWindow();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().removeSppCallback();
        getWindow().clearFlags((int) this.FLAG_HOMEKEY_DISPATCHED);
        android.os.PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }
}
