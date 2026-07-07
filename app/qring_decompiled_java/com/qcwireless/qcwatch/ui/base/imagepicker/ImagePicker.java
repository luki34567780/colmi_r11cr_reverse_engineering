package com.qcwireless.qcwatch.ui.base.imagepicker;

/* loaded from: /tmp/dex/classes2.dex */
public class ImagePicker {
    private static final java.lang.String TAG = "ImagePicker";
    private com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback callback;
    private android.net.Uri cropImageUri;
    private boolean isCropImage = true;
    private android.net.Uri pickImageUri;
    private java.lang.CharSequence title;

    public void setCropImage(boolean cropImage) {
        this.isCropImage = cropImage;
    }

    public void setTitle(java.lang.CharSequence title) {
        this.title = title;
    }

    public void startChooser(android.app.Activity activity, com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback callback) {
        this.callback = callback;
        if (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.isExplicitCameraPermissionRequired(activity)) {
            androidx.core.app.ActivityCompat.requestPermissions(activity, new java.lang.String[]{com.hjq.permissions.Permission.CAMERA}, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.CAMERA_CAPTURE_PERMISSIONS_REQUEST_CODE);
        } else {
            activity.startActivityForResult(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.getPickImageChooserIntent(activity, getTitle(activity), false), 200);
        }
    }

    public void startChooser(androidx.fragment.app.Fragment fragment, com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback callback) {
        this.callback = callback;
        if (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.isExplicitCameraPermissionRequired(fragment.getActivity())) {
            fragment.requestPermissions(new java.lang.String[]{com.hjq.permissions.Permission.CAMERA}, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.CAMERA_CAPTURE_PERMISSIONS_REQUEST_CODE);
        } else {
            fragment.startActivityForResult(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.getPickImageChooserIntent(fragment.getActivity(), getTitle(fragment.getActivity()), false), 200);
        }
    }

    public void startCamera(android.app.Activity activity, com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback callback) {
        this.callback = callback;
        if (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.isExplicitCameraPermissionRequired(activity)) {
            androidx.core.app.ActivityCompat.requestPermissions(activity, new java.lang.String[]{com.hjq.permissions.Permission.CAMERA}, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.CAMERA_CAPTURE_PERMISSIONS_REQUEST_CODE);
        } else {
            activity.startActivityForResult(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.getCameraIntent(activity, null), 200);
        }
    }

    public void startCamera(androidx.fragment.app.Fragment fragment, com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback callback) {
        this.callback = callback;
        if (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.isExplicitCameraPermissionRequired(fragment.getActivity())) {
            fragment.requestPermissions(new java.lang.String[]{com.hjq.permissions.Permission.CAMERA}, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.CAMERA_CAPTURE_PERMISSIONS_REQUEST_CODE);
        } else {
            fragment.startActivityForResult(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.getCameraIntent(fragment.getActivity(), null), 200);
        }
    }

    public void startGallery(android.app.Activity activity, com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback callback) {
        this.callback = callback;
        activity.startActivityForResult(getGalleryIntent(activity, false), 200);
    }

    public void startGallery(androidx.fragment.app.Fragment fragment, com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback callback) {
        this.callback = callback;
        android.content.Intent intent = new android.content.Intent("android.intent.action.PICK");
        intent.setType(com.luck.picture.lib.config.SelectMimeType.SYSTEM_IMAGE);
        fragment.startActivityForResult(intent, 200);
    }

    protected java.lang.CharSequence getTitle(android.content.Context context) {
        if (android.text.TextUtils.isEmpty(this.title)) {
            return context.getString(com.qcwireless.qcwatch.R.string.pick_image_intent_chooser_title);
        }
        return this.title;
    }

