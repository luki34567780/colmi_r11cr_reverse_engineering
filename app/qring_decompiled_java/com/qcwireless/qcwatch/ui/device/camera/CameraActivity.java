package com.qcwireless.qcwatch.ui.device.camera;

/* compiled from: CameraActivity.kt */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0015H\u0014J\b\u0010\u001b\u001a\u00020\u0015H\u0014J-\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0 2\u0006\u0010!\u001a\u00020\"H\u0016¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u0015H\u0014J\b\u0010%\u001a\u00020\u0015H\u0014J\b\u0010&\u001a\u00020\u0015H\u0014J\b\u0010'\u001a\u00020\u0015H\u0014J\b\u0010(\u001a\u00020\u0015H\u0002J\b\u0010)\u001a\u00020\u0015H\u0002J\u001a\u0010*\u001a\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150+H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/camera/CameraActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "activeCamera", "Lcom/qcwireless/qcwatch/ui/device/camera/Camera;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityCameraBinding;", "fotoapparat", "Lio/fotoapparat/Fotoapparat;", "imageFilePath", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/qcwireless/qcwatch/ui/device/camera/CameraActivity$MyCameraListener;", "permissionsDelegate", "Lcom/qcwireless/qcwatch/ui/device/camera/PermissionsDelegate;", "permissionsGranted", "", "showToast", "timer", "Ljava/util/Timer;", "adjustViewsVisibility", "", "changeCamera", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onStart", "onStop", "setupViews", "synCameraState", "takePicture", "toggleFlash", "Lkotlin/Function2;", "Landroid/widget/CompoundButton;", "MyCameraListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class CameraActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityCameraBinding binding;
    private io.fotoapparat.Fotoapparat fotoapparat;
    private java.lang.String imageFilePath;
    private com.qcwireless.qcwatch.ui.device.camera.CameraActivity.MyCameraListener listener;
    private boolean permissionsGranted;
    private java.util.Timer timer;
    private final com.qcwireless.qcwatch.ui.device.camera.PermissionsDelegate permissionsDelegate = new com.qcwireless.qcwatch.ui.device.camera.PermissionsDelegate((android.app.Activity) this);
    private com.qcwireless.qcwatch.ui.device.camera.Camera activeCamera = com.qcwireless.qcwatch.ui.device.camera.Camera.Back.INSTANCE;
    private boolean showToast = true;

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityCameraBinding inflate = com.qcwireless.qcwatch.databinding.ActivityCameraBinding.inflate(getLayoutInflater());
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
        boolean hasCameraPermission = this.permissionsDelegate.hasCameraPermission();
        this.permissionsGranted = hasCameraPermission;
        com.qcwireless.qcwatch.ui.device.camera.CameraActivity.MyCameraListener myCameraListener = null;
        if (hasCameraPermission) {
            com.qcwireless.qcwatch.databinding.ActivityCameraBinding activityCameraBinding = this.binding;
            if (activityCameraBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityCameraBinding = null;
            }
            activityCameraBinding.cameraView.setVisibility(0);
        } else {
            this.permissionsDelegate.requestCameraPermission();
        }
        com.qcwireless.qcwatch.databinding.ActivityCameraBinding activityCameraBinding2 = this.binding;
        if (activityCameraBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityCameraBinding2 = null;
        }
        io.fotoapparat.view.CameraRenderer cameraRenderer = activityCameraBinding2.cameraView;
        com.qcwireless.qcwatch.databinding.ActivityCameraBinding activityCameraBinding3 = this.binding;
        if (activityCameraBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityCameraBinding3 = null;
        }
        io.fotoapparat.view.FocalPointSelector focalPointSelector = activityCameraBinding3.focusView;
        io.fotoapparat.log.Logger logcat = io.fotoapparat.log.LoggersKt.logcat();
        kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.characteristic.LensPosition>, io.fotoapparat.characteristic.LensPosition> lensPosition = this.activeCamera.getLensPosition();
        io.fotoapparat.configuration.CameraConfiguration configuration = this.activeCamera.getConfiguration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraRenderer, "cameraView");
        this.fotoapparat = new io.fotoapparat.Fotoapparat((android.content.Context) this, cameraRenderer, focalPointSelector, lensPosition, (io.fotoapparat.parameter.ScaleType) null, configuration, new kotlin.jvm.functions.Function1<io.fotoapparat.exception.camera.CameraException, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.camera.CameraActivity$setupViews$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((io.fotoapparat.exception.camera.CameraException) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(io.fotoapparat.exception.camera.CameraException cameraException) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraException, "it");
                android.util.Log.e("Fotoapparat Example", "Camera error: ", (java.lang.Throwable) cameraException);
            }
        }, (io.fotoapparat.concurrent.CameraExecutor) null, logcat, 144, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        android.view.View[] viewArr = new android.view.View[3];
        com.qcwireless.qcwatch.databinding.ActivityCameraBinding activityCameraBinding4 = this.binding;
        if (activityCameraBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityCameraBinding4 = null;
        }
        viewArr[0] = activityCameraBinding4.imageTakePicture;
        com.qcwireless.qcwatch.databinding.ActivityCameraBinding activityCameraBinding5 = this.binding;
        if (activityCameraBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityCameraBinding5 = null;
        }
        viewArr[1] = activityCameraBinding5.imageSwitch;
        com.qcwireless.qcwatch.databinding.ActivityCameraBinding activityCameraBinding6 = this.binding;
        if (activityCameraBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityCameraBinding6 = null;
        }
        viewArr[2] = activityCameraBinding6.imagePre;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.camera.CameraActivity$setupViews$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                java.lang.String str;
                java.lang.String str2;
                java.lang.String str3;
                java.lang.String str4;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                com.qcwireless.qcwatch.databinding.ActivityCameraBinding activityCameraBinding7 = com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this.binding;
                java.lang.String str5 = null;
                if (activityCameraBinding7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityCameraBinding7 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityCameraBinding7.imageTakePicture)) {
                    com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this.takePicture();
                    return;
                }
                com.qcwireless.qcwatch.databinding.ActivityCameraBinding activityCameraBinding8 = com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this.binding;
                if (activityCameraBinding8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityCameraBinding8 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityCameraBinding8.imageSwitch)) {
                    com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this.changeCamera();
                    return;
                }
                com.qcwireless.qcwatch.databinding.ActivityCameraBinding activityCameraBinding9 = com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this.binding;
                if (activityCameraBinding9 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityCameraBinding9 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityCameraBinding9.imagePre)) {
                    str = com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this.imageFilePath;
                    if (str != null) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        str2 = com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this.imageFilePath;
                        if (str2 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("imageFilePath");
                            str2 = null;
                        }
                        bundle.putString("path", str2);
                        str3 = com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this.imageFilePath;
                        if (str3 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("imageFilePath");
                            str3 = null;
                        }
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, str3);
                        com.qcwireless.qcwatch.base.utils.FileUtils fileUtils = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE;
                        str4 = com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this.imageFilePath;
                        if (str4 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("imageFilePath");
                        } else {
                            str5 = str4;
                        }
                        if (fileUtils.fileExists(str5)) {
                            android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this;
                            java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.camera.ImageRoomInActivity.class);
                            intent.setFlags(1);
                            intent.putExtras(bundle);
                            for (kotlin.Pair pair : arrayList) {
                                if (pair != null) {
                                    java.lang.String str6 = (java.lang.String) pair.getFirst();
                                    java.lang.Object second = pair.getSecond();
                                    if (second instanceof java.lang.Integer) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.Byte) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.Character) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.Short) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.Boolean) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.Long) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.Float) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.Double) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.String) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, (java.lang.String) second), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.CharSequence) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, (java.lang.CharSequence) second), "putExtra(name, value)");
                                    } else if (second instanceof android.os.Parcelable) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, (android.os.Parcelable) second), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.Object[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, (java.io.Serializable) second), "putExtra(name, value)");
                                    } else if (second instanceof java.util.ArrayList) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, (java.io.Serializable) second), "putExtra(name, value)");
                                    } else if (second instanceof java.io.Serializable) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, (java.io.Serializable) second), "putExtra(name, value)");
                                    } else if (second instanceof boolean[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, (boolean[]) second), "putExtra(name, value)");
                                    } else if (second instanceof byte[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, (byte[]) second), "putExtra(name, value)");
                                    } else if (second instanceof short[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, (short[]) second), "putExtra(name, value)");
                                    } else if (second instanceof char[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, (char[]) second), "putExtra(name, value)");
                                    } else if (second instanceof int[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, (int[]) second), "putExtra(name, value)");
                                    } else if (second instanceof long[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, (long[]) second), "putExtra(name, value)");
                                    } else if (second instanceof float[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, (float[]) second), "putExtra(name, value)");
                                    } else if (second instanceof double[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, (double[]) second), "putExtra(name, value)");
                                    } else if (second instanceof android.os.Bundle) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, (android.os.Bundle) second), "putExtra(name, value)");
                                    } else if (second instanceof android.content.Intent) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str6, (android.os.Parcelable) second), "putExtra(name, value)");
                                    } else {
                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    }
                                }
                            }
                            activity.startActivity(intent);
                        }
                    }
                }
            }
        });
        this.listener = new com.qcwireless.qcwatch.ui.device.camera.CameraActivity.MyCameraListener();
        com.oudmon.ble.base.bluetooth.BleOperateManager bleOperateManager = com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance();
        com.qcwireless.qcwatch.ui.device.camera.CameraActivity.MyCameraListener myCameraListener2 = this.listener;
        if (myCameraListener2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        } else {
            myCameraListener = myCameraListener2;
        }
        bleOperateManager.addOutCameraListener(myCameraListener);
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(new com.oudmon.ble.base.communication.req.CameraReq((byte) 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void takePicture() {
        java.io.File externalFilesDir = getExternalFilesDir(android.os.Environment.DIRECTORY_DCIM);
        java.lang.String str = java.lang.System.currentTimeMillis() + com.luck.picture.lib.config.PictureMimeType.JPG;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNull(externalFilesDir);
        sb.append(externalFilesDir.getPath());
        sb.append('/');
        sb.append(str);
        this.imageFilePath = sb.toString();
        io.fotoapparat.Fotoapparat fotoapparat = this.fotoapparat;
        java.lang.String str2 = null;
        if (fotoapparat == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("fotoapparat");
            fotoapparat = null;
        }
        io.fotoapparat.result.PhotoResult takePicture = fotoapparat.autoFocus().takePicture();
        java.lang.String str3 = this.imageFilePath;
        if (str3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("imageFilePath");
        } else {
            str2 = str3;
        }
        takePicture.saveToFile(new java.io.File(str2));
        takePicture.toBitmap(io.fotoapparat.result.transformer.ResolutionTransformersKt.scaled(0.25f)).whenAvailable(new kotlin.jvm.functions.Function1<io.fotoapparat.result.BitmapPhoto, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.camera.CameraActivity$takePicture$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((io.fotoapparat.result.BitmapPhoto) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(final io.fotoapparat.result.BitmapPhoto bitmapPhoto) {
                com.qcwireless.qcwatch.ui.device.camera.Camera camera;
                if (bitmapPhoto != null) {
                    com.qcwireless.qcwatch.ui.device.camera.CameraActivity cameraActivity = com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this;
                    try {
                        com.qcwireless.qcwatch.databinding.ActivityCameraBinding activityCameraBinding = cameraActivity.binding;
                        if (activityCameraBinding == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityCameraBinding = null;
                        }
                        android.widget.ImageView imageView = activityCameraBinding.imagePre;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "binding.imagePre");
                        float f = -bitmapPhoto.rotationDegrees;
                        camera = cameraActivity.activeCamera;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(camera, com.qcwireless.qcwatch.ui.device.camera.Camera.Front.INSTANCE)) {
                            android.graphics.Bitmap scaleBitmap = com.qcwireless.qcwatch.ui.plate.util.ImageUtils.scaleBitmap(bitmapPhoto.bitmap, 0.5f);
                            android.graphics.Matrix matrix = new android.graphics.Matrix();
                            matrix.postRotate(f);
                            matrix.postScale(-1.0f, 1.0f);
                            com.bumptech.glide.Glide.with(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).load(android.graphics.Bitmap.createBitmap(scaleBitmap, 0, 0, scaleBitmap.getWidth(), scaleBitmap.getHeight(), matrix, true)).fitCenter().into(imageView);
                        } else {
                            com.bumptech.glide.Glide.with(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).load(com.qcwireless.qcwatch.ui.plate.util.ImageUtils.scaleBitmap(bitmapPhoto.bitmap, 0.5f)).fitCenter().into(imageView);
                            imageView.setRotation(-bitmapPhoto.rotationDegrees);
                        }
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(cameraActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.camera.CameraActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.camera.CameraActivity$takePicture$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.camera.CameraActivity) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.camera.CameraActivity cameraActivity2) {
                            java.lang.String str4;
                            com.qcwireless.qcwatch.ui.device.camera.Camera camera2;
                            java.lang.String str5;
                            java.lang.String str6;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraActivity2, "$this$ktxRunOnBgSingle");
                            try {
                                str4 = cameraActivity2.imageFilePath;
                                if (str4 != null) {
                                    float f2 = -bitmapPhoto.rotationDegrees;
                                    camera2 = cameraActivity2.activeCamera;
                                    java.lang.String str7 = null;
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(camera2, com.qcwireless.qcwatch.ui.device.camera.Camera.Front.INSTANCE)) {
                                        str6 = cameraActivity2.imageFilePath;
                                        if (str6 == null) {
                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("imageFilePath");
                                        } else {
                                            str7 = str6;
                                        }
                                        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile(str7);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decodeFile, "decodeFile(imageFilePath)");
                                        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                                        matrix2.postRotate(f2);
                                        matrix2.postScale(-1.0f, 1.0f);
                                        com.blankj.utilcode.util.ImageUtils.save2Album(android.graphics.Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix2, true), android.graphics.Bitmap.CompressFormat.JPEG);
                                        return;
                                    }
                                    str5 = cameraActivity2.imageFilePath;
                                    if (str5 == null) {
                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("imageFilePath");
                                    } else {
                                        str7 = str5;
                                    }
                                    android.graphics.Bitmap decodeFile2 = android.graphics.BitmapFactory.decodeFile(str7);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decodeFile2, "decodeFile(imageFilePath)");
                                    android.graphics.Matrix matrix3 = new android.graphics.Matrix();
                                    matrix3.postRotate(f2);
                                    com.blankj.utilcode.util.ImageUtils.save2Album(android.graphics.Bitmap.createBitmap(decodeFile2, 0, 0, decodeFile2.getWidth(), decodeFile2.getHeight(), matrix3, true), android.graphics.Bitmap.CompressFormat.JPEG);
                                }
                            } catch (java.lang.Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    });
                    return;
                }
                android.util.Log.e("Fotoapparat Example", "Couldn't capture photo.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeCamera() {
        com.qcwireless.qcwatch.ui.device.camera.Camera.Front front;
        com.qcwireless.qcwatch.ui.device.camera.Camera camera = this.activeCamera;
        if (kotlin.jvm.internal.Intrinsics.areEqual(camera, com.qcwireless.qcwatch.ui.device.camera.Camera.Front.INSTANCE)) {
            front = com.qcwireless.qcwatch.ui.device.camera.Camera.Back.INSTANCE;
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(camera, com.qcwireless.qcwatch.ui.device.camera.Camera.Back.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            front = com.qcwireless.qcwatch.ui.device.camera.Camera.Front.INSTANCE;
        }
        this.activeCamera = front;
        io.fotoapparat.Fotoapparat fotoapparat = this.fotoapparat;
        if (fotoapparat == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("fotoapparat");
            fotoapparat = null;
        }
        fotoapparat.switchTo(this.activeCamera.getLensPosition(), this.activeCamera.getConfiguration());
        adjustViewsVisibility();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("New camera position: ");
        sb.append(this.activeCamera instanceof com.qcwireless.qcwatch.ui.device.camera.Camera.Back ? "back" : "front");
        android.util.Log.i("Fotoapparat Example", sb.toString());
    }

    private final kotlin.jvm.functions.Function2<android.widget.CompoundButton, java.lang.Boolean, kotlin.Unit> toggleFlash() {
        return new kotlin.jvm.functions.Function2<android.widget.CompoundButton, java.lang.Boolean, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.camera.CameraActivity$toggleFlash$1
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                invoke((android.widget.CompoundButton) obj, ((java.lang.Boolean) obj2).booleanValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.widget.CompoundButton compoundButton, boolean z) {
                io.fotoapparat.Fotoapparat fotoapparat;
                kotlin.jvm.functions.Function1 off;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compoundButton, "<anonymous parameter 0>");
                fotoapparat = com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this.fotoapparat;
                if (fotoapparat == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("fotoapparat");
                    fotoapparat = null;
                }
                if (z) {
                    off = io.fotoapparat.selector.SelectorsKt.firstAvailable(new kotlin.jvm.functions.Function1[]{io.fotoapparat.selector.FlashSelectorsKt.torch(), io.fotoapparat.selector.FlashSelectorsKt.off()});
                } else {
                    off = io.fotoapparat.selector.FlashSelectorsKt.off();
                }
                fotoapparat.updateConfiguration(new io.fotoapparat.configuration.UpdateConfiguration(off, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, 1022, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Flash is now ");
                sb.append(z ? "on" : "off");
                android.util.Log.i("Fotoapparat Example", sb.toString());
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onStart() {
        super.onStart();
        if (this.permissionsGranted) {
            io.fotoapparat.Fotoapparat fotoapparat = this.fotoapparat;
            if (fotoapparat == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("fotoapparat");
                fotoapparat = null;
            }
            fotoapparat.start();
            adjustViewsVisibility();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onPause() {
        super.onPause();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(com.qcwireless.qcwatch.base.lifecycle.QcLifeCycle.INSTANCE.isForeground()));
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onStop() {
        super.onStop();
        if (this.permissionsGranted) {
            io.fotoapparat.Fotoapparat fotoapparat = this.fotoapparat;
            if (fotoapparat == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("fotoapparat");
                fotoapparat = null;
            }
            fotoapparat.stop();
        }
        finish();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).cancelNotification();
        boolean hasCameraPermission = this.permissionsDelegate.hasCameraPermission();
        this.permissionsGranted = hasCameraPermission;
        if (!hasCameraPermission) {
            java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_77);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            finish();
        }
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            finish();
        } else {
            synCameraState();
        }
    }

    public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (this.permissionsDelegate.resultGranted(requestCode, permissions, grantResults)) {
            this.permissionsGranted = true;
            io.fotoapparat.Fotoapparat fotoapparat = this.fotoapparat;
            com.qcwireless.qcwatch.databinding.ActivityCameraBinding activityCameraBinding = null;
            if (fotoapparat == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("fotoapparat");
                fotoapparat = null;
            }
            fotoapparat.start();
            adjustViewsVisibility();
            com.qcwireless.qcwatch.databinding.ActivityCameraBinding activityCameraBinding2 = this.binding;
            if (activityCameraBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityCameraBinding = activityCameraBinding2;
            }
            activityCameraBinding.cameraView.setVisibility(0);
        }
    }

    private final void adjustViewsVisibility() {
        io.fotoapparat.Fotoapparat fotoapparat = this.fotoapparat;
        io.fotoapparat.Fotoapparat fotoapparat2 = null;
        if (fotoapparat == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("fotoapparat");
            fotoapparat = null;
        }
        fotoapparat.getCapabilities().whenAvailable(new kotlin.jvm.functions.Function1<io.fotoapparat.capability.Capabilities, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.camera.CameraActivity$adjustViewsVisibility$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((io.fotoapparat.capability.Capabilities) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(io.fotoapparat.capability.Capabilities capabilities) {
                if (capabilities != null) {
                    io.fotoapparat.parameter.Zoom.VariableZoom zoom = capabilities.getZoom();
                    if ((zoom instanceof io.fotoapparat.parameter.Zoom.VariableZoom ? zoom : null) != null) {
                        return;
                    }
                }
                android.util.Log.e("Fotoapparat Example", "Couldn't obtain capabilities.");
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityCameraBinding activityCameraBinding = this.binding;
        if (activityCameraBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityCameraBinding = null;
        }
        android.widget.ImageView imageView = activityCameraBinding.imageSwitch;
        io.fotoapparat.Fotoapparat fotoapparat3 = this.fotoapparat;
        if (fotoapparat3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("fotoapparat");
        } else {
            fotoapparat2 = fotoapparat3;
        }
        imageView.setVisibility(fotoapparat2.isAvailable(io.fotoapparat.selector.LensPositionSelectorsKt.front()) ? 0 : 8);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        java.util.Timer timer = this.timer;
        if (timer != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(timer);
            timer.cancel();
        }
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(new com.oudmon.ble.base.communication.req.CameraReq((byte) 6));
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().removeOutCameraListener();
    }

    private final void synCameraState() {
        if (this.timer == null) {
            java.util.Timer timer = new java.util.Timer();
            this.timer = timer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(timer);
            timer.scheduleAtFixedRate(new java.util.TimerTask() { // from class: com.qcwireless.qcwatch.ui.device.camera.CameraActivity$synCameraState$1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.camera.CameraActivity$synCameraState$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.camera.CameraActivity$synCameraState$1$run$1
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.camera.CameraActivity$synCameraState$1) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.camera.CameraActivity$synCameraState$1 cameraActivity$synCameraState$1) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraActivity$synCameraState$1, "$this$ktxRunOnBgSingle");
                            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(new com.oudmon.ble.base.communication.req.CameraReq((byte) 5));
                        }
                    });
                }
            }, 0L, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL);
        }
    }

    /* compiled from: CameraActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/camera/CameraActivity$MyCameraListener;", "Lcom/oudmon/ble/base/communication/responseImpl/InnerCameraNotifyListener;", "(Lcom/qcwireless/qcwatch/ui/device/camera/CameraActivity;)V", "onDataResponse", "", "resultEntity", "Lcom/oudmon/ble/base/communication/rsp/CameraNotifyRsp;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyCameraListener extends com.oudmon.ble.base.communication.responseImpl.InnerCameraNotifyListener {
        /* JADX WARN: Multi-variable type inference failed */
        public MyCameraListener() {
            super((android.content.Context) com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this);
        }

        @Override // com.oudmon.ble.base.communication.responseImpl.InnerCameraNotifyListener, com.oudmon.ble.base.communication.ICommandResponse
        public void onDataResponse(com.oudmon.ble.base.communication.rsp.CameraNotifyRsp resultEntity) {
            super.onDataResponse(resultEntity);
            kotlin.jvm.internal.Intrinsics.checkNotNull(resultEntity);
            if (resultEntity.getStatus() == 0) {
                android.util.Log.i("CameraActivity", "onDataResponse: getAction=" + resultEntity.getAction());
                int action = resultEntity.getAction();
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                    com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this.finish();
                    return;
                }
                com.qcwireless.qcwatch.databinding.ActivityCameraBinding activityCameraBinding = null;
                if (com.qcwireless.qcwatch.base.utils.ClickUtilsKt.isNotFastClick()) {
                    com.qcwireless.qcwatch.databinding.ActivityCameraBinding activityCameraBinding2 = com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this.binding;
                    if (activityCameraBinding2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityCameraBinding = activityCameraBinding2;
                    }
                    activityCameraBinding.imageTakePicture.performClick();
                    return;
                }
                if (com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this.showToast) {
                    com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this.showToast = false;
                    java.lang.String string = com.qcwireless.qcwatch.ui.device.camera.CameraActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_78);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_78)");
                    com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                }
            }
        }
    }
}
