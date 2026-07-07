package com.realsil.sdk.core.g;

/* loaded from: classes3.dex */
public final class a implements com.realsil.sdk.core.logger.Logger {
    @Override // com.realsil.sdk.core.logger.Logger
    public final void log(int i, java.lang.String str, java.lang.String str2) {
        switch (i) {
            case 1:
                android.util.Log.v(str, str2);
                break;
            case 2:
                android.util.Log.d(str, str2);
                break;
            case 3:
                android.util.Log.i(str, str2);
                break;
            case 4:
                android.util.Log.w(str, str2);
                break;
            case 5:
                android.util.Log.e(str, str2);
                break;
            case 6:
                android.util.Log.wtf(str, str2);
                break;
        }
    }
}
