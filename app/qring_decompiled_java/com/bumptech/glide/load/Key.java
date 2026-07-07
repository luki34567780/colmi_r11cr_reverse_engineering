package com.bumptech.glide.load;

/* loaded from: classes.dex */
public interface Key {
    public static final java.lang.String STRING_CHARSET_NAME = "UTF-8";
    public static final java.nio.charset.Charset CHARSET = java.nio.charset.Charset.forName(STRING_CHARSET_NAME);

    boolean equals(java.lang.Object obj);

    int hashCode();

    void updateDiskCacheKey(java.security.MessageDigest messageDigest);
}
