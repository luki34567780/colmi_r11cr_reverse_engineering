package com.androidnetworking.model;

/* loaded from: classes.dex */
public class MultipartFileBody {
    public final java.lang.String contentType;
    public final java.io.File file;

    public MultipartFileBody(java.io.File file, java.lang.String str) {
        this.file = file;
        this.contentType = str;
    }
}
