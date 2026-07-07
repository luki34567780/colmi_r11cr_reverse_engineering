package com.qcwireless.qcwatch.ui.base.imagepicker.cropper;

/* loaded from: /tmp/dex/classes2.dex */
public final class CropImage {
    public static final int CAMERA_CAPTURE_PERMISSIONS_REQUEST_CODE = 2011;
    public static final int CROP_IMAGE_ACTIVITY_REQUEST_CODE = 203;
    public static final int CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE = 204;
    public static final java.lang.String CROP_IMAGE_EXTRA_OPTIONS = "CROP_IMAGE_EXTRA_OPTIONS";
    public static final java.lang.String CROP_IMAGE_EXTRA_RESULT = "CROP_IMAGE_EXTRA_RESULT";
    public static final java.lang.String CROP_IMAGE_EXTRA_SOURCE = "CROP_IMAGE_EXTRA_SOURCE";
    public static final int PICK_IMAGE_CHOOSER_REQUEST_CODE = 200;
    public static final int PICK_IMAGE_PERMISSIONS_REQUEST_CODE = 201;

    private CropImage() {
    }

    public static android.graphics.Bitmap toOvalBitmap(android.graphics.Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawOval(new android.graphics.RectF(0.0f, 0.0f, width, height), paint);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        bitmap.recycle();
        return createBitmap;
    }

    public static void startPickImageActivity(android.app.Activity activity) {
        activity.startActivityForResult(getPickImageChooserIntent(activity), 200);
    }

    public static void startPickImageActivity(androidx.fragment.app.Fragment fragment) {
        fragment.startActivityForResult(getPickImageChooserIntent(fragment.getActivity()), 200);
    }

    public static android.content.Intent getPickImageChooserIntent(android.content.Context context) {
        return getPickImageChooserIntent(context, context.getString(com.qcwireless.qcwatch.R.string.pick_image_intent_chooser_title), false);
    }

