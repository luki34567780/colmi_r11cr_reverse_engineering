package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public class UtilsFileProvider extends androidx.core.content.FileProvider {
    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public boolean onCreate() {
        com.blankj.utilcode.util.Utils.init((android.app.Application) getContext().getApplicationContext());
        return true;
    }
}
