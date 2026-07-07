package com.bumptech.glide.load.data.mediastore;

/* loaded from: classes.dex */
class FileService {
    FileService() {
    }

    public boolean exists(java.io.File file) {
        return file.exists();
    }

    public long length(java.io.File file) {
        return file.length();
    }

    public java.io.File get(java.lang.String str) {
        return new java.io.File(str);
    }
}