    public static android.content.Intent getPickImageChooserIntent(android.content.Context context, java.lang.CharSequence title, boolean includeDocuments) {
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (!isExplicitCameraPermissionRequired(context)) {
            arrayList.addAll(getCameraIntents(context, packageManager));
        }
        java.util.List<android.content.Intent> galleryIntents = getGalleryIntents(packageManager, "android.intent.action.GET_CONTENT", includeDocuments);
        if (galleryIntents.size() == 0) {
            galleryIntents = getGalleryIntents(packageManager, "android.intent.action.PICK", includeDocuments);
        }
        arrayList.addAll(galleryIntents);
        if (arrayList.isEmpty()) {
            intent = new android.content.Intent();
        } else {
            intent = (android.content.Intent) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
        }
        android.content.Intent createChooser = android.content.Intent.createChooser(intent, title);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (android.os.Parcelable[]) arrayList.toArray(new android.os.Parcelable[arrayList.size()]));
        return createChooser;
    }

    public static android.content.Intent getCameraIntent(android.content.Context context, android.net.Uri outputFileUri) {
        android.content.Intent intent = new android.content.Intent("android.media.action.IMAGE_CAPTURE");
        if (outputFileUri == null) {
            outputFileUri = getCaptureImageOutputUri(context);
        }
        intent.putExtra("output", com.qcwireless.qcwatch.ui.base.imagepicker.Utils.getIntentUri(context, outputFileUri));
        return intent;
    }

    public static java.util.List<android.content.Intent> getCameraIntents(android.content.Context context, android.content.pm.PackageManager packageManager) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.net.Uri captureImageOutputUri = getCaptureImageOutputUri(context);
        android.content.Intent intent = new android.content.Intent("android.media.action.IMAGE_CAPTURE");
        for (android.content.pm.ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            android.content.Intent intent2 = new android.content.Intent(intent);
            intent2.setComponent(new android.content.ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (captureImageOutputUri != null) {
                intent2.putExtra("output", com.qcwireless.qcwatch.ui.base.imagepicker.Utils.getIntentUri(context, captureImageOutputUri));
            }
            arrayList.add(intent2);
        }
        return arrayList;
    }

    public static java.util.List<android.content.Intent> getGalleryIntents(android.content.pm.PackageManager packageManager, java.lang.String action, boolean includeDocuments) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent("android.intent.action.PICK", (android.net.Uri) null);
        intent.setDataAndType(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, com.luck.picture.lib.config.SelectMimeType.SYSTEM_IMAGE);
        arrayList.add(intent);
        return arrayList;
    }

    public static boolean isExplicitCameraPermissionRequired(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 23 && hasPermissionInManifest(context, com.hjq.permissions.Permission.CAMERA) && context.checkSelfPermission(com.hjq.permissions.Permission.CAMERA) != 0;
    }

    public static boolean hasPermissionInManifest(android.content.Context context, java.lang.String permissionName) {
        try {
            java.lang.String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), com.liulishuo.okdownload.DownloadTask.Builder.DEFAULT_READ_BUFFER_SIZE).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                for (java.lang.String str : strArr) {
                    if (str.equalsIgnoreCase(permissionName)) {
                        return true;
                    }
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static android.net.Uri getCaptureImageOutputUri(android.content.Context context) {
        java.io.File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            return android.net.Uri.fromFile(new java.io.File(externalCacheDir.getPath(), "pickImageResult.jpeg"));
        }
        return null;
    }

    public static android.net.Uri getPickImageResultUri(android.content.Context context, android.content.Intent data) {
        java.lang.String action;
        boolean z = true;
        if (data != null && data.getData() != null && ((action = data.getAction()) == null || !action.equals("android.media.action.IMAGE_CAPTURE"))) {
            z = false;
        }
        return (z || data.getData() == null) ? getCaptureImageOutputUri(context) : data.getData();
    }

    public static boolean isReadExternalStoragePermissionsRequired(android.content.Context context, android.net.Uri uri) {
        return android.os.Build.VERSION.SDK_INT >= 23 && context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0 && isUriRequiresPermissions(context, uri);
    }

    public static boolean isUriRequiresPermissions(android.content.Context context, android.net.Uri uri) {
        try {
            context.getContentResolver().openInputStream(uri).close();
            return false;
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    public static com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder activity(android.net.Uri uri) {
        return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder(uri);
    }

    public static com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityResult getActivityResult(android.content.Intent data) {
        if (data != null) {
            return (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityResult) data.getParcelableExtra(CROP_IMAGE_EXTRA_RESULT);
        }
        return null;
    }

    public static final class ActivityBuilder {
        private final com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageOptions mOptions;
        private final android.net.Uri mSource;

        private ActivityBuilder(android.net.Uri source) {
            this.mSource = source;
            this.mOptions = new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageOptions();
        }

        public android.content.Intent getIntent(android.content.Context context) {
            return getIntent(context, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageActivity.class);
        }

        public android.content.Intent getIntent(android.content.Context context, java.lang.Class<?> cls) {
            this.mOptions.validate();
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, cls);
            intent.putExtra(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.CROP_IMAGE_EXTRA_SOURCE, this.mSource);
            intent.putExtra(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.CROP_IMAGE_EXTRA_OPTIONS, this.mOptions);
            return intent;
        }

        public void start(android.app.Activity activity) {
            this.mOptions.validate();
            activity.startActivityForResult(getIntent(activity), com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE);
        }

        public void start(android.app.Activity activity, java.lang.Class<?> cls) {
            this.mOptions.validate();
            activity.startActivityForResult(getIntent(activity, cls), com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE);
        }

        public void start(android.content.Context context, androidx.fragment.app.Fragment fragment) {
            fragment.startActivityForResult(getIntent(context), com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE);
        }

        public void start(android.content.Context context, androidx.fragment.app.Fragment fragment, java.lang.Class<?> cls) {
            fragment.startActivityForResult(getIntent(context, cls), com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE);
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setCropShape(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape cropShape) {
            this.mOptions.cropShape = cropShape;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setSnapRadius(float snapRadius) {
            this.mOptions.snapRadius = snapRadius;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setTouchRadius(float touchRadius) {
            this.mOptions.touchRadius = touchRadius;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setGuidelines(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.Guidelines guidelines) {
            this.mOptions.guidelines = guidelines;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setScaleType(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.ScaleType scaleType) {
            this.mOptions.scaleType = scaleType;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setShowCropOverlay(boolean showCropOverlay) {
            this.mOptions.showCropOverlay = showCropOverlay;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setAutoZoomEnabled(boolean autoZoomEnabled) {
            this.mOptions.autoZoomEnabled = autoZoomEnabled;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setMultiTouchEnabled(boolean multiTouchEnabled) {
            this.mOptions.multiTouchEnabled = multiTouchEnabled;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setMaxZoom(int maxZoom) {
            this.mOptions.maxZoom = maxZoom;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setInitialCropWindowPaddingRatio(float initialCropWindowPaddingRatio) {
            this.mOptions.initialCropWindowPaddingRatio = initialCropWindowPaddingRatio;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setFixAspectRatio(boolean fixAspectRatio) {
            this.mOptions.fixAspectRatio = fixAspectRatio;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setAspectRatio(int aspectRatioX, int aspectRatioY) {
            this.mOptions.aspectRatioX = aspectRatioX;
            this.mOptions.aspectRatioY = aspectRatioY;
            this.mOptions.fixAspectRatio = true;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setBorderLineThickness(float borderLineThickness) {
            this.mOptions.borderLineThickness = borderLineThickness;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setBorderLineColor(int borderLineColor) {
            this.mOptions.borderLineColor = borderLineColor;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setBorderCornerThickness(float borderCornerThickness) {
            this.mOptions.borderCornerThickness = borderCornerThickness;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setBorderCornerOffset(float borderCornerOffset) {
            this.mOptions.borderCornerOffset = borderCornerOffset;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setBorderCornerLength(float borderCornerLength) {
            this.mOptions.borderCornerLength = borderCornerLength;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setBorderCornerColor(int borderCornerColor) {
            this.mOptions.borderCornerColor = borderCornerColor;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setGuidelinesThickness(float guidelinesThickness) {
            this.mOptions.guidelinesThickness = guidelinesThickness;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setGuidelinesColor(int guidelinesColor) {
            this.mOptions.guidelinesColor = guidelinesColor;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setBackgroundColor(int backgroundColor) {
            this.mOptions.backgroundColor = backgroundColor;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setMinCropWindowSize(int minCropWindowWidth, int minCropWindowHeight) {
            this.mOptions.minCropWindowWidth = minCropWindowWidth;
            this.mOptions.minCropWindowHeight = minCropWindowHeight;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setMinCropResultSize(int minCropResultWidth, int minCropResultHeight) {
            this.mOptions.minCropResultWidth = minCropResultWidth;
            this.mOptions.minCropResultHeight = minCropResultHeight;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setMaxCropResultSize(int maxCropResultWidth, int maxCropResultHeight) {
            this.mOptions.maxCropResultWidth = maxCropResultWidth;
            this.mOptions.maxCropResultHeight = maxCropResultHeight;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setActivityTitle(java.lang.String activityTitle) {
            this.mOptions.activityTitle = activityTitle;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setActivityMenuIconColor(int activityMenuIconColor) {
            this.mOptions.activityMenuIconColor = activityMenuIconColor;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setOutputUri(android.net.Uri outputUri) {
            this.mOptions.outputUri = outputUri;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setOutputCompressFormat(android.graphics.Bitmap.CompressFormat outputCompressFormat) {
            this.mOptions.outputCompressFormat = outputCompressFormat;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setOutputCompressQuality(int outputCompressQuality) {
            this.mOptions.outputCompressQuality = outputCompressQuality;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setRequestedSize(int reqWidth, int reqHeight) {
            return setRequestedSize(reqWidth, reqHeight, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.RESIZE_INSIDE);
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setRequestedSize(int reqWidth, int reqHeight, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions options) {
            this.mOptions.outputRequestWidth = reqWidth;
            this.mOptions.outputRequestHeight = reqHeight;
            this.mOptions.outputRequestSizeOptions = options;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setNoOutputImage(boolean noOutputImage) {
            this.mOptions.noOutputImage = noOutputImage;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setInitialCropWindowRectangle(android.graphics.Rect initialCropWindowRectangle) {
            this.mOptions.initialCropWindowRectangle = initialCropWindowRectangle;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setInitialRotation(int initialRotation) {
            this.mOptions.initialRotation = initialRotation;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setAllowRotation(boolean allowRotation) {
            this.mOptions.allowRotation = allowRotation;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setAllowCounterRotation(boolean allowCounterRotation) {
            this.mOptions.allowCounterRotation = allowCounterRotation;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder setRotationDegrees(int rotationDegrees) {
            this.mOptions.rotationDegrees = rotationDegrees;
            return this;
        }
    }

    public static final class ActivityResult extends com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropResult implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityResult> CREATOR = new android.os.Parcelable.Creator<com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityResult>() { // from class: com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityResult.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityResult createFromParcel(android.os.Parcel in) {
                return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityResult(in);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityResult[] newArray(int size) {
                return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityResult[size];
            }
        };

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public ActivityResult(android.graphics.Bitmap bitmap, android.net.Uri uri, java.lang.Exception error, float[] cropPoints, android.graphics.Rect cropRect, int rotation, int sampleSize) {
            super(bitmap, uri, error, cropPoints, cropRect, rotation, sampleSize);
        }

        protected ActivityResult(android.os.Parcel in) {
            super(null, (android.net.Uri) in.readParcelable(android.net.Uri.class.getClassLoader()), (java.lang.Exception) in.readSerializable(), in.createFloatArray(), (android.graphics.Rect) in.readParcelable(android.graphics.Rect.class.getClassLoader()), in.readInt(), in.readInt());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel dest, int flags) {
            dest.writeParcelable(getUri(), flags);
            dest.writeSerializable(getError());
            dest.writeFloatArray(getCropPoints());
            dest.writeParcelable(getCropRect(), flags);
            dest.writeInt(getRotation());
            dest.writeInt(getSampleSize());
        }
    }
}
