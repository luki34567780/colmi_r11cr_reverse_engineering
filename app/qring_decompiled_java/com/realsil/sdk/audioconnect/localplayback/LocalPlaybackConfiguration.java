package com.realsil.sdk.audioconnect.localplayback;

/* loaded from: /tmp/dex/classes2.dex */
public class LocalPlaybackConfiguration {
    public static final java.lang.String HEADER_BIN_NAME = "header.bin";
    public static final java.lang.String NAME_BIN_NAME = "name.bin";
    public static final int PLAY_LIST_MAX_NUM = 16;
    public static volatile com.realsil.sdk.audioconnect.localplayback.LocalPlaybackConfiguration b;
    public java.lang.String a;

    public static com.realsil.sdk.audioconnect.localplayback.LocalPlaybackConfiguration getInstance() {
        if (b == null) {
            synchronized (com.realsil.sdk.audioconnect.localplayback.LocalPlaybackConfiguration.class) {
                if (b == null) {
                    b = new com.realsil.sdk.audioconnect.localplayback.LocalPlaybackConfiguration();
                }
            }
        }
        return b;
    }

    public java.lang.String getCacheDirPath() {
        return this.a;
    }

    public void setCacheDirPath(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.realsil.sdk.core.logger.ZLogger.e("set cache dir failed, input parameter can not be null");
            return;
        }
        java.io.File file = new java.io.File(str);
        if (!file.exists() && !file.mkdirs()) {
            com.realsil.sdk.core.logger.ZLogger.e("set cache dir failed, can not create dir in your specified position");
            return;
        }
        this.a = str;
        com.realsil.sdk.core.logger.ZLogger.i("set cache dir: " + str);
    }
}