    protected android.content.Intent getGalleryIntent(android.content.Context context, boolean includeDocuments) {
        android.content.Intent intent;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.util.List<android.content.Intent> galleryIntents = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.getGalleryIntents(packageManager, "android.intent.action.GET_CONTENT", includeDocuments);
        if (galleryIntents.size() == 0) {
            galleryIntents = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.getGalleryIntents(packageManager, "android.intent.action.PICK", includeDocuments);
        }
        if (galleryIntents.isEmpty()) {
            intent = new android.content.Intent();
        } else {
            intent = galleryIntents.get(galleryIntents.size() - 1);
            galleryIntents.remove(galleryIntents.size() - 1);
        }
        android.content.Intent createChooser = android.content.Intent.createChooser(intent, getTitle(context));
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (android.os.Parcelable[]) galleryIntents.toArray(new android.os.Parcelable[galleryIntents.size()]));
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, createChooser);
        return createChooser;
    }

    public void onActivityResult(android.app.Activity activity, int requestCode, int resultCode, android.content.Intent data) {
        onActivityResultInner(activity, null, requestCode, resultCode, data);
    }

    public void onActivityResult(androidx.fragment.app.Fragment fragment, int requestCode, int resultCode, android.content.Intent data) {
        onActivityResultInner(null, fragment, requestCode, resultCode, data);
    }

    private void onActivityResultInner(android.app.Activity activity, androidx.fragment.app.Fragment fragment, int requestCode, int resultCode, android.content.Intent data) {
        if (resultCode == -1) {
            android.app.Activity activity2 = activity != null ? activity : fragment.getActivity();
            if (requestCode != 200) {
                if (requestCode == 203) {
                    handleCropResult(activity2, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.getActivityResult(data));
                    return;
                }
                return;
            }
            android.net.Uri pickImageResultUri = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.getPickImageResultUri(activity2, data);
            this.pickImageUri = pickImageResultUri;
            if (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.isReadExternalStoragePermissionsRequired(activity2, pickImageResultUri)) {
                if (activity != null) {
                    androidx.core.app.ActivityCompat.requestPermissions(activity, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.PICK_IMAGE_PERMISSIONS_REQUEST_CODE);
                    return;
                } else {
                    fragment.requestPermissions(new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.PICK_IMAGE_PERMISSIONS_REQUEST_CODE);
                    return;
                }
            }
            if (activity != null) {
                handlePickImage(activity, this.pickImageUri);
            } else {
                handlePickImage(fragment, this.pickImageUri);
            }
        }
    }

    private static java.lang.String getRealPathFromUri(android.content.Context context, android.net.Uri contentUri) {
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = context.getContentResolver().query(contentUri, new java.lang.String[]{"_data"}, null, null, null);
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
                cursor.moveToFirst();
                return cursor.getString(columnIndexOrThrow);
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void onRequestPermissionsResult(android.app.Activity activity, int requestCode, java.lang.String[] permissions, int[] grantResults) {
        onRequestPermissionsResultInner(activity, null, requestCode, permissions, grantResults);
    }

    public void onRequestPermissionsResult(androidx.fragment.app.Fragment fragment, int requestCode, java.lang.String[] permissions, int[] grantResults) {
        onRequestPermissionsResultInner(null, fragment, requestCode, permissions, grantResults);
    }

    private void onRequestPermissionsResultInner(android.app.Activity activity, androidx.fragment.app.Fragment fragment, int requestCode, java.lang.String[] permissions, int[] grantResults) {
        if (requestCode == 2011) {
            if (grantResults.length <= 0 || grantResults[0] != 0) {
                com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback callback = this.callback;
                if (callback != null) {
                    callback.onPermissionDenied(requestCode, permissions, grantResults);
                }
            } else if (activity != null) {
                com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.startPickImageActivity(activity);
            } else {
                com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.startPickImageActivity(fragment);
            }
        }
        if (requestCode == 201) {
            android.net.Uri uri = this.cropImageUri;
            if (uri == null || grantResults.length <= 0 || grantResults[0] != 0) {
                com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback callback2 = this.callback;
                if (callback2 != null) {
                    callback2.onPermissionDenied(requestCode, permissions, grantResults);
                    return;
                }
                return;
            }
            if (activity != null) {
                handlePickImage(activity, uri);
            } else {
                handlePickImage(fragment, uri);
            }
        }
    }

    private void handleCropResult(android.content.Context context, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropResult result) {
        if (result.getError() == null) {
            android.net.Uri uri = result.getUri();
            this.cropImageUri = uri;
            com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker.Callback callback = this.callback;
            if (callback != null) {
                callback.onCropImage(handleUri(context, uri));
                return;
            }
            return;
        }
        android.util.Log.e(TAG, "handleCropResult error", result.getError());
    }

    private void handlePickImage(android.app.Activity activity, android.net.Uri imageUri) {
        handlePickImageInner(activity, null, imageUri);
    }

    private void handlePickImage(androidx.fragment.app.Fragment fragment, android.net.Uri imageUri) {
        handlePickImageInner(null, fragment, imageUri);
    }

    private void handlePickImageInner(android.app.Activity activity, androidx.fragment.app.Fragment fragment, android.net.Uri imageUri) {
        if (this.callback != null) {
            this.callback.onPickImage(handleUri(activity != null ? activity : fragment.getContext(), imageUri));
        }
        if (this.isCropImage) {
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder activity2 = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.activity(imageUri);
            this.callback.cropConfig(activity2);
            if (activity != null) {
                activity2.start(activity);
            } else {
                activity2.start((android.content.Context) fragment.getActivity(), fragment);
            }
        }
    }

    private android.net.Uri handleUri(android.content.Context context, android.net.Uri imageUri) {
        if ("content".equals(imageUri.getScheme())) {
            java.lang.String realPathFromUri = getRealPathFromUri(context, imageUri);
            if (!android.text.TextUtils.isEmpty(realPathFromUri)) {
                return android.net.Uri.fromFile(new java.io.File(realPathFromUri));
            }
        }
        return imageUri;
    }

    public static abstract class Callback {
        public void onCropImage(android.net.Uri imageUri) {
        }

        public void onPermissionDenied(int requestCode, java.lang.String[] permissions, int[] grantResults) {
        }

        public abstract void onPickImage(android.net.Uri imageUri);

        public void cropConfig(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityBuilder builder) {
            builder.setMultiTouchEnabled(false).setCropShape(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape.OVAL).setRequestedSize(com.king.zxing.util.CodeUtils.DEFAULT_REQ_HEIGHT, com.king.zxing.util.CodeUtils.DEFAULT_REQ_HEIGHT).setAspectRatio(5, 5);
        }
    }
}
