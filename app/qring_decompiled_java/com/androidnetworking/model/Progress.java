package com.androidnetworking.model;

/* loaded from: classes.dex */
public class Progress implements java.io.Serializable {
    public long currentBytes;
    public long totalBytes;

    public Progress(long j, long j2) {
        this.currentBytes = j;
        this.totalBytes = j2;
    }
}
