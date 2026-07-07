package com.luck.picture.lib.config;

/* loaded from: /tmp/dex/classes2.dex */
public final class PictureMimeType {
    public static final java.lang.String AMR = ".amr";
    public static final java.lang.String AMR_Q = "audio/amr";
    public static final java.lang.String AVI = ".avi";
    public static final java.lang.String AVI_Q = "video/avi";
    public static final java.lang.String BMP = ".bmp";
    public static final java.lang.String CAMERA = "Camera";
    public static final java.lang.String DCIM = "DCIM/Camera";
    public static final java.lang.String GIF = ".gif";
    public static final java.lang.String JPEG = ".jpeg";
    public static final java.lang.String JPEG_Q = "image/jpeg";
    public static final java.lang.String JPG = ".jpg";
    private static final java.lang.String MIME_TYPE_3GP = "video/3gp";
    public static final java.lang.String MIME_TYPE_AUDIO = "audio/mpeg";
    public static final java.lang.String MIME_TYPE_AUDIO_AMR = "audio/amr";
    private static final java.lang.String MIME_TYPE_AVI = "video/avi";
    private static final java.lang.String MIME_TYPE_BMP = "image/bmp";
    private static final java.lang.String MIME_TYPE_GIF = "image/gif";
    public static final java.lang.String MIME_TYPE_IMAGE = "image/jpeg";
    public static final java.lang.String MIME_TYPE_JPEG = "image/jpeg";
    private static final java.lang.String MIME_TYPE_JPG = "image/jpg";
    private static final java.lang.String MIME_TYPE_MP4 = "video/mp4";
    private static final java.lang.String MIME_TYPE_MPEG = "video/mpeg";
    private static final java.lang.String MIME_TYPE_PNG = "image/png";
    public static final java.lang.String MIME_TYPE_PREFIX_AUDIO = "audio";
    public static final java.lang.String MIME_TYPE_PREFIX_IMAGE = "image";
    public static final java.lang.String MIME_TYPE_PREFIX_VIDEO = "video";
    public static final java.lang.String MIME_TYPE_VIDEO = "video/mp4";
    private static final java.lang.String MIME_TYPE_WAP_BMP = "image/vnd.wap.wbmp";
    private static final java.lang.String MIME_TYPE_WEBP = "image/webp";
    private static final java.lang.String MIME_TYPE_XMS_BMP = "image/x-ms-bmp";
    public static final java.lang.String MP3 = ".mp3";
    public static final java.lang.String MP3_Q = "audio/mpeg";
    public static final java.lang.String MP4 = ".mp4";
    public static final java.lang.String MP4_Q = "video/mp4";
    public static final java.lang.String PNG = ".png";
    public static final java.lang.String PNG_Q = "image/png";
    public static final java.lang.String WAV = ".wav";
    public static final java.lang.String WAV_Q = "audio/x-wav";
    public static final java.lang.String WEBP = ".webp";

    public static java.lang.String of3GP() {
        return MIME_TYPE_3GP;
    }

    public static java.lang.String ofAVI() {
        return "video/avi";
    }

    public static java.lang.String ofBMP() {
        return MIME_TYPE_BMP;
    }

    public static java.lang.String ofGIF() {
        return MIME_TYPE_GIF;
    }

    public static java.lang.String ofJPEG() {
        return "image/jpeg";
    }

    public static java.lang.String ofMP4() {
        return "video/mp4";
    }

    public static java.lang.String ofMPEG() {
        return MIME_TYPE_MPEG;
    }

    public static java.lang.String ofPNG() {
        return "image/png";
    }

    public static java.lang.String ofWEBP() {
        return MIME_TYPE_WEBP;
    }

    public static java.lang.String ofWapBMP() {
        return MIME_TYPE_WAP_BMP;
    }

    public static java.lang.String ofXmsBMP() {
        return MIME_TYPE_XMS_BMP;
    }

    public static boolean isHasGif(java.lang.String str) {
        return str != null && (str.equals(MIME_TYPE_GIF) || str.equals("image/GIF"));
    }

    public static boolean isUrlHasGif(java.lang.String str) {
        return str.toLowerCase().endsWith(GIF);
    }

    public static boolean isUrlHasImage(java.lang.String str) {
        return str.toLowerCase().endsWith(JPG) || str.toLowerCase().endsWith(JPEG) || str.toLowerCase().endsWith(PNG) || str.toLowerCase().endsWith(".heic");
    }

    public static boolean isHasWebp(java.lang.String str) {
        return str != null && str.equalsIgnoreCase(MIME_TYPE_WEBP);
    }

    public static boolean isUrlHasWebp(java.lang.String str) {
        return str.toLowerCase().endsWith(WEBP);
    }

    public static boolean isHasVideo(java.lang.String str) {
        return str != null && str.startsWith(MIME_TYPE_PREFIX_VIDEO);
    }

    public static boolean isUrlHasVideo(java.lang.String str) {
        return str.toLowerCase().endsWith(MP4);
    }

    public static boolean isHasAudio(java.lang.String str) {
        return str != null && str.startsWith(MIME_TYPE_PREFIX_AUDIO);
    }

    public static boolean isUrlHasAudio(java.lang.String str) {
        return str.toLowerCase().endsWith(AMR) || str.toLowerCase().endsWith(MP3);
    }

    public static boolean isHasImage(java.lang.String str) {
        return str != null && str.startsWith(MIME_TYPE_PREFIX_IMAGE);
    }

    public static boolean isHasBmp(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(ofBMP()) || str.startsWith(ofXmsBMP()) || str.startsWith(ofWapBMP());
    }

    public static boolean isJPEG(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("image/jpeg") || str.startsWith(MIME_TYPE_JPG);
    }

    public static boolean isJPG(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(MIME_TYPE_JPG);
    }

    public static boolean isHasHttp(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http") || str.startsWith("https");
    }

    public static boolean isMimeTypeSame(java.lang.String str, java.lang.String str2) {
        return android.text.TextUtils.isEmpty(str) || getMimeType(str) == getMimeType(str2);
    }

    public static int getMimeType(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return 1;
        }
        if (str.startsWith(MIME_TYPE_PREFIX_VIDEO)) {
            return 2;
        }
        return str.startsWith(MIME_TYPE_PREFIX_AUDIO) ? 3 : 1;
    }

    public static java.lang.String getLastSourceSuffix(java.lang.String str) {
        try {
            return str.substring(str.lastIndexOf("/")).replace("/", ".");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return JPG;
        }
    }

    public static java.lang.String getUrlToFileName(java.lang.String str) {
        try {
            int lastIndexOf = str.lastIndexOf("/");
            return lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : "";
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean isContent(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("content://");
    }
}
