package com.luck.picture.lib.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class MediaStoreUtils {
    public static android.net.Uri createCameraOutImageUri(android.content.Context context, com.luck.picture.lib.config.SelectorConfig selectorConfig) {
        java.lang.String str;
        if (android.text.TextUtils.isEmpty(selectorConfig.outPutCameraImageFileName)) {
            str = "";
        } else if (selectorConfig.isOnlyCamera) {
            str = selectorConfig.outPutCameraImageFileName;
        } else {
            str = java.lang.System.currentTimeMillis() + "_" + selectorConfig.outPutCameraImageFileName;
        }
        if (com.luck.picture.lib.utils.SdkVersionUtils.isQ() && android.text.TextUtils.isEmpty(selectorConfig.outPutCameraDir)) {
            android.net.Uri createImageUri = createImageUri(context, str, selectorConfig.cameraImageFormatForQ);
            selectorConfig.cameraPath = createImageUri != null ? createImageUri.toString() : "";
            return createImageUri;
        }
        java.io.File createCameraFile = com.luck.picture.lib.utils.PictureFileUtils.createCameraFile(context, 1, str, selectorConfig.cameraImageFormat, selectorConfig.outPutCameraDir);
        selectorConfig.cameraPath = createCameraFile.getAbsolutePath();
        return com.luck.picture.lib.utils.PictureFileUtils.parUri(context, createCameraFile);
    }

    public static android.net.Uri createCameraOutVideoUri(android.content.Context context, com.luck.picture.lib.config.SelectorConfig selectorConfig) {
        java.lang.String str;
        if (android.text.TextUtils.isEmpty(selectorConfig.outPutCameraVideoFileName)) {
            str = "";
        } else if (selectorConfig.isOnlyCamera) {
            str = selectorConfig.outPutCameraVideoFileName;
        } else {
            str = java.lang.System.currentTimeMillis() + "_" + selectorConfig.outPutCameraVideoFileName;
        }
        if (com.luck.picture.lib.utils.SdkVersionUtils.isQ() && android.text.TextUtils.isEmpty(selectorConfig.outPutCameraDir)) {
            android.net.Uri createVideoUri = createVideoUri(context, str, selectorConfig.cameraVideoFormatForQ);
            selectorConfig.cameraPath = createVideoUri != null ? createVideoUri.toString() : "";
            return createVideoUri;
        }
        java.io.File createCameraFile = com.luck.picture.lib.utils.PictureFileUtils.createCameraFile(context, 2, str, selectorConfig.cameraVideoFormat, selectorConfig.outPutCameraDir);
        selectorConfig.cameraPath = createCameraFile.getAbsolutePath();
        return com.luck.picture.lib.utils.PictureFileUtils.parUri(context, createCameraFile);
    }

    public static android.net.Uri createImageUri(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.Context applicationContext = context.getApplicationContext();
        android.net.Uri[] uriArr = {null};
        java.lang.String externalStorageState = android.os.Environment.getExternalStorageState();
        android.content.ContentValues buildImageContentValues = buildImageContentValues(str, str2);
        if (externalStorageState.equals("mounted")) {
            uriArr[0] = applicationContext.getContentResolver().insert(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, buildImageContentValues);
        } else {
            uriArr[0] = applicationContext.getContentResolver().insert(android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI, buildImageContentValues);
        }
        return uriArr[0];
    }

    public static android.content.ContentValues buildImageContentValues(java.lang.String str, java.lang.String str2) {
        java.lang.String valueOf = com.luck.picture.lib.utils.ValueOf.toString(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        android.content.ContentValues contentValues = new android.content.ContentValues(3);
        if (android.text.TextUtils.isEmpty(str)) {
            contentValues.put("_display_name", com.luck.picture.lib.utils.DateUtils.getCreateFileName("IMG_"));
        } else if (str.lastIndexOf(".") == -1) {
            contentValues.put("_display_name", com.luck.picture.lib.utils.DateUtils.getCreateFileName("IMG_"));
        } else {
            contentValues.put("_display_name", str.replaceAll(str.substring(str.lastIndexOf(".")), ""));
        }
        if (android.text.TextUtils.isEmpty(str2) || str2.startsWith(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_VIDEO)) {
            str2 = "image/jpeg";
        }
        contentValues.put("mime_type", str2);
        if (com.luck.picture.lib.utils.SdkVersionUtils.isQ()) {
            contentValues.put("datetaken", valueOf);
            contentValues.put("relative_path", com.luck.picture.lib.config.PictureMimeType.DCIM);
        }
        return contentValues;
    }

    public static android.net.Uri createVideoUri(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.Context applicationContext = context.getApplicationContext();
        android.net.Uri[] uriArr = {null};
        java.lang.String externalStorageState = android.os.Environment.getExternalStorageState();
        android.content.ContentValues buildVideoContentValues = buildVideoContentValues(str, str2);
        if (externalStorageState.equals("mounted")) {
            uriArr[0] = applicationContext.getContentResolver().insert(android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, buildVideoContentValues);
        } else {
            uriArr[0] = applicationContext.getContentResolver().insert(android.provider.MediaStore.Video.Media.INTERNAL_CONTENT_URI, buildVideoContentValues);
        }
        return uriArr[0];
    }

    public static android.content.ContentValues buildVideoContentValues(java.lang.String str, java.lang.String str2) {
        java.lang.String valueOf = com.luck.picture.lib.utils.ValueOf.toString(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        android.content.ContentValues contentValues = new android.content.ContentValues(3);
        if (android.text.TextUtils.isEmpty(str)) {
            contentValues.put("_display_name", com.luck.picture.lib.utils.DateUtils.getCreateFileName("VID_"));
        } else if (str.lastIndexOf(".") == -1) {
            contentValues.put("_display_name", com.luck.picture.lib.utils.DateUtils.getCreateFileName("VID_"));
        } else {
            contentValues.put("_display_name", str.replaceAll(str.substring(str.lastIndexOf(".")), ""));
        }
        if (android.text.TextUtils.isEmpty(str2) || str2.startsWith(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_IMAGE)) {
            str2 = "video/mp4";
        }
        contentValues.put("mime_type", str2);
        if (com.luck.picture.lib.utils.SdkVersionUtils.isQ()) {
            contentValues.put("datetaken", valueOf);
            contentValues.put("relative_path", android.os.Environment.DIRECTORY_MOVIES);
        }
        return contentValues;
    }
}
