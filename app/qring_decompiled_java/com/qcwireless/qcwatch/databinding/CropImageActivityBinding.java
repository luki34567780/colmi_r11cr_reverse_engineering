package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class CropImageActivityBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView cropImageView;
    private final com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView rootView;

    private CropImageActivityBinding(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView rootView, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView cropImageView) {
        this.rootView = rootView;
        this.cropImageView = cropImageView;
    }

    public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.CropImageActivityBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.CropImageActivityBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.crop_image_activity, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.CropImageActivityBinding bind(android.view.View rootView) {
        java.util.Objects.requireNonNull(rootView, "rootView");
        com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView cropImageView = (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView) rootView;
        return new com.qcwireless.qcwatch.databinding.CropImageActivityBinding(cropImageView, cropImageView);
    }
}
