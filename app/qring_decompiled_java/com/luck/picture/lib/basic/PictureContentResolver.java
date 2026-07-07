package com.luck.picture.lib.basic;

/* loaded from: /tmp/dex/classes2.dex */
public final class PictureContentResolver {
    public static java.io.InputStream openInputStream(android.content.Context context, android.net.Uri uri) {
        try {
            return context.getContentResolver().openInputStream(uri);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static java.io.OutputStream openOutputStream(android.content.Context context, android.net.Uri uri) {
        try {
            return context.getContentResolver().openOutputStream(uri);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
