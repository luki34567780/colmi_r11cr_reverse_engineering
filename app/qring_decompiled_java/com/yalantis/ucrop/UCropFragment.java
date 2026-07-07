package com.yalantis.ucrop;

/* loaded from: classes3.dex */
public class UCropFragment extends androidx.fragment.app.Fragment {
    public static final int ALL = 3;
    private static final long CONTROLS_ANIMATION_DURATION = 50;
    public static final int DEFAULT_COMPRESS_QUALITY = 90;
    public static final int NONE = 0;
    public static final int ROTATE = 2;
    private static final int ROTATE_WIDGET_SENSITIVITY_COEFFICIENT = 42;
    public static final int SCALE = 1;
    private static final int SCALE_WIDGET_SENSITIVITY_COEFFICIENT = 15000;
    private static final int TABS_COUNT = 3;
    private com.yalantis.ucrop.UCropFragmentCallback callback;
    private boolean isUseCustomBitmap;
    private int mActiveControlsWidgetColor;
    private android.view.View mBlockingView;
    private androidx.transition.Transition mControlsTransition;
    private com.yalantis.ucrop.view.GestureCropImageView mGestureCropImageView;
    private android.view.ViewGroup mLayoutAspectRatio;
    private android.view.ViewGroup mLayoutRotate;
    private android.view.ViewGroup mLayoutScale;
    private int mLogoColor;
    private com.yalantis.ucrop.view.OverlayView mOverlayView;
    private int mRootViewBackgroundColor;
    private boolean mShowBottomControls;
    private android.widget.TextView mTextViewRotateAngle;
    private android.widget.TextView mTextViewScalePercent;
    private com.yalantis.ucrop.view.UCropView mUCropView;
    private android.view.ViewGroup mWrapperStateAspectRatio;
    private android.view.ViewGroup mWrapperStateRotate;
    private android.view.ViewGroup mWrapperStateScale;
    public static final android.graphics.Bitmap.CompressFormat DEFAULT_COMPRESS_FORMAT = android.graphics.Bitmap.CompressFormat.JPEG;
    public static final java.lang.String TAG = "UCropFragment";
    private final java.util.List<android.view.ViewGroup> mCropAspectRatioViews = new java.util.ArrayList();
    private android.graphics.Bitmap.CompressFormat mCompressFormat = DEFAULT_COMPRESS_FORMAT;
    private int mCompressQuality = 90;
    private int[] mAllowedGestures = {1, 2, 3};
    private final com.yalantis.ucrop.view.TransformImageView.TransformImageListener mImageListener = new com.yalantis.ucrop.view.TransformImageView.TransformImageListener() { // from class: com.yalantis.ucrop.UCropFragment.1
        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onRotate(float f) {
            com.yalantis.ucrop.UCropFragment.this.setAngleText(f);
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onScale(float f) {
            com.yalantis.ucrop.UCropFragment.this.setScaleText(f);
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onLoadComplete() {
            com.yalantis.ucrop.UCropFragment.this.mUCropView.animate().alpha(1.0f).setDuration(300L).setInterpolator(new android.view.animation.AccelerateInterpolator());
            com.yalantis.ucrop.UCropFragment.this.mBlockingView.setClickable(false);
            com.yalantis.ucrop.UCropFragment.this.callback.loadingProgress(false);
            if (com.yalantis.ucrop.UCropFragment.this.getArguments().getBoolean(com.yalantis.ucrop.UCrop.Options.EXTRA_CROP_FORBID_GIF_WEBP, false)) {
                java.lang.String mimeTypeFromMediaContentUri = com.yalantis.ucrop.util.FileUtils.getMimeTypeFromMediaContentUri(com.yalantis.ucrop.UCropFragment.this.getContext(), (android.net.Uri) com.yalantis.ucrop.UCropFragment.this.getArguments().getParcelable(com.yalantis.ucrop.UCrop.EXTRA_INPUT_URI));
                if (com.yalantis.ucrop.util.FileUtils.isGif(mimeTypeFromMediaContentUri) || com.yalantis.ucrop.util.FileUtils.isWebp(mimeTypeFromMediaContentUri)) {
                    com.yalantis.ucrop.UCropFragment.this.mBlockingView.setClickable(true);
                }
            }
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onLoadFailure(java.lang.Exception exc) {
            com.yalantis.ucrop.UCropFragment.this.callback.onCropFinish(com.yalantis.ucrop.UCropFragment.this.getError(exc));
        }
    };
    private final android.view.View.OnClickListener mStateClickListener = new android.view.View.OnClickListener() { // from class: com.yalantis.ucrop.UCropFragment.7
        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (view.isSelected()) {
                return;
            }
            com.yalantis.ucrop.UCropFragment.this.setWidgetState(view.getId());
        }
    };

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface GestureTypes {
    }

    static {
        androidx.appcompat.app.AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public static com.yalantis.ucrop.UCropFragment newInstance(android.os.Bundle bundle) {
        com.yalantis.ucrop.UCropFragment uCropFragment = new com.yalantis.ucrop.UCropFragment();
        uCropFragment.setArguments(bundle);
        return uCropFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        if (getParentFragment() instanceof com.yalantis.ucrop.UCropFragmentCallback) {
            this.callback = (com.yalantis.ucrop.UCropFragmentCallback) getParentFragment();
        } else {
            if (context instanceof com.yalantis.ucrop.UCropFragmentCallback) {
                this.callback = (com.yalantis.ucrop.UCropFragmentCallback) context;
                return;
            }
            throw new java.lang.IllegalArgumentException(context.toString() + " must implement UCropFragmentCallback");
        }
    }

    public void setCallback(com.yalantis.ucrop.UCropFragmentCallback uCropFragmentCallback) {
        this.callback = uCropFragmentCallback;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(com.yalantis.ucrop.R.layout.ucrop_fragment_photobox, viewGroup, false);
        android.os.Bundle arguments = getArguments();
        setupViews(inflate, arguments);
        setImageData(arguments);
        setInitialState();
        addBlockingView(inflate);
        return inflate;
    }

    public void fragmentReVisible() {
        setImageData(getArguments());
        this.mUCropView.animate().alpha(1.0f).setDuration(300L).setInterpolator(new android.view.animation.AccelerateInterpolator());
        boolean z = false;
        this.callback.loadingProgress(false);
        if (getArguments().getBoolean(com.yalantis.ucrop.UCrop.Options.EXTRA_CROP_FORBID_GIF_WEBP, false)) {
            java.lang.String mimeTypeFromMediaContentUri = com.yalantis.ucrop.util.FileUtils.getMimeTypeFromMediaContentUri(getContext(), (android.net.Uri) getArguments().getParcelable(com.yalantis.ucrop.UCrop.EXTRA_INPUT_URI));
            if (com.yalantis.ucrop.util.FileUtils.isGif(mimeTypeFromMediaContentUri) || com.yalantis.ucrop.util.FileUtils.isWebp(mimeTypeFromMediaContentUri)) {
                z = true;
            }
        }
        this.mBlockingView.setClickable(z);
    }

    public void setupViews(android.view.View view, android.os.Bundle bundle) {
        this.mActiveControlsWidgetColor = bundle.getInt(com.yalantis.ucrop.UCrop.Options.EXTRA_UCROP_COLOR_CONTROLS_WIDGET_ACTIVE, androidx.core.content.ContextCompat.getColor(getContext(), com.yalantis.ucrop.R.color.ucrop_color_active_controls_color));
        this.mLogoColor = bundle.getInt(com.yalantis.ucrop.UCrop.Options.EXTRA_UCROP_LOGO_COLOR, androidx.core.content.ContextCompat.getColor(getContext(), com.yalantis.ucrop.R.color.ucrop_color_default_logo));
        this.mShowBottomControls = !bundle.getBoolean(com.yalantis.ucrop.UCrop.Options.EXTRA_HIDE_BOTTOM_CONTROLS, false);
        this.mRootViewBackgroundColor = bundle.getInt(com.yalantis.ucrop.UCrop.Options.EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR, androidx.core.content.ContextCompat.getColor(getContext(), com.yalantis.ucrop.R.color.ucrop_color_crop_background));
        initiateRootViews(view);
        this.callback.loadingProgress(true);
        if (this.mShowBottomControls) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.yalantis.ucrop.R.id.controls_wrapper);
            viewGroup.setVisibility(0);
            android.view.LayoutInflater.from(getContext()).inflate(com.yalantis.ucrop.R.layout.ucrop_controls, viewGroup, true);
            androidx.transition.AutoTransition autoTransition = new androidx.transition.AutoTransition();
            this.mControlsTransition = autoTransition;
            autoTransition.setDuration(CONTROLS_ANIMATION_DURATION);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view.findViewById(com.yalantis.ucrop.R.id.state_aspect_ratio);
            this.mWrapperStateAspectRatio = viewGroup2;
            viewGroup2.setOnClickListener(this.mStateClickListener);
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) view.findViewById(com.yalantis.ucrop.R.id.state_rotate);
            this.mWrapperStateRotate = viewGroup3;
            viewGroup3.setOnClickListener(this.mStateClickListener);
            android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) view.findViewById(com.yalantis.ucrop.R.id.state_scale);
            this.mWrapperStateScale = viewGroup4;
            viewGroup4.setOnClickListener(this.mStateClickListener);
            this.mLayoutAspectRatio = (android.view.ViewGroup) view.findViewById(com.yalantis.ucrop.R.id.layout_aspect_ratio);
            this.mLayoutRotate = (android.view.ViewGroup) view.findViewById(com.yalantis.ucrop.R.id.layout_rotate_wheel);
            this.mLayoutScale = (android.view.ViewGroup) view.findViewById(com.yalantis.ucrop.R.id.layout_scale_wheel);
            setupAspectRatioWidget(bundle, view);
            setupRotateWidget(view);
            setupScaleWidget(view);
            setupStatesWrapper(view);
            return;
        }
        ((android.widget.RelativeLayout.LayoutParams) view.findViewById(com.yalantis.ucrop.R.id.ucrop_frame).getLayoutParams()).bottomMargin = 0;
        view.findViewById(com.yalantis.ucrop.R.id.ucrop_frame).requestLayout();
    }

    private void setImageData(android.os.Bundle bundle) {
        android.net.Uri uri = (android.net.Uri) bundle.getParcelable(com.yalantis.ucrop.UCrop.EXTRA_INPUT_URI);
        android.net.Uri uri2 = (android.net.Uri) bundle.getParcelable("com.yalantis.ucrop.OutputUri");
        processOptions(bundle);
        if (uri != null && uri2 != null) {
            try {
                this.mGestureCropImageView.setImageUri(uri, com.yalantis.ucrop.util.FileUtils.replaceOutputUri(getContext(), bundle.getBoolean(com.yalantis.ucrop.UCrop.Options.EXTRA_CROP_FORBID_GIF_WEBP, false), uri, uri2), this.isUseCustomBitmap);
                return;
            } catch (java.lang.Exception e) {
                this.callback.onCropFinish(getError(e));
                return;
            }
        }
        this.callback.onCropFinish(getError(new java.lang.NullPointerException(getString(com.yalantis.ucrop.R.string.ucrop_error_input_data_is_absent))));
    }

    private void processOptions(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString(com.yalantis.ucrop.UCrop.Options.EXTRA_COMPRESSION_FORMAT_NAME);
        android.graphics.Bitmap.CompressFormat valueOf = !android.text.TextUtils.isEmpty(string) ? android.graphics.Bitmap.CompressFormat.valueOf(string) : null;
        if (valueOf == null) {
            valueOf = DEFAULT_COMPRESS_FORMAT;
        }
        this.mCompressFormat = valueOf;
        this.mCompressQuality = bundle.getInt(com.yalantis.ucrop.UCrop.Options.EXTRA_COMPRESSION_QUALITY, 90);
        this.isUseCustomBitmap = bundle.getBoolean(com.yalantis.ucrop.UCrop.Options.EXTRA_CROP_CUSTOM_LOADER_BITMAP, false);
        int[] intArray = bundle.getIntArray(com.yalantis.ucrop.UCrop.Options.EXTRA_ALLOWED_GESTURES);
        if (intArray != null && intArray.length == 3) {
            this.mAllowedGestures = intArray;
        }
        this.mGestureCropImageView.setMaxBitmapSize(bundle.getInt(com.yalantis.ucrop.UCrop.Options.EXTRA_MAX_BITMAP_SIZE, 0));
        this.mGestureCropImageView.setMaxScaleMultiplier(bundle.getFloat(com.yalantis.ucrop.UCrop.Options.EXTRA_MAX_SCALE_MULTIPLIER, 10.0f));
        this.mGestureCropImageView.setImageToWrapCropBoundsAnimDuration(bundle.getInt(com.yalantis.ucrop.UCrop.Options.EXTRA_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, 500));
        this.mOverlayView.setFreestyleCropEnabled(bundle.getBoolean(com.yalantis.ucrop.UCrop.Options.EXTRA_FREE_STYLE_CROP, false));
        this.mOverlayView.setDragSmoothToCenter(bundle.getBoolean(com.yalantis.ucrop.UCrop.Options.EXTRA_CROP_DRAG_CENTER, false));
        this.mOverlayView.setDimmedColor(bundle.getInt(com.yalantis.ucrop.UCrop.Options.EXTRA_DIMMED_LAYER_COLOR, getResources().getColor(com.yalantis.ucrop.R.color.ucrop_color_default_dimmed)));
        this.mOverlayView.setCircleStrokeColor(bundle.getInt(com.yalantis.ucrop.UCrop.Options.EXTRA_CIRCLE_STROKE_COLOR, getResources().getColor(com.yalantis.ucrop.R.color.ucrop_color_default_dimmed)));
        this.mOverlayView.setCircleDimmedLayer(bundle.getBoolean(com.yalantis.ucrop.UCrop.Options.EXTRA_CIRCLE_DIMMED_LAYER, false));
        this.mOverlayView.setShowCropFrame(bundle.getBoolean(com.yalantis.ucrop.UCrop.Options.EXTRA_SHOW_CROP_FRAME, true));
        this.mOverlayView.setCropFrameColor(bundle.getInt(com.yalantis.ucrop.UCrop.Options.EXTRA_CROP_FRAME_COLOR, getResources().getColor(com.yalantis.ucrop.R.color.ucrop_color_default_crop_frame)));
        this.mOverlayView.setCropFrameStrokeWidth(bundle.getInt(com.yalantis.ucrop.UCrop.Options.EXTRA_CROP_FRAME_STROKE_WIDTH, getResources().getDimensionPixelSize(com.yalantis.ucrop.R.dimen.ucrop_default_crop_frame_stoke_width)));
        this.mOverlayView.setShowCropGrid(bundle.getBoolean(com.yalantis.ucrop.UCrop.Options.EXTRA_SHOW_CROP_GRID, true));
        this.mOverlayView.setCropGridRowCount(bundle.getInt(com.yalantis.ucrop.UCrop.Options.EXTRA_CROP_GRID_ROW_COUNT, 2));
        this.mOverlayView.setCropGridColumnCount(bundle.getInt(com.yalantis.ucrop.UCrop.Options.EXTRA_CROP_GRID_COLUMN_COUNT, 2));
        this.mOverlayView.setCropGridColor(bundle.getInt(com.yalantis.ucrop.UCrop.Options.EXTRA_CROP_GRID_COLOR, getResources().getColor(com.yalantis.ucrop.R.color.ucrop_color_default_crop_grid)));
        this.mOverlayView.setCropGridStrokeWidth(bundle.getInt(com.yalantis.ucrop.UCrop.Options.EXTRA_CROP_GRID_STROKE_WIDTH, getResources().getDimensionPixelSize(com.yalantis.ucrop.R.dimen.ucrop_default_crop_grid_stoke_width)));
        this.mOverlayView.setDimmedStrokeWidth(bundle.getInt(com.yalantis.ucrop.UCrop.Options.EXTRA_CIRCLE_STROKE_WIDTH_LAYER, getResources().getDimensionPixelSize(com.yalantis.ucrop.R.dimen.ucrop_default_crop_grid_stoke_width)));
        float f = bundle.getFloat(com.yalantis.ucrop.UCrop.EXTRA_ASPECT_RATIO_X, -1.0f);
        float f2 = bundle.getFloat(com.yalantis.ucrop.UCrop.EXTRA_ASPECT_RATIO_Y, -1.0f);
        int i = bundle.getInt(com.yalantis.ucrop.UCrop.Options.EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, 0);
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(com.yalantis.ucrop.UCrop.Options.EXTRA_ASPECT_RATIO_OPTIONS);
        if (f >= 0.0f && f2 >= 0.0f) {
            android.view.ViewGroup viewGroup = this.mWrapperStateAspectRatio;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            float f3 = f / f2;
            this.mGestureCropImageView.setTargetAspectRatio(java.lang.Float.isNaN(f3) ? 0.0f : f3);
        } else if (parcelableArrayList != null && i < parcelableArrayList.size()) {
            float aspectRatioX = ((com.yalantis.ucrop.model.AspectRatio) parcelableArrayList.get(i)).getAspectRatioX() / ((com.yalantis.ucrop.model.AspectRatio) parcelableArrayList.get(i)).getAspectRatioY();
            this.mGestureCropImageView.setTargetAspectRatio(java.lang.Float.isNaN(aspectRatioX) ? 0.0f : aspectRatioX);
        } else {
            this.mGestureCropImageView.setTargetAspectRatio(0.0f);
        }
        int i2 = bundle.getInt(com.yalantis.ucrop.UCrop.EXTRA_MAX_SIZE_X, 0);
        int i3 = bundle.getInt(com.yalantis.ucrop.UCrop.EXTRA_MAX_SIZE_Y, 0);
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        this.mGestureCropImageView.setMaxResultImageSizeX(i2);
        this.mGestureCropImageView.setMaxResultImageSizeY(i3);
    }

    private void initiateRootViews(android.view.View view) {
        com.yalantis.ucrop.view.UCropView uCropView = (com.yalantis.ucrop.view.UCropView) view.findViewById(com.yalantis.ucrop.R.id.ucrop);
        this.mUCropView = uCropView;
        this.mGestureCropImageView = uCropView.getCropImageView();
        this.mOverlayView = this.mUCropView.getOverlayView();
        this.mGestureCropImageView.setTransformImageListener(this.mImageListener);
        ((android.widget.ImageView) view.findViewById(com.yalantis.ucrop.R.id.image_view_logo)).setColorFilter(this.mLogoColor, android.graphics.PorterDuff.Mode.SRC_ATOP);
        view.findViewById(com.yalantis.ucrop.R.id.ucrop_frame).setBackgroundColor(this.mRootViewBackgroundColor);
    }

    private void setupStatesWrapper(android.view.View view) {
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.yalantis.ucrop.R.id.image_view_state_scale);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.yalantis.ucrop.R.id.image_view_state_rotate);
        android.widget.ImageView imageView3 = (android.widget.ImageView) view.findViewById(com.yalantis.ucrop.R.id.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new com.yalantis.ucrop.util.SelectedStateListDrawable(imageView.getDrawable(), this.mActiveControlsWidgetColor));
        imageView2.setImageDrawable(new com.yalantis.ucrop.util.SelectedStateListDrawable(imageView2.getDrawable(), this.mActiveControlsWidgetColor));
        imageView3.setImageDrawable(new com.yalantis.ucrop.util.SelectedStateListDrawable(imageView3.getDrawable(), this.mActiveControlsWidgetColor));
    }

    private void setupAspectRatioWidget(android.os.Bundle bundle, android.view.View view) {
        int i = bundle.getInt(com.yalantis.ucrop.UCrop.Options.EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, 0);
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(com.yalantis.ucrop.UCrop.Options.EXTRA_ASPECT_RATIO_OPTIONS);
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            i = 2;
            parcelableArrayList = new java.util.ArrayList();
            parcelableArrayList.add(new com.yalantis.ucrop.model.AspectRatio(null, 1.0f, 1.0f));
            parcelableArrayList.add(new com.yalantis.ucrop.model.AspectRatio(null, 3.0f, 4.0f));
            parcelableArrayList.add(new com.yalantis.ucrop.model.AspectRatio(getString(com.yalantis.ucrop.R.string.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayList.add(new com.yalantis.ucrop.model.AspectRatio(null, 3.0f, 2.0f));
            parcelableArrayList.add(new com.yalantis.ucrop.model.AspectRatio(null, 16.0f, 9.0f));
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.yalantis.ucrop.R.id.layout_aspect_ratio);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        java.util.Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            com.yalantis.ucrop.model.AspectRatio aspectRatio = (com.yalantis.ucrop.model.AspectRatio) it.next();
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) getLayoutInflater().inflate(com.yalantis.ucrop.R.layout.ucrop_aspect_ratio, (android.view.ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            com.yalantis.ucrop.view.widget.AspectRatioTextView aspectRatioTextView = (com.yalantis.ucrop.view.widget.AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.mActiveControlsWidgetColor);
            aspectRatioTextView.setAspectRatio(aspectRatio);
            linearLayout.addView(frameLayout);
            this.mCropAspectRatioViews.add(frameLayout);
        }
        this.mCropAspectRatioViews.get(i).setSelected(true);
        java.util.Iterator<android.view.ViewGroup> it2 = this.mCropAspectRatioViews.iterator();
        while (it2.hasNext()) {
            it2.next().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.yalantis.ucrop.UCropFragment.2
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view2) {
                    com.yalantis.ucrop.UCropFragment.this.mGestureCropImageView.setTargetAspectRatio(((com.yalantis.ucrop.view.widget.AspectRatioTextView) ((android.view.ViewGroup) view2).getChildAt(0)).getAspectRatio(view2.isSelected()));
                    com.yalantis.ucrop.UCropFragment.this.mGestureCropImageView.setImageToWrapCropBounds();
                    if (view2.isSelected()) {
                        return;
                    }
                    for (android.view.ViewGroup viewGroup : com.yalantis.ucrop.UCropFragment.this.mCropAspectRatioViews) {
                        viewGroup.setSelected(viewGroup == view2);
                    }
                }
            });
        }
    }

    private void setupRotateWidget(android.view.View view) {
        this.mTextViewRotateAngle = (android.widget.TextView) view.findViewById(com.yalantis.ucrop.R.id.text_view_rotate);
        ((com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) view.findViewById(com.yalantis.ucrop.R.id.rotate_scroll_wheel)).setScrollingListener(new com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener() { // from class: com.yalantis.ucrop.UCropFragment.3
            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScroll(float f, float f2) {
                com.yalantis.ucrop.UCropFragment.this.mGestureCropImageView.postRotate(f / 42.0f);
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollEnd() {
                com.yalantis.ucrop.UCropFragment.this.mGestureCropImageView.setImageToWrapCropBounds();
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollStart() {
                com.yalantis.ucrop.UCropFragment.this.mGestureCropImageView.cancelAllAnimations();
            }
        });
        ((com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) view.findViewById(com.yalantis.ucrop.R.id.rotate_scroll_wheel)).setMiddleLineColor(this.mActiveControlsWidgetColor);
        view.findViewById(com.yalantis.ucrop.R.id.wrapper_reset_rotate).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.yalantis.ucrop.UCropFragment.4
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                com.yalantis.ucrop.UCropFragment.this.resetRotation();
            }
        });
        view.findViewById(com.yalantis.ucrop.R.id.wrapper_rotate_by_angle).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.yalantis.ucrop.UCropFragment.5
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                com.yalantis.ucrop.UCropFragment.this.rotateByAngle(90);
            }
        });
        setAngleTextColor(this.mActiveControlsWidgetColor);
    }

    private void setupScaleWidget(android.view.View view) {
        this.mTextViewScalePercent = (android.widget.TextView) view.findViewById(com.yalantis.ucrop.R.id.text_view_scale);
        ((com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) view.findViewById(com.yalantis.ucrop.R.id.scale_scroll_wheel)).setScrollingListener(new com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener() { // from class: com.yalantis.ucrop.UCropFragment.6
            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScroll(float f, float f2) {
                if (f > 0.0f) {
                    com.yalantis.ucrop.UCropFragment.this.mGestureCropImageView.zoomInImage(com.yalantis.ucrop.UCropFragment.this.mGestureCropImageView.getCurrentScale() + (f * ((com.yalantis.ucrop.UCropFragment.this.mGestureCropImageView.getMaxScale() - com.yalantis.ucrop.UCropFragment.this.mGestureCropImageView.getMinScale()) / 15000.0f)));
                } else {
                    com.yalantis.ucrop.UCropFragment.this.mGestureCropImageView.zoomOutImage(com.yalantis.ucrop.UCropFragment.this.mGestureCropImageView.getCurrentScale() + (f * ((com.yalantis.ucrop.UCropFragment.this.mGestureCropImageView.getMaxScale() - com.yalantis.ucrop.UCropFragment.this.mGestureCropImageView.getMinScale()) / 15000.0f)));
                }
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollEnd() {
                com.yalantis.ucrop.UCropFragment.this.mGestureCropImageView.setImageToWrapCropBounds();
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollStart() {
                com.yalantis.ucrop.UCropFragment.this.mGestureCropImageView.cancelAllAnimations();
            }
        });
        ((com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) view.findViewById(com.yalantis.ucrop.R.id.scale_scroll_wheel)).setMiddleLineColor(this.mActiveControlsWidgetColor);
        setScaleTextColor(this.mActiveControlsWidgetColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAngleText(float f) {
        android.widget.TextView textView = this.mTextViewRotateAngle;
        if (textView != null) {
            textView.setText(java.lang.String.format(java.util.Locale.getDefault(), "%.1f°", java.lang.Float.valueOf(f)));
        }
    }

    private void setAngleTextColor(int i) {
        android.widget.TextView textView = this.mTextViewRotateAngle;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScaleText(float f) {
        android.widget.TextView textView = this.mTextViewScalePercent;
        if (textView != null) {
            textView.setText(java.lang.String.format(java.util.Locale.getDefault(), "%d%%", java.lang.Integer.valueOf((int) (f * 100.0f))));
        }
    }

    private void setScaleTextColor(int i) {
        android.widget.TextView textView = this.mTextViewScalePercent;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetRotation() {
        com.yalantis.ucrop.view.GestureCropImageView gestureCropImageView = this.mGestureCropImageView;
        gestureCropImageView.postRotate(-gestureCropImageView.getCurrentAngle());
        this.mGestureCropImageView.setImageToWrapCropBounds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rotateByAngle(int i) {
        this.mGestureCropImageView.postRotate(i);
        this.mGestureCropImageView.setImageToWrapCropBounds();
    }

    private void setInitialState() {
        if (this.mShowBottomControls) {
            if (this.mWrapperStateAspectRatio.getVisibility() == 0) {
                setWidgetState(com.yalantis.ucrop.R.id.state_aspect_ratio);
                return;
            } else {
                setWidgetState(com.yalantis.ucrop.R.id.state_scale);
                return;
            }
        }
        setAllowedGestures(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidgetState(int i) {
        if (this.mShowBottomControls) {
            this.mWrapperStateAspectRatio.setSelected(i == com.yalantis.ucrop.R.id.state_aspect_ratio);
            this.mWrapperStateRotate.setSelected(i == com.yalantis.ucrop.R.id.state_rotate);
            this.mWrapperStateScale.setSelected(i == com.yalantis.ucrop.R.id.state_scale);
            this.mLayoutAspectRatio.setVisibility(i == com.yalantis.ucrop.R.id.state_aspect_ratio ? 0 : 8);
            this.mLayoutRotate.setVisibility(i == com.yalantis.ucrop.R.id.state_rotate ? 0 : 8);
            this.mLayoutScale.setVisibility(i == com.yalantis.ucrop.R.id.state_scale ? 0 : 8);
            changeSelectedTab(i);
            if (i == com.yalantis.ucrop.R.id.state_scale) {
                setAllowedGestures(0);
            } else if (i == com.yalantis.ucrop.R.id.state_rotate) {
                setAllowedGestures(1);
            } else {
                setAllowedGestures(2);
            }
        }
    }

    private void changeSelectedTab(int i) {
        if (getView() != null) {
            androidx.transition.TransitionManager.beginDelayedTransition((android.view.ViewGroup) getView().findViewById(com.yalantis.ucrop.R.id.ucrop_photobox), this.mControlsTransition);
        }
        this.mWrapperStateScale.findViewById(com.yalantis.ucrop.R.id.text_view_scale).setVisibility(i == com.yalantis.ucrop.R.id.state_scale ? 0 : 8);
        this.mWrapperStateAspectRatio.findViewById(com.yalantis.ucrop.R.id.text_view_crop).setVisibility(i == com.yalantis.ucrop.R.id.state_aspect_ratio ? 0 : 8);
        this.mWrapperStateRotate.findViewById(com.yalantis.ucrop.R.id.text_view_rotate).setVisibility(i != com.yalantis.ucrop.R.id.state_rotate ? 8 : 0);
    }

    private void setAllowedGestures(int i) {
        com.yalantis.ucrop.view.GestureCropImageView gestureCropImageView = this.mGestureCropImageView;
        int[] iArr = this.mAllowedGestures;
        gestureCropImageView.setScaleEnabled(iArr[i] == 3 || iArr[i] == 1);
        com.yalantis.ucrop.view.GestureCropImageView gestureCropImageView2 = this.mGestureCropImageView;
        int[] iArr2 = this.mAllowedGestures;
        gestureCropImageView2.setRotateEnabled(iArr2[i] == 3 || iArr2[i] == 2);
        this.mGestureCropImageView.setGestureEnabled(getArguments().getBoolean(com.yalantis.ucrop.UCrop.Options.EXTRA_DRAG_IMAGES, true));
    }

    private void addBlockingView(android.view.View view) {
        if (this.mBlockingView == null) {
            this.mBlockingView = new android.view.View(getContext());
            this.mBlockingView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
            this.mBlockingView.setClickable(true);
        }
        ((android.widget.RelativeLayout) view.findViewById(com.yalantis.ucrop.R.id.ucrop_photobox)).addView(this.mBlockingView);
    }

    public void cropAndSaveImage() {
        this.mBlockingView.setClickable(true);
        this.callback.loadingProgress(true);
        this.mGestureCropImageView.cropAndSaveImage(this.mCompressFormat, this.mCompressQuality, new com.yalantis.ucrop.callback.BitmapCropCallback() { // from class: com.yalantis.ucrop.UCropFragment.8
            @Override // com.yalantis.ucrop.callback.BitmapCropCallback
            public void onBitmapCropped(android.net.Uri uri, int i, int i2, int i3, int i4) {
                com.yalantis.ucrop.UCropFragmentCallback uCropFragmentCallback = com.yalantis.ucrop.UCropFragment.this.callback;
                com.yalantis.ucrop.UCropFragment uCropFragment = com.yalantis.ucrop.UCropFragment.this;
                uCropFragmentCallback.onCropFinish(uCropFragment.getResult(uri, uCropFragment.mGestureCropImageView.getTargetAspectRatio(), i, i2, i3, i4));
                com.yalantis.ucrop.UCropFragment.this.callback.loadingProgress(false);
            }

            @Override // com.yalantis.ucrop.callback.BitmapCropCallback
            public void onCropFailure(java.lang.Throwable th) {
                com.yalantis.ucrop.UCropFragment.this.callback.onCropFinish(com.yalantis.ucrop.UCropFragment.this.getError(th));
            }
        });
    }

    protected com.yalantis.ucrop.UCropFragment.UCropResult getResult(android.net.Uri uri, float f, int i, int i2, int i3, int i4) {
        return new com.yalantis.ucrop.UCropFragment.UCropResult(-1, new android.content.Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f).putExtra("com.yalantis.ucrop.ImageWidth", i3).putExtra("com.yalantis.ucrop.ImageHeight", i4).putExtra("com.yalantis.ucrop.OffsetX", i).putExtra("com.yalantis.ucrop.OffsetY", i2).putExtra(com.yalantis.ucrop.UCrop.EXTRA_CROP_INPUT_ORIGINAL, com.yalantis.ucrop.util.FileUtils.getInputPath((android.net.Uri) getArguments().getParcelable(com.yalantis.ucrop.UCrop.EXTRA_INPUT_URI))));
    }

    protected com.yalantis.ucrop.UCropFragment.UCropResult getError(java.lang.Throwable th) {
        return new com.yalantis.ucrop.UCropFragment.UCropResult(96, new android.content.Intent().putExtra("com.yalantis.ucrop.Error", th));
    }

    public static class UCropResult {
        public int mResultCode;
        public android.content.Intent mResultData;

        public UCropResult(int i, android.content.Intent intent) {
            this.mResultCode = i;
            this.mResultData = intent;
        }
    }
}
