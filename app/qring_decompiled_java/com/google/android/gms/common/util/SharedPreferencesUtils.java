package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class SharedPreferencesUtils {
    private SharedPreferencesUtils() {
    }

    @java.lang.Deprecated
    public static void publishWorldReadableSharedPreferences(android.content.Context context, android.content.SharedPreferences.Editor editor, java.lang.String str) {
        throw new java.lang.IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
