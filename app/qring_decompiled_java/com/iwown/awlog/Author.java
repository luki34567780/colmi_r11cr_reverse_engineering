package com.iwown.awlog;

/* loaded from: /tmp/dex/classes2.dex */
public class Author {
    public static final java.lang.String HeZhiYuan = "HeZhiYuan";
    public static final java.lang.String James = "James";
    public static final java.lang.String Temp = "temporary";

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LogAuthor {
    }
}
