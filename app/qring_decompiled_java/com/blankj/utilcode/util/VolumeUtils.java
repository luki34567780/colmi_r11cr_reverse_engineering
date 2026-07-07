package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public class VolumeUtils {
    public static int getVolume(int i) {
        return ((android.media.AudioManager) com.blankj.utilcode.util.Utils.getApp().getSystemService(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO)).getStreamVolume(i);
    }

    public static void setVolume(int i, int i2, int i3) {
        try {
            ((android.media.AudioManager) com.blankj.utilcode.util.Utils.getApp().getSystemService(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO)).setStreamVolume(i, i2, i3);
        } catch (java.lang.SecurityException unused) {
        }
    }

    public static int getMaxVolume(int i) {
        return ((android.media.AudioManager) com.blankj.utilcode.util.Utils.getApp().getSystemService(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO)).getStreamMaxVolume(i);
    }

    public static int getMinVolume(int i) {
        android.media.AudioManager audioManager = (android.media.AudioManager) com.blankj.utilcode.util.Utils.getApp().getSystemService(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return audioManager.getStreamMinVolume(i);
        }
        return 0;
    }
}
