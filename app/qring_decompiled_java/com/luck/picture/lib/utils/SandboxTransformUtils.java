package com.luck.picture.lib.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class SandboxTransformUtils {
    public static java.lang.String copyPathToSandbox(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return copyPathToSandbox(context, str, str2, "");
    }

    public static java.lang.String copyPathToSandbox(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.io.InputStream fileInputStream;
        try {
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (com.luck.picture.lib.config.PictureMimeType.isHasHttp(str)) {
            return null;
        }
        java.lang.String createFilePath = com.luck.picture.lib.utils.PictureFileUtils.createFilePath(context, str2, str3);
        if (com.luck.picture.lib.config.PictureMimeType.isContent(str)) {
            fileInputStream = com.luck.picture.lib.basic.PictureContentResolver.openInputStream(context, android.net.Uri.parse(str));
        } else {
            fileInputStream = new java.io.FileInputStream(str);
        }
        if (com.luck.picture.lib.utils.PictureFileUtils.writeFileFromIS(fileInputStream, new java.io.FileOutputStream(createFilePath))) {
            return createFilePath;
        }
        return null;
    }
}
