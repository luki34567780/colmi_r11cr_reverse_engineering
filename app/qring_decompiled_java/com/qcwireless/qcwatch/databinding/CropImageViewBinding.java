package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class CropImageViewBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView CropOverlayView;
    public final android.widget.ProgressBar CropProgressBar;
    public final android.widget.ImageView ImageViewImage;
    private final android.view.View rootView;

    private CropImageViewBinding(android.view.View rootView, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView CropOverlayView, android.widget.ProgressBar CropProgressBar, android.widget.ImageView ImageViewImage) {
        this.rootView = rootView;
        this.CropOverlayView = CropOverlayView;
        this.CropProgressBar = CropProgressBar;
        this.ImageViewImage = ImageViewImage;
    }

    public android.view.View getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.CropImageViewBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent) {
        java.util.Objects.requireNonNull(parent, "parent");
        inflater.inflate(com.qcwireless.qcwatch.R.layout.crop_image_view, parent);
        return bind(parent);
    }

    public static com.qcwireless.qcwatch.databinding.CropImageViewBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.CropOverlayView;
        com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView cropOverlayView = (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.CropOverlayView);
        if (cropOverlayView != null) {
            i = com.qcwireless.qcwatch.R.id.CropProgressBar;
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.CropProgressBar);
            if (progressBar != null) {
                i = com.qcwireless.qcwatch.R.id.ImageView_image;
                android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.ImageView_image);
                if (imageView != null) {
                    return new com.qcwireless.qcwatch.databinding.CropImageViewBinding(rootView, cropOverlayView, progressBar, imageView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
