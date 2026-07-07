package com.luck.picture.lib.config;

/* loaded from: /tmp/dex/classes2.dex */
public class Crop {
    public static final java.lang.String EXTRA_ERROR = "com.yalantis.ucrop.Error";
    public static final java.lang.String EXTRA_OUTPUT_CROP_ASPECT_RATIO = "com.yalantis.ucrop.CropAspectRatio";
    public static final java.lang.String EXTRA_OUTPUT_IMAGE_HEIGHT = "com.yalantis.ucrop.ImageHeight";
    public static final java.lang.String EXTRA_OUTPUT_IMAGE_WIDTH = "com.yalantis.ucrop.ImageWidth";
    public static final java.lang.String EXTRA_OUTPUT_OFFSET_X = "com.yalantis.ucrop.OffsetX";
    public static final java.lang.String EXTRA_OUTPUT_OFFSET_Y = "com.yalantis.ucrop.OffsetY";
    private static final java.lang.String EXTRA_PREFIX = "com.yalantis.ucrop";
    public static final int REQUEST_CROP = 69;
    public static final int REQUEST_EDIT_CROP = 696;
    public static final int RESULT_CROP_ERROR = 96;

    public static android.net.Uri getOutput(android.content.Intent intent) {
        android.net.Uri uri = (android.net.Uri) intent.getParcelableExtra("output");
        return uri == null ? (android.net.Uri) intent.getParcelableExtra(com.luck.picture.lib.config.CustomIntentKey.EXTRA_OUTPUT_URI) : uri;
    }

    public static java.lang.String getOutputCustomExtraData(android.content.Intent intent) {
        return intent.getStringExtra(com.luck.picture.lib.config.CustomIntentKey.EXTRA_CUSTOM_EXTRA_DATA);
    }

    public static int getOutputImageWidth(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_OUTPUT_IMAGE_WIDTH, -1);
    }

    public static int getOutputImageHeight(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_OUTPUT_IMAGE_HEIGHT, -1);
    }

    public static float getOutputCropAspectRatio(android.content.Intent intent) {
        return intent.getFloatExtra(EXTRA_OUTPUT_CROP_ASPECT_RATIO, 0.0f);
    }

    public static int getOutputImageOffsetX(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_OUTPUT_OFFSET_X, 0);
    }

    public static int getOutputImageOffsetY(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_OUTPUT_OFFSET_Y, 0);
    }

    public static java.lang.Throwable getError(android.content.Intent intent) {
        return (java.lang.Throwable) intent.getSerializableExtra(EXTRA_ERROR);
    }
}
