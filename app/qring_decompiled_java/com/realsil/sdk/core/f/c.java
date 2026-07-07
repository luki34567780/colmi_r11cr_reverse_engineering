package com.realsil.sdk.core.f;

/* loaded from: classes3.dex */
public final class c {
    public com.realsil.sdk.core.f.a a;

    public c(android.content.Context context) {
        int i = android.os.Build.VERSION.SDK_INT;
        this.a = a(context);
    }

    public final com.realsil.sdk.core.f.a a(android.content.Context context) {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21) {
            return new com.realsil.sdk.core.f.e(context);
        }
        if (i >= 18) {
            return new com.realsil.sdk.core.f.d(context);
        }
        return null;
    }
}
