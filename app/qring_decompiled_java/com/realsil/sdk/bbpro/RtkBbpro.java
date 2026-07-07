package com.realsil.sdk.bbpro;

/* loaded from: /tmp/dex/classes2.dex */
public final class RtkBbpro {
    public static boolean DEBUG_ENABLE;

    public static void initialize(android.content.Context context, boolean z) {
        DEBUG_ENABLE = z;
    }

    public static void initizlize(android.content.Context context) {
        initialize(context);
    }

    public static void initialize(android.content.Context context) {
        initialize(context, false);
    }
}
