package com.qcwireless.qcwatch.ui.mine.ucenter.fragment;

import com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.CameraPermissionCallback;

/* compiled from: NickNameFragment.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\"\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\u0016\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020\u0010H\u0002J\b\u0010%\u001a\u00020\u0010H\u0002J\b\u0010&\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/ucenter/fragment/NickNameFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentNickNameBinding;", "callback", "Lcom/qcwireless/qcwatch/ui/base/imagepicker/ImagePicker$Callback;", "getCallback", "()Lcom/qcwireless/qcwatch/ui/base/imagepicker/ImagePicker$Callback;", "setCallback", "(Lcom/qcwireless/qcwatch/ui/base/imagepicker/ImagePicker$Callback;)V", "imagePicker", "Lcom/qcwireless/qcwatch/ui/base/imagepicker/ImagePicker;", "mMaxLength", "", "loadDataOnce", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setPictureToDevice", "path", "", "deviceSetting", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "showPictureSelectorDialog", "toAlbum", "toCustomCamera", "CameraPermissionCallback", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class NickNameFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {
    private com.qcwireless.qcwatch.databinding.FragmentNickNameBinding binding;
    private final int mMaxLength = 20;
    private final com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker imagePicker = new com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker();
    private com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback callback = new com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment$callback$1
        @Override // com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback
        public void onPickImage(android.net.Uri imageUri) {
        }

        @Override // com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback
        public void cropConfig(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
            builder.setMultiTouchEnabled(false).setCropShape(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape.OVAL).setGuidelines(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.Guidelines.OFF).setRequestedSize(200, 200).setAspectRatio(1, 1);
        }

        @Override // com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback
        public void onCropImage(android.net.Uri imageUri) {
            com.qcwireless.qcwatch.databinding.FragmentNickNameBinding fragmentNickNameBinding;
            com.qcwireless.qcwatch.databinding.FragmentNickNameBinding fragmentNickNameBinding2 = null;
            if (imageUri != null) {
                if (com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.this.getActivity() instanceof com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity) {
                    com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity activity = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.this.getActivity();
                    java.util.Objects.requireNonNull(activity, "null cannot be cast to non-null type com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity");
                    activity.getViewModel().getUserEntity().setLocalAvatarUrl(java.lang.String.valueOf(imageUri.getPath()));
                }
                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAvatarSupport()) {
                    kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment$callback$1$onCropImage$1(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.this, imageUri, null), 3, (java.lang.Object) null);
                }
            }
            com.bumptech.glide.RequestBuilder centerCrop = com.bumptech.glide.Glide.with(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.this.getActivity()).load(imageUri).centerCrop();
            fragmentNickNameBinding = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.this.binding;
            if (fragmentNickNameBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentNickNameBinding2 = fragmentNickNameBinding;
            }
            centerCrop.into(fragmentNickNameBinding2.userIconCenter);
        }
    };

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentNickNameBinding inflate = com.qcwireless.qcwatch.databinding.FragmentNickNameBinding.inflate(inflater, container, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        return inflate.getRoot();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onResume() {
        super.onResume();
        com.qcwireless.qcwatch.databinding.FragmentNickNameBinding fragmentNickNameBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentNickNameBinding fragmentNickNameBinding2 = null;
        if (fragmentNickNameBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentNickNameBinding = null;
        }
        android.text.Editable text = fragmentNickNameBinding.userNick.getText();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text, "binding.userNick.text");
        if (text.length() > 0) {
            com.qcwireless.qcwatch.databinding.FragmentNickNameBinding fragmentNickNameBinding3 = this.binding;
            if (fragmentNickNameBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentNickNameBinding2 = fragmentNickNameBinding3;
            }
            fragmentNickNameBinding2.btnNext.setEnabled(true);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void loadDataOnce() {
        super.loadDataOnce();
        final com.qcwireless.qcwatch.databinding.FragmentNickNameBinding fragmentNickNameBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentNickNameBinding fragmentNickNameBinding2 = null;
        if (fragmentNickNameBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentNickNameBinding = null;
        }
        fragmentNickNameBinding.userNick.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.mMaxLength)});
        android.widget.EditText editText = fragmentNickNameBinding.userNick;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText, "userNick");
        editText.addTextChangedListener(new android.text.TextWatcher() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment$loadDataOnce$lambda-1$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable s) {
                com.qcwireless.qcwatch.databinding.FragmentNickNameBinding.this.btnNext.setEnabled(true);
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "------");
            }
        });
        android.view.View[] viewArr = new android.view.View[2];
        com.qcwireless.qcwatch.databinding.FragmentNickNameBinding fragmentNickNameBinding3 = this.binding;
        if (fragmentNickNameBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentNickNameBinding3 = null;
        }
        viewArr[0] = fragmentNickNameBinding3.btnNext;
        com.qcwireless.qcwatch.databinding.FragmentNickNameBinding fragmentNickNameBinding4 = this.binding;
        if (fragmentNickNameBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentNickNameBinding2 = fragmentNickNameBinding4;
        }
        viewArr[1] = fragmentNickNameBinding2.userIconCenter;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment$loadDataOnce$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.FragmentNickNameBinding fragmentNickNameBinding5;
                com.qcwireless.qcwatch.databinding.FragmentNickNameBinding fragmentNickNameBinding6;
                com.qcwireless.qcwatch.databinding.FragmentNickNameBinding fragmentNickNameBinding7;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                fragmentNickNameBinding5 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.this.binding;
                com.qcwireless.qcwatch.databinding.FragmentNickNameBinding fragmentNickNameBinding8 = null;
                if (fragmentNickNameBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentNickNameBinding5 = null;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentNickNameBinding5.btnNext)) {
                    fragmentNickNameBinding6 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.this.binding;
                    if (fragmentNickNameBinding6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentNickNameBinding8 = fragmentNickNameBinding6;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentNickNameBinding8.userIconCenter)) {
                        com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestCameraPermission(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.this.getActivity(), com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.this.new CameraPermissionCallback());
                        return;
                    }
                    return;
                }
                if (com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.this.getActivity() instanceof com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity) {
                    com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity activity = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.this.getActivity();
                    java.util.Objects.requireNonNull(activity, "null cannot be cast to non-null type com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity");
                    com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity firstProfileActivity = activity;
                    com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = firstProfileActivity.getViewModel().getUserEntity();
                    fragmentNickNameBinding7 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.this.binding;
                    if (fragmentNickNameBinding7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentNickNameBinding8 = fragmentNickNameBinding7;
                    }
                    userEntity.setNickName(fragmentNickNameBinding8.userNick.getText().toString());
                    firstProfileActivity.setCurrItem(1);
                }
            }
        });
    }

    /* compiled from: NickNameFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/ucenter/fragment/NickNameFragment$CameraPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/mine/ucenter/fragment/NickNameFragment;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class CameraPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public CameraPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            if (all) {
                com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.this.showPictureSelectorDialog();
                return;
            }
            java.lang.String string = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            if (never) {
                com.hjq.permissions.XXPermissions.startPermissionActivity(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.this.getActivity(), permissions);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPictureSelectorDialog() {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_photo);
        objectRef.element = builder.create();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).show();
        android.view.View contentView = ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_take_photo);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_take_picture);
        ((android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_cancel)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.m1369showPictureSelectorDialog$lambda2(objectRef, view);
            }
        });
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.m1370showPictureSelectorDialog$lambda3(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.this, objectRef, view);
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.m1371showPictureSelectorDialog$lambda4(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment.this, objectRef, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPictureSelectorDialog$lambda-2, reason: not valid java name */
    public static final void m1369showPictureSelectorDialog$lambda2(kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPictureSelectorDialog$lambda-3, reason: not valid java name */
    public static final void m1370showPictureSelectorDialog$lambda3(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment nickNameFragment, kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nickNameFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        nickNameFragment.toCustomCamera();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPictureSelectorDialog$lambda-4, reason: not valid java name */
    public static final void m1371showPictureSelectorDialog$lambda4(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment nickNameFragment, kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nickNameFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        nickNameFragment.toAlbum();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    private final void toCustomCamera() {
        this.imagePicker.startCamera(this, this.callback);
    }

    private final void toAlbum() {
        this.imagePicker.startGallery(this, this.callback);
    }

    public final com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback getCallback() {
        return this.callback;
    }

    public final void setCallback(com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "<set-?>");
        this.callback = callback;
    }

    public final void setPictureToDevice(java.lang.String path, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        android.graphics.Bitmap makeRectWithCornerAndLight;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSetting, "deviceSetting");
        if (android.text.TextUtils.isEmpty(path)) {
            return;
        }
        android.graphics.Bitmap scaleBitmap = com.qcwireless.qcwatch.ui.plate.util.ImageUtils.scaleBitmap(android.graphics.BitmapFactory.decodeFile(path), deviceSetting.getAvatarWidth(), deviceSetting.getAvatarHeight());
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, deviceSetting.getAvatarWidth() + "----" + deviceSetting.getAvatarHeight());
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(deviceSetting.getAvatarScreen() == 0));
        if (scaleBitmap != null) {
            if (deviceSetting.getAvatarScreen() == 0) {
                makeRectWithCornerAndLight = com.qcwireless.qcwatch.ui.plate.util.DeviceImageUtilsKt.makeRoundAndLight(scaleBitmap, 100);
            } else {
                makeRectWithCornerAndLight = com.qcwireless.qcwatch.ui.plate.util.DeviceImageUtilsKt.makeRectWithCornerAndLight(scaleBitmap, 100, 10);
            }
            byte[] rgb565ByteArray = com.qcwireless.qcwatch.ui.plate.util.ImageUtils.getRgb565ByteArray(makeRectWithCornerAndLight, deviceSetting.getAvatarWidth(), deviceSetting.getAvatarHeight());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rgb565ByteArray, "getRgb565ByteArray(\n    …ght\n                    )");
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.oudmon.ble.base.communication.utils.ByteUtil.bytesToString(rgb565ByteArray));
            if (com.oudmon.ble.base.communication.file.AvatarHandle.getInstance().checkData(rgb565ByteArray)) {
                com.oudmon.ble.base.communication.file.AvatarHandle.getInstance().cmdSendPacket();
            }
        }
    }

    public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        this.imagePicker.onActivityResult(this, requestCode, resultCode, data);
    }
}
