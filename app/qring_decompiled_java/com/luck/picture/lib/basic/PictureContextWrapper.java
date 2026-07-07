package com.luck.picture.lib.basic;

/* loaded from: /tmp/dex/classes2.dex */
public class PictureContextWrapper extends android.content.ContextWrapper {
    public PictureContextWrapper(android.content.Context context) {
        super(context);
    }

    public static android.content.ContextWrapper wrap(android.content.Context context, int i, int i2) {
        if (i != -2) {
            com.luck.picture.lib.language.PictureLanguageUtils.setAppLanguage(context, i, i2);
        }
        return new com.luck.picture.lib.basic.PictureContextWrapper(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO.equals(str)) {
            return getApplicationContext().getSystemService(str);
        }
        return super.getSystemService(str);
    }
}
