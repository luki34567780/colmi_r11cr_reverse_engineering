package com.luck.picture.lib.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class IntentUtils {
    public static void startSystemPlayerVideo(android.content.Context context, java.lang.String str) {
        android.net.Uri parse;
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        boolean z = com.luck.picture.lib.config.PictureMimeType.isContent(str) || com.luck.picture.lib.config.PictureMimeType.isHasHttp(str);
        if (com.luck.picture.lib.utils.SdkVersionUtils.isQ()) {
            parse = z ? android.net.Uri.parse(str) : android.net.Uri.fromFile(new java.io.File(str));
        } else if (!com.luck.picture.lib.utils.SdkVersionUtils.isMaxN()) {
            parse = z ? android.net.Uri.parse(str) : android.net.Uri.fromFile(new java.io.File(str));
        } else if (z) {
            parse = android.net.Uri.parse(str);
        } else {
            parse = com.luck.picture.lib.basic.PictureFileProvider.getUriForFile(context, context.getPackageName() + ".luckProvider", new java.io.File(str));
        }
        intent.addFlags(268468224);
        intent.addFlags(1);
        intent.setDataAndType(parse, com.luck.picture.lib.config.SelectMimeType.SYSTEM_VIDEO);
        context.startActivity(intent);
    }
}
