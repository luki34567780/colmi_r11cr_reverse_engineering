package com.qcwireless.qcwatch.ui.device.album;

/* compiled from: AlbumToDeviceActivity.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0014H\u0014J\b\u0010\u001d\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/album/AlbumToDeviceActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityAlbumToDeviceBinding;", "callback", "Lcom/qcwireless/qcwatch/ui/base/imagepicker/ImagePicker$Callback;", "getCallback", "()Lcom/qcwireless/qcwatch/ui/base/imagepicker/ImagePicker$Callback;", "setCallback", "(Lcom/qcwireless/qcwatch/ui/base/imagepicker/ImagePicker$Callback;)V", "height", "", "imageName", "", "imagePath", "imagePicker", "Lcom/qcwireless/qcwatch/ui/base/imagepicker/ImagePicker;", "width", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "toAlbum", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class AlbumToDeviceActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityAlbumToDeviceBinding binding;
    private final com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker imagePicker = new com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker();
    private int width = 360;
    private int height = 360;
    private java.lang.String imagePath = "";
    private java.lang.String imageName = "";
    private com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback callback = new com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity$callback$1
        @Override // com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback
        public void cropConfig(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        }

        @Override // com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback
        public void onPickImage(android.net.Uri imageUri) {
            if (imageUri != null) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.String.valueOf(imageUri.getPath()));
                com.bumptech.glide.RequestBuilder load = com.bumptech.glide.Glide.with(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).asBitmap().load(imageUri);
                final com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity albumToDeviceActivity = com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity.this;
                load.into(new com.bumptech.glide.request.target.CustomTarget<android.graphics.Bitmap>() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity$callback$1$onPickImage$1
                    @Override // com.bumptech.glide.request.target.Target
                    public void onLoadCleared(android.graphics.drawable.Drawable placeholder) {
                    }

                    @Override // com.bumptech.glide.request.target.Target
                    public /* bridge */ /* synthetic */ void onResourceReady(java.lang.Object obj, com.bumptech.glide.request.transition.Transition transition) {
                        onResourceReady((android.graphics.Bitmap) obj, (com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap>) transition);
                    }

                    public void onResourceReady(android.graphics.Bitmap bitmap, com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap> transition) {
                        int i;
                        int i2;
                        com.qcwireless.qcwatch.databinding.ActivityAlbumToDeviceBinding activityAlbumToDeviceBinding;
                        java.lang.String str;
                        java.lang.String str2;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                        com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity.this.imageName = new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp() + com.luck.picture.lib.config.PictureMimeType.JPG;
                        i = com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity.this.width;
                        i2 = com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity.this.height;
                        android.graphics.Bitmap scaleBitmap = com.qcwireless.qcwatch.ui.plate.util.ImageUtils.scaleBitmap(bitmap, i, i2);
                        scaleBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 50, new java.io.ByteArrayOutputStream());
                        activityAlbumToDeviceBinding = com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity.this.binding;
                        if (activityAlbumToDeviceBinding == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityAlbumToDeviceBinding = null;
                        }
                        activityAlbumToDeviceBinding.imageTest.setImageBitmap(scaleBitmap);
                        com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity albumToDeviceActivity2 = com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity.this;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getGuideDirFile().getPath());
                        sb.append('/');
                        str = com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity.this.imageName;
                        sb.append(str);
                        albumToDeviceActivity2.imagePath = sb.toString();
                        str2 = com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity.this.imagePath;
                        com.qcwireless.qcwatch.ui.plate.util.ImageUtils.saveImage(str2, scaleBitmap);
                    }
                });
            }
        }

        @Override // com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback
        public void onCropImage(android.net.Uri imageUri) {
            if (imageUri != null) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.String.valueOf(imageUri.getPath()));
            }
        }

        @Override // com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback
        public void onPermissionDenied(int requestCode, java.lang.String[] permissions, int[] grantResults) {
            super.onPermissionDenied(requestCode, permissions, grantResults);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, permissions);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, grantResults);
        }
    };

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityAlbumToDeviceBinding inflate = com.qcwireless.qcwatch.databinding.ActivityAlbumToDeviceBinding.inflate(getLayoutInflater());
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
        this.imagePicker.setCropImage(false);
        com.oudmon.ble.base.communication.file.EbookHandle.getInstance().initRegister();
        com.oudmon.ble.base.communication.file.EbookHandle.getInstance().clearCallback();
        com.qcwireless.qcwatch.databinding.ActivityAlbumToDeviceBinding activityAlbumToDeviceBinding = this.binding;
        if (activityAlbumToDeviceBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityAlbumToDeviceBinding = null;
        }
        activityAlbumToDeviceBinding.tvSelect.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity.m649setupViews$lambda0(com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity.this, view);
            }
        });
        com.oudmon.ble.base.communication.file.EbookHandle.getInstance().registerCallback(new com.oudmon.ble.base.communication.file.IEbookCallback() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity$setupViews$2
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
                final com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity albumToDeviceActivity = com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity$setupViews$2, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity$setupViews$2$onProgress$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity$setupViews$2) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity$setupViews$2 albumToDeviceActivity$setupViews$2) {
                        com.qcwireless.qcwatch.databinding.ActivityAlbumToDeviceBinding activityAlbumToDeviceBinding2;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(albumToDeviceActivity$setupViews$2, "$this$ktxRunOnUi");
                        activityAlbumToDeviceBinding2 = com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity.this.binding;
                        if (activityAlbumToDeviceBinding2 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityAlbumToDeviceBinding2 = null;
                        }
                        android.widget.TextView textView = activityAlbumToDeviceBinding2.tvProgress;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(percent);
                        sb.append('%');
                        textView.setText(sb.toString());
                    }
                });
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onComplete() {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "写成功");
                com.oudmon.ble.base.communication.file.EbookHandle.getInstance().start(0);
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onActionResult(int errCode) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(errCode));
            }
        });
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.SetTimeReq(1), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity$$ExternalSyntheticLambda1
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity.m650setupViews$lambda1(com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity.this, (com.oudmon.ble.base.communication.rsp.SetTimeRsp) baseRspCmd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-0, reason: not valid java name */
    public static final void m649setupViews$lambda0(com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity albumToDeviceActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(albumToDeviceActivity, "this$0");
        albumToDeviceActivity.toAlbum();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m650setupViews$lambda1(com.qcwireless.qcwatch.ui.device.album.AlbumToDeviceActivity albumToDeviceActivity, com.oudmon.ble.base.communication.rsp.SetTimeRsp setTimeRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(albumToDeviceActivity, "this$0");
        albumToDeviceActivity.width = setTimeRsp.width;
        albumToDeviceActivity.height = setTimeRsp.height;
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, setTimeRsp.width + "----" + setTimeRsp.height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void toAlbum() {
        this.imagePicker.startGallery((android.app.Activity) this, this.callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        this.imagePicker.onActivityResult((android.app.Activity) this, requestCode, resultCode, data);
    }

    public final com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback getCallback() {
        return this.callback;
    }

    public final void setCallback(com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "<set-?>");
        this.callback = callback;
    }
}
