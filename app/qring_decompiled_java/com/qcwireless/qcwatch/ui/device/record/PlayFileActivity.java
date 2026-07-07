package com.qcwireless.qcwatch.ui.device.record;

/* compiled from: PlayFileActivity.kt */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bJ\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\bH\u0002J\u0012\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u0016H\u0014J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0017J\b\u0010%\u001a\u00020\u0016H\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/record/PlayFileActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "PERMISSION_REQUEST_CODE", "", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityPlayFileBinding;", "fileName", "", "fileSize", "handler", "Landroid/os/Handler;", "mPlayer", "Lcom/qcwireless/qcwatch/ui/device/record/ADAudioTrackPlayer;", "mediaUtil", "Lcom/qcwireless/qcwatch/ui/base/util/MediaUtil;", "playFlag", "", "seconds", "timeoutRunnable", "Ljava/lang/Runnable;", "doTime", "", "getUriFromFilePath", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "filePath", "hasStoragePermission", "path", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class PlayFileActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding binding;
    private int fileSize;
    private final android.os.Handler handler;
    private com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer mPlayer;
    private com.qcwireless.qcwatch.ui.base.util.MediaUtil mediaUtil;
    private boolean playFlag;
    private int seconds;
    private final java.lang.Runnable timeoutRunnable;
    private java.lang.String fileName = "";
    private final int PERMISSION_REQUEST_CODE = 123;

    public PlayFileActivity() {
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.device.record.PlayFileActivity$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
        this.timeoutRunnable = new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.device.record.PlayFileActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.ui.device.record.PlayFileActivity.m857timeoutRunnable$lambda4(com.qcwireless.qcwatch.ui.device.record.PlayFileActivity.this);
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding inflate = com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding.inflate(getLayoutInflater());
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
        this.mediaUtil = new com.qcwireless.qcwatch.ui.base.util.MediaUtil(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication());
        com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding activityPlayFileBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding activityPlayFileBinding2 = null;
        if (activityPlayFileBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityPlayFileBinding = null;
        }
        activityPlayFileBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_562));
        this.fileName = java.lang.String.valueOf(getIntent().getStringExtra("fileName"));
        this.fileSize = getIntent().getIntExtra("size", 0);
        com.oudmon.ble.base.communication.file.RecordHandle.getInstance().initRegister();
        com.oudmon.ble.base.communication.file.RecordHandle.getInstance().clearCallback();
        com.oudmon.ble.base.communication.file.RecordHandle.getInstance().registerCallback(new com.oudmon.ble.base.communication.file.IRecordCallback() { // from class: com.qcwireless.qcwatch.ui.device.record.PlayFileActivity$setupViews$1
            @Override // com.oudmon.ble.base.communication.file.IRecordCallback
            public void onActionResult(int errCode) {
            }

            @Override // com.oudmon.ble.base.communication.file.IRecordCallback
            public void onFileNames(java.util.ArrayList<com.oudmon.ble.base.communication.entity.RecordEntity> fileNames) {
                com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(4);
            }

            @Override // com.oudmon.ble.base.communication.file.IRecordCallback
            public void onProgress(final float percent) {
                final com.qcwireless.qcwatch.ui.device.record.PlayFileActivity playFileActivity = com.qcwireless.qcwatch.ui.device.record.PlayFileActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.record.PlayFileActivity$setupViews$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.record.PlayFileActivity$setupViews$1$onProgress$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.record.PlayFileActivity$setupViews$1) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.record.PlayFileActivity$setupViews$1 playFileActivity$setupViews$1) {
                        com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding activityPlayFileBinding3;
                        com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding activityPlayFileBinding4;
                        com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding activityPlayFileBinding5;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(playFileActivity$setupViews$1, "$this$ktxRunOnUi");
                        activityPlayFileBinding3 = com.qcwireless.qcwatch.ui.device.record.PlayFileActivity.this.binding;
                        com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding activityPlayFileBinding6 = null;
                        if (activityPlayFileBinding3 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityPlayFileBinding3 = null;
                        }
                        android.widget.TextView textView = activityPlayFileBinding3.tvFileSync;
                        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                        java.lang.String string = com.qcwireless.qcwatch.ui.device.record.PlayFileActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_565);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_565)");
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(percent);
                        sb.append('%');
                        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{sb.toString()}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                        textView.setText(format);
                        if (percent < 100.0f) {
                            if (!com.qcwireless.qcwatch.ui.device.record.PlayFileActivity.this.isDialogShowing()) {
                                com.qcwireless.qcwatch.ui.device.record.PlayFileActivity.this.showLoadingDialogTimeoutNotCancel(80000);
                            }
                            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(4);
                            activityPlayFileBinding5 = com.qcwireless.qcwatch.ui.device.record.PlayFileActivity.this.binding;
                            if (activityPlayFileBinding5 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityPlayFileBinding6 = activityPlayFileBinding5;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityPlayFileBinding6.tvFileSync);
                            return;
                        }
                        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(4);
                        com.qcwireless.qcwatch.ui.device.record.PlayFileActivity.this.dismissLoadingDialog();
                        activityPlayFileBinding4 = com.qcwireless.qcwatch.ui.device.record.PlayFileActivity.this.binding;
                        if (activityPlayFileBinding4 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityPlayFileBinding6 = activityPlayFileBinding4;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityPlayFileBinding6.tvFileSync);
                    }
                });
            }

            @Override // com.oudmon.ble.base.communication.file.IRecordCallback
            public void onComplete() {
                final com.qcwireless.qcwatch.ui.device.record.PlayFileActivity playFileActivity = com.qcwireless.qcwatch.ui.device.record.PlayFileActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.record.PlayFileActivity$setupViews$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.record.PlayFileActivity$setupViews$1$onComplete$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.record.PlayFileActivity$setupViews$1) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.record.PlayFileActivity$setupViews$1 playFileActivity$setupViews$1) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(playFileActivity$setupViews$1, "$this$ktxRunOnUi");
                        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
                        com.qcwireless.qcwatch.ui.device.record.PlayFileActivity.this.dismissLoadingDialog();
                    }
                });
            }

            @Override // com.oudmon.ble.base.communication.file.IRecordCallback
            public void onReceiver(byte[] data) {
                java.lang.String str;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                com.qcwireless.qcwatch.base.utils.FileUtils fileUtils = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE;
                java.lang.String absolutePath = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getRecordDirFile().getAbsolutePath();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "FileUtils.getRecordDirFile().absolutePath");
                str = com.qcwireless.qcwatch.ui.device.record.PlayFileActivity.this.fileName;
                fileUtils.writeToFile1(data, absolutePath, str);
            }
        });
        long fileLength = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getFileLength(com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getRecordDirFile().getAbsolutePath() + '/' + this.fileName);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, fileLength + "-----" + this.fileSize + "---" + this.fileName);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getRecordDirFile().getAbsolutePath());
        sb.append('/');
        sb.append(this.fileName);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, sb.toString());
        boolean z = true;
        if (!com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getRtkMcuSupport() ? 2 * fileLength == this.fileSize : fileLength == this.fileSize) {
            z = false;
        }
        if (z || fileLength == 0) {
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.record.PlayFileActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.record.PlayFileActivity$setupViews$2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.device.record.PlayFileActivity) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.device.record.PlayFileActivity playFileActivity) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(playFileActivity, "$this$ktxRunOnUi");
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "-------");
                    playFileActivity.showLoadingDialogTimeoutNotCancel(80000);
                }
            });
            com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.deleteFile(com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getRecordDirFile().getAbsolutePath() + '/' + this.fileName);
            com.oudmon.ble.base.communication.file.RecordHandle.getInstance().readRecordFile(0, this.fileName);
        }
        this.seconds = this.fileSize / 32000;
        com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding activityPlayFileBinding3 = this.binding;
        if (activityPlayFileBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityPlayFileBinding3 = null;
        }
        try {
            activityPlayFileBinding3.tvFileName.setText((java.lang.CharSequence) kotlin.text.StringsKt.split$default(this.fileName, new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null).get(0));
            activityPlayFileBinding3.tvFileTime.setText(com.qcwireless.qc_utils.date.DateUtil.secondToStr(this.seconds));
        } catch (java.lang.Exception unused) {
        }
        com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding activityPlayFileBinding4 = this.binding;
        if (activityPlayFileBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityPlayFileBinding4 = null;
        }
        activityPlayFileBinding4.imageStart.setImageDrawable(skin.support.content.res.SkinCompatResources.getDrawable((android.content.Context) this, com.qcwireless.qcwatch.R.mipmap.audio_start));
        com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding activityPlayFileBinding5 = this.binding;
        if (activityPlayFileBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityPlayFileBinding2 = activityPlayFileBinding5;
        }
        activityPlayFileBinding2.imageStart.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.record.PlayFileActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.record.PlayFileActivity.m856setupViews$lambda1(com.qcwireless.qcwatch.ui.device.record.PlayFileActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m856setupViews$lambda1(com.qcwireless.qcwatch.ui.device.record.PlayFileActivity playFileActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(playFileActivity, "this$0");
        playFileActivity.handler.removeCallbacks(playFileActivity.timeoutRunnable);
        java.lang.String str = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getRecordDirFile().getAbsolutePath() + '/' + playFileActivity.fileName;
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, str);
        if (com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.fileExists(com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getRecordDirFile().getAbsolutePath() + '/' + playFileActivity.fileName)) {
            playFileActivity.seconds = playFileActivity.fileSize / 32000;
            boolean z = false;
            com.qcwireless.qcwatch.ui.base.util.MediaUtil mediaUtil = null;
            com.qcwireless.qcwatch.ui.base.util.MediaUtil mediaUtil2 = null;
            com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer aDAudioTrackPlayer = null;
            if (playFileActivity.playFlag) {
                com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding activityPlayFileBinding = playFileActivity.binding;
                if (activityPlayFileBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityPlayFileBinding = null;
                }
                activityPlayFileBinding.imageStart.setImageDrawable(skin.support.content.res.SkinCompatResources.getDrawable((android.content.Context) playFileActivity, com.qcwireless.qcwatch.R.mipmap.audio_start));
                if (kotlin.text.StringsKt.endsWith$default(str, com.luck.picture.lib.config.PictureMimeType.MP3, false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.ui.base.util.MediaUtil mediaUtil3 = playFileActivity.mediaUtil;
                    if (mediaUtil3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mediaUtil");
                    } else {
                        mediaUtil2 = mediaUtil3;
                    }
                    mediaUtil2.stopRing();
                } else {
                    com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer aDAudioTrackPlayer2 = playFileActivity.mPlayer;
                    if (aDAudioTrackPlayer2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mPlayer");
                    } else {
                        aDAudioTrackPlayer = aDAudioTrackPlayer2;
                    }
                    aDAudioTrackPlayer.stop();
                }
            } else {
                com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding activityPlayFileBinding2 = playFileActivity.binding;
                if (activityPlayFileBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityPlayFileBinding2 = null;
                }
                activityPlayFileBinding2.tvFileTime.setText(com.qcwireless.qc_utils.date.DateUtil.secondToStr(playFileActivity.seconds));
                com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding activityPlayFileBinding3 = playFileActivity.binding;
                if (activityPlayFileBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityPlayFileBinding3 = null;
                }
                android.content.Context context = (android.content.Context) playFileActivity;
                activityPlayFileBinding3.imageStart.setImageDrawable(skin.support.content.res.SkinCompatResources.getDrawable(context, com.qcwireless.qcwatch.R.mipmap.audio_stop));
                playFileActivity.handler.postDelayed(playFileActivity.timeoutRunnable, 1000L);
                if (kotlin.text.StringsKt.endsWith$default(str, com.luck.picture.lib.config.PictureMimeType.MP3, false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.ui.base.util.MediaUtil mediaUtil4 = playFileActivity.mediaUtil;
                    if (mediaUtil4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mediaUtil");
                    } else {
                        mediaUtil = mediaUtil4;
                    }
                    mediaUtil.setMediaSourceMp3(context, str);
                } else {
                    com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer aDAudioTrackPlayer3 = new com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer(context, com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getRecordDirFile().getAbsolutePath() + '/' + playFileActivity.fileName, 16000, 2, 4, false);
                    playFileActivity.mPlayer = aDAudioTrackPlayer3;
                    aDAudioTrackPlayer3.play();
                }
                z = true;
            }
            playFileActivity.playFlag = z;
        }
    }

    public final android.net.Uri getUriFromFilePath(android.content.Context context, java.lang.String filePath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "filePath");
        android.net.Uri uri = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        android.database.Cursor query = context.getContentResolver().query(uri, new java.lang.String[]{"_id"}, "_data=?", new java.lang.String[]{filePath}, null);
        if (query != null) {
            android.database.Cursor cursor = query;
            try {
                android.database.Cursor cursor2 = cursor;
                if (cursor2.moveToFirst()) {
                    android.net.Uri withAppendedPath = android.net.Uri.withAppendedPath(uri, java.lang.String.valueOf(cursor2.getLong(cursor2.getColumnIndexOrThrow("_id"))));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(withAppendedPath, "withAppendedPath(uri, mediaId.toString())");
                    kotlin.io.CloseableKt.closeFinally(cursor, (java.lang.Throwable) null);
                    return withAppendedPath;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(cursor, (java.lang.Throwable) null);
            } finally {
            }
        }
        android.net.Uri parse = android.net.Uri.parse(filePath);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(filePath)");
        return parse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean hasStoragePermission(java.lang.String path) {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return androidx.core.content.ContextCompat.checkSelfPermission((android.content.Context) this, "android.permission.READ_EXTERNAL_STORAGE") == 0;
        }
        android.database.Cursor query = getContentResolver().query(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new java.lang.String[]{"_id"}, "_data=?", new java.lang.String[]{path}, null);
        if (query != null) {
            android.database.Cursor cursor = query;
            try {
                while (cursor.moveToNext()) {
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(cursor, (java.lang.Throwable) null);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    kotlin.io.CloseableKt.closeFinally(cursor, th);
                    throw th2;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: timeoutRunnable$lambda-4, reason: not valid java name */
    public static final void m857timeoutRunnable$lambda4(com.qcwireless.qcwatch.ui.device.record.PlayFileActivity playFileActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(playFileActivity, "this$0");
        int i = playFileActivity.seconds;
        com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding activityPlayFileBinding = null;
        if (i > 0) {
            playFileActivity.seconds = i - 1;
            com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding activityPlayFileBinding2 = playFileActivity.binding;
            if (activityPlayFileBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityPlayFileBinding = activityPlayFileBinding2;
            }
            activityPlayFileBinding.tvFileTime.setText(com.qcwireless.qc_utils.date.DateUtil.secondToStr(playFileActivity.seconds));
            playFileActivity.doTime();
            return;
        }
        playFileActivity.playFlag = false;
        com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding activityPlayFileBinding3 = playFileActivity.binding;
        if (activityPlayFileBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityPlayFileBinding3 = null;
        }
        activityPlayFileBinding3.imageStart.setImageDrawable(skin.support.content.res.SkinCompatResources.getDrawable((android.content.Context) playFileActivity, com.qcwireless.qcwatch.R.mipmap.audio_start));
        com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding activityPlayFileBinding4 = playFileActivity.binding;
        if (activityPlayFileBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityPlayFileBinding = activityPlayFileBinding4;
        }
        activityPlayFileBinding.tvFileTime.setText(com.qcwireless.qc_utils.date.DateUtil.secondToStr(playFileActivity.fileSize / 32000));
    }

    public final void doTime() {
        this.handler.postDelayed(this.timeoutRunnable, 1000L);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if (!(messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) || ((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect()) {
            return;
        }
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
        finish();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        try {
            com.qcwireless.qcwatch.ui.base.util.MediaUtil mediaUtil = this.mediaUtil;
            com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer aDAudioTrackPlayer = null;
            if (mediaUtil == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mediaUtil");
                mediaUtil = null;
            }
            mediaUtil.stopRing();
            com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer aDAudioTrackPlayer2 = this.mPlayer;
            if (aDAudioTrackPlayer2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mPlayer");
            } else {
                aDAudioTrackPlayer = aDAudioTrackPlayer2;
            }
            aDAudioTrackPlayer.stop();
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
        } catch (java.lang.Exception unused) {
        }
    }
}
