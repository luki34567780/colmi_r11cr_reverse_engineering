package com.realsil.sdk.core.bluetooth;

/* loaded from: classes3.dex */
public final class GlobalGatt extends com.realsil.sdk.core.c.b {
    public static com.realsil.sdk.core.bluetooth.GlobalGatt n;

    public GlobalGatt(android.content.Context context) {
        super(context);
    }

    public static com.realsil.sdk.core.bluetooth.GlobalGatt getInstance() {
        return n;
    }

    public static synchronized void initial(android.content.Context context) {
        synchronized (com.realsil.sdk.core.bluetooth.GlobalGatt.class) {
            if (n == null) {
                synchronized (com.realsil.sdk.core.bluetooth.GlobalGatt.class) {
                    if (n == null) {
                        n = new com.realsil.sdk.core.bluetooth.GlobalGatt(context.getApplicationContext());
                    }
                }
            }
        }
    }
}
