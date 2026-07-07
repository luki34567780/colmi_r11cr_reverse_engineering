package com.iwown.awlog;

/* loaded from: /tmp/dex/classes2.dex */
public class LogLevelType {
    public static final int DEBUG = 1;
    public static final int ERROR = 5;
    public static final int INFO = 3;
    public static final int VERBOSE = 2;
    public static final int WARM = 4;
    public static final int W_T_F = 6;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }
}
