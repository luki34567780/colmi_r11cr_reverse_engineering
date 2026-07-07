package com.hp.hpl.sparta;

/* loaded from: /tmp/dex/classes2.dex */
public interface ParseSource {
    public static final com.hp.hpl.sparta.ParseLog DEFAULT_LOG = new com.hp.hpl.sparta.DefaultLog();
    public static final int MAXLOOKAHEAD = 71;

    int getLineNumber();

    java.lang.String getSystemId();

    java.lang.String toString();
}
