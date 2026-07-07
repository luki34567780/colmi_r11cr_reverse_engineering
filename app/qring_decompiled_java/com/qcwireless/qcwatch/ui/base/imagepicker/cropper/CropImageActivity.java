package com.qcwireless.qcwatch.ui.base.imagepicker.cropper;

/* loaded from: /tmp/dex/classes2.dex */
public class CropImageActivity extends androidx.appcompat.app.AppCompatActivity implements com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.OnSetImageUriCompleteListener, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.OnCropImageCompleteListener {
    private android.net.Uri mCropImageUri;
    private com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView mCropImageView;
    private com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageOptions mOptions;

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(android.os.Bundle savedInstanceState) {
        java.lang.String string;
        super.onCreate(savedInstanceState);
        setContentView(com.qcwireless.qcwatch.R.layout.crop_image_activity);
        this.mCropImageView = (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView) findViewById(com.qcwireless.qcwatch.R.id.cropImageView);
        android.content.Intent intent = getIntent();
        this.mCropImageUri = (android.net.Uri) intent.getParcelableExtra(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.CROP_IMAGE_EXTRA_SOURCE);
        this.mOptions = (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageOptions) intent.getParcelableExtra(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.CROP_IMAGE_EXTRA_OPTIONS);
        if (savedInstanceState == null) {
            android.net.Uri uri = this.mCropImageUri;
            if (uri == null || uri.equals(android.net.Uri.EMPTY)) {
                if (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.isExplicitCameraPermissionRequired(this)) {
                    requestPermissions(new java.lang.String[]{com.hjq.permissions.Permission.CAMERA}, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.CAMERA_CAPTURE_PERMISSIONS_REQUEST_CODE);
                } else {
                    com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.startPickImageActivity((android.app.Activity) this);
                }
            } else if (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.isReadExternalStoragePermissionsRequired(this, this.mCropImageUri)) {
                requestPermissions(new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.PICK_IMAGE_PERMISSIONS_REQUEST_CODE);
            } else {
                this.mCropImageView.setImageUriAsync(this.mCropImageUri);
            }
        }
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            if (this.mOptions.activityTitle != null && !this.mOptions.activityTitle.isEmpty()) {
                string = this.mOptions.activityTitle;
            } else {
                string = getResources().getString(com.qcwireless.qcwatch.R.string.crop_image_activity_title);
            }
            supportActionBar.setTitle(string);
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    protected void onStart() {
        super.onStart();
        this.mCropImageView.setOnSetImageUriCompleteListener(this);
        this.mCropImageView.setOnCropImageCompleteListener(this);
    }

    protected void onStop() {
        super.onStop();
        this.mCropImageView.setOnSetImageUriCompleteListener(null);
        this.mCropImageView.setOnCropImageCompleteListener(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(com.qcwireless.qcwatch.R.menu.crop_image_menu, menu);
        if (!this.mOptions.allowRotation) {
            menu.removeItem(com.qcwireless.qcwatch.R.id.crop_image_menu_rotate_left);
            menu.removeItem(com.qcwireless.qcwatch.R.id.crop_image_menu_rotate_right);
        } else if (this.mOptions.allowCounterRotation) {
            menu.findItem(com.qcwireless.qcwatch.R.id.crop_image_menu_rotate_left).setVisible(true);
        }
        android.graphics.drawable.Drawable drawable = null;
        try {
            drawable = androidx.core.content.ContextCompat.getDrawable(this, com.qcwireless.qcwatch.R.drawable.crop_image_menu_crop);
            if (drawable != null) {
                menu.findItem(com.qcwireless.qcwatch.R.id.crop_image_menu_crop).setIcon(drawable);
            }
        } catch (java.lang.Exception unused) {
        }
        if (this.mOptions.activityMenuIconColor != 0) {
            updateMenuItemIconColor(menu, com.qcwireless.qcwatch.R.id.crop_image_menu_rotate_left, this.mOptions.activityMenuIconColor);
            updateMenuItemIconColor(menu, com.qcwireless.qcwatch.R.id.crop_image_menu_rotate_right, this.mOptions.activityMenuIconColor);
            if (drawable != null) {
                updateMenuItemIconColor(menu, com.qcwireless.qcwatch.R.id.crop_image_menu_crop, this.mOptions.activityMenuIconColor);
            }
        }
        return true;
    }

    public boolean onOptionsItemSelected(android.view.MenuItem item) {
        if (item.getItemId() == 2131296504) {
            cropImage();
            return true;
        }
        if (item.getItemId() == 2131296505) {
            rotateImage(-this.mOptions.rotationDegrees);
            return true;
        }
        if (item.getItemId() == 2131296506) {
            rotateImage(this.mOptions.rotationDegrees);
            return true;
        }
        if (item.getItemId() == 16908332) {
            setResultCancel();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResultCancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 200) {
            if (resultCode == 0) {
                setResultCancel();
            }
            if (resultCode == -1) {
                android.net.Uri pickImageResultUri = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.getPickImageResultUri(this, data);
                this.mCropImageUri = pickImageResultUri;
                if (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.isReadExternalStoragePermissionsRequired(this, pickImageResultUri)) {
                    requestPermissions(new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.PICK_IMAGE_PERMISSIONS_REQUEST_CODE);
                } else {
                    this.mCropImageView.setImageUriAsync(this.mCropImageUri);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
        if (requestCode == 201) {
            android.net.Uri uri = this.mCropImageUri;
            if (uri != null && grantResults.length > 0 && grantResults[0] == 0) {
                this.mCropImageView.setImageUriAsync(uri);
            } else {
                android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Cancelling, required permissions are not granted", 1).show();
                setResultCancel();
            }
        }
        if (requestCode == 2011) {
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.startPickImageActivity((android.app.Activity) this);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.OnSetImageUriCompleteListener
    public void onSetImageUriComplete(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView view, android.net.Uri uri, java.lang.Exception error) {
        if (error == null) {
            if (this.mOptions.initialCropWindowRectangle != null) {
                this.mCropImageView.setCropRect(this.mOptions.initialCropWindowRectangle);
            }
            if (this.mOptions.initialRotation > -1) {
                this.mCropImageView.setRotatedDegrees(this.mOptions.initialRotation);
                return;
            }
            return;
        }
        setResult(null, error, 1);
    }

    @Override // com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.OnCropImageCompleteListener
    public void onCropImageComplete(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView view, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropResult result) {
        setResult(result.getUri(), result.getError(), result.getSampleSize());
    }

    protected void cropImage() {
        if (this.mOptions.noOutputImage) {
            setResult(null, null, 1);
        } else {
            this.mCropImageView.saveCroppedImageAsync(getOutputUri(), this.mOptions.outputCompressFormat, this.mOptions.outputCompressQuality, this.mOptions.outputRequestWidth, this.mOptions.outputRequestHeight, this.mOptions.outputRequestSizeOptions);
        }
    }

    protected void rotateImage(int degrees) {
        this.mCropImageView.rotateImage(degrees);
    }

    protected android.net.Uri getOutputUri() {
        java.lang.String str;
        android.net.Uri uri = this.mOptions.outputUri;
        if (!uri.equals(android.net.Uri.EMPTY)) {
            return uri;
        }
        try {
            if (this.mOptions.outputCompressFormat == android.graphics.Bitmap.CompressFormat.JPEG) {
                str = com.luck.picture.lib.config.PictureMimeType.JPG;
            } else {
                str = this.mOptions.outputCompressFormat == android.graphics.Bitmap.CompressFormat.PNG ? com.luck.picture.lib.config.PictureMimeType.PNG : com.luck.picture.lib.config.PictureMimeType.WEBP;
            }
            return android.net.Uri.fromFile(java.io.File.createTempFile("cropped", str, getCacheDir()));
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Failed to create temp file for output image", e);
        }
    }

    protected void setResult(android.net.Uri uri, java.lang.Exception error, int sampleSize) {
        setResult(error == null ? -1 : 204, getResultIntent(uri, error, sampleSize));
        finish();
    }

    protected void setResultCancel() {
        setResult(0);
        finish();
    }

    protected android.content.Intent getResultIntent(android.net.Uri uri, java.lang.Exception error, int sampleSize) {
        com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityResult activityResult = new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.ActivityResult(null, uri, error, this.mCropImageView.getCropPoints(), this.mCropImageView.getCropRect(), this.mCropImageView.getRotatedDegrees(), sampleSize);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.CROP_IMAGE_EXTRA_RESULT, activityResult);
        return intent;
    }

    private void updateMenuItemIconColor(android.view.Menu menu, int itemId, int color) {
        android.graphics.drawable.Drawable icon;
        android.view.MenuItem findItem = menu.findItem(itemId);
        if (findItem == null || (icon = findItem.getIcon()) == null) {
            return;
        }
        try {
            icon.mutate();
            icon.setColorFilter(color, android.graphics.PorterDuff.Mode.SRC_ATOP);
            findItem.setIcon(icon);
        } catch (java.lang.Exception unused) {
        }
    }
}
