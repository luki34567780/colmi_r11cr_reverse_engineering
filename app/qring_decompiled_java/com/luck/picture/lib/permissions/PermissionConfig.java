package com.luck.picture.lib.permissions;

/* loaded from: /tmp/dex/classes2.dex */
public class PermissionConfig {
    public static final java.lang.String READ_EXTERNAL_STORAGE = "android.permission.READ_EXTERNAL_STORAGE";
    public static final java.lang.String READ_MEDIA_AUDIO = "android.permission.READ_MEDIA_AUDIO";
    public static final java.lang.String READ_MEDIA_IMAGES = "android.permission.READ_MEDIA_IMAGES";
    public static final java.lang.String READ_MEDIA_VIDEO = "android.permission.READ_MEDIA_VIDEO";
    public static final java.lang.String WRITE_EXTERNAL_STORAGE = "android.permission.WRITE_EXTERNAL_STORAGE";
    public static java.lang.String[] CURRENT_REQUEST_PERMISSION = new java.lang.String[0];
    public static final java.lang.String[] CAMERA = {com.hjq.permissions.Permission.CAMERA};

    public static java.lang.String[] getReadPermissionArray(android.content.Context context, int i) {
        if (com.luck.picture.lib.utils.SdkVersionUtils.isTIRAMISU()) {
            int i2 = context.getApplicationInfo().targetSdkVersion;
            if (i == com.luck.picture.lib.config.SelectMimeType.ofImage()) {
                if (i2 >= 33) {
                    return new java.lang.String[]{"android.permission.READ_MEDIA_IMAGES"};
                }
                return new java.lang.String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_EXTERNAL_STORAGE"};
            }
            if (i == com.luck.picture.lib.config.SelectMimeType.ofVideo()) {
                if (i2 >= 33) {
                    return new java.lang.String[]{"android.permission.READ_MEDIA_VIDEO"};
                }
                return new java.lang.String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_EXTERNAL_STORAGE"};
            }
            if (i == com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
                if (i2 >= 33) {
                    return new java.lang.String[]{"android.permission.READ_MEDIA_AUDIO"};
                }
                return new java.lang.String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"};
            }
            if (i2 >= 33) {
                return new java.lang.String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
            }
            return new java.lang.String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_EXTERNAL_STORAGE"};
        }
        return new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    }
}
