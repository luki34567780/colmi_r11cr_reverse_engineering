package com.qcwireless.qcwatch.ui.mine.feedback;

/* compiled from: FeedbackSubmitActivity.kt */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0012\u0010&\u001a\u00020!2\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020!H\u0014J\b\u0010*\u001a\u00020!H\u0002J\b\u0010+\u001a\u00020!H\u0002J\b\u0010,\u001a\u00020!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/feedback/FeedbackSubmitActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/mine/feedback/adapter/FeedbackImagesListAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityFeedbackSubmitBinding;", "callback", "Lcom/qcwireless/qcwatch/ui/base/imagepicker/ImagePicker$Callback;", "getCallback", "()Lcom/qcwireless/qcwatch/ui/base/imagepicker/ImagePicker$Callback;", "setCallback", "(Lcom/qcwireless/qcwatch/ui/base/imagepicker/ImagePicker$Callback;)V", "content", "", "emptyInputFilter", "Landroid/text/InputFilter;", "feedbackId", "", "files", "", "Ljava/io/File;", "imagePicker", "Lcom/qcwireless/qcwatch/ui/base/imagepicker/ImagePicker;", "inputFilter", "typeId", "viewModel", "Lcom/qcwireless/qcwatch/ui/mine/feedback/FeedbackViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/mine/feedback/FeedbackViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "showPictureSelectorDialog", "toAlbum", "toCustomCamera", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class FeedbackSubmitActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.mine.feedback.adapter.FeedbackImagesListAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding binding;
    private int feedbackId;
    private int typeId;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private java.lang.String content = "";
    private final com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker imagePicker = new com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker();
    private java.util.List<java.io.File> files = new java.util.ArrayList();
    private com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback callback = new com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity$callback$1
        @Override // com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback
        public void onPickImage(android.net.Uri imageUri) {
        }

        @Override // com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback
        public void cropConfig(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
            super.cropConfig(builder);
            builder.setMultiTouchEnabled(false).setGuidelines(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.Guidelines.OFF).setCropShape(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape.RECTANGLE).setAspectRatio(720, 1080);
        }

        @Override // com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback
        public void onCropImage(android.net.Uri imageUri) {
            com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel viewModel;
            com.qcwireless.qcwatch.ui.mine.feedback.adapter.FeedbackImagesListAdapter feedbackImagesListAdapter;
            java.util.List list;
            com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding activityFeedbackSubmitBinding;
            com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel viewModel2;
            if (imageUri != null) {
                com.qcwireless.qcwatch.ui.mine.feedback.bean.FeedbackImageBean feedbackImageBean = new com.qcwireless.qcwatch.ui.mine.feedback.bean.FeedbackImageBean(java.lang.String.valueOf(imageUri.getPath()), false);
                viewModel = com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.this.getViewModel();
                viewModel.getImageList().add(feedbackImageBean);
                feedbackImagesListAdapter = com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.this.adapter;
                com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding activityFeedbackSubmitBinding2 = null;
                if (feedbackImagesListAdapter == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    feedbackImagesListAdapter = null;
                }
                feedbackImagesListAdapter.notifyDataSetChanged();
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, imageUri.getPath());
                list = com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.this.files;
                list.add(new java.io.File(imageUri.getPath()));
                activityFeedbackSubmitBinding = com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.this.binding;
                if (activityFeedbackSubmitBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityFeedbackSubmitBinding2 = activityFeedbackSubmitBinding;
                }
                android.widget.TextView textView = activityFeedbackSubmitBinding2.tvImageNumber;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                viewModel2 = com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.this.getViewModel();
                sb.append(viewModel2.getImageList().size());
                sb.append("/3");
                textView.setText(sb.toString());
            }
        }
    };
    private android.text.InputFilter emptyInputFilter = new android.text.InputFilter() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity$$ExternalSyntheticLambda0
        @Override // android.text.InputFilter
        public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
            java.lang.CharSequence m1281emptyInputFilter$lambda9;
            m1281emptyInputFilter$lambda9 = com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.m1281emptyInputFilter$lambda9(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.this, charSequence, i, i2, spanned, i3, i4);
            return m1281emptyInputFilter$lambda9;
        }
    };
    private android.text.InputFilter inputFilter = new android.text.InputFilter() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity$inputFilter$1
        private java.util.regex.Pattern emoji = java.util.regex.Pattern.compile("[🀀-🏿]|[🐀-\u1f7ff]|[☀-⟿]", 66);

        public final java.util.regex.Pattern getEmoji() {
            return this.emoji;
        }

        public final void setEmoji(java.util.regex.Pattern pattern) {
            this.emoji = pattern;
        }

        @Override // android.text.InputFilter
        public java.lang.CharSequence filter(java.lang.CharSequence source, int start, int end, android.text.Spanned dest, int dstart, int dend) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            if (!this.emoji.matcher(source).find()) {
                return source;
            }
            java.lang.String string = com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_219);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_219)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return "";
        }
    };

    public FeedbackSubmitActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel>() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel m1289invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding inflate = com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding.inflate(getLayoutInflater());
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
        try {
            android.os.Bundle extras = getIntent().getExtras();
            kotlin.jvm.internal.Intrinsics.checkNotNull(extras);
            this.typeId = extras.getInt("typeId");
            android.os.Bundle extras2 = getIntent().getExtras();
            kotlin.jvm.internal.Intrinsics.checkNotNull(extras2);
            this.feedbackId = extras2.getInt("feedbackId");
            android.os.Bundle extras3 = getIntent().getExtras();
            kotlin.jvm.internal.Intrinsics.checkNotNull(extras3);
            this.content = java.lang.String.valueOf(extras3.getString("content"));
        } catch (java.lang.Exception unused) {
        }
        this.imagePicker.setTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_327));
        this.imagePicker.setCropImage(true);
        com.qcwireless.qcwatch.ui.mine.feedback.adapter.FeedbackImagesListAdapter feedbackImagesListAdapter = new com.qcwireless.qcwatch.ui.mine.feedback.adapter.FeedbackImagesListAdapter((android.content.Context) this);
        this.adapter = feedbackImagesListAdapter;
        feedbackImagesListAdapter.setData$com_github_CymChad_brvah(getViewModel().getImageList());
        androidx.recyclerview.widget.RecyclerView.LayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(getActivity(), 3);
        final com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding activityFeedbackSubmitBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding activityFeedbackSubmitBinding2 = null;
        if (activityFeedbackSubmitBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityFeedbackSubmitBinding = null;
        }
        activityFeedbackSubmitBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_322));
        activityFeedbackSubmitBinding.titleBar.tvRightText.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_329));
        activityFeedbackSubmitBinding.tvFeedbackName.setText(this.content);
        androidx.recyclerview.widget.RecyclerView recyclerView = activityFeedbackSubmitBinding.rcvFeedbackPic;
        com.qcwireless.qcwatch.ui.mine.feedback.adapter.FeedbackImagesListAdapter feedbackImagesListAdapter2 = this.adapter;
        if (feedbackImagesListAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            feedbackImagesListAdapter2 = null;
        }
        recyclerView.setAdapter(feedbackImagesListAdapter2);
        activityFeedbackSubmitBinding.rcvFeedbackPic.setLayoutManager(gridLayoutManager);
        androidx.recyclerview.widget.SimpleItemAnimator itemAnimator = activityFeedbackSubmitBinding.rcvFeedbackPic.getItemAnimator();
        java.util.Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        itemAnimator.setSupportsChangeAnimations(false);
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityFeedbackSubmitBinding.titleBar.tvRightText);
        activityFeedbackSubmitBinding.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.m1282setupViews$lambda2$lambda0(com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding.this, this, view);
            }
        });
        android.widget.EditText editText = activityFeedbackSubmitBinding.userFeedbackEt;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText, "userFeedbackEt");
        editText.addTextChangedListener(new android.text.TextWatcher() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity$setupViews$lambda-2$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable s) {
                if (com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding.this.userFeedbackEt.getText().length() <= 200) {
                    com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding.this.tvMaxLength.setText(com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding.this.userFeedbackEt.getText().length() + "/200");
                    return;
                }
                android.widget.TextView textView = com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding.this.tvMaxLength;
                android.text.Editable text = com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding.this.userFeedbackEt.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text, "userFeedbackEt.text");
                textView.setText(text.subSequence(0, 200).toString());
                android.widget.EditText editText2 = com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding.this.userFeedbackEt;
                android.text.Editable text2 = com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding.this.userFeedbackEt.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "userFeedbackEt.text");
                editText2.setText(text2.subSequence(0, 200).toString());
                android.widget.EditText editText3 = com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding.this.userFeedbackEt;
                android.text.Editable text3 = com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding.this.userFeedbackEt.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text3, "userFeedbackEt.text");
                editText3.setSelection(text3.subSequence(0, 200).toString().length());
            }
        });
        activityFeedbackSubmitBinding.etContactEmail.setFilters(new android.text.InputFilter[]{this.inputFilter, this.emptyInputFilter, new android.text.InputFilter.LengthFilter(60)});
        com.qcwireless.qcwatch.ui.mine.feedback.adapter.FeedbackImagesListAdapter feedbackImagesListAdapter3 = this.adapter;
        if (feedbackImagesListAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            feedbackImagesListAdapter3 = null;
        }
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        feedbackImagesListAdapter3.getDeletePosition().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity$$ExternalSyntheticLambda7
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.m1283setupViews$lambda3(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.this, (java.lang.Integer) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding activityFeedbackSubmitBinding3 = this.binding;
        if (activityFeedbackSubmitBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityFeedbackSubmitBinding2 = activityFeedbackSubmitBinding3;
        }
        activityFeedbackSubmitBinding2.addImage.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.m1284setupViews$lambda4(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.this, view);
            }
        });
        getViewModel().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity$$ExternalSyntheticLambda6
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.m1285setupViews$lambda5(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.this, (com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel.FeedBackUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-2$lambda-0, reason: not valid java name */
    public static final void m1282setupViews$lambda2$lambda0(com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding activityFeedbackSubmitBinding, final com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity feedbackSubmitActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFeedbackSubmitBinding, "$this_run");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feedbackSubmitActivity, "this$0");
        java.lang.String obj = activityFeedbackSubmitBinding.etContactEmail.getText().toString();
        java.lang.String obj2 = activityFeedbackSubmitBinding.userFeedbackEt.getText().toString();
        if (!com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isNetworkAvailable((android.content.Context) feedbackSubmitActivity)) {
            java.lang.String string = feedbackSubmitActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_223);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_223)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return;
        }
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(activityFeedbackSubmitBinding, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity$setupViews$1$1$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                invoke((com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding) obj3);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding activityFeedbackSubmitBinding2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFeedbackSubmitBinding2, "$this$ktxRunOnBgSingle");
                if (com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isOnline()) {
                    return;
                }
                final com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity feedbackSubmitActivity2 = com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(activityFeedbackSubmitBinding2, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity$setupViews$1$1$1.1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                        invoke((com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding) obj3);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding activityFeedbackSubmitBinding3) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFeedbackSubmitBinding3, "$this$ktxRunOnUi");
                        java.lang.String string2 = com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_223);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_223)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
                    }
                });
            }
        });
        java.lang.String str = obj;
        if (str.length() == 0) {
            java.lang.String string2 = feedbackSubmitActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_325);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_325)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
            return;
        }
        if (!kotlin.text.StringsKt.contains$default(str, "@", false, 2, (java.lang.Object) null)) {
            java.lang.String string3 = feedbackSubmitActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_219);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_219)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string3, 0, 1, null);
            return;
        }
        if (obj2.length() == 0) {
            java.lang.String string4 = feedbackSubmitActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_323);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_323)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string4, 0, 1, null);
            return;
        }
        com.qcwireless.qcwatch.ui.base.bean.request.user.FeedbackRequest feedbackRequest = new com.qcwireless.qcwatch.ui.base.bean.request.user.FeedbackRequest();
        feedbackRequest.setTypeId(feedbackSubmitActivity.typeId);
        feedbackRequest.setFeedbackId(feedbackSubmitActivity.feedbackId);
        feedbackRequest.setEmail(obj);
        feedbackRequest.setContent(obj2);
        if (feedbackSubmitActivity.files.size() == 0) {
            java.lang.String string5 = feedbackSubmitActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_449);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.qc_text_449)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string5, 0, 1, null);
            return;
        }
        feedbackSubmitActivity.showLoadingDialog();
        java.lang.String str2 = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getLogDirFile().getPath() + '/' + obj + ".txt";
        com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.copyFile(com.qcwireless.qcwatch.QJavaApplication.getAppLogPath(), str2);
        feedbackSubmitActivity.files.add(new java.io.File(str2));
        feedbackSubmitActivity.getViewModel().submitFeedback(feedbackRequest, feedbackSubmitActivity.files);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3, reason: not valid java name */
    public static final void m1283setupViews$lambda3(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity feedbackSubmitActivity, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feedbackSubmitActivity, "this$0");
        java.util.List<com.qcwireless.qcwatch.ui.mine.feedback.bean.FeedbackImageBean> imageList = feedbackSubmitActivity.getViewModel().getImageList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "it");
        com.qcwireless.qcwatch.ui.mine.feedback.bean.FeedbackImageBean feedbackImageBean = imageList.get(num.intValue());
        feedbackSubmitActivity.getViewModel().getImageList().remove(feedbackImageBean);
        feedbackSubmitActivity.files.remove(new java.io.File(feedbackImageBean.getPath()));
        com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding activityFeedbackSubmitBinding = feedbackSubmitActivity.binding;
        com.qcwireless.qcwatch.ui.mine.feedback.adapter.FeedbackImagesListAdapter feedbackImagesListAdapter = null;
        if (activityFeedbackSubmitBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityFeedbackSubmitBinding = null;
        }
        activityFeedbackSubmitBinding.tvImageNumber.setText(feedbackSubmitActivity.getViewModel().getImageList().size() + "/3");
        com.qcwireless.qcwatch.ui.mine.feedback.adapter.FeedbackImagesListAdapter feedbackImagesListAdapter2 = feedbackSubmitActivity.adapter;
        if (feedbackImagesListAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            feedbackImagesListAdapter = feedbackImagesListAdapter2;
        }
        feedbackImagesListAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4, reason: not valid java name */
    public static final void m1284setupViews$lambda4(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity feedbackSubmitActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feedbackSubmitActivity, "this$0");
        if (feedbackSubmitActivity.getViewModel().getImageList().size() < 3) {
            feedbackSubmitActivity.showPictureSelectorDialog();
            return;
        }
        java.lang.String string = feedbackSubmitActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_328);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_328)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-5, reason: not valid java name */
    public static final void m1285setupViews$lambda5(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity feedbackSubmitActivity, com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel.FeedBackUI feedBackUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feedbackSubmitActivity, "this$0");
        if (feedBackUI.getSuccess()) {
            feedbackSubmitActivity.dismissLoadingDialog();
            java.lang.String string = feedbackSubmitActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_330);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_330)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            feedbackSubmitActivity.finish();
        }
    }

    private final void showPictureSelectorDialog() {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_photo);
        objectRef.element = builder.create();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).show();
        android.view.View contentView = ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_take_photo);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_take_picture);
        ((android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_cancel)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.m1286showPictureSelectorDialog$lambda6(objectRef, view);
            }
        });
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.m1287showPictureSelectorDialog$lambda7(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.this, objectRef, view);
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.m1288showPictureSelectorDialog$lambda8(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity.this, objectRef, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPictureSelectorDialog$lambda-6, reason: not valid java name */
    public static final void m1286showPictureSelectorDialog$lambda6(kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPictureSelectorDialog$lambda-7, reason: not valid java name */
    public static final void m1287showPictureSelectorDialog$lambda7(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity feedbackSubmitActivity, kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feedbackSubmitActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        feedbackSubmitActivity.toCustomCamera();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPictureSelectorDialog$lambda-8, reason: not valid java name */
    public static final void m1288showPictureSelectorDialog$lambda8(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity feedbackSubmitActivity, kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feedbackSubmitActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        feedbackSubmitActivity.toAlbum();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void toCustomCamera() {
        this.imagePicker.startCamera((android.app.Activity) this, this.callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void toAlbum() {
        this.imagePicker.startGallery((android.app.Activity) this, this.callback);
    }

    public final com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback getCallback() {
        return this.callback;
    }

    public final void setCallback(com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "<set-?>");
        this.callback = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        this.imagePicker.onActivityResult((android.app.Activity) this, requestCode, resultCode, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: emptyInputFilter$lambda-9, reason: not valid java name */
    public static final java.lang.CharSequence m1281emptyInputFilter$lambda9(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackSubmitActivity feedbackSubmitActivity, java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feedbackSubmitActivity, "this$0");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(charSequence, " ")) {
            return charSequence;
        }
        java.lang.String string = feedbackSubmitActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_219);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_219)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        return "";
    }
}
