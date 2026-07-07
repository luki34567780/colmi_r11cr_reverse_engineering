package com.androidnetworking.interfaces;

/* loaded from: classes.dex */
public interface DownloadListener {
    void onDownloadComplete();

    void onError(com.androidnetworking.error.ANError aNError);
}
