package com.squareup.moshi;

@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface Json {
    public static final java.lang.String UNSET_NAME = "\u0000";

    boolean ignore() default false;

    java.lang.String name() default "\u0000";
}
